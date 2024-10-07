/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/analytics_data_api.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1alpha;

public interface CreateReportTaskRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.CreateReportTaskRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this report task will be created.
   * Format: `properties/{propertyId}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this report task will be created.
   * Format: `properties/{propertyId}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The report task configuration to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the reportTask field is set.
   */
  boolean hasReportTask();
  /**
   *
   *
   * <pre>
   * Required. The report task configuration to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The reportTask.
   */
  com.google.analytics.data.v1alpha.ReportTask getReportTask();
  /**
   *
   *
   * <pre>
   * Required. The report task configuration to create.
   * </pre>
   *
   * <code>
   * .google.analytics.data.v1alpha.ReportTask report_task = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.data.v1alpha.ReportTaskOrBuilder getReportTaskOrBuilder();
}
