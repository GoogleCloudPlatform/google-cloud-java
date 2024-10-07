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

public interface ExportDataOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ExportDataOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of dataset to be exported.
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
   * Output only. The name of dataset to be exported.
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
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<com.google.rpc.Status> getPartialFailuresList();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.Status getPartialFailures(int index);
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  int getPartialFailuresCount();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  java.util.List<? extends com.google.rpc.StatusOrBuilder> getPartialFailuresOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Partial failures encountered.
   * E.g. single files that couldn't be read.
   * Status details field will contain standard GCP error details.
   * </pre>
   *
   * <code>repeated .google.rpc.Status partial_failures = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailuresOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when export dataset request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when export dataset request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when export dataset request was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
