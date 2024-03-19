// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/specialist_pool.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class SpecialistPoolProto {
  private SpecialistPoolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_SpecialistPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_SpecialistPool_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/aiplatform/v1/specialist_" +
      "pool.proto\022\032google.cloud.aiplatform.v1\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\"\316\002\n\016SpecialistPool\022\021\n" +
      "\004name\030\001 \001(\tB\003\340A\002\022\031\n\014display_name\030\002 \001(\tB\003" +
      "\340A\002\022&\n\031specialist_managers_count\030\003 \001(\005B\003" +
      "\340A\003\022!\n\031specialist_manager_emails\030\004 \003(\t\022\'" +
      "\n\032pending_data_labeling_jobs\030\005 \003(\tB\003\340A\003\022" +
      " \n\030specialist_worker_emails\030\007 \003(\t:x\352Au\n(" +
      "aiplatform.googleapis.com/SpecialistPool" +
      "\022Iprojects/{project}/locations/{location" +
      "}/specialistPools/{specialist_pool}B\321\001\n\036" +
      "com.google.cloud.aiplatform.v1B\023Speciali" +
      "stPoolProtoP\001Z>cloud.google.com/go/aipla" +
      "tform/apiv1/aiplatformpb;aiplatformpb\252\002\032" +
      "Google.Cloud.AIPlatform.V1\312\002\032Google\\Clou" +
      "d\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatf" +
      "orm::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_SpecialistPool_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_SpecialistPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_SpecialistPool_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "SpecialistManagersCount", "SpecialistManagerEmails", "PendingDataLabelingJobs", "SpecialistWorkerEmails", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
