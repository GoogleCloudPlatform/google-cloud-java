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
// source: google/cloud/telcoautomation/v1alpha1/telcoautomation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.telcoautomation.v1alpha1;

public interface CreateDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.CreateDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of parent resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The name of parent resource.
   * Format should be -
   * "projects/{project_id}/locations/{location_name}/orchestrationClusters/{orchestration_cluster}".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the deployment.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deploymentId.
   */
  java.lang.String getDeploymentId();
  /**
   *
   *
   * <pre>
   * Optional. The name of the deployment.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for deploymentId.
   */
  com.google.protobuf.ByteString getDeploymentIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The `Deployment` to create.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * Required. The `Deployment` to create.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployment.
   */
  com.google.cloud.telcoautomation.v1alpha1.Deployment getDeployment();
  /**
   *
   *
   * <pre>
   * Required. The `Deployment` to create.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.Deployment deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.DeploymentOrBuilder getDeploymentOrBuilder();
}
