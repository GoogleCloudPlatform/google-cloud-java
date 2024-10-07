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
// source: google/cloud/baremetalsolution/v2/instance.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.baremetalsolution.v2;

public final class InstanceProto {
  private InstanceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Instance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_RenameInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_RenameInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/baremetalsolution/v2/inst"
          + "ance.proto\022!google.cloud.baremetalsoluti"
          + "on.v2\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032.google/cloud/"
          + "baremetalsolution/v2/common.proto\032+googl"
          + "e/cloud/baremetalsolution/v2/lun.proto\032/"
          + "google/cloud/baremetalsolution/v2/networ"
          + "k.proto\032.google/cloud/baremetalsolution/"
          + "v2/volume.proto\032 google/protobuf/field_m"
          + "ask.proto\032\037google/protobuf/timestamp.pro"
          + "to\"\311\t\n\010Instance\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\017\n\002id"
          + "\030\013 \001(\tB\003\340A\003\0224\n\013create_time\030\002 \001(\0132\032.googl"
          + "e.protobuf.TimestampB\003\340A\003\0224\n\013update_time"
          + "\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "\031\n\014machine_type\030\004 \001(\tB\003\340A\005\022E\n\005state\030\005 \001("
          + "\01621.google.cloud.baremetalsolution.v2.In"
          + "stance.StateB\003\340A\003\022\036\n\026hyperthreading_enab"
          + "led\030\006 \001(\010\022G\n\006labels\030\007 \003(\01327.google.cloud"
          + ".baremetalsolution.v2.Instance.LabelsEnt"
          + "ry\0229\n\004luns\030\010 \003(\0132&.google.cloud.baremeta"
          + "lsolution.v2.LunB\003\340A\005\022?\n\007volumes\030\020 \003(\0132)"
          + ".google.cloud.baremetalsolution.v2.Volum"
          + "eB\003\340A\004\022A\n\010networks\030\t \003(\0132*.google.cloud."
          + "baremetalsolution.v2.NetworkB\003\340A\003\022/\n\"int"
          + "eractive_serial_console_enabled\030\n \001(\010B\003\340"
          + "A\003\022\020\n\010os_image\030\014 \001(\t\022\020\n\003pod\030\r \001(\tB\003\340A\005\022U"
          + "\n\020network_template\030\016 \001(\tB;\372A8\n6baremetal"
          + "solution.googleapis.com/ServerNetworkTem"
          + "plate\022O\n\022logical_interfaces\030\017 \003(\01323.goog"
          + "le.cloud.baremetalsolution.v2.LogicalInt"
          + "erface\022\027\n\nlogin_info\030\021 \001(\tB\003\340A\003\022L\n\020workl"
          + "oad_profile\030\022 \001(\01622.google.cloud.baremet"
          + "alsolution.v2.WorkloadProfile\022\035\n\020firmwar"
          + "e_version\030\023 \001(\tB\003\340A\003\032-\n\013LabelsEntry\022\013\n\003k"
          + "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\202\001\n\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\020\n\014PROVISIONING\020\001\022\013"
          + "\n\007RUNNING\020\002\022\013\n\007DELETED\020\003\022\014\n\010UPDATING\020\004\022\014"
          + "\n\010STARTING\020\005\022\014\n\010STOPPING\020\006\022\014\n\010SHUTDOWN\020\007"
          + ":l\352Ai\n)baremetalsolution.googleapis.com/"
          + "Instance\022<projects/{project}/locations/{"
          + "location}/instances/{instance}\"U\n\022GetIns"
          + "tanceRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)bare"
          + "metalsolution.googleapis.com/Instance\"\210\001"
          + "\n\024ListInstancesRequest\0229\n\006parent\030\001 \001(\tB)"
          + "\340A\002\372A#\n!locations.googleapis.com/Locatio"
          + "n\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\022\016\n\006filter\030\004 \001(\t\"\205\001\n\025ListInstancesRespon"
          + "se\022>\n\tinstances\030\001 \003(\0132+.google.cloud.bar"
          + "emetalsolution.v2.Instance\022\027\n\017next_page_"
          + "token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"\214\001\n\025Upd"
          + "ateInstanceRequest\022B\n\010instance\030\001 \001(\0132+.g"
          + "oogle.cloud.baremetalsolution.v2.Instanc"
          + "eB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.google.pro"
          + "tobuf.FieldMask\"v\n\025RenameInstanceRequest"
          + "\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)baremetalsolutio"
          + "n.googleapis.com/Instance\022\034\n\017new_instanc"
          + "e_id\030\002 \001(\tB\003\340A\002\"W\n\024ResetInstanceRequest\022"
          + "?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)baremetalsolution"
          + ".googleapis.com/Instance\"W\n\024StartInstanc"
          + "eRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)baremeta"
          + "lsolution.googleapis.com/Instance\"\027\n\025Sta"
          + "rtInstanceResponse\"V\n\023StopInstanceReques"
          + "t\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)baremetalsoluti"
          + "on.googleapis.com/Instance\"\026\n\024StopInstan"
          + "ceResponse\"h\n%EnableInteractiveSerialCon"
          + "soleRequest\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)barem"
          + "etalsolution.googleapis.com/Instance\"(\n&"
          + "EnableInteractiveSerialConsoleResponse\"i"
          + "\n&DisableInteractiveSerialConsoleRequest"
          + "\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)baremetalsolutio"
          + "n.googleapis.com/Instance\")\n\'DisableInte"
          + "ractiveSerialConsoleResponse\"\247\001\n\020DetachL"
          + "unRequest\022C\n\010instance\030\001 \001(\tB1\340A\002\372A+\n)bar"
          + "emetalsolution.googleapis.com/Instance\0229"
          + "\n\003lun\030\002 \001(\tB,\340A\002\372A&\n$baremetalsolution.g"
          + "oogleapis.com/Lun\022\023\n\013skip_reboot\030\003 \001(\010\"\254"
          + "\004\n\025ServerNetworkTemplate\022\021\n\004name\030\001 \001(\tB\003"
          + "\340A\003\022!\n\031applicable_instance_types\030\002 \003(\t\022e"
          + "\n\022logical_interfaces\030\003 \003(\0132I.google.clou"
          + "d.baremetalsolution.v2.ServerNetworkTemp"
          + "late.LogicalInterface\032\335\001\n\020LogicalInterfa"
          + "ce\022\014\n\004name\030\001 \001(\t\022e\n\004type\030\002 \001(\0162W.google."
          + "cloud.baremetalsolution.v2.ServerNetwork"
          + "Template.LogicalInterface.InterfaceType\022"
          + "\020\n\010required\030\003 \001(\010\"B\n\rInterfaceType\022\036\n\032IN"
          + "TERFACE_TYPE_UNSPECIFIED\020\000\022\010\n\004BOND\020\001\022\007\n\003"
          + "NIC\020\002:\225\001\352A\221\001\n6baremetalsolution.googleap"
          + "is.com/ServerNetworkTemplate\022Wprojects/{"
          + "project}/locations/{location}/serverNetw"
          + "orkTemplate/{server_network_template}B\374\001"
          + "\n%com.google.cloud.baremetalsolution.v2B"
          + "\rInstanceProtoP\001ZScloud.google.com/go/ba"
          + "remetalsolution/apiv2/baremetalsolutionp"
          + "b;baremetalsolutionpb\252\002!Google.Cloud.Bar"
          + "eMetalSolution.V2\312\002!Google\\Cloud\\BareMet"
          + "alSolution\\V2\352\002$Google::Cloud::BareMetal"
          + "Solution::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.CommonProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor(),
              com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_baremetalsolution_v2_Instance_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "CreateTime",
              "UpdateTime",
              "MachineType",
              "State",
              "HyperthreadingEnabled",
              "Labels",
              "Luns",
              "Volumes",
              "Networks",
              "InteractiveSerialConsoleEnabled",
              "OsImage",
              "Pod",
              "NetworkTemplate",
              "LogicalInterfaces",
              "LoginInfo",
              "WorkloadProfile",
              "FirmwareVersion",
            });
    internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_Instance_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_Instance_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_GetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListInstancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ListInstancesResponse_descriptor,
            new java.lang.String[] {
              "Instances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_UpdateInstanceRequest_descriptor,
            new java.lang.String[] {
              "Instance", "UpdateMask",
            });
    internal_static_google_cloud_baremetalsolution_v2_RenameInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_baremetalsolution_v2_RenameInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_RenameInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "NewInstanceId",
            });
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ResetInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StartInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StartInstanceResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StopInstanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_StopInstanceResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_EnableInteractiveSerialConsoleResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_DisableInteractiveSerialConsoleResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_DetachLunRequest_descriptor,
            new java.lang.String[] {
              "Instance", "Lun", "SkipReboot",
            });
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor,
            new java.lang.String[] {
              "Name", "ApplicableInstanceTypes", "LogicalInterfaces",
            });
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_descriptor =
        internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_baremetalsolution_v2_ServerNetworkTemplate_LogicalInterface_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Required",
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
    com.google.cloud.baremetalsolution.v2.CommonProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.LunProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.NetworkProto.getDescriptor();
    com.google.cloud.baremetalsolution.v2.VolumeProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
