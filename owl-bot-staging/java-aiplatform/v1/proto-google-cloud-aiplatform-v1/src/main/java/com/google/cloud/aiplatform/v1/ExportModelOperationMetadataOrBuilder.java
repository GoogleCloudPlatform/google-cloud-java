// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public interface ExportModelOperationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ExportModelOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The common part of the operation metadata.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return Whether the genericMetadata field is set.
   */
  boolean hasGenericMetadata();
  /**
   * <pre>
   * The common part of the operation metadata.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   * @return The genericMetadata.
   */
  com.google.cloud.aiplatform.v1.GenericOperationMetadata getGenericMetadata();
  /**
   * <pre>
   * The common part of the operation metadata.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.GenericOperationMetadata generic_metadata = 1;</code>
   */
  com.google.cloud.aiplatform.v1.GenericOperationMetadataOrBuilder getGenericMetadataOrBuilder();

  /**
   * <pre>
   * Output only. Information further describing the output of this Model
   * export.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportModelOperationMetadata.OutputInfo output_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the outputInfo field is set.
   */
  boolean hasOutputInfo();
  /**
   * <pre>
   * Output only. Information further describing the output of this Model
   * export.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportModelOperationMetadata.OutputInfo output_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The outputInfo.
   */
  com.google.cloud.aiplatform.v1.ExportModelOperationMetadata.OutputInfo getOutputInfo();
  /**
   * <pre>
   * Output only. Information further describing the output of this Model
   * export.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.ExportModelOperationMetadata.OutputInfo output_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.aiplatform.v1.ExportModelOperationMetadata.OutputInfoOrBuilder getOutputInfoOrBuilder();
}
