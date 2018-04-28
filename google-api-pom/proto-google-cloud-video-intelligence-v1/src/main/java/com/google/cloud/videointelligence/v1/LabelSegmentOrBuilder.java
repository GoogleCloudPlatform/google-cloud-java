// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface LabelSegmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.LabelSegment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Video segment where a label was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  boolean hasSegment();
  /**
   * <pre>
   * Video segment where a label was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegment getSegment();
  /**
   * <pre>
   * Video segment where a label was detected.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1.VideoSegment segment = 1;</code>
   */
  com.google.cloud.videointelligence.v1.VideoSegmentOrBuilder getSegmentOrBuilder();

  /**
   * <pre>
   * Confidence that the label is accurate. Range: [0, 1].
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  float getConfidence();
}
