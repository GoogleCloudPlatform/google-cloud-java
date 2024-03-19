// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/machine_resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class MachineResourcesProto {
  private MachineResourcesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_MachineSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_MachineSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DedicatedResources_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DedicatedResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_AutomaticResources_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AutomaticResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_BatchDedicatedResources_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_BatchDedicatedResources_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ResourcesConsumed_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ResourcesConsumed_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_DiskSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DiskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PersistentDiskSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PersistentDiskSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_NfsMount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NfsMount_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_AutoscalingMetricSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_AutoscalingMetricSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1/machine_res" +
      "ources.proto\022\032google.cloud.aiplatform.v1" +
      "\032\037google/api/field_behavior.proto\0321googl" +
      "e/cloud/aiplatform/v1/accelerator_type.p" +
      "roto\"\252\001\n\013MachineSpec\022\031\n\014machine_type\030\001 \001" +
      "(\tB\003\340A\005\022J\n\020accelerator_type\030\002 \001(\0162+.goog" +
      "le.cloud.aiplatform.v1.AcceleratorTypeB\003" +
      "\340A\005\022\031\n\021accelerator_count\030\003 \001(\005\022\031\n\014tpu_to" +
      "pology\030\004 \001(\tB\003\340A\005\"\370\001\n\022DedicatedResources" +
      "\022E\n\014machine_spec\030\001 \001(\0132\'.google.cloud.ai" +
      "platform.v1.MachineSpecB\006\340A\002\340A\005\022!\n\021min_r" +
      "eplica_count\030\002 \001(\005B\006\340A\002\340A\005\022\036\n\021max_replic" +
      "a_count\030\003 \001(\005B\003\340A\005\022X\n\030autoscaling_metric" +
      "_specs\030\004 \003(\01321.google.cloud.aiplatform.v" +
      "1.AutoscalingMetricSpecB\003\340A\005\"T\n\022Automati" +
      "cResources\022\036\n\021min_replica_count\030\001 \001(\005B\003\340" +
      "A\005\022\036\n\021max_replica_count\030\002 \001(\005B\003\340A\005\"\245\001\n\027B" +
      "atchDedicatedResources\022E\n\014machine_spec\030\001" +
      " \001(\0132\'.google.cloud.aiplatform.v1.Machin" +
      "eSpecB\006\340A\002\340A\005\022#\n\026starting_replica_count\030" +
      "\002 \001(\005B\003\340A\005\022\036\n\021max_replica_count\030\003 \001(\005B\003\340" +
      "A\005\"/\n\021ResourcesConsumed\022\032\n\rreplica_hours" +
      "\030\001 \001(\001B\003\340A\003\"=\n\010DiskSpec\022\026\n\016boot_disk_typ" +
      "e\030\001 \001(\t\022\031\n\021boot_disk_size_gb\030\002 \001(\005\"=\n\022Pe" +
      "rsistentDiskSpec\022\021\n\tdisk_type\030\001 \001(\t\022\024\n\014d" +
      "isk_size_gb\030\002 \001(\003\"L\n\010NfsMount\022\023\n\006server\030" +
      "\001 \001(\tB\003\340A\002\022\021\n\004path\030\002 \001(\tB\003\340A\002\022\030\n\013mount_p" +
      "oint\030\003 \001(\tB\003\340A\002\"A\n\025AutoscalingMetricSpec" +
      "\022\030\n\013metric_name\030\001 \001(\tB\003\340A\002\022\016\n\006target\030\002 \001" +
      "(\005B\323\001\n\036com.google.cloud.aiplatform.v1B\025M" +
      "achineResourcesProtoP\001Z>cloud.google.com" +
      "/go/aiplatform/apiv1/aiplatformpb;aiplat" +
      "formpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Go" +
      "ogle\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud" +
      "::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.AcceleratorTypeProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_MachineSpec_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_MachineSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_MachineSpec_descriptor,
        new java.lang.String[] { "MachineType", "AcceleratorType", "AcceleratorCount", "TpuTopology", });
    internal_static_google_cloud_aiplatform_v1_DedicatedResources_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_DedicatedResources_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DedicatedResources_descriptor,
        new java.lang.String[] { "MachineSpec", "MinReplicaCount", "MaxReplicaCount", "AutoscalingMetricSpecs", });
    internal_static_google_cloud_aiplatform_v1_AutomaticResources_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_AutomaticResources_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_AutomaticResources_descriptor,
        new java.lang.String[] { "MinReplicaCount", "MaxReplicaCount", });
    internal_static_google_cloud_aiplatform_v1_BatchDedicatedResources_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_BatchDedicatedResources_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_BatchDedicatedResources_descriptor,
        new java.lang.String[] { "MachineSpec", "StartingReplicaCount", "MaxReplicaCount", });
    internal_static_google_cloud_aiplatform_v1_ResourcesConsumed_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ResourcesConsumed_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ResourcesConsumed_descriptor,
        new java.lang.String[] { "ReplicaHours", });
    internal_static_google_cloud_aiplatform_v1_DiskSpec_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_DiskSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_DiskSpec_descriptor,
        new java.lang.String[] { "BootDiskType", "BootDiskSizeGb", });
    internal_static_google_cloud_aiplatform_v1_PersistentDiskSpec_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_PersistentDiskSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PersistentDiskSpec_descriptor,
        new java.lang.String[] { "DiskType", "DiskSizeGb", });
    internal_static_google_cloud_aiplatform_v1_NfsMount_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_NfsMount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_NfsMount_descriptor,
        new java.lang.String[] { "Server", "Path", "MountPoint", });
    internal_static_google_cloud_aiplatform_v1_AutoscalingMetricSpec_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_AutoscalingMetricSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_AutoscalingMetricSpec_descriptor,
        new java.lang.String[] { "MetricName", "Target", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.AcceleratorTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
