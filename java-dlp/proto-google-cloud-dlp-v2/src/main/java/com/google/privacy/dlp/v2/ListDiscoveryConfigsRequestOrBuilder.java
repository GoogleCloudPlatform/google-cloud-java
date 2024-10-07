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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface ListDiscoveryConfigsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListDiscoveryConfigsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
   *
   * The format of this value is as follows:
   * `projects/{project_id}/locations/{location_id}`
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
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
   * Required. Parent resource name.
   *
   * The format of this value is as follows:
   * `projects/{project_id}/locations/{location_id}`
   *
   * The following example `parent` string specifies a parent project with the
   * identifier `example-project`, and specifies the `europe-west3` location
   * for processing data:
   *
   *     parent=projects/example-project/locations/europe-west3
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
   * Page token to continue retrieval. Comes from the previous call
   * to ListDiscoveryConfigs. `order_by` field must not
   * change for subsequent calls.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Page token to continue retrieval. Comes from the previous call
   * to ListDiscoveryConfigs. `order_by` field must not
   * change for subsequent calls.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Size of the page. This value can be limited by a server.
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
   * Comma-separated list of config fields to order by,
   * followed by `asc` or `desc` postfix. This list is case insensitive. The
   * default sorting order is ascending. Redundant space characters are
   * insignificant.
   *
   * Example: `name asc,update_time, create_time desc`
   *
   * Supported fields are:
   *
   * - `last_run_time`: corresponds to the last time the DiscoveryConfig ran.
   * - `name`: corresponds to the DiscoveryConfig's name.
   * - `status`: corresponds to DiscoveryConfig's status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Comma-separated list of config fields to order by,
   * followed by `asc` or `desc` postfix. This list is case insensitive. The
   * default sorting order is ascending. Redundant space characters are
   * insignificant.
   *
   * Example: `name asc,update_time, create_time desc`
   *
   * Supported fields are:
   *
   * - `last_run_time`: corresponds to the last time the DiscoveryConfig ran.
   * - `name`: corresponds to the DiscoveryConfig's name.
   * - `status`: corresponds to DiscoveryConfig's status.
   * </pre>
   *
   * <code>string order_by = 4;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();
}
