// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.lineage.v1;

public interface DeleteRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.DeleteRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the run to delete.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the run to delete.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * If set to true and the run is not found, the request
   * succeeds but the server doesn't perform any actions.
   * </pre>
   *
   * <code>bool allow_missing = 2;</code>
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
