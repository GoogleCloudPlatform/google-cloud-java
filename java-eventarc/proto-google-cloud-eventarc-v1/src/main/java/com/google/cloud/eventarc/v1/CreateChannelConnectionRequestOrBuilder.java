/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/eventarc/v1/eventarc.proto

package com.google.cloud.eventarc.v1;

public interface CreateChannelConnectionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.eventarc.v1.CreateChannelConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent collection in which to add this channel connection.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent collection in which to add this channel connection.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Channel connection to create.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the channelConnection field is set.
   */
  boolean hasChannelConnection();
  /**
   *
   *
   * <pre>
   * Required. Channel connection to create.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The channelConnection.
   */
  com.google.cloud.eventarc.v1.ChannelConnection getChannelConnection();
  /**
   *
   *
   * <pre>
   * Required. Channel connection to create.
   * </pre>
   *
   * <code>
   * .google.cloud.eventarc.v1.ChannelConnection channel_connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.eventarc.v1.ChannelConnectionOrBuilder getChannelConnectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the channel connection.
   * </pre>
   *
   * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The channelConnectionId.
   */
  java.lang.String getChannelConnectionId();
  /**
   *
   *
   * <pre>
   * Required. The user-provided ID to be assigned to the channel connection.
   * </pre>
   *
   * <code>string channel_connection_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for channelConnectionId.
   */
  com.google.protobuf.ByteString getChannelConnectionIdBytes();
}
