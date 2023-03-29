// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/osconfig/v1alpha/os_policy_assignments.proto

package com.google.cloud.osconfig.v1alpha;

public interface ListOSPolicyAssignmentRevisionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.ListOSPolicyAssignmentRevisionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the OS policy assignment to list revisions for.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the OS policy assignment to list revisions for.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The maximum number of revisions to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A pagination token returned from a previous call to
   * `ListOSPolicyAssignmentRevisions` that indicates where this listing should
   * continue from.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A pagination token returned from a previous call to
   * `ListOSPolicyAssignmentRevisions` that indicates where this listing should
   * continue from.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
