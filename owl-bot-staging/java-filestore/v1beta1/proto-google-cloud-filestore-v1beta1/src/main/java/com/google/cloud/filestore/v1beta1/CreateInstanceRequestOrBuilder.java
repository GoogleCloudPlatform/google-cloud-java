// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

package com.google.cloud.filestore.v1beta1;

public interface CreateInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.CreateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The instance's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Cloud Filestore,
   * locations map to GCP zones, for example **us-west1-b**.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The instance's project and location, in the format
   * `projects/{project_id}/locations/{location}`. In Cloud Filestore,
   * locations map to GCP zones, for example **us-west1-b**.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The ID of the instance to create.
   * The ID must be unique within the specified project and location.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <pre>
   * Required. The ID of the instance to create.
   * The ID must be unique within the specified project and location.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <pre>
   * Required. An [instance resource][google.cloud.filestore.v1beta1.Instance]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * Required. An [instance resource][google.cloud.filestore.v1beta1.Instance]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instance.
   */
  com.google.cloud.filestore.v1beta1.Instance getInstance();
  /**
   * <pre>
   * Required. An [instance resource][google.cloud.filestore.v1beta1.Instance]
   * </pre>
   *
   * <code>.google.cloud.filestore.v1beta1.Instance instance = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.filestore.v1beta1.InstanceOrBuilder getInstanceOrBuilder();
}
