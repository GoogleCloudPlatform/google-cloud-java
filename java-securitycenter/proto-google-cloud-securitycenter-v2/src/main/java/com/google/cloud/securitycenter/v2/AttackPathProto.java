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
// source: google/cloud/securitycenter/v2/attack_path.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public final class AttackPathProto {
  private AttackPathProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AttackPath_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AttackPath_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_PathNodeAssociatedFinding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_PathNodeAssociatedFinding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathEdge_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathEdge_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/securitycenter/v2/attack_"
          + "path.proto\022\036google.cloud.securitycenter."
          + "v2\032\031google/api/resource.proto\"\360\n\n\nAttack"
          + "Path\022\014\n\004name\030\001 \001(\t\022M\n\npath_nodes\030\002 \003(\01329"
          + ".google.cloud.securitycenter.v2.AttackPa"
          + "th.AttackPathNode\022H\n\005edges\030\003 \003(\01329.googl"
          + "e.cloud.securitycenter.v2.AttackPath.Att"
          + "ackPathEdge\032\275\006\n\016AttackPathNode\022\020\n\010resour"
          + "ce\030\001 \001(\t\022\025\n\rresource_type\030\002 \001(\t\022\024\n\014displ"
          + "ay_name\030\003 \001(\t\022p\n\023associated_findings\030\004 \003"
          + "(\0132S.google.cloud.securitycenter.v2.Atta"
          + "ckPath.AttackPathNode.PathNodeAssociated"
          + "Finding\022\014\n\004uuid\030\005 \001(\t\022^\n\014attack_steps\030\006 "
          + "\003(\0132H.google.cloud.securitycenter.v2.Att"
          + "ackPath.AttackPathNode.AttackStepNode\032^\n"
          + "\031PathNodeAssociatedFinding\022\031\n\021canonical_"
          + "finding\030\001 \001(\t\022\030\n\020finding_category\030\002 \001(\t\022"
          + "\014\n\004name\030\003 \001(\t\032\260\002\n\016AttackStepNode\022\014\n\004uuid"
          + "\030\001 \001(\t\022P\n\004type\030\002 \001(\0162B.google.cloud.secu"
          + "ritycenter.v2.AttackPath.AttackPathNode."
          + "NodeType\022\024\n\014display_name\030\003 \001(\t\022d\n\006labels"
          + "\030\004 \003(\0132T.google.cloud.securitycenter.v2."
          + "AttackPath.AttackPathNode.AttackStepNode"
          + ".LabelsEntry\022\023\n\013description\030\005 \001(\t\032-\n\013Lab"
          + "elsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001"
          + "\"y\n\010NodeType\022\031\n\025NODE_TYPE_UNSPECIFIED\020\000\022"
          + "\021\n\rNODE_TYPE_AND\020\001\022\020\n\014NODE_TYPE_OR\020\002\022\025\n\021"
          + "NODE_TYPE_DEFENSE\020\003\022\026\n\022NODE_TYPE_ATTACKE"
          + "R\020\004\0325\n\016AttackPathEdge\022\016\n\006source\030\001 \001(\t\022\023\n"
          + "\013destination\030\002 \001(\t:\303\002\352A\277\002\n(securitycente"
          + "r.googleapis.com/AttackPath\022qorganizatio"
          + "ns/{organization}/simulations/{simulatio"
          + "n}/valuedResources/{valued_resource}/att"
          + "ackPaths/{attack_path}\022\206\001organizations/{"
          + "organization}/locations/{location}/simul"
          + "ations/{simulation}/valuedResources/{val"
          + "ued_resource}/attackPaths/{attack_path}*"
          + "\013attackPaths2\nattackPathB\351\001\n\"com.google."
          + "cloud.securitycenter.v2B\017AttackPathProto"
          + "P\001ZJcloud.google.com/go/securitycenter/a"
          + "piv2/securitycenterpb;securitycenterpb\252\002"
          + "\036Google.Cloud.SecurityCenter.V2\312\002\036Google"
          + "\\Cloud\\SecurityCenter\\V2\352\002!Google::Cloud"
          + "::SecurityCenter::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_securitycenter_v2_AttackPath_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_AttackPath_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AttackPath_descriptor,
            new java.lang.String[] {
              "Name", "PathNodes", "Edges",
            });
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_descriptor =
        internal_static_google_cloud_securitycenter_v2_AttackPath_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_descriptor,
            new java.lang.String[] {
              "Resource",
              "ResourceType",
              "DisplayName",
              "AssociatedFindings",
              "Uuid",
              "AttackSteps",
            });
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_PathNodeAssociatedFinding_descriptor =
        internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_PathNodeAssociatedFinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_PathNodeAssociatedFinding_descriptor,
            new java.lang.String[] {
              "CanonicalFinding", "FindingCategory", "Name",
            });
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_descriptor =
        internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_descriptor,
            new java.lang.String[] {
              "Uuid", "Type", "DisplayName", "Labels", "Description",
            });
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_LabelsEntry_descriptor =
        internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathNode_AttackStepNode_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathEdge_descriptor =
        internal_static_google_cloud_securitycenter_v2_AttackPath_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathEdge_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_AttackPath_AttackPathEdge_descriptor,
            new java.lang.String[] {
              "Source", "Destination",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
