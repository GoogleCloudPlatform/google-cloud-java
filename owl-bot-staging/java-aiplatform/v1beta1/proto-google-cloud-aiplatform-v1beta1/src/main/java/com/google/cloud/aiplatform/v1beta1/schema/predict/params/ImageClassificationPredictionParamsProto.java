// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/params/image_classification.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.params;

public final class ImageClassificationPredictionParamsProto {
  private ImageClassificationPredictionParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageClassificationPredictionParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageClassificationPredictionParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nPgoogle/cloud/aiplatform/v1beta1/schema" +
      "/predict/params/image_classification.pro" +
      "to\0225google.cloud.aiplatform.v1beta1.sche" +
      "ma.predict.params\"\\\n#ImageClassification" +
      "PredictionParams\022\034\n\024confidence_threshold" +
      "\030\001 \001(\002\022\027\n\017max_predictions\030\002 \001(\005B\350\002\n9com." +
      "google.cloud.aiplatform.v1beta1.schema.p" +
      "redict.paramsB(ImageClassificationPredic" +
      "tionParamsProtoP\001ZQcloud.google.com/go/a" +
      "iplatform/apiv1beta1/schema/predict/para" +
      "ms/paramspb;paramspb\252\0025Google.Cloud.AIPl" +
      "atform.V1Beta1.Schema.Predict.Params\312\0025G" +
      "oogle\\Cloud\\AIPlatform\\V1beta1\\Schema\\Pr" +
      "edict\\Params\352\002;Google::Cloud::AIPlatform" +
      "::V1beta1::Schema::Predict::Paramsb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageClassificationPredictionParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageClassificationPredictionParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_schema_predict_params_ImageClassificationPredictionParams_descriptor,
        new java.lang.String[] { "ConfidenceThreshold", "MaxPredictions", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
