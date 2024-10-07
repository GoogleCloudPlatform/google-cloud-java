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
// source: google/cloud/aiplatform/v1/prediction_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface StreamingRawPredictRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.StreamingRawPredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint requested to serve the prediction.
   * Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified name of the API method being invoked to perform
   * predictions.
   *
   * Format:
   * `/namespace.Service/Method/`
   * Example:
   * `/tensorflow.serving.PredictionService/Predict`
   * </pre>
   *
   * <code>string method_name = 2;</code>
   *
   * @return The methodName.
   */
  java.lang.String getMethodName();
  /**
   *
   *
   * <pre>
   * Fully qualified name of the API method being invoked to perform
   * predictions.
   *
   * Format:
   * `/namespace.Service/Method/`
   * Example:
   * `/tensorflow.serving.PredictionService/Predict`
   * </pre>
   *
   * <code>string method_name = 2;</code>
   *
   * @return The bytes for methodName.
   */
  com.google.protobuf.ByteString getMethodNameBytes();

  /**
   *
   *
   * <pre>
   * The prediction input.
   * </pre>
   *
   * <code>bytes input = 3;</code>
   *
   * @return The input.
   */
  com.google.protobuf.ByteString getInput();
}
