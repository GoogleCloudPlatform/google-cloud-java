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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

public interface AdditionalPodNetworkConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AdditionalPodNetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the subnetwork where the additional pod network belongs.
   * </pre>
   *
   * <code>string subnetwork = 1;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Name of the subnetwork where the additional pod network belongs.
   * </pre>
   *
   * <code>string subnetwork = 1;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * The name of the secondary range on the subnet which provides IP address for
   * this pod range.
   * </pre>
   *
   * <code>string secondary_pod_range = 2;</code>
   *
   * @return The secondaryPodRange.
   */
  java.lang.String getSecondaryPodRange();
  /**
   *
   *
   * <pre>
   * The name of the secondary range on the subnet which provides IP address for
   * this pod range.
   * </pre>
   *
   * <code>string secondary_pod_range = 2;</code>
   *
   * @return The bytes for secondaryPodRange.
   */
  com.google.protobuf.ByteString getSecondaryPodRangeBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of pods per node which use this pod network.
   * </pre>
   *
   * <code>optional .google.container.v1.MaxPodsConstraint max_pods_per_node = 3;</code>
   *
   * @return Whether the maxPodsPerNode field is set.
   */
  boolean hasMaxPodsPerNode();
  /**
   *
   *
   * <pre>
   * The maximum number of pods per node which use this pod network.
   * </pre>
   *
   * <code>optional .google.container.v1.MaxPodsConstraint max_pods_per_node = 3;</code>
   *
   * @return The maxPodsPerNode.
   */
  com.google.container.v1.MaxPodsConstraint getMaxPodsPerNode();
  /**
   *
   *
   * <pre>
   * The maximum number of pods per node which use this pod network.
   * </pre>
   *
   * <code>optional .google.container.v1.MaxPodsConstraint max_pods_per_node = 3;</code>
   */
  com.google.container.v1.MaxPodsConstraintOrBuilder getMaxPodsPerNodeOrBuilder();
}
