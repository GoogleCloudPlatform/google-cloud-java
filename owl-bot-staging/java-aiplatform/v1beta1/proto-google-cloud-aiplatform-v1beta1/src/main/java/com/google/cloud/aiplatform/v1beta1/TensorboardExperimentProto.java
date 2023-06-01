// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/tensorboard_experiment.proto

package com.google.cloud.aiplatform.v1beta1;

public final class TensorboardExperimentProto {
  private TensorboardExperimentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1beta1/tensor" +
      "board_experiment.proto\022\037google.cloud.aip" +
      "latform.v1beta1\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032\037goo" +
      "gle/protobuf/timestamp.proto\"\200\004\n\025Tensorb" +
      "oardExperiment\022\022\n\004name\030\001 \001(\tB\004\342A\001\003\022\024\n\014di" +
      "splay_name\030\002 \001(\t\022\023\n\013description\030\003 \001(\t\0225\n" +
      "\013create_time\030\004 \001(\0132\032.google.protobuf.Tim" +
      "estampB\004\342A\001\003\0225\n\013update_time\030\005 \001(\0132\032.goog" +
      "le.protobuf.TimestampB\004\342A\001\003\022R\n\006labels\030\006 " +
      "\003(\0132B.google.cloud.aiplatform.v1beta1.Te" +
      "nsorboardExperiment.LabelsEntry\022\014\n\004etag\030" +
      "\007 \001(\t\022\024\n\006source\030\010 \001(\tB\004\342A\001\005\032-\n\013LabelsEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\222\001\352A\216" +
      "\001\n/aiplatform.googleapis.com/Tensorboard" +
      "Experiment\022[projects/{project}/locations" +
      "/{location}/tensorboards/{tensorboard}/e" +
      "xperiments/{experiment}B\361\001\n#com.google.c" +
      "loud.aiplatform.v1beta1B\032TensorboardExpe" +
      "rimentProtoP\001ZCcloud.google.com/go/aipla" +
      "tform/apiv1beta1/aiplatformpb;aiplatform" +
      "pb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037G" +
      "oogle\\Cloud\\AIPlatform\\V1beta1\352\002\"Google:" +
      ":Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "CreateTime", "UpdateTime", "Labels", "Etag", "Source", });
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_TensorboardExperiment_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
