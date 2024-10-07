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
// source: google/cloud/aiplatform/v1beta1/ui_pipeline_spec.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public final class UiPipelineSpecProto {
  private UiPipelineSpecProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ArtifactTypeSchema_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ArtifactTypeSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_PropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_PropertiesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_CustomPropertiesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_CustomPropertiesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/cloud/aiplatform/v1beta1/ui_pip"
          + "eline_spec.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032+google/cl"
          + "oud/aiplatform/v1beta1/value.proto\032\034goog"
          + "le/protobuf/struct.proto\"\201\001\n\022ArtifactTyp"
          + "eSchema\022\026\n\014schema_title\030\001 \001(\tH\000\022\030\n\nschem"
          + "a_uri\030\002 \001(\tB\002\030\001H\000\022\031\n\017instance_schema\030\003 \001"
          + "(\tH\000\022\026\n\016schema_version\030\004 \001(\tB\006\n\004kind\"\227\004\n"
          + "\017RuntimeArtifact\022\014\n\004name\030\001 \001(\t\022A\n\004type\030\002"
          + " \001(\01323.google.cloud.aiplatform.v1beta1.A"
          + "rtifactTypeSchema\022\013\n\003uri\030\003 \001(\t\022X\n\nproper"
          + "ties\030\004 \003(\0132@.google.cloud.aiplatform.v1b"
          + "eta1.RuntimeArtifact.PropertiesEntryB\002\030\001"
          + "\022e\n\021custom_properties\030\005 \003(\0132F.google.clo"
          + "ud.aiplatform.v1beta1.RuntimeArtifact.Cu"
          + "stomPropertiesEntryB\002\030\001\022)\n\010metadata\030\006 \001("
          + "\0132\027.google.protobuf.Struct\032Y\n\017Properties"
          + "Entry\022\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001(\0132&.goog"
          + "le.cloud.aiplatform.v1beta1.Value:\0028\001\032_\n"
          + "\025CustomPropertiesEntry\022\013\n\003key\030\001 \001(\t\0225\n\005v"
          + "alue\030\002 \001(\0132&.google.cloud.aiplatform.v1b"
          + "eta1.Value:\0028\001B\352\001\n#com.google.cloud.aipl"
          + "atform.v1beta1B\023UiPipelineSpecProtoP\001ZCc"
          + "loud.google.com/go/aiplatform/apiv1beta1"
          + "/aiplatformpb;aiplatformpb\252\002\037Google.Clou"
          + "d.AIPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPl"
          + "atform\\V1beta1\352\002\"Google::Cloud::AIPlatfo"
          + "rm::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ArtifactTypeSchema_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ArtifactTypeSchema_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ArtifactTypeSchema_descriptor,
            new java.lang.String[] {
              "SchemaTitle", "SchemaUri", "InstanceSchema", "SchemaVersion", "Kind",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Uri", "Properties", "CustomProperties", "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_PropertiesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_PropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_PropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_CustomPropertiesEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_CustomPropertiesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RuntimeArtifact_CustomPropertiesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ValueProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
