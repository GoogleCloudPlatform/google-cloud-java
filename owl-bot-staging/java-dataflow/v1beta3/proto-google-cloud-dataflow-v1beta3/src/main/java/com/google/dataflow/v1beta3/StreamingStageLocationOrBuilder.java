// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface StreamingStageLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.StreamingStageLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifies the particular stream within the streaming Dataflow
   * job.
   * </pre>
   *
   * <code>string stream_id = 1;</code>
   * @return The streamId.
   */
  java.lang.String getStreamId();
  /**
   * <pre>
   * Identifies the particular stream within the streaming Dataflow
   * job.
   * </pre>
   *
   * <code>string stream_id = 1;</code>
   * @return The bytes for streamId.
   */
  com.google.protobuf.ByteString
      getStreamIdBytes();
}
