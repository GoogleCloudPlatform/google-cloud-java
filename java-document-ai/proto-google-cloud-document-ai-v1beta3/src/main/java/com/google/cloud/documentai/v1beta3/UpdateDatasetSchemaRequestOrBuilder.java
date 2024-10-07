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
// source: google/cloud/documentai/v1beta3/document_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.documentai.v1beta3;

public interface UpdateDatasetSchemaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.UpdateDatasetSchemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name field of the `DatasetSchema` is used to identify the
   * resource to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DatasetSchema dataset_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the datasetSchema field is set.
   */
  boolean hasDatasetSchema();
  /**
   *
   *
   * <pre>
   * Required. The name field of the `DatasetSchema` is used to identify the
   * resource to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DatasetSchema dataset_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The datasetSchema.
   */
  com.google.cloud.documentai.v1beta3.DatasetSchema getDatasetSchema();
  /**
   *
   *
   * <pre>
   * Required. The name field of the `DatasetSchema` is used to identify the
   * resource to be updated.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DatasetSchema dataset_schema = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.documentai.v1beta3.DatasetSchemaOrBuilder getDatasetSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
