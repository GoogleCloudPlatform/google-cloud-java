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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1beta1;

public interface ListTagsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.ListTagsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Data Catalog resource to list the tags of. The
   * resource could be an [Entry][google.cloud.datacatalog.v1beta1.Entry] or an
   * [EntryGroup][google.cloud.datacatalog.v1beta1.EntryGroup].
   *
   * Examples:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
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
   * Required. The name of the Data Catalog resource to list the tags of. The
   * resource could be an [Entry][google.cloud.datacatalog.v1beta1.Entry] or an
   * [EntryGroup][google.cloud.datacatalog.v1beta1.EntryGroup].
   *
   * Examples:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
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
   * The maximum number of tags to return. Default is 10. Max limit is 1000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Token that specifies which page is requested. If empty, the first page is
   * returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Token that specifies which page is requested. If empty, the first page is
   * returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
