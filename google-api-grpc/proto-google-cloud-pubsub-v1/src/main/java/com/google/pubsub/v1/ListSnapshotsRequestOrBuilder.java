// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ListSnapshotsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ListSnapshotsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project in which to list snapshots.
   * Format is `projects/{project-id}`.
   * </pre>
   *
   * <code>string project = 1;</code>
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The name of the project in which to list snapshots.
   * Format is `projects/{project-id}`.
   * </pre>
   *
   * <code>string project = 1;</code>
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Maximum number of snapshots to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The value returned by the last `ListSnapshotsResponse`; indicates that this
   * is a continuation of a prior `ListSnapshots` call, and that the system
   * should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The value returned by the last `ListSnapshotsResponse`; indicates that this
   * is a continuation of a prior `ListSnapshots` call, and that the system
   * should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
