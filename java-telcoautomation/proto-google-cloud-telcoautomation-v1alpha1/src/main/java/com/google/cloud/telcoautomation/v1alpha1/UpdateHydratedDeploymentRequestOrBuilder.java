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

public interface UpdateHydratedDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1alpha1.UpdateHydratedDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The hydrated deployment to update.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the hydratedDeployment field is set.
   */
  boolean hasHydratedDeployment();
  /**
   *
   *
   * <pre>
   * Required. The hydrated deployment to update.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The hydratedDeployment.
   */
  com.google.cloud.telcoautomation.v1alpha1.HydratedDeployment getHydratedDeployment();
  /**
   *
   *
   * <pre>
   * Required. The hydrated deployment to update.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1alpha1.HydratedDeployment hydrated_deployment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.telcoautomation.v1alpha1.HydratedDeploymentOrBuilder
      getHydratedDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Update mask supports a special
   * value `*` which fully replaces (equivalent to PUT) the resource provided.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Update mask supports a special
   * value `*` which fully replaces (equivalent to PUT) the resource provided.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to update. Update mask supports a special
   * value `*` which fully replaces (equivalent to PUT) the resource provided.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
