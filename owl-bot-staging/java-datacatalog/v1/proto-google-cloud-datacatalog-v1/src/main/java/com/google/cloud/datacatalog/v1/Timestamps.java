// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/timestamps.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public final class Timestamps {
  private Timestamps() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_SystemTimestamps_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_SystemTimestamps_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,google/cloud/datacatalog/v1/timestamps" +
      ".proto\022\033google.cloud.datacatalog.v1\032\037goo" +
      "gle/api/field_behavior.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"\252\001\n\020SystemTimestam" +
      "ps\022/\n\013create_time\030\001 \001(\0132\032.google.protobu" +
      "f.Timestamp\022/\n\013update_time\030\002 \001(\0132\032.googl" +
      "e.protobuf.Timestamp\0224\n\013expire_time\030\003 \001(" +
      "\0132\032.google.protobuf.TimestampB\003\340A\003B\306\001\n\037c" +
      "om.google.cloud.datacatalog.v1P\001ZAcloud." +
      "google.com/go/datacatalog/apiv1/datacata" +
      "logpb;datacatalogpb\370\001\001\252\002\033Google.Cloud.Da" +
      "taCatalog.V1\312\002\033Google\\Cloud\\DataCatalog\\" +
      "V1\352\002\036Google::Cloud::DataCatalog::V1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1_SystemTimestamps_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_SystemTimestamps_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_SystemTimestamps_descriptor,
        new java.lang.String[] { "CreateTime", "UpdateTime", "ExpireTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
