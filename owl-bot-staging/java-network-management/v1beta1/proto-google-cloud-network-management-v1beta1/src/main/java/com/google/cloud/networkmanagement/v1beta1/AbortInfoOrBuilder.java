// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networkmanagement/v1beta1/trace.proto

package com.google.cloud.networkmanagement.v1beta1;

public interface AbortInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1beta1.AbortInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Causes that the analysis is aborted.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
   * @return The enum numeric value on the wire for cause.
   */
  int getCauseValue();
  /**
   * <pre>
   * Causes that the analysis is aborted.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause cause = 1;</code>
   * @return The cause.
   */
  com.google.cloud.networkmanagement.v1beta1.AbortInfo.Cause getCause();

  /**
   * <pre>
   * URI of the resource that caused the abort.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   * @return The resourceUri.
   */
  java.lang.String getResourceUri();
  /**
   * <pre>
   * URI of the resource that caused the abort.
   * </pre>
   *
   * <code>string resource_uri = 2;</code>
   * @return The bytes for resourceUri.
   */
  com.google.protobuf.ByteString
      getResourceUriBytes();

  /**
   * <pre>
   * List of project IDs that the user has specified in the request but does
   * not have permission to access network configs. Analysis is aborted in this
   * case with the PERMISSION_DENIED cause.
   * </pre>
   *
   * <code>repeated string projects_missing_permission = 3;</code>
   * @return A list containing the projectsMissingPermission.
   */
  java.util.List<java.lang.String>
      getProjectsMissingPermissionList();
  /**
   * <pre>
   * List of project IDs that the user has specified in the request but does
   * not have permission to access network configs. Analysis is aborted in this
   * case with the PERMISSION_DENIED cause.
   * </pre>
   *
   * <code>repeated string projects_missing_permission = 3;</code>
   * @return The count of projectsMissingPermission.
   */
  int getProjectsMissingPermissionCount();
  /**
   * <pre>
   * List of project IDs that the user has specified in the request but does
   * not have permission to access network configs. Analysis is aborted in this
   * case with the PERMISSION_DENIED cause.
   * </pre>
   *
   * <code>repeated string projects_missing_permission = 3;</code>
   * @param index The index of the element to return.
   * @return The projectsMissingPermission at the given index.
   */
  java.lang.String getProjectsMissingPermission(int index);
  /**
   * <pre>
   * List of project IDs that the user has specified in the request but does
   * not have permission to access network configs. Analysis is aborted in this
   * case with the PERMISSION_DENIED cause.
   * </pre>
   *
   * <code>repeated string projects_missing_permission = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the projectsMissingPermission at the given index.
   */
  com.google.protobuf.ByteString
      getProjectsMissingPermissionBytes(int index);
}
