// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InstancesSetNameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesSetNameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The current name of this resource, used to prevent conflicts. Provide the latest name when making a request to change name.
   * </pre>
   *
   * <code>optional string current_name = 394983825;</code>
   * @return Whether the currentName field is set.
   */
  boolean hasCurrentName();
  /**
   * <pre>
   * The current name of this resource, used to prevent conflicts. Provide the latest name when making a request to change name.
   * </pre>
   *
   * <code>optional string current_name = 394983825;</code>
   * @return The currentName.
   */
  java.lang.String getCurrentName();
  /**
   * <pre>
   * The current name of this resource, used to prevent conflicts. Provide the latest name when making a request to change name.
   * </pre>
   *
   * <code>optional string current_name = 394983825;</code>
   * @return The bytes for currentName.
   */
  com.google.protobuf.ByteString
      getCurrentNameBytes();

  /**
   * <pre>
   * The name to be applied to the instance. Needs to be RFC 1035 compliant.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name to be applied to the instance. Needs to be RFC 1035 compliant.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name to be applied to the instance. Needs to be RFC 1035 compliant.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
