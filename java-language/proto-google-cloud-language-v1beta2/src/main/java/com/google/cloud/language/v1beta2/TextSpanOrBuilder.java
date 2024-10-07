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
// source: google/cloud/language/v1beta2/language_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.language.v1beta2;

public interface TextSpanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1beta2.TextSpan)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The content of the output text.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The content of the output text.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * The API calculates the beginning offset of the content in the original
   * document according to the
   * [EncodingType][google.cloud.language.v1beta2.EncodingType] specified in the
   * API request.
   * </pre>
   *
   * <code>int32 begin_offset = 2;</code>
   *
   * @return The beginOffset.
   */
  int getBeginOffset();
}
