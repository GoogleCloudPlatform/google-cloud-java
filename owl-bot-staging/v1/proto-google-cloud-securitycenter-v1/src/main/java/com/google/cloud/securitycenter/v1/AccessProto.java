// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/access.proto

package com.google.cloud.securitycenter.v1;

public final class AccessProto {
  private AccessProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Access_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Access_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_securitycenter_v1_Geolocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v1_Geolocation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/securitycenter/v1/access." +
      "proto\022\036google.cloud.securitycenter.v1\"\276\001" +
      "\n\006Access\022\027\n\017principal_email\030\001 \001(\t\022\021\n\tcal" +
      "ler_ip\030\002 \001(\t\022B\n\rcaller_ip_geo\030\003 \001(\0132+.go" +
      "ogle.cloud.securitycenter.v1.Geolocation" +
      "\022\031\n\021user_agent_family\030\004 \001(\t\022\024\n\014service_n" +
      "ame\030\005 \001(\t\022\023\n\013method_name\030\006 \001(\t\"\"\n\013Geoloc" +
      "ation\022\023\n\013region_code\030\001 \001(\tB\347\001\n\"com.googl" +
      "e.cloud.securitycenter.v1B\013AccessProtoP\001" +
      "ZLgoogle.golang.org/genproto/googleapis/" +
      "cloud/securitycenter/v1;securitycenter\252\002" +
      "\036Google.Cloud.SecurityCenter.V1\312\002\036Google" +
      "\\Cloud\\SecurityCenter\\V1\352\002!Google::Cloud" +
      "::SecurityCenter::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_securitycenter_v1_Access_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v1_Access_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Access_descriptor,
        new java.lang.String[] { "PrincipalEmail", "CallerIp", "CallerIpGeo", "UserAgentFamily", "ServiceName", "MethodName", });
    internal_static_google_cloud_securitycenter_v1_Geolocation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securitycenter_v1_Geolocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_securitycenter_v1_Geolocation_descriptor,
        new java.lang.String[] { "RegionCode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
