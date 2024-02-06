// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface SecurityPoliciesScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPoliciesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of SecurityPolicies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicy security_policies = 127783791;</code>
   */
  java.util.List<com.google.cloud.compute.v1.SecurityPolicy> 
      getSecurityPoliciesList();
  /**
   * <pre>
   * A list of SecurityPolicies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicy security_policies = 127783791;</code>
   */
  com.google.cloud.compute.v1.SecurityPolicy getSecurityPolicies(int index);
  /**
   * <pre>
   * A list of SecurityPolicies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicy security_policies = 127783791;</code>
   */
  int getSecurityPoliciesCount();
  /**
   * <pre>
   * A list of SecurityPolicies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicy security_policies = 127783791;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.SecurityPolicyOrBuilder> 
      getSecurityPoliciesOrBuilderList();
  /**
   * <pre>
   * A list of SecurityPolicies contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.SecurityPolicy security_policies = 127783791;</code>
   */
  com.google.cloud.compute.v1.SecurityPolicyOrBuilder getSecurityPoliciesOrBuilder(
      int index);

  /**
   * <pre>
   * Informational warning which replaces the list of security policies when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * Informational warning which replaces the list of security policies when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * Informational warning which replaces the list of security policies when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
