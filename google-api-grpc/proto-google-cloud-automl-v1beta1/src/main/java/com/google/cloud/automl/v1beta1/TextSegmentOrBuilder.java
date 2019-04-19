// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/text_segment.proto

package com.google.cloud.automl.v1beta1;

public interface TextSegmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TextSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The content of the TextSegment.
   * </pre>
   *
   * <code>string content = 3;</code>
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * Output only. The content of the TextSegment.
   * </pre>
   *
   * <code>string content = 3;</code>
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * Required. Zero-based character index of the first character of the text
   * segment (counting characters from the beginning of the text).
   * </pre>
   *
   * <code>int64 start_offset = 1;</code>
   */
  long getStartOffset();

  /**
   *
   *
   * <pre>
   * Required. Zero-based character index of the first character past the end of
   * the text segment (counting character from the beginning of the text).
   * The character at the end_offset is NOT included in the text segment.
   * </pre>
   *
   * <code>int64 end_offset = 2;</code>
   */
  long getEndOffset();
}
