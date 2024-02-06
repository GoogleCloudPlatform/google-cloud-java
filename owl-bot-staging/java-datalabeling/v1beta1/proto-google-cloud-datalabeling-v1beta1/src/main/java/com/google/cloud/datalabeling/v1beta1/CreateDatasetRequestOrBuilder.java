// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface CreateDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CreateDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Dataset resource parent, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Dataset resource parent, format:
   * projects/{project_id}
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The dataset to be created.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the dataset field is set.
   */
  boolean hasDataset();
  /**
   * <pre>
   * Required. The dataset to be created.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The dataset.
   */
  com.google.cloud.datalabeling.v1beta1.Dataset getDataset();
  /**
   * <pre>
   * Required. The dataset to be created.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.Dataset dataset = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datalabeling.v1beta1.DatasetOrBuilder getDatasetOrBuilder();
}
