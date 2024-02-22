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
// source: google/cloud/aiplatform/v1/model_garden_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface GetPublisherModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.GetPublisherModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the PublisherModel resource.
   * Format:
   * `publishers/{publisher}/models/{publisher_model}`
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
   * Required. The name of the PublisherModel resource.
   * Format:
   * `publishers/{publisher}/models/{publisher_model}`
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
   * Optional. The IETF BCP-47 language code representing the language in which
   * the publisher model's text information should be written in (see go/bcp47).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The IETF BCP-47 language code representing the language in which
   * the publisher model's text information should be written in (see go/bcp47).
   * </pre>
   *
   * <code>string language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. PublisherModel view specifying which fields to read.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PublisherModelView view = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Optional. PublisherModel view specifying which fields to read.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PublisherModelView view = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The view.
   */
  com.google.cloud.aiplatform.v1.PublisherModelView getView();
}
