// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/evaluated_annotation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface EvaluatedAnnotationExplanationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.EvaluatedAnnotationExplanation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Explanation type.
   *
   * For AutoML Image Classification models, possible values are:
   *
   *   * `image-integrated-gradients`
   *   * `image-xrai`
   * </pre>
   *
   * <code>string explanation_type = 1;</code>
   * @return The explanationType.
   */
  java.lang.String getExplanationType();
  /**
   * <pre>
   * Explanation type.
   *
   * For AutoML Image Classification models, possible values are:
   *
   *   * `image-integrated-gradients`
   *   * `image-xrai`
   * </pre>
   *
   * <code>string explanation_type = 1;</code>
   * @return The bytes for explanationType.
   */
  com.google.protobuf.ByteString
      getExplanationTypeBytes();

  /**
   * <pre>
   * Explanation attribution response details.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
   * @return Whether the explanation field is set.
   */
  boolean hasExplanation();
  /**
   * <pre>
   * Explanation attribution response details.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
   * @return The explanation.
   */
  com.google.cloud.aiplatform.v1beta1.Explanation getExplanation();
  /**
   * <pre>
   * Explanation attribution response details.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Explanation explanation = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.ExplanationOrBuilder getExplanationOrBuilder();
}
