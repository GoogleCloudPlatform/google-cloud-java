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
// source: google/cloud/aiplatform/v1/nas_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class NasJobProto {
  private NasJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJob_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJob_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasTrialDetail_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasTrialDetail_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_MetricSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_MetricSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_SearchTrialSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_SearchTrialSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_TrainTrialSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_TrainTrialSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobOutput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasJobOutput_MultiTrialJobOutput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasJobOutput_MultiTrialJobOutput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NasTrial_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NasTrial_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/nas_job.pro"
          + "to\022\032google.cloud.aiplatform.v1\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\032+google/cloud/aiplatform/v1/c"
          + "ustom_job.proto\0320google/cloud/aiplatform"
          + "/v1/encryption_spec.proto\032*google/cloud/"
          + "aiplatform/v1/job_state.proto\032&google/cl"
          + "oud/aiplatform/v1/study.proto\032\037google/pr"
          + "otobuf/timestamp.proto\032\027google/rpc/statu"
          + "s.proto\"\275\006\n\006NasJob\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022A\n\014nas_job_spec"
          + "\030\004 \001(\0132&.google.cloud.aiplatform.v1.NasJ"
          + "obSpecB\003\340A\002\022E\n\016nas_job_output\030\005 \001(\0132(.go"
          + "ogle.cloud.aiplatform.v1.NasJobOutputB\003\340"
          + "A\003\0228\n\005state\030\006 \001(\0162$.google.cloud.aiplatf"
          + "orm.v1.JobStateB\003\340A\003\0224\n\013create_time\030\007 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\0223\n\nst"
          + "art_time\030\010 \001(\0132\032.google.protobuf.Timesta"
          + "mpB\003\340A\003\0221\n\010end_time\030\t \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\0224\n\013update_time\030\n \001(\0132"
          + "\032.google.protobuf.TimestampB\003\340A\003\022&\n\005erro"
          + "r\030\013 \001(\0132\022.google.rpc.StatusB\003\340A\003\022>\n\006labe"
          + "ls\030\014 \003(\0132..google.cloud.aiplatform.v1.Na"
          + "sJob.LabelsEntry\022C\n\017encryption_spec\030\r \001("
          + "\0132*.google.cloud.aiplatform.v1.Encryptio"
          + "nSpec\022/\n enable_restricted_image_trainin"
          + "g\030\016 \001(\010B\005\030\001\340A\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001:`\352A]\n aiplatform.g"
          + "oogleapis.com/NasJob\0229projects/{project}"
          + "/locations/{location}/nasJobs/{nas_job}\""
          + "\275\002\n\016NasTrialDetail\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\022\n"
          + "\nparameters\030\002 \001(\t\022:\n\014search_trial\030\003 \001(\0132"
          + "$.google.cloud.aiplatform.v1.NasTrial\0229\n"
          + "\013train_trial\030\004 \001(\0132$.google.cloud.aiplat"
          + "form.v1.NasTrial:\214\001\352A\210\001\n(aiplatform.goog"
          + "leapis.com/NasTrialDetail\022\\projects/{pro"
          + "ject}/locations/{location}/nasJobs/{nas_"
          + "job}/nasTrialDetails/{nas_trial_detail}\""
          + "\245\n\n\nNasJobSpec\022d\n\032multi_trial_algorithm_"
          + "spec\030\002 \001(\0132>.google.cloud.aiplatform.v1."
          + "NasJobSpec.MultiTrialAlgorithmSpecH\000\022\031\n\021"
          + "resume_nas_job_id\030\003 \001(\t\022\031\n\021search_space_"
          + "spec\030\001 \001(\t\032\344\010\n\027MultiTrialAlgorithmSpec\022q"
          + "\n\025multi_trial_algorithm\030\001 \001(\0162R.google.c"
          + "loud.aiplatform.v1.NasJobSpec.MultiTrial"
          + "AlgorithmSpec.MultiTrialAlgorithm\022Y\n\006met"
          + "ric\030\002 \001(\0132I.google.cloud.aiplatform.v1.N"
          + "asJobSpec.MultiTrialAlgorithmSpec.Metric"
          + "Spec\022n\n\021search_trial_spec\030\003 \001(\0132N.google"
          + ".cloud.aiplatform.v1.NasJobSpec.MultiTri"
          + "alAlgorithmSpec.SearchTrialSpecB\003\340A\002\022g\n\020"
          + "train_trial_spec\030\004 \001(\0132M.google.cloud.ai"
          + "platform.v1.NasJobSpec.MultiTrialAlgorit"
          + "hmSpec.TrainTrialSpec\032\316\001\n\nMetricSpec\022\026\n\t"
          + "metric_id\030\001 \001(\tB\003\340A\002\022e\n\004goal\030\002 \001(\0162R.goo"
          + "gle.cloud.aiplatform.v1.NasJobSpec.Multi"
          + "TrialAlgorithmSpec.MetricSpec.GoalTypeB\003"
          + "\340A\002\"A\n\010GoalType\022\031\n\025GOAL_TYPE_UNSPECIFIED"
          + "\020\000\022\014\n\010MAXIMIZE\020\001\022\014\n\010MINIMIZE\020\002\032\305\001\n\017Searc"
          + "hTrialSpec\022M\n\025search_trial_job_spec\030\001 \001("
          + "\0132).google.cloud.aiplatform.v1.CustomJob"
          + "SpecB\003\340A\002\022\034\n\017max_trial_count\030\002 \001(\005B\003\340A\002\022"
          + "%\n\030max_parallel_trial_count\030\003 \001(\005B\003\340A\002\022\036"
          + "\n\026max_failed_trial_count\030\004 \001(\005\032\235\001\n\016Train"
          + "TrialSpec\022L\n\024train_trial_job_spec\030\001 \001(\0132"
          + ").google.cloud.aiplatform.v1.CustomJobSp"
          + "ecB\003\340A\002\022%\n\030max_parallel_trial_count\030\002 \001("
          + "\005B\003\340A\002\022\026\n\tfrequency\030\003 \001(\005B\003\340A\002\"i\n\023MultiT"
          + "rialAlgorithm\022%\n!MULTI_TRIAL_ALGORITHM_U"
          + "NSPECIFIED\020\000\022\032\n\026REINFORCEMENT_LEARNING\020\001"
          + "\022\017\n\013GRID_SEARCH\020\002B\024\n\022nas_algorithm_spec\""
          + "\230\002\n\014NasJobOutput\022c\n\026multi_trial_job_outp"
          + "ut\030\001 \001(\0132<.google.cloud.aiplatform.v1.Na"
          + "sJobOutput.MultiTrialJobOutputB\003\340A\003H\000\032\230\001"
          + "\n\023MultiTrialJobOutput\022@\n\rsearch_trials\030\001"
          + " \003(\0132$.google.cloud.aiplatform.v1.NasTri"
          + "alB\003\340A\003\022?\n\014train_trials\030\002 \003(\0132$.google.c"
          + "loud.aiplatform.v1.NasTrialB\003\340A\003B\010\n\006outp"
          + "ut\"\364\002\n\010NasTrial\022\017\n\002id\030\001 \001(\tB\003\340A\003\022>\n\005stat"
          + "e\030\002 \001(\0162*.google.cloud.aiplatform.v1.Nas"
          + "Trial.StateB\003\340A\003\022G\n\021final_measurement\030\003 "
          + "\001(\0132\'.google.cloud.aiplatform.v1.Measure"
          + "mentB\003\340A\003\0223\n\nstart_time\030\004 \001(\0132\032.google.p"
          + "rotobuf.TimestampB\003\340A\003\0221\n\010end_time\030\005 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\"f\n\005Sta"
          + "te\022\025\n\021STATE_UNSPECIFIED\020\000\022\r\n\tREQUESTED\020\001"
          + "\022\n\n\006ACTIVE\020\002\022\014\n\010STOPPING\020\003\022\r\n\tSUCCEEDED\020"
          + "\004\022\016\n\nINFEASIBLE\020\005B\311\001\n\036com.google.cloud.a"
          + "iplatform.v1B\013NasJobProtoP\001Z>cloud.googl"
          + "e.com/go/aiplatform/apiv1/aiplatformpb;a"
          + "iplatformpb\252\002\032Google.Cloud.AIPlatform.V1"
          + "\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google::"
          + "Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.CustomJobProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.StudyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_NasJob_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NasJob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJob_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "NasJobSpec",
              "NasJobOutput",
              "State",
              "CreateTime",
              "StartTime",
              "EndTime",
              "UpdateTime",
              "Error",
              "Labels",
              "EncryptionSpec",
              "EnableRestrictedImageTraining",
            });
    internal_static_google_cloud_aiplatform_v1_NasJob_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_NasJob_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NasJob_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJob_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_NasTrialDetail_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_NasTrialDetail_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasTrialDetail_descriptor,
            new java.lang.String[] {
              "Name", "Parameters", "SearchTrial", "TrainTrial",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobSpec_descriptor,
            new java.lang.String[] {
              "MultiTrialAlgorithmSpec", "ResumeNasJobId", "SearchSpaceSpec", "NasAlgorithmSpec",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_NasJobSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_descriptor,
            new java.lang.String[] {
              "MultiTrialAlgorithm", "Metric", "SearchTrialSpec", "TrainTrialSpec",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_MetricSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_MetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_MetricSpec_descriptor,
            new java.lang.String[] {
              "MetricId", "Goal",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_SearchTrialSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_SearchTrialSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_SearchTrialSpec_descriptor,
            new java.lang.String[] {
              "SearchTrialJobSpec", "MaxTrialCount", "MaxParallelTrialCount", "MaxFailedTrialCount",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_TrainTrialSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_TrainTrialSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobSpec_MultiTrialAlgorithmSpec_TrainTrialSpec_descriptor,
            new java.lang.String[] {
              "TrainTrialJobSpec", "MaxParallelTrialCount", "Frequency",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobOutput_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_NasJobOutput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobOutput_descriptor,
            new java.lang.String[] {
              "MultiTrialJobOutput", "Output",
            });
    internal_static_google_cloud_aiplatform_v1_NasJobOutput_MultiTrialJobOutput_descriptor =
        internal_static_google_cloud_aiplatform_v1_NasJobOutput_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_NasJobOutput_MultiTrialJobOutput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasJobOutput_MultiTrialJobOutput_descriptor,
            new java.lang.String[] {
              "SearchTrials", "TrainTrials",
            });
    internal_static_google_cloud_aiplatform_v1_NasTrial_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_NasTrial_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NasTrial_descriptor,
            new java.lang.String[] {
              "Id", "State", "FinalMeasurement", "StartTime", "EndTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.CustomJobProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1.StudyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
