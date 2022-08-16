/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface AnnotationBoundaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.AnnotationBoundary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The word index of this boundary with respect to the first word in the
   * transcript piece. This index starts at zero.
   * </pre>
   *
   * <code>int32 word_index = 3;</code>
   *
   * @return Whether the wordIndex field is set.
   */
  boolean hasWordIndex();
  /**
   *
   *
   * <pre>
   * The word index of this boundary with respect to the first word in the
   * transcript piece. This index starts at zero.
   * </pre>
   *
   * <code>int32 word_index = 3;</code>
   *
   * @return The wordIndex.
   */
  int getWordIndex();

  /**
   *
   *
   * <pre>
   * The index in the sequence of transcribed pieces of the conversation where
   * the boundary is located. This index starts at zero.
   * </pre>
   *
   * <code>int32 transcript_index = 1;</code>
   *
   * @return The transcriptIndex.
   */
  int getTranscriptIndex();

  public com.google.cloud.contactcenterinsights.v1.AnnotationBoundary.DetailedBoundaryCase
      getDetailedBoundaryCase();
}
