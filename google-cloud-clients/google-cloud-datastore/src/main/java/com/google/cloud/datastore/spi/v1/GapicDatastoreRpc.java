/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.datastore.spi.v1;

import static com.google.cloud.datastore.DatastoreExceptionFactory.newDatastoreException;

import com.google.api.core.ApiFunction;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcCallContext;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.TransportChannel;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.api.gax.rpc.UnaryCallSettings.Builder;
import com.google.api.pathtemplate.PathTemplate;
import com.google.cloud.ServiceOptions;
import com.google.cloud.datastore.DatastoreException;
import com.google.cloud.datastore.DatastoreExceptionFactory;
import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.v1.DatastoreClient;
import com.google.cloud.datastore.v1.DatastoreSettings;
import com.google.cloud.datastore.v1.stub.DatastoreStub;
import com.google.cloud.datastore.v1.stub.DatastoreStubSettings;
import com.google.cloud.datastore.v1.stub.GrpcDatastoreStub;
import com.google.cloud.grpc.GrpcTransportOptions;
import com.google.cloud.grpc.GrpcTransportOptions.ExecutorFactory;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.datastore.v1.AllocateIdsRequest;
import com.google.datastore.v1.AllocateIdsResponse;
import com.google.datastore.v1.BeginTransactionRequest;
import com.google.datastore.v1.BeginTransactionResponse;
import com.google.datastore.v1.CommitRequest;
import com.google.datastore.v1.CommitResponse;
import com.google.datastore.v1.LookupRequest;
import com.google.datastore.v1.LookupResponse;
import com.google.datastore.v1.RollbackRequest;
import com.google.datastore.v1.RollbackResponse;
import com.google.datastore.v1.RunQueryRequest;
import com.google.datastore.v1.RunQueryResponse;
import io.grpc.CallOptions;
import io.grpc.Context;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import org.threeten.bp.Duration;

public class GapicDatastoreRpc implements DatastoreRpc {

  private static final int DEFAULT_TIMEOUT_SECONDS = 30 * 60;
  private static final int DEFAULT_PERIOD_SECONDS = 10;
  private static final PathTemplate PROJECT_NAME_TEMPLATE =
      PathTemplate.create("projects/{project}");
  private static final int MAX_MESSAGE_SIZE = 100 * 1024 * 1024;
  private static final int MAX_METADATA_SIZE = 32 * 1024; // bytes
  private static final String PROPERTY_TIMEOUT_SECONDS =
      "com.google.cloud.spanner.watchdogTimeoutSeconds";
  private static final String PROPERTY_PERIOD_SECONDS =
      "com.google.cloud.spanner.watchdogPeriodSeconds";
  private final Duration waitTimeout =
      systemProperty(PROPERTY_TIMEOUT_SECONDS, DEFAULT_TIMEOUT_SECONDS);
  private final Duration idleTimeout =
      systemProperty(PROPERTY_TIMEOUT_SECONDS, DEFAULT_TIMEOUT_SECONDS);
  private final Duration checkInterval =
      systemProperty(PROPERTY_PERIOD_SECONDS, DEFAULT_PERIOD_SECONDS);

  private final String projectId;
  private final String projectName;
  private final DatastoreMetadataProvider metadataProvider;
  private final DatastoreStub datastoreStub;

  public static GapicDatastoreRpc create(DatastoreOptions options) {
    return new GapicDatastoreRpc(options);
  }

