// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/result_set.proto

package com.google.spanner.v1;

public final class ResultSetProto {
  private ResultSetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ResultSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ResultSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_PartialResultSet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_PartialResultSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ResultSetMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ResultSetMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_spanner_v1_ResultSetStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_spanner_v1_ResultSetStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\"google/spanner/v1/result_set.proto\022\021go"
          + "ogle.spanner.v1\032\034google/api/annotations."
          + "proto\032\034google/protobuf/struct.proto\032\"goo"
          + "gle/spanner/v1/query_plan.proto\032#google/"
          + "spanner/v1/transaction.proto\032\034google/spa"
          + "nner/v1/type.proto\"\237\001\n\tResultSet\0226\n\010meta"
          + "data\030\001 \001(\0132$.google.spanner.v1.ResultSet"
          + "Metadata\022(\n\004rows\030\002 \003(\0132\032.google.protobuf"
          + ".ListValue\0220\n\005stats\030\003 \001(\0132!.google.spann"
          + "er.v1.ResultSetStats\"\321\001\n\020PartialResultSe"
          + "t\0226\n\010metadata\030\001 \001(\0132$.google.spanner.v1."
          + "ResultSetMetadata\022&\n\006values\030\002 \003(\0132\026.goog"
          + "le.protobuf.Value\022\025\n\rchunked_value\030\003 \001(\010"
          + "\022\024\n\014resume_token\030\004 \001(\014\0220\n\005stats\030\005 \001(\0132!."
          + "google.spanner.v1.ResultSetStats\"y\n\021Resu"
          + "ltSetMetadata\022/\n\010row_type\030\001 \001(\0132\035.google"
          + ".spanner.v1.StructType\0223\n\013transaction\030\002 "
          + "\001(\0132\036.google.spanner.v1.Transaction\"\271\001\n\016"
          + "ResultSetStats\0220\n\nquery_plan\030\001 \001(\0132\034.goo"
          + "gle.spanner.v1.QueryPlan\022,\n\013query_stats\030"
          + "\002 \001(\0132\027.google.protobuf.Struct\022\031\n\017row_co"
          + "unt_exact\030\003 \001(\003H\000\022\037\n\025row_count_lower_bou"
          + "nd\030\004 \001(\003H\000B\013\n\trow_countB\232\001\n\025com.google.s"
          + "panner.v1B\016ResultSetProtoP\001Z8google.gola"
          + "ng.org/genproto/googleapis/spanner/v1;sp"
          + "anner\370\001\001\252\002\027Google.Cloud.Spanner.V1\312\002\027Goo"
          + "gle\\Cloud\\Spanner\\V1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
          com.google.spanner.v1.QueryPlanProto.getDescriptor(),
          com.google.spanner.v1.TransactionProto.getDescriptor(),
          com.google.spanner.v1.TypeProto.getDescriptor(),
        },
        assigner);
    internal_static_google_spanner_v1_ResultSet_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_spanner_v1_ResultSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ResultSet_descriptor,
            new java.lang.String[] {
              "Metadata", "Rows", "Stats",
            });
    internal_static_google_spanner_v1_PartialResultSet_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_spanner_v1_PartialResultSet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_PartialResultSet_descriptor,
            new java.lang.String[] {
              "Metadata", "Values", "ChunkedValue", "ResumeToken", "Stats",
            });
    internal_static_google_spanner_v1_ResultSetMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_spanner_v1_ResultSetMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ResultSetMetadata_descriptor,
            new java.lang.String[] {
              "RowType", "Transaction",
            });
    internal_static_google_spanner_v1_ResultSetStats_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_spanner_v1_ResultSetStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_spanner_v1_ResultSetStats_descriptor,
            new java.lang.String[] {
              "QueryPlan", "QueryStats", "RowCountExact", "RowCountLowerBound", "RowCount",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.spanner.v1.QueryPlanProto.getDescriptor();
    com.google.spanner.v1.TransactionProto.getDescriptor();
    com.google.spanner.v1.TypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
