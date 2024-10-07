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
// source: google/cloud/aiplatform/v1/explanation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface SmoothGradConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SmoothGradConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This is a single float value and will be used to add noise to all the
   * features. Use this field when all features are normalized to have the
   * same distribution: scale to range [0, 1], [-1, 1] or z-scoring, where
   * features are normalized to have 0-mean and 1-variance. Learn more about
   * [normalization](https://developers.google.com/machine-learning/data-prep/transform/normalization).
   *
   * For best results the recommended value is about 10% - 20% of the standard
   * deviation of the input feature. Refer to section 3.2 of the SmoothGrad
   * paper: https://arxiv.org/pdf/1706.03825.pdf. Defaults to 0.1.
   *
   * If the distribution is different per feature, set
   * [feature_noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.feature_noise_sigma]
   * instead for each feature.
   * </pre>
   *
   * <code>float noise_sigma = 1;</code>
   *
   * @return Whether the noiseSigma field is set.
   */
  boolean hasNoiseSigma();
  /**
   *
   *
   * <pre>
   * This is a single float value and will be used to add noise to all the
   * features. Use this field when all features are normalized to have the
   * same distribution: scale to range [0, 1], [-1, 1] or z-scoring, where
   * features are normalized to have 0-mean and 1-variance. Learn more about
   * [normalization](https://developers.google.com/machine-learning/data-prep/transform/normalization).
   *
   * For best results the recommended value is about 10% - 20% of the standard
   * deviation of the input feature. Refer to section 3.2 of the SmoothGrad
   * paper: https://arxiv.org/pdf/1706.03825.pdf. Defaults to 0.1.
   *
   * If the distribution is different per feature, set
   * [feature_noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.feature_noise_sigma]
   * instead for each feature.
   * </pre>
   *
   * <code>float noise_sigma = 1;</code>
   *
   * @return The noiseSigma.
   */
  float getNoiseSigma();

  /**
   *
   *
   * <pre>
   * This is similar to
   * [noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.noise_sigma],
   * but provides additional flexibility. A separate noise sigma can be
   * provided for each feature, which is useful if their distributions are
   * different. No noise is added to features that are not set. If this field
   * is unset,
   * [noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.noise_sigma]
   * will be used for all features.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureNoiseSigma feature_noise_sigma = 2;</code>
   *
   * @return Whether the featureNoiseSigma field is set.
   */
  boolean hasFeatureNoiseSigma();
  /**
   *
   *
   * <pre>
   * This is similar to
   * [noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.noise_sigma],
   * but provides additional flexibility. A separate noise sigma can be
   * provided for each feature, which is useful if their distributions are
   * different. No noise is added to features that are not set. If this field
   * is unset,
   * [noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.noise_sigma]
   * will be used for all features.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureNoiseSigma feature_noise_sigma = 2;</code>
   *
   * @return The featureNoiseSigma.
   */
  com.google.cloud.aiplatform.v1.FeatureNoiseSigma getFeatureNoiseSigma();
  /**
   *
   *
   * <pre>
   * This is similar to
   * [noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.noise_sigma],
   * but provides additional flexibility. A separate noise sigma can be
   * provided for each feature, which is useful if their distributions are
   * different. No noise is added to features that are not set. If this field
   * is unset,
   * [noise_sigma][google.cloud.aiplatform.v1.SmoothGradConfig.noise_sigma]
   * will be used for all features.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.FeatureNoiseSigma feature_noise_sigma = 2;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureNoiseSigmaOrBuilder getFeatureNoiseSigmaOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of gradient samples to use for
   * approximation. The higher this number, the more accurate the gradient
   * is, but the runtime complexity increases by this factor as well.
   * Valid range of its value is [1, 50]. Defaults to 3.
   * </pre>
   *
   * <code>int32 noisy_sample_count = 3;</code>
   *
   * @return The noisySampleCount.
   */
  int getNoisySampleCount();

  com.google.cloud.aiplatform.v1.SmoothGradConfig.GradientNoiseSigmaCase
      getGradientNoiseSigmaCase();
}
