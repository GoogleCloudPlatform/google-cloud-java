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
// source: google/cloud/netapp/v1/backup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the backup.
   * Format:
   * `projects/{project_id}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}`.
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
   * Identifier. The resource name of the backup.
   * Format:
   * `projects/{project_id}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}`.
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
   * Output only. The backup state.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Backup.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The backup state.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Backup.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.netapp.v1.Backup.State getState();

  /**
   *
   *
   * <pre>
   * A description of the backup with 2048 characters or less.
   * Requests with longer descriptions will be rejected.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of the backup with 2048 characters or less.
   * Requests with longer descriptions will be rejected.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Size of the file system when the backup was created. When
   * creating a new volume from the backup, the volume capacity will have to be
   * at least as big.
   * </pre>
   *
   * <code>int64 volume_usage_bytes = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The volumeUsageBytes.
   */
  long getVolumeUsageBytes();

  /**
   *
   *
   * <pre>
   * Output only. Type of backup, manually created or created by a backup
   * policy.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Backup.Type backup_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for backupType.
   */
  int getBackupTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. Type of backup, manually created or created by a backup
   * policy.
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.Backup.Type backup_type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The backupType.
   */
  com.google.cloud.netapp.v1.Backup.Type getBackupType();

  /**
   *
   *
   * <pre>
   * Volume full name of this backup belongs to.
   * Format:
   * `projects/{projects_id}/locations/{location}/volumes/{volume_id}`
   * </pre>
   *
   * <code>string source_volume = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sourceVolume.
   */
  java.lang.String getSourceVolume();
  /**
   *
   *
   * <pre>
   * Volume full name of this backup belongs to.
   * Format:
   * `projects/{projects_id}/locations/{location}/volumes/{volume_id}`
   * </pre>
   *
   * <code>string source_volume = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sourceVolume.
   */
  com.google.protobuf.ByteString getSourceVolumeBytes();

  /**
   *
   *
   * <pre>
   * If specified, backup will be created from the given snapshot.
   * If not specified, there will be a new snapshot taken to initiate the backup
   * creation. Format:
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>optional string source_snapshot = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the sourceSnapshot field is set.
   */
  boolean hasSourceSnapshot();
  /**
   *
   *
   * <pre>
   * If specified, backup will be created from the given snapshot.
   * If not specified, there will be a new snapshot taken to initiate the backup
   * creation. Format:
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>optional string source_snapshot = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sourceSnapshot.
   */
  java.lang.String getSourceSnapshot();
  /**
   *
   *
   * <pre>
   * If specified, backup will be created from the given snapshot.
   * If not specified, there will be a new snapshot taken to initiate the backup
   * creation. Format:
   * `projects/{project_id}/locations/{location}/volumes/{volume_id}/snapshots/{snapshot_id}`
   * </pre>
   *
   * <code>optional string source_snapshot = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sourceSnapshot.
   */
  com.google.protobuf.ByteString getSourceSnapshotBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Total size of all backups in a chain in bytes = baseline
   * backup size + sum(incremental backup size)
   * </pre>
   *
   * <code>int64 chain_storage_bytes = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The chainStorageBytes.
   */
  long getChainStorageBytes();
}
