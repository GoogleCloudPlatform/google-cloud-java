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
// source: google/cloud/datalabeling/v1beta1/operations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

public interface ExportDataOperationResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ExportDataOperationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Ouptut only. The name of dataset.
   * "projects/&#42;&#47;datasets/&#42;"
   * </pre>
   *
   * <code>string dataset = 1;</code>
   *
   * @return The dataset.
   */
  java.lang.String getDataset();
  /**
   *
   *
   * <pre>
   * Ouptut only. The name of dataset.
   * "projects/&#42;&#47;datasets/&#42;"
   * </pre>
   *
   * <code>string dataset = 1;</code>
   *
   * @return The bytes for dataset.
   */
  com.google.protobuf.ByteString getDatasetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Total number of examples requested to export
   * </pre>
   *
   * <code>int32 total_count = 2;</code>
   *
   * @return The totalCount.
   */
  int getTotalCount();

  /**
   *
   *
   * <pre>
   * Output only. Number of examples exported successfully.
   * </pre>
   *
   * <code>int32 export_count = 3;</code>
   *
   * @return The exportCount.
   */
  int getExportCount();

  /**
   *
   *
   * <pre>
   * Output only. Statistic infos of labels in the exported dataset.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelStats label_stats = 4;</code>
   *
   * @return Whether the labelStats field is set.
   */
  boolean hasLabelStats();
  /**
   *
   *
   * <pre>
   * Output only. Statistic infos of labels in the exported dataset.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelStats label_stats = 4;</code>
   *
   * @return The labelStats.
   */
  com.google.cloud.datalabeling.v1beta1.LabelStats getLabelStats();
  /**
   *
   *
   * <pre>
   * Output only. Statistic infos of labels in the exported dataset.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelStats label_stats = 4;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelStatsOrBuilder getLabelStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. output_config in the ExportData request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.OutputConfig output_config = 5;</code>
   *
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   *
   *
   * <pre>
   * Output only. output_config in the ExportData request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.OutputConfig output_config = 5;</code>
   *
   * @return The outputConfig.
   */
  com.google.cloud.datalabeling.v1beta1.OutputConfig getOutputConfig();
  /**
   *
   *
   * <pre>
   * Output only. output_config in the ExportData request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.OutputConfig output_config = 5;</code>
   */
  com.google.cloud.datalabeling.v1beta1.OutputConfigOrBuilder getOutputConfigOrBuilder();
}
