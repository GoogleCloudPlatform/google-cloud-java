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
// source: google/cloud/aiplatform/v1/evaluation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface RougeResultsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.RougeResults)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.RougeMetricValue> getRougeMetricValuesList();
  /**
   *
   *
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.RougeMetricValue getRougeMetricValues(int index);
  /**
   *
   *
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getRougeMetricValuesCount();
  /**
   *
   *
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.RougeMetricValueOrBuilder>
      getRougeMetricValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Rouge metric values.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.RougeMetricValue rouge_metric_values = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.RougeMetricValueOrBuilder getRougeMetricValuesOrBuilder(int index);
}
