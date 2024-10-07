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
// source: google/cloud/gkebackup/v1/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkebackup.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_Namespaces_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_Namespaces_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_NamespacedName_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_NamespacedName_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_EncryptionKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_EncryptionKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_gkebackup_v1_VolumeTypeEnum_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_gkebackup_v1_VolumeTypeEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/gkebackup/v1/common.proto"
          + "\022\031google.cloud.gkebackup.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\"%\n\nNamespaces\022\027\n\nnamespaces\030\001 \003("
          + "\tB\003\340A\001\";\n\016NamespacedName\022\026\n\tnamespace\030\001 "
          + "\001(\tB\003\340A\001\022\021\n\004name\030\002 \001(\tB\003\340A\001\"[\n\017Namespace"
          + "dNames\022H\n\020namespaced_names\030\001 \003(\0132).googl"
          + "e.cloud.gkebackup.v1.NamespacedNameB\003\340A\001"
          + "\"Z\n\rEncryptionKey\022I\n\026gcp_kms_encryption_"
          + "key\030\001 \001(\tB)\340A\001\372A#\n!cloudkms.googleapis.c"
          + "om/CryptoKey\"T\n\016VolumeTypeEnum\"B\n\nVolume"
          + "Type\022\033\n\027VOLUME_TYPE_UNSPECIFIED\020\000\022\027\n\023GCE"
          + "_PERSISTENT_DISK\020\001B\302\001\n\035com.google.cloud."
          + "gkebackup.v1B\013CommonProtoP\001Z;cloud.googl"
          + "e.com/go/gkebackup/apiv1/gkebackuppb;gke"
          + "backuppb\252\002\031Google.Cloud.GkeBackup.V1\312\002\031G"
          + "oogle\\Cloud\\GkeBackup\\V1\352\002\034Google::Cloud"
          + "::GkeBackup::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_gkebackup_v1_Namespaces_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_gkebackup_v1_Namespaces_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_Namespaces_descriptor,
            new java.lang.String[] {
              "Namespaces",
            });
    internal_static_google_cloud_gkebackup_v1_NamespacedName_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_gkebackup_v1_NamespacedName_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_NamespacedName_descriptor,
            new java.lang.String[] {
              "Namespace", "Name",
            });
    internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_gkebackup_v1_NamespacedNames_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_NamespacedNames_descriptor,
            new java.lang.String[] {
              "NamespacedNames",
            });
    internal_static_google_cloud_gkebackup_v1_EncryptionKey_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_gkebackup_v1_EncryptionKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_EncryptionKey_descriptor,
            new java.lang.String[] {
              "GcpKmsEncryptionKey",
            });
    internal_static_google_cloud_gkebackup_v1_VolumeTypeEnum_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_gkebackup_v1_VolumeTypeEnum_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_gkebackup_v1_VolumeTypeEnum_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
