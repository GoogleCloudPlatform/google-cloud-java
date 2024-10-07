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
// source: google/cloud/commerce/consumer/procurement/v1/license_management_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.commerce.consumer.procurement.v1;

public interface AssignRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.AssignRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. License pool name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. License pool name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Username.
   * Format: `name&#64;domain.com`.
   * </pre>
   *
   * <code>repeated string usernames = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the usernames.
   */
  java.util.List<java.lang.String> getUsernamesList();
  /**
   *
   *
   * <pre>
   * Required. Username.
   * Format: `name&#64;domain.com`.
   * </pre>
   *
   * <code>repeated string usernames = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of usernames.
   */
  int getUsernamesCount();
  /**
   *
   *
   * <pre>
   * Required. Username.
   * Format: `name&#64;domain.com`.
   * </pre>
   *
   * <code>repeated string usernames = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The usernames at the given index.
   */
  java.lang.String getUsernames(int index);
  /**
   *
   *
   * <pre>
   * Required. Username.
   * Format: `name&#64;domain.com`.
   * </pre>
   *
   * <code>repeated string usernames = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the usernames at the given index.
   */
  com.google.protobuf.ByteString getUsernamesBytes(int index);
}
