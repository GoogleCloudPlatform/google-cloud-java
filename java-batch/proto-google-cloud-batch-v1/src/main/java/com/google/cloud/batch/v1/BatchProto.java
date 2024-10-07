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
// source: google/cloud/batch/v1/batch.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.batch.v1;

public final class BatchProto {
  private BatchProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_ListTasksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_ListTasksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_GetTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/cloud/batch/v1/batch.proto\022\025goo"
          + "gle.cloud.batch.v1\032\034google/api/annotatio"
          + "ns.proto\032\027google/api/client.proto\032\037googl"
          + "e/api/field_behavior.proto\032\033google/api/f"
          + "ield_info.proto\032\031google/api/resource.pro"
          + "to\032\037google/cloud/batch/v1/job.proto\032 goo"
          + "gle/cloud/batch/v1/task.proto\032#google/lo"
          + "ngrunning/operations.proto\032\033google/proto"
          + "buf/empty.proto\032\037google/protobuf/timesta"
          + "mp.proto\"\233\001\n\020CreateJobRequest\0220\n\006parent\030"
          + "\001 \001(\tB \340A\002\372A\032\022\030batch.googleapis.com/Job\022"
          + "\016\n\006job_id\030\002 \001(\t\022,\n\003job\030\003 \001(\0132\032.google.cl"
          + "oud.batch.v1.JobB\003\340A\002\022\027\n\nrequest_id\030\004 \001("
          + "\tB\003\340A\001\"?\n\rGetJobRequest\022.\n\004name\030\001 \001(\tB \340"
          + "A\002\372A\032\n\030batch.googleapis.com/Job\"N\n\020Delet"
          + "eJobRequest\022\014\n\004name\030\001 \001(\t\022\023\n\006reason\030\002 \001("
          + "\tB\003\340A\001\022\027\n\nrequest_id\030\004 \001(\tB\003\340A\001\"o\n\017ListJ"
          + "obsRequest\022\016\n\006parent\030\001 \001(\t\022\016\n\006filter\030\004 \001"
          + "(\t\022\025\n\010order_by\030\005 \001(\tB\003\340A\001\022\021\n\tpage_size\030\002"
          + " \001(\005\022\022\n\npage_token\030\003 \001(\t\"j\n\020ListJobsResp"
          + "onse\022(\n\004jobs\030\001 \003(\0132\032.google.cloud.batch."
          + "v1.Job\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unrea"
          + "chable\030\003 \003(\t\"\201\001\n\020ListTasksRequest\0226\n\006par"
          + "ent\030\001 \001(\tB&\340A\002\372A \n\036batch.googleapis.com/"
          + "TaskGroup\022\016\n\006filter\030\002 \001(\t\022\021\n\tpage_size\030\003"
          + " \001(\005\022\022\n\npage_token\030\004 \001(\t\"m\n\021ListTasksRes"
          + "ponse\022*\n\005tasks\030\001 \003(\0132\033.google.cloud.batc"
          + "h.v1.Task\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013un"
          + "reachable\030\003 \003(\t\"A\n\016GetTaskRequest\022/\n\004nam"
          + "e\030\001 \001(\tB!\340A\002\372A\033\n\031batch.googleapis.com/Ta"
          + "sk\"\200\002\n\021OperationMetadata\0224\n\013create_time\030"
          + "\001 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0221"
          + "\n\010end_time\030\002 \001(\0132\032.google.protobuf.Times"
          + "tampB\003\340A\003\022\023\n\006target\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004"
          + " \001(\tB\003\340A\003\022\033\n\016status_message\030\005 \001(\tB\003\340A\003\022#"
          + "\n\026requested_cancellation\030\006 \001(\010B\003\340A\003\022\030\n\013a"
          + "pi_version\030\007 \001(\tB\003\340A\0032\266\010\n\014BatchService\022\233"
          + "\001\n\tCreateJob\022\'.google.cloud.batch.v1.Cre"
          + "ateJobRequest\032\032.google.cloud.batch.v1.Jo"
          + "b\"I\332A\021parent,job,job_id\202\323\344\223\002/\"(/v1/{pare"
          + "nt=projects/*/locations/*}/jobs:\003job\022\203\001\n"
          + "\006GetJob\022$.google.cloud.batch.v1.GetJobRe"
          + "quest\032\032.google.cloud.batch.v1.Job\"7\332A\004na"
          + "me\202\323\344\223\002*\022(/v1/{name=projects/*/locations"
          + "/*/jobs/*}\022\317\001\n\tDeleteJob\022\'.google.cloud."
          + "batch.v1.DeleteJobRequest\032\035.google.longr"
          + "unning.Operation\"z\312A@\n\025google.protobuf.E"
          + "mpty\022\'google.cloud.batch.v1.OperationMet"
          + "adata\332A\004name\202\323\344\223\002**(/v1/{name=projects/*"
          + "/locations/*/jobs/*}\022\226\001\n\010ListJobs\022&.goog"
          + "le.cloud.batch.v1.ListJobsRequest\032\'.goog"
          + "le.cloud.batch.v1.ListJobsResponse\"9\332A\006p"
          + "arent\202\323\344\223\002*\022(/v1/{parent=projects/*/loca"
          + "tions/*}/jobs\022\233\001\n\007GetTask\022%.google.cloud"
          + ".batch.v1.GetTaskRequest\032\033.google.cloud."
          + "batch.v1.Task\"L\332A\004name\202\323\344\223\002?\022=/v1/{name="
          + "projects/*/locations/*/jobs/*/taskGroups"
          + "/*/tasks/*}\022\256\001\n\tListTasks\022\'.google.cloud"
          + ".batch.v1.ListTasksRequest\032(.google.clou"
          + "d.batch.v1.ListTasksResponse\"N\332A\006parent\202"
          + "\323\344\223\002?\022=/v1/{parent=projects/*/locations/"
          + "*/jobs/*/taskGroups/*}/tasks\032H\312A\024batch.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\253\001\n\031com.google.cl"
          + "oud.batch.v1B\nBatchProtoP\001Z/cloud.google"
          + ".com/go/batch/apiv1/batchpb;batchpb\242\002\003GC"
          + "B\252\002\025Google.Cloud.Batch.V1\312\002\025Google\\Cloud"
          + "\\Batch\\V1\352\002\030Google::Cloud::Batch::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.batch.v1.JobProto.getDescriptor(),
              com.google.cloud.batch.v1.TaskProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "JobId", "Job", "RequestId",
            });
    internal_static_google_cloud_batch_v1_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "Reason", "RequestId",
            });
    internal_static_google_cloud_batch_v1_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1_ListTasksRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1_ListTasksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_ListTasksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1_ListTasksResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1_ListTasksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_ListTasksResponse_descriptor,
            new java.lang.String[] {
              "Tasks", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1_GetTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1_GetTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_GetTaskRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
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
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.batch.v1.JobProto.getDescriptor();
    com.google.cloud.batch.v1.TaskProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
