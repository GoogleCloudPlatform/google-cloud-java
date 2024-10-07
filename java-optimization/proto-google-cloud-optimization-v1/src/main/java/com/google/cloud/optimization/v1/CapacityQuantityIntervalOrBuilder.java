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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.optimization.v1;

@java.lang.Deprecated
public interface CapacityQuantityIntervalOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.optimization.v1.CapacityQuantityInterval)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   * <code>optional int64 min_value = 2;</code>
   *
   * @return Whether the minValue field is set.
   */
  boolean hasMinValue();
  /**
   * <code>optional int64 min_value = 2;</code>
   *
   * @return The minValue.
   */
  long getMinValue();

  /**
   * <code>optional int64 max_value = 3;</code>
   *
   * @return Whether the maxValue field is set.
   */
  boolean hasMaxValue();
  /**
   * <code>optional int64 max_value = 3;</code>
   *
   * @return The maxValue.
   */
  long getMaxValue();
}
