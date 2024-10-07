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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataform.v1beta1;

public interface QueryRepositoryDirectoryContentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.QueryRepositoryDirectoryContentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The repository's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The repository's name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Commit SHA for the commit to query from. If unset, the
   * directory will be queried from HEAD.
   * </pre>
   *
   * <code>string commit_sha = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The commitSha.
   */
  java.lang.String getCommitSha();
  /**
   *
   *
   * <pre>
   * Optional. The Commit SHA for the commit to query from. If unset, the
   * directory will be queried from HEAD.
   * </pre>
   *
   * <code>string commit_sha = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for commitSha.
   */
  com.google.protobuf.ByteString getCommitShaBytes();

  /**
   *
   *
   * <pre>
   * Optional. The directory's full path including directory name, relative to
   * root. If left unset, the root is used.
   * </pre>
   *
   * <code>string path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Optional. The directory's full path including directory name, relative to
   * root. If left unset, the root is used.
   * </pre>
   *
   * <code>string path = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Optional. Maximum number of paths to return. The server may return fewer
   * items than requested. If unspecified, the server will pick an appropriate
   * default.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. Page token received from a previous
   * `QueryRepositoryDirectoryContents` call. Provide this to retrieve the
   * subsequent page.
   *
   * When paginating, all other parameters provided to
   * `QueryRepositoryDirectoryContents` must match the call that provided the
   * page token.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. Page token received from a previous
   * `QueryRepositoryDirectoryContents` call. Provide this to retrieve the
   * subsequent page.
   *
   * When paginating, all other parameters provided to
   * `QueryRepositoryDirectoryContents` must match the call that provided the
   * page token.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
