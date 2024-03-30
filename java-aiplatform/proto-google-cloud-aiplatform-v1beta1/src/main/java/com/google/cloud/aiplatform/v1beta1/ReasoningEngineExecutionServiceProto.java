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
// source: google/cloud/aiplatform/v1beta1/reasoning_engine_execution_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ReasoningEngineExecutionServiceProto {
  private ReasoningEngineExecutionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/cloud/aiplatform/v1beta1/reason"
          + "ing_engine_execution_service.proto\022\037goog"
          + "le.cloud.aiplatform.v1beta1\032\034google/api/"
          + "annotations.proto\032\027google/api/client.pro"
          + "to\032\037google/api/field_behavior.proto\032\031goo"
          + "gle/api/resource.proto\032\034google/protobuf/"
          + "struct.proto\"\213\001\n\033QueryReasoningEngineReq"
          + "uest\022?\n\004name\030\001 \001(\tB1\340A\002\372A+\n)aiplatform.g"
          + "oogleapis.com/ReasoningEngine\022+\n\005input\030\002"
          + " \001(\0132\027.google.protobuf.StructB\003\340A\001\"F\n\034Qu"
          + "eryReasoningEngineResponse\022&\n\006output\030\001 \001"
          + "(\0132\026.google.protobuf.Value2\322\002\n\037Reasoning"
          + "EngineExecutionService\022\337\001\n\024QueryReasonin"
          + "gEngine\022<.google.cloud.aiplatform.v1beta"
          + "1.QueryReasoningEngineRequest\032=.google.c"
          + "loud.aiplatform.v1beta1.QueryReasoningEn"
          + "gineResponse\"J\202\323\344\223\002D\"?/v1beta1/{name=pro"
          + "jects/*/locations/*/reasoningEngines/*}:"
          + "query:\001*\032M\312A\031aiplatform.googleapis.com\322A"
          + ".https://www.googleapis.com/auth/cloud-p"
          + "latformB\373\001\n#com.google.cloud.aiplatform."
          + "v1beta1B$ReasoningEngineExecutionService"
          + "ProtoP\001ZCcloud.google.com/go/aiplatform/"
          + "apiv1beta1/aiplatformpb;aiplatformpb\252\002\037G"
          + "oogle.Cloud.AIPlatform.V1Beta1\312\002\037Google\\"
          + "Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cloud"
          + "::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineRequest_descriptor,
            new java.lang.String[] {
              "Name", "Input",
            });
    internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_QueryReasoningEngineResponse_descriptor,
            new java.lang.String[] {
              "Output",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
