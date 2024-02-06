// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1/datafusion.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datafusion.v1;

public interface CreateInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1.CreateInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The instance's project and location in the format
   * projects/{project}/locations/{location}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The instance's project and location in the format
   * projects/{project}/locations/{location}.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The name of the instance to create.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   * <pre>
   * Required. The name of the instance to create.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString
      getInstanceIdBytes();

  /**
   * <pre>
   * An instance resource.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance instance = 3;</code>
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   * <pre>
   * An instance resource.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance instance = 3;</code>
   * @return The instance.
   */
  com.google.cloud.datafusion.v1.Instance getInstance();
  /**
   * <pre>
   * An instance resource.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1.Instance instance = 3;</code>
   */
  com.google.cloud.datafusion.v1.InstanceOrBuilder getInstanceOrBuilder();
}
