/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.assuredworkloads.v1.stub;

import static com.google.cloud.assuredworkloads.v1.AssuredWorkloadsServiceClient.ListViolationsPagedResponse;
import static com.google.cloud.assuredworkloads.v1.AssuredWorkloadsServiceClient.ListWorkloadsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.RequestParamsBuilder;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest;
import com.google.cloud.assuredworkloads.v1.AcknowledgeViolationResponse;
import com.google.cloud.assuredworkloads.v1.CreateWorkloadOperationMetadata;
import com.google.cloud.assuredworkloads.v1.CreateWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.DeleteWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.GetViolationRequest;
import com.google.cloud.assuredworkloads.v1.GetWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.ListViolationsRequest;
import com.google.cloud.assuredworkloads.v1.ListViolationsResponse;
import com.google.cloud.assuredworkloads.v1.ListWorkloadsRequest;
import com.google.cloud.assuredworkloads.v1.ListWorkloadsResponse;
import com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesRequest;
import com.google.cloud.assuredworkloads.v1.RestrictAllowedResourcesResponse;
import com.google.cloud.assuredworkloads.v1.UpdateWorkloadRequest;
import com.google.cloud.assuredworkloads.v1.Violation;
import com.google.cloud.assuredworkloads.v1.Workload;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import com.google.protobuf.Empty;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the AssuredWorkloadsService service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcAssuredWorkloadsServiceStub extends AssuredWorkloadsServiceStub {
  private static final MethodDescriptor<CreateWorkloadRequest, Operation>
      createWorkloadMethodDescriptor =
          MethodDescriptor.<CreateWorkloadRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/CreateWorkload")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(CreateWorkloadRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<UpdateWorkloadRequest, Workload>
      updateWorkloadMethodDescriptor =
          MethodDescriptor.<UpdateWorkloadRequest, Workload>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/UpdateWorkload")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(UpdateWorkloadRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Workload.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<
          RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>
      restrictAllowedResourcesMethodDescriptor =
          MethodDescriptor
              .<RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/RestrictAllowedResources")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(RestrictAllowedResourcesRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(RestrictAllowedResourcesResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<DeleteWorkloadRequest, Empty>
      deleteWorkloadMethodDescriptor =
          MethodDescriptor.<DeleteWorkloadRequest, Empty>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/DeleteWorkload")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(DeleteWorkloadRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Empty.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetWorkloadRequest, Workload> getWorkloadMethodDescriptor =
      MethodDescriptor.<GetWorkloadRequest, Workload>newBuilder()
          .setType(MethodDescriptor.MethodType.UNARY)
          .setFullMethodName("google.cloud.assuredworkloads.v1.AssuredWorkloadsService/GetWorkload")
          .setRequestMarshaller(ProtoUtils.marshaller(GetWorkloadRequest.getDefaultInstance()))
          .setResponseMarshaller(ProtoUtils.marshaller(Workload.getDefaultInstance()))
          .build();

  private static final MethodDescriptor<ListWorkloadsRequest, ListWorkloadsResponse>
      listWorkloadsMethodDescriptor =
          MethodDescriptor.<ListWorkloadsRequest, ListWorkloadsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/ListWorkloads")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListWorkloadsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListWorkloadsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListViolationsRequest, ListViolationsResponse>
      listViolationsMethodDescriptor =
          MethodDescriptor.<ListViolationsRequest, ListViolationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/ListViolations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListViolationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListViolationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetViolationRequest, Violation>
      getViolationMethodDescriptor =
          MethodDescriptor.<GetViolationRequest, Violation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/GetViolation")
              .setRequestMarshaller(ProtoUtils.marshaller(GetViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Violation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<AcknowledgeViolationRequest, AcknowledgeViolationResponse>
      acknowledgeViolationMethodDescriptor =
          MethodDescriptor.<AcknowledgeViolationRequest, AcknowledgeViolationResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(
                  "google.cloud.assuredworkloads.v1.AssuredWorkloadsService/AcknowledgeViolation")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(AcknowledgeViolationRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(AcknowledgeViolationResponse.getDefaultInstance()))
              .build();

  private final UnaryCallable<CreateWorkloadRequest, Operation> createWorkloadCallable;
  private final OperationCallable<CreateWorkloadRequest, Workload, CreateWorkloadOperationMetadata>
      createWorkloadOperationCallable;
  private final UnaryCallable<UpdateWorkloadRequest, Workload> updateWorkloadCallable;
  private final UnaryCallable<RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>
      restrictAllowedResourcesCallable;
  private final UnaryCallable<DeleteWorkloadRequest, Empty> deleteWorkloadCallable;
  private final UnaryCallable<GetWorkloadRequest, Workload> getWorkloadCallable;
  private final UnaryCallable<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsCallable;
  private final UnaryCallable<ListWorkloadsRequest, ListWorkloadsPagedResponse>
      listWorkloadsPagedCallable;
  private final UnaryCallable<ListViolationsRequest, ListViolationsResponse> listViolationsCallable;
  private final UnaryCallable<ListViolationsRequest, ListViolationsPagedResponse>
      listViolationsPagedCallable;
  private final UnaryCallable<GetViolationRequest, Violation> getViolationCallable;
  private final UnaryCallable<AcknowledgeViolationRequest, AcknowledgeViolationResponse>
      acknowledgeViolationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcAssuredWorkloadsServiceStub create(
      AssuredWorkloadsServiceStubSettings settings) throws IOException {
    return new GrpcAssuredWorkloadsServiceStub(settings, ClientContext.create(settings));
  }

  public static final GrpcAssuredWorkloadsServiceStub create(ClientContext clientContext)
      throws IOException {
    return new GrpcAssuredWorkloadsServiceStub(
        AssuredWorkloadsServiceStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcAssuredWorkloadsServiceStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcAssuredWorkloadsServiceStub(
        AssuredWorkloadsServiceStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcAssuredWorkloadsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAssuredWorkloadsServiceStub(
      AssuredWorkloadsServiceStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcAssuredWorkloadsServiceCallableFactory());
  }

  /**
   * Constructs an instance of GrpcAssuredWorkloadsServiceStub, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected GrpcAssuredWorkloadsServiceStub(
      AssuredWorkloadsServiceStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<CreateWorkloadRequest, Operation> createWorkloadTransportSettings =
        GrpcCallSettings.<CreateWorkloadRequest, Operation>newBuilder()
            .setMethodDescriptor(createWorkloadMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<UpdateWorkloadRequest, Workload> updateWorkloadTransportSettings =
        GrpcCallSettings.<UpdateWorkloadRequest, Workload>newBuilder()
            .setMethodDescriptor(updateWorkloadMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("workload.name", String.valueOf(request.getWorkload().getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>
        restrictAllowedResourcesTransportSettings =
            GrpcCallSettings
                .<RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>newBuilder()
                .setMethodDescriptor(restrictAllowedResourcesMethodDescriptor)
                .setParamsExtractor(
                    request -> {
                      RequestParamsBuilder builder = RequestParamsBuilder.create();
                      builder.add("name", String.valueOf(request.getName()));
                      return builder.build();
                    })
                .build();
    GrpcCallSettings<DeleteWorkloadRequest, Empty> deleteWorkloadTransportSettings =
        GrpcCallSettings.<DeleteWorkloadRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteWorkloadMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<GetWorkloadRequest, Workload> getWorkloadTransportSettings =
        GrpcCallSettings.<GetWorkloadRequest, Workload>newBuilder()
            .setMethodDescriptor(getWorkloadMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("name", String.valueOf(request.getName()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsTransportSettings =
        GrpcCallSettings.<ListWorkloadsRequest, ListWorkloadsResponse>newBuilder()
            .setMethodDescriptor(listWorkloadsMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  RequestParamsBuilder builder = RequestParamsBuilder.create();
                  builder.add("parent", String.valueOf(request.getParent()));
                  return builder.build();
                })
            .build();
    GrpcCallSettings<ListViolationsRequest, ListViolationsResponse>
        listViolationsTransportSettings =
            GrpcCallSettings.<ListViolationsRequest, ListViolationsResponse>newBuilder()
                .setMethodDescriptor(listViolationsMethodDescriptor)
                .build();
    GrpcCallSettings<GetViolationRequest, Violation> getViolationTransportSettings =
        GrpcCallSettings.<GetViolationRequest, Violation>newBuilder()
            .setMethodDescriptor(getViolationMethodDescriptor)
            .build();
    GrpcCallSettings<AcknowledgeViolationRequest, AcknowledgeViolationResponse>
        acknowledgeViolationTransportSettings =
            GrpcCallSettings.<AcknowledgeViolationRequest, AcknowledgeViolationResponse>newBuilder()
                .setMethodDescriptor(acknowledgeViolationMethodDescriptor)
                .build();

    this.createWorkloadCallable =
        callableFactory.createUnaryCallable(
            createWorkloadTransportSettings, settings.createWorkloadSettings(), clientContext);
    this.createWorkloadOperationCallable =
        callableFactory.createOperationCallable(
            createWorkloadTransportSettings,
            settings.createWorkloadOperationSettings(),
            clientContext,
            operationsStub);
    this.updateWorkloadCallable =
        callableFactory.createUnaryCallable(
            updateWorkloadTransportSettings, settings.updateWorkloadSettings(), clientContext);
    this.restrictAllowedResourcesCallable =
        callableFactory.createUnaryCallable(
            restrictAllowedResourcesTransportSettings,
            settings.restrictAllowedResourcesSettings(),
            clientContext);
    this.deleteWorkloadCallable =
        callableFactory.createUnaryCallable(
            deleteWorkloadTransportSettings, settings.deleteWorkloadSettings(), clientContext);
    this.getWorkloadCallable =
        callableFactory.createUnaryCallable(
            getWorkloadTransportSettings, settings.getWorkloadSettings(), clientContext);
    this.listWorkloadsCallable =
        callableFactory.createUnaryCallable(
            listWorkloadsTransportSettings, settings.listWorkloadsSettings(), clientContext);
    this.listWorkloadsPagedCallable =
        callableFactory.createPagedCallable(
            listWorkloadsTransportSettings, settings.listWorkloadsSettings(), clientContext);
    this.listViolationsCallable =
        callableFactory.createUnaryCallable(
            listViolationsTransportSettings, settings.listViolationsSettings(), clientContext);
    this.listViolationsPagedCallable =
        callableFactory.createPagedCallable(
            listViolationsTransportSettings, settings.listViolationsSettings(), clientContext);
    this.getViolationCallable =
        callableFactory.createUnaryCallable(
            getViolationTransportSettings, settings.getViolationSettings(), clientContext);
    this.acknowledgeViolationCallable =
        callableFactory.createUnaryCallable(
            acknowledgeViolationTransportSettings,
            settings.acknowledgeViolationSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  public GrpcOperationsStub getOperationsStub() {
    return operationsStub;
  }

  @Override
  public UnaryCallable<CreateWorkloadRequest, Operation> createWorkloadCallable() {
    return createWorkloadCallable;
  }

  @Override
  public OperationCallable<CreateWorkloadRequest, Workload, CreateWorkloadOperationMetadata>
      createWorkloadOperationCallable() {
    return createWorkloadOperationCallable;
  }

  @Override
  public UnaryCallable<UpdateWorkloadRequest, Workload> updateWorkloadCallable() {
    return updateWorkloadCallable;
  }

  @Override
  public UnaryCallable<RestrictAllowedResourcesRequest, RestrictAllowedResourcesResponse>
      restrictAllowedResourcesCallable() {
    return restrictAllowedResourcesCallable;
  }

  @Override
  public UnaryCallable<DeleteWorkloadRequest, Empty> deleteWorkloadCallable() {
    return deleteWorkloadCallable;
  }

  @Override
  public UnaryCallable<GetWorkloadRequest, Workload> getWorkloadCallable() {
    return getWorkloadCallable;
  }

  @Override
  public UnaryCallable<ListWorkloadsRequest, ListWorkloadsResponse> listWorkloadsCallable() {
    return listWorkloadsCallable;
  }

  @Override
  public UnaryCallable<ListWorkloadsRequest, ListWorkloadsPagedResponse>
      listWorkloadsPagedCallable() {
    return listWorkloadsPagedCallable;
  }

  @Override
  public UnaryCallable<ListViolationsRequest, ListViolationsResponse> listViolationsCallable() {
    return listViolationsCallable;
  }

  @Override
  public UnaryCallable<ListViolationsRequest, ListViolationsPagedResponse>
      listViolationsPagedCallable() {
    return listViolationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetViolationRequest, Violation> getViolationCallable() {
    return getViolationCallable;
  }

  @Override
  public UnaryCallable<AcknowledgeViolationRequest, AcknowledgeViolationResponse>
      acknowledgeViolationCallable() {
    return acknowledgeViolationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
