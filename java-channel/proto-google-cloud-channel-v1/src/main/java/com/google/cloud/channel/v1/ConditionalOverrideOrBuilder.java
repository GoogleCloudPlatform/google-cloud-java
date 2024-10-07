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
// source: google/cloud/channel/v1/repricing.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

public interface ConditionalOverrideOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ConditionalOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Information about the applied override's adjustment.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingAdjustment adjustment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the adjustment field is set.
   */
  boolean hasAdjustment();
  /**
   *
   *
   * <pre>
   * Required. Information about the applied override's adjustment.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingAdjustment adjustment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The adjustment.
   */
  com.google.cloud.channel.v1.RepricingAdjustment getAdjustment();
  /**
   *
   *
   * <pre>
   * Required. Information about the applied override's adjustment.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingAdjustment adjustment = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.RepricingAdjustmentOrBuilder getAdjustmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The [RebillingBasis][google.cloud.channel.v1.RebillingBasis] to
   * use for the applied override. Shows the relative cost based on your
   * repricing costs.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RebillingBasis rebilling_basis = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for rebillingBasis.
   */
  int getRebillingBasisValue();
  /**
   *
   *
   * <pre>
   * Required. The [RebillingBasis][google.cloud.channel.v1.RebillingBasis] to
   * use for the applied override. Shows the relative cost based on your
   * repricing costs.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RebillingBasis rebilling_basis = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rebillingBasis.
   */
  com.google.cloud.channel.v1.RebillingBasis getRebillingBasis();

  /**
   *
   *
   * <pre>
   * Required. Specifies the condition which, if met, will apply the override.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingCondition repricing_condition = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the repricingCondition field is set.
   */
  boolean hasRepricingCondition();
  /**
   *
   *
   * <pre>
   * Required. Specifies the condition which, if met, will apply the override.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingCondition repricing_condition = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The repricingCondition.
   */
  com.google.cloud.channel.v1.RepricingCondition getRepricingCondition();
  /**
   *
   *
   * <pre>
   * Required. Specifies the condition which, if met, will apply the override.
   * </pre>
   *
   * <code>
   * .google.cloud.channel.v1.RepricingCondition repricing_condition = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.channel.v1.RepricingConditionOrBuilder getRepricingConditionOrBuilder();
}
