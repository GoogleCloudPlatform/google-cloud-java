// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface SegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Segment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The index of a Part object within its parent Content object.
   * </pre>
   *
   * <code>int32 part_index = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The partIndex.
   */
  int getPartIndex();

  /**
   * <pre>
   * Output only. Start index in the given Part, measured in bytes. Offset from
   * the start of the Part, inclusive, starting at zero.
   * </pre>
   *
   * <code>int32 start_index = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The startIndex.
   */
  int getStartIndex();

  /**
   * <pre>
   * Output only. End index in the given Part, measured in bytes. Offset from
   * the start of the Part, exclusive, starting at zero.
   * </pre>
   *
   * <code>int32 end_index = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The endIndex.
   */
  int getEndIndex();
}
