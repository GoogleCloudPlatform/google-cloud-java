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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface UpdateConnectionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.UpdateConnectionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name in the format:
   * `projects/{project}/locations/{location}/connections/{connection}`.
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
   * Required. Resource name in the format:
   * `projects/{project}/locations/{location}/connections/{connection}`.
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
   * Required. The connection with new values for the relevant fields.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.Connection connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connection field is set.
   */
  boolean hasConnection();
  /**
   *
   *
   * <pre>
   * Required. The connection with new values for the relevant fields.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.Connection connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connection.
   */
  com.google.privacy.dlp.v2.Connection getConnection();
  /**
   *
   *
   * <pre>
   * Required. The connection with new values for the relevant fields.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.Connection connection = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.ConnectionOrBuilder getConnectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask to control which fields get updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
