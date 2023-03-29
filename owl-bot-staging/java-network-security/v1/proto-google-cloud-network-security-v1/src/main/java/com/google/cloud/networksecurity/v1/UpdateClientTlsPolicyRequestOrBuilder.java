// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/client_tls_policy.proto

package com.google.cloud.networksecurity.v1;

public interface UpdateClientTlsPolicyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.UpdateClientTlsPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ClientTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ClientTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * ClientTlsPolicy resource by the update.  The fields
   * specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the
   * mask. If the user does not provide a mask then all fields will be
   * overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Required. Updated ClientTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the clientTlsPolicy field is set.
   */
  boolean hasClientTlsPolicy();
  /**
   * <pre>
   * Required. Updated ClientTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clientTlsPolicy.
   */
  com.google.cloud.networksecurity.v1.ClientTlsPolicy getClientTlsPolicy();
  /**
   * <pre>
   * Required. Updated ClientTlsPolicy resource.
   * </pre>
   *
   * <code>.google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder getClientTlsPolicyOrBuilder();
}
