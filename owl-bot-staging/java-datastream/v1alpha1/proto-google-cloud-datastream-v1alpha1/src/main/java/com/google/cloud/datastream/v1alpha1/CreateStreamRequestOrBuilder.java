// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1alpha1;

public interface CreateStreamRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.CreateStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The parent that owns the collection of streams.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The parent that owns the collection of streams.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The stream identifier.
   * </pre>
   *
   * <code>string stream_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The streamId.
   */
  java.lang.String getStreamId();
  /**
   * <pre>
   * Required. The stream identifier.
   * </pre>
   *
   * <code>string stream_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for streamId.
   */
  com.google.protobuf.ByteString
      getStreamIdBytes();

  /**
   * <pre>
   * Required. The stream resource to create.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Stream stream = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the stream field is set.
   */
  boolean hasStream();
  /**
   * <pre>
   * Required. The stream resource to create.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Stream stream = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The stream.
   */
  com.google.cloud.datastream.v1alpha1.Stream getStream();
  /**
   * <pre>
   * Required. The stream resource to create.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.Stream stream = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datastream.v1alpha1.StreamOrBuilder getStreamOrBuilder();

  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server will guarantee
   * that for at least 60 minutes since the first request.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * Optional. Only validate the stream, but do not create any resources.
   * The default is false.
   * </pre>
   *
   * <code>bool validate_only = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   * <pre>
   * Optional. Create the stream without validating it.
   * </pre>
   *
   * <code>bool force = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The force.
   */
  boolean getForce();
}
