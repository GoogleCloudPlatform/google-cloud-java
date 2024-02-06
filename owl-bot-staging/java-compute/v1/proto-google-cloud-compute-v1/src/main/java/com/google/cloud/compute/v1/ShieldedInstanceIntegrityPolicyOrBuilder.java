// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ShieldedInstanceIntegrityPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ShieldedInstanceIntegrityPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
   * </pre>
   *
   * <code>optional bool update_auto_learn_policy = 245490215;</code>
   * @return Whether the updateAutoLearnPolicy field is set.
   */
  boolean hasUpdateAutoLearnPolicy();
  /**
   * <pre>
   * Updates the integrity policy baseline using the measurements from the VM instance's most recent boot.
   * </pre>
   *
   * <code>optional bool update_auto_learn_policy = 245490215;</code>
   * @return The updateAutoLearnPolicy.
   */
  boolean getUpdateAutoLearnPolicy();
}
