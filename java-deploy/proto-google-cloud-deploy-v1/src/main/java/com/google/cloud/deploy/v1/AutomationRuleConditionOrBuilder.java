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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface AutomationRuleConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.AutomationRuleCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Details around targets enumerated in the rule.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the targetsPresentCondition field is set.
   */
  boolean hasTargetsPresentCondition();
  /**
   *
   *
   * <pre>
   * Optional. Details around targets enumerated in the rule.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The targetsPresentCondition.
   */
  com.google.cloud.deploy.v1.TargetsPresentCondition getTargetsPresentCondition();
  /**
   *
   *
   * <pre>
   * Optional. Details around targets enumerated in the rule.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder getTargetsPresentConditionOrBuilder();
}
