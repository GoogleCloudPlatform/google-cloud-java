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
// source: google/cloud/aiplatform/v1beta1/extension_execution_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface QueryExtensionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryExtensionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name (identifier) of the extension;
   * Format:
   * `projects/{project}/locations/{location}/extensions/{extension}`
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
   * Required. Name (identifier) of the extension;
   * Format:
   * `projects/{project}/locations/{location}/extensions/{extension}`
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
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.Content> getContentsList();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.Content getContents(int index);
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getContentsCount();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.ContentOrBuilder>
      getContentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The content of the current conversation with the model.
   *
   * For single-turn queries, this is a single instance. For multi-turn queries,
   * this is a repeated field that contains conversation history + latest
   * request.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.Content contents = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ContentOrBuilder getContentsOrBuilder(int index);
}
