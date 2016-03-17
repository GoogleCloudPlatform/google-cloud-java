/*
 * Copyright 2015 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

/*
 * EDITING INSTRUCTIONS
 * This file was generated from the file
 * https://github.com/google/googleapis/blob/master/google/logging/v2/logging.proto
 * and updates to that file get reflected here through a refresh process.
 * For the short term, the refresh process will only be runnable by Google engineers.
 * Manual additions are allowed because the refresh process performs
 * a 3-way merge in order to preserve those manual additions. In order to not
 * break the refresh process, only certain types of modifications are
 * allowed.
 *
 * Allowed modifications - currently these are the only types allowed:
 * 1. New methods (these should be added to the end of the class)
 * 2. New imports
 * 3. Additional documentation between "manual edit" demarcations
 *
 * Happy editing!
 */

package com.google.gcloud.logging.spi.v2;

import com.google.api.MonitoredResource;
import com.google.api.MonitoredResourceDescriptor;
import com.google.api.gax.grpc.ApiCallSettings;
import com.google.api.gax.grpc.ApiCallable;
import com.google.api.gax.protobuf.PathTemplate;
import com.google.logging.v2.DeleteLogRequest;
import com.google.logging.v2.ListLogEntriesRequest;
import com.google.logging.v2.ListLogEntriesResponse;
import com.google.logging.v2.ListMonitoredResourceDescriptorsRequest;
import com.google.logging.v2.ListMonitoredResourceDescriptorsResponse;
import com.google.logging.v2.LogEntry;
import com.google.logging.v2.ReadLogEntriesRequest;
import com.google.logging.v2.ReadLogEntriesResponse;
import com.google.logging.v2.WriteLogEntriesRequest;
import com.google.logging.v2.WriteLogEntriesResponse;
import com.google.protobuf.Empty;
import io.grpc.ManagedChannel;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Manually-added imports: add custom (non-generated) imports after this point.

// AUTO-GENERATED DOCUMENTATION AND SERVICE - see instructions at the top of the file for editing.
/**
 * Service Description: Service for ingesting and querying logs.
 *
 * <!-- manual edit -->
 * <!-- end manual edit -->
 */
@javax.annotation.Generated("by GAPIC")
public class LoggingServiceV2Api implements AutoCloseable {

  public static class ResourceNames {
    private ResourceNames() {}

    // =======================
    // ResourceNames Constants
    // =======================

    /**
     * A PathTemplate representing the fully-qualified path to represent
     * a log resource.
     *
     * <!-- manual edit -->
     * <!-- end manual edit -->
     */
    private static final PathTemplate LOG_PATH_TEMPLATE =
        PathTemplate.create("projects/{project}/logs/{log}");

    // ==============================
    // Resource Name Helper Functions
    // ==============================

    /**
     * Formats a string containing the fully-qualified path to represent
     * a log resource.
     *
     * <!-- manual edit -->
     * <!-- end manual edit -->
     */
    public static final String formatLogPath(String project, String log) {
      return LOG_PATH_TEMPLATE.instantiate("project", project, "log", log);
    }

    /**
     * Parses the project from the given fully-qualified path which
     * represents a log resource.
     *
     * <!-- manual edit -->
     * <!-- end manual edit -->
     */
    public static final String parseProjectFromLogPath(String logPath) {
      return LOG_PATH_TEMPLATE.parse(logPath).get("project");
    }

    /**
     * Parses the log from the given fully-qualified path which
     * represents a log resource.
     *
     * <!-- manual edit -->
     * <!-- end manual edit -->
     */
    public static final String parseLogFromLogPath(String logPath) {
      return LOG_PATH_TEMPLATE.parse(logPath).get("log");
    }
  }

  // ========
  // Members
  // ========

  private final ManagedChannel channel;
  private final List<AutoCloseable> closeables = new ArrayList<>();

  private final ApiCallable<DeleteLogRequest, Empty> deleteLogCallable;
  private final ApiCallable<WriteLogEntriesRequest, WriteLogEntriesResponse>
      writeLogEntriesCallable;
  private final ApiCallable<ListLogEntriesRequest, ListLogEntriesResponse> listLogEntriesCallable;
  private final ApiCallable<ListLogEntriesRequest, Iterable<LogEntry>>
      listLogEntriesIterableCallable;
  private final ApiCallable<ReadLogEntriesRequest, ReadLogEntriesResponse> readLogEntriesCallable;
  private final ApiCallable<ReadLogEntriesRequest, Iterable<LogEntry>>
      readLogEntriesIterableCallable;
  private final ApiCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable;
  private final ApiCallable<
          ListMonitoredResourceDescriptorsRequest, Iterable<MonitoredResourceDescriptor>>
      listMonitoredResourceDescriptorsIterableCallable;

