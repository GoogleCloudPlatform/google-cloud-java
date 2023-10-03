/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/schema/predict/prediction/text_extraction.proto

package com.google.cloud.aiplatform.v1beta1.schema.predict.prediction;

public final class TextExtractionPredictionResultProto {
  private TextExtractionPredictionResultProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextExtractionPredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextExtractionPredictionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nOgoogle/cloud/aiplatform/v1beta1/schema"
          + "/predict/prediction/text_extraction.prot"
          + "o\0229google.cloud.aiplatform.v1beta1.schem"
          + "a.predict.prediction\"\237\001\n\036TextExtractionP"
          + "redictionResult\022\013\n\003ids\030\001 \003(\003\022\025\n\rdisplay_"
          + "names\030\002 \003(\t\022\"\n\032text_segment_start_offset"
          + "s\030\003 \003(\003\022 \n\030text_segment_end_offsets\030\004 \003("
          + "\003\022\023\n\013confidences\030\005 \003(\002B\377\002\n=com.google.cl"
          + "oud.aiplatform.v1beta1.schema.predict.pr"
          + "edictionB#TextExtractionPredictionResult"
          + "ProtoP\001Z]cloud.google.com/go/aiplatform/"
          + "apiv1beta1/schema/predict/prediction/pre"
          + "dictionpb;predictionpb\252\0029Google.Cloud.AI"
          + "Platform.V1Beta1.Schema.Predict.Predicti"
          + "on\312\0029Google\\Cloud\\AIPlatform\\V1beta1\\Sch"
          + "ema\\Predict\\Prediction\352\002?Google::Cloud::"
          + "AIPlatform::V1beta1::Schema::Predict::Pr"
          + "edictionb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextExtractionPredictionResult_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextExtractionPredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_schema_predict_prediction_TextExtractionPredictionResult_descriptor,
            new java.lang.String[] {
              "Ids",
              "DisplayNames",
              "TextSegmentStartOffsets",
              "TextSegmentEndOffsets",
              "Confidences",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
