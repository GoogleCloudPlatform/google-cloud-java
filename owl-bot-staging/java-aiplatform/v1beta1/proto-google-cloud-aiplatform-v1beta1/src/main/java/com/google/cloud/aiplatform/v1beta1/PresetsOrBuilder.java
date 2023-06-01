// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/explanation.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PresetsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.Presets)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Preset option controlling parameters for speed-precision trade-off when
   * querying for examples. If omitted, defaults to `PRECISE`.
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Presets.Query query = 1;</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <pre>
   * Preset option controlling parameters for speed-precision trade-off when
   * querying for examples. If omitted, defaults to `PRECISE`.
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Presets.Query query = 1;</code>
   * @return The enum numeric value on the wire for query.
   */
  int getQueryValue();
  /**
   * <pre>
   * Preset option controlling parameters for speed-precision trade-off when
   * querying for examples. If omitted, defaults to `PRECISE`.
   * </pre>
   *
   * <code>optional .google.cloud.aiplatform.v1beta1.Presets.Query query = 1;</code>
   * @return The query.
   */
  com.google.cloud.aiplatform.v1beta1.Presets.Query getQuery();

  /**
   * <pre>
   * The modality of the uploaded model, which automatically configures the
   * distance measurement and feature normalization for the underlying example
   * index and queries. If your model does not precisely fit one of these types,
   * it is okay to choose the closest type.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets.Modality modality = 2;</code>
   * @return The enum numeric value on the wire for modality.
   */
  int getModalityValue();
  /**
   * <pre>
   * The modality of the uploaded model, which automatically configures the
   * distance measurement and feature normalization for the underlying example
   * index and queries. If your model does not precisely fit one of these types,
   * it is okay to choose the closest type.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.Presets.Modality modality = 2;</code>
   * @return The modality.
   */
  com.google.cloud.aiplatform.v1beta1.Presets.Modality getModality();
}
