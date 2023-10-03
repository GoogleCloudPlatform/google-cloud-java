/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public interface CreateDeploymentResourcePoolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.CreateDeploymentResourcePoolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent location resource where this DeploymentResourcePool
   * will be created. Format: `projects/{project}/locations/{location}`
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
   * Required. The parent location resource where this DeploymentResourcePool
   * will be created. Format: `projects/{project}/locations/{location}`
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
   * Required. The DeploymentResourcePool to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deploymentResourcePool field is set.
   */
  boolean hasDeploymentResourcePool();
  /**
   *
   *
   * <pre>
   * Required. The DeploymentResourcePool to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deploymentResourcePool.
   */
  com.google.cloud.aiplatform.v1beta1.DeploymentResourcePool getDeploymentResourcePool();
  /**
   *
   *
   * <pre>
   * Required. The DeploymentResourcePool to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeploymentResourcePool deployment_resource_pool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolOrBuilder
      getDeploymentResourcePoolOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the DeploymentResourcePool, which
   * will become the final component of the DeploymentResourcePool's resource
   * name.
   *
   * The maximum length is 63 characters, and valid characters
   * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
   * </pre>
   *
   * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deploymentResourcePoolId.
   */
  java.lang.String getDeploymentResourcePoolId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the DeploymentResourcePool, which
   * will become the final component of the DeploymentResourcePool's resource
   * name.
   *
   * The maximum length is 63 characters, and valid characters
   * are `/^[a-z]([a-z0-9-]{0,61}[a-z0-9])?$/`.
   * </pre>
   *
   * <code>string deployment_resource_pool_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deploymentResourcePoolId.
   */
  com.google.protobuf.ByteString getDeploymentResourcePoolIdBytes();
}
