// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ManagedInstanceVersionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ManagedInstanceVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING }.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   * @return Whether the instanceTemplate field is set.
   */
  boolean hasInstanceTemplate();
  /**
   * <pre>
   * [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING }.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   * @return The instanceTemplate.
   */
  java.lang.String getInstanceTemplate();
  /**
   * <pre>
   * [Output Only] The intended template of the instance. This field is empty when current_action is one of { DELETING, ABANDONING }.
   * </pre>
   *
   * <code>optional string instance_template = 309248228;</code>
   * @return The bytes for instanceTemplate.
   */
  com.google.protobuf.ByteString
      getInstanceTemplateBytes();

  /**
   * <pre>
   * [Output Only] Name of the version.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * [Output Only] Name of the version.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * [Output Only] Name of the version.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
