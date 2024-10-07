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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface EntityIdSelectorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.EntityIdSelector)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Source of Csv
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
   *
   * @return Whether the csvSource field is set.
   */
  boolean hasCsvSource();
  /**
   *
   *
   * <pre>
   * Source of Csv
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
   *
   * @return The csvSource.
   */
  com.google.cloud.aiplatform.v1.CsvSource getCsvSource();
  /**
   *
   *
   * <pre>
   * Source of Csv
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
   */
  com.google.cloud.aiplatform.v1.CsvSourceOrBuilder getCsvSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Source column that holds entity IDs. If not provided, entity IDs are
   * extracted from the column named entity_id.
   * </pre>
   *
   * <code>string entity_id_field = 5;</code>
   *
   * @return The entityIdField.
   */
  java.lang.String getEntityIdField();
  /**
   *
   *
   * <pre>
   * Source column that holds entity IDs. If not provided, entity IDs are
   * extracted from the column named entity_id.
   * </pre>
   *
   * <code>string entity_id_field = 5;</code>
   *
   * @return The bytes for entityIdField.
   */
  com.google.protobuf.ByteString getEntityIdFieldBytes();

  com.google.cloud.aiplatform.v1.EntityIdSelector.EntityIdsSourceCase getEntityIdsSourceCase();
}
