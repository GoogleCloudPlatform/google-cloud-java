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
// source: google/devtools/cloudbuild/v2/cloudbuild.proto

package com.google.cloudbuild.v2;

public final class CloudBuildProto {
  private CloudBuildProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudbuild_v2_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudbuild_v2_OperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/devtools/cloudbuild/v2/cloudbui"
          + "ld.proto\022\035google.devtools.cloudbuild.v2\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032\031google/api/resource.proto\032\037goog"
          + "le/protobuf/timestamp.proto\"\200\002\n\021Operatio"
          + "nMetadata\0224\n\013create_time\030\001 \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022\023\n\006ta"
          + "rget\030\003 \001(\tB\003\340A\003\022\021\n\004verb\030\004 \001(\tB\003\340A\003\022\033\n\016st"
          + "atus_message\030\005 \001(\tB\003\340A\003\022#\n\026requested_can"
          + "cellation\030\006 \001(\010B\003\340A\003\022\030\n\013api_version\030\007 \001("
          + "\tB\003\340A\003\"\222\002\n\"RunWorkflowCustomOperationMet"
          + "adata\0224\n\013create_time\030\001 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0221\n\010end_time\030\002 \001(\0132\032."
          + "google.protobuf.TimestampB\003\340A\003\022\021\n\004verb\030\003"
          + " \001(\tB\003\340A\003\022#\n\026requested_cancellation\030\004 \001("
          + "\010B\003\340A\003\022\030\n\013api_version\030\005 \001(\tB\003\340A\003\022\023\n\006targ"
          + "et\030\006 \001(\tB\003\340A\003\022\034\n\017pipeline_run_id\030\007 \001(\tB\003"
          + "\340A\003B\243\005\n\030com.google.cloudbuild.v2B\017CloudB"
          + "uildProtoP\001Z>cloud.google.com/go/cloudbu"
          + "ild/apiv2/cloudbuildpb;cloudbuildpb\242\002\003GC"
          + "B\252\002\032Google.Cloud.CloudBuild.V2\312\002\025Google\\"
          + "Cloud\\Build\\V2\352\002\030Google::Cloud::Build::V"
          + "2\352AN\n\036compute.googleapis.com/Network\022,pr"
          + "ojects/{project}/global/networks/{networ"
          + "k}\352AY\n!iam.googleapis.com/ServiceAccount"
          + "\0224projects/{project}/serviceAccounts/{se"
          + "rvice_account}\352AJ\n#secretmanager.googlea"
          + "pis.com/Secret\022#projects/{project}/secre"
          + "ts/{secret}\352Ad\n*secretmanager.googleapis"
          + ".com/SecretVersion\0226projects/{project}/s"
          + "ecrets/{secret}/versions/{version}\352A|\n0c"
          + "loudbuild.googleapis.com/githubEnterpris"
          + "eConfig\022Hprojects/{project}/locations/{l"
          + "ocation}/githubEnterpriseConfigs/{config"
          + "}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_cloudbuild_v2_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_cloudbuild_v2_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudbuild_v2_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
    internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_cloudbuild_v2_RunWorkflowCustomOperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Verb",
              "RequestedCancellation",
              "ApiVersion",
              "Target",
              "PipelineRunId",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
