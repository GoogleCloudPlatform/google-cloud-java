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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface BestEffortProvisioningOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.BestEffortProvisioning)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When this is enabled, cluster/node pool creations will ignore non-fatal
   * errors like stockout to best provision as many nodes as possible right now
   * and eventually bring up all target number of nodes
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Minimum number of nodes to be provisioned to be considered as succeeded,
   * and the rest of nodes will be provisioned gradually and eventually when
   * stockout issue has been resolved.
   * </pre>
   *
   * <code>int32 min_provision_nodes = 2;</code>
   *
   * @return The minProvisionNodes.
   */
  int getMinProvisionNodes();
}
