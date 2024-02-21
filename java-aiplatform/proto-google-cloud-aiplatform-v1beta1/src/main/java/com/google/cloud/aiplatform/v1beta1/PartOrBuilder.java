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
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface PartOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Part)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Text part (can be code).
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   *
   *
   * <pre>
   * Optional. Text part (can be code).
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The text.
   */
  java.lang.String getText();
  /**
   *
   *
   * <pre>
   * Optional. Text part (can be code).
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString getTextBytes();

  /**
   *
   *
   * <pre>
   * Optional. Inlined bytes data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Blob inline_data = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the inlineData field is set.
   */
  boolean hasInlineData();
  /**
   *
   *
   * <pre>
   * Optional. Inlined bytes data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Blob inline_data = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The inlineData.
   */
  com.google.cloud.aiplatform.v1beta1.Blob getInlineData();
  /**
   *
   *
   * <pre>
   * Optional. Inlined bytes data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Blob inline_data = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.BlobOrBuilder getInlineDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. URI based data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FileData file_data = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the fileData field is set.
   */
  boolean hasFileData();
  /**
   *
   *
   * <pre>
   * Optional. URI based data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FileData file_data = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fileData.
   */
  com.google.cloud.aiplatform.v1beta1.FileData getFileData();
  /**
   *
   *
   * <pre>
   * Optional. URI based data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FileData file_data = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FileDataOrBuilder getFileDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A predicted [FunctionCall] returned from the model that
   * contains a string representing the [FunctionDeclaration.name] with the
   * parameters and their values.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionCall function_call = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the functionCall field is set.
   */
  boolean hasFunctionCall();
  /**
   *
   *
   * <pre>
   * Optional. A predicted [FunctionCall] returned from the model that
   * contains a string representing the [FunctionDeclaration.name] with the
   * parameters and their values.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionCall function_call = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The functionCall.
   */
  com.google.cloud.aiplatform.v1beta1.FunctionCall getFunctionCall();
  /**
   *
   *
   * <pre>
   * Optional. A predicted [FunctionCall] returned from the model that
   * contains a string representing the [FunctionDeclaration.name] with the
   * parameters and their values.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionCall function_call = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FunctionCallOrBuilder getFunctionCallOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The result output of a [FunctionCall] that contains a string
   * representing the [FunctionDeclaration.name] and a structured JSON object
   * containing any output from the function call. It is used as context to
   * the model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionResponse function_response = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the functionResponse field is set.
   */
  boolean hasFunctionResponse();
  /**
   *
   *
   * <pre>
   * Optional. The result output of a [FunctionCall] that contains a string
   * representing the [FunctionDeclaration.name] and a structured JSON object
   * containing any output from the function call. It is used as context to
   * the model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionResponse function_response = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The functionResponse.
   */
  com.google.cloud.aiplatform.v1beta1.FunctionResponse getFunctionResponse();
  /**
   *
   *
   * <pre>
   * Optional. The result output of a [FunctionCall] that contains a string
   * representing the [FunctionDeclaration.name] and a structured JSON object
   * containing any output from the function call. It is used as context to
   * the model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.FunctionResponse function_response = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.FunctionResponseOrBuilder getFunctionResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Video metadata. The metadata should only be specified while the
   * video data is presented in inline_data or file_data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.VideoMetadata video_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the videoMetadata field is set.
   */
  boolean hasVideoMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Video metadata. The metadata should only be specified while the
   * video data is presented in inline_data or file_data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.VideoMetadata video_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The videoMetadata.
   */
  com.google.cloud.aiplatform.v1beta1.VideoMetadata getVideoMetadata();
  /**
   *
   *
   * <pre>
   * Optional. Video metadata. The metadata should only be specified while the
   * video data is presented in inline_data or file_data.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.VideoMetadata video_metadata = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.VideoMetadataOrBuilder getVideoMetadataOrBuilder();

  com.google.cloud.aiplatform.v1beta1.Part.DataCase getDataCase();

  com.google.cloud.aiplatform.v1beta1.Part.MetadataCase getMetadataCase();
}
