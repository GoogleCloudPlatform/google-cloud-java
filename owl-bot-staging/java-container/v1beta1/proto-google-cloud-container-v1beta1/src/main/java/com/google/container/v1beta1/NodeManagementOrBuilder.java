// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface NodeManagementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeManagement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether the nodes will be automatically upgraded.
   * </pre>
   *
   * <code>bool auto_upgrade = 1;</code>
   * @return The autoUpgrade.
   */
  boolean getAutoUpgrade();

  /**
   * <pre>
   * Whether the nodes will be automatically repaired.
   * </pre>
   *
   * <code>bool auto_repair = 2;</code>
   * @return The autoRepair.
   */
  boolean getAutoRepair();

  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
   * @return Whether the upgradeOptions field is set.
   */
  boolean hasUpgradeOptions();
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
   * @return The upgradeOptions.
   */
  com.google.container.v1beta1.AutoUpgradeOptions getUpgradeOptions();
  /**
   * <pre>
   * Specifies the Auto Upgrade knobs for the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoUpgradeOptions upgrade_options = 10;</code>
   */
  com.google.container.v1beta1.AutoUpgradeOptionsOrBuilder getUpgradeOptionsOrBuilder();
}
