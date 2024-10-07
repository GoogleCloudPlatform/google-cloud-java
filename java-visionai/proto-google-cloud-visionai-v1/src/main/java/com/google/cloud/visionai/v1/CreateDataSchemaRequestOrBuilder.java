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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface CreateDataSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.CreateDataSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource where this data schema will be created.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource where this data schema will be created.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The data schema to create.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.DataSchema data_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataSchema field is set.
   */
  boolean hasDataSchema();
  /**
   *
   *
   * <pre>
   * Required. The data schema to create.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.DataSchema data_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataSchema.
   */
  com.google.cloud.visionai.v1.DataSchema getDataSchema();
  /**
   *
   *
   * <pre>
   * Required. The data schema to create.
   * </pre>
   *
   * <code>
   * .google.cloud.visionai.v1.DataSchema data_schema = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.visionai.v1.DataSchemaOrBuilder getDataSchemaOrBuilder();
}
