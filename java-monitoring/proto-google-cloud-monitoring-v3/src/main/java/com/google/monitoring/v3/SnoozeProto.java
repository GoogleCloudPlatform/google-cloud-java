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
// source: google/monitoring/v3/snooze.proto

package com.google.monitoring.v3;

public final class SnoozeProto {
  private SnoozeProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Snooze_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Snooze_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Snooze_Criteria_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Snooze_Criteria_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/monitoring/v3/snooze.proto\022\024goo"
          + "gle.monitoring.v3\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\032!g"
          + "oogle/monitoring/v3/common.proto\"\305\002\n\006Sno"
          + "oze\022\021\n\004name\030\001 \001(\tB\003\340A\002\022<\n\010criteria\030\003 \001(\013"
          + "2%.google.monitoring.v3.Snooze.CriteriaB"
          + "\003\340A\002\0229\n\010interval\030\004 \001(\0132\".google.monitori"
          + "ng.v3.TimeIntervalB\003\340A\002\022\031\n\014display_name\030"
          + "\005 \001(\tB\003\340A\002\032H\n\010Criteria\022<\n\010policies\030\001 \003(\t"
          + "B*\372A\'\n%monitoring.googleapis.com/AlertPo"
          + "licy:J\352AG\n monitoring.googleapis.com/Sno"
          + "oze\022#projects/{project}/snoozes/{snooze}"
          + "B\303\001\n\030com.google.monitoring.v3B\013SnoozePro"
          + "toP\001Z>google.golang.org/genproto/googlea"
          + "pis/monitoring/v3;monitoring\252\002\032Google.Cl"
          + "oud.Monitoring.V3\312\002\032Google\\Cloud\\Monitor"
          + "ing\\V3\352\002\035Google::Cloud::Monitoring::V3b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_Snooze_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_Snooze_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Snooze_descriptor,
            new java.lang.String[] {
              "Name", "Criteria", "Interval", "DisplayName",
            });
    internal_static_google_monitoring_v3_Snooze_Criteria_descriptor =
        internal_static_google_monitoring_v3_Snooze_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_Snooze_Criteria_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Snooze_Criteria_descriptor,
            new java.lang.String[] {
              "Policies",
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
    com.google.monitoring.v3.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
