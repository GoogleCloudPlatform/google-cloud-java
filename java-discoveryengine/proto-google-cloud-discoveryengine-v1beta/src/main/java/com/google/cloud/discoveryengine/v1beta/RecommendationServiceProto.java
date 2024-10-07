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
// source: google/cloud/discoveryengine/v1beta/recommendation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1beta;

public final class RecommendationServiceProto {
  private RecommendationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_UserLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n@google/cloud/discoveryengine/v1beta/re"
          + "commendation_service.proto\022#google.cloud"
          + ".discoveryengine.v1beta\032\034google/api/anno"
          + "tations.proto\032\027google/api/client.proto\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\0322google/cloud/discove"
          + "ryengine/v1beta/document.proto\0324google/c"
          + "loud/discoveryengine/v1beta/user_event.p"
          + "roto\032\034google/protobuf/struct.proto\"\214\004\n\020R"
          + "ecommendRequest\022L\n\016serving_config\030\001 \001(\tB"
          + "4\340A\002\372A.\n,discoveryengine.googleapis.com/"
          + "ServingConfig\022G\n\nuser_event\030\002 \001(\0132..goog"
          + "le.cloud.discoveryengine.v1beta.UserEven"
          + "tB\003\340A\002\022\021\n\tpage_size\030\003 \001(\005\022\016\n\006filter\030\004 \001("
          + "\t\022\025\n\rvalidate_only\030\005 \001(\010\022Q\n\006params\030\006 \003(\013"
          + "2A.google.cloud.discoveryengine.v1beta.R"
          + "ecommendRequest.ParamsEntry\022Z\n\013user_labe"
          + "ls\030\010 \003(\0132E.google.cloud.discoveryengine."
          + "v1beta.RecommendRequest.UserLabelsEntry\032"
          + "E\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001"
          + "(\0132\026.google.protobuf.Value:\0028\001\0321\n\017UserLa"
          + "belsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028"
          + "\001\"\324\003\n\021RecommendResponse\022\\\n\007results\030\001 \003(\013"
          + "2K.google.cloud.discoveryengine.v1beta.R"
          + "ecommendResponse.RecommendationResult\022\031\n"
          + "\021attribution_token\030\002 \001(\t\022\023\n\013missing_ids\030"
          + "\003 \003(\t\022\025\n\rvalidate_only\030\004 \001(\010\032\231\002\n\024Recomme"
          + "ndationResult\022\n\n\002id\030\001 \001(\t\022?\n\010document\030\002 "
          + "\001(\0132-.google.cloud.discoveryengine.v1bet"
          + "a.Document\022k\n\010metadata\030\003 \003(\0132Y.google.cl"
          + "oud.discoveryengine.v1beta.RecommendResp"
          + "onse.RecommendationResult.MetadataEntry\032"
          + "G\n\rMetadataEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002"
          + " \001(\0132\026.google.protobuf.Value:\0028\0012\243\004\n\025Rec"
          + "ommendationService\022\265\003\n\tRecommend\0225.googl"
          + "e.cloud.discoveryengine.v1beta.Recommend"
          + "Request\0326.google.cloud.discoveryengine.v"
          + "1beta.RecommendResponse\"\270\002\202\323\344\223\002\261\002\"W/v1be"
          + "ta/{serving_config=projects/*/locations/"
          + "*/dataStores/*/servingConfigs/*}:recomme"
          + "nd:\001*Zj\"e/v1beta/{serving_config=project"
          + "s/*/locations/*/collections/*/dataStores"
          + "/*/servingConfigs/*}:recommend:\001*Zg\"b/v1"
          + "beta/{serving_config=projects/*/location"
          + "s/*/collections/*/engines/*/servingConfi"
          + "gs/*}:recommend:\001*\032R\312A\036discoveryengine.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\241\002\n\'com.google.cl"
          + "oud.discoveryengine.v1betaB\032Recommendati"
          + "onServiceProtoP\001ZQcloud.google.com/go/di"
          + "scoveryengine/apiv1beta/discoveryenginep"
          + "b;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002#"
          + "Google.Cloud.DiscoveryEngine.V1Beta\312\002#Go"
          + "ogle\\Cloud\\DiscoveryEngine\\V1beta\352\002&Goog"
          + "le::Cloud::DiscoveryEngine::V1betab\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig",
              "UserEvent",
              "PageSize",
              "Filter",
              "ValidateOnly",
              "Params",
              "UserLabels",
            });
    internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_UserLabelsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_RecommendRequest_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_descriptor,
            new java.lang.String[] {
              "Results", "AttributionToken", "MissingIds", "ValidateOnly",
            });
    internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_descriptor,
            new java.lang.String[] {
              "Id", "Document", "Metadata",
            });
    internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_MetadataEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_RecommendResponse_RecommendationResult_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
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
    com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.UserEventProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
