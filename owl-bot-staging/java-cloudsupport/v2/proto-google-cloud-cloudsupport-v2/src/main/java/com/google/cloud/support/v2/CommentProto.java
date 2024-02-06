// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/support/v2/comment.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.support.v2;

public final class CommentProto {
  private CommentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_support_v2_Comment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_support_v2_Comment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/support/v2/comment.proto\022" +
      "\027google.cloud.support.v2\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\032#google/cloud/support/v2/actor.prot" +
      "o\032\037google/protobuf/timestamp.proto\"\322\002\n\007C" +
      "omment\022\021\n\004name\030\001 \001(\tB\003\340A\003\0224\n\013create_time" +
      "\030\002 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022" +
      "4\n\007creator\030\003 \001(\0132\036.google.cloud.support." +
      "v2.ActorB\003\340A\003\022\014\n\004body\030\004 \001(\t\022\034\n\017plain_tex" +
      "t_body\030\005 \001(\tB\003\340A\003:\233\001\352A\227\001\n#cloudsupport.g" +
      "oogleapis.com/Comment\022<organizations/{or" +
      "ganization}/cases/{case}/comments/{comme" +
      "nt}\0222projects/{project}/cases/{case}/com" +
      "ments/{comment}B\265\001\n\033com.google.cloud.sup" +
      "port.v2B\014CommentProtoP\001Z5cloud.google.co" +
      "m/go/support/apiv2/supportpb;supportpb\252\002" +
      "\027Google.Cloud.Support.V2\312\002\027Google\\Cloud\\" +
      "Support\\V2\352\002\032Google::Cloud::Support::V2b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.support.v2.ActorProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_support_v2_Comment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_support_v2_Comment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_support_v2_Comment_descriptor,
        new java.lang.String[] { "Name", "CreateTime", "Creator", "Body", "PlainTextBody", });
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
