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
// source: google/cloud/batch/v1alpha/batch.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.batch.v1alpha;

public final class BatchProto {
  private BatchProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_CreateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_CreateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GetJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GetJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_CancelJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_CancelJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_CancelJobResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_CancelJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListJobsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListJobsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListJobsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListJobsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListTasksRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListTasksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListTasksResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListTasksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GetTaskRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GetTaskRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_batch_v1alpha_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_batch_v1alpha_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/batch/v1alpha/batch.proto"
          + "\022\032google.cloud.batch.v1alpha\032\034google/api"
          + "/annotations.proto\032\027google/api/client.pr"
          + "oto\032\037google/api/field_behavior.proto\032\033go"
          + "ogle/api/field_info.proto\032\031google/api/re"
          + "source.proto\032$google/cloud/batch/v1alpha"
          + "/job.proto\0323google/cloud/batch/v1alpha/r"
          + "esource_allowance.proto\032%google/cloud/ba"
          + "tch/v1alpha/task.proto\032#google/longrunni"
          + "ng/operations.proto\032\033google/protobuf/emp"
          + "ty.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\240\001\n\020"
          + "CreateJobRequest\0220\n\006parent\030\001 \001(\tB \340A\002\372A\032"
          + "\022\030batch.googleapis.com/Job\022\016\n\006job_id\030\002 \001"
          + "(\t\0221\n\003job\030\003 \001(\0132\037.google.cloud.batch.v1a"
          + "lpha.JobB\003\340A\002\022\027\n\nrequest_id\030\004 \001(\tB\003\340A\001\"?"
          + "\n\rGetJobRequest\022.\n\004name\030\001 \001(\tB \340A\002\372A\032\n\030b"
          + "atch.googleapis.com/Job\"N\n\020DeleteJobRequ"
          + "est\022\014\n\004name\030\001 \001(\t\022\023\n\006reason\030\002 \001(\tB\003\340A\001\022\027"
          + "\n\nrequest_id\030\004 \001(\tB\003\340A\001\"c\n\020CancelJobRequ"
          + "est\022.\n\004name\030\001 \001(\tB \340A\002\372A\032\n\030batch.googlea"
          + "pis.com/Job\022\037\n\nrequest_id\030\004 \001(\tB\013\340A\001\342\214\317\327"
          + "\010\002\010\001\"\023\n\021CancelJobResponse\"\234\001\n\020UpdateJobR"
          + "equest\0221\n\003job\030\001 \001(\0132\037.google.cloud.batch"
          + ".v1alpha.JobB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032"
          + ".google.protobuf.FieldMaskB\003\340A\002\022\037\n\nreque"
          + "st_id\030\003 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"o\n\017ListJobsRequ"
          + "est\022\016\n\006parent\030\001 \001(\t\022\016\n\006filter\030\004 \001(\t\022\025\n\010o"
          + "rder_by\030\005 \001(\tB\003\340A\001\022\021\n\tpage_size\030\002 \001(\005\022\022\n"
          + "\npage_token\030\003 \001(\t\"o\n\020ListJobsResponse\022-\n"
          + "\004jobs\030\001 \003(\0132\037.google.cloud.batch.v1alpha"
          + ".Job\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unreach"
          + "able\030\003 \003(\t\"\223\001\n\020ListTasksRequest\0226\n\006paren"
          + "t\030\001 \001(\tB&\340A\002\372A \n\036batch.googleapis.com/Ta"
          + "skGroup\022\016\n\006filter\030\002 \001(\t\022\020\n\010order_by\030\005 \001("
          + "\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t"
          + "\"r\n\021ListTasksResponse\022/\n\005tasks\030\001 \003(\0132 .g"
          + "oogle.cloud.batch.v1alpha.Task\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"A\n\016"
          + "GetTaskRequest\022/\n\004name\030\001 \001(\tB!\340A\002\372A\033\n\031ba"
          + "tch.googleapis.com/Task\"\360\001\n\036CreateResour"
          + "ceAllowanceRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372"
          + "A(\022&batch.googleapis.com/ResourceAllowan"
          + "ce\022\035\n\025resource_allowance_id\030\002 \001(\t\022N\n\022res"
          + "ource_allowance\030\003 \001(\0132-.google.cloud.bat"
          + "ch.v1alpha.ResourceAllowanceB\003\340A\002\022\037\n\nreq"
          + "uest_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"[\n\033GetResourc"
          + "eAllowanceRequest\022<\n\004name\030\001 \001(\tB.\340A\002\372A(\n"
          + "&batch.googleapis.com/ResourceAllowance\""
          + "\224\001\n\036DeleteResourceAllowanceRequest\022<\n\004na"
          + "me\030\001 \001(\tB.\340A\002\372A(\n&batch.googleapis.com/R"
          + "esourceAllowance\022\023\n\006reason\030\002 \001(\tB\003\340A\001\022\037\n"
          + "\nrequest_id\030\004 \001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"\220\001\n\035ListR"
          + "esourceAllowancesRequest\022>\n\006parent\030\001 \001(\t"
          + "B.\340A\002\372A(\022&batch.googleapis.com/ResourceA"
          + "llowance\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage"
          + "_token\030\003 \001(\tB\003\340A\001\"\232\001\n\036ListResourceAllowa"
          + "ncesResponse\022J\n\023resource_allowances\030\001 \003("
          + "\0132-.google.cloud.batch.v1alpha.ResourceA"
          + "llowance\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unr"
          + "eachable\030\003 \003(\t\"\307\001\n\036UpdateResourceAllowan"
          + "ceRequest\022N\n\022resource_allowance\030\001 \001(\0132-."
          + "google.cloud.batch.v1alpha.ResourceAllow"
          + "anceB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google."
          + "protobuf.FieldMaskB\003\340A\002\022\037\n\nrequest_id\030\003 "
          + "\001(\tB\013\340A\001\342\214\317\327\010\002\010\001\"\200\002\n\021OperationMetadata\0224"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\023\n\006target\030\003 \001(\tB"
          + "\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016status_messag"
          + "e\030\005 \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\006"
          + " \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001(\tB\003\340A\0032\211\026\n\014"
          + "BatchService\022\252\001\n\tCreateJob\022,.google.clou"
          + "d.batch.v1alpha.CreateJobRequest\032\037.googl"
          + "e.cloud.batch.v1alpha.Job\"N\332A\021parent,job"
          + ",job_id\202\323\344\223\0024\"-/v1alpha/{parent=projects"
          + "/*/locations/*}/jobs:\003job\022\222\001\n\006GetJob\022).g"
          + "oogle.cloud.batch.v1alpha.GetJobRequest\032"
          + "\037.google.cloud.batch.v1alpha.Job\"<\332A\004nam"
          + "e\202\323\344\223\002/\022-/v1alpha/{name=projects/*/locat"
          + "ions/*/jobs/*}\022\337\001\n\tDeleteJob\022,.google.cl"
          + "oud.batch.v1alpha.DeleteJobRequest\032\035.goo"
          + "gle.longrunning.Operation\"\204\001\312AE\n\025google."
          + "protobuf.Empty\022,google.cloud.batch.v1alp"
          + "ha.OperationMetadata\332A\004name\202\323\344\223\002/*-/v1al"
          + "pha/{name=projects/*/locations/*/jobs/*}"
          + "\022\345\001\n\tCancelJob\022,.google.cloud.batch.v1al"
          + "pha.CancelJobRequest\032\035.google.longrunnin"
          + "g.Operation\"\212\001\312AA\n\021CancelJobResponse\022,go"
          + "ogle.cloud.batch.v1alpha.OperationMetada"
          + "ta\332A\004name\202\323\344\223\0029\"4/v1alpha/{name=projects"
          + "/*/locations/*/jobs/*}:cancel:\001*\022\254\001\n\tUpd"
          + "ateJob\022,.google.cloud.batch.v1alpha.Upda"
          + "teJobRequest\032\037.google.cloud.batch.v1alph"
          + "a.Job\"P\332A\017job,update_mask\202\323\344\223\002821/v1alph"
          + "a/{job.name=projects/*/locations/*/jobs/"
          + "*}:\003job\022\245\001\n\010ListJobs\022+.google.cloud.batc"
          + "h.v1alpha.ListJobsRequest\032,.google.cloud"
          + ".batch.v1alpha.ListJobsResponse\">\332A\006pare"
          + "nt\202\323\344\223\002/\022-/v1alpha/{parent=projects/*/lo"
          + "cations/*}/jobs\022\252\001\n\007GetTask\022*.google.clo"
          + "ud.batch.v1alpha.GetTaskRequest\032 .google"
          + ".cloud.batch.v1alpha.Task\"Q\332A\004name\202\323\344\223\002D"
          + "\022B/v1alpha/{name=projects/*/locations/*/"
          + "jobs/*/taskGroups/*/tasks/*}\022\275\001\n\tListTas"
          + "ks\022,.google.cloud.batch.v1alpha.ListTask"
          + "sRequest\032-.google.cloud.batch.v1alpha.Li"
          + "stTasksResponse\"S\332A\006parent\202\323\344\223\002D\022B/v1alp"
          + "ha/{parent=projects/*/locations/*/jobs/*"
          + "/taskGroups/*}/tasks\022\220\002\n\027CreateResourceA"
          + "llowance\022:.google.cloud.batch.v1alpha.Cr"
          + "eateResourceAllowanceRequest\032-.google.cl"
          + "oud.batch.v1alpha.ResourceAllowance\"\211\001\332A"
          + "/parent,resource_allowance,resource_allo"
          + "wance_id\202\323\344\223\002Q\";/v1alpha/{parent=project"
          + "s/*/locations/*}/resourceAllowances:\022res"
          + "ource_allowance\022\312\001\n\024GetResourceAllowance"
          + "\0227.google.cloud.batch.v1alpha.GetResourc"
          + "eAllowanceRequest\032-.google.cloud.batch.v"
          + "1alpha.ResourceAllowance\"J\332A\004name\202\323\344\223\002=\022"
          + ";/v1alpha/{name=projects/*/locations/*/r"
          + "esourceAllowances/*}\022\211\002\n\027DeleteResourceA"
          + "llowance\022:.google.cloud.batch.v1alpha.De"
          + "leteResourceAllowanceRequest\032\035.google.lo"
          + "ngrunning.Operation\"\222\001\312AE\n\025google.protob"
          + "uf.Empty\022,google.cloud.batch.v1alpha.Ope"
          + "rationMetadata\332A\004name\202\323\344\223\002=*;/v1alpha/{n"
          + "ame=projects/*/locations/*/resourceAllow"
          + "ances/*}\022\335\001\n\026ListResourceAllowances\0229.go"
          + "ogle.cloud.batch.v1alpha.ListResourceAll"
          + "owancesRequest\032:.google.cloud.batch.v1al"
          + "pha.ListResourceAllowancesResponse\"L\332A\006p"
          + "arent\202\323\344\223\002=\022;/v1alpha/{parent=projects/*"
          + "/locations/*}/resourceAllowances\022\222\002\n\027Upd"
          + "ateResourceAllowance\022:.google.cloud.batc"
          + "h.v1alpha.UpdateResourceAllowanceRequest"
          + "\032-.google.cloud.batch.v1alpha.ResourceAl"
          + "lowance\"\213\001\332A\036resource_allowance,update_m"
          + "ask\202\323\344\223\002d2N/v1alpha/{resource_allowance."
          + "name=projects/*/locations/*/resourceAllo"
          + "wances/*}:\022resource_allowance\032H\312A\024batch."
          + "googleapis.com\322A.https://www.googleapis."
          + "com/auth/cloud-platformB\304\001\n\036com.google.c"
          + "loud.batch.v1alphaB\nBatchProtoP\001Z4cloud."
          + "google.com/go/batch/apiv1alpha/batchpb;b"
          + "atchpb\242\002\003GCB\252\002\032Google.Cloud.Batch.V1Alph"
          + "a\312\002\032Google\\Cloud\\Batch\\V1alpha\352\002\035Google:"
          + ":Cloud::Batch::V1alphab\006proto3"
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
              com.google.cloud.batch.v1alpha.JobProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.ResourceAllowanceProto.getDescriptor(),
              com.google.cloud.batch.v1alpha.TaskProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_batch_v1alpha_CreateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_batch_v1alpha_CreateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_CreateJobRequest_descriptor,
            new java.lang.String[] {
              "Parent", "JobId", "Job", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_GetJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_batch_v1alpha_GetJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GetJobRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_DeleteJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "Reason", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_CancelJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_batch_v1alpha_CancelJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_CancelJobRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_CancelJobResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_batch_v1alpha_CancelJobResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_CancelJobResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UpdateJobRequest_descriptor,
            new java.lang.String[] {
              "Job", "UpdateMask", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_ListJobsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_batch_v1alpha_ListJobsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListJobsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1alpha_ListJobsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_batch_v1alpha_ListJobsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListJobsResponse_descriptor,
            new java.lang.String[] {
              "Jobs", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1alpha_ListTasksRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_batch_v1alpha_ListTasksRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListTasksRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1alpha_ListTasksResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_batch_v1alpha_ListTasksResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListTasksResponse_descriptor,
            new java.lang.String[] {
              "Tasks", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1alpha_GetTaskRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_batch_v1alpha_GetTaskRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GetTaskRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_CreateResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ResourceAllowanceId", "ResourceAllowance", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_GetResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_DeleteResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "Name", "Reason", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_ListResourceAllowancesResponse_descriptor,
            new java.lang.String[] {
              "ResourceAllowances", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_UpdateResourceAllowanceRequest_descriptor,
            new java.lang.String[] {
              "ResourceAllowance", "UpdateMask", "RequestId",
            });
    internal_static_google_cloud_batch_v1alpha_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_batch_v1alpha_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_batch_v1alpha_OperationMetadata_descriptor,
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
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
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
    com.google.cloud.batch.v1alpha.JobProto.getDescriptor();
    com.google.cloud.batch.v1alpha.ResourceAllowanceProto.getDescriptor();
    com.google.cloud.batch.v1alpha.TaskProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
