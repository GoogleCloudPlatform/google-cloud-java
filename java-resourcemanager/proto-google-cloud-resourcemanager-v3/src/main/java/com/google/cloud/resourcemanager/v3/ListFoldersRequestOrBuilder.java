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
// source: google/cloud/resourcemanager/v3/folders.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.resourcemanager.v3;

public interface ListFoldersRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.ListFoldersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the parent resource whose folders are being listed.
   * Only children of this parent resource are listed; descendants are not
   * listed.
   *
   * If the parent is a folder, use the value `folders/{folder_id}`. If the
   * parent is an organization, use the value `organizations/{org_id}`.
   *
   * Access to this method is controlled by checking the
   * `resourcemanager.folders.list` permission on the `parent`.
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
   * Required. The name of the parent resource whose folders are being listed.
   * Only children of this parent resource are listed; descendants are not
   * listed.
   *
   * If the parent is a folder, use the value `folders/{folder_id}`. If the
   * parent is an organization, use the value `organizations/{org_id}`.
   *
   * Access to this method is controlled by checking the
   * `resourcemanager.folders.list` permission on the `parent`.
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
   * Optional. The maximum number of folders to return in the response. The
   * server can return fewer folders than requested. If unspecified, server
   * picks an appropriate default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A pagination token returned from a previous call to `ListFolders`
   * that indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A pagination token returned from a previous call to `ListFolders`
   * that indicates where this listing should continue from.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Controls whether folders in the
   * [DELETE_REQUESTED][google.cloud.resourcemanager.v3.Folder.State.DELETE_REQUESTED]
   * state should be returned. Defaults to false.
   * </pre>
   *
   * <code>bool show_deleted = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The showDeleted.
   */
  boolean getShowDeleted();
}
