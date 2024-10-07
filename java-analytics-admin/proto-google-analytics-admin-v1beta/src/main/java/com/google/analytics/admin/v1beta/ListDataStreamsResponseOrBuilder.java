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
// source: google/analytics/admin/v1beta/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1beta;

public interface ListDataStreamsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.ListDataStreamsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.DataStream> getDataStreamsList();
  /**
   *
   *
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  com.google.analytics.admin.v1beta.DataStream getDataStreams(int index);
  /**
   *
   *
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  int getDataStreamsCount();
  /**
   *
   *
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.DataStreamOrBuilder>
      getDataStreamsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of DataStreams.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.DataStream data_streams = 1;</code>
   */
  com.google.analytics.admin.v1beta.DataStreamOrBuilder getDataStreamsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
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
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