  // ===============
  // Factory Methods
  // ===============

  /**
   * Constructs an instance of LoggingServiceV2Api with default settings.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public static LoggingServiceV2Api create() throws IOException {
    return create(LoggingServiceV2Settings.create());
  }

  /**
   * Constructs an instance of LoggingServiceV2Api, using the given settings. The channels are created based
   * on the settings passed in, or defaults for any settings that are not set.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public static LoggingServiceV2Api create(LoggingServiceV2Settings settings) throws IOException {
    return new LoggingServiceV2Api(settings);
  }

  /**
   * Constructs an instance of LoggingServiceV2Api, using the given settings. This is protected so that it
   * easy to make a subclass, but otherwise, the static factory methods should be preferred.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  protected LoggingServiceV2Api(LoggingServiceV2Settings settings) throws IOException {
    this.channel = settings.getChannel();

    this.deleteLogCallable = settings.deleteLogMethod().build(settings);
    this.writeLogEntriesCallable = settings.writeLogEntriesMethod().build(settings);
    this.listLogEntriesCallable = settings.listLogEntriesMethod().build(settings);
    this.listLogEntriesIterableCallable =
        settings.listLogEntriesMethod().buildPageStreaming(settings);
    this.readLogEntriesCallable = settings.readLogEntriesMethod().build(settings);
    this.readLogEntriesIterableCallable =
        settings.readLogEntriesMethod().buildPageStreaming(settings);
    this.listMonitoredResourceDescriptorsCallable =
        settings.listMonitoredResourceDescriptorsMethod().build(settings);
    this.listMonitoredResourceDescriptorsIterableCallable =
        settings.listMonitoredResourceDescriptorsMethod().buildPageStreaming(settings);

    closeables.add(
        new Closeable() {
          @Override
          public void close() throws IOException {
            channel.shutdown();
          }
        });
  }

  // =============
  // Service Calls
  // =============

  // ----- deleteLog -----

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Deletes a log and all its log entries.
   * The log will reappear if it receives new entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param logName Required. The resource name of the log to delete.  Example:
   * `"projects/my-project/logs/syslog"`.
   */
  public void deleteLog(String logName) {
    DeleteLogRequest request = DeleteLogRequest.newBuilder().setLogName(logName).build();

    deleteLog(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Deletes a log and all its log entries.
   * The log will reappear if it receives new entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param request The request object containing all of the parameters for the API call.
   */
  private void deleteLog(DeleteLogRequest request) {
    deleteLogCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Deletes a log and all its log entries.
   * The log will reappear if it receives new entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<DeleteLogRequest, Empty> deleteLogCallable() {
    return deleteLogCallable;
  }

  // ----- writeLogEntries -----

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Writes log entries to Cloud Logging.
   * All log entries in Cloud Logging are written by this method.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param logName Optional. A default log resource name for those log entries in `entries`
   * that do not specify their own `logName`.  Example:
   * `"projects/my-project/logs/syslog"`.  See
   * [LogEntry][google.logging.v2.LogEntry].
   * @param resource Optional. A default monitored resource for those log entries in `entries`
   * that do not specify their own `resource`.
   * @param labels Optional. User-defined `key:value` items that are added to
   * the `labels` field of each log entry in `entries`, except when a log
   * entry specifies its own 'key:value' item with the same key.
   * Example: `{ "size": "large", "color":"red" }`
   * @param entries Required. The log entries to write. The log entries must have values for
   * all required fields.
   */
  public WriteLogEntriesResponse writeLogEntries(
      String logName,
      MonitoredResource resource,
      Map<String, String> labels,
      List<LogEntry> entries) {
    WriteLogEntriesRequest request =
        WriteLogEntriesRequest.newBuilder()
            .setLogName(logName)
            .setResource(resource)
            .putAllLabels(labels)
            .addAllEntries(entries)
            .build();

    return writeLogEntries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Writes log entries to Cloud Logging.
   * All log entries in Cloud Logging are written by this method.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param request The request object containing all of the parameters for the API call.
   */
  public WriteLogEntriesResponse writeLogEntries(WriteLogEntriesRequest request) {
    return writeLogEntriesCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Writes log entries to Cloud Logging.
   * All log entries in Cloud Logging are written by this method.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<WriteLogEntriesRequest, WriteLogEntriesResponse> writeLogEntriesCallable() {
    return writeLogEntriesCallable;
  }

  // ----- listLogEntries -----

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists log entries.
   * Use this method to examine log entries from Cloud Logging.
   * See [Exporting Logs](/logging/docs/export) for other ways to copy
   * log entries out of Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public Iterable<LogEntry> listLogEntries(List<String> projectIds, String filter, String orderBy) {
    ListLogEntriesRequest request =
        ListLogEntriesRequest.newBuilder()
            .addAllProjectIds(projectIds)
            .setFilter(filter)
            .setOrderBy(orderBy)
            .build();
    return listLogEntries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists log entries.
   * Use this method to examine log entries from Cloud Logging.
   * See [Exporting Logs](/logging/docs/export) for other ways to copy
   * log entries out of Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param request The request object containing all of the parameters for the API call.
   */
  public Iterable<LogEntry> listLogEntries(ListLogEntriesRequest request) {
    return listLogEntriesIterableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists log entries.
   * Use this method to examine log entries from Cloud Logging.
   * See [Exporting Logs](/logging/docs/export) for other ways to copy
   * log entries out of Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<ListLogEntriesRequest, Iterable<LogEntry>> listLogEntriesIterableCallable() {
    return listLogEntriesIterableCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists log entries.
   * Use this method to examine log entries from Cloud Logging.
   * See [Exporting Logs](/logging/docs/export) for other ways to copy
   * log entries out of Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<ListLogEntriesRequest, ListLogEntriesResponse> listLogEntriesCallable() {
    return listLogEntriesCallable;
  }

  // ----- readLogEntries -----

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Streaming read of log entries.  Similar to `List`, this method is intended
   * for a large volume of log entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public Iterable<LogEntry> readLogEntries(List<String> projectIds, String filter, String orderBy) {
    ReadLogEntriesRequest request =
        ReadLogEntriesRequest.newBuilder()
            .addAllProjectIds(projectIds)
            .setFilter(filter)
            .setOrderBy(orderBy)
            .build();
    return readLogEntries(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Streaming read of log entries.  Similar to `List`, this method is intended
   * for a large volume of log entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param request The request object containing all of the parameters for the API call.
   */
  public Iterable<LogEntry> readLogEntries(ReadLogEntriesRequest request) {
    return readLogEntriesIterableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Streaming read of log entries.  Similar to `List`, this method is intended
   * for a large volume of log entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<ReadLogEntriesRequest, Iterable<LogEntry>> readLogEntriesIterableCallable() {
    return readLogEntriesIterableCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Streaming read of log entries.  Similar to `List`, this method is intended
   * for a large volume of log entries.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<ReadLogEntriesRequest, ReadLogEntriesResponse> readLogEntriesCallable() {
    return readLogEntriesCallable;
  }

  // ----- listMonitoredResourceDescriptors -----

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists monitored resource descriptors that are used by Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   *
   * @param request The request object containing all of the parameters for the API call.
   */
  public Iterable<MonitoredResourceDescriptor> listMonitoredResourceDescriptors(
      ListMonitoredResourceDescriptorsRequest request) {
    return listMonitoredResourceDescriptorsIterableCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists monitored resource descriptors that are used by Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<ListMonitoredResourceDescriptorsRequest, Iterable<MonitoredResourceDescriptor>>
      listMonitoredResourceDescriptorsIterableCallable() {
    return listMonitoredResourceDescriptorsIterableCallable;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD - see instructions at the top of the file for editing.
  /**
   * Lists monitored resource descriptors that are used by Cloud Logging.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  public ApiCallable<
          ListMonitoredResourceDescriptorsRequest, ListMonitoredResourceDescriptorsResponse>
      listMonitoredResourceDescriptorsCallable() {
    return listMonitoredResourceDescriptorsCallable;
  }

  // ========
  // Cleanup
  // ========

  /**
   * Initiates an orderly shutdown in which preexisting calls continue but new calls are immediately
   * cancelled.
   *
   * <!-- manual edit -->
   * <!-- end manual edit -->
   */
  @Override
  public void close() throws Exception {
    for (AutoCloseable closeable : closeables) {
      closeable.close();
    }
  }

  // ========
  // Manually-added methods: add custom (non-generated) methods after this point.
  // ========

}
