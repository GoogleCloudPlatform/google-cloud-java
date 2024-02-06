// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface VideoClassificationAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.VideoClassificationAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The time segment of the video to which the annotation applies.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 1;</code>
   * @return Whether the timeSegment field is set.
   */
  boolean hasTimeSegment();
  /**
   * <pre>
   * The time segment of the video to which the annotation applies.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 1;</code>
   * @return The timeSegment.
   */
  com.google.cloud.datalabeling.v1beta1.TimeSegment getTimeSegment();
  /**
   * <pre>
   * The time segment of the video to which the annotation applies.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.TimeSegment time_segment = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.TimeSegmentOrBuilder getTimeSegmentOrBuilder();

  /**
   * <pre>
   * Label of the segment specified by time_segment.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 2;</code>
   * @return Whether the annotationSpec field is set.
   */
  boolean hasAnnotationSpec();
  /**
   * <pre>
   * Label of the segment specified by time_segment.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 2;</code>
   * @return The annotationSpec.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   * <pre>
   * Label of the segment specified by time_segment.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();
}
