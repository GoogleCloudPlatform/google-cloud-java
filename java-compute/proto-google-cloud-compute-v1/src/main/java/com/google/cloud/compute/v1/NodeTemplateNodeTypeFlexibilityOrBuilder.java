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

public interface NodeTemplateNodeTypeFlexibilityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string cpus = 3060683;</code>
   *
   * @return Whether the cpus field is set.
   */
  boolean hasCpus();
  /**
   * <code>optional string cpus = 3060683;</code>
   *
   * @return The cpus.
   */
  java.lang.String getCpus();
  /**
   * <code>optional string cpus = 3060683;</code>
   *
   * @return The bytes for cpus.
   */
  com.google.protobuf.ByteString getCpusBytes();

  /**
   * <code>optional string local_ssd = 405741360;</code>
   *
   * @return Whether the localSsd field is set.
   */
  boolean hasLocalSsd();
  /**
   * <code>optional string local_ssd = 405741360;</code>
   *
   * @return The localSsd.
   */
  java.lang.String getLocalSsd();
  /**
   * <code>optional string local_ssd = 405741360;</code>
   *
   * @return The bytes for localSsd.
   */
  com.google.protobuf.ByteString getLocalSsdBytes();

  /**
   * <code>optional string memory = 532856065;</code>
   *
   * @return Whether the memory field is set.
   */
  boolean hasMemory();
  /**
   * <code>optional string memory = 532856065;</code>
   *
   * @return The memory.
   */
  java.lang.String getMemory();
  /**
   * <code>optional string memory = 532856065;</code>
   *
   * @return The bytes for memory.
   */
  com.google.protobuf.ByteString getMemoryBytes();
}
