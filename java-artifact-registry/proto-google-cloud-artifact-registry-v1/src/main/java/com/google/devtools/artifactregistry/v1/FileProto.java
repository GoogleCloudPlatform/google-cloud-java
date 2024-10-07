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
// source: google/devtools/artifactregistry/v1/file.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.artifactregistry.v1;

public final class FileProto {
  private FileProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_Hash_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_Hash_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_File_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_File_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListFilesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListFilesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetFileRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetFileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/devtools/artifactregistry/v1/fi"
          + "le.proto\022#google.devtools.artifactregist"
          + "ry.v1\032\037google/api/field_behavior.proto\032\031"
          + "google/api/resource.proto\032\037google/protob"
          + "uf/timestamp.proto\"\223\001\n\004Hash\022@\n\004type\030\001 \001("
          + "\01622.google.devtools.artifactregistry.v1."
          + "Hash.HashType\022\r\n\005value\030\002 \001(\014\":\n\010HashType"
          + "\022\031\n\025HASH_TYPE_UNSPECIFIED\020\000\022\n\n\006SHA256\020\001\022"
          + "\007\n\003MD5\020\002\"\216\003\n\004File\022\014\n\004name\030\001 \001(\t\022\022\n\nsize_"
          + "bytes\030\003 \001(\003\0229\n\006hashes\030\004 \003(\0132).google.dev"
          + "tools.artifactregistry.v1.Hash\0224\n\013create"
          + "_time\030\005 \001(\0132\032.google.protobuf.TimestampB"
          + "\003\340A\003\0224\n\013update_time\030\006 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022\r\n\005owner\030\007 \001(\t\0223\n\nfet"
          + "ch_time\030\010 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003:y\352Av\n$artifactregistry.googleapis"
          + ".com/File\022Nprojects/{project}/locations/"
          + "{location}/repositories/{repository}/fil"
          + "es/{file}\"\231\001\n\020ListFilesRequest\022<\n\006parent"
          + "\030\001 \001(\tB,\340A\002\372A&\022$artifactregistry.googlea"
          + "pis.com/File\022\016\n\006filter\030\004 \001(\t\022\021\n\tpage_siz"
          + "e\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\020\n\010order_by\030"
          + "\005 \001(\t\"f\n\021ListFilesResponse\0228\n\005files\030\001 \003("
          + "\0132).google.devtools.artifactregistry.v1."
          + "File\022\027\n\017next_page_token\030\002 \001(\t\"L\n\016GetFile"
          + "Request\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$artifactr"
          + "egistry.googleapis.com/FileB\364\001\n\'com.goog"
          + "le.devtools.artifactregistry.v1B\tFilePro"
          + "toP\001ZPcloud.google.com/go/artifactregist"
          + "ry/apiv1/artifactregistrypb;artifactregi"
          + "strypb\252\002 Google.Cloud.ArtifactRegistry.V"
          + "1\312\002 Google\\Cloud\\ArtifactRegistry\\V1\352\002#G"
          + "oogle::Cloud::ArtifactRegistry::V1b\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_Hash_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_Hash_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_Hash_descriptor,
            new java.lang.String[] {
              "Type", "Value",
            });
    internal_static_google_devtools_artifactregistry_v1_File_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_File_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_File_descriptor,
            new java.lang.String[] {
              "Name", "SizeBytes", "Hashes", "CreateTime", "UpdateTime", "Owner", "FetchTime",
            });
    internal_static_google_devtools_artifactregistry_v1_ListFilesRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ListFilesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListFilesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_devtools_artifactregistry_v1_ListFilesResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_ListFilesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListFilesResponse_descriptor,
            new java.lang.String[] {
              "Files", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetFileRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_GetFileRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetFileRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
