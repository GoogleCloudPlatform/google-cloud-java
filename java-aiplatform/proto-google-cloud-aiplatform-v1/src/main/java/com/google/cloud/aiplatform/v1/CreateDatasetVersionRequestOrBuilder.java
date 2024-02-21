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
// source: google/cloud/aiplatform/v1/dataset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface CreateDatasetVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateDatasetVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
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
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
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
   * Required. The version to be created. The same CMEK policies with the
   * original Dataset will be applied the dataset version. So here we don't need
   * to specify the EncryptionSpecType here.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the datasetVersion field is set.
   */
  boolean hasDatasetVersion();
  /**
   *
   *
   * <pre>
   * Required. The version to be created. The same CMEK policies with the
   * original Dataset will be applied the dataset version. So here we don't need
   * to specify the EncryptionSpecType here.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The datasetVersion.
   */
  com.google.cloud.aiplatform.v1.DatasetVersion getDatasetVersion();
  /**
   *
   *
   * <pre>
   * Required. The version to be created. The same CMEK policies with the
   * original Dataset will be applied the dataset version. So here we don't need
   * to specify the EncryptionSpecType here.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DatasetVersion dataset_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.DatasetVersionOrBuilder getDatasetVersionOrBuilder();
}
