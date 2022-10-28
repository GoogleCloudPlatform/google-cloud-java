// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

package com.google.dataflow.v1beta3;

public interface StreamingSideInputLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.StreamingSideInputLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifies the particular side input within the streaming Dataflow job.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Identifies the particular side input within the streaming Dataflow job.
   * </pre>
   *
   * <code>string tag = 1;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <pre>
   * Identifies the state family where this side input is stored.
   * </pre>
   *
   * <code>string state_family = 2;</code>
   * @return The stateFamily.
   */
  java.lang.String getStateFamily();
  /**
   * <pre>
   * Identifies the state family where this side input is stored.
   * </pre>
   *
   * <code>string state_family = 2;</code>
   * @return The bytes for stateFamily.
   */
  com.google.protobuf.ByteString
      getStateFamilyBytes();
}
