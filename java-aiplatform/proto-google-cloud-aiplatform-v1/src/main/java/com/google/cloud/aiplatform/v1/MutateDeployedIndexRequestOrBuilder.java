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
// source: google/cloud/aiplatform/v1/index_endpoint_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface MutateDeployedIndexRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.MutateDeployedIndexRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the IndexEndpoint resource into which to deploy an
   * Index. Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The indexEndpoint.
   */
  java.lang.String getIndexEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the IndexEndpoint resource into which to deploy an
   * Index. Format:
   * `projects/{project}/locations/{location}/indexEndpoints/{index_endpoint}`
   * </pre>
   *
   * <code>
   * string index_endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for indexEndpoint.
   */
  com.google.protobuf.ByteString getIndexEndpointBytes();

  /**
   *
   *
   * <pre>
   * Required. The DeployedIndex to be updated within the IndexEndpoint.
   * Currently, the updatable fields are [DeployedIndex][automatic_resources]
   * and [DeployedIndex][dedicated_resources]
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployedIndex field is set.
   */
  boolean hasDeployedIndex();
  /**
   *
   *
   * <pre>
   * Required. The DeployedIndex to be updated within the IndexEndpoint.
   * Currently, the updatable fields are [DeployedIndex][automatic_resources]
   * and [DeployedIndex][dedicated_resources]
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployedIndex.
   */
  com.google.cloud.aiplatform.v1.DeployedIndex getDeployedIndex();
  /**
   *
   *
   * <pre>
   * Required. The DeployedIndex to be updated within the IndexEndpoint.
   * Currently, the updatable fields are [DeployedIndex][automatic_resources]
   * and [DeployedIndex][dedicated_resources]
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.DeployedIndex deployed_index = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.DeployedIndexOrBuilder getDeployedIndexOrBuilder();
}
