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
// source: google/cloud/aiplatform/v1beta1/cached_content.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class CachedContentProto {
  private CachedContentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CachedContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CachedContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CachedContent_UsageMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CachedContent_UsageMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/aiplatform/v1beta1/cached"
          + "_content.proto\022\037google.cloud.aiplatform."
          + "v1beta1\032\037google/api/field_behavior.proto"
          + "\032\031google/api/resource.proto\032-google/clou"
          + "d/aiplatform/v1beta1/content.proto\032*goog"
          + "le/cloud/aiplatform/v1beta1/tool.proto\032\036"
          + "google/protobuf/duration.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\342\007\n\rCachedConten"
          + "t\0221\n\013expire_time\030\t \001(\0132\032.google.protobuf"
          + ".TimestampH\000\022-\n\003ttl\030\n \001(\0132\031.google.proto"
          + "buf.DurationB\003\340A\004H\000\022\024\n\004name\030\001 \001(\tB\006\340A\010\340A"
          + "\005\022\034\n\014display_name\030\013 \001(\tB\006\340A\001\340A\005\022\022\n\005model"
          + "\030\002 \001(\tB\003\340A\005\022O\n\022system_instruction\030\003 \001(\0132"
          + "(.google.cloud.aiplatform.v1beta1.Conten"
          + "tB\t\340A\001\340A\005\340A\004\022E\n\010contents\030\004 \003(\0132(.google."
          + "cloud.aiplatform.v1beta1.ContentB\t\340A\001\340A\005"
          + "\340A\004\022?\n\005tools\030\005 \003(\0132%.google.cloud.aiplat"
          + "form.v1beta1.ToolB\t\340A\001\340A\005\340A\004\022K\n\013tool_con"
          + "fig\030\006 \001(\0132+.google.cloud.aiplatform.v1be"
          + "ta1.ToolConfigB\t\340A\001\340A\005\340A\004\0224\n\013create_time"
          + "\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022"
          + "4\n\013update_time\030\010 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\022Y\n\016usage_metadata\030\014 \001(\0132<."
          + "google.cloud.aiplatform.v1beta1.CachedCo"
          + "ntent.UsageMetadataB\003\340A\003\032\223\001\n\rUsageMetada"
          + "ta\022\031\n\021total_token_count\030\001 \001(\005\022\022\n\ntext_co"
          + "unt\030\002 \001(\005\022\023\n\013image_count\030\003 \001(\005\022\036\n\026video_"
          + "duration_seconds\030\004 \001(\005\022\036\n\026audio_duration"
          + "_seconds\030\005 \001(\005:\225\001\352A\221\001\n\'aiplatform.google"
          + "apis.com/CachedContent\022Gprojects/{projec"
          + "t}/locations/{location}/cachedContents/{"
          + "cached_content}*\016cachedContents2\rcachedC"
          + "ontentB\014\n\nexpirationB\351\001\n#com.google.clou"
          + "d.aiplatform.v1beta1B\022CachedContentProto"
          + "P\001ZCcloud.google.com/go/aiplatform/apiv1"
          + "beta1/aiplatformpb;aiplatformpb\252\002\037Google"
          + ".Cloud.AIPlatform.V1Beta1\312\002\037Google\\Cloud"
          + "\\AIPlatform\\V1beta1\352\002\"Google::Cloud::AIP"
          + "latform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ContentProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ToolProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_CachedContent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CachedContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CachedContent_descriptor,
            new java.lang.String[] {
              "ExpireTime",
              "Ttl",
              "Name",
              "DisplayName",
              "Model",
              "SystemInstruction",
              "Contents",
              "Tools",
              "ToolConfig",
              "CreateTime",
              "UpdateTime",
              "UsageMetadata",
              "Expiration",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CachedContent_UsageMetadata_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_CachedContent_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CachedContent_UsageMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CachedContent_UsageMetadata_descriptor,
            new java.lang.String[] {
              "TotalTokenCount",
              "TextCount",
              "ImageCount",
              "VideoDurationSeconds",
              "AudioDurationSeconds",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ContentProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ToolProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
