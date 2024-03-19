// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/io.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class IoProto {
  private IoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_AvroSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_AvroSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CsvSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CsvSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GcsSource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_BigQuerySource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_BigQueryDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CsvDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CsvDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_TFRecordDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_TFRecordDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1beta1/io.pro" +
      "to\022\037google.cloud.aiplatform.v1beta1\032\037goo" +
      "gle/api/field_behavior.proto\"Q\n\nAvroSour" +
      "ce\022C\n\ngcs_source\030\001 \001(\0132*.google.cloud.ai" +
      "platform.v1beta1.GcsSourceB\003\340A\002\"P\n\tCsvSo" +
      "urce\022C\n\ngcs_source\030\001 \001(\0132*.google.cloud." +
      "aiplatform.v1beta1.GcsSourceB\003\340A\002\"\036\n\tGcs" +
      "Source\022\021\n\004uris\030\001 \003(\tB\003\340A\002\"0\n\016GcsDestinat" +
      "ion\022\036\n\021output_uri_prefix\030\001 \001(\tB\003\340A\002\"(\n\016B" +
      "igQuerySource\022\026\n\tinput_uri\030\001 \001(\tB\003\340A\002\".\n" +
      "\023BigQueryDestination\022\027\n\noutput_uri\030\001 \001(\t" +
      "B\003\340A\002\"_\n\016CsvDestination\022M\n\017gcs_destinati" +
      "on\030\001 \001(\0132/.google.cloud.aiplatform.v1bet" +
      "a1.GcsDestinationB\003\340A\002\"d\n\023TFRecordDestin" +
      "ation\022M\n\017gcs_destination\030\001 \001(\0132/.google." +
      "cloud.aiplatform.v1beta1.GcsDestinationB" +
      "\003\340A\002\"7\n\034ContainerRegistryDestination\022\027\n\n" +
      "output_uri\030\001 \001(\tB\003\340A\002B\336\001\n#com.google.clo" +
      "ud.aiplatform.v1beta1B\007IoProtoP\001ZCcloud." +
      "google.com/go/aiplatform/apiv1beta1/aipl" +
      "atformpb;aiplatformpb\252\002\037Google.Cloud.AIP" +
      "latform.V1Beta1\312\002\037Google\\Cloud\\AIPlatfor" +
      "m\\V1beta1\352\002\"Google::Cloud::AIPlatform::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_AvroSource_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_AvroSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_AvroSource_descriptor,
        new java.lang.String[] { "GcsSource", });
    internal_static_google_cloud_aiplatform_v1beta1_CsvSource_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CsvSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CsvSource_descriptor,
        new java.lang.String[] { "GcsSource", });
    internal_static_google_cloud_aiplatform_v1beta1_GcsSource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GcsSource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GcsSource_descriptor,
        new java.lang.String[] { "Uris", });
    internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GcsDestination_descriptor,
        new java.lang.String[] { "OutputUriPrefix", });
    internal_static_google_cloud_aiplatform_v1beta1_BigQuerySource_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_BigQuerySource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_BigQuerySource_descriptor,
        new java.lang.String[] { "InputUri", });
    internal_static_google_cloud_aiplatform_v1beta1_BigQueryDestination_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_BigQueryDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_BigQueryDestination_descriptor,
        new java.lang.String[] { "OutputUri", });
    internal_static_google_cloud_aiplatform_v1beta1_CsvDestination_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_CsvDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CsvDestination_descriptor,
        new java.lang.String[] { "GcsDestination", });
    internal_static_google_cloud_aiplatform_v1beta1_TFRecordDestination_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_TFRecordDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_TFRecordDestination_descriptor,
        new java.lang.String[] { "GcsDestination", });
    internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ContainerRegistryDestination_descriptor,
        new java.lang.String[] { "OutputUri", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
