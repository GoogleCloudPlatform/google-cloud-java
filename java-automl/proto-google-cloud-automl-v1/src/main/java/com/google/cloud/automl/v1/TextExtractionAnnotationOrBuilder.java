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
// source: google/cloud/automl/v1/text_extraction.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1;

public interface TextExtractionAnnotationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1.TextExtractionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An entity annotation will set this, which is the part of the original
   * text to which the annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
   *
   * @return Whether the textSegment field is set.
   */
  boolean hasTextSegment();
  /**
   *
   *
   * <pre>
   * An entity annotation will set this, which is the part of the original
   * text to which the annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
   *
   * @return The textSegment.
   */
  com.google.cloud.automl.v1.TextSegment getTextSegment();
  /**
   *
   *
   * <pre>
   * An entity annotation will set this, which is the part of the original
   * text to which the annotation pertains.
   * </pre>
   *
   * <code>.google.cloud.automl.v1.TextSegment text_segment = 3;</code>
   */
  com.google.cloud.automl.v1.TextSegmentOrBuilder getTextSegmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A confidence estimate between 0.0 and 1.0. A higher value
   * means greater confidence in correctness of the annotation.
   * </pre>
   *
   * <code>float score = 1;</code>
   *
   * @return The score.
   */
  float getScore();

  com.google.cloud.automl.v1.TextExtractionAnnotation.AnnotationCase getAnnotationCase();
}
