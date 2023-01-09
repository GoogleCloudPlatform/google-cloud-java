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
// source: google/cloud/aiplatform/v1beta1/index.proto

package com.google.cloud.aiplatform.v1beta1;

public interface IndexOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Index)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Index.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the Index.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the Index.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The display name of the Index.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the Index.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the Index.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * additional information about the Index, that is specific to it. Unset if
   * the Index does not have any additional information. The schema is defined
   * as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string metadata_schema_uri = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The metadataSchemaUri.
   */
  java.lang.String getMetadataSchemaUri();
  /**
   *
   *
   * <pre>
   * Immutable. Points to a YAML file stored on Google Cloud Storage describing
   * additional information about the Index, that is specific to it. Unset if
   * the Index does not have any additional information. The schema is defined
   * as an OpenAPI 3.0.2 [Schema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/main/versions/3.0.2.md#schemaObject).
   * Note: The URI given on output will be immutable and probably different,
   * including the URI scheme, than the one given on input. The output URI will
   * point to a location where the user only has a read access.
   * </pre>
   *
   * <code>string metadata_schema_uri = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for metadataSchemaUri.
   */
  com.google.protobuf.ByteString getMetadataSchemaUriBytes();

  /**
   *
   *
   * <pre>
   * An additional information about the Index; the schema of the metadata can
   * be found in
   * [metadata_schema][google.cloud.aiplatform.v1beta1.Index.metadata_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 6;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * An additional information about the Index; the schema of the metadata can
   * be found in
   * [metadata_schema][google.cloud.aiplatform.v1beta1.Index.metadata_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 6;</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Value getMetadata();
  /**
   *
   *
   * <pre>
   * An additional information about the Index; the schema of the metadata can
   * be found in
   * [metadata_schema][google.cloud.aiplatform.v1beta1.Index.metadata_schema_uri].
   * </pre>
   *
   * <code>.google.protobuf.Value metadata = 6;</code>
   */
  com.google.protobuf.ValueOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The pointers to DeployedIndexes created from this Index.
   * An Index can be only deleted if all its DeployedIndexes had been undeployed
   * first.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedIndexRef deployed_indexes = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.DeployedIndexRef> getDeployedIndexesList();
  /**
   *
   *
   * <pre>
   * Output only. The pointers to DeployedIndexes created from this Index.
   * An Index can be only deleted if all its DeployedIndexes had been undeployed
   * first.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedIndexRef deployed_indexes = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedIndexRef getDeployedIndexes(int index);
  /**
   *
   *
   * <pre>
   * Output only. The pointers to DeployedIndexes created from this Index.
   * An Index can be only deleted if all its DeployedIndexes had been undeployed
   * first.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedIndexRef deployed_indexes = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getDeployedIndexesCount();
  /**
   *
   *
   * <pre>
   * Output only. The pointers to DeployedIndexes created from this Index.
   * An Index can be only deleted if all its DeployedIndexes had been undeployed
   * first.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedIndexRef deployed_indexes = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.DeployedIndexRefOrBuilder>
      getDeployedIndexesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. The pointers to DeployedIndexes created from this Index.
   * An Index can be only deleted if all its DeployedIndexes had been undeployed
   * first.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.DeployedIndexRef deployed_indexes = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedIndexRefOrBuilder getDeployedIndexesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 8;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Indexes.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Indexes.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Indexes.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize your Indexes.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
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
   * The labels with user-defined metadata to organize your Indexes.
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Index was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Index was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Index was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Index was most recently updated.
   * This also includes any update to the contents of the Index.
   * Note that Operations working on this Index may have their
   * [Operations.metadata.generic_metadata.update_time]
   * [google.cloud.aiplatform.v1beta1.GenericOperationMetadata.update_time] a
   * little after the value of this timestamp, yet that does not mean their
   * results are not already reflected in the Index. Result of any successfully
   * completed Operation on the Index is reflected in it.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Index was most recently updated.
   * This also includes any update to the contents of the Index.
   * Note that Operations working on this Index may have their
   * [Operations.metadata.generic_metadata.update_time]
   * [google.cloud.aiplatform.v1beta1.GenericOperationMetadata.update_time] a
   * little after the value of this timestamp, yet that does not mean their
   * results are not already reflected in the Index. Result of any successfully
   * completed Operation on the Index is reflected in it.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this Index was most recently updated.
   * This also includes any update to the contents of the Index.
   * Note that Operations working on this Index may have their
   * [Operations.metadata.generic_metadata.update_time]
   * [google.cloud.aiplatform.v1beta1.GenericOperationMetadata.update_time] a
   * little after the value of this timestamp, yet that does not mean their
   * results are not already reflected in the Index. Result of any successfully
   * completed Operation on the Index is reflected in it.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Stats of the index resource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IndexStats index_stats = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the indexStats field is set.
   */
  boolean hasIndexStats();
  /**
   *
   *
   * <pre>
   * Output only. Stats of the index resource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IndexStats index_stats = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The indexStats.
   */
  com.google.cloud.aiplatform.v1beta1.IndexStats getIndexStats();
  /**
   *
   *
   * <pre>
   * Output only. Stats of the index resource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.IndexStats index_stats = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.IndexStatsOrBuilder getIndexStatsOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. The update method to use with this Index. If not set,
   * BATCH_UPDATE will be used by default.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Index.IndexUpdateMethod index_update_method = 16 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for indexUpdateMethod.
   */
  int getIndexUpdateMethodValue();
  /**
   *
   *
   * <pre>
   * Immutable. The update method to use with this Index. If not set,
   * BATCH_UPDATE will be used by default.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Index.IndexUpdateMethod index_update_method = 16 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The indexUpdateMethod.
   */
  com.google.cloud.aiplatform.v1beta1.Index.IndexUpdateMethod getIndexUpdateMethod();
}
