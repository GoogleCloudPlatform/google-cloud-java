/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/automl/v1beta1/text_extraction.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.automl.v1beta1;

public final class TextExtraction {
  private TextExtraction() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/automl/v1beta1/text_extra"
          + "ction.proto\022\033google.cloud.automl.v1beta1"
          + "\032.google/cloud/automl/v1beta1/text_segme"
          + "nt.proto\"y\n\030TextExtractionAnnotation\022@\n\014"
          + "text_segment\030\003 \001(\0132(.google.cloud.automl"
          + ".v1beta1.TextSegmentH\000\022\r\n\005score\030\001 \001(\002B\014\n"
          + "\nannotation\"\227\002\n\037TextExtractionEvaluation"
          + "Metrics\022\016\n\006au_prc\030\001 \001(\002\022w\n\032confidence_me"
          + "trics_entries\030\002 \003(\0132S.google.cloud.autom"
          + "l.v1beta1.TextExtractionEvaluationMetric"
          + "s.ConfidenceMetricsEntry\032k\n\026ConfidenceMe"
          + "tricsEntry\022\034\n\024confidence_threshold\030\001 \001(\002"
          + "\022\016\n\006recall\030\003 \001(\002\022\021\n\tprecision\030\004 \001(\002\022\020\n\010f"
          + "1_score\030\005 \001(\002B\233\001\n\037com.google.cloud.autom"
          + "l.v1beta1P\001Z7cloud.google.com/go/automl/"
          + "apiv1beta1/automlpb;automlpb\312\002\033Google\\Cl"
          + "oud\\AutoMl\\V1beta1\352\002\036Google::Cloud::Auto"
          + "ML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1beta1.TextSegmentProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionAnnotation_descriptor,
            new java.lang.String[] {
              "TextSegment", "Score", "Annotation",
            });
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor,
            new java.lang.String[] {
              "AuPrc", "ConfidenceMetricsEntries",
            });
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_TextExtractionEvaluationMetrics_ConfidenceMetricsEntry_descriptor,
            new java.lang.String[] {
              "ConfidenceThreshold", "Recall", "Precision", "F1Score",
            });
    com.google.cloud.automl.v1beta1.TextSegmentProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
