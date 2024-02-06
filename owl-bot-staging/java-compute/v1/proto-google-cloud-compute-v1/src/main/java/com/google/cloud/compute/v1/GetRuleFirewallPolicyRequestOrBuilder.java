// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface GetRuleFirewallPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetRuleFirewallPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the firewall policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The firewallPolicy.
   */
  java.lang.String getFirewallPolicy();
  /**
   * <pre>
   * Name of the firewall policy to which the queried rule belongs.
   * </pre>
   *
   * <code>string firewall_policy = 498173265 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for firewallPolicy.
   */
  com.google.protobuf.ByteString
      getFirewallPolicyBytes();

  /**
   * <pre>
   * The priority of the rule to get from the firewall policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   * <pre>
   * The priority of the rule to get from the firewall policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   * @return The priority.
   */
  int getPriority();
}
