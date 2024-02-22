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
// source: google/cloud/aiplatform/v1/metadata_schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface MetadataSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MetadataSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the MetadataSchema.
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
   * Output only. The resource name of the MetadataSchema.
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
   * The version of the MetadataSchema. The version's format must match
   * the following regular expression: `^[0-9]+[.][0-9]+[.][0-9]+$`, which would
   * allow to order/compare different versions. Example: 1.0.0, 1.0.1, etc.
   * </pre>
   *
   * <code>string schema_version = 2;</code>
   *
   * @return The schemaVersion.
   */
  java.lang.String getSchemaVersion();
  /**
   *
   *
   * <pre>
   * The version of the MetadataSchema. The version's format must match
   * the following regular expression: `^[0-9]+[.][0-9]+[.][0-9]+$`, which would
   * allow to order/compare different versions. Example: 1.0.0, 1.0.1, etc.
   * </pre>
   *
   * <code>string schema_version = 2;</code>
   *
   * @return The bytes for schemaVersion.
   */
  com.google.protobuf.ByteString getSchemaVersionBytes();

  /**
   *
   *
   * <pre>
   * Required. The raw YAML string representation of the MetadataSchema. The
   * combination of [MetadataSchema.version] and the schema name given by
   * `title` in [MetadataSchema.schema] must be unique within a MetadataStore.
   *
   * The schema is defined as an OpenAPI 3.0.2
   * [MetadataSchema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#schemaObject)
   * </pre>
   *
   * <code>string schema = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   *
   *
   * <pre>
   * Required. The raw YAML string representation of the MetadataSchema. The
   * combination of [MetadataSchema.version] and the schema name given by
   * `title` in [MetadataSchema.schema] must be unique within a MetadataStore.
   *
   * The schema is defined as an OpenAPI 3.0.2
   * [MetadataSchema
   * Object](https://github.com/OAI/OpenAPI-Specification/blob/master/versions/3.0.2.md#schemaObject)
   * </pre>
   *
   * <code>string schema = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString getSchemaBytes();

  /**
   *
   *
   * <pre>
   * The type of the MetadataSchema. This is a property that identifies which
   * metadata types will use the MetadataSchema.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MetadataSchema.MetadataSchemaType schema_type = 4;</code>
   *
   * @return The enum numeric value on the wire for schemaType.
   */
  int getSchemaTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the MetadataSchema. This is a property that identifies which
   * metadata types will use the MetadataSchema.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.MetadataSchema.MetadataSchemaType schema_type = 4;</code>
   *
   * @return The schemaType.
   */
  com.google.cloud.aiplatform.v1.MetadataSchema.MetadataSchemaType getSchemaType();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this MetadataSchema was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this MetadataSchema was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this MetadataSchema was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Description of the Metadata Schema
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the Metadata Schema
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
