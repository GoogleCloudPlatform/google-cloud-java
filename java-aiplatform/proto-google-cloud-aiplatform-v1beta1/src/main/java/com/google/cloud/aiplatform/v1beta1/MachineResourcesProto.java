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
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class MachineResourcesProto {
  private MachineResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DedicatedResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DedicatedResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_AutomaticResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AutomaticResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_BatchDedicatedResources_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BatchDedicatedResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DiskSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DiskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PersistentDiskSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PersistentDiskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_NfsMount_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_NfsMount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n7google/cloud/aiplatform/v1beta1/machin"
          + "e_resources.proto\022\037google.cloud.aiplatfo"
          + "rm.v1beta1\032\037google/api/field_behavior.pr"
          + "oto\0326google/cloud/aiplatform/v1beta1/acc"
          + "elerator_type.proto\"\257\001\n\013MachineSpec\022\031\n\014m"
          + "achine_type\030\001 \001(\tB\003\340A\005\022O\n\020accelerator_ty"
          + "pe\030\002 \001(\01620.google.cloud.aiplatform.v1bet"
          + "a1.AcceleratorTypeB\003\340A\005\022\031\n\021accelerator_c"
          + "ount\030\003 \001(\005\022\031\n\014tpu_topology\030\004 \001(\tB\003\340A\005\"\202\002"
          + "\n\022DedicatedResources\022J\n\014machine_spec\030\001 \001"
          + "(\0132,.google.cloud.aiplatform.v1beta1.Mac"
          + "hineSpecB\006\340A\002\340A\005\022!\n\021min_replica_count\030\002 "
          + "\001(\005B\006\340A\002\340A\005\022\036\n\021max_replica_count\030\003 \001(\005B\003"
          + "\340A\005\022]\n\030autoscaling_metric_specs\030\004 \003(\01326."
          + "google.cloud.aiplatform.v1beta1.Autoscal"
          + "ingMetricSpecB\003\340A\005\"T\n\022AutomaticResources"
          + "\022\036\n\021min_replica_count\030\001 \001(\005B\003\340A\005\022\036\n\021max_"
          + "replica_count\030\002 \001(\005B\003\340A\005\"\252\001\n\027BatchDedica"
          + "tedResources\022J\n\014machine_spec\030\001 \001(\0132,.goo"
          + "gle.cloud.aiplatform.v1beta1.MachineSpec"
          + "B\006\340A\002\340A\005\022#\n\026starting_replica_count\030\002 \001(\005"
          + "B\003\340A\005\022\036\n\021max_replica_count\030\003 \001(\005B\003\340A\005\"/\n"
          + "\021ResourcesConsumed\022\032\n\rreplica_hours\030\001 \001("
          + "\001B\003\340A\003\"=\n\010DiskSpec\022\026\n\016boot_disk_type\030\001 \001"
          + "(\t\022\031\n\021boot_disk_size_gb\030\002 \001(\005\"=\n\022Persist"
          + "entDiskSpec\022\021\n\tdisk_type\030\001 \001(\t\022\024\n\014disk_s"
          + "ize_gb\030\002 \001(\003\"L\n\010NfsMount\022\023\n\006server\030\001 \001(\t"
          + "B\003\340A\002\022\021\n\004path\030\002 \001(\tB\003\340A\002\022\030\n\013mount_point\030"
          + "\003 \001(\tB\003\340A\002\"A\n\025AutoscalingMetricSpec\022\030\n\013m"
          + "etric_name\030\001 \001(\tB\003\340A\002\022\016\n\006target\030\002 \001(\005B\354\001"
          + "\n#com.google.cloud.aiplatform.v1beta1B\025M"
          + "achineResourcesProtoP\001ZCcloud.google.com"
          + "/go/aiplatform/apiv1beta1/aiplatformpb;a"
          + "iplatformpb\252\002\037Google.Cloud.AIPlatform.V1"
          + "Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352"
          + "\002\"Google::Cloud::AIPlatform::V1beta1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_MachineSpec_descriptor,
            new java.lang.String[] {
              "MachineType", "AcceleratorType", "AcceleratorCount", "TpuTopology",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DedicatedResources_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DedicatedResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DedicatedResources_descriptor,
            new java.lang.String[] {
              "MachineSpec", "MinReplicaCount", "MaxReplicaCount", "AutoscalingMetricSpecs",
            });
    internal_static_google_cloud_aiplatform_v1beta1_AutomaticResources_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_AutomaticResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_AutomaticResources_descriptor,
            new java.lang.String[] {
              "MinReplicaCount", "MaxReplicaCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_BatchDedicatedResources_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_BatchDedicatedResources_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_BatchDedicatedResources_descriptor,
            new java.lang.String[] {
              "MachineSpec", "StartingReplicaCount", "MaxReplicaCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ResourcesConsumed_descriptor,
            new java.lang.String[] {
              "ReplicaHours",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DiskSpec_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_DiskSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DiskSpec_descriptor,
            new java.lang.String[] {
              "BootDiskType", "BootDiskSizeGb",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PersistentDiskSpec_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_PersistentDiskSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PersistentDiskSpec_descriptor,
            new java.lang.String[] {
              "DiskType", "DiskSizeGb",
            });
    internal_static_google_cloud_aiplatform_v1beta1_NfsMount_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_NfsMount_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_NfsMount_descriptor,
            new java.lang.String[] {
              "Server", "Path", "MountPoint",
            });
    internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_AutoscalingMetricSpec_descriptor,
            new java.lang.String[] {
              "MetricName", "Target",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.AcceleratorTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
