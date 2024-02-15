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
// source: google/cloud/documentai/v1/geometry.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.documentai.v1;

public final class GeometryProto {
  private GeometryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_Vertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_NormalizedVertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1_BoundingPoly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1_BoundingPoly_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/documentai/v1/geometry.pr"
          + "oto\022\032google.cloud.documentai.v1\"\036\n\006Verte"
          + "x\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030\002 \001(\005\"(\n\020NormalizedVer"
          + "tex\022\t\n\001x\030\001 \001(\002\022\t\n\001y\030\002 \001(\002\"\217\001\n\014BoundingPo"
          + "ly\0224\n\010vertices\030\001 \003(\0132\".google.cloud.docu"
          + "mentai.v1.Vertex\022I\n\023normalized_vertices\030"
          + "\002 \003(\0132,.google.cloud.documentai.v1.Norma"
          + "lizedVertexB\313\001\n\036com.google.cloud.documen"
          + "tai.v1B\rGeometryProtoP\001Z>cloud.google.co"
          + "m/go/documentai/apiv1/documentaipb;docum"
          + "entaipb\252\002\032Google.Cloud.DocumentAI.V1\312\002\032G"
          + "oogle\\Cloud\\DocumentAI\\V1\352\002\035Google::Clou"
          + "d::DocumentAI::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_documentai_v1_Vertex_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1_Vertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_Vertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_documentai_v1_NormalizedVertex_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1_NormalizedVertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_NormalizedVertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_documentai_v1_BoundingPoly_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1_BoundingPoly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1_BoundingPoly_descriptor,
            new java.lang.String[] {
              "Vertices", "NormalizedVertices",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
