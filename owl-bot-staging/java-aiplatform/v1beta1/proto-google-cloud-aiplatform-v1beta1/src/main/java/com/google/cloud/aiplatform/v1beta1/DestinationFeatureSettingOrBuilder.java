// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/featurestore_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface DestinationFeatureSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.DestinationFeatureSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the Feature to apply the setting to.
   * </pre>
   *
   * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The featureId.
   */
  java.lang.String getFeatureId();
  /**
   * <pre>
   * Required. The ID of the Feature to apply the setting to.
   * </pre>
   *
   * <code>string feature_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for featureId.
   */
  com.google.protobuf.ByteString
      getFeatureIdBytes();

  /**
   * <pre>
   * Specify the field name in the export destination. If not specified,
   * Feature ID is used.
   * </pre>
   *
   * <code>string destination_field = 2;</code>
   * @return The destinationField.
   */
  java.lang.String getDestinationField();
  /**
   * <pre>
   * Specify the field name in the export destination. If not specified,
   * Feature ID is used.
   * </pre>
   *
   * <code>string destination_field = 2;</code>
   * @return The bytes for destinationField.
   */
  com.google.protobuf.ByteString
      getDestinationFieldBytes();
}
