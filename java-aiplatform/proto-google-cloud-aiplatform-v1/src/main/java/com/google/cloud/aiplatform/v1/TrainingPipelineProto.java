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
// source: google/cloud/aiplatform/v1/training_pipeline.proto

package com.google.cloud.aiplatform.v1;

public final class TrainingPipelineProto {
  private TrainingPipelineProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TrainingPipeline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TrainingPipeline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TrainingPipeline_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TrainingPipeline_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_InputDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_InputDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FractionSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FractionSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FilterSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FilterSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredefinedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredefinedSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TimestampSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TimestampSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StratifiedSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StratifiedSplit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/aiplatform/v1/training_pi"
          + "peline.proto\022\032google.cloud.aiplatform.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\0320google/cloud/aipla"
          + "tform/v1/encryption_spec.proto\032#google/c"
          + "loud/aiplatform/v1/io.proto\032&google/clou"
          + "d/aiplatform/v1/model.proto\032/google/clou"
          + "d/aiplatform/v1/pipeline_state.proto\032\034go"
          + "ogle/protobuf/struct.proto\032\037google/proto"
          + "buf/timestamp.proto\032\027google/rpc/status.p"
          + "roto\"\216\010\n\020TrainingPipeline\022\021\n\004name\030\001 \001(\tB"
          + "\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022F\n\021input"
          + "_data_config\030\003 \001(\0132+.google.cloud.aiplat"
          + "form.v1.InputDataConfig\022%\n\030training_task"
          + "_definition\030\004 \001(\tB\003\340A\002\0229\n\024training_task_"
          + "inputs\030\005 \001(\0132\026.google.protobuf.ValueB\003\340A"
          + "\002\022;\n\026training_task_metadata\030\006 \001(\0132\026.goog"
          + "le.protobuf.ValueB\003\340A\003\022:\n\017model_to_uploa"
          + "d\030\007 \001(\0132!.google.cloud.aiplatform.v1.Mod"
          + "el\022\025\n\010model_id\030\026 \001(\tB\003\340A\001\022\031\n\014parent_mode"
          + "l\030\025 \001(\tB\003\340A\001\022=\n\005state\030\t \001(\0162).google.clo"
          + "ud.aiplatform.v1.PipelineStateB\003\340A\003\022&\n\005e"
          + "rror\030\n \001(\0132\022.google.rpc.StatusB\003\340A\003\0224\n\013c"
          + "reate_time\030\013 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\0223\n\nstart_time\030\014 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\0221\n\010end_time\030\r \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\0224\n\013upd"
          + "ate_time\030\016 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\022H\n\006labels\030\017 \003(\01328.google.cloud.a"
          + "iplatform.v1.TrainingPipeline.LabelsEntr"
          + "y\022C\n\017encryption_spec\030\022 \001(\0132*.google.clou"
          + "d.aiplatform.v1.EncryptionSpec\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:~\352"
          + "A{\n*aiplatform.googleapis.com/TrainingPi"
          + "peline\022Mprojects/{project}/locations/{lo"
          + "cation}/trainingPipelines/{training_pipe"
          + "line}\"\257\005\n\017InputDataConfig\022C\n\016fraction_sp"
          + "lit\030\002 \001(\0132).google.cloud.aiplatform.v1.F"
          + "ractionSplitH\000\022?\n\014filter_split\030\003 \001(\0132\'.g"
          + "oogle.cloud.aiplatform.v1.FilterSplitH\000\022"
          + "G\n\020predefined_split\030\004 \001(\0132+.google.cloud"
          + ".aiplatform.v1.PredefinedSplitH\000\022E\n\017time"
          + "stamp_split\030\005 \001(\0132*.google.cloud.aiplatf"
          + "orm.v1.TimestampSplitH\000\022G\n\020stratified_sp"
          + "lit\030\014 \001(\0132+.google.cloud.aiplatform.v1.S"
          + "tratifiedSplitH\000\022E\n\017gcs_destination\030\010 \001("
          + "\0132*.google.cloud.aiplatform.v1.GcsDestin"
          + "ationH\001\022O\n\024bigquery_destination\030\n \001(\0132/."
          + "google.cloud.aiplatform.v1.BigQueryDesti"
          + "nationH\001\022\027\n\ndataset_id\030\001 \001(\tB\003\340A\002\022\032\n\022ann"
          + "otations_filter\030\006 \001(\t\022\035\n\025annotation_sche"
          + "ma_uri\030\t \001(\t\022\026\n\016saved_query_id\030\007 \001(\t\022!\n\031"
          + "persist_ml_use_assignment\030\013 \001(\010B\007\n\005split"
          + "B\r\n\013destination\"^\n\rFractionSplit\022\031\n\021trai"
          + "ning_fraction\030\001 \001(\001\022\033\n\023validation_fracti"
          + "on\030\002 \001(\001\022\025\n\rtest_fraction\030\003 \001(\001\"e\n\013Filte"
          + "rSplit\022\034\n\017training_filter\030\001 \001(\tB\003\340A\002\022\036\n\021"
          + "validation_filter\030\002 \001(\tB\003\340A\002\022\030\n\013test_fil"
          + "ter\030\003 \001(\tB\003\340A\002\"#\n\017PredefinedSplit\022\020\n\003key"
          + "\030\001 \001(\tB\003\340A\002\"q\n\016TimestampSplit\022\031\n\021trainin"
          + "g_fraction\030\001 \001(\001\022\033\n\023validation_fraction\030"
          + "\002 \001(\001\022\025\n\rtest_fraction\030\003 \001(\001\022\020\n\003key\030\004 \001("
          + "\tB\003\340A\002\"r\n\017StratifiedSplit\022\031\n\021training_fr"
          + "action\030\001 \001(\001\022\033\n\023validation_fraction\030\002 \001("
          + "\001\022\025\n\rtest_fraction\030\003 \001(\001\022\020\n\003key\030\004 \001(\tB\003\340"
          + "A\002B\323\001\n\036com.google.cloud.aiplatform.v1B\025T"
          + "rainingPipelineProtoP\001Z>cloud.google.com"
          + "/go/aiplatform/apiv1/aiplatformpb;aiplat"
          + "formpb\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Go"
          + "ogle\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud"
          + "::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ModelProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_TrainingPipeline_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TrainingPipeline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TrainingPipeline_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "InputDataConfig",
              "TrainingTaskDefinition",
              "TrainingTaskInputs",
              "TrainingTaskMetadata",
              "ModelToUpload",
              "ModelId",
              "ParentModel",
              "State",
              "Error",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Labels",
              "EncryptionSpec",
            });
    internal_static_google_cloud_aiplatform_v1_TrainingPipeline_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_TrainingPipeline_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_TrainingPipeline_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TrainingPipeline_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_InputDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_InputDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_InputDataConfig_descriptor,
            new java.lang.String[] {
              "FractionSplit",
              "FilterSplit",
              "PredefinedSplit",
              "TimestampSplit",
              "StratifiedSplit",
              "GcsDestination",
              "BigqueryDestination",
              "DatasetId",
              "AnnotationsFilter",
              "AnnotationSchemaUri",
              "SavedQueryId",
              "PersistMlUseAssignment",
              "Split",
              "Destination",
            });
    internal_static_google_cloud_aiplatform_v1_FractionSplit_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FractionSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FractionSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction",
            });
    internal_static_google_cloud_aiplatform_v1_FilterSplit_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FilterSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FilterSplit_descriptor,
            new java.lang.String[] {
              "TrainingFilter", "ValidationFilter", "TestFilter",
            });
    internal_static_google_cloud_aiplatform_v1_PredefinedSplit_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_PredefinedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredefinedSplit_descriptor,
            new java.lang.String[] {
              "Key",
            });
    internal_static_google_cloud_aiplatform_v1_TimestampSplit_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_TimestampSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TimestampSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    internal_static_google_cloud_aiplatform_v1_StratifiedSplit_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_StratifiedSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StratifiedSplit_descriptor,
            new java.lang.String[] {
              "TrainingFraction", "ValidationFraction", "TestFraction", "Key",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ModelProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PipelineStateProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
