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
// source: google/cloud/notebooks/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v1;

public interface SetInstanceAcceleratorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.SetInstanceAcceleratorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Type of this accelerator.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of this accelerator.
   * </pre>
   *
   * <code>
   * .google.cloud.notebooks.v1.Instance.AcceleratorType type = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.notebooks.v1.Instance.AcceleratorType getType();

  /**
   *
   *
   * <pre>
   * Required. Count of cores of this accelerator. Note that not all combinations
   * of `type` and `core_count` are valid. Check [GPUs on
   * Compute Engine](https://cloud.google.com/compute/docs/gpus/#gpus-list) to
   * find a valid combination. TPUs are not supported.
   * </pre>
   *
   * <code>int64 core_count = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The coreCount.
   */
  long getCoreCount();
}
