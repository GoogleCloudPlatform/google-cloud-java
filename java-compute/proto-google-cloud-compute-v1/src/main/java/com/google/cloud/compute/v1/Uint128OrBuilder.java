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

public interface Uint128OrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Uint128)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 high = 3202466;</code>
   *
   * @return Whether the high field is set.
   */
  boolean hasHigh();
  /**
   * <code>optional uint64 high = 3202466;</code>
   *
   * @return The high.
   */
  long getHigh();

  /**
   * <code>optional uint64 low = 107348;</code>
   *
   * @return Whether the low field is set.
   */
  boolean hasLow();
  /**
   * <code>optional uint64 low = 107348;</code>
   *
   * @return The low.
   */
  long getLow();
}
