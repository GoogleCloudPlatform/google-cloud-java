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

public interface InterconnectAttachmentConfigurationConstraintsBgpPeerASNRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectAttachmentConfigurationConstraintsBgpPeerASNRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 max = 107876;</code>
   *
   * @return Whether the max field is set.
   */
  boolean hasMax();
  /**
   * <code>optional uint32 max = 107876;</code>
   *
   * @return The max.
   */
  int getMax();

  /**
   * <code>optional uint32 min = 108114;</code>
   *
   * @return Whether the min field is set.
   */
  boolean hasMin();
  /**
   * <code>optional uint32 min = 108114;</code>
   *
   * @return The min.
   */
  int getMin();
}
