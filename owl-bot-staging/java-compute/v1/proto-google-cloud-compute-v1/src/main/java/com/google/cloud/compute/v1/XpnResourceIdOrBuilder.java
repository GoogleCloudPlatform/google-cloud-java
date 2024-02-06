// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface XpnResourceIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.XpnResourceId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the service resource. In the case of projects, this field supports project id (e.g., my-project-123) and project number (e.g. 12345678).
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the service resource. In the case of projects, this field supports project id (e.g., my-project-123) and project number (e.g. 12345678).
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * The ID of the service resource. In the case of projects, this field supports project id (e.g., my-project-123) and project number (e.g. 12345678).
   * </pre>
   *
   * <code>optional string id = 3355;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * The type of the service resource.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * The type of the service resource.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * The type of the service resource.
   * Check the Type enum for the list of possible values.
   * </pre>
   *
   * <code>optional string type = 3575610;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
