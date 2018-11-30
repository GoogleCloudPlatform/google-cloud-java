// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface LabelDetectionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.LabelDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.LabelDetectionMode label_detection_mode = 1;
   * </code>
   */
  int getLabelDetectionModeValue();
  /**
   *
   *
   * <pre>
   * What labels should be detected with LABEL_DETECTION, in addition to
   * video-level labels or segment-level labels.
   * If unspecified, defaults to `SHOT_MODE`.
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.LabelDetectionMode label_detection_mode = 1;
   * </code>
   */
  com.google.cloud.videointelligence.v1p1beta1.LabelDetectionMode getLabelDetectionMode();

  /**
   *
   *
   * <pre>
   * Whether the video has been shot from a stationary (i.e. non-moving) camera.
   * When set to true, might improve detection accuracy for moving objects.
   * Should be used with `SHOT_AND_FRAME_MODE` enabled.
   * </pre>
   *
   * <code>bool stationary_camera = 2;</code>
   */
  boolean getStationaryCamera();

  /**
   *
   *
   * <pre>
   * Model to use for label detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * Model to use for label detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 3;</code>
   */
  com.google.protobuf.ByteString getModelBytes();
}
