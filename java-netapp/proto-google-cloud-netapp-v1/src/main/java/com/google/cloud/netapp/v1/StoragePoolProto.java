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
// source: google/cloud/netapp/v1/storage_pool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.netapp.v1;

public final class StoragePoolProto {
  private StoragePoolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_SwitchActiveReplicaZoneRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_SwitchActiveReplicaZoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_StoragePool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_StoragePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/netapp/v1/storage_pool.pr"
          + "oto\022\026google.cloud.netapp.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032#google/cloud/netapp/v1/common.p"
          + "roto\032 google/protobuf/field_mask.proto\032\037"
          + "google/protobuf/timestamp.proto\"P\n\025GetSt"
          + "oragePoolRequest\0227\n\004name\030\001 \001(\tB)\340A\002\372A#\n!"
          + "netapp.googleapis.com/StoragePool\"\261\001\n\027Li"
          + "stStoragePoolsRequest\0229\n\006parent\030\001 \001(\tB)\340"
          + "A\002\372A#\022!netapp.googleapis.com/StoragePool"
          + "\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003"
          + " \001(\tB\003\340A\001\022\025\n\010order_by\030\004 \001(\tB\003\340A\001\022\023\n\006filt"
          + "er\030\005 \001(\tB\003\340A\001\"\204\001\n\030ListStoragePoolsRespon"
          + "se\022:\n\rstorage_pools\030\001 \003(\0132#.google.cloud"
          + ".netapp.v1.StoragePool\022\027\n\017next_page_toke"
          + "n\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"\263\001\n\030CreateS"
          + "toragePoolRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A"
          + "#\022!netapp.googleapis.com/StoragePool\022\034\n\017"
          + "storage_pool_id\030\002 \001(\tB\003\340A\002\022>\n\014storage_po"
          + "ol\030\003 \001(\0132#.google.cloud.netapp.v1.Storag"
          + "ePoolB\003\340A\002\"\220\001\n\030UpdateStoragePoolRequest\022"
          + "4\n\013update_mask\030\001 \001(\0132\032.google.protobuf.F"
          + "ieldMaskB\003\340A\002\022>\n\014storage_pool\030\002 \001(\0132#.go"
          + "ogle.cloud.netapp.v1.StoragePoolB\003\340A\002\"S\n"
          + "\030DeleteStoragePoolRequest\0227\n\004name\030\001 \001(\tB"
          + ")\340A\002\372A#\n!netapp.googleapis.com/StoragePo"
          + "ol\"Y\n\036SwitchActiveReplicaZoneRequest\0227\n\004"
          + "name\030\001 \001(\tB)\340A\002\372A#\n!netapp.googleapis.co"
          + "m/StoragePool\"\252\t\n\013StoragePool\022\021\n\004name\030\001 "
          + "\001(\tB\003\340A\010\022@\n\rservice_level\030\002 \001(\0162$.google"
          + ".cloud.netapp.v1.ServiceLevelB\003\340A\002\022\031\n\014ca"
          + "pacity_gib\030\003 \001(\003B\003\340A\002\022 \n\023volume_capacity"
          + "_gib\030\004 \001(\003B\003\340A\003\022\031\n\014volume_count\030\005 \001(\005B\003\340"
          + "A\003\022=\n\005state\030\006 \001(\0162).google.cloud.netapp."
          + "v1.StoragePool.StateB\003\340A\003\022\032\n\rstate_detai"
          + "ls\030\007 \001(\tB\003\340A\003\0224\n\013create_time\030\010 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\022\030\n\013descripti"
          + "on\030\t \001(\tB\003\340A\001\022D\n\006labels\030\n \003(\0132/.google.c"
          + "loud.netapp.v1.StoragePool.LabelsEntryB\003"
          + "\340A\001\0227\n\007network\030\013 \001(\tB&\340A\002\372A \n\036compute.go"
          + "ogleapis.com/Network\022G\n\020active_directory"
          + "\030\014 \001(\tB-\340A\001\372A\'\n%netapp.googleapis.com/Ac"
          + "tiveDirectory\022;\n\nkms_config\030\r \001(\tB\'\340A\001\372A"
          + "!\n\037netapp.googleapis.com/KmsConfig\022\031\n\014ld"
          + "ap_enabled\030\016 \001(\010B\003\340A\001\022\026\n\tpsa_range\030\017 \001(\t"
          + "B\003\340A\001\022D\n\017encryption_type\030\020 \001(\0162&.google."
          + "cloud.netapp.v1.EncryptionTypeB\003\340A\003\022&\n\025g"
          + "lobal_access_allowed\030\021 \001(\010B\002\030\001H\000\210\001\001\022\037\n\022a"
          + "llow_auto_tiering\030\022 \001(\010B\003\340A\001\022\031\n\014replica_"
          + "zone\030\024 \001(\tB\003\340A\001\022\021\n\004zone\030\025 \001(\tB\003\340A\001\032-\n\013La"
          + "belsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"{\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\t\n\005REA"
          + "DY\020\001\022\014\n\010CREATING\020\002\022\014\n\010DELETING\020\003\022\014\n\010UPDA"
          + "TING\020\004\022\r\n\tRESTORING\020\005\022\014\n\010DISABLED\020\006\022\t\n\005E"
          + "RROR\020\007:\207\001\352A\203\001\n!netapp.googleapis.com/Sto"
          + "ragePool\022Cprojects/{project}/locations/{"
          + "location}/storagePools/{storage_pool}*\014s"
          + "toragePools2\013storagePoolB\030\n\026_global_acce"
          + "ss_allowedB\262\001\n\032com.google.cloud.netapp.v"
          + "1B\020StoragePoolProtoP\001Z2cloud.google.com/"
          + "go/netapp/apiv1/netapppb;netapppb\252\002\026Goog"
          + "le.Cloud.NetApp.V1\312\002\026Google\\Cloud\\NetApp"
          + "\\V1\352\002\031Google::Cloud::NetApp::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.netapp.v1.CommonProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_GetStoragePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListStoragePoolsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "OrderBy", "Filter",
            });
    internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_ListStoragePoolsResponse_descriptor,
            new java.lang.String[] {
              "StoragePools", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_CreateStoragePoolRequest_descriptor,
            new java.lang.String[] {
              "Parent", "StoragePoolId", "StoragePool",
            });
    internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_UpdateStoragePoolRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "StoragePool",
            });
    internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_DeleteStoragePoolRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_SwitchActiveReplicaZoneRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_netapp_v1_SwitchActiveReplicaZoneRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_SwitchActiveReplicaZoneRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_netapp_v1_StoragePool_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_netapp_v1_StoragePool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_StoragePool_descriptor,
            new java.lang.String[] {
              "Name",
              "ServiceLevel",
              "CapacityGib",
              "VolumeCapacityGib",
              "VolumeCount",
              "State",
              "StateDetails",
              "CreateTime",
              "Description",
              "Labels",
              "Network",
              "ActiveDirectory",
              "KmsConfig",
              "LdapEnabled",
              "PsaRange",
              "EncryptionType",
              "GlobalAccessAllowed",
              "AllowAutoTiering",
              "ReplicaZone",
              "Zone",
            });
    internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_descriptor =
        internal_static_google_cloud_netapp_v1_StoragePool_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_netapp_v1_StoragePool_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.netapp.v1.CommonProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
