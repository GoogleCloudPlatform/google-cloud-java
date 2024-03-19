// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/event.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class EventProto {
  private EventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Event_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Event_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_Event_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Event_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/event." +
      "proto\022\037google.cloud.aiplatform.v1beta1\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\032\037google/protobuf/time" +
      "stamp.proto\"\242\003\n\005Event\022<\n\010artifact\030\001 \001(\tB" +
      "*\340A\002\372A$\n\"aiplatform.googleapis.com/Artif" +
      "act\022>\n\texecution\030\002 \001(\tB+\340A\003\372A%\n#aiplatfo" +
      "rm.googleapis.com/Execution\0223\n\nevent_tim" +
      "e\030\003 \001(\0132\032.google.protobuf.TimestampB\003\340A\003" +
      "\022>\n\004type\030\004 \001(\0162+.google.cloud.aiplatform" +
      ".v1beta1.Event.TypeB\003\340A\002\022B\n\006labels\030\005 \003(\013" +
      "22.google.cloud.aiplatform.v1beta1.Event" +
      ".LabelsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t" +
      "\022\r\n\005value\030\002 \001(\t:\0028\001\"3\n\004Type\022\024\n\020TYPE_UNSP" +
      "ECIFIED\020\000\022\t\n\005INPUT\020\001\022\n\n\006OUTPUT\020\002B\341\001\n#com" +
      ".google.cloud.aiplatform.v1beta1B\nEventP" +
      "rotoP\001ZCcloud.google.com/go/aiplatform/a" +
      "piv1beta1/aiplatformpb;aiplatformpb\252\002\037Go" +
      "ogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\C" +
      "loud\\AIPlatform\\V1beta1\352\002\"Google::Cloud:" +
      ":AIPlatform::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Event_descriptor,
        new java.lang.String[] { "Artifact", "Execution", "EventTime", "Type", "Labels", });
    internal_static_google_cloud_aiplatform_v1beta1_Event_LabelsEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1beta1_Event_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Event_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_Event_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
