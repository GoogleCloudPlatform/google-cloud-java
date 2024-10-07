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
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/tabular_regression.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public interface TabularRegressionPredictionResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.predict.prediction.TabularRegressionPredictionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The regression value.
   * </pre>
   *
   * <code>float value = 1;</code>
   *
   * @return The value.
   */
  float getValue();

  /**
   *
   *
   * <pre>
   * The lower bound of the prediction interval.
   * </pre>
   *
   * <code>float lower_bound = 2;</code>
   *
   * @return The lowerBound.
   */
  float getLowerBound();

  /**
   *
   *
   * <pre>
   * The upper bound of the prediction interval.
   * </pre>
   *
   * <code>float upper_bound = 3;</code>
   *
   * @return The upperBound.
   */
  float getUpperBound();
}
