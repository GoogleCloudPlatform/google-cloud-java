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
// source: google/monitoring/dashboard/v1/layouts.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.dashboard.v1;

public final class LayoutsProto {
  private LayoutsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_GridLayout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_GridLayout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_MosaicLayout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_MosaicLayout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_MosaicLayout_Tile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_MosaicLayout_Tile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_RowLayout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_RowLayout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_RowLayout_Row_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_RowLayout_Row_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_ColumnLayout_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ColumnLayout_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_dashboard_v1_ColumnLayout_Column_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_dashboard_v1_ColumnLayout_Column_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n,google/monitoring/dashboard/v1/layouts"
          + ".proto\022\036google.monitoring.dashboard.v1\032+"
          + "google/monitoring/dashboard/v1/widget.pr"
          + "oto\"V\n\nGridLayout\022\017\n\007columns\030\001 \001(\003\0227\n\007wi"
          + "dgets\030\002 \003(\0132&.google.monitoring.dashboar"
          + "d.v1.Widget\"\336\001\n\014MosaicLayout\022\017\n\007columns\030"
          + "\001 \001(\005\022@\n\005tiles\030\003 \003(\01321.google.monitoring"
          + ".dashboard.v1.MosaicLayout.Tile\032{\n\004Tile\022"
          + "\r\n\005x_pos\030\001 \001(\005\022\r\n\005y_pos\030\002 \001(\005\022\r\n\005width\030\003"
          + " \001(\005\022\016\n\006height\030\004 \001(\005\0226\n\006widget\030\005 \001(\0132&.g"
          + "oogle.monitoring.dashboard.v1.Widget\"\230\001\n"
          + "\tRowLayout\022;\n\004rows\030\001 \003(\0132-.google.monito"
          + "ring.dashboard.v1.RowLayout.Row\032N\n\003Row\022\016"
          + "\n\006weight\030\001 \001(\003\0227\n\007widgets\030\002 \003(\0132&.google"
          + ".monitoring.dashboard.v1.Widget\"\247\001\n\014Colu"
          + "mnLayout\022D\n\007columns\030\001 \003(\01323.google.monit"
          + "oring.dashboard.v1.ColumnLayout.Column\032Q"
          + "\n\006Column\022\016\n\006weight\030\001 \001(\003\0227\n\007widgets\030\002 \003("
          + "\0132&.google.monitoring.dashboard.v1.Widge"
          + "tB\365\001\n\"com.google.monitoring.dashboard.v1"
          + "B\014LayoutsProtoP\001ZFcloud.google.com/go/mo"
          + "nitoring/dashboard/apiv1/dashboardpb;das"
          + "hboardpb\252\002$Google.Cloud.Monitoring.Dashb"
          + "oard.V1\312\002$Google\\Cloud\\Monitoring\\Dashbo"
          + "ard\\V1\352\002(Google::Cloud::Monitoring::Dash"
          + "board::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.monitoring.dashboard.v1.WidgetProto.getDescriptor(),
            });
    internal_static_google_monitoring_dashboard_v1_GridLayout_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_GridLayout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_GridLayout_descriptor,
            new java.lang.String[] {
              "Columns", "Widgets",
            });
    internal_static_google_monitoring_dashboard_v1_MosaicLayout_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_dashboard_v1_MosaicLayout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_MosaicLayout_descriptor,
            new java.lang.String[] {
              "Columns", "Tiles",
            });
    internal_static_google_monitoring_dashboard_v1_MosaicLayout_Tile_descriptor =
        internal_static_google_monitoring_dashboard_v1_MosaicLayout_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_dashboard_v1_MosaicLayout_Tile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_MosaicLayout_Tile_descriptor,
            new java.lang.String[] {
              "XPos", "YPos", "Width", "Height", "Widget",
            });
    internal_static_google_monitoring_dashboard_v1_RowLayout_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_dashboard_v1_RowLayout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_RowLayout_descriptor,
            new java.lang.String[] {
              "Rows",
            });
    internal_static_google_monitoring_dashboard_v1_RowLayout_Row_descriptor =
        internal_static_google_monitoring_dashboard_v1_RowLayout_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_dashboard_v1_RowLayout_Row_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_RowLayout_Row_descriptor,
            new java.lang.String[] {
              "Weight", "Widgets",
            });
    internal_static_google_monitoring_dashboard_v1_ColumnLayout_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_dashboard_v1_ColumnLayout_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_ColumnLayout_descriptor,
            new java.lang.String[] {
              "Columns",
            });
    internal_static_google_monitoring_dashboard_v1_ColumnLayout_Column_descriptor =
        internal_static_google_monitoring_dashboard_v1_ColumnLayout_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_dashboard_v1_ColumnLayout_Column_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_dashboard_v1_ColumnLayout_Column_descriptor,
            new java.lang.String[] {
              "Weight", "Widgets",
            });
    com.google.monitoring.dashboard.v1.WidgetProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
