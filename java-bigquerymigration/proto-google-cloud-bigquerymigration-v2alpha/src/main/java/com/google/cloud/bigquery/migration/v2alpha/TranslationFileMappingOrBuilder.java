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
// source: google/cloud/bigquery/migration/v2alpha/translation_task.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.migration.v2alpha;

public interface TranslationFileMappingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.TranslationFileMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Cloud Storage path for a file to translation in a subtask.
   * </pre>
   *
   * <code>string input_path = 1;</code>
   *
   * @return The inputPath.
   */
  java.lang.String getInputPath();
  /**
   *
   *
   * <pre>
   * The Cloud Storage path for a file to translation in a subtask.
   * </pre>
   *
   * <code>string input_path = 1;</code>
   *
   * @return The bytes for inputPath.
   */
  com.google.protobuf.ByteString getInputPathBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path to write back the corresponding input file to.
   * </pre>
   *
   * <code>string output_path = 2;</code>
   *
   * @return The outputPath.
   */
  java.lang.String getOutputPath();
  /**
   *
   *
   * <pre>
   * The Cloud Storage path to write back the corresponding input file to.
   * </pre>
   *
   * <code>string output_path = 2;</code>
   *
   * @return The bytes for outputPath.
   */
  com.google.protobuf.ByteString getOutputPathBytes();
}
