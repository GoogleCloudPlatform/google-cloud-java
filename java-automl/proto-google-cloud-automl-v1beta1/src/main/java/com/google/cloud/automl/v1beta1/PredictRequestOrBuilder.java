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
// source: google/cloud/automl/v1beta1/prediction_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1beta1;

public interface PredictRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.PredictRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the model requested to serve the prediction.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Name of the model requested to serve the prediction.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Payload to perform a prediction on. The payload must match the
   * problem type that the model was trained to solve.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ExamplePayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Required. Payload to perform a prediction on. The payload must match the
   * problem type that the model was trained to solve.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ExamplePayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The payload.
   */
  com.google.cloud.automl.v1beta1.ExamplePayload getPayload();
  /**
   *
   *
   * <pre>
   * Required. Payload to perform a prediction on. The payload must match the
   * problem type that the model was trained to solve.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ExamplePayload payload = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.automl.v1beta1.ExamplePayloadOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   *
   * *  For Image Classification:
   *
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *     makes predictions for an image, it will only produce results that have
   *     at least this confidence score. The default is 0.5.
   *
   *  *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned in the response. Default is 100, the
   *        requested value may be limited by server.
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotation.
   *        The default is false.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   *
   * *  For Image Classification:
   *
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *     makes predictions for an image, it will only produce results that have
   *     at least this confidence score. The default is 0.5.
   *
   *  *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned in the response. Default is 100, the
   *        requested value may be limited by server.
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotation.
   *        The default is false.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParams();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   *
   * *  For Image Classification:
   *
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *     makes predictions for an image, it will only produce results that have
   *     at least this confidence score. The default is 0.5.
   *
   *  *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned in the response. Default is 100, the
   *        requested value may be limited by server.
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotation.
   *        The default is false.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   *
   * *  For Image Classification:
   *
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *     makes predictions for an image, it will only produce results that have
   *     at least this confidence score. The default is 0.5.
   *
   *  *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned in the response. Default is 100, the
   *        requested value may be limited by server.
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotation.
   *        The default is false.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  /* nullable */
  java.lang.String getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters, any string must be up to 25000
   * characters long.
   *
   * *  For Image Classification:
   *
   *    `score_threshold` - (float) A value from 0.0 to 1.0. When the model
   *     makes predictions for an image, it will only produce results that have
   *     at least this confidence score. The default is 0.5.
   *
   *  *  For Image Object Detection:
   *    `score_threshold` - (float) When Model detects objects on the image,
   *        it will only produce bounding boxes which have at least this
   *        confidence score. Value in 0 to 1 range, default is 0.5.
   *    `max_bounding_box_count` - (int64) No more than this number of bounding
   *        boxes will be returned in the response. Default is 100, the
   *        requested value may be limited by server.
   * *  For Tables:
   *    feature_imp&lt;span&gt;ortan&lt;/span&gt;ce - (boolean) Whether feature importance
   *        should be populated in the returned TablesAnnotation.
   *        The default is false.
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 3;</code>
   */
  java.lang.String getParamsOrThrow(java.lang.String key);
}
