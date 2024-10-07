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

public interface NodeGroupsDeleteNodesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeGroupsDeleteNodesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @return A list containing the nodes.
   */
  java.util.List<java.lang.String> getNodesList();
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @return The count of nodes.
   */
  int getNodesCount();
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @param index The index of the element to return.
   * @return The nodes at the given index.
   */
  java.lang.String getNodes(int index);
  /**
   *
   *
   * <pre>
   * Names of the nodes to delete.
   * </pre>
   *
   * <code>repeated string nodes = 104993457;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the nodes at the given index.
   */
  com.google.protobuf.ByteString getNodesBytes(int index);
}
