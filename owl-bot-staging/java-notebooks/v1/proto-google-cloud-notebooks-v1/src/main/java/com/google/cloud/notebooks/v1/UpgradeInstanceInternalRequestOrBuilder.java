// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/notebooks/v1/service.proto

package com.google.cloud.notebooks.v1;

public interface UpgradeInstanceInternalRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.UpgradeInstanceInternalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The vmId.
   */
  java.lang.String getVmId();
  /**
   * <pre>
   * Required. The VM hardware token for authenticating the VM.
   * https://cloud.google.com/compute/docs/instances/verifying-instance-identity
   * </pre>
   *
   * <code>string vm_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for vmId.
   */
  com.google.protobuf.ByteString
      getVmIdBytes();

  /**
   * <pre>
   * Optional. The optional UpgradeType. Setting this field will search for additional
   * compute images to upgrade this instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.UpgradeType type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Optional. The optional UpgradeType. Setting this field will search for additional
   * compute images to upgrade this instance.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.UpgradeType type = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The type.
   */
  com.google.cloud.notebooks.v1.UpgradeType getType();
}
