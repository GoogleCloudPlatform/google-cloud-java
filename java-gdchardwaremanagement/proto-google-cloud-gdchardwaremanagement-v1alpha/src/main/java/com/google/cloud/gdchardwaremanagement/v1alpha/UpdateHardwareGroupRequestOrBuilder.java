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
// source: google/cloud/gdchardwaremanagement/v1alpha/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface UpdateHardwareGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.UpdateHardwareGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A mask to specify the fields in the HardwareGroup to overwrite
   * with this update. The fields specified in the update_mask are relative to
   * the hardware group, not the full request. A field will be overwritten if it
   * is in the mask. If you don't provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. A mask to specify the fields in the HardwareGroup to overwrite
   * with this update. The fields specified in the update_mask are relative to
   * the hardware group, not the full request. A field will be overwritten if it
   * is in the mask. If you don't provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. A mask to specify the fields in the HardwareGroup to overwrite
   * with this update. The fields specified in the update_mask are relative to
   * the hardware group, not the full request. A field will be overwritten if it
   * is in the mask. If you don't provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The hardware group to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup hardware_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the hardwareGroup field is set.
   */
  boolean hasHardwareGroup();
  /**
   *
   *
   * <pre>
   * Required. The hardware group to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup hardware_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The hardwareGroup.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup getHardwareGroup();
  /**
   *
   *
   * <pre>
   * Required. The hardware group to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareGroup hardware_group = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.HardwareGroupOrBuilder getHardwareGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional unique identifier for this request. See
   * [AIP-155](https://google.aip.dev/155).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional unique identifier for this request. See
   * [AIP-155](https://google.aip.dev/155).
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
