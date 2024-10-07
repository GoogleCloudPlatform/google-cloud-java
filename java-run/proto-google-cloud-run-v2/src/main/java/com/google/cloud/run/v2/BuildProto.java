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
// source: google/cloud/run/v2/build.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.run.v2;

public final class BuildProto {
  private BuildProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_SubmitBuildRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SubmitBuildRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_SubmitBuildRequest_DockerBuild_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SubmitBuildRequest_DockerBuild_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_EnvironmentVariablesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_EnvironmentVariablesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_SubmitBuildResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_SubmitBuildResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_StorageSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_StorageSource_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/cloud/run/v2/build.proto\022\023googl"
          + "e.cloud.run.v2\032\034google/api/annotations.p"
          + "roto\032\027google/api/client.proto\032\037google/ap"
          + "i/field_behavior.proto\032\031google/api/resou"
          + "rce.proto\032#google/longrunning/operations"
          + ".proto\"\231\006\n\022SubmitBuildRequest\022\023\n\006parent\030"
          + "\001 \001(\tB\003\340A\002\022A\n\016storage_source\030\002 \001(\0132\".goo"
          + "gle.cloud.run.v2.StorageSourceB\003\340A\002H\000\022\026\n"
          + "\timage_uri\030\003 \001(\tB\003\340A\002\022R\n\017buildpack_build"
          + "\030\004 \001(\01327.google.cloud.run.v2.SubmitBuild"
          + "Request.BuildpacksBuildH\001\022K\n\014docker_buil"
          + "d\030\005 \001(\01323.google.cloud.run.v2.SubmitBuil"
          + "dRequest.DockerBuildH\001\022\034\n\017service_accoun"
          + "t\030\006 \001(\tB\003\340A\001\022A\n\013worker_pool\030\007 \001(\tB,\340A\001\372A"
          + "&\n$cloudbuild.googleapis.com/WorkerPool\022"
          + "\021\n\004tags\030\010 \003(\tB\003\340A\001\032\r\n\013DockerBuild\032\326\002\n\017Bu"
          + "ildpacksBuild\022\023\n\007runtime\030\001 \001(\tB\002\030\001\022\034\n\017fu"
          + "nction_target\030\002 \001(\tB\003\340A\001\022\034\n\017cache_image_"
          + "uri\030\003 \001(\tB\003\340A\001\022\027\n\nbase_image\030\004 \001(\tB\003\340A\001\022"
          + "u\n\025environment_variables\030\005 \003(\0132Q.google."
          + "cloud.run.v2.SubmitBuildRequest.Buildpac"
          + "ksBuild.EnvironmentVariablesEntryB\003\340A\001\022%"
          + "\n\030enable_automatic_updates\030\006 \001(\010B\003\340A\001\032;\n"
          + "\031EnvironmentVariablesEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001B\010\n\006sourceB\014\n\nbuild_ty"
          + "pe\"\201\001\n\023SubmitBuildResponse\0226\n\017build_oper"
          + "ation\030\001 \001(\0132\035.google.longrunning.Operati"
          + "on\022\026\n\016base_image_uri\030\002 \001(\t\022\032\n\022base_image"
          + "_warning\030\003 \001(\t\"R\n\rStorageSource\022\023\n\006bucke"
          + "t\030\001 \001(\tB\003\340A\002\022\023\n\006object\030\002 \001(\tB\003\340A\002\022\027\n\ngen"
          + "eration\030\003 \001(\003B\003\340A\0012\361\001\n\006Builds\022\236\001\n\013Submit"
          + "Build\022\'.google.cloud.run.v2.SubmitBuildR"
          + "equest\032(.google.cloud.run.v2.SubmitBuild"
          + "Response\"<\202\323\344\223\0026\"1/v2/{parent=projects/*"
          + "/locations/*}/builds:submit:\001*\032F\312A\022run.g"
          + "oogleapis.com\322A.https://www.googleapis.c"
          + "om/auth/cloud-platformB\276\001\n\027com.google.cl"
          + "oud.run.v2B\nBuildProtoP\001Z)cloud.google.c"
          + "om/go/run/apiv2/runpb;runpb\352Ai\n$cloudbui"
          + "ld.googleapis.com/WorkerPool\022Aprojects/{"
          + "project}/locations/{location}/workerPool"
          + "s/{worker_pool}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
            });
    internal_static_google_cloud_run_v2_SubmitBuildRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_SubmitBuildRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_SubmitBuildRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "StorageSource",
              "ImageUri",
              "BuildpackBuild",
              "DockerBuild",
              "ServiceAccount",
              "WorkerPool",
              "Tags",
              "Source",
              "BuildType",
            });
    internal_static_google_cloud_run_v2_SubmitBuildRequest_DockerBuild_descriptor =
        internal_static_google_cloud_run_v2_SubmitBuildRequest_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_run_v2_SubmitBuildRequest_DockerBuild_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_SubmitBuildRequest_DockerBuild_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_descriptor =
        internal_static_google_cloud_run_v2_SubmitBuildRequest_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_descriptor,
            new java.lang.String[] {
              "Runtime",
              "FunctionTarget",
              "CacheImageUri",
              "BaseImage",
              "EnvironmentVariables",
              "EnableAutomaticUpdates",
            });
    internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_EnvironmentVariablesEntry_descriptor =
        internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_EnvironmentVariablesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_SubmitBuildRequest_BuildpacksBuild_EnvironmentVariablesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_run_v2_SubmitBuildResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_SubmitBuildResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_SubmitBuildResponse_descriptor,
            new java.lang.String[] {
              "BuildOperation", "BaseImageUri", "BaseImageWarning",
            });
    internal_static_google_cloud_run_v2_StorageSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_run_v2_StorageSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_StorageSource_descriptor,
            new java.lang.String[] {
              "Bucket", "Object", "Generation",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
