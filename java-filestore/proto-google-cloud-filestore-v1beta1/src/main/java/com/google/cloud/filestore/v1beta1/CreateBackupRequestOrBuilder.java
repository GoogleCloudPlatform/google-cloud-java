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

public interface CreateBackupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.CreateBackupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The backup's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Filestore,
   * backup locations map to Google Cloud regions, for example **us-west1**.
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
   * Required. The backup's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Filestore,
   * backup locations map to Google Cloud regions, for example **us-west1**.
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
   * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backup field is set.
   */
  boolean hasBackup();
  /**
   *
   *
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backup.
   */
  com.google.cloud.filestore.v1beta1.Backup getBackup();
  /**
   *
   *
   * <pre>
   * Required. A [backup resource][google.cloud.filestore.v1beta1.Backup]
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Backup backup = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.filestore.v1beta1.BackupOrBuilder getBackupOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backup.
   * The ID must be unique within the specified project and location.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupId.
   */
  java.lang.String getBackupId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backup.
   * The ID must be unique within the specified project and location.
   *
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string backup_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupId.
   */
  com.google.protobuf.ByteString getBackupIdBytes();
}
