// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/endpoint_service.proto

package com.google.cloud.aiplatform.v1;

public interface UpdateEndpointRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.UpdateEndpointRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The Endpoint which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Endpoint endpoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   * <pre>
   * Required. The Endpoint which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Endpoint endpoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The endpoint.
   */
  com.google.cloud.aiplatform.v1.Endpoint getEndpoint();
  /**
   * <pre>
   * Required. The Endpoint which replaces the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Endpoint endpoint = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.aiplatform.v1.EndpointOrBuilder getEndpointOrBuilder();

  /**
   * <pre>
   * Required. The update mask applies to the resource. See [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The update mask applies to the resource. See [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The update mask applies to the resource. See [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
