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

public interface DeployIndexMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.DeployIndexMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Common metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
   *
   * @return Whether the operationMetadata field is set.
   */
  boolean hasOperationMetadata();
  /**
   *
   *
   * <pre>
   * Common metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
   *
   * @return The operationMetadata.
   */
  com.google.cloud.visionai.v1.OperationMetadata getOperationMetadata();
  /**
   *
   *
   * <pre>
   * Common metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.OperationMetadata operation_metadata = 1;</code>
   */
  com.google.cloud.visionai.v1.OperationMetadataOrBuilder getOperationMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The index being deployed.
   * </pre>
   *
   * <code>
   * string deployed_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The deployedIndex.
   */
  java.lang.String getDeployedIndex();
  /**
   *
   *
   * <pre>
   * Output only. The index being deployed.
   * </pre>
   *
   * <code>
   * string deployed_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for deployedIndex.
   */
  com.google.protobuf.ByteString getDeployedIndexBytes();
}
