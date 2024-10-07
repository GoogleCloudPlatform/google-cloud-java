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
// source: google/cloud/gkebackup/v1/backup.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkebackup.v1;

public final class BackupProto {
  private BackupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Backup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/gkebackup/v1/backup.proto"
          + "\022\031google.cloud.gkebackup.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032&google/cloud/gkebackup/v1/commo"
          + "n.proto\032\037google/protobuf/timestamp.proto"
          + "\"\206\016\n\006Backup\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\020\n\003uid\030\002 "
          + "\001(\tB\003\340A\003\0224\n\013create_time\030\003 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\0224\n\013update_time\030\004 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n\006"
          + "manual\030\005 \001(\010B\003\340A\003\022B\n\006labels\030\006 \003(\0132-.goog"
          + "le.cloud.gkebackup.v1.Backup.LabelsEntry"
          + "B\003\340A\001\022\035\n\020delete_lock_days\030\007 \001(\005B\003\340A\001\022@\n\027"
          + "delete_lock_expire_time\030\010 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\022\030\n\013retain_days\030\t "
          + "\001(\005B\003\340A\001\022;\n\022retain_expire_time\030\n \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\022E\n\016encrypt"
          + "ion_key\030\013 \001(\0132(.google.cloud.gkebackup.v"
          + "1.EncryptionKeyB\003\340A\003\022\035\n\016all_namespaces\030\014"
          + " \001(\010B\003\340A\003H\000\022I\n\023selected_namespaces\030\r \001(\013"
          + "2%.google.cloud.gkebackup.v1.NamespacesB"
          + "\003\340A\003H\000\022P\n\025selected_applications\030\016 \001(\0132*."
          + "google.cloud.gkebackup.v1.NamespacedName"
          + "sB\003\340A\003H\000\022!\n\024contains_volume_data\030\017 \001(\010B\003"
          + "\340A\003\022\035\n\020contains_secrets\030\020 \001(\010B\003\340A\003\022P\n\020cl"
          + "uster_metadata\030\021 \001(\01321.google.cloud.gkeb"
          + "ackup.v1.Backup.ClusterMetadataB\003\340A\003\022;\n\005"
          + "state\030\022 \001(\0162\'.google.cloud.gkebackup.v1."
          + "Backup.StateB\003\340A\003\022\031\n\014state_reason\030\023 \001(\tB"
          + "\003\340A\003\0226\n\rcomplete_time\030\024 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\022\033\n\016resource_count\030\025"
          + " \001(\005B\003\340A\003\022\031\n\014volume_count\030\026 \001(\005B\003\340A\003\022\027\n\n"
          + "size_bytes\030\027 \001(\003B\003\340A\003\022\021\n\004etag\030\030 \001(\tB\003\340A\003"
          + "\022\030\n\013description\030\031 \001(\tB\003\340A\001\022\026\n\tpod_count\030"
          + "\032 \001(\005B\003\340A\003\022%\n\030config_backup_size_bytes\030\033"
          + " \001(\003B\003\340A\003\022\034\n\017permissive_mode\030\034 \001(\010B\003\340A\003\032"
          + "\266\002\n\017ClusterMetadata\022\024\n\007cluster\030\001 \001(\tB\003\340A"
          + "\003\022\030\n\013k8s_version\030\002 \001(\tB\003\340A\003\022j\n\023backup_cr"
          + "d_versions\030\003 \003(\0132H.google.cloud.gkebacku"
          + "p.v1.Backup.ClusterMetadata.BackupCrdVer"
          + "sionsEntryB\003\340A\003\022\032\n\013gke_version\030\004 \001(\tB\003\340A"
          + "\003H\000\022\035\n\016anthos_version\030\005 \001(\tB\003\340A\003H\000\0328\n\026Ba"
          + "ckupCrdVersionsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005val"
          + "ue\030\002 \001(\t:\0028\001B\022\n\020platform_version\032-\n\013Labe"
          + "lsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\""
          + "f\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010CREAT"
          + "ING\020\001\022\017\n\013IN_PROGRESS\020\002\022\r\n\tSUCCEEDED\020\003\022\n\n"
          + "\006FAILED\020\004\022\014\n\010DELETING\020\005:x\352Au\n\037gkebackup."
          + "googleapis.com/Backup\022Rprojects/{project"
          + "}/locations/{location}/backupPlans/{back"
          + "up_plan}/backups/{backup}B\016\n\014backup_scop"
          + "eB\302\001\n\035com.google.cloud.gkebackup.v1B\013Bac"
          + "kupProtoP\001Z;cloud.google.com/go/gkebacku"
          + "p/apiv1/gkebackuppb;gkebackuppb\252\002\031Google"
          + ".Cloud.GkeBackup.V1\312\002\031Google\\Cloud\\GkeBa"
          + "ckup\\V1\352\002\034Google::Cloud::GkeBackup::V1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.gkebackup.v1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_Backup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Backup_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "CreateTime",
              "UpdateTime",
              "Manual",
              "Labels",
              "DeleteLockDays",
              "DeleteLockExpireTime",
              "RetainDays",
              "RetainExpireTime",
              "EncryptionKey",
              "AllNamespaces",
              "SelectedNamespaces",
              "SelectedApplications",
              "ContainsVolumeData",
              "ContainsSecrets",
              "ClusterMetadata",
              "State",
              "StateReason",
              "CompleteTime",
              "ResourceCount",
              "VolumeCount",
              "SizeBytes",
              "Etag",
              "Description",
              "PodCount",
              "ConfigBackupSizeBytes",
              "PermissiveMode",
              "BackupScope",
            });
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor =
        internal_static_google_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor,
            new java.lang.String[] {
              "Cluster",
              "K8SVersion",
              "BackupCrdVersions",
              "GkeVersion",
              "AnthosVersion",
              "PlatformVersion",
            });
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor =
        internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Backup_ClusterMetadata_BackupCrdVersionsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor =
        internal_static_google_cloud_gkebackup_v1_Backup_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Backup_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.gkebackup.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
