// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vision/v1/image_annotator.proto

package com.google.cloud.vision.v1;

public interface BatchAnnotateFilesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.BatchAnnotateFilesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileRequest requests = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.AnnotateFileRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1.AnnotateFileRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileRequest requests = 1;</code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileRequest requests = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.AnnotateFileRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of file annotation requests. Right now we support only one
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileRequest requests = 1;</code>
   */
  com.google.cloud.vision.v1.AnnotateFileRequestOrBuilder getRequestsOrBuilder(int index);

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
   * <code>string parent = 3;</code>
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
   * <code>string parent = 3;</code>
   */
  com.google.protobuf.ByteString getParentBytes();
}
