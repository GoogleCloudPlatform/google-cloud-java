// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/user_action_reference.proto

package com.google.cloud.aiplatform.v1beta1;

public final class UserActionReferenceProto {
  private UserActionReferenceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/cloud/aiplatform/v1beta1/user_a" +
      "ction_reference.proto\022\037google.cloud.aipl" +
      "atform.v1beta1\"d\n\023UserActionReference\022\023\n" +
      "\toperation\030\001 \001(\tH\000\022\033\n\021data_labeling_job\030" +
      "\002 \001(\tH\000\022\016\n\006method\030\003 \001(\tB\013\n\treferenceB\357\001\n" +
      "#com.google.cloud.aiplatform.v1beta1B\030Us" +
      "erActionReferenceProtoP\001ZCcloud.google.c" +
      "om/go/aiplatform/apiv1beta1/aiplatformpb" +
      ";aiplatformpb\252\002\037Google.Cloud.AIPlatform." +
      "V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V1beta" +
      "1\352\002\"Google::Cloud::AIPlatform::V1beta1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor,
        new java.lang.String[] { "Operation", "DataLabelingJob", "Method", "Reference", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
