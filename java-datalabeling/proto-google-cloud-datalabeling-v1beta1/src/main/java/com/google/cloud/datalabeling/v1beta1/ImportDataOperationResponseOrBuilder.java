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
// source: google/cloud/datalabeling/v1beta1/operations.proto

package com.google.cloud.datalabeling.v1beta1;

public interface ImportDataOperationResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImportDataOperationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Ouptut only. The name of imported dataset.
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
   * Ouptut only. The name of imported dataset.
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
   * Output only. Total number of examples requested to import
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
   * Output only. Number of examples imported successfully.
   * </pre>
   *
   * <code>int32 import_count = 3;</code>
   *
   * @return The importCount.
   */
  int getImportCount();
}
