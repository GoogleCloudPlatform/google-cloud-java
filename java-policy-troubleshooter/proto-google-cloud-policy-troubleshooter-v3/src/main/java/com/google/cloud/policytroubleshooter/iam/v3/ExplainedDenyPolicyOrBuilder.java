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
// source: google/cloud/policytroubleshooter/iam/v3/troubleshooter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.policytroubleshooter.iam.v3;

public interface ExplainedDenyPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.ExplainedDenyPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this policy_ denies the specified permission
   * to the specified principal for the specified resource.
   *
   * This field does _not_ indicate whether the principal actually has the
   * permission for the resource. There might be another policy that overrides
   * this policy. To determine whether the principal actually has the
   * permission, use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyAccessState deny_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for denyAccessState.
   */
  int getDenyAccessStateValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates whether _this policy_ denies the specified permission
   * to the specified principal for the specified resource.
   *
   * This field does _not_ indicate whether the principal actually has the
   * permission for the resource. There might be another policy that overrides
   * this policy. To determine whether the principal actually has the
   * permission, use the `overall_access_state` field in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyAccessState deny_access_state = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The denyAccessState.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyAccessState getDenyAccessState();

  /**
   *
   *
   * <pre>
   * The IAM deny policy attached to the resource.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.iam.v2.Policy policy = 2;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * The IAM deny policy attached to the resource.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.iam.v2.Policy policy = 2;</code>
   *
   * @return The policy.
   */
  com.google.iam.v2.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * The IAM deny policy attached to the resource.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.iam.v2.Policy policy = 2;</code>
   */
  com.google.iam.v2.PolicyOrBuilder getPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * Details about how each rule in the policy affects the principal's inability
   * to use the permission for the resource. The order of the deny rule matches
   * the order of the rules in the deny policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation rule_explanations = 3;
   * </code>
   */
  java.util.List<com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation>
      getRuleExplanationsList();
  /**
   *
   *
   * <pre>
   * Details about how each rule in the policy affects the principal's inability
   * to use the permission for the resource. The order of the deny rule matches
   * the order of the rules in the deny policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation rule_explanations = 3;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation getRuleExplanations(int index);
  /**
   *
   *
   * <pre>
   * Details about how each rule in the policy affects the principal's inability
   * to use the permission for the resource. The order of the deny rule matches
   * the order of the rules in the deny policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation rule_explanations = 3;
   * </code>
   */
  int getRuleExplanationsCount();
  /**
   *
   *
   * <pre>
   * Details about how each rule in the policy affects the principal's inability
   * to use the permission for the resource. The order of the deny rule matches
   * the order of the rules in the deny policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation rule_explanations = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanationOrBuilder>
      getRuleExplanationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Details about how each rule in the policy affects the principal's inability
   * to use the permission for the resource. The order of the deny rule matches
   * the order of the rules in the deny policy.
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanation rule_explanations = 3;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyRuleExplanationOrBuilder
      getRuleExplanationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The relevance of this policy to the overall access state in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 4;</code>
   *
   * @return The enum numeric value on the wire for relevance.
   */
  int getRelevanceValue();
  /**
   *
   *
   * <pre>
   * The relevance of this policy to the overall access state in the
   * [TroubleshootIamPolicyResponse][google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse].
   *
   * If the sender of the request does not have access to the policy, this field
   * is omitted.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance relevance = 4;</code>
   *
   * @return The relevance.
   */
  com.google.cloud.policytroubleshooter.iam.v3.HeuristicRelevance getRelevance();
}
