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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contactcenterinsights.v1;

public interface ListViewsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.ListViewsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  java.util.List<com.google.cloud.contactcenterinsights.v1.View> getViewsList();
  /**
   *
   *
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  com.google.cloud.contactcenterinsights.v1.View getViews(int index);
  /**
   *
   *
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  int getViewsCount();
  /**
   *
   *
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contactcenterinsights.v1.ViewOrBuilder>
      getViewsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewsOrBuilder(int index);

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
