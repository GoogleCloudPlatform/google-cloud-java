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
// source: google/devtools/artifactregistry/v1/artifact.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.artifactregistry.v1;

public final class ArtifactProto {
  private ArtifactProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_DockerImage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_DockerImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetDockerImageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetDockerImageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_MavenArtifact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_MavenArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetMavenArtifactRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetMavenArtifactRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_NpmPackage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_NpmPackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetNpmPackageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetNpmPackageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_PythonPackage_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_PythonPackage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_devtools_artifactregistry_v1_GetPythonPackageRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1_GetPythonPackageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/devtools/artifactregistry/v1/ar"
          + "tifact.proto\022#google.devtools.artifactre"
          + "gistry.v1\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\230\003\n\013DockerImage\022\021"
          + "\n\004name\030\001 \001(\tB\003\340A\002\022\020\n\003uri\030\002 \001(\tB\003\340A\002\022\014\n\004t"
          + "ags\030\003 \003(\t\022\030\n\020image_size_bytes\030\004 \001(\003\022/\n\013u"
          + "pload_time\030\005 \001(\0132\032.google.protobuf.Times"
          + "tamp\022\022\n\nmedia_type\030\006 \001(\t\022.\n\nbuild_time\030\007"
          + " \001(\0132\032.google.protobuf.Timestamp\0224\n\013upda"
          + "te_time\030\010 \001(\0132\032.google.protobuf.Timestam"
          + "pB\003\340A\003:\220\001\352A\214\001\n+artifactregistry.googleap"
          + "is.com/DockerImage\022]projects/{project}/l"
          + "ocations/{location}/repositories/{reposi"
          + "tory}/dockerImages/{docker_image}\"g\n\027Lis"
          + "tDockerImagesRequest\022\023\n\006parent\030\001 \001(\tB\003\340A"
          + "\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t"
          + "\022\020\n\010order_by\030\004 \001(\t\"|\n\030ListDockerImagesRe"
          + "sponse\022G\n\rdocker_images\030\001 \003(\01320.google.d"
          + "evtools.artifactregistry.v1.DockerImage\022"
          + "\027\n\017next_page_token\030\002 \001(\t\"Z\n\025GetDockerIma"
          + "geRequest\022A\n\004name\030\001 \001(\tB3\340A\002\372A-\n+artifac"
          + "tregistry.googleapis.com/DockerImage\"\365\002\n"
          + "\rMavenArtifact\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\024\n\007pom"
          + "_uri\030\002 \001(\tB\003\340A\002\022\020\n\010group_id\030\003 \001(\t\022\023\n\013art"
          + "ifact_id\030\004 \001(\t\022\017\n\007version\030\005 \001(\t\0224\n\013creat"
          + "e_time\030\006 \001(\0132\032.google.protobuf.Timestamp"
          + "B\003\340A\003\0224\n\013update_time\030\007 \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003:\226\001\352A\222\001\n-artifactregi"
          + "stry.googleapis.com/MavenArtifact\022aproje"
          + "cts/{project}/locations/{location}/repos"
          + "itories/{repository}/mavenArtifacts/{mav"
          + "en_artifact}\"\211\001\n\031ListMavenArtifactsReque"
          + "st\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-artifactregi"
          + "stry.googleapis.com/MavenArtifact\022\021\n\tpag"
          + "e_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"\202\001\n\032Lis"
          + "tMavenArtifactsResponse\022K\n\017maven_artifac"
          + "ts\030\001 \003(\01322.google.devtools.artifactregis"
          + "try.v1.MavenArtifact\022\027\n\017next_page_token\030"
          + "\002 \001(\t\"^\n\027GetMavenArtifactRequest\022C\n\004name"
          + "\030\001 \001(\tB5\340A\002\372A/\n-artifactregistry.googlea"
          + "pis.com/MavenArtifact\"\320\002\n\nNpmPackage\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\002\022\024\n\014package_name\030\003 \001(\t\022\017\n"
          + "\007version\030\004 \001(\t\022\014\n\004tags\030\005 \003(\t\0224\n\013create_t"
          + "ime\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\0224\n\013update_time\030\007 \001(\0132\032.google.protobu"
          + "f.TimestampB\003\340A\003:\215\001\352A\211\001\n*artifactregistr"
          + "y.googleapis.com/NpmPackage\022[projects/{p"
          + "roject}/locations/{location}/repositorie"
          + "s/{repository}/npmPackages/{npm_package}"
          + "\"\203\001\n\026ListNpmPackagesRequest\022B\n\006parent\030\001 "
          + "\001(\tB2\340A\002\372A,\022*artifactregistry.googleapis"
          + ".com/NpmPackage\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npa"
          + "ge_token\030\003 \001(\t\"y\n\027ListNpmPackagesRespons"
          + "e\022E\n\014npm_packages\030\001 \003(\0132/.google.devtool"
          + "s.artifactregistry.v1.NpmPackage\022\027\n\017next"
          + "_page_token\030\002 \001(\t\"X\n\024GetNpmPackageReques"
          + "t\022@\n\004name\030\001 \001(\tB2\340A\002\372A,\n*artifactregistr"
          + "y.googleapis.com/NpmPackage\"\340\002\n\rPythonPa"
          + "ckage\022\021\n\004name\030\001 \001(\tB\003\340A\002\022\020\n\003uri\030\002 \001(\tB\003\340"
          + "A\002\022\024\n\014package_name\030\003 \001(\t\022\017\n\007version\030\004 \001("
          + "\t\0224\n\013create_time\030\006 \001(\0132\032.google.protobuf"
          + ".TimestampB\003\340A\003\0224\n\013update_time\030\007 \001(\0132\032.g"
          + "oogle.protobuf.TimestampB\003\340A\003:\226\001\352A\222\001\n-ar"
          + "tifactregistry.googleapis.com/PythonPack"
          + "age\022aprojects/{project}/locations/{locat"
          + "ion}/repositories/{repository}/pythonPac"
          + "kages/{python_package}\"\211\001\n\031ListPythonPac"
          + "kagesRequest\022E\n\006parent\030\001 \001(\tB5\340A\002\372A/\022-ar"
          + "tifactregistry.googleapis.com/PythonPack"
          + "age\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"\202\001\n\032ListPythonPackagesResponse\022K\n\017pyt"
          + "hon_packages\030\001 \003(\01322.google.devtools.art"
          + "ifactregistry.v1.PythonPackage\022\027\n\017next_p"
          + "age_token\030\002 \001(\t\"^\n\027GetPythonPackageReque"
          + "st\022C\n\004name\030\001 \001(\tB5\340A\002\372A/\n-artifactregist"
          + "ry.googleapis.com/PythonPackageB\370\001\n\'com."
          + "google.devtools.artifactregistry.v1B\rArt"
          + "ifactProtoP\001ZPcloud.google.com/go/artifa"
          + "ctregistry/apiv1/artifactregistrypb;arti"
          + "factregistrypb\252\002 Google.Cloud.ArtifactRe"
          + "gistry.V1\312\002 Google\\Cloud\\ArtifactRegistr"
          + "y\\V1\352\002#Google::Cloud::ArtifactRegistry::"
          + "V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_devtools_artifactregistry_v1_DockerImage_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1_DockerImage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_DockerImage_descriptor,
            new java.lang.String[] {
              "Name",
              "Uri",
              "Tags",
              "ImageSizeBytes",
              "UploadTime",
              "MediaType",
              "BuildTime",
              "UpdateTime",
            });
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListDockerImagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "OrderBy",
            });
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListDockerImagesResponse_descriptor,
            new java.lang.String[] {
              "DockerImages", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetDockerImageRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_artifactregistry_v1_GetDockerImageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetDockerImageRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1_MavenArtifact_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_artifactregistry_v1_MavenArtifact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_MavenArtifact_descriptor,
            new java.lang.String[] {
              "Name", "PomUri", "GroupId", "ArtifactId", "Version", "CreateTime", "UpdateTime",
            });
    internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListMavenArtifactsResponse_descriptor,
            new java.lang.String[] {
              "MavenArtifacts", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetMavenArtifactRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_devtools_artifactregistry_v1_GetMavenArtifactRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetMavenArtifactRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1_NpmPackage_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_devtools_artifactregistry_v1_NpmPackage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_NpmPackage_descriptor,
            new java.lang.String[] {
              "Name", "PackageName", "Version", "Tags", "CreateTime", "UpdateTime",
            });
    internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListNpmPackagesResponse_descriptor,
            new java.lang.String[] {
              "NpmPackages", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetNpmPackageRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_devtools_artifactregistry_v1_GetNpmPackageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetNpmPackageRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_devtools_artifactregistry_v1_PythonPackage_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_devtools_artifactregistry_v1_PythonPackage_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_PythonPackage_descriptor,
            new java.lang.String[] {
              "Name", "Uri", "PackageName", "Version", "CreateTime", "UpdateTime",
            });
    internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_ListPythonPackagesResponse_descriptor,
            new java.lang.String[] {
              "PythonPackages", "NextPageToken",
            });
    internal_static_google_devtools_artifactregistry_v1_GetPythonPackageRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_devtools_artifactregistry_v1_GetPythonPackageRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_devtools_artifactregistry_v1_GetPythonPackageRequest_descriptor,
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
