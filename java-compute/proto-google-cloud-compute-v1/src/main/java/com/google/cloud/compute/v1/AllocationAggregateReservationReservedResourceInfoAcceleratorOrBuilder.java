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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface AllocationAggregateReservationReservedResourceInfoAcceleratorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AllocationAggregateReservationReservedResourceInfoAccelerator)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Number of accelerators of specified type.
   * </pre>
   *
   * <code>optional int32 accelerator_count = 504879675;</code>
   *
   * @return Whether the acceleratorCount field is set.
   */
  boolean hasAcceleratorCount();
  /**
   *
   *
   * <pre>
   * Number of accelerators of specified type.
   * </pre>
   *
   * <code>optional int32 accelerator_count = 504879675;</code>
   *
   * @return The acceleratorCount.
   */
  int getAcceleratorCount();

  /**
   *
   *
   * <pre>
   * Full or partial URL to accelerator type. e.g. "projects/{PROJECT}/zones/{ZONE}/acceleratorTypes/ct4l"
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   *
   * @return Whether the acceleratorType field is set.
   */
  boolean hasAcceleratorType();
  /**
   *
   *
   * <pre>
   * Full or partial URL to accelerator type. e.g. "projects/{PROJECT}/zones/{ZONE}/acceleratorTypes/ct4l"
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   *
   * @return The acceleratorType.
   */
  java.lang.String getAcceleratorType();
  /**
   *
   *
   * <pre>
   * Full or partial URL to accelerator type. e.g. "projects/{PROJECT}/zones/{ZONE}/acceleratorTypes/ct4l"
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   *
   * @return The bytes for acceleratorType.
   */
  com.google.protobuf.ByteString getAcceleratorTypeBytes();
}
