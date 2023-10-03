/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/match_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface ReadIndexDatapointsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ReadIndexDatapointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the index endpoint.
   * Format:
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
   * Required. The name of the index endpoint.
   * Format:
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
   * The ID of the DeployedIndex that will serve the request.
   * </pre>
   *
   * <code>string deployed_index_id = 2;</code>
   *
   * @return The deployedIndexId.
   */
  java.lang.String getDeployedIndexId();
  /**
   *
   *
   * <pre>
   * The ID of the DeployedIndex that will serve the request.
   * </pre>
   *
   * <code>string deployed_index_id = 2;</code>
   *
   * @return The bytes for deployedIndexId.
   */
  com.google.protobuf.ByteString getDeployedIndexIdBytes();

  /**
   *
   *
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   *
   * @return A list containing the ids.
   */
  java.util.List<java.lang.String> getIdsList();
  /**
   *
   *
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   *
   * @return The count of ids.
   */
  int getIdsCount();
  /**
   *
   *
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The ids at the given index.
   */
  java.lang.String getIds(int index);
  /**
   *
   *
   * <pre>
   * IDs of the datapoints to be searched for.
   * </pre>
   *
   * <code>repeated string ids = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ids at the given index.
   */
  com.google.protobuf.ByteString getIdsBytes(int index);
}
