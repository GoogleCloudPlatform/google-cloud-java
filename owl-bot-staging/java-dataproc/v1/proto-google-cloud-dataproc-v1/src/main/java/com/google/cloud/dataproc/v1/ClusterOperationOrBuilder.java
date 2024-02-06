// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/workflow_templates.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface ClusterOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ClusterOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The id of the cluster operation.
   * </pre>
   *
   * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * Output only. The id of the cluster operation.
   * </pre>
   *
   * <code>string operation_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * Output only. Error, if operation failed.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <pre>
   * Output only. Error, if operation failed.
   * </pre>
   *
   * <code>string error = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <pre>
   * Output only. Indicates the operation is done.
   * </pre>
   *
   * <code>bool done = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The done.
   */
  boolean getDone();
}
