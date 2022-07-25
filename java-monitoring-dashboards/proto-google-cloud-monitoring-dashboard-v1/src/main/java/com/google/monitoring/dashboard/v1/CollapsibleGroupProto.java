/*
 * Copyright 2020 Google LLC
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
// source: google/monitoring/dashboard/v1/collapsible_group.proto

package com.google.monitoring.dashboard.v1;

public final class CollapsibleGroupProto {
  private CollapsibleGroupProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_CollapsibleGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_CollapsibleGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n6google/monitoring/dashboard/v1/collaps"
          + "ible_group.proto\022\036google.monitoring.dash"
          + "board.v1\"%\n\020CollapsibleGroup\022\021\n\tcollapse"
          + "d\030\001 \001(\010B\377\001\n\"com.google.monitoring.dashbo"
          + "ard.v1B\025CollapsibleGroupProtoP\001ZGgoogle."
          + "golang.org/genproto/googleapis/monitorin"
          + "g/dashboard/v1;dashboard\252\002$Google.Cloud."
          + "Monitoring.Dashboard.V1\312\002$Google\\Cloud\\M"
          + "onitoring\\Dashboard\\V1\352\002(Google::Cloud::"
          + "Monitoring::Dashboard::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_monitoring_dashboard_v1_CollapsibleGroup_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_CollapsibleGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_CollapsibleGroup_descriptor,
            new java.lang.String[] {
              "Collapsed",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
