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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.migrationcenter.v1;

public interface ErrorFrameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.ErrorFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The identifier of the ErrorFrame.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The identifier of the ErrorFrame.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. All the violations that were detected for the frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.FrameViolationEntry violations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.FrameViolationEntry> getViolationsList();
  /**
   *
   *
   * <pre>
   * Output only. All the violations that were detected for the frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.FrameViolationEntry violations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.FrameViolationEntry getViolations(int index);
  /**
   *
   *
   * <pre>
   * Output only. All the violations that were detected for the frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.FrameViolationEntry violations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getViolationsCount();
  /**
   *
   *
   * <pre>
   * Output only. All the violations that were detected for the frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.FrameViolationEntry violations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.FrameViolationEntryOrBuilder>
      getViolationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. All the violations that were detected for the frame.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.migrationcenter.v1.FrameViolationEntry violations = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.FrameViolationEntryOrBuilder getViolationsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The frame that was originally reported.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.AssetFrame original_frame = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the originalFrame field is set.
   */
  boolean hasOriginalFrame();
  /**
   *
   *
   * <pre>
   * Output only. The frame that was originally reported.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.AssetFrame original_frame = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The originalFrame.
   */
  com.google.cloud.migrationcenter.v1.AssetFrame getOriginalFrame();
  /**
   *
   *
   * <pre>
   * Output only. The frame that was originally reported.
   * </pre>
   *
   * <code>
   * .google.cloud.migrationcenter.v1.AssetFrame original_frame = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.migrationcenter.v1.AssetFrameOrBuilder getOriginalFrameOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Frame ingestion time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp ingestion_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the ingestionTime field is set.
   */
  boolean hasIngestionTime();
  /**
   *
   *
   * <pre>
   * Output only. Frame ingestion time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp ingestion_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The ingestionTime.
   */
  com.google.protobuf.Timestamp getIngestionTime();
  /**
   *
   *
   * <pre>
   * Output only. Frame ingestion time.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp ingestion_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getIngestionTimeOrBuilder();
}
