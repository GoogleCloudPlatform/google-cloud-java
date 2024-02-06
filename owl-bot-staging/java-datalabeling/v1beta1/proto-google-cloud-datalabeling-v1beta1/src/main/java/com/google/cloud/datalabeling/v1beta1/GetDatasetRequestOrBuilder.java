// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

public interface GetDatasetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.GetDatasetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Dataset resource name, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Dataset resource name, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
