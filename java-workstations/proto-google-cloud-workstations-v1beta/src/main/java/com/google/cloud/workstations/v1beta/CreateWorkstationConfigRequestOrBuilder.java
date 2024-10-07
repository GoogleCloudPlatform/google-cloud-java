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
// source: google/cloud/workstations/v1beta/workstations.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.workstations.v1beta;

public interface CreateWorkstationConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.workstations.v1beta.CreateWorkstationConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Parent resource name.
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
   * Required. Parent resource name.
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
   * Required. ID to use for the workstation configuration.
   * </pre>
   *
   * <code>string workstation_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The workstationConfigId.
   */
  java.lang.String getWorkstationConfigId();
  /**
   *
   *
   * <pre>
   * Required. ID to use for the workstation configuration.
   * </pre>
   *
   * <code>string workstation_config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for workstationConfigId.
   */
  com.google.protobuf.ByteString getWorkstationConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Required. Config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig workstation_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workstationConfig field is set.
   */
  boolean hasWorkstationConfig();
  /**
   *
   *
   * <pre>
   * Required. Config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig workstation_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workstationConfig.
   */
  com.google.cloud.workstations.v1beta.WorkstationConfig getWorkstationConfig();
  /**
   *
   *
   * <pre>
   * Required. Config to create.
   * </pre>
   *
   * <code>
   * .google.cloud.workstations.v1beta.WorkstationConfig workstation_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.workstations.v1beta.WorkstationConfigOrBuilder getWorkstationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If set, validate the request and preview the review, but do not
   * actually apply it.
   * </pre>
   *
   * <code>bool validate_only = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
