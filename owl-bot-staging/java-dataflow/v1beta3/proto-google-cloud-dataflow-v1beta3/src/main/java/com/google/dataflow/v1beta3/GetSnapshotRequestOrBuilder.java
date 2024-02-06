// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/snapshots.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface GetSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.GetSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the Cloud Platform project that the snapshot belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * The ID of the Cloud Platform project that the snapshot belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * The ID of the snapshot.
   * </pre>
   *
   * <code>string snapshot_id = 2;</code>
   * @return The snapshotId.
   */
  java.lang.String getSnapshotId();
  /**
   * <pre>
   * The ID of the snapshot.
   * </pre>
   *
   * <code>string snapshot_id = 2;</code>
   * @return The bytes for snapshotId.
   */
  com.google.protobuf.ByteString
      getSnapshotIdBytes();

  /**
   * <pre>
   * The location that contains this snapshot.
   * </pre>
   *
   * <code>string location = 3;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * The location that contains this snapshot.
   * </pre>
   *
   * <code>string location = 3;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();
}
