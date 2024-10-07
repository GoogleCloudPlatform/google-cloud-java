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
// source: google/cloud/translate/v3/translation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.translate.v3;

public interface RomanizeTextRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.RomanizeTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}` or
   * `projects/{project-number-or-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   * </pre>
   *
   * <code>
   * string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Project or location to make a call. Must refer to a caller's
   * project.
   *
   * Format: `projects/{project-number-or-id}/locations/{location-id}` or
   * `projects/{project-number-or-id}`.
   *
   * For global calls, use `projects/{project-number-or-id}/locations/global` or
   * `projects/{project-number-or-id}`.
   * </pre>
   *
   * <code>
   * string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the contents.
   */
  java.util.List<java.lang.String> getContentsList();
  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of contents.
   */
  int getContentsCount();
  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The contents at the given index.
   */
  java.lang.String getContents(int index);
  /**
   *
   *
   * <pre>
   * Required. The content of the input in string format.
   * </pre>
   *
   * <code>repeated string contents = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the contents at the given index.
   */
  com.google.protobuf.ByteString getContentsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The ISO-639 language code of the input text if
   * known, for example, "hi" or "zh". If the source language isn't specified,
   * the API attempts to identify the source language automatically and returns
   * the source language for each content in the response.
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sourceLanguageCode.
   */
  java.lang.String getSourceLanguageCode();
  /**
   *
   *
   * <pre>
   * Optional. The ISO-639 language code of the input text if
   * known, for example, "hi" or "zh". If the source language isn't specified,
   * the API attempts to identify the source language automatically and returns
   * the source language for each content in the response.
   * </pre>
   *
   * <code>string source_language_code = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for sourceLanguageCode.
   */
  com.google.protobuf.ByteString getSourceLanguageCodeBytes();
}
