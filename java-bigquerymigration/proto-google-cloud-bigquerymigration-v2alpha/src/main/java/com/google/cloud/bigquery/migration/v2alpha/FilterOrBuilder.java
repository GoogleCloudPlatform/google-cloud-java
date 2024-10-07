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

public interface FilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.Filter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of prefixes used to exclude processing for input files.
   * </pre>
   *
   * <code>repeated string input_file_exclusion_prefixes = 1;</code>
   *
   * @return A list containing the inputFileExclusionPrefixes.
   */
  java.util.List<java.lang.String> getInputFileExclusionPrefixesList();
  /**
   *
   *
   * <pre>
   * The list of prefixes used to exclude processing for input files.
   * </pre>
   *
   * <code>repeated string input_file_exclusion_prefixes = 1;</code>
   *
   * @return The count of inputFileExclusionPrefixes.
   */
  int getInputFileExclusionPrefixesCount();
  /**
   *
   *
   * <pre>
   * The list of prefixes used to exclude processing for input files.
   * </pre>
   *
   * <code>repeated string input_file_exclusion_prefixes = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The inputFileExclusionPrefixes at the given index.
   */
  java.lang.String getInputFileExclusionPrefixes(int index);
  /**
   *
   *
   * <pre>
   * The list of prefixes used to exclude processing for input files.
   * </pre>
   *
   * <code>repeated string input_file_exclusion_prefixes = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the inputFileExclusionPrefixes at the given index.
   */
  com.google.protobuf.ByteString getInputFileExclusionPrefixesBytes(int index);
}
