// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface HttpHeaderOptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HttpHeaderOption)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the header.
   * </pre>
   *
   * <code>optional string header_name = 110223613;</code>
   * @return Whether the headerName field is set.
   */
  boolean hasHeaderName();
  /**
   * <pre>
   * The name of the header.
   * </pre>
   *
   * <code>optional string header_name = 110223613;</code>
   * @return The headerName.
   */
  java.lang.String getHeaderName();
  /**
   * <pre>
   * The name of the header.
   * </pre>
   *
   * <code>optional string header_name = 110223613;</code>
   * @return The bytes for headerName.
   */
  com.google.protobuf.ByteString
      getHeaderNameBytes();

  /**
   * <pre>
   * The value of the header to add.
   * </pre>
   *
   * <code>optional string header_value = 203094335;</code>
   * @return Whether the headerValue field is set.
   */
  boolean hasHeaderValue();
  /**
   * <pre>
   * The value of the header to add.
   * </pre>
   *
   * <code>optional string header_value = 203094335;</code>
   * @return The headerValue.
   */
  java.lang.String getHeaderValue();
  /**
   * <pre>
   * The value of the header to add.
   * </pre>
   *
   * <code>optional string header_value = 203094335;</code>
   * @return The bytes for headerValue.
   */
  com.google.protobuf.ByteString
      getHeaderValueBytes();

  /**
   * <pre>
   * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false. 
   * </pre>
   *
   * <code>optional bool replace = 20755124;</code>
   * @return Whether the replace field is set.
   */
  boolean hasReplace();
  /**
   * <pre>
   * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false. 
   * </pre>
   *
   * <code>optional bool replace = 20755124;</code>
   * @return The replace.
   */
  boolean getReplace();
}
