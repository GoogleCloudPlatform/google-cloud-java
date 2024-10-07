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
// source: google/chat/v1/event_payload.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public interface MessageCreatedEventDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.MessageCreatedEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The new message.
   * </pre>
   *
   * <code>.google.chat.v1.Message message = 1;</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * The new message.
   * </pre>
   *
   * <code>.google.chat.v1.Message message = 1;</code>
   *
   * @return The message.
   */
  com.google.chat.v1.Message getMessage();
  /**
   *
   *
   * <pre>
   * The new message.
   * </pre>
   *
   * <code>.google.chat.v1.Message message = 1;</code>
   */
  com.google.chat.v1.MessageOrBuilder getMessageOrBuilder();
}
