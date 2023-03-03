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
// source: google/cloud/aiplatform/v1/pipeline_service.proto

package com.google.cloud.aiplatform.v1;

public final class PipelineServiceProto {
  private PipelineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CancelTrainingPipelineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CancelTrainingPipelineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreatePipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreatePipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetPipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetPipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListPipelineJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListPipelineJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListPipelineJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListPipelineJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeletePipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeletePipelineJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CancelPipelineJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CancelPipelineJobRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/pipeline_se"
          + "rvice.proto\022\032google.cloud.aiplatform.v1\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032-goog"
          + "le/cloud/aiplatform/v1/pipeline_job.prot"
          + "o\0322google/cloud/aiplatform/v1/training_p"
          + "ipeline.proto\032#google/longrunning/operat"
          + "ions.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\"\250\001\n\035Cr"
          + "eateTrainingPipelineRequest\0229\n\006parent\030\001 "
          + "\001(\tB)\340A\002\372A#\n!locations.googleapis.com/Lo"
          + "cation\022L\n\021training_pipeline\030\002 \001(\0132,.goog"
          + "le.cloud.aiplatform.v1.TrainingPipelineB"
          + "\003\340A\002\"^\n\032GetTrainingPipelineRequest\022@\n\004na"
          + "me\030\001 \001(\tB2\340A\002\372A,\n*aiplatform.googleapis."
          + "com/TrainingPipeline\"\277\001\n\034ListTrainingPip"
          + "elinesRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!l"
          + "ocations.googleapis.com/Location\022\016\n\006filt"
          + "er\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_toke"
          + "n\030\004 \001(\t\022-\n\tread_mask\030\005 \001(\0132\032.google.prot"
          + "obuf.FieldMask\"\202\001\n\035ListTrainingPipelines"
          + "Response\022H\n\022training_pipelines\030\001 \003(\0132,.g"
          + "oogle.cloud.aiplatform.v1.TrainingPipeli"
          + "ne\022\027\n\017next_page_token\030\002 \001(\t\"a\n\035DeleteTra"
          + "iningPipelineRequest\022@\n\004name\030\001 \001(\tB2\340A\002\372"
          + "A,\n*aiplatform.googleapis.com/TrainingPi"
          + "peline\"a\n\035CancelTrainingPipelineRequest\022"
          + "@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*aiplatform.google"
          + "apis.com/TrainingPipeline\"\262\001\n\030CreatePipe"
          + "lineJobRequest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!"
          + "locations.googleapis.com/Location\022B\n\014pip"
          + "eline_job\030\002 \001(\0132\'.google.cloud.aiplatfor"
          + "m.v1.PipelineJobB\003\340A\002\022\027\n\017pipeline_job_id"
          + "\030\003 \001(\t\"T\n\025GetPipelineJobRequest\022;\n\004name\030"
          + "\001 \001(\tB-\340A\002\372A\'\n%aiplatform.googleapis.com"
          + "/PipelineJob\"\314\001\n\027ListPipelineJobsRequest"
          + "\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.goog"
          + "leapis.com/Location\022\016\n\006filter\030\002 \001(\t\022\021\n\tp"
          + "age_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022\020\n\010or"
          + "der_by\030\006 \001(\t\022-\n\tread_mask\030\007 \001(\0132\032.google"
          + ".protobuf.FieldMask\"s\n\030ListPipelineJobsR"
          + "esponse\022>\n\rpipeline_jobs\030\001 \003(\0132\'.google."
          + "cloud.aiplatform.v1.PipelineJob\022\027\n\017next_"
          + "page_token\030\002 \001(\t\"W\n\030DeletePipelineJobReq"
          + "uest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%aiplatform.g"
          + "oogleapis.com/PipelineJob\"W\n\030CancelPipel"
          + "ineJobRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%aip"
          + "latform.googleapis.com/PipelineJob2\374\020\n\017P"
          + "ipelineService\022\356\001\n\026CreateTrainingPipelin"
          + "e\0229.google.cloud.aiplatform.v1.CreateTra"
          + "iningPipelineRequest\032,.google.cloud.aipl"
          + "atform.v1.TrainingPipeline\"k\202\323\344\223\002J\"5/v1/"
          + "{parent=projects/*/locations/*}/training"
          + "Pipelines:\021training_pipeline\332A\030parent,tr"
          + "aining_pipeline\022\301\001\n\023GetTrainingPipeline\022"
          + "6.google.cloud.aiplatform.v1.GetTraining"
          + "PipelineRequest\032,.google.cloud.aiplatfor"
          + "m.v1.TrainingPipeline\"D\202\323\344\223\0027\0225/v1/{name"
          + "=projects/*/locations/*/trainingPipeline"
          + "s/*}\332A\004name\022\324\001\n\025ListTrainingPipelines\0228."
          + "google.cloud.aiplatform.v1.ListTrainingP"
          + "ipelinesRequest\0329.google.cloud.aiplatfor"
          + "m.v1.ListTrainingPipelinesResponse\"F\202\323\344\223"
          + "\0027\0225/v1/{parent=projects/*/locations/*}/"
          + "trainingPipelines\332A\006parent\022\353\001\n\026DeleteTra"
          + "iningPipeline\0229.google.cloud.aiplatform."
          + "v1.DeleteTrainingPipelineRequest\032\035.googl"
          + "e.longrunning.Operation\"w\202\323\344\223\0027*5/v1/{na"
          + "me=projects/*/locations/*/trainingPipeli"
          + "nes/*}\332A\004name\312A0\n\025google.protobuf.Empty\022"
          + "\027DeleteOperationMetadata\022\273\001\n\026CancelTrain"
          + "ingPipeline\0229.google.cloud.aiplatform.v1"
          + ".CancelTrainingPipelineRequest\032\026.google."
          + "protobuf.Empty\"N\202\323\344\223\002A\"</v1/{name=projec"
          + "ts/*/locations/*/trainingPipelines/*}:ca"
          + "ncel:\001*\332A\004name\022\340\001\n\021CreatePipelineJob\0224.g"
          + "oogle.cloud.aiplatform.v1.CreatePipeline"
          + "JobRequest\032\'.google.cloud.aiplatform.v1."
          + "PipelineJob\"l\202\323\344\223\002@\"0/v1/{parent=project"
          + "s/*/locations/*}/pipelineJobs:\014pipeline_"
          + "job\332A#parent,pipeline_job,pipeline_job_i"
          + "d\022\255\001\n\016GetPipelineJob\0221.google.cloud.aipl"
          + "atform.v1.GetPipelineJobRequest\032\'.google"
          + ".cloud.aiplatform.v1.PipelineJob\"?\202\323\344\223\0022"
          + "\0220/v1/{name=projects/*/locations/*/pipel"
          + "ineJobs/*}\332A\004name\022\300\001\n\020ListPipelineJobs\0223"
          + ".google.cloud.aiplatform.v1.ListPipeline"
          + "JobsRequest\0324.google.cloud.aiplatform.v1"
          + ".ListPipelineJobsResponse\"A\202\323\344\223\0022\0220/v1/{"
          + "parent=projects/*/locations/*}/pipelineJ"
          + "obs\332A\006parent\022\334\001\n\021DeletePipelineJob\0224.goo"
          + "gle.cloud.aiplatform.v1.DeletePipelineJo"
          + "bRequest\032\035.google.longrunning.Operation\""
          + "r\202\323\344\223\0022*0/v1/{name=projects/*/locations/"
          + "*/pipelineJobs/*}\332A\004name\312A0\n\025google.prot"
          + "obuf.Empty\022\027DeleteOperationMetadata\022\254\001\n\021"
          + "CancelPipelineJob\0224.google.cloud.aiplatf"
          + "orm.v1.CancelPipelineJobRequest\032\026.google"
          + ".protobuf.Empty\"I\202\323\344\223\002<\"7/v1/{name=proje"
          + "cts/*/locations/*/pipelineJobs/*}:cancel"
          + ":\001*\332A\004name\032M\312A\031aiplatform.googleapis.com"
          + "\322A.https://www.googleapis.com/auth/cloud"
          + "-platformB\322\001\n\036com.google.cloud.aiplatfor"
          + "m.v1B\024PipelineServiceProtoP\001Z>cloud.goog"
          + "le.com/go/aiplatform/apiv1/aiplatformpb;"
          + "aiplatformpb\252\002\032Google.Cloud.AIPlatform.V"
          + "1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google:"
          + ":Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.Pipeline.getDescriptor(),
              com.google.cloud.aiplatform.v1.TrainingPipelineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Parent", "TrainingPipeline",
            });
    internal_static_google_cloud_aiplatform_v1_GetTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_GetTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListTrainingPipelinesResponse_descriptor,
            new java.lang.String[] {
              "TrainingPipelines", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_DeleteTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_CancelTrainingPipelineRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_CancelTrainingPipelineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CancelTrainingPipelineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_CreatePipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_CreatePipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreatePipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PipelineJob", "PipelineJobId",
            });
    internal_static_google_cloud_aiplatform_v1_GetPipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_GetPipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetPipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListPipelineJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_ListPipelineJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListPipelineJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListPipelineJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_ListPipelineJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListPipelineJobsResponse_descriptor,
            new java.lang.String[] {
              "PipelineJobs", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_DeletePipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_DeletePipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeletePipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_CancelPipelineJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_CancelPipelineJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CancelPipelineJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.Pipeline.getDescriptor();
    com.google.cloud.aiplatform.v1.TrainingPipelineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
