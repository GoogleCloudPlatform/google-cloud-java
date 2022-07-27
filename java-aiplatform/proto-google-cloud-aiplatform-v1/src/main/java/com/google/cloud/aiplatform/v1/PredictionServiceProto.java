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
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RawPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExplainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExplainResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplainResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1/prediction_"
          + "service.proto\022\032google.cloud.aiplatform.v"
          + "1\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/httpbody.proto\032\031go"
          + "ogle/api/resource.proto\032,google/cloud/ai"
          + "platform/v1/explanation.proto\032\034google/pr"
          + "otobuf/struct.proto\"\252\001\n\016PredictRequest\022<"
          + "\n\010endpoint\030\001 \001(\tB*\340A\002\372A$\n\"aiplatform.goo"
          + "gleapis.com/Endpoint\022.\n\tinstances\030\002 \003(\0132"
          + "\026.google.protobuf.ValueB\003\340A\002\022*\n\nparamete"
          + "rs\030\003 \001(\0132\026.google.protobuf.Value\"\321\001\n\017Pre"
          + "dictResponse\022+\n\013predictions\030\001 \003(\0132\026.goog"
          + "le.protobuf.Value\022\031\n\021deployed_model_id\030\002"
          + " \001(\t\0226\n\005model\030\003 \001(\tB\'\340A\003\372A!\n\037aiplatform."
          + "googleapis.com/Model\022\035\n\020model_version_id"
          + "\030\005 \001(\tB\003\340A\003\022\037\n\022model_display_name\030\004 \001(\tB"
          + "\003\340A\003\"z\n\021RawPredictRequest\022<\n\010endpoint\030\001 "
          + "\001(\tB*\340A\002\372A$\n\"aiplatform.googleapis.com/E"
          + "ndpoint\022\'\n\thttp_body\030\002 \001(\0132\024.google.api."
          + "HttpBody\"\235\002\n\016ExplainRequest\022<\n\010endpoint\030"
          + "\001 \001(\tB*\340A\002\372A$\n\"aiplatform.googleapis.com"
          + "/Endpoint\022.\n\tinstances\030\002 \003(\0132\026.google.pr"
          + "otobuf.ValueB\003\340A\002\022*\n\nparameters\030\004 \001(\0132\026."
          + "google.protobuf.Value\022V\n\031explanation_spe"
          + "c_override\030\005 \001(\01323.google.cloud.aiplatfo"
          + "rm.v1.ExplanationSpecOverride\022\031\n\021deploye"
          + "d_model_id\030\003 \001(\t\"\230\001\n\017ExplainResponse\022=\n\014"
          + "explanations\030\001 \003(\0132\'.google.cloud.aiplat"
          + "form.v1.Explanation\022\031\n\021deployed_model_id"
          + "\030\002 \001(\t\022+\n\013predictions\030\003 \003(\0132\026.google.pro"
          + "tobuf.Value2\274\005\n\021PredictionService\022\310\001\n\007Pr"
          + "edict\022*.google.cloud.aiplatform.v1.Predi"
          + "ctRequest\032+.google.cloud.aiplatform.v1.P"
          + "redictResponse\"d\202\323\344\223\002>\"9/v1/{endpoint=pr"
          + "ojects/*/locations/*/endpoints/*}:predic"
          + "t:\001*\332A\035endpoint,instances,parameters\022\257\001\n"
          + "\nRawPredict\022-.google.cloud.aiplatform.v1"
          + ".RawPredictRequest\032\024.google.api.HttpBody"
          + "\"\\\202\323\344\223\002A\"</v1/{endpoint=projects/*/locat"
          + "ions/*/endpoints/*}:rawPredict:\001*\332A\022endp"
          + "oint,http_body\022\332\001\n\007Explain\022*.google.clou"
          + "d.aiplatform.v1.ExplainRequest\032+.google."
          + "cloud.aiplatform.v1.ExplainResponse\"v\202\323\344"
          + "\223\002>\"9/v1/{endpoint=projects/*/locations/"
          + "*/endpoints/*}:explain:\001*\332A/endpoint,ins"
          + "tances,parameters,deployed_model_id\032M\312A\031"
          + "aiplatform.googleapis.com\322A.https://www."
          + "googleapis.com/auth/cloud-platformB\332\001\n\036c"
          + "om.google.cloud.aiplatform.v1B\026Predictio"
          + "nServiceProtoP\001ZDgoogle.golang.org/genpr"
          + "oto/googleapis/cloud/aiplatform/v1;aipla"
          + "tform\252\002\032Google.Cloud.AIPlatform.V1\312\002\032Goo"
          + "gle\\Cloud\\AIPlatform\\V1\352\002\035Google::Cloud:"
          + ":AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Predictions", "DeployedModelId", "Model", "ModelVersionId", "ModelDisplayName",
            });
    internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_RawPredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "HttpBody",
            });
    internal_static_google_cloud_aiplatform_v1_ExplainRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ExplainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExplainRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters", "ExplanationSpecOverride", "DeployedModelId",
            });
    internal_static_google_cloud_aiplatform_v1_ExplainResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ExplainResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExplainResponse_descriptor,
            new java.lang.String[] {
              "Explanations", "DeployedModelId", "Predictions",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
