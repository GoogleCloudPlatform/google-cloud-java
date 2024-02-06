// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/environment.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface PackageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.Package)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the package.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The resource to read the package from. The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}
   *   bucket.storage.googleapis.com/
   * </pre>
   *
   * <code>string location = 2;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * The resource to read the package from. The supported resource type is:
   *
   * Google Cloud Storage:
   *
   *   storage.googleapis.com/{bucket}
   *   bucket.storage.googleapis.com/
   * </pre>
   *
   * <code>string location = 2;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();
}
