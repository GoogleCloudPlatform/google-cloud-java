// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/identity/accesscontextmanager/v1/access_context_manager.proto

package com.google.identity.accesscontextmanager.v1;

public interface UpdateGcpUserAccessBindingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.identity.accesscontextmanager.v1.UpdateGcpUserAccessBindingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the gcpUserAccessBinding field is set.
   */
  boolean hasGcpUserAccessBinding();
  /**
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The gcpUserAccessBinding.
   */
  com.google.identity.accesscontextmanager.v1.GcpUserAccessBinding getGcpUserAccessBinding();
  /**
   * <pre>
   * Required. [GcpUserAccessBinding]
   * [google.identity.accesscontextmanager.v1.GcpUserAccessBinding]
   * </pre>
   *
   * <code>.google.identity.accesscontextmanager.v1.GcpUserAccessBinding gcp_user_access_binding = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.identity.accesscontextmanager.v1.GcpUserAccessBindingOrBuilder getGcpUserAccessBindingOrBuilder();

  /**
   * <pre>
   * Required. Only the fields specified in this mask are updated. Because name and
   * group_key cannot be changed, update_mask is required and must always be:
   * update_mask {
   * paths: "access_levels"
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Only the fields specified in this mask are updated. Because name and
   * group_key cannot be changed, update_mask is required and must always be:
   * update_mask {
   * paths: "access_levels"
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Only the fields specified in this mask are updated. Because name and
   * group_key cannot be changed, update_mask is required and must always be:
   * update_mask {
   * paths: "access_levels"
   * }
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
