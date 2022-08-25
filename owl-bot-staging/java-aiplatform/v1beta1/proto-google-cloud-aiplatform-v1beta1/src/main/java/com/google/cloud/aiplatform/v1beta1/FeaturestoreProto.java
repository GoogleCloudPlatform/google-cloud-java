// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore.proto

package com.google.cloud.aiplatform.v1beta1;

public final class FeaturestoreProto {
  private FeaturestoreProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1beta1/featur" +
      "estore.proto\022\037google.cloud.aiplatform.v1" +
      "beta1\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\0325google/cloud/" +
      "aiplatform/v1beta1/encryption_spec.proto" +
      "\032\037google/protobuf/timestamp.proto\"\231\007\n\014Fe" +
      "aturestore\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_" +
      "time\030\003 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\0224\n\013update_time\030\004 \001(\0132\032.google.protob" +
      "uf.TimestampB\003\340A\003\022\021\n\004etag\030\005 \001(\tB\003\340A\001\022N\n\006" +
      "labels\030\006 \003(\01329.google.cloud.aiplatform.v" +
      "1beta1.Featurestore.LabelsEntryB\003\340A\001\022e\n\025" +
      "online_serving_config\030\007 \001(\0132A.google.clo" +
      "ud.aiplatform.v1beta1.Featurestore.Onlin" +
      "eServingConfigB\003\340A\001\022G\n\005state\030\010 \001(\01623.goo" +
      "gle.cloud.aiplatform.v1beta1.Featurestor" +
      "e.StateB\003\340A\003\022M\n\017encryption_spec\030\n \001(\0132/." +
      "google.cloud.aiplatform.v1beta1.Encrypti" +
      "onSpecB\003\340A\001\032\313\001\n\023OnlineServingConfig\022\030\n\020f" +
      "ixed_node_count\030\002 \001(\005\022Z\n\007scaling\030\004 \001(\0132I" +
      ".google.cloud.aiplatform.v1beta1.Feature" +
      "store.OnlineServingConfig.Scaling\032>\n\007Sca" +
      "ling\022\033\n\016min_node_count\030\001 \001(\005B\003\340A\002\022\026\n\016max" +
      "_node_count\030\002 \001(\005\032-\n\013LabelsEntry\022\013\n\003key\030" +
      "\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"8\n\005State\022\025\n\021STA" +
      "TE_UNSPECIFIED\020\000\022\n\n\006STABLE\020\001\022\014\n\010UPDATING" +
      "\020\002:q\352An\n&aiplatform.googleapis.com/Featu" +
      "restore\022Dprojects/{project}/locations/{l" +
      "ocation}/featurestores/{featurestore}B\356\001" +
      "\n#com.google.cloud.aiplatform.v1beta1B\021F" +
      "eaturestoreProtoP\001ZIgoogle.golang.org/ge" +
      "nproto/googleapis/cloud/aiplatform/v1bet" +
      "a1;aiplatform\252\002\037Google.Cloud.AIPlatform." +
      "V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta" +
      "1\352\002\"Google::Cloud::AIPlatform::V1beta1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "UpdateTime", "Etag", "Labels", "OnlineServingConfig", "State", "EncryptionSpec", });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor,
        new java.lang.String[] { "FixedNodeCount", "Scaling", });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_OnlineServingConfig_Scaling_descriptor,
        new java.lang.String[] { "MinNodeCount", "MaxNodeCount", });
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Featurestore_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Featurestore_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
