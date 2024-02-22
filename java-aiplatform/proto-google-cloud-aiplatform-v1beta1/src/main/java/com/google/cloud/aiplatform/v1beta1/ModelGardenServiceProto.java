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
// source: google/cloud/aiplatform/v1beta1/model_garden_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public final class ModelGardenServiceProto {
  private ModelGardenServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n:google/cloud/aiplatform/v1beta1/model_"
          + "garden_service.proto\022\037google.cloud.aipla"
          + "tform.v1beta1\032\034google/api/annotations.pr"
          + "oto\032\027google/api/client.proto\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0325google/cloud/aiplatform/v1beta"
          + "1/publisher_model.proto\"\276\001\n\030GetPublisher"
          + "ModelRequest\022>\n\004name\030\001 \001(\tB0\340A\002\372A*\n(aipl"
          + "atform.googleapis.com/PublisherModel\022\032\n\r"
          + "language_code\030\002 \001(\tB\003\340A\001\022F\n\004view\030\003 \001(\01623"
          + ".google.cloud.aiplatform.v1beta1.Publish"
          + "erModelViewB\003\340A\001\"\362\001\n\032ListPublisherModels"
          + "Request\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\023\n\006filter\030\002"
          + " \001(\tB\003\340A\001\022\026\n\tpage_size\030\003 \001(\005B\003\340A\001\022\027\n\npag"
          + "e_token\030\004 \001(\tB\003\340A\001\022F\n\004view\030\005 \001(\01623.googl"
          + "e.cloud.aiplatform.v1beta1.PublisherMode"
          + "lViewB\003\340A\001\022\025\n\010order_by\030\006 \001(\tB\003\340A\001\022\032\n\rlan"
          + "guage_code\030\007 \001(\tB\003\340A\001\"\201\001\n\033ListPublisherM"
          + "odelsResponse\022I\n\020publisher_models\030\001 \003(\0132"
          + "/.google.cloud.aiplatform.v1beta1.Publis"
          + "herModel\022\027\n\017next_page_token\030\002 \001(\t*\241\001\n\022Pu"
          + "blisherModelView\022$\n PUBLISHER_MODEL_VIEW"
          + "_UNSPECIFIED\020\000\022\036\n\032PUBLISHER_MODEL_VIEW_B"
          + "ASIC\020\001\022\035\n\031PUBLISHER_MODEL_VIEW_FULL\020\002\022&\n"
          + "\"PUBLISHER_MODEL_VERSION_VIEW_BASIC\020\0032\346\003"
          + "\n\022ModelGardenService\022\265\001\n\021GetPublisherMod"
          + "el\0229.google.cloud.aiplatform.v1beta1.Get"
          + "PublisherModelRequest\032/.google.cloud.aip"
          + "latform.v1beta1.PublisherModel\"4\332A\004name\202"
          + "\323\344\223\002\'\022%/v1beta1/{name=publishers/*/model"
          + "s/*}\022\310\001\n\023ListPublisherModels\022;.google.cl"
          + "oud.aiplatform.v1beta1.ListPublisherMode"
          + "lsRequest\032<.google.cloud.aiplatform.v1be"
          + "ta1.ListPublisherModelsResponse\"6\332A\006pare"
          + "nt\202\323\344\223\002\'\022%/v1beta1/{parent=publishers/*}"
          + "/models\032M\312A\031aiplatform.googleapis.com\322A."
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atformB\356\001\n#com.google.cloud.aiplatform.v"
          + "1beta1B\027ModelGardenServiceProtoP\001ZCcloud"
          + ".google.com/go/aiplatform/apiv1beta1/aip"
          + "latformpb;aiplatformpb\252\002\037Google.Cloud.AI"
          + "Platform.V1Beta1\312\002\037Google\\Cloud\\AIPlatfo"
          + "rm\\V1beta1\352\002\"Google::Cloud::AIPlatform::"
          + "V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.PublisherModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GetPublisherModelRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode", "View",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "View", "OrderBy", "LanguageCode",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ListPublisherModelsResponse_descriptor,
            new java.lang.String[] {
              "PublisherModels", "NextPageToken",
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
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.PublisherModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
