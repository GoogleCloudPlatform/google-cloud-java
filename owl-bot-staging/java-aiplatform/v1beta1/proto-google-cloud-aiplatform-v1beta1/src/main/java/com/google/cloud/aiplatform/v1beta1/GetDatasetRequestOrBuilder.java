// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface GetDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.GetDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the Dataset resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the Dataset resource.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   * <pre>
   * Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
