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
// source: google/cloud/alloydb/v1beta/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.alloydb.v1beta;

public interface BackupSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.BackupSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the backup which was used to
   * create this resource. The UID is generated when the backup is created, and
   * it is retained until the backup is deleted.
   * </pre>
   *
   * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The backupUid.
   */
  java.lang.String getBackupUid();
  /**
   *
   *
   * <pre>
   * Output only. The system-generated UID of the backup which was used to
   * create this resource. The UID is generated when the backup is created, and
   * it is retained until the backup is deleted.
   * </pre>
   *
   * <code>string backup_uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for backupUid.
   */
  com.google.protobuf.ByteString getBackupUidBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the backup resource with the format:
   *  * projects/{project}/locations/{region}/backups/{backup_id}
   * </pre>
   *
   * <code>
   * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backupName.
   */
  java.lang.String getBackupName();
  /**
   *
   *
   * <pre>
   * Required. The name of the backup resource with the format:
   *  * projects/{project}/locations/{region}/backups/{backup_id}
   * </pre>
   *
   * <code>
   * string backup_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backupName.
   */
  com.google.protobuf.ByteString getBackupNameBytes();
}
