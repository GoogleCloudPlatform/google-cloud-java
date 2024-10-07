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
// source: google/cloud/dataplex/v1/catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface SearchEntriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.SearchEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project to which the request should be attributed in the
   * following form: `projects/{project}/locations/{location}`.
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
   * Required. The project to which the request should be attributed in the
   * following form: `projects/{project}/locations/{location}`.
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
   * Required. The query against which entries in scope should be matched.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * Required. The query against which entries in scope should be matched.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Optional. Pagination.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Ordering of the results. Supported options to be added later.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Optional. Ordering of the results. Supported options to be added later.
   * </pre>
   *
   * <code>string order_by = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Optional. The scope under which the search should be operating. Should
   * either be organizations/&lt;org_id&gt; or projects/&lt;project_ref&gt;. If left
   * unspecified, it will default to the organization where the project provided
   * in `name` is located.
   * </pre>
   *
   * <code>string scope = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The scope.
   */
  java.lang.String getScope();
  /**
   *
   *
   * <pre>
   * Optional. The scope under which the search should be operating. Should
   * either be organizations/&lt;org_id&gt; or projects/&lt;project_ref&gt;. If left
   * unspecified, it will default to the organization where the project provided
   * in `name` is located.
   * </pre>
   *
   * <code>string scope = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for scope.
   */
  com.google.protobuf.ByteString getScopeBytes();
}
