/*
 * Copyright 2023 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface TransformationOverviewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransformationOverview)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Total size in bytes that were transformed in some way.
   * </pre>
   *
   * <code>int64 transformed_bytes = 2;</code>
   *
   * @return The transformedBytes.
   */
  long getTransformedBytes();

  /**
   *
   *
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;
   * </code>
   */
  java.util.List<com.google.privacy.dlp.v2.TransformationSummary> getTransformationSummariesList();
  /**
   *
   *
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;
   * </code>
   */
  com.google.privacy.dlp.v2.TransformationSummary getTransformationSummaries(int index);
  /**
   *
   *
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;
   * </code>
   */
  int getTransformationSummariesCount();
  /**
   *
   *
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;
   * </code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.TransformationSummaryOrBuilder>
      getTransformationSummariesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Transformations applied to the dataset.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.TransformationSummary transformation_summaries = 3;
   * </code>
   */
  com.google.privacy.dlp.v2.TransformationSummaryOrBuilder getTransformationSummariesOrBuilder(
      int index);
}
