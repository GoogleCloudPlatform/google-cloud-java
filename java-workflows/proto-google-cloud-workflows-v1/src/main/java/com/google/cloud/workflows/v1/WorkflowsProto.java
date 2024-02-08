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
// source: google/cloud/workflows/v1/workflows.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.workflows.v1;

public final class WorkflowsProto {
  private WorkflowsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_Workflow_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_Workflow_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_Workflow_StateError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_Workflow_StateError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_Workflow_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_Workflow_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_Workflow_UserEnvVarsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_Workflow_UserEnvVarsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_ListWorkflowsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_ListWorkflowsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_ListWorkflowsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_ListWorkflowsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_GetWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_GetWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_DeleteWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_DeleteWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_workflows_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_workflows_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/workflows/v1/workflows.pr"
          + "oto\022\031google.cloud.workflows.v1\032\034google/a"
          + "pi/annotations.proto\032\027google/api/client."
          + "proto\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032#google/longru"
          + "nning/operations.proto\032\033google/protobuf/"
          + "empty.proto\032 google/protobuf/field_mask."
          + "proto\032\037google/protobuf/timestamp.proto\"\340"
          + "\t\n\010Workflow\022\014\n\004name\030\001 \001(\t\022\023\n\013description"
          + "\030\002 \001(\t\022=\n\005state\030\003 \001(\0162).google.cloud.wor"
          + "kflows.v1.Workflow.StateB\003\340A\003\022\030\n\013revisio"
          + "n_id\030\004 \001(\tB\003\340A\003\0224\n\013create_time\030\005 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003\0224\n\013update_"
          + "time\030\006 \001(\0132\032.google.protobuf.TimestampB\003"
          + "\340A\003\022=\n\024revision_create_time\030\007 \001(\0132\032.goog"
          + "le.protobuf.TimestampB\003\340A\003\022?\n\006labels\030\010 \003"
          + "(\0132/.google.cloud.workflows.v1.Workflow."
          + "LabelsEntry\022\027\n\017service_account\030\t \001(\t\022\031\n\017"
          + "source_contents\030\n \001(\tH\000\022B\n\017crypto_key_na"
          + "me\030\013 \001(\tB)\340A\001\372A#\n!cloudkms.googleapis.co"
          + "m/CryptoKey\022H\n\013state_error\030\014 \001(\0132..googl"
          + "e.cloud.workflows.v1.Workflow.StateError"
          + "B\003\340A\003\022M\n\016call_log_level\030\r \001(\01620.google.c"
          + "loud.workflows.v1.Workflow.CallLogLevelB"
          + "\003\340A\001\022P\n\ruser_env_vars\030\016 \003(\01324.google.clo"
          + "ud.workflows.v1.Workflow.UserEnvVarsEntr"
          + "yB\003\340A\001\032\215\001\n\nStateError\022\017\n\007details\030\001 \001(\t\022A"
          + "\n\004type\030\002 \001(\01623.google.cloud.workflows.v1"
          + ".Workflow.StateError.Type\"+\n\004Type\022\024\n\020TYP"
          + "E_UNSPECIFIED\020\000\022\r\n\tKMS_ERROR\020\001\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0322\n"
          + "\020UserEnvVarsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001\";\n\005State\022\025\n\021STATE_UNSPECIFIED\020"
          + "\000\022\n\n\006ACTIVE\020\001\022\017\n\013UNAVAILABLE\020\002\"d\n\014CallLo"
          + "gLevel\022\036\n\032CALL_LOG_LEVEL_UNSPECIFIED\020\000\022\021"
          + "\n\rLOG_ALL_CALLS\020\001\022\023\n\017LOG_ERRORS_ONLY\020\002\022\014"
          + "\n\010LOG_NONE\020\003:d\352Aa\n!workflows.googleapis."
          + "com/Workflow\022<projects/{project}/locatio"
          + "ns/{location}/workflows/{workflow}B\r\n\013so"
          + "urce_code\"\232\001\n\024ListWorkflowsRequest\0229\n\006pa"
          + "rent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis"
          + ".com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage"
          + "_token\030\003 \001(\t\022\016\n\006filter\030\004 \001(\t\022\020\n\010order_by"
          + "\030\005 \001(\t\"}\n\025ListWorkflowsResponse\0226\n\tworkf"
          + "lows\030\001 \003(\0132#.google.cloud.workflows.v1.W"
          + "orkflow\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unre"
          + "achable\030\003 \003(\t\"g\n\022GetWorkflowRequest\0227\n\004n"
          + "ame\030\001 \001(\tB)\340A\002\372A#\n!workflows.googleapis."
          + "com/Workflow\022\030\n\013revision_id\030\002 \001(\tB\003\340A\001\"\250"
          + "\001\n\025CreateWorkflowRequest\0229\n\006parent\030\001 \001(\t"
          + "B)\340A\002\372A#\n!locations.googleapis.com/Locat"
          + "ion\022:\n\010workflow\030\002 \001(\0132#.google.cloud.wor"
          + "kflows.v1.WorkflowB\003\340A\002\022\030\n\013workflow_id\030\003"
          + " \001(\tB\003\340A\002\"P\n\025DeleteWorkflowRequest\0227\n\004na"
          + "me\030\001 \001(\tB)\340A\002\372A#\n!workflows.googleapis.c"
          + "om/Workflow\"\204\001\n\025UpdateWorkflowRequest\022:\n"
          + "\010workflow\030\001 \001(\0132#.google.cloud.workflows"
          + ".v1.WorkflowB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032"
          + ".google.protobuf.FieldMask\"\245\001\n\021Operation"
          + "Metadata\022/\n\013create_time\030\001 \001(\0132\032.google.p"
          + "rotobuf.Timestamp\022,\n\010end_time\030\002 \001(\0132\032.go"
          + "ogle.protobuf.Timestamp\022\016\n\006target\030\003 \001(\t\022"
          + "\014\n\004verb\030\004 \001(\t\022\023\n\013api_version\030\005 \001(\t2\307\010\n\tW"
          + "orkflows\022\262\001\n\rListWorkflows\022/.google.clou"
          + "d.workflows.v1.ListWorkflowsRequest\0320.go"
          + "ogle.cloud.workflows.v1.ListWorkflowsRes"
          + "ponse\">\332A\006parent\202\323\344\223\002/\022-/v1/{parent=proj"
          + "ects/*/locations/*}/workflows\022\237\001\n\013GetWor"
          + "kflow\022-.google.cloud.workflows.v1.GetWor"
          + "kflowRequest\032#.google.cloud.workflows.v1"
          + ".Workflow\"<\332A\004name\202\323\344\223\002/\022-/v1/{name=proj"
          + "ects/*/locations/*/workflows/*}\022\340\001\n\016Crea"
          + "teWorkflow\0220.google.cloud.workflows.v1.C"
          + "reateWorkflowRequest\032\035.google.longrunnin"
          + "g.Operation\"}\312A\035\n\010Workflow\022\021OperationMet"
          + "adata\332A\033parent,workflow,workflow_id\202\323\344\223\002"
          + "9\"-/v1/{parent=projects/*/locations/*}/w"
          + "orkflows:\010workflow\022\314\001\n\016DeleteWorkflow\0220."
          + "google.cloud.workflows.v1.DeleteWorkflow"
          + "Request\032\035.google.longrunning.Operation\"i"
          + "\312A*\n\025google.protobuf.Empty\022\021OperationMet"
          + "adata\332A\004name\202\323\344\223\002/*-/v1/{name=projects/*"
          + "/locations/*/workflows/*}\022\342\001\n\016UpdateWork"
          + "flow\0220.google.cloud.workflows.v1.UpdateW"
          + "orkflowRequest\032\035.google.longrunning.Oper"
          + "ation\"\177\312A\035\n\010Workflow\022\021OperationMetadata\332"
          + "A\024workflow,update_mask\202\323\344\223\002B26/v1/{workf"
          + "low.name=projects/*/locations/*/workflow"
          + "s/*}:\010workflow\032L\312A\030workflows.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\347\001\n\035com.google.cloud.workfl"
          + "ows.v1B\016WorkflowsProtoP\001Z;cloud.google.c"
          + "om/go/workflows/apiv1/workflowspb;workfl"
          + "owspb\352Av\n!cloudkms.googleapis.com/Crypto"
          + "Key\022Qprojects/{project}/locations/{locat"
          + "ion}/keyRings/{keyRing}/cryptoKeys/{cryp"
          + "toKey}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_workflows_v1_Workflow_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_workflows_v1_Workflow_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_Workflow_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "State",
              "RevisionId",
              "CreateTime",
              "UpdateTime",
              "RevisionCreateTime",
              "Labels",
              "ServiceAccount",
              "SourceContents",
              "CryptoKeyName",
              "StateError",
              "CallLogLevel",
              "UserEnvVars",
              "SourceCode",
            });
    internal_static_google_cloud_workflows_v1_Workflow_StateError_descriptor =
        internal_static_google_cloud_workflows_v1_Workflow_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_workflows_v1_Workflow_StateError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_Workflow_StateError_descriptor,
            new java.lang.String[] {
              "Details", "Type",
            });
    internal_static_google_cloud_workflows_v1_Workflow_LabelsEntry_descriptor =
        internal_static_google_cloud_workflows_v1_Workflow_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_workflows_v1_Workflow_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_Workflow_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_workflows_v1_Workflow_UserEnvVarsEntry_descriptor =
        internal_static_google_cloud_workflows_v1_Workflow_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_workflows_v1_Workflow_UserEnvVarsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_Workflow_UserEnvVarsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_workflows_v1_ListWorkflowsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_workflows_v1_ListWorkflowsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_ListWorkflowsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_workflows_v1_ListWorkflowsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_workflows_v1_ListWorkflowsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_ListWorkflowsResponse_descriptor,
            new java.lang.String[] {
              "Workflows", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_workflows_v1_GetWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_workflows_v1_GetWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_GetWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Name", "RevisionId",
            });
    internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_CreateWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Workflow", "WorkflowId",
            });
    internal_static_google_cloud_workflows_v1_DeleteWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_workflows_v1_DeleteWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_DeleteWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_UpdateWorkflowRequest_descriptor,
            new java.lang.String[] {
              "Workflow", "UpdateMask",
            });
    internal_static_google_cloud_workflows_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_workflows_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_workflows_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "EndTime", "Target", "Verb", "ApiVersion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
