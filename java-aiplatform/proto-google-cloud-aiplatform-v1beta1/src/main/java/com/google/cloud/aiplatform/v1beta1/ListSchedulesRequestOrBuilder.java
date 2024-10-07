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
// source: google/cloud/aiplatform/v1beta1/schedule_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface ListSchedulesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListSchedulesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location to list the Schedules from.
   * Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location to list the Schedules from.
   * Format: `projects/{project}/locations/{location}`
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
   * Lists the Schedules that match the filter expression. The following
   * fields are supported:
   *
   * * `display_name`: Supports `=`, `!=` comparisons, and `:` wildcard.
   * * `state`: Supports `=` and `!=` comparisons.
   * * `request`: Supports existence of the &lt;request_type&gt; check.
   *       (e.g. `create_pipeline_job_request:*` --&gt; Schedule has
   *       create_pipeline_job_request).
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *       Values must be in RFC 3339 format.
   * * `start_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *       Values must be in RFC 3339 format.
   * * `end_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, `&gt;=` comparisons and `:*`
   *       existence check. Values must be in RFC 3339 format.
   * * `next_run_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=`
   *       comparisons. Values must be in RFC 3339 format.
   *
   *
   * Filter expressions can be combined together using logical operators
   * (`NOT`, `AND` &amp; `OR`).
   * The syntax to define filter expression is based on
   * https://google.aip.dev/160.
   *
   * Examples:
   *
   * * `state="ACTIVE" AND display_name:"my_schedule_*"`
   * * `NOT display_name="my_schedule"`
   * * `create_time&gt;"2021-05-18T00:00:00Z"`
   * * `end_time&gt;"2021-05-18T00:00:00Z" OR NOT end_time:*`
   * * `create_pipeline_job_request:*`
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Lists the Schedules that match the filter expression. The following
   * fields are supported:
   *
   * * `display_name`: Supports `=`, `!=` comparisons, and `:` wildcard.
   * * `state`: Supports `=` and `!=` comparisons.
   * * `request`: Supports existence of the &lt;request_type&gt; check.
   *       (e.g. `create_pipeline_job_request:*` --&gt; Schedule has
   *       create_pipeline_job_request).
   * * `create_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *       Values must be in RFC 3339 format.
   * * `start_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=` comparisons.
   *       Values must be in RFC 3339 format.
   * * `end_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, `&gt;=` comparisons and `:*`
   *       existence check. Values must be in RFC 3339 format.
   * * `next_run_time`: Supports `=`, `!=`, `&lt;`, `&gt;`, `&lt;=`, and `&gt;=`
   *       comparisons. Values must be in RFC 3339 format.
   *
   *
   * Filter expressions can be combined together using logical operators
   * (`NOT`, `AND` &amp; `OR`).
   * The syntax to define filter expression is based on
   * https://google.aip.dev/160.
   *
   * Examples:
   *
   * * `state="ACTIVE" AND display_name:"my_schedule_*"`
   * * `NOT display_name="my_schedule"`
   * * `create_time&gt;"2021-05-18T00:00:00Z"`
   * * `end_time&gt;"2021-05-18T00:00:00Z" OR NOT end_time:*`
   * * `create_pipeline_job_request:*`
   * </pre>
   *
   * <code>string filter = 2;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The standard list page size.
   * Default to 100 if not specified.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListSchedulesResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSchedulesResponse.next_page_token]
   * of the previous
   * [ScheduleService.ListSchedules][google.cloud.aiplatform.v1beta1.ScheduleService.ListSchedules]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The standard list page token.
   * Typically obtained via
   * [ListSchedulesResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListSchedulesResponse.next_page_token]
   * of the previous
   * [ScheduleService.ListSchedules][google.cloud.aiplatform.v1beta1.ScheduleService.ListSchedules]
   * call.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by. The default sort order is in
   * ascending order. Use "desc" after a field name for descending. You can have
   * multiple order_by fields provided.
   *
   * For example, using "create_time desc, end_time" will order results by
   * create time in descending order, and if there are multiple schedules having
   * the same create time, order them by the end time in ascending order.
   *
   * If order_by is not specified, it will order by default with create_time in
   * descending order.
   *
   * Supported fields:
   *
   *   * `create_time`
   *   * `start_time`
   *   * `end_time`
   *   * `next_run_time`
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * A comma-separated list of fields to order by. The default sort order is in
   * ascending order. Use "desc" after a field name for descending. You can have
   * multiple order_by fields provided.
   *
   * For example, using "create_time desc, end_time" will order results by
   * create time in descending order, and if there are multiple schedules having
   * the same create time, order them by the end time in ascending order.
   *
   * If order_by is not specified, it will order by default with create_time in
   * descending order.
   *
   * Supported fields:
   *
   *   * `create_time`
   *   * `start_time`
   *   * `end_time`
   *   * `next_run_time`
   * </pre>
   *
   * <code>string order_by = 5;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
