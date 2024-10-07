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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface ListTagsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ListTagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.Tag> getTagsList();
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  com.google.cloud.datacatalog.v1.Tag getTags(int index);
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.TagOrBuilder> getTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Tag][google.cloud.datacatalog.v1.Tag] details.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag tags = 1;</code>
   */
  com.google.cloud.datacatalog.v1.TagOrBuilder getTagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pagination token of the next results page. Empty if there are
   * no more items in results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Pagination token of the next results page. Empty if there are
   * no more items in results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
