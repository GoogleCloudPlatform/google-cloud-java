// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If set to true, enables CAAP for L7 DDoS detection. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return Whether the enable field is set.
   */
  boolean hasEnable();
  /**
   * <pre>
   * If set to true, enables CAAP for L7 DDoS detection. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional bool enable = 311764355;</code>
   * @return The enable.
   */
  boolean getEnable();

  /**
   * <pre>
   * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * Check the RuleVisibility enum for the list of possible values.
   * </pre>
   *
   * <code>optional string rule_visibility = 453258293;</code>
   * @return Whether the ruleVisibility field is set.
   */
  boolean hasRuleVisibility();
  /**
   * <pre>
   * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * Check the RuleVisibility enum for the list of possible values.
   * </pre>
   *
   * <code>optional string rule_visibility = 453258293;</code>
   * @return The ruleVisibility.
   */
  java.lang.String getRuleVisibility();
  /**
   * <pre>
   * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * Check the RuleVisibility enum for the list of possible values.
   * </pre>
   *
   * <code>optional string rule_visibility = 453258293;</code>
   * @return The bytes for ruleVisibility.
   */
  com.google.protobuf.ByteString
      getRuleVisibilityBytes();
}
