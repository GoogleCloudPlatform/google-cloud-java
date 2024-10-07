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
// source: google/cloud/visionai/v1/streaming_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface PacketTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.PacketType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The type class of the packet. Its possible values are:
   * "gst", "protobuf", and "string".
   * </pre>
   *
   * <code>string type_class = 1;</code>
   *
   * @return The typeClass.
   */
  java.lang.String getTypeClass();
  /**
   *
   *
   * <pre>
   * The type class of the packet. Its possible values are:
   * "gst", "protobuf", and "string".
   * </pre>
   *
   * <code>string type_class = 1;</code>
   *
   * @return The bytes for typeClass.
   */
  com.google.protobuf.ByteString getTypeClassBytes();

  /**
   *
   *
   * <pre>
   * The type descriptor.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.PacketType.TypeDescriptor type_descriptor = 2;</code>
   *
   * @return Whether the typeDescriptor field is set.
   */
  boolean hasTypeDescriptor();
  /**
   *
   *
   * <pre>
   * The type descriptor.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.PacketType.TypeDescriptor type_descriptor = 2;</code>
   *
   * @return The typeDescriptor.
   */
  com.google.cloud.visionai.v1.PacketType.TypeDescriptor getTypeDescriptor();
  /**
   *
   *
   * <pre>
   * The type descriptor.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.PacketType.TypeDescriptor type_descriptor = 2;</code>
   */
  com.google.cloud.visionai.v1.PacketType.TypeDescriptorOrBuilder getTypeDescriptorOrBuilder();
}
