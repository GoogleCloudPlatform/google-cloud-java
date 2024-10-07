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
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface CitationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CitationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Citation> getCitationsList();
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Citation getCitations(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getCitationsCount();
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.CitationOrBuilder>
      getCitationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. List of citations.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Citation citations = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.CitationOrBuilder getCitationsOrBuilder(int index);
}
