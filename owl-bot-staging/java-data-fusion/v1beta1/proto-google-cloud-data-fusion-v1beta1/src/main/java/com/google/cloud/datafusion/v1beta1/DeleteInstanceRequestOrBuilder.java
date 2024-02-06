// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datafusion.v1beta1;

public interface DeleteInstanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.DeleteInstanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The instance resource name in the format
   * projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The instance resource name in the format
   * projects/{project}/locations/{location}/instances/{instance}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
