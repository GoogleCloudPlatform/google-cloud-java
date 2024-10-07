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
// source: google/cloud/visionai/v1/annotations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface VideoObjectTrackingPredictionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.VideoObjectTrackingPredictionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment in which the
   * current identifications happens.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp segment_start_time = 1;</code>
   *
   * @return Whether the segmentStartTime field is set.
   */
  boolean hasSegmentStartTime();
  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment in which the
   * current identifications happens.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp segment_start_time = 1;</code>
   *
   * @return The segmentStartTime.
   */
  com.google.protobuf.Timestamp getSegmentStartTime();
  /**
   *
   *
   * <pre>
   * The beginning, inclusive, of the video's time segment in which the
   * current identifications happens.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp segment_start_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSegmentStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The end, inclusive, of the video's time segment in which the current
   * identifications happen. Particularly, if the end is the same as the start,
   * it means the identifications happen on a specific video frame.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp segment_end_time = 2;</code>
   *
   * @return Whether the segmentEndTime field is set.
   */
  boolean hasSegmentEndTime();
  /**
   *
   *
   * <pre>
   * The end, inclusive, of the video's time segment in which the current
   * identifications happen. Particularly, if the end is the same as the start,
   * it means the identifications happen on a specific video frame.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp segment_end_time = 2;</code>
   *
   * @return The segmentEndTime.
   */
  com.google.protobuf.Timestamp getSegmentEndTime();
  /**
   *
   *
   * <pre>
   * The end, inclusive, of the video's time segment in which the current
   * identifications happen. Particularly, if the end is the same as the start,
   * it means the identifications happen on a specific video frame.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp segment_end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSegmentEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * All of the objects detected in the specified time range.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject objects = 3;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject>
      getObjectsList();
  /**
   *
   *
   * <pre>
   * All of the objects detected in the specified time range.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject objects = 3;
   * </code>
   */
  com.google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject getObjects(
      int index);
  /**
   *
   *
   * <pre>
   * All of the objects detected in the specified time range.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject objects = 3;
   * </code>
   */
  int getObjectsCount();
  /**
   *
   *
   * <pre>
   * All of the objects detected in the specified time range.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject objects = 3;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.visionai.v1.VideoObjectTrackingPredictionResult
                  .DetectedObjectOrBuilder>
      getObjectsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All of the objects detected in the specified time range.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObject objects = 3;
   * </code>
   */
  com.google.cloud.visionai.v1.VideoObjectTrackingPredictionResult.DetectedObjectOrBuilder
      getObjectsOrBuilder(int index);
}
