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
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.source;

public final class Source {
  private Source() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_SourceContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_SourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_SourceContext_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_SourceContext_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_AliasContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_AliasContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_CloudRepoSourceContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_CloudRepoSourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_GerritSourceContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_GerritSourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_GitSourceContext_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_GitSourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_RepoId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_RepoId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1beta1_source_ProjectRepoId_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_source_ProjectRepoId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n=google/devtools/containeranalysis/v1be"
          + "ta1/source/source.proto\022\026grafeas.v1beta1"
          + ".source\"\312\002\n\rSourceContext\022D\n\ncloud_repo\030"
          + "\001 \001(\0132..grafeas.v1beta1.source.CloudRepo"
          + "SourceContextH\000\022=\n\006gerrit\030\002 \001(\0132+.grafea"
          + "s.v1beta1.source.GerritSourceContextH\000\0227"
          + "\n\003git\030\003 \001(\0132(.grafeas.v1beta1.source.Git"
          + "SourceContextH\000\022A\n\006labels\030\004 \003(\01321.grafea"
          + "s.v1beta1.source.SourceContext.LabelsEnt"
          + "ry\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030"
          + "\002 \001(\t:\0028\001B\t\n\007context\"\226\001\n\014AliasContext\0227\n"
          + "\004kind\030\001 \001(\0162).grafeas.v1beta1.source.Ali"
          + "asContext.Kind\022\014\n\004name\030\002 \001(\t\"?\n\004Kind\022\024\n\020"
          + "KIND_UNSPECIFIED\020\000\022\t\n\005FIXED\020\001\022\013\n\007MOVABLE"
          + "\020\002\022\t\n\005OTHER\020\004\"\253\001\n\026CloudRepoSourceContext"
          + "\022/\n\007repo_id\030\001 \001(\0132\036.grafeas.v1beta1.sour"
          + "ce.RepoId\022\025\n\013revision_id\030\002 \001(\tH\000\022=\n\ralia"
          + "s_context\030\003 \001(\0132$.grafeas.v1beta1.source"
          + ".AliasContextH\000B\n\n\010revision\"\241\001\n\023GerritSo"
          + "urceContext\022\020\n\010host_uri\030\001 \001(\t\022\026\n\016gerrit_"
          + "project\030\002 \001(\t\022\025\n\013revision_id\030\003 \001(\tH\000\022=\n\r"
          + "alias_context\030\004 \001(\0132$.grafeas.v1beta1.so"
          + "urce.AliasContextH\000B\n\n\010revision\"4\n\020GitSo"
          + "urceContext\022\013\n\003url\030\001 \001(\t\022\023\n\013revision_id\030"
          + "\002 \001(\t\"_\n\006RepoId\022@\n\017project_repo_id\030\001 \001(\013"
          + "2%.grafeas.v1beta1.source.ProjectRepoIdH"
          + "\000\022\r\n\003uid\030\002 \001(\tH\000B\004\n\002id\"6\n\rProjectRepoId\022"
          + "\022\n\nproject_id\030\001 \001(\t\022\021\n\trepo_name\030\002 \001(\tB}"
          + "\n\031io.grafeas.v1beta1.sourceP\001ZXcloud.goo"
          + "gle.com/go/containeranalysis/apiv1beta1/"
          + "containeranalysispb;containeranalysispb\242"
          + "\002\003GRAb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_grafeas_v1beta1_source_SourceContext_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_source_SourceContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_SourceContext_descriptor,
            new java.lang.String[] {
              "CloudRepo", "Gerrit", "Git", "Labels", "Context",
            });
    internal_static_grafeas_v1beta1_source_SourceContext_LabelsEntry_descriptor =
        internal_static_grafeas_v1beta1_source_SourceContext_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1beta1_source_SourceContext_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_SourceContext_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_grafeas_v1beta1_source_AliasContext_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_source_AliasContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_AliasContext_descriptor,
            new java.lang.String[] {
              "Kind", "Name",
            });
    internal_static_grafeas_v1beta1_source_CloudRepoSourceContext_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_source_CloudRepoSourceContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_CloudRepoSourceContext_descriptor,
            new java.lang.String[] {
              "RepoId", "RevisionId", "AliasContext", "Revision",
            });
    internal_static_grafeas_v1beta1_source_GerritSourceContext_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1beta1_source_GerritSourceContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_GerritSourceContext_descriptor,
            new java.lang.String[] {
              "HostUri", "GerritProject", "RevisionId", "AliasContext", "Revision",
            });
    internal_static_grafeas_v1beta1_source_GitSourceContext_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_grafeas_v1beta1_source_GitSourceContext_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_GitSourceContext_descriptor,
            new java.lang.String[] {
              "Url", "RevisionId",
            });
    internal_static_grafeas_v1beta1_source_RepoId_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_grafeas_v1beta1_source_RepoId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_RepoId_descriptor,
            new java.lang.String[] {
              "ProjectRepoId", "Uid", "Id",
            });
    internal_static_grafeas_v1beta1_source_ProjectRepoId_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_grafeas_v1beta1_source_ProjectRepoId_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1beta1_source_ProjectRepoId_descriptor,
            new java.lang.String[] {
              "ProjectId", "RepoName",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
