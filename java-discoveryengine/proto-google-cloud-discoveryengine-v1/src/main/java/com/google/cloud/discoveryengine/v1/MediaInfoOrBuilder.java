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
// source: google/cloud/discoveryengine/v1/user_event.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1;

public interface MediaInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.MediaInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   *
   * @return Whether the mediaProgressDuration field is set.
   */
  boolean hasMediaProgressDuration();
  /**
   *
   *
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   *
   * @return The mediaProgressDuration.
   */
  com.google.protobuf.Duration getMediaProgressDuration();
  /**
   *
   *
   * <pre>
   * The media progress time in seconds, if applicable.
   * For example, if the end user has finished 90 seconds of a playback video,
   * then
   * [MediaInfo.media_progress_duration.seconds][google.protobuf.Duration.seconds]
   * should be set to 90.
   * </pre>
   *
   * <code>.google.protobuf.Duration media_progress_duration = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getMediaProgressDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Media progress should be computed using only the
   * [media_progress_duration][google.cloud.discoveryengine.v1.MediaInfo.media_progress_duration]
   * relative to the media total length.
   *
   * This value must be between `[0, 1.0]` inclusive.
   *
   * If this is not a playback or the progress cannot be computed (e.g. ongoing
   * livestream), this field should be unset.
   * </pre>
   *
   * <code>optional float media_progress_percentage = 2;</code>
   *
   * @return Whether the mediaProgressPercentage field is set.
   */
  boolean hasMediaProgressPercentage();
  /**
   *
   *
   * <pre>
   * Media progress should be computed using only the
   * [media_progress_duration][google.cloud.discoveryengine.v1.MediaInfo.media_progress_duration]
   * relative to the media total length.
   *
   * This value must be between `[0, 1.0]` inclusive.
   *
   * If this is not a playback or the progress cannot be computed (e.g. ongoing
   * livestream), this field should be unset.
   * </pre>
   *
   * <code>optional float media_progress_percentage = 2;</code>
   *
   * @return The mediaProgressPercentage.
   */
  float getMediaProgressPercentage();
}
