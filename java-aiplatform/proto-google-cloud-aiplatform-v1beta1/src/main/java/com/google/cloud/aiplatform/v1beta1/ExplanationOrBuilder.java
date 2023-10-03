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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ExplanationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Explanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Feature attributions grouped by predicted outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * If users set
   * [ExplanationParameters.top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k],
   * the attributions are sorted by
   * [instance_output_value][Attributions.instance_output_value] in descending
   * order. If
   * [ExplanationParameters.output_indices][google.cloud.aiplatform.v1beta1.ExplanationParameters.output_indices]
   * is specified, the attributions are stored by
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * in the same order as they appear in the output_indices.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Attribution attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Attribution> getAttributionsList();
  /**
   *
   *
   * <pre>
   * Output only. Feature attributions grouped by predicted outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * If users set
   * [ExplanationParameters.top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k],
   * the attributions are sorted by
   * [instance_output_value][Attributions.instance_output_value] in descending
   * order. If
   * [ExplanationParameters.output_indices][google.cloud.aiplatform.v1beta1.ExplanationParameters.output_indices]
   * is specified, the attributions are stored by
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * in the same order as they appear in the output_indices.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Attribution attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Attribution getAttributions(int index);
  /**
   *
   *
   * <pre>
   * Output only. Feature attributions grouped by predicted outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * If users set
   * [ExplanationParameters.top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k],
   * the attributions are sorted by
   * [instance_output_value][Attributions.instance_output_value] in descending
   * order. If
   * [ExplanationParameters.output_indices][google.cloud.aiplatform.v1beta1.ExplanationParameters.output_indices]
   * is specified, the attributions are stored by
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * in the same order as they appear in the output_indices.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Attribution attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAttributionsCount();
  /**
   *
   *
   * <pre>
   * Output only. Feature attributions grouped by predicted outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * If users set
   * [ExplanationParameters.top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k],
   * the attributions are sorted by
   * [instance_output_value][Attributions.instance_output_value] in descending
   * order. If
   * [ExplanationParameters.output_indices][google.cloud.aiplatform.v1beta1.ExplanationParameters.output_indices]
   * is specified, the attributions are stored by
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * in the same order as they appear in the output_indices.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Attribution attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.AttributionOrBuilder>
      getAttributionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Feature attributions grouped by predicted outputs.
   *
   * For Models that predict only one output, such as regression Models that
   * predict only one score, there is only one attibution that explains the
   * predicted output. For Models that predict multiple outputs, such as
   * multiclass Models that predict multiple classes, each element explains one
   * specific item.
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * can be used to identify which output this attribution is explaining.
   *
   * If users set
   * [ExplanationParameters.top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k],
   * the attributions are sorted by
   * [instance_output_value][Attributions.instance_output_value] in descending
   * order. If
   * [ExplanationParameters.output_indices][google.cloud.aiplatform.v1beta1.ExplanationParameters.output_indices]
   * is specified, the attributions are stored by
   * [Attribution.output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * in the same order as they appear in the output_indices.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Attribution attributions = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.AttributionOrBuilder getAttributionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. List of the nearest neighbors for example-based explanations.
   *
   * For models deployed with the examples explanations feature enabled, the
   * attributions field is empty and instead the neighbors field is populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Neighbor neighbors = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Neighbor> getNeighborsList();
  /**
   *
   *
   * <pre>
   * Output only. List of the nearest neighbors for example-based explanations.
   *
   * For models deployed with the examples explanations feature enabled, the
   * attributions field is empty and instead the neighbors field is populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Neighbor neighbors = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Neighbor getNeighbors(int index);
  /**
   *
   *
   * <pre>
   * Output only. List of the nearest neighbors for example-based explanations.
   *
   * For models deployed with the examples explanations feature enabled, the
   * attributions field is empty and instead the neighbors field is populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Neighbor neighbors = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getNeighborsCount();
  /**
   *
   *
   * <pre>
   * Output only. List of the nearest neighbors for example-based explanations.
   *
   * For models deployed with the examples explanations feature enabled, the
   * attributions field is empty and instead the neighbors field is populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Neighbor neighbors = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.NeighborOrBuilder>
      getNeighborsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. List of the nearest neighbors for example-based explanations.
   *
   * For models deployed with the examples explanations feature enabled, the
   * attributions field is empty and instead the neighbors field is populated.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Neighbor neighbors = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.NeighborOrBuilder getNeighborsOrBuilder(int index);
}
