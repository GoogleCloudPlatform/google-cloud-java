// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface KeyRangeDataDiskAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.KeyRangeDataDiskAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The start (inclusive) of the key range.
   * </pre>
   *
   * <code>string start = 1;</code>
   * @return The start.
   */
  java.lang.String getStart();
  /**
   * <pre>
   * The start (inclusive) of the key range.
   * </pre>
   *
   * <code>string start = 1;</code>
   * @return The bytes for start.
   */
  com.google.protobuf.ByteString
      getStartBytes();

  /**
   * <pre>
   * The end (exclusive) of the key range.
   * </pre>
   *
   * <code>string end = 2;</code>
   * @return The end.
   */
  java.lang.String getEnd();
  /**
   * <pre>
   * The end (exclusive) of the key range.
   * </pre>
   *
   * <code>string end = 2;</code>
   * @return The bytes for end.
   */
  com.google.protobuf.ByteString
      getEndBytes();

  /**
   * <pre>
   * The name of the data disk where data for this range is stored.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 3;</code>
   * @return The dataDisk.
   */
  java.lang.String getDataDisk();
  /**
   * <pre>
   * The name of the data disk where data for this range is stored.
   * This name is local to the Google Cloud Platform project and uniquely
   * identifies the disk within that project, for example
   * "myproject-1014-104817-4c2-harness-0-disk-1".
   * </pre>
   *
   * <code>string data_disk = 3;</code>
   * @return The bytes for dataDisk.
   */
  com.google.protobuf.ByteString
      getDataDiskBytes();
}
