// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/tensorboard_data.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface TensorboardBlobSequenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.TensorboardBlobSequence)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardBlob values = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.TensorboardBlob> 
      getValuesList();
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardBlob values = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardBlob getValues(int index);
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardBlob values = 1;</code>
   */
  int getValuesCount();
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardBlob values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.TensorboardBlobOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <pre>
   * List of blobs contained within the sequence.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.TensorboardBlob values = 1;</code>
   */
  com.google.cloud.aiplatform.v1.TensorboardBlobOrBuilder getValuesOrBuilder(
      int index);
}
