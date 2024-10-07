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
// source: google/cloud/aiplatform/v1/deployed_index_ref.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1;

public interface DeployedIndexRefOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.DeployedIndexRef)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. A resource name of the IndexEndpoint.
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The indexEndpoint.
   */
  java.lang.String getIndexEndpoint();
  /**
   *
   *
   * <pre>
   * Immutable. A resource name of the IndexEndpoint.
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for indexEndpoint.
   */
  com.google.protobuf.ByteString getIndexEndpointBytes();

  /**
   *
   *
   * <pre>
   * Immutable. The ID of the DeployedIndex in the above IndexEndpoint.
   * </pre>
   *
   * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The deployedIndexId.
   */
  java.lang.String getDeployedIndexId();
  /**
   *
   *
   * <pre>
   * Immutable. The ID of the DeployedIndex in the above IndexEndpoint.
   * </pre>
   *
   * <code>string deployed_index_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for deployedIndexId.
   */
  com.google.protobuf.ByteString getDeployedIndexIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The display name of the DeployedIndex.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Output only. The display name of the DeployedIndex.
   * </pre>
   *
   * <code>string display_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
