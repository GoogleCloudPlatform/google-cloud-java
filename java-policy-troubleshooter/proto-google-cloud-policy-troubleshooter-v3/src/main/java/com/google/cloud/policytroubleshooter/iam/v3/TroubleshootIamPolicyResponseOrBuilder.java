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

public interface TroubleshootIamPolicyResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Indicates whether the principal has the specified permission for the
   * specified resource, based on evaluating all types of the applicable IAM
   * policies.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse.OverallAccessState overall_access_state = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for overallAccessState.
   */
  int getOverallAccessStateValue();
  /**
   *
   *
   * <pre>
   * Indicates whether the principal has the specified permission for the
   * specified resource, based on evaluating all types of the applicable IAM
   * policies.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse.OverallAccessState overall_access_state = 1;
   * </code>
   *
   * @return The overallAccessState.
   */
  com.google.cloud.policytroubleshooter.iam.v3.TroubleshootIamPolicyResponse.OverallAccessState
      getOverallAccessState();

  /**
   *
   *
   * <pre>
   * The access tuple from the request, including any provided context used to
   * evaluate the condition.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.AccessTuple access_tuple = 2;</code>
   *
   * @return Whether the accessTuple field is set.
   */
  boolean hasAccessTuple();
  /**
   *
   *
   * <pre>
   * The access tuple from the request, including any provided context used to
   * evaluate the condition.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.AccessTuple access_tuple = 2;</code>
   *
   * @return The accessTuple.
   */
  com.google.cloud.policytroubleshooter.iam.v3.AccessTuple getAccessTuple();
  /**
   *
   *
   * <pre>
   * The access tuple from the request, including any provided context used to
   * evaluate the condition.
   * </pre>
   *
   * <code>.google.cloud.policytroubleshooter.iam.v3.AccessTuple access_tuple = 2;</code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.AccessTupleOrBuilder getAccessTupleOrBuilder();

  /**
   *
   *
   * <pre>
   * An explanation of how the applicable IAM allow policies affect the final
   * access state.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowPolicyExplanation allow_policy_explanation = 3;
   * </code>
   *
   * @return Whether the allowPolicyExplanation field is set.
   */
  boolean hasAllowPolicyExplanation();
  /**
   *
   *
   * <pre>
   * An explanation of how the applicable IAM allow policies affect the final
   * access state.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowPolicyExplanation allow_policy_explanation = 3;
   * </code>
   *
   * @return The allowPolicyExplanation.
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowPolicyExplanation getAllowPolicyExplanation();
  /**
   *
   *
   * <pre>
   * An explanation of how the applicable IAM allow policies affect the final
   * access state.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.AllowPolicyExplanation allow_policy_explanation = 3;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.AllowPolicyExplanationOrBuilder
      getAllowPolicyExplanationOrBuilder();

  /**
   *
   *
   * <pre>
   * An explanation of how the applicable IAM deny policies affect the final
   * access state.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyPolicyExplanation deny_policy_explanation = 4;
   * </code>
   *
   * @return Whether the denyPolicyExplanation field is set.
   */
  boolean hasDenyPolicyExplanation();
  /**
   *
   *
   * <pre>
   * An explanation of how the applicable IAM deny policies affect the final
   * access state.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyPolicyExplanation deny_policy_explanation = 4;
   * </code>
   *
   * @return The denyPolicyExplanation.
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyPolicyExplanation getDenyPolicyExplanation();
  /**
   *
   *
   * <pre>
   * An explanation of how the applicable IAM deny policies affect the final
   * access state.
   * </pre>
   *
   * <code>
   * .google.cloud.policytroubleshooter.iam.v3.DenyPolicyExplanation deny_policy_explanation = 4;
   * </code>
   */
  com.google.cloud.policytroubleshooter.iam.v3.DenyPolicyExplanationOrBuilder
      getDenyPolicyExplanationOrBuilder();
}
