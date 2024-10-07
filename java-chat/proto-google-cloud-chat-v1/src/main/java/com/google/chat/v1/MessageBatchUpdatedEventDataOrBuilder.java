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

public interface MessageBatchUpdatedEventDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.MessageBatchUpdatedEventData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of updated messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageUpdatedEventData messages = 1;</code>
   */
  java.util.List<com.google.chat.v1.MessageUpdatedEventData> getMessagesList();
  /**
   *
   *
   * <pre>
   * A list of updated messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageUpdatedEventData messages = 1;</code>
   */
  com.google.chat.v1.MessageUpdatedEventData getMessages(int index);
  /**
   *
   *
   * <pre>
   * A list of updated messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageUpdatedEventData messages = 1;</code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * A list of updated messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageUpdatedEventData messages = 1;</code>
   */
  java.util.List<? extends com.google.chat.v1.MessageUpdatedEventDataOrBuilder>
      getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of updated messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageUpdatedEventData messages = 1;</code>
   */
  com.google.chat.v1.MessageUpdatedEventDataOrBuilder getMessagesOrBuilder(int index);
}
