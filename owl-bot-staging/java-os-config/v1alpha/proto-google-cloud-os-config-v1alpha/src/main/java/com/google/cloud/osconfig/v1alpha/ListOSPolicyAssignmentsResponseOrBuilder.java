// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

package com.google.cloud.osconfig.v1alpha;

public interface ListOSPolicyAssignmentsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.ListOSPolicyAssignmentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  java.util.List<com.google.cloud.osconfig.v1alpha.OSPolicyAssignment> 
      getOsPolicyAssignmentsList();
  /**
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignment getOsPolicyAssignments(int index);
  /**
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  int getOsPolicyAssignmentsCount();
  /**
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  java.util.List<? extends com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder> 
      getOsPolicyAssignmentsOrBuilderList();
  /**
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentsOrBuilder(
      int index);

  /**
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignments.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignments.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
