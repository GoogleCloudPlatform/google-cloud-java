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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface RemoveRuleRegionSecurityPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RemoveRuleRegionSecurityPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The priority of the rule to remove from the security policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   *
   * @return Whether the priority field is set.
   */
  boolean hasPriority();
  /**
   *
   *
   * <pre>
   * The priority of the rule to remove from the security policy.
   * </pre>
   *
   * <code>optional int32 priority = 445151652;</code>
   *
   * @return The priority.
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * Project ID for this request.
   * </pre>
   *
   * <code>
   * string project = 227560217 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "project"];
   * </code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * Name of the region scoping this request.
   * </pre>
   *
   * <code>
   * string region = 138946292 [(.google.api.field_behavior) = REQUIRED, (.google.cloud.operation_request_field) = "region"];
   * </code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * Name of the security policy to update.
   * </pre>
   *
   * <code>string security_policy = 171082513 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The securityPolicy.
   */
  java.lang.String getSecurityPolicy();
  /**
   *
   *
   * <pre>
   * Name of the security policy to update.
   * </pre>
   *
   * <code>string security_policy = 171082513 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for securityPolicy.
   */
  com.google.protobuf.ByteString getSecurityPolicyBytes();
}
