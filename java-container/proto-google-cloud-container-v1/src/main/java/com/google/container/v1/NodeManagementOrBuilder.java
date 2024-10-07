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

public interface NodeManagementOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeManagement)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A flag that specifies whether node auto-upgrade is enabled for the node
   * pool. If enabled, node auto-upgrade helps keep the nodes in your node pool
   * up to date with the latest release version of Kubernetes.
   * </pre>
   *
   * <code>bool auto_upgrade = 1;</code>
   *
   * @return The autoUpgrade.
   */
  boolean getAutoUpgrade();

  /**
   *
   *
   * <pre>
   * A flag that specifies whether the node auto-repair is enabled for the node
   * pool. If enabled, the nodes in this node pool will be monitored and, if
   * they fail health checks too many times, an automatic repair action will be
   * triggered.
   * </pre>
   *
   * <code>bool auto_repair = 2;</code>
   *
   * @return The autoRepair.
   */
  boolean getAutoRepair();

  /**
   *
   *
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   *
   * @return Whether the upgradeOptions field is set.
   */
  boolean hasUpgradeOptions();
  /**
   *
   *
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   *
   * @return The upgradeOptions.
   */
  com.google.container.v1.AutoUpgradeOptions getUpgradeOptions();
  /**
   *
   *
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  com.google.container.v1.AutoUpgradeOptionsOrBuilder getUpgradeOptionsOrBuilder();
}
