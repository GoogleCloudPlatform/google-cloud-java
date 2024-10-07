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
// source: google/appengine/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.appengine.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Service_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_Service_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_Service_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_TrafficSplit_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_TrafficSplit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_appengine_v1_TrafficSplit_AllocationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_appengine_v1_TrafficSplit_AllocationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/appengine/v1/service.proto\022\023goo"
          + "gle.appengine.v1\032*google/appengine/v1/ne"
          + "twork_settings.proto\"\376\001\n\007Service\022\014\n\004name"
          + "\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\0220\n\005split\030\003 \001(\0132!.goog"
          + "le.appengine.v1.TrafficSplit\0228\n\006labels\030\004"
          + " \003(\0132(.google.appengine.v1.Service.Label"
          + "sEntry\022>\n\020network_settings\030\006 \001(\0132$.googl"
          + "e.appengine.v1.NetworkSettings\032-\n\013Labels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\204\002"
          + "\n\014TrafficSplit\022;\n\010shard_by\030\001 \001(\0162).googl"
          + "e.appengine.v1.TrafficSplit.ShardBy\022G\n\013a"
          + "llocations\030\002 \003(\01322.google.appengine.v1.T"
          + "rafficSplit.AllocationsEntry\0322\n\020Allocati"
          + "onsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\001:\0028\001"
          + "\":\n\007ShardBy\022\017\n\013UNSPECIFIED\020\000\022\n\n\006COOKIE\020\001"
          + "\022\006\n\002IP\020\002\022\n\n\006RANDOM\020\003B\275\001\n\027com.google.appe"
          + "ngine.v1B\014ServiceProtoP\001Z;cloud.google.c"
          + "om/go/appengine/apiv1/appenginepb;appeng"
          + "inepb\252\002\031Google.Cloud.AppEngine.V1\312\002\031Goog"
          + "le\\Cloud\\AppEngine\\V1\352\002\034Google::Cloud::A"
          + "ppEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.appengine.v1.NetworkSettingsProto.getDescriptor(),
            });
    internal_static_google_appengine_v1_Service_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_appengine_v1_Service_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Service_descriptor,
            new java.lang.String[] {
              "Name", "Id", "Split", "Labels", "NetworkSettings",
            });
    internal_static_google_appengine_v1_Service_LabelsEntry_descriptor =
        internal_static_google_appengine_v1_Service_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_Service_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_Service_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_appengine_v1_TrafficSplit_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_appengine_v1_TrafficSplit_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_TrafficSplit_descriptor,
            new java.lang.String[] {
              "ShardBy", "Allocations",
            });
    internal_static_google_appengine_v1_TrafficSplit_AllocationsEntry_descriptor =
        internal_static_google_appengine_v1_TrafficSplit_descriptor.getNestedTypes().get(0);
    internal_static_google_appengine_v1_TrafficSplit_AllocationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_appengine_v1_TrafficSplit_AllocationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.appengine.v1.NetworkSettingsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
