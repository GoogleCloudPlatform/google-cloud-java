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
// source: google/cloud/aiplatform/v1beta1/metadata_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface QueryContextLineageSubgraphRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QueryContextLineageSubgraphRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Context whose Artifacts and Executions
   * should be retrieved as a LineageSubgraph.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   *
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The context.
   */
  java.lang.String getContext();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Context whose Artifacts and Executions
   * should be retrieved as a LineageSubgraph.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/contexts/{context}`
   *
   * The request may error with FAILED_PRECONDITION if the number of Artifacts,
   * the number of Executions, or the number of Events that would be returned
   * for the Context exceeds 1000.
   * </pre>
   *
   * <code>
   * string context = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString getContextBytes();
}
