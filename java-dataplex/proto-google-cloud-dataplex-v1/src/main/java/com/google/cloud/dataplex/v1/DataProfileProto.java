/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dataplex/v1/data_profile.proto

package com.google.cloud.dataplex.v1;

public final class DataProfileProto {
  private DataProfileProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_BigQueryExport_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_BigQueryExport_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_SelectedFields_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileSpec_SelectedFields_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_BigQueryExportResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_BigQueryExportResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dataplex/v1/data_profile."
          + "proto\022\030google.cloud.dataplex.v1\032\037google/"
          + "api/field_behavior.proto\032\031google/api/res"
          + "ource.proto\032)google/cloud/dataplex/v1/pr"
          + "ocessing.proto\"\322\004\n\017DataProfileSpec\022\036\n\020sa"
          + "mpling_percent\030\002 \001(\002B\004\342A\001\001\022\030\n\nrow_filter"
          + "\030\003 \001(\tB\004\342A\001\001\022Z\n\021post_scan_actions\030\004 \001(\0132"
          + "9.google.cloud.dataplex.v1.DataProfileSp"
          + "ec.PostScanActionsB\004\342A\001\001\022V\n\016include_fiel"
          + "ds\030\005 \001(\01328.google.cloud.dataplex.v1.Data"
          + "ProfileSpec.SelectedFieldsB\004\342A\001\001\022V\n\016excl"
          + "ude_fields\030\006 \001(\01328.google.cloud.dataplex"
          + ".v1.DataProfileSpec.SelectedFieldsB\004\342A\001\001"
          + "\032\313\001\n\017PostScanActions\022g\n\017bigquery_export\030"
          + "\001 \001(\0132H.google.cloud.dataplex.v1.DataPro"
          + "fileSpec.PostScanActions.BigQueryExportB"
          + "\004\342A\001\001\032O\n\016BigQueryExport\022=\n\rresults_table"
          + "\030\001 \001(\tB&\342A\001\001\372A\037\n\035bigquery.googleapis.com"
          + "/Table\032+\n\016SelectedFields\022\031\n\013field_names\030"
          + "\001 \003(\tB\004\342A\001\001\"\350\r\n\021DataProfileResult\022\021\n\trow"
          + "_count\030\003 \001(\003\022D\n\007profile\030\004 \001(\01323.google.c"
          + "loud.dataplex.v1.DataProfileResult.Profi"
          + "le\022;\n\014scanned_data\030\005 \001(\0132%.google.cloud."
          + "dataplex.v1.ScannedData\022i\n\030post_scan_act"
          + "ions_result\030\006 \001(\0132A.google.cloud.dataple"
          + "x.v1.DataProfileResult.PostScanActionsRe"
          + "sultB\004\342A\001\003\032\316\010\n\007Profile\022I\n\006fields\030\002 \003(\01329"
          + ".google.cloud.dataplex.v1.DataProfileRes"
          + "ult.Profile.Field\032\367\007\n\005Field\022\014\n\004name\030\001 \001("
          + "\t\022\014\n\004type\030\002 \001(\t\022\014\n\004mode\030\003 \001(\t\022V\n\007profile"
          + "\030\004 \001(\0132E.google.cloud.dataplex.v1.DataPr"
          + "ofileResult.Profile.Field.ProfileInfo\032\353\006"
          + "\n\013ProfileInfo\022\022\n\nnull_ratio\030\002 \001(\001\022\026\n\016dis"
          + "tinct_ratio\030\003 \001(\001\022e\n\014top_n_values\030\004 \003(\0132"
          + "O.google.cloud.dataplex.v1.DataProfileRe"
          + "sult.Profile.Field.ProfileInfo.TopNValue"
          + "\022o\n\016string_profile\030e \001(\0132U.google.cloud."
          + "dataplex.v1.DataProfileResult.Profile.Fi"
          + "eld.ProfileInfo.StringFieldInfoH\000\022q\n\017int"
          + "eger_profile\030f \001(\0132V.google.cloud.datapl"
          + "ex.v1.DataProfileResult.Profile.Field.Pr"
          + "ofileInfo.IntegerFieldInfoH\000\022o\n\016double_p"
          + "rofile\030g \001(\0132U.google.cloud.dataplex.v1."
          + "DataProfileResult.Profile.Field.ProfileI"
          + "nfo.DoubleFieldInfoH\000\032Q\n\017StringFieldInfo"
          + "\022\022\n\nmin_length\030\001 \001(\003\022\022\n\nmax_length\030\002 \001(\003"
          + "\022\026\n\016average_length\030\003 \001(\001\032l\n\020IntegerField"
          + "Info\022\017\n\007average\030\001 \001(\001\022\032\n\022standard_deviat"
          + "ion\030\003 \001(\001\022\013\n\003min\030\004 \001(\003\022\021\n\tquartiles\030\006 \003("
          + "\003\022\013\n\003max\030\005 \001(\003\032k\n\017DoubleFieldInfo\022\017\n\007ave"
          + "rage\030\001 \001(\001\022\032\n\022standard_deviation\030\003 \001(\001\022\013"
          + "\n\003min\030\004 \001(\001\022\021\n\tquartiles\030\006 \003(\001\022\013\n\003max\030\005 "
          + "\001(\001\0328\n\tTopNValue\022\r\n\005value\030\001 \001(\t\022\r\n\005count"
          + "\030\002 \001(\003\022\r\n\005ratio\030\003 \001(\001B\014\n\nfield_info\032\200\003\n\025"
          + "PostScanActionsResult\022|\n\026bigquery_export"
          + "_result\030\001 \001(\0132V.google.cloud.dataplex.v1"
          + ".DataProfileResult.PostScanActionsResult"
          + ".BigQueryExportResultB\004\342A\001\003\032\350\001\n\024BigQuery"
          + "ExportResult\022q\n\005state\030\001 \001(\0162\\.google.clo"
          + "ud.dataplex.v1.DataProfileResult.PostSca"
          + "nActionsResult.BigQueryExportResult.Stat"
          + "eB\004\342A\001\003\022\025\n\007message\030\002 \001(\tB\004\342A\001\003\"F\n\005State\022"
          + "\025\n\021STATE_UNSPECIFIED\020\000\022\r\n\tSUCCEEDED\020\001\022\n\n"
          + "\006FAILED\020\002\022\013\n\007SKIPPED\020\003Bl\n\034com.google.clo"
          + "ud.dataplex.v1B\020DataProfileProtoP\001Z8clou"
          + "d.google.com/go/dataplex/apiv1/dataplexp"
          + "b;dataplexpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor(),
            });
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor,
            new java.lang.String[] {
              "SamplingPercent", "RowFilter", "PostScanActions", "IncludeFields", "ExcludeFields",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_descriptor,
            new java.lang.String[] {
              "BigqueryExport",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_BigQueryExport_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_BigQueryExport_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileSpec_PostScanActions_BigQueryExport_descriptor,
            new java.lang.String[] {
              "ResultsTable",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_SelectedFields_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileSpec_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataProfileSpec_SelectedFields_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileSpec_SelectedFields_descriptor,
            new java.lang.String[] {
              "FieldNames",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor,
            new java.lang.String[] {
              "RowCount", "Profile", "ScannedData", "PostScanActionsResult",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor,
            new java.lang.String[] {
              "Fields",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor,
            new java.lang.String[] {
              "Name", "Type", "Mode", "Profile",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor,
            new java.lang.String[] {
              "NullRatio",
              "DistinctRatio",
              "TopNValues",
              "StringProfile",
              "IntegerProfile",
              "DoubleProfile",
              "FieldInfo",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_StringFieldInfo_descriptor,
            new java.lang.String[] {
              "MinLength", "MaxLength", "AverageLength",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_IntegerFieldInfo_descriptor,
            new java.lang.String[] {
              "Average", "StandardDeviation", "Min", "Quartiles", "Max",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_DoubleFieldInfo_descriptor,
            new java.lang.String[] {
              "Average", "StandardDeviation", "Min", "Quartiles", "Max",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_Profile_Field_ProfileInfo_TopNValue_descriptor,
            new java.lang.String[] {
              "Value", "Count", "Ratio",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_descriptor,
            new java.lang.String[] {
              "BigqueryExportResult",
            });
    internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_BigQueryExportResult_descriptor =
        internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_BigQueryExportResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dataplex_v1_DataProfileResult_PostScanActionsResult_BigQueryExportResult_descriptor,
            new java.lang.String[] {
              "State", "Message",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.dataplex.v1.ProcessingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
