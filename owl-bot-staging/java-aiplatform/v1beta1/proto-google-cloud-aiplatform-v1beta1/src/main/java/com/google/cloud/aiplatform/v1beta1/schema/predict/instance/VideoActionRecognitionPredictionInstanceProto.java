// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/instance/video_action_recognition.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1.schema.predict.instance;

public final class VideoActionRecognitionPredictionInstanceProto {
  private VideoActionRecognitionPredictionInstanceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nVgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/instance/video_action_recogniti" +
      "on.proto\0227google.cloud.aiplatform.v1beta" +
      "1.schema.predict.instance\"\204\001\n(VideoActio" +
      "nRecognitionPredictionInstance\022\017\n\007conten" +
      "t\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\022\032\n\022time_segme" +
      "nt_start\030\003 \001(\t\022\030\n\020time_segment_end\030\004 \001(\t" +
      "B\373\002\n;com.google.cloud.aiplatform.v1beta1" +
      ".schema.predict.instanceB-VideoActionRec" +
      "ognitionPredictionInstanceProtoP\001ZWcloud" +
      ".google.com/go/aiplatform/apiv1beta1/sch" +
      "ema/predict/instance/instancepb;instance" +
      "pb\252\0027Google.Cloud.AIPlatform.V1Beta1.Sch" +
      "ema.Predict.Instance\312\0027Google\\Cloud\\AIPl" +
      "atform\\V1beta1\\Schema\\Predict\\Instance\352\002" +
      "=Google::Cloud::AIPlatform::V1beta1::Sch" +
      "ema::Predict::Instanceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_instance_VideoActionRecognitionPredictionInstance_descriptor,
        new java.lang.String[] { "Content", "MimeType", "TimeSegmentStart", "TimeSegmentEnd", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
