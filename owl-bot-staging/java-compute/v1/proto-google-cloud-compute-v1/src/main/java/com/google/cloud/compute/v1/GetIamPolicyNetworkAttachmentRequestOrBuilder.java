// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetIamPolicyNetworkAttachmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetIamPolicyNetworkAttachmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Requested IAM Policy version.
   * </pre>
   *
   * <code>optional int32 options_requested_policy_version = 499220029;</code>
   * @return Whether the optionsRequestedPolicyVersion field is set.
   */
  boolean hasOptionsRequestedPolicyVersion();
  /**
   * <pre>
   * Requested IAM Policy version.
   * </pre>
   *
   * <code>optional int32 options_requested_policy_version = 499220029;</code>
   * @return The optionsRequestedPolicyVersion.
   */
  int getOptionsRequestedPolicyVersion();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <pre>
   * The name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * The name of the region for this request.
   * </pre>
   *
   * <code>string region = 138946292 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resource.
   */
  java.lang.String getResource();
  /**
   * <pre>
   * Name or id of the resource for this request.
   * </pre>
   *
   * <code>string resource = 195806222 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for resource.
   */
  com.google.protobuf.ByteString
      getResourceBytes();
}
