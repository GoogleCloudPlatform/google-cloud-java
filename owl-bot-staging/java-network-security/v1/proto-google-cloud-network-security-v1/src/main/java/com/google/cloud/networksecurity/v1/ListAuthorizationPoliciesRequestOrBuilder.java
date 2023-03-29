// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/authorization_policy.proto

package com.google.cloud.networksecurity.v1;

public interface ListAuthorizationPoliciesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.ListAuthorizationPoliciesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The project and location from which the AuthorizationPolicies
   * should be listed, specified in the format
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The project and location from which the AuthorizationPolicies
   * should be listed, specified in the format
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Maximum number of AuthorizationPolicies to return per call.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value returned by the last
   * `ListAuthorizationPoliciesResponse` Indicates that this is a
   * continuation of a prior `ListAuthorizationPolicies` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last
   * `ListAuthorizationPoliciesResponse` Indicates that this is a
   * continuation of a prior `ListAuthorizationPolicies` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
