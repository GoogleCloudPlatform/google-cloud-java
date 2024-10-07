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
// source: google/cloud/datacatalog/v1/dataplex_spec.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface DataplexSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.DataplexSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Fully qualified resource name of an asset in Dataplex, to which the
   * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
   * entity is attached.
   * </pre>
   *
   * <code>string asset = 1;</code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();
  /**
   *
   *
   * <pre>
   * Fully qualified resource name of an asset in Dataplex, to which the
   * underlying data source (Cloud Storage bucket or BigQuery dataset) of the
   * entity is attached.
   * </pre>
   *
   * <code>string asset = 1;</code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * Format of the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
   *
   * @return Whether the dataFormat field is set.
   */
  boolean hasDataFormat();
  /**
   *
   *
   * <pre>
   * Format of the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.datacatalog.v1.PhysicalSchema getDataFormat();
  /**
   *
   *
   * <pre>
   * Format of the data.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.PhysicalSchema data_format = 2;</code>
   */
  com.google.cloud.datacatalog.v1.PhysicalSchemaOrBuilder getDataFormatOrBuilder();

  /**
   *
   *
   * <pre>
   * Compression format of the data, e.g., zip, gzip etc.
   * </pre>
   *
   * <code>string compression_format = 3;</code>
   *
   * @return The compressionFormat.
   */
  java.lang.String getCompressionFormat();
  /**
   *
   *
   * <pre>
   * Compression format of the data, e.g., zip, gzip etc.
   * </pre>
   *
   * <code>string compression_format = 3;</code>
   *
   * @return The bytes for compressionFormat.
   */
  com.google.protobuf.ByteString getCompressionFormatBytes();

  /**
   *
   *
   * <pre>
   * Project ID of the underlying Cloud Storage or BigQuery data. Note that
   * this may not be the same project as the correspondingly Dataplex lake /
   * zone / asset.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project ID of the underlying Cloud Storage or BigQuery data. Note that
   * this may not be the same project as the correspondingly Dataplex lake /
   * zone / asset.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();
}
