// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface GetGlobalAddressRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GetGlobalAddressRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the address resource to return.
   * </pre>
   *
   * <code>string address = 462920692 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * Name of the address resource to return.
   * </pre>
   *
   * <code>string address = 462920692 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The project.
   */
  java.lang.String getProject();
  /**
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>string project = 227560217 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString
      getProjectBytes();
}
