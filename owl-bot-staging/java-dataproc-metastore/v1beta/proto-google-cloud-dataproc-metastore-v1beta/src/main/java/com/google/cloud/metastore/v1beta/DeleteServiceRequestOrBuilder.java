// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1beta;

public interface DeleteServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.DeleteServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The relative resource name of the metastore service to delete, in
   * the following form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The relative resource name of the metastore service to delete, in
   * the following form:
   *
   * `projects/{project_number}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   *
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   *
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format)
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   *
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   *
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format)
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();
}
