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
// source: google/cloud/video/stitcher/v1/video_stitcher_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.stitcher.v1;

public interface ListLiveAdTagDetailsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.ListLiveAdTagDetailsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  java.util.List<com.google.cloud.video.stitcher.v1.LiveAdTagDetail> getLiveAdTagDetailsList();
  /**
   *
   *
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  com.google.cloud.video.stitcher.v1.LiveAdTagDetail getLiveAdTagDetails(int index);
  /**
   *
   *
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  int getLiveAdTagDetailsCount();
  /**
   *
   *
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  java.util.List<? extends com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder>
      getLiveAdTagDetailsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of live session ad tag details.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.LiveAdTagDetail live_ad_tag_details = 1;</code>
   */
  com.google.cloud.video.stitcher.v1.LiveAdTagDetailOrBuilder getLiveAdTagDetailsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The pagination token.
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
   * The pagination token.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
