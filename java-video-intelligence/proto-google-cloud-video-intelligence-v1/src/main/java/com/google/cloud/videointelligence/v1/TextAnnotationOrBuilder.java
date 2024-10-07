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
// source: google/cloud/videointelligence/v1/video_intelligence.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.videointelligence.v1;

public interface TextAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.TextAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * The detected text.
   * </pre>
   *
   * <code>string text = 1;</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextSegment segments = 2;</code>
   */
  java.util.List<com.google.cloud.videointelligence.v1.TextSegment> getSegmentsList();
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1.TextSegment getSegments(int index);
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextSegment segments = 2;</code>
   */
  int getSegmentsCount();
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextSegment segments = 2;</code>
   */
  java.util.List<? extends com.google.cloud.videointelligence.v1.TextSegmentOrBuilder>
      getSegmentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All video segments where OCR detected text appears.
   * </pre>
   *
   * <code>repeated .google.cloud.videointelligence.v1.TextSegment segments = 2;</code>
   */
  com.google.cloud.videointelligence.v1.TextSegmentOrBuilder getSegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Feature version.
   * </pre>
   *
   * <code>string version = 3;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();
}
