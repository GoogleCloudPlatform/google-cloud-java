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
// source: google/monitoring/v3/metric_service.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

public interface QueryTimeSeriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.QueryTimeSeriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) on which
   * to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The
   * [project](https://cloud.google.com/monitoring/api/v3#project_name) on which
   * to execute the request. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The query in the [Monitoring Query
   * Language](https://cloud.google.com/monitoring/mql/reference) format.
   * The default time zone is in UTC.
   * </pre>
   *
   * <code>string query = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query in the [Monitoring Query
   * Language](https://cloud.google.com/monitoring/mql/reference) format.
   * The default time zone is in UTC.
   * </pre>
   *
   * <code>string query = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * A positive number that is the maximum number of time_series_data to return.
   * </pre>
   *
   * <code>int32 page_size = 9;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 10;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 10;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
