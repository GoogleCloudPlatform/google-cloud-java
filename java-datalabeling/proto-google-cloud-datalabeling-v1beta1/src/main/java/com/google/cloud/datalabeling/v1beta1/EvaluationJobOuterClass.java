/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

package com.google.cloud.datalabeling.v1beta1;

public final class EvaluationJobOuterClass {
  private EvaluationJobOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/datalabeling/v1beta1/eval"
          + "uation_job.proto\022!google.cloud.datalabel"
          + "ing.v1beta1\032\034google/api/annotations.prot"
          + "o\032\031google/api/resource.proto\032/google/clo"
          + "ud/datalabeling/v1beta1/dataset.proto\0322g"
          + "oogle/cloud/datalabeling/v1beta1/evaluat"
          + "ion.proto\032?google/cloud/datalabeling/v1b"
          + "eta1/human_annotation_config.proto\032\037goog"
          + "le/protobuf/timestamp.proto\032\027google/rpc/"
          + "status.proto\"\342\004\n\rEvaluationJob\022\014\n\004name\030\001"
          + " \001(\t\022\023\n\013description\030\002 \001(\t\022E\n\005state\030\003 \001(\016"
          + "26.google.cloud.datalabeling.v1beta1.Eva"
          + "luationJob.State\022\020\n\010schedule\030\004 \001(\t\022\025\n\rmo"
          + "del_version\030\005 \001(\t\022U\n\025evaluation_job_conf"
          + "ig\030\006 \001(\01326.google.cloud.datalabeling.v1b"
          + "eta1.EvaluationJobConfig\022\033\n\023annotation_s"
          + "pec_set\030\007 \001(\t\022\"\n\032label_missing_ground_tr"
          + "uth\030\010 \001(\010\022<\n\010attempts\030\t \003(\0132*.google.clo"
          + "ud.datalabeling.v1beta1.Attempt\022/\n\013creat"
          + "e_time\030\n \001(\0132\032.google.protobuf.Timestamp"
          + "\"S\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\r\n\tSCHE"
          + "DULED\020\001\022\013\n\007RUNNING\020\002\022\n\n\006PAUSED\020\003\022\013\n\007STOP"
          + "PED\020\004:b\352A_\n)datalabeling.googleapis.com/"
          + "EvaluationJob\0222projects/{project}/evalua"
          + "tionJobs/{evaluation_job}\"\215\007\n\023Evaluation"
          + "JobConfig\022c\n\033image_classification_config"
          + "\030\004 \001(\0132<.google.cloud.datalabeling.v1bet"
          + "a1.ImageClassificationConfigH\000\022U\n\024boundi"
          + "ng_poly_config\030\005 \001(\01325.google.cloud.data"
          + "labeling.v1beta1.BoundingPolyConfigH\000\022a\n"
          + "\032text_classification_config\030\010 \001(\0132;.goog"
          + "le.cloud.datalabeling.v1beta1.TextClassi"
          + "ficationConfigH\000\022D\n\014input_config\030\001 \001(\0132."
          + ".google.cloud.datalabeling.v1beta1.Input"
          + "Config\022N\n\021evaluation_config\030\002 \001(\01323.goog"
          + "le.cloud.datalabeling.v1beta1.Evaluation"
          + "Config\022Y\n\027human_annotation_config\030\003 \001(\0132"
          + "8.google.cloud.datalabeling.v1beta1.Huma"
          + "nAnnotationConfig\022l\n\024bigquery_import_key"
          + "s\030\t \003(\0132N.google.cloud.datalabeling.v1be"
          + "ta1.EvaluationJobConfig.BigqueryImportKe"
          + "ysEntry\022\025\n\rexample_count\030\n \001(\005\022!\n\031exampl"
          + "e_sample_percentage\030\013 \001(\001\022`\n\033evaluation_"
          + "job_alert_config\030\r \001(\0132;.google.cloud.da"
          + "talabeling.v1beta1.EvaluationJobAlertCon"
          + "fig\0329\n\027BigqueryImportKeysEntry\022\013\n\003key\030\001 "
          + "\001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B!\n\037human_annotati"
          + "on_request_config\"X\n\030EvaluationJobAlertC"
          + "onfig\022\r\n\005email\030\001 \001(\t\022-\n%min_acceptable_m"
          + "ean_average_precision\030\002 \001(\001\"i\n\007Attempt\0220"
          + "\n\014attempt_time\030\001 \001(\0132\032.google.protobuf.T"
          + "imestamp\022,\n\020partial_failures\030\002 \003(\0132\022.goo"
          + "gle.rpc.StatusB\347\001\n%com.google.cloud.data"
          + "labeling.v1beta1P\001ZMgoogle.golang.org/ge"
          + "nproto/googleapis/cloud/datalabeling/v1b"
          + "eta1;datalabeling\252\002!Google.Cloud.DataLab"
          + "eling.V1Beta1\312\002!Google\\Cloud\\DataLabelin"
          + "g\\V1beta1\352\002$Google::Cloud::DataLabeling:"
          + ":V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.getDescriptor(),
              com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EvaluationJob_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "State",
              "Schedule",
              "ModelVersion",
              "EvaluationJobConfig",
              "AnnotationSpecSet",
              "LabelMissingGroundTruth",
              "Attempts",
              "CreateTime",
            });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor,
            new java.lang.String[] {
              "ImageClassificationConfig",
              "BoundingPolyConfig",
              "TextClassificationConfig",
              "InputConfig",
              "EvaluationConfig",
              "HumanAnnotationConfig",
              "BigqueryImportKeys",
              "ExampleCount",
              "ExampleSamplePercentage",
              "EvaluationJobAlertConfig",
              "HumanAnnotationRequestConfig",
            });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobConfig_BigqueryImportKeysEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EvaluationJobAlertConfig_descriptor,
            new java.lang.String[] {
              "Email", "MinAcceptableMeanAveragePrecision",
            });
    internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_Attempt_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Attempt_descriptor,
            new java.lang.String[] {
              "AttemptTime", "PartialFailures",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.DatasetOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.EvaluationOuterClass.getDescriptor();
    com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
