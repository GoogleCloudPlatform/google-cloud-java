/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/optimization/v1/fleet_routing.proto

package com.google.cloud.optimization.v1;

public interface BatchOptimizeToursRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.BatchOptimizeToursRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Target project and location to make a call.
   * Format: `projects/{project-id}/locations/{location-id}`.
   * If no location is specified, a region will be chosen automatically.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Target project and location to make a call.
   * Format: `projects/{project-id}/locations/{location-id}`.
   * If no location is specified, a region will be chosen automatically.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Input/Output information each purchase model, such as file paths
   * and data formats.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig model_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig>
      getModelConfigsList();
  /**
   *
   *
   * <pre>
   * Required. Input/Output information each purchase model, such as file paths
   * and data formats.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig model_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig getModelConfigs(
      int index);
  /**
   *
   *
   * <pre>
   * Required. Input/Output information each purchase model, such as file paths
   * and data formats.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig model_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getModelConfigsCount();
  /**
   *
   *
   * <pre>
   * Required. Input/Output information each purchase model, such as file paths
   * and data formats.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig model_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfigOrBuilder>
      getModelConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Input/Output information each purchase model, such as file paths
   * and data formats.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfig model_configs = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.optimization.v1.BatchOptimizeToursRequest.AsyncModelConfigOrBuilder
      getModelConfigsOrBuilder(int index);
}
