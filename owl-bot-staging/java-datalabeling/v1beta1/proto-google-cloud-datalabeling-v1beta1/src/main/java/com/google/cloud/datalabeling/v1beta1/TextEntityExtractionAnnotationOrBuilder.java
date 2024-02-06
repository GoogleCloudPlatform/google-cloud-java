// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface TextEntityExtractionAnnotationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   * @return Whether the annotationSpec field is set.
   */
  boolean hasAnnotationSpec();
  /**
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   * @return The annotationSpec.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   * <pre>
   * Label of the text entities.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();

  /**
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   * @return Whether the sequentialSegment field is set.
   */
  boolean hasSequentialSegment();
  /**
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   * @return The sequentialSegment.
   */
  com.google.cloud.datalabeling.v1beta1.SequentialSegment getSequentialSegment();
  /**
   * <pre>
   * Position of the entity.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.SequentialSegment sequential_segment = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.SequentialSegmentOrBuilder getSequentialSegmentOrBuilder();
}
