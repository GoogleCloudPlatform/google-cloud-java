// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/operations.proto

package com.google.cloud.dataproc.v1;

public final class OperationsProto {
  private OperationsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/dataproc/v1/operations.pr" +
      "oto\022\030google.cloud.dataproc.v1\032\034google/ap" +
      "i/annotations.proto\032#google/longrunning/" +
      "operations.proto\032\033google/protobuf/empty." +
      "proto\032\037google/protobuf/timestamp.proto\"\365" +
      "\001\n\026ClusterOperationStatus\022E\n\005state\030\001 \001(\016" +
      "26.google.cloud.dataproc.v1.ClusterOpera" +
      "tionStatus.State\022\023\n\013inner_state\030\002 \001(\t\022\017\n" +
      "\007details\030\003 \001(\t\0224\n\020state_start_time\030\004 \001(\013" +
      "2\032.google.protobuf.Timestamp\"8\n\005State\022\013\n" +
      "\007UNKNOWN\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010\n\004" +
      "DONE\020\003\"\220\003\n\030ClusterOperationMetadata\022\024\n\014c" +
      "luster_name\030\007 \001(\t\022\024\n\014cluster_uuid\030\010 \001(\t\022" +
      "@\n\006status\030\t \001(\01320.google.cloud.dataproc." +
      "v1.ClusterOperationStatus\022H\n\016status_hist" +
      "ory\030\n \003(\01320.google.cloud.dataproc.v1.Clu" +
      "sterOperationStatus\022\026\n\016operation_type\030\013 " +
      "\001(\t\022\023\n\013description\030\014 \001(\t\022N\n\006labels\030\r \003(\013" +
      "2>.google.cloud.dataproc.v1.ClusterOpera" +
      "tionMetadata.LabelsEntry\022\020\n\010warnings\030\016 \003" +
      "(\t\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030" +
      "\002 \001(\t:\0028\001Bs\n\034com.google.cloud.dataproc.v" +
      "1B\017OperationsProtoP\001Z@google.golang.org/" +
      "genproto/googleapis/cloud/dataproc/v1;da" +
      "taprocb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_ClusterOperationStatus_descriptor,
        new java.lang.String[] { "State", "InnerState", "Details", "StateStartTime", });
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor,
        new java.lang.String[] { "ClusterName", "ClusterUuid", "Status", "StatusHistory", "OperationType", "Description", "Labels", "Warnings", });
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_descriptor =
      internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_dataproc_v1_ClusterOperationMetadata_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
