// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1/video_intelligence.proto

package com.google.cloud.videointelligence.v1;

public interface ShotChangeDetectionConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1.ShotChangeDetectionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Model to use for shot change detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   */
  java.lang.String getModel();
  /**
   * <pre>
   * Model to use for shot change detection.
   * Supported values: "builtin/stable" (the default if unset) and
   * "builtin/latest".
   * </pre>
   *
   * <code>string model = 1;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();
}
