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
// source: google/ads/admanager/v1/role_messages.proto

// Protobuf Java Version: 3.25.5
package com.google.ads.admanager.v1;

public interface RoleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.ads.admanager.v1.Role)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the `Role`.
   * Format: `networks/{network_code}/roles/{role_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the `Role`.
   * Format: `networks/{network_code}/roles/{role_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. `Role` ID.
   * </pre>
   *
   * <code>int64 role_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The roleId.
   */
  long getRoleId();

  /**
   *
   *
   * <pre>
   * Required. The display name of the `Role`.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the `Role`.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description of the `Role`.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description of the `Role`.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Whether the `Role` is a built-in or custom user role.
   * </pre>
   *
   * <code>bool built_in = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The builtIn.
   */
  boolean getBuiltIn();

  /**
   *
   *
   * <pre>
   * Output only. The status of the `Role`.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.RoleStatusEnum.RoleStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   *
   *
   * <pre>
   * Output only. The status of the `Role`.
   * </pre>
   *
   * <code>
   * .google.ads.admanager.v1.RoleStatusEnum.RoleStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The status.
   */
  com.google.ads.admanager.v1.RoleStatusEnum.RoleStatus getStatus();
}
