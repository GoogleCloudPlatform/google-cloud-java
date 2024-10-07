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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.filestore.v1beta1;

public interface UpdateShareRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.UpdateShareRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A share resource.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share share = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the share field is set.
   */
  boolean hasShare();
  /**
   *
   *
   * <pre>
   * Required. A share resource.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share share = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The share.
   */
  com.google.cloud.filestore.v1beta1.Share getShare();
  /**
   *
   *
   * <pre>
   * Required. A share resource.
   * Only fields specified in update_mask are updated.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share share = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.filestore.v1beta1.ShareOrBuilder getShareOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field may only include these
   * fields:
   *
   * * "description"
   * * "capacity_gb"
   * * "labels"
   * * "nfs_export_options"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field may only include these
   * fields:
   *
   * * "description"
   * * "capacity_gb"
   * * "labels"
   * * "nfs_export_options"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field may only include these
   * fields:
   *
   * * "description"
   * * "capacity_gb"
   * * "labels"
   * * "nfs_export_options"
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
