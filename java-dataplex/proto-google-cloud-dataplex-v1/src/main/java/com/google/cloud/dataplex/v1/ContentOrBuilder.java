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
// source: google/cloud/dataplex/v1/analyze.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dataplex.v1;

public interface ContentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Content)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the content, of the form:
   * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The relative resource name of the content, of the form:
   * projects/{project_id}/locations/{location_id}/lakes/{lake_id}/content/{content_id}
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the content. This ID
   * will be different if the content is deleted and re-created with the same
   * name.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. System generated globally unique ID for the content. This ID
   * will be different if the content is deleted and re-created with the same
   * name.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Required. The path for the Content file, represented as directory
   * structure. Unique within a lake. Limited to alphanumerics, hyphens,
   * underscores, dots and slashes.
   * </pre>
   *
   * <code>string path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Required. The path for the Content file, represented as directory
   * structure. Unique within a lake. Limited to alphanumerics, hyphens,
   * underscores, dots and slashes.
   * </pre>
   *
   * <code>string path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Output only. Content creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Content creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Content creation time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the content was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the content was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the content was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the content.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the content.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the content.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the content.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User defined labels for the content.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Description of the content.
   * </pre>
   *
   * <code>string description = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the content.
   * </pre>
   *
   * <code>string description = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Content data in string format.
   * </pre>
   *
   * <code>string data_text = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the dataText field is set.
   */
  boolean hasDataText();
  /**
   *
   *
   * <pre>
   * Required. Content data in string format.
   * </pre>
   *
   * <code>string data_text = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataText.
   */
  java.lang.String getDataText();
  /**
   *
   *
   * <pre>
   * Required. Content data in string format.
   * </pre>
   *
   * <code>string data_text = 9 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataText.
   */
  com.google.protobuf.ByteString getDataTextBytes();

  /**
   *
   *
   * <pre>
   * Sql Script related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content.SqlScript sql_script = 100;</code>
   *
   * @return Whether the sqlScript field is set.
   */
  boolean hasSqlScript();
  /**
   *
   *
   * <pre>
   * Sql Script related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content.SqlScript sql_script = 100;</code>
   *
   * @return The sqlScript.
   */
  com.google.cloud.dataplex.v1.Content.SqlScript getSqlScript();
  /**
   *
   *
   * <pre>
   * Sql Script related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content.SqlScript sql_script = 100;</code>
   */
  com.google.cloud.dataplex.v1.Content.SqlScriptOrBuilder getSqlScriptOrBuilder();

  /**
   *
   *
   * <pre>
   * Notebook related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content.Notebook notebook = 101;</code>
   *
   * @return Whether the notebook field is set.
   */
  boolean hasNotebook();
  /**
   *
   *
   * <pre>
   * Notebook related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content.Notebook notebook = 101;</code>
   *
   * @return The notebook.
   */
  com.google.cloud.dataplex.v1.Content.Notebook getNotebook();
  /**
   *
   *
   * <pre>
   * Notebook related configurations.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Content.Notebook notebook = 101;</code>
   */
  com.google.cloud.dataplex.v1.Content.NotebookOrBuilder getNotebookOrBuilder();

  com.google.cloud.dataplex.v1.Content.DataCase getDataCase();

  com.google.cloud.dataplex.v1.Content.ContentCase getContentCase();
}
