// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/bigquery.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public final class BigQueryProto {
  private BigQueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_CloudSqlBigQueryConnectionSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CloudSqlBigQueryConnectionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/datacatalog/v1/bigquery.p" +
      "roto\022\033google.cloud.datacatalog.v1\032\037googl" +
      "e/api/field_behavior.proto\"\264\002\n\026BigQueryC" +
      "onnectionSpec\022[\n\017connection_type\030\001 \001(\0162B" +
      ".google.cloud.datacatalog.v1.BigQueryCon" +
      "nectionSpec.ConnectionType\022P\n\tcloud_sql\030" +
      "\002 \001(\0132;.google.cloud.datacatalog.v1.Clou" +
      "dSqlBigQueryConnectionSpecH\000\022\026\n\016has_cred" +
      "ential\030\003 \001(\010\"@\n\016ConnectionType\022\037\n\033CONNEC" +
      "TION_TYPE_UNSPECIFIED\020\000\022\r\n\tCLOUD_SQL\020\001B\021" +
      "\n\017connection_spec\"\347\001\n\036CloudSqlBigQueryCo" +
      "nnectionSpec\022\023\n\013instance_id\030\001 \001(\t\022\020\n\010dat" +
      "abase\030\002 \001(\t\022V\n\004type\030\003 \001(\0162H.google.cloud" +
      ".datacatalog.v1.CloudSqlBigQueryConnecti" +
      "onSpec.DatabaseType\"F\n\014DatabaseType\022\035\n\031D" +
      "ATABASE_TYPE_UNSPECIFIED\020\000\022\014\n\010POSTGRES\020\001" +
      "\022\t\n\005MYSQL\020\002\"1\n\023BigQueryRoutineSpec\022\032\n\022im" +
      "ported_libraries\030\001 \003(\tB\325\001\n\037com.google.cl" +
      "oud.datacatalog.v1B\rBigQueryProtoP\001ZAclo" +
      "ud.google.com/go/datacatalog/apiv1/datac" +
      "atalogpb;datacatalogpb\370\001\001\252\002\033Google.Cloud" +
      ".DataCatalog.V1\312\002\033Google\\Cloud\\DataCatal" +
      "og\\V1\352\002\036Google::Cloud::DataCatalog::V1b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_BigQueryConnectionSpec_descriptor,
        new java.lang.String[] { "ConnectionType", "CloudSql", "HasCredential", "ConnectionSpec", });
    internal_static_google_cloud_datacatalog_v1_CloudSqlBigQueryConnectionSpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_CloudSqlBigQueryConnectionSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_CloudSqlBigQueryConnectionSpec_descriptor,
        new java.lang.String[] { "InstanceId", "Database", "Type", });
    internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_BigQueryRoutineSpec_descriptor,
        new java.lang.String[] { "ImportedLibraries", });
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
