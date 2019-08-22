// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface AsyncBatchAnnotateFilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.AsyncBatchAnnotateFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.AsyncAnnotateFileRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1.AsyncAnnotateFileRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Individual async file annotation requests for this batch.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AsyncAnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1.AsyncAnnotateFileRequestOrBuilder getRequestsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Target project and location to make a call.
   * Format: `projects/{project-id}/locations/{location-id}`.
   * If no parent is specified, a region will be chosen automatically.
   * Supported location-ids:
   *     `us`: USA country only,
   *     `asia`: East asia areas, like Japan, Taiwan,
   *     `eu`: The European Union.
   * Example: `projects/project-A/locations/eu`.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Optional. Target project and location to make a call.
   * Format: `projects/{project-id}/locations/{location-id}`.
   * If no parent is specified, a region will be chosen automatically.
   * Supported location-ids:
   *     `us`: USA country only,
   *     `asia`: East asia areas, like Japan, Taiwan,
   *     `eu`: The European Union.
   * Example: `projects/project-A/locations/eu`.
   * </pre>
   *
   * <code>string parent = 4;</code>
   */
  com.google.protobuf.ByteString getParentBytes();
}
