// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/data_source.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public final class DataSourceProto {
  private DataSourceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DataSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DataSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_StorageProperties_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_StorageProperties_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/cloud/datacatalog/v1/data_sourc" +
      "e.proto\022\033google.cloud.datacatalog.v1\032\037go" +
      "ogle/api/field_behavior.proto\"\234\002\n\nDataSo" +
      "urce\022@\n\007service\030\001 \001(\0162/.google.cloud.dat" +
      "acatalog.v1.DataSource.Service\022\020\n\010resour" +
      "ce\030\002 \001(\t\022\031\n\014source_entry\030\003 \001(\tB\003\340A\003\022L\n\022s" +
      "torage_properties\030\004 \001(\0132..google.cloud.d" +
      "atacatalog.v1.StoragePropertiesH\000\"C\n\007Ser" +
      "vice\022\027\n\023SERVICE_UNSPECIFIED\020\000\022\021\n\rCLOUD_S" +
      "TORAGE\020\001\022\014\n\010BIGQUERY\020\002B\014\n\nproperties\"<\n\021" +
      "StorageProperties\022\024\n\014file_pattern\030\001 \003(\t\022" +
      "\021\n\tfile_type\030\002 \001(\tB\327\001\n\037com.google.cloud." +
      "datacatalog.v1B\017DataSourceProtoP\001ZAcloud" +
      ".google.com/go/datacatalog/apiv1/datacat" +
      "alogpb;datacatalogpb\370\001\001\252\002\033Google.Cloud.D" +
      "ataCatalog.V1\312\002\033Google\\Cloud\\DataCatalog" +
      "\\V1\352\002\036Google::Cloud::DataCatalog::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1_DataSource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_DataSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DataSource_descriptor,
        new java.lang.String[] { "Service", "Resource", "SourceEntry", "StorageProperties", "Properties", });
    internal_static_google_cloud_datacatalog_v1_StorageProperties_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_StorageProperties_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_StorageProperties_descriptor,
        new java.lang.String[] { "FilePattern", "FileType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
