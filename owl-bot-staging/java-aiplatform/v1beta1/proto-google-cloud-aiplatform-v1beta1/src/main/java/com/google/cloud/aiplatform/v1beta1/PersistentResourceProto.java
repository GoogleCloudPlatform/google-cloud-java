// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/persistent_resource.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class PersistentResourceProto {
  private PersistentResourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_AutoscalingSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_AutoscalingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntimeSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntimeSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RaySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RaySpec_ResourcePoolImagesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RaySpec_ResourcePoolImagesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_AccessUrisEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_AccessUrisEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_RayMetricSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RayMetricSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/cloud/aiplatform/v1beta1/persis" +
      "tent_resource.proto\022\037google.cloud.aiplat" +
      "form.v1beta1\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\0325google" +
      "/cloud/aiplatform/v1beta1/encryption_spe" +
      "c.proto\0327google/cloud/aiplatform/v1beta1" +
      "/machine_resources.proto\032\037google/protobu" +
      "f/timestamp.proto\032\027google/rpc/status.pro" +
      "to\"\337\010\n\022PersistentResource\022\021\n\004name\030\001 \001(\tB" +
      "\003\340A\005\022\031\n\014display_name\030\002 \001(\tB\003\340A\001\022J\n\016resou" +
      "rce_pools\030\004 \003(\0132-.google.cloud.aiplatfor" +
      "m.v1beta1.ResourcePoolB\003\340A\002\022M\n\005state\030\005 \001" +
      "(\01629.google.cloud.aiplatform.v1beta1.Per" +
      "sistentResource.StateB\003\340A\003\022&\n\005error\030\006 \001(" +
      "\0132\022.google.rpc.StatusB\003\340A\003\0224\n\013create_tim" +
      "e\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003" +
      "\0223\n\nstart_time\030\010 \001(\0132\032.google.protobuf.T" +
      "imestampB\003\340A\003\0224\n\013update_time\030\t \001(\0132\032.goo" +
      "gle.protobuf.TimestampB\003\340A\003\022T\n\006labels\030\n " +
      "\003(\0132?.google.cloud.aiplatform.v1beta1.Pe" +
      "rsistentResource.LabelsEntryB\003\340A\001\0227\n\007net" +
      "work\030\013 \001(\tB&\340A\001\372A \n\036compute.googleapis.c" +
      "om/Network\022M\n\017encryption_spec\030\014 \001(\0132/.go" +
      "ogle.cloud.aiplatform.v1beta1.Encryption" +
      "SpecB\003\340A\001\022X\n\025resource_runtime_spec\030\r \001(\013" +
      "24.google.cloud.aiplatform.v1beta1.Resou" +
      "rceRuntimeSpecB\003\340A\001\022O\n\020resource_runtime\030" +
      "\016 \001(\01320.google.cloud.aiplatform.v1beta1." +
      "ResourceRuntimeB\003\340A\003\022\037\n\022reserved_ip_rang" +
      "es\030\017 \003(\tB\003\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"V\n\005State\022\025\n\021STATE_U" +
      "NSPECIFIED\020\000\022\020\n\014PROVISIONING\020\001\022\013\n\007RUNNIN" +
      "G\020\003\022\014\n\010STOPPING\020\004\022\t\n\005ERROR\020\005:\205\001\352A\201\001\n,aip" +
      "latform.googleapis.com/PersistentResourc" +
      "e\022Qprojects/{project}/locations/{locatio" +
      "n}/persistentResources/{persistent_resou" +
      "rce}\"\352\003\n\014ResourcePool\022\017\n\002id\030\001 \001(\tB\003\340A\005\022J" +
      "\n\014machine_spec\030\002 \001(\0132,.google.cloud.aipl" +
      "atform.v1beta1.MachineSpecB\006\340A\002\340A\005\022\037\n\rre" +
      "plica_count\030\003 \001(\003B\003\340A\001H\000\210\001\001\022A\n\tdisk_spec" +
      "\030\004 \001(\0132).google.cloud.aiplatform.v1beta1" +
      ".DiskSpecB\003\340A\001\022\037\n\022used_replica_count\030\006 \001" +
      "(\003B\003\340A\003\022\\\n\020autoscaling_spec\030\007 \001(\0132=.goog" +
      "le.cloud.aiplatform.v1beta1.ResourcePool" +
      ".AutoscalingSpecB\003\340A\001\032\207\001\n\017AutoscalingSpe" +
      "c\022#\n\021min_replica_count\030\001 \001(\003B\003\340A\001H\000\210\001\001\022#" +
      "\n\021max_replica_count\030\002 \001(\003B\003\340A\001H\001\210\001\001B\024\n\022_" +
      "min_replica_countB\024\n\022_max_replica_countB" +
      "\020\n\016_replica_count\"\256\001\n\023ResourceRuntimeSpe" +
      "c\022V\n\024service_account_spec\030\002 \001(\01323.google" +
      ".cloud.aiplatform.v1beta1.ServiceAccount" +
      "SpecB\003\340A\001\022?\n\010ray_spec\030\001 \001(\0132(.google.clo" +
      "ud.aiplatform.v1beta1.RaySpecB\003\340A\001\"\270\002\n\007R" +
      "aySpec\022\026\n\timage_uri\030\001 \001(\tB\003\340A\001\022c\n\024resour" +
      "ce_pool_images\030\006 \003(\0132@.google.cloud.aipl" +
      "atform.v1beta1.RaySpec.ResourcePoolImage" +
      "sEntryB\003\340A\001\022\'\n\032head_node_resource_pool_i" +
      "d\030\007 \001(\tB\003\340A\001\022L\n\017ray_metric_spec\030\010 \001(\0132.." +
      "google.cloud.aiplatform.v1beta1.RayMetri" +
      "cSpecB\003\340A\001\0329\n\027ResourcePoolImagesEntry\022\013\n" +
      "\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\240\001\n\017Resour" +
      "ceRuntime\022Z\n\013access_uris\030\001 \003(\0132@.google." +
      "cloud.aiplatform.v1beta1.ResourceRuntime" +
      ".AccessUrisEntryB\003\340A\003\0321\n\017AccessUrisEntry" +
      "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"^\n\022Serv" +
      "iceAccountSpec\022*\n\035enable_custom_service_" +
      "account\030\001 \001(\010B\003\340A\002\022\034\n\017service_account\030\002 " +
      "\001(\tB\003\340A\001\"&\n\rRayMetricSpec\022\025\n\010disabled\030\001 " +
      "\001(\010B\003\340A\001B\356\001\n#com.google.cloud.aiplatform" +
      ".v1beta1B\027PersistentResourceProtoP\001ZCclo" +
      "ud.google.com/go/aiplatform/apiv1beta1/a" +
      "iplatformpb;aiplatformpb\252\002\037Google.Cloud." +
      "AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlat" +
      "form\\V1beta1\352\002\"Google::Cloud::AIPlatform" +
      "::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "ResourcePools", "State", "Error", "CreateTime", "StartTime", "UpdateTime", "Labels", "Network", "EncryptionSpec", "ResourceRuntimeSpec", "ResourceRuntime", "ReservedIpRanges", });
    internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_PersistentResource_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_descriptor,
        new java.lang.String[] { "Id", "MachineSpec", "ReplicaCount", "DiskSpec", "UsedReplicaCount", "AutoscalingSpec", });
    internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_AutoscalingSpec_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_AutoscalingSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ResourcePool_AutoscalingSpec_descriptor,
        new java.lang.String[] { "MinReplicaCount", "MaxReplicaCount", });
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntimeSpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntimeSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntimeSpec_descriptor,
        new java.lang.String[] { "ServiceAccountSpec", "RaySpec", });
    internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_RaySpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor,
        new java.lang.String[] { "ImageUri", "ResourcePoolImages", "HeadNodeResourcePoolId", "RayMetricSpec", });
    internal_static_google_cloud_aiplatform_v1beta1_RaySpec_ResourcePoolImagesEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_RaySpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_RaySpec_ResourcePoolImagesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RaySpec_ResourcePoolImagesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor,
        new java.lang.String[] { "AccessUris", });
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_AccessUrisEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_AccessUrisEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ResourceRuntime_AccessUrisEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ServiceAccountSpec_descriptor,
        new java.lang.String[] { "EnableCustomServiceAccount", "ServiceAccount", });
    internal_static_google_cloud_aiplatform_v1beta1_RayMetricSpec_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_RayMetricSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_RayMetricSpec_descriptor,
        new java.lang.String[] { "Disabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
