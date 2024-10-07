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
// source: google/chat/v1/action_status.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public interface ActionStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.ActionStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The status code.
   * </pre>
   *
   * <code>.google.rpc.Code status_code = 1;</code>
   *
   * @return The enum numeric value on the wire for statusCode.
   */
  int getStatusCodeValue();
  /**
   *
   *
   * <pre>
   * The status code.
   * </pre>
   *
   * <code>.google.rpc.Code status_code = 1;</code>
   *
   * @return The statusCode.
   */
  com.google.rpc.Code getStatusCode();

  /**
   *
   *
   * <pre>
   * The message to send users about the status of their request.
   * If unset, a generic message based on the `status_code` is sent.
   * </pre>
   *
   * <code>string user_facing_message = 2;</code>
   *
   * @return The userFacingMessage.
   */
  java.lang.String getUserFacingMessage();
  /**
   *
   *
   * <pre>
   * The message to send users about the status of their request.
   * If unset, a generic message based on the `status_code` is sent.
   * </pre>
   *
   * <code>string user_facing_message = 2;</code>
   *
   * @return The bytes for userFacingMessage.
   */
  com.google.protobuf.ByteString getUserFacingMessageBytes();
}
