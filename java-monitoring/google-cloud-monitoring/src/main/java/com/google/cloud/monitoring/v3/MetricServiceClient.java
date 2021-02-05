/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.monitoring.v3;

import com.google.api.MetricDescriptor;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.api.resourcenames.ResourceName;
import com.google.cloud.monitoring.v3.stub.MetricServiceStub;
import com.google.cloud.monitoring.v3.stub.MetricServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.monitoring.v3.CreateMetricDescriptorRequest;
import com.google.monitoring.v3.CreateTimeSeriesRequest;
import com.google.monitoring.v3.DeleteMetricDescriptorRequest;
import com.google.monitoring.v3.GetMetricDescriptorRequest;
import com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest;
import com.google.monitoring.v3.ListMetricDescriptorsRequest;
import com.google.monitoring.v3.ListMetricDescriptorsResponse;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest;
import com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse;
import com.google.monitoring.v3.ListTimeSeriesRequest;
import com.google.monitoring.v3.ListTimeSeriesResponse;
import com.google.monitoring.v3.MetricDescriptorName;
import com.google.monitoring.v3.MonitoredResourceDescriptorName;
import com.google.monitoring.v3.OrganizationName;
import com.google.monitoring.v3.ProjectName;
import com.google.monitoring.v3.TimeInterval;
import com.google.monitoring.v3.TimeSeries;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Manages metric descriptors, monitored resource descriptors, and time series
 * data.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <p>Note: close() needs to be called on the MetricServiceClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of MetricServiceSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * MetricServiceSettings metricServiceSettings =
 *     MetricServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * MetricServiceClient metricServiceClient = MetricServiceClient.create(metricServiceSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * MetricServiceSettings metricServiceSettings =
 *     MetricServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * MetricServiceClient metricServiceClient = MetricServiceClient.create(metricServiceSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@Generated("by gapic-generator-java")
public class MetricServiceClient implements BackgroundResource {
  private final MetricServiceSettings settings;
  private final MetricServiceStub stub;

  /** Constructs an instance of MetricServiceClient with default settings. */
  public static final MetricServiceClient create() throws IOException {
    return create(MetricServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final MetricServiceClient create(MetricServiceSettings settings)
      throws IOException {
    return new MetricServiceClient(settings);
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(MetricServiceSettings).
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final MetricServiceClient create(MetricServiceStub stub) {
    return new MetricServiceClient(stub);
  }

  /**
   * Constructs an instance of MetricServiceClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected MetricServiceClient(MetricServiceSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((MetricServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected MetricServiceClient(MetricServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final MetricServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public MetricServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ResourceName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      OrganizationName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ProjectName name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      String name) {
    ListMonitoredResourceDescriptorsRequest request =
        ListMonitoredResourceDescriptorsRequest.newBuilder().setName(name).build();
    return listMonitoredResourceDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMonitoredResourceDescriptorsPagedResponse listMonitoredResourceDescriptors(
      ListMonitoredResourceDescriptorsRequest request) {
    return listMonitoredResourceDescriptorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsPagedResponse>
      listMonitoredResourceDescriptorsPagedCallable() {
    return stub.listMonitoredResourceDescriptorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists monitored resource descriptors that match a filter. This method does not require a
   * Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable() {
    return stub.listMonitoredResourceDescriptorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor. This method does not require a Workspace.
   *
   * @param name Required. The monitored resource descriptor to get. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/monitoredResourceDescriptors/[RESOURCE_TYPE]
   *     <p>The `[RESOURCE_TYPE]` is a predefined type, such as `cloudsql_database`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(
      MonitoredResourceDescriptorName name) {
    GetMonitoredResourceDescriptorRequest request =
        GetMonitoredResourceDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getMonitoredResourceDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor. This method does not require a Workspace.
   *
   * @param name Required. The monitored resource descriptor to get. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/monitoredResourceDescriptors/[RESOURCE_TYPE]
   *     <p>The `[RESOURCE_TYPE]` is a predefined type, such as `cloudsql_database`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(String name) {
    GetMonitoredResourceDescriptorRequest request =
        GetMonitoredResourceDescriptorRequest.newBuilder().setName(name).build();
    return getMonitoredResourceDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor. This method does not require a Workspace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MonitoredResourceDescriptor getMonitoredResourceDescriptor(
      GetMonitoredResourceDescriptorRequest request) {
    return getMonitoredResourceDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single monitored resource descriptor. This method does not require a Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetMonitoredResourceDescriptorRequest, MonitoredResourceDescriptor>
      getMonitoredResourceDescriptorCallable() {
    return stub.getMonitoredResourceDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(ResourceName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(OrganizationName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(ProjectName name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(String name) {
    ListMetricDescriptorsRequest request =
        ListMetricDescriptorsRequest.newBuilder().setName(name).build();
    return listMetricDescriptors(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListMetricDescriptorsPagedResponse listMetricDescriptors(
      ListMetricDescriptorsRequest request) {
    return listMetricDescriptorsPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsPagedResponse>
      listMetricDescriptorsPagedCallable() {
    return stub.listMetricDescriptorsPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists metric descriptors that match a filter. This method does not require a Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse>
      listMetricDescriptorsCallable() {
    return stub.listMetricDescriptorsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor. This method does not require a Workspace.
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example value of `[METRIC_ID]` is
   *     `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(MetricDescriptorName name) {
    GetMetricDescriptorRequest request =
        GetMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor. This method does not require a Workspace.
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example value of `[METRIC_ID]` is
   *     `"compute.googleapis.com/instance/disk/read_bytes_count"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(String name) {
    GetMetricDescriptorRequest request =
        GetMetricDescriptorRequest.newBuilder().setName(name).build();
    return getMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor. This method does not require a Workspace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor getMetricDescriptor(GetMetricDescriptorRequest request) {
    return getMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets a single metric descriptor. This method does not require a Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<GetMetricDescriptorRequest, MetricDescriptor>
      getMetricDescriptorCallable() {
    return stub.getMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics).
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      ResourceName name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics).
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      OrganizationName name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics).
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      ProjectName name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics).
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param metricDescriptor Required. The new [custom
   *     metric](https://cloud.google.com/monitoring/custom-metrics) descriptor.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(
      String name, MetricDescriptor metricDescriptor) {
    CreateMetricDescriptorRequest request =
        CreateMetricDescriptorRequest.newBuilder()
            .setName(name)
            .setMetricDescriptor(metricDescriptor)
            .build();
    return createMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics).
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final MetricDescriptor createMetricDescriptor(CreateMetricDescriptorRequest request) {
    return createMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new metric descriptor. User-created metric descriptors define [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics).
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateMetricDescriptorRequest, MetricDescriptor>
      createMetricDescriptorCallable() {
    return stub.createMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example of `[METRIC_ID]` is: `"custom.googleapis.com/my_test_metric"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(MetricDescriptorName name) {
    DeleteMetricDescriptorRequest request =
        DeleteMetricDescriptorRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * @param name Required. The metric descriptor on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/metricDescriptors/[METRIC_ID]
   *     <p>An example of `[METRIC_ID]` is: `"custom.googleapis.com/my_test_metric"`.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(String name) {
    DeleteMetricDescriptorRequest request =
        DeleteMetricDescriptorRequest.newBuilder().setName(name).build();
    deleteMetricDescriptor(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteMetricDescriptor(DeleteMetricDescriptorRequest request) {
    deleteMetricDescriptorCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a metric descriptor. Only user-created [custom
   * metrics](https://cloud.google.com/monitoring/custom-metrics) can be deleted.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<DeleteMetricDescriptorRequest, Empty>
      deleteMetricDescriptorCallable() {
    return stub.deleteMetricDescriptorCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter. This method does not require a Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param filter Required. A [monitoring
   *     filter](https://cloud.google.com/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.labels.instance_name = "my-instance-name"
   * @param interval Required. The time interval for which results should be returned. Only time
   *     series that contain data points in the specified interval are included in the response.
   * @param view Required. Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      ProjectName name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter. This method does not require a Workspace.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param filter Required. A [monitoring
   *     filter](https://cloud.google.com/monitoring/api/v3/filters) that specifies which time
   *     series should be returned. The filter must specify a single metric type, and can
   *     additionally specify metric labels and other information. For example:
   *     <p>metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *     metric.labels.instance_name = "my-instance-name"
   * @param interval Required. The time interval for which results should be returned. Only time
   *     series that contain data points in the specified interval are included in the response.
   * @param view Required. Specifies which information is returned about the time series.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(
      String name,
      String filter,
      TimeInterval interval,
      ListTimeSeriesRequest.TimeSeriesView view) {
    ListTimeSeriesRequest request =
        ListTimeSeriesRequest.newBuilder()
            .setName(name)
            .setFilter(filter)
            .setInterval(interval)
            .setView(view)
            .build();
    return listTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter. This method does not require a Workspace.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListTimeSeriesPagedResponse listTimeSeries(ListTimeSeriesRequest request) {
    return listTimeSeriesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter. This method does not require a Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesPagedResponse>
      listTimeSeriesPagedCallable() {
    return stub.listTimeSeriesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists time series that match a filter. This method does not require a Workspace.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<ListTimeSeriesRequest, ListTimeSeriesResponse>
      listTimeSeriesCallable() {
    return stub.listTimeSeriesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param timeSeries Required. The new data to be added to a list of time series. Adds at most one
   *     data point to each of several time series. The new data point must be more recent than any
   *     other point in its time series. Each `TimeSeries` value must fully specify a unique time
   *     series by supplying all label values for the metric and the monitored resource.
   *     <p>The maximum number of `TimeSeries` objects per `Create` request is 200.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(ProjectName name, List<TimeSeries> timeSeries) {
    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .addAllTimeSeries(timeSeries)
            .build();
    createTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * @param name Required. The project on which to execute the request. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param timeSeries Required. The new data to be added to a list of time series. Adds at most one
   *     data point to each of several time series. The new data point must be more recent than any
   *     other point in its time series. Each `TimeSeries` value must fully specify a unique time
   *     series by supplying all label values for the metric and the monitored resource.
   *     <p>The maximum number of `TimeSeries` objects per `Create` request is 200.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(String name, List<TimeSeries> timeSeries) {
    CreateTimeSeriesRequest request =
        CreateTimeSeriesRequest.newBuilder().setName(name).addAllTimeSeries(timeSeries).build();
    createTimeSeries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void createTimeSeries(CreateTimeSeriesRequest request) {
    createTimeSeriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates or adds data to one or more time series. The response is empty if all time series in
   * the request were written. If any time series could not be written, a corresponding failure
   * message is included in the error response.
   *
   * <p>Sample code:
   */
  public final UnaryCallable<CreateTimeSeriesRequest, Empty> createTimeSeriesCallable() {
    return stub.createTimeSeriesCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListMonitoredResourceDescriptorsPagedResponse
      extends AbstractPagedListResponse<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor,
          ListMonitoredResourceDescriptorsPage,
          ListMonitoredResourceDescriptorsFixedSizeCollection> {

    public static ApiFuture<ListMonitoredResourceDescriptorsPagedResponse> createAsync(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ApiFuture<ListMonitoredResourceDescriptorsResponse> futureResponse) {
      ApiFuture<ListMonitoredResourceDescriptorsPage> futurePage =
          ListMonitoredResourceDescriptorsPage.createEmptyPage()
              .createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<
              ListMonitoredResourceDescriptorsPage,
              ListMonitoredResourceDescriptorsPagedResponse>() {
            @Override
            public ListMonitoredResourceDescriptorsPagedResponse apply(
                ListMonitoredResourceDescriptorsPage input) {
              return new ListMonitoredResourceDescriptorsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListMonitoredResourceDescriptorsPagedResponse(
        ListMonitoredResourceDescriptorsPage page) {
      super(page, ListMonitoredResourceDescriptorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListMonitoredResourceDescriptorsPage
      extends AbstractPage<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor,
          ListMonitoredResourceDescriptorsPage> {

    private ListMonitoredResourceDescriptorsPage(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ListMonitoredResourceDescriptorsResponse response) {
      super(context, response);
    }

    private static ListMonitoredResourceDescriptorsPage createEmptyPage() {
      return new ListMonitoredResourceDescriptorsPage(null, null);
    }

    @Override
    protected ListMonitoredResourceDescriptorsPage createPage(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ListMonitoredResourceDescriptorsResponse response) {
      return new ListMonitoredResourceDescriptorsPage(context, response);
    }

    @Override
    public ApiFuture<ListMonitoredResourceDescriptorsPage> createPageAsync(
        PageContext<
                ListMonitoredResourceDescriptorsRequest,
                ListMonitoredResourceDescriptorsResponse,
                MonitoredResourceDescriptor>
            context,
        ApiFuture<ListMonitoredResourceDescriptorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListMonitoredResourceDescriptorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMonitoredResourceDescriptorsRequest,
          ListMonitoredResourceDescriptorsResponse,
          MonitoredResourceDescriptor,
          ListMonitoredResourceDescriptorsPage,
          ListMonitoredResourceDescriptorsFixedSizeCollection> {

    private ListMonitoredResourceDescriptorsFixedSizeCollection(
        List<ListMonitoredResourceDescriptorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMonitoredResourceDescriptorsFixedSizeCollection createEmptyCollection() {
      return new ListMonitoredResourceDescriptorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMonitoredResourceDescriptorsFixedSizeCollection createCollection(
        List<ListMonitoredResourceDescriptorsPage> pages, int collectionSize) {
      return new ListMonitoredResourceDescriptorsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListMetricDescriptorsPagedResponse
      extends AbstractPagedListResponse<
          ListMetricDescriptorsRequest,
          ListMetricDescriptorsResponse,
          MetricDescriptor,
          ListMetricDescriptorsPage,
          ListMetricDescriptorsFixedSizeCollection> {

    public static ApiFuture<ListMetricDescriptorsPagedResponse> createAsync(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ApiFuture<ListMetricDescriptorsResponse> futureResponse) {
      ApiFuture<ListMetricDescriptorsPage> futurePage =
          ListMetricDescriptorsPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListMetricDescriptorsPage, ListMetricDescriptorsPagedResponse>() {
            @Override
            public ListMetricDescriptorsPagedResponse apply(ListMetricDescriptorsPage input) {
              return new ListMetricDescriptorsPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListMetricDescriptorsPagedResponse(ListMetricDescriptorsPage page) {
      super(page, ListMetricDescriptorsFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListMetricDescriptorsPage
      extends AbstractPage<
          ListMetricDescriptorsRequest,
          ListMetricDescriptorsResponse,
          MetricDescriptor,
          ListMetricDescriptorsPage> {

    private ListMetricDescriptorsPage(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ListMetricDescriptorsResponse response) {
      super(context, response);
    }

    private static ListMetricDescriptorsPage createEmptyPage() {
      return new ListMetricDescriptorsPage(null, null);
    }

    @Override
    protected ListMetricDescriptorsPage createPage(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ListMetricDescriptorsResponse response) {
      return new ListMetricDescriptorsPage(context, response);
    }

    @Override
    public ApiFuture<ListMetricDescriptorsPage> createPageAsync(
        PageContext<ListMetricDescriptorsRequest, ListMetricDescriptorsResponse, MetricDescriptor>
            context,
        ApiFuture<ListMetricDescriptorsResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListMetricDescriptorsFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListMetricDescriptorsRequest,
          ListMetricDescriptorsResponse,
          MetricDescriptor,
          ListMetricDescriptorsPage,
          ListMetricDescriptorsFixedSizeCollection> {

    private ListMetricDescriptorsFixedSizeCollection(
        List<ListMetricDescriptorsPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListMetricDescriptorsFixedSizeCollection createEmptyCollection() {
      return new ListMetricDescriptorsFixedSizeCollection(null, 0);
    }

    @Override
    protected ListMetricDescriptorsFixedSizeCollection createCollection(
        List<ListMetricDescriptorsPage> pages, int collectionSize) {
      return new ListMetricDescriptorsFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListTimeSeriesPagedResponse
      extends AbstractPagedListResponse<
          ListTimeSeriesRequest,
          ListTimeSeriesResponse,
          TimeSeries,
          ListTimeSeriesPage,
          ListTimeSeriesFixedSizeCollection> {

    public static ApiFuture<ListTimeSeriesPagedResponse> createAsync(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ApiFuture<ListTimeSeriesResponse> futureResponse) {
      ApiFuture<ListTimeSeriesPage> futurePage =
          ListTimeSeriesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListTimeSeriesPage, ListTimeSeriesPagedResponse>() {
            @Override
            public ListTimeSeriesPagedResponse apply(ListTimeSeriesPage input) {
              return new ListTimeSeriesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListTimeSeriesPagedResponse(ListTimeSeriesPage page) {
      super(page, ListTimeSeriesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListTimeSeriesPage
      extends AbstractPage<
          ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries, ListTimeSeriesPage> {

    private ListTimeSeriesPage(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ListTimeSeriesResponse response) {
      super(context, response);
    }

    private static ListTimeSeriesPage createEmptyPage() {
      return new ListTimeSeriesPage(null, null);
    }

    @Override
    protected ListTimeSeriesPage createPage(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ListTimeSeriesResponse response) {
      return new ListTimeSeriesPage(context, response);
    }

    @Override
    public ApiFuture<ListTimeSeriesPage> createPageAsync(
        PageContext<ListTimeSeriesRequest, ListTimeSeriesResponse, TimeSeries> context,
        ApiFuture<ListTimeSeriesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListTimeSeriesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListTimeSeriesRequest,
          ListTimeSeriesResponse,
          TimeSeries,
          ListTimeSeriesPage,
          ListTimeSeriesFixedSizeCollection> {

    private ListTimeSeriesFixedSizeCollection(List<ListTimeSeriesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListTimeSeriesFixedSizeCollection createEmptyCollection() {
      return new ListTimeSeriesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListTimeSeriesFixedSizeCollection createCollection(
        List<ListTimeSeriesPage> pages, int collectionSize) {
      return new ListTimeSeriesFixedSizeCollection(pages, collectionSize);
    }
  }
}
