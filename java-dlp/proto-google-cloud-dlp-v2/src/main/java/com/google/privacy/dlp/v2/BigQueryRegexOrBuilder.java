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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface BigQueryRegexOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.BigQueryRegex)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * For organizations, if unset, will match all projects. Has no effect
   * for data profile configurations created within a project.
   * </pre>
   *
   * <code>string project_id_regex = 1;</code>
   *
   * @return The projectIdRegex.
   */
  java.lang.String getProjectIdRegex();
  /**
   *
   *
   * <pre>
   * For organizations, if unset, will match all projects. Has no effect
   * for data profile configurations created within a project.
   * </pre>
   *
   * <code>string project_id_regex = 1;</code>
   *
   * @return The bytes for projectIdRegex.
   */
  com.google.protobuf.ByteString getProjectIdRegexBytes();

  /**
   *
   *
   * <pre>
   * If unset, this property matches all datasets.
   * </pre>
   *
   * <code>string dataset_id_regex = 2;</code>
   *
   * @return The datasetIdRegex.
   */
  java.lang.String getDatasetIdRegex();
  /**
   *
   *
   * <pre>
   * If unset, this property matches all datasets.
   * </pre>
   *
   * <code>string dataset_id_regex = 2;</code>
   *
   * @return The bytes for datasetIdRegex.
   */
  com.google.protobuf.ByteString getDatasetIdRegexBytes();

  /**
   *
   *
   * <pre>
   * If unset, this property matches all tables.
   * </pre>
   *
   * <code>string table_id_regex = 3;</code>
   *
   * @return The tableIdRegex.
   */
  java.lang.String getTableIdRegex();
  /**
   *
   *
   * <pre>
   * If unset, this property matches all tables.
   * </pre>
   *
   * <code>string table_id_regex = 3;</code>
   *
   * @return The bytes for tableIdRegex.
   */
  com.google.protobuf.ByteString getTableIdRegexBytes();
}
