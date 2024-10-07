/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.config.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Metadata about the deployment operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.DeploymentOperationMetadata deployment_metadata = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deploymentMetadata field is set.
   */
  boolean hasDeploymentMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the deployment operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.DeploymentOperationMetadata deployment_metadata = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deploymentMetadata.
   */
  com.google.cloud.config.v1.DeploymentOperationMetadata getDeploymentMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the deployment operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.DeploymentOperationMetadata deployment_metadata = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.DeploymentOperationMetadataOrBuilder getDeploymentMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Metadata about the preview operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.PreviewOperationMetadata preview_metadata = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the previewMetadata field is set.
   */
  boolean hasPreviewMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the preview operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.PreviewOperationMetadata preview_metadata = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The previewMetadata.
   */
  com.google.cloud.config.v1.PreviewOperationMetadata getPreviewMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about the preview operation state.
   * </pre>
   *
   * <code>
   * .google.cloud.config.v1.PreviewOperationMetadata preview_metadata = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.config.v1.PreviewOperationMetadataOrBuilder getPreviewMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Output only. Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   *
   *
   * <pre>
   * Output only. Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString getVerbBytes();

  /**
   *
   *
   * <pre>
   * Output only. Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * Output only. Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_message = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. Identifies whether the user has requested cancellation of the
   * operation. Operations that have successfully been cancelled have
   * [Operation.error][] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
   * `Code.CANCELLED`.
   * </pre>
   *
   * <code>bool requested_cancellation = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The requestedCancellation.
   */
  boolean getRequestedCancellation();

  /**
   *
   *
   * <pre>
   * Output only. API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The apiVersion.
   */
  java.lang.String getApiVersion();
  /**
   *
   *
   * <pre>
   * Output only. API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString getApiVersionBytes();

  com.google.cloud.config.v1.OperationMetadata.ResourceMetadataCase getResourceMetadataCase();
}
