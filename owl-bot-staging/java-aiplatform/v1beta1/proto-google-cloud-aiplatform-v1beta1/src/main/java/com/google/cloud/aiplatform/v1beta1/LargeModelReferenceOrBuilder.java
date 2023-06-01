// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model.proto

package com.google.cloud.aiplatform.v1beta1;

public interface LargeModelReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.LargeModelReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The unique name of the large Foundation or pre-built model. Like
   * "chat-panda", "text-panda". Or model name with version ID, like
   * "chat-panda-001", "text-panda-005", etc.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The unique name of the large Foundation or pre-built model. Like
   * "chat-panda", "text-panda". Or model name with version ID, like
   * "chat-panda-001", "text-panda-005", etc.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
