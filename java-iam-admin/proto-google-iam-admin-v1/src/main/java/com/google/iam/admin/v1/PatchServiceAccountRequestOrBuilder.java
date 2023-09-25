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
// source: google/iam/admin/v1/iam.proto

package com.google.iam.admin.v1;

public interface PatchServiceAccountRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.iam.admin.v1.PatchServiceAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code>
   *
   * @return Whether the serviceAccount field is set.
   */
  boolean hasServiceAccount();
  /**
   * <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code>
   *
   * @return The serviceAccount.
   */
  com.google.iam.admin.v1.ServiceAccount getServiceAccount();
  /** <code>.google.iam.admin.v1.ServiceAccount service_account = 1;</code> */
  com.google.iam.admin.v1.ServiceAccountOrBuilder getServiceAccountOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /** <code>.google.protobuf.FieldMask update_mask = 2;</code> */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
