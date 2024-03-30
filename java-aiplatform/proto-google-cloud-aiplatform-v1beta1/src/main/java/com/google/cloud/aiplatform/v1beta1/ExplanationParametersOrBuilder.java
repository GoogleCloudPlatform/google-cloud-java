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
// source: google/cloud/aiplatform/v1beta1/explanation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ExplanationParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ExplanationParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * Refer to this paper for model details: https://arxiv.org/abs/1306.4265.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SampledShapleyAttribution sampled_shapley_attribution = 1;
   * </code>
   *
   * @return Whether the sampledShapleyAttribution field is set.
   */
  boolean hasSampledShapleyAttribution();
  /**
   *
   *
   * <pre>
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * Refer to this paper for model details: https://arxiv.org/abs/1306.4265.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SampledShapleyAttribution sampled_shapley_attribution = 1;
   * </code>
   *
   * @return The sampledShapleyAttribution.
   */
  com.google.cloud.aiplatform.v1beta1.SampledShapleyAttribution getSampledShapleyAttribution();
  /**
   *
   *
   * <pre>
   * An attribution method that approximates Shapley values for features that
   * contribute to the label being predicted. A sampling strategy is used to
   * approximate the value rather than considering all subsets of features.
   * Refer to this paper for model details: https://arxiv.org/abs/1306.4265.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.SampledShapleyAttribution sampled_shapley_attribution = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.SampledShapleyAttributionOrBuilder
      getSampledShapleyAttributionOrBuilder();

  /**
   *
   *
   * <pre>
   * An attribution method that computes Aumann-Shapley values taking
   * advantage of the model's fully differentiable structure. Refer to this
   * paper for more details: https://arxiv.org/abs/1703.01365
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution integrated_gradients_attribution = 2;
   * </code>
   *
   * @return Whether the integratedGradientsAttribution field is set.
   */
  boolean hasIntegratedGradientsAttribution();
  /**
   *
   *
   * <pre>
   * An attribution method that computes Aumann-Shapley values taking
   * advantage of the model's fully differentiable structure. Refer to this
   * paper for more details: https://arxiv.org/abs/1703.01365
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution integrated_gradients_attribution = 2;
   * </code>
   *
   * @return The integratedGradientsAttribution.
   */
  com.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution
      getIntegratedGradientsAttribution();
  /**
   *
   *
   * <pre>
   * An attribution method that computes Aumann-Shapley values taking
   * advantage of the model's fully differentiable structure. Refer to this
   * paper for more details: https://arxiv.org/abs/1703.01365
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IntegratedGradientsAttribution integrated_gradients_attribution = 2;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.IntegratedGradientsAttributionOrBuilder
      getIntegratedGradientsAttributionOrBuilder();

  /**
   *
   *
   * <pre>
   * An attribution method that redistributes Integrated Gradients
   * attribution to segmented regions, taking advantage of the model's fully
   * differentiable structure. Refer to this paper for
   * more details: https://arxiv.org/abs/1906.02825
   *
   * XRAI currently performs better on natural images, like a picture of a
   * house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like
   * x-rays or quality-control cameras, use Integrated Gradients instead.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.XraiAttribution xrai_attribution = 3;</code>
   *
   * @return Whether the xraiAttribution field is set.
   */
  boolean hasXraiAttribution();
  /**
   *
   *
   * <pre>
   * An attribution method that redistributes Integrated Gradients
   * attribution to segmented regions, taking advantage of the model's fully
   * differentiable structure. Refer to this paper for
   * more details: https://arxiv.org/abs/1906.02825
   *
   * XRAI currently performs better on natural images, like a picture of a
   * house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like
   * x-rays or quality-control cameras, use Integrated Gradients instead.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.XraiAttribution xrai_attribution = 3;</code>
   *
   * @return The xraiAttribution.
   */
  com.google.cloud.aiplatform.v1beta1.XraiAttribution getXraiAttribution();
  /**
   *
   *
   * <pre>
   * An attribution method that redistributes Integrated Gradients
   * attribution to segmented regions, taking advantage of the model's fully
   * differentiable structure. Refer to this paper for
   * more details: https://arxiv.org/abs/1906.02825
   *
   * XRAI currently performs better on natural images, like a picture of a
   * house or an animal. If the images are taken in artificial environments,
   * like a lab or manufacturing line, or from diagnostic equipment, like
   * x-rays or quality-control cameras, use Integrated Gradients instead.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.XraiAttribution xrai_attribution = 3;</code>
   */
  com.google.cloud.aiplatform.v1beta1.XraiAttributionOrBuilder getXraiAttributionOrBuilder();

  /**
   *
   *
   * <pre>
   * Example-based explanations that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Examples examples = 7;</code>
   *
   * @return Whether the examples field is set.
   */
  boolean hasExamples();
  /**
   *
   *
   * <pre>
   * Example-based explanations that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Examples examples = 7;</code>
   *
   * @return The examples.
   */
  com.google.cloud.aiplatform.v1beta1.Examples getExamples();
  /**
   *
   *
   * <pre>
   * Example-based explanations that returns the nearest neighbors from the
   * provided dataset.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Examples examples = 7;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExamplesOrBuilder getExamplesOrBuilder();

  /**
   *
   *
   * <pre>
   * If populated, returns attributions for top K indices of outputs
   * (defaults to 1). Only applies to Models that predicts more than one outputs
   * (e,g, multi-class Models). When set to -1, returns explanations for all
   * outputs.
   * </pre>
   *
   * <code>int32 top_k = 4;</code>
   *
   * @return The topK.
   */
  int getTopK();

  /**
   *
   *
   * <pre>
   * If populated, only returns attributions that have
   * [output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * contained in output_indices. It must be an ndarray of integers, with the
   * same shape of the output it's explaining.
   *
   * If not populated, returns attributions for
   * [top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k]
   * indices of outputs. If neither top_k nor output_indices is populated,
   * returns the argmax index of the outputs.
   *
   * Only applicable to Models that predict multiple outputs (e,g, multi-class
   * Models that predict multiple classes).
   * </pre>
   *
   * <code>.google.protobuf.ListValue output_indices = 5;</code>
   *
   * @return Whether the outputIndices field is set.
   */
  boolean hasOutputIndices();
  /**
   *
   *
   * <pre>
   * If populated, only returns attributions that have
   * [output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * contained in output_indices. It must be an ndarray of integers, with the
   * same shape of the output it's explaining.
   *
   * If not populated, returns attributions for
   * [top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k]
   * indices of outputs. If neither top_k nor output_indices is populated,
   * returns the argmax index of the outputs.
   *
   * Only applicable to Models that predict multiple outputs (e,g, multi-class
   * Models that predict multiple classes).
   * </pre>
   *
   * <code>.google.protobuf.ListValue output_indices = 5;</code>
   *
   * @return The outputIndices.
   */
  com.google.protobuf.ListValue getOutputIndices();
  /**
   *
   *
   * <pre>
   * If populated, only returns attributions that have
   * [output_index][google.cloud.aiplatform.v1beta1.Attribution.output_index]
   * contained in output_indices. It must be an ndarray of integers, with the
   * same shape of the output it's explaining.
   *
   * If not populated, returns attributions for
   * [top_k][google.cloud.aiplatform.v1beta1.ExplanationParameters.top_k]
   * indices of outputs. If neither top_k nor output_indices is populated,
   * returns the argmax index of the outputs.
   *
   * Only applicable to Models that predict multiple outputs (e,g, multi-class
   * Models that predict multiple classes).
   * </pre>
   *
   * <code>.google.protobuf.ListValue output_indices = 5;</code>
   */
  com.google.protobuf.ListValueOrBuilder getOutputIndicesOrBuilder();

  com.google.cloud.aiplatform.v1beta1.ExplanationParameters.MethodCase getMethodCase();
}
