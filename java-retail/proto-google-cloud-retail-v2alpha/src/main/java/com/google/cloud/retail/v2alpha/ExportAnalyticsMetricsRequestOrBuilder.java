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
// source: google/cloud/retail/v2alpha/export_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2alpha;

public interface ExportAnalyticsMetricsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.ExportAnalyticsMetricsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of the parent catalog.
   * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The catalog.
   */
  java.lang.String getCatalog();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of the parent catalog.
   * Expected format: `projects/&#42;&#47;locations/&#42;&#47;catalogs/&#42;`
   * </pre>
   *
   * <code>string catalog = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for catalog.
   */
  com.google.protobuf.ByteString getCatalogBytes();

  /**
   *
   *
   * <pre>
   * Required. The output location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The output location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.retail.v2alpha.OutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. The output location of the data.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.OutputConfig output_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2alpha.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * A filtering expression to specify restrictions on returned metrics.
   * The expression is a sequence of terms. Each term applies a restriction to
   * the returned metrics. Use this expression to restrict results to a
   * specific time range.
   *
   *   Currently we expect only one types of fields:
   *
   *    * `timestamp`: This can be specified twice, once with a
   *      less than operator and once with a greater than operator. The
   *      `timestamp` restriction should result in one, contiguous, valid,
   *      `timestamp` range.
   *
   *   Some examples of valid filters expressions:
   *
   *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
   *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
   *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A filtering expression to specify restrictions on returned metrics.
   * The expression is a sequence of terms. Each term applies a restriction to
   * the returned metrics. Use this expression to restrict results to a
   * specific time range.
   *
   *   Currently we expect only one types of fields:
   *
   *    * `timestamp`: This can be specified twice, once with a
   *      less than operator and once with a greater than operator. The
   *      `timestamp` restriction should result in one, contiguous, valid,
   *      `timestamp` range.
   *
   *   Some examples of valid filters expressions:
   *
   *   * Example 1: `timestamp &gt; "2012-04-23T18:25:43.511Z"
   *             timestamp &lt; "2012-04-23T18:30:43.511Z"`
   *   * Example 2: `timestamp &gt; "2012-04-23T18:25:43.511Z"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
