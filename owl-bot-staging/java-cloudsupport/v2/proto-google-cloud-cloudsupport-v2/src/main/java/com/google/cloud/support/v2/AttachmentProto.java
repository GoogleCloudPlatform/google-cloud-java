// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/support/v2/attachment.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.support.v2;

public final class AttachmentProto {
  private AttachmentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_support_v2_Attachment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_support_v2_Attachment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/support/v2/attachment.pro" +
      "to\022\027google.cloud.support.v2\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\032#google/cloud/support/v2/actor.p" +
      "roto\032\037google/protobuf/timestamp.proto\"\201\003" +
      "\n\nAttachment\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013creat" +
      "e_time\030\002 \001(\0132\032.google.protobuf.Timestamp" +
      "B\003\340A\003\0224\n\007creator\030\003 \001(\0132\036.google.cloud.su" +
      "pport.v2.ActorB\003\340A\003\022\020\n\010filename\030\004 \001(\t\022\026\n" +
      "\tmime_type\030\005 \001(\tB\003\340A\003\022\027\n\nsize_bytes\030\006 \001(" +
      "\003B\003\340A\003:\260\001\352A\254\001\n&cloudsupport.googleapis.c" +
      "om/Attachment\022Eorganizations/{organizati" +
      "on}/cases/{case}/attachments/{attachment" +
      "_id}\022;projects/{project}/cases/{case}/at" +
      "tachments/{attachment_id}B\270\001\n\033com.google" +
      ".cloud.support.v2B\017AttachmentProtoP\001Z5cl" +
      "oud.google.com/go/support/apiv2/supportp" +
      "b;supportpb\252\002\027Google.Cloud.Support.V2\312\002\027" +
      "Google\\Cloud\\Support\\V2\352\002\032Google::Cloud:" +
      ":Support::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.support.v2.ActorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_support_v2_Attachment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_support_v2_Attachment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_support_v2_Attachment_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "Creator", "Filename", "MimeType", "SizeBytes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.support.v2.ActorProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
