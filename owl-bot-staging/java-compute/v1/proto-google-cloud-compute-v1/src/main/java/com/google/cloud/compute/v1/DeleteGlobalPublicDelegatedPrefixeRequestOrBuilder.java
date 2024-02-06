// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface DeleteGlobalPublicDelegatedPrefixeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DeleteGlobalPublicDelegatedPrefixeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * Name of the PublicDelegatedPrefix resource to delete.
   * </pre>
   *
   * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The publicDelegatedPrefix.
   */
  java.lang.String getPublicDelegatedPrefix();
  /**
   * <pre>
   * Name of the PublicDelegatedPrefix resource to delete.
   * </pre>
   *
   * <code>string public_delegated_prefix = 204238440 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for publicDelegatedPrefix.
   */
  com.google.protobuf.ByteString
      getPublicDelegatedPrefixBytes();

  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return Whether the requestId field is set.
   */
  boolean hasRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>optional string request_id = 37109963;</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