  public GapicDatastoreRpc(DatastoreOptions options) {
    this.projectId = options.getProjectId();
    this.projectName = PROJECT_NAME_TEMPLATE.instantiate("project", this.projectId);

    ApiClientHeaderProvider.Builder internalHeaderProviderBuilder =
        ApiClientHeaderProvider.newBuilder();
    ApiClientHeaderProvider internalHeaderProvider =
        internalHeaderProviderBuilder
            .setClientLibToken(
                ServiceOptions.getGoogApiClientLibName(),
                GaxProperties.getLibraryVersion(options.getClass()))
            .setTransportToken(
                GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion())
            .build();
    HeaderProvider mergedHeaderProvider = options.getMergedHeaderProvider(internalHeaderProvider);
    this.metadataProvider =
        DatastoreMetadataProvider.create(
            mergedHeaderProvider.getHeaders(),
            internalHeaderProviderBuilder.getResourceHeaderKey());

    try {
      ManagedChannel managedChannel =
          ManagedChannelBuilder.forTarget(options.getHost()).build();
      TransportChannel transportChannel = GrpcTransportChannel.create(managedChannel);

      ClientContext clientContext =
          ClientContext.newBuilder()
              .setCredentials(options.getCredentials())
              .setTransportChannel(transportChannel)
              .setDefaultCallContext(GrpcCallContext.of(managedChannel, CallOptions.DEFAULT))
              .setBackgroundResources(
                  Collections.<BackgroundResource>singletonList(transportChannel))
              .build();
      DatastoreSettings datastoreSettings = DatastoreSettings.newBuilder(clientContext)
          .setCredentialsProvider(GrpcTransportOptions.setUpCredentialsProvider(options))
          .setHeaderProvider(mergedHeaderProvider)
          .setTransportChannelProvider(GrpcTransportOptions.setUpChannelProvider(
              DatastoreSettings.defaultGrpcTransportProviderBuilder(), options)
          )
          .build();
      datastoreStub = DatastoreClient.create(datastoreSettings).getStub();
    } catch (IOException e) {
      throw new DatastoreException(e);
    }
  }


  @Override
  public AllocateIdsResponse allocateIds(AllocateIdsRequest request) {
    GrpcCallContext context = newCallContext(projectName);
    return get(datastoreStub.allocateIdsCallable().futureCall(request, context));
  }

  @Override
  public BeginTransactionResponse beginTransaction(BeginTransactionRequest request)
      throws DatastoreException {
    GrpcCallContext context = newCallContext(projectName);
    return get(datastoreStub.beginTransactionCallable().futureCall(request, context));
  }

  @Override
  public CommitResponse commit(CommitRequest request) {
    GrpcCallContext context = newCallContext(projectName);
    return get(datastoreStub.commitCallable().futureCall(request, context));
  }

  @Override
  public LookupResponse lookup(LookupRequest request) {
    GrpcCallContext context = newCallContext(projectName);
    return get(datastoreStub.lookupCallable().futureCall(request, context));
  }

  @Override
  public RollbackResponse rollback(RollbackRequest request) {
    GrpcCallContext context = newCallContext(projectName);
    return get(datastoreStub.rollbackCallable().futureCall(request, context));
  }

  @Override
  public RunQueryResponse runQuery(RunQueryRequest request) {
    GrpcCallContext context = newCallContext(projectName);
    return get(datastoreStub.runQueryCallable().futureCall(request, context));
  }

  // This class is needed solely to get access to protected method setInternalHeaderProvider()
  private static class DatastoreSettingsBuilder extends DatastoreSettings.Builder {

    private DatastoreSettingsBuilder(DatastoreSettings settings) {
      super(settings);
    }

    @Override
    protected DatastoreSettings.Builder setInternalHeaderProvider(
        HeaderProvider internalHeaderProvider) {
      return super.setInternalHeaderProvider(internalHeaderProvider);
    }
  }

  private GrpcCallContext newCallContext(String resource) {
    GrpcCallContext context = GrpcCallContext.createDefault();
    context = context.withExtraHeaders(metadataProvider.newExtraHeaders(resource, projectName));
    return context.withStreamWaitTimeout(waitTimeout).withStreamIdleTimeout(idleTimeout);
  }

  private static Duration systemProperty(String name, int defaultValue) {
    String stringValue = System.getProperty(name, "");
    return Duration.ofSeconds(stringValue.isEmpty() ? defaultValue : Integer.parseInt(stringValue));
  }

  /**
   * Gets the result of an async RPC call, handling any exceptions encountered.
   */
  private static <T> T get(final Future<T> future) throws DatastoreException {
    final Context context = Context.current();
    try {
      return future.get();
    } catch (InterruptedException e) {
      future.cancel(true);
      throw DatastoreExceptionFactory.propagateInterrupt(e);
    } catch (ExecutionException | CancellationException e) {
      throw newDatastoreException(context, e);
    }
  }
}
