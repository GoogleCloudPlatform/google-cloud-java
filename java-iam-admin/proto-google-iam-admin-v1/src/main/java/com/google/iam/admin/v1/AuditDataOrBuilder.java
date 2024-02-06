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
// source: google/iam/admin/v1/audit_data.proto

// Protobuf Java Version: 3.25.2
package com.google.iam.admin.v1;

public interface AuditDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.AuditData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The permission_delta when when creating or updating a Role.
   * </pre>
   *
   * <code>.google.iam.admin.v1.AuditData.PermissionDelta permission_delta = 1;</code>
   *
   * @return Whether the permissionDelta field is set.
   */
  boolean hasPermissionDelta();
  /**
   *
   *
   * <pre>
   * The permission_delta when when creating or updating a Role.
   * </pre>
   *
   * <code>.google.iam.admin.v1.AuditData.PermissionDelta permission_delta = 1;</code>
   *
   * @return The permissionDelta.
   */
  com.google.iam.admin.v1.AuditData.PermissionDelta getPermissionDelta();
  /**
   *
   *
   * <pre>
   * The permission_delta when when creating or updating a Role.
   * </pre>
   *
   * <code>.google.iam.admin.v1.AuditData.PermissionDelta permission_delta = 1;</code>
   */
  com.google.iam.admin.v1.AuditData.PermissionDeltaOrBuilder getPermissionDeltaOrBuilder();
}
