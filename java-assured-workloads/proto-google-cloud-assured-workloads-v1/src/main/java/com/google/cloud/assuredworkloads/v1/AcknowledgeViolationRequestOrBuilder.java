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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.assuredworkloads.v1;

public interface AcknowledgeViolationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Violation to acknowledge.
   * Format:
   * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the Violation to acknowledge.
   * Format:
   * organizations/{organization}/locations/{location}/workloads/{workload}/violations/{violation}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Business justification explaining the need for violation acknowledgement
   * </pre>
   *
   * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   *
   *
   * <pre>
   * Required. Business justification explaining the need for violation acknowledgement
   * </pre>
   *
   * <code>string comment = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString getCommentBytes();

  /**
   *
   *
   * <pre>
   * Optional. This field is deprecated and will be removed in future version of the API.
   * Name of the OrgPolicy which was modified with non-compliant change and
   * resulted in this violation.
   * Format:
   * projects/{project_number}/policies/{constraint_name}
   * folders/{folder_id}/policies/{constraint_name}
   * organizations/{organization_id}/policies/{constraint_name}
   * </pre>
   *
   * <code>
   * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated
   *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
   *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
   * @return The nonCompliantOrgPolicy.
   */
  @java.lang.Deprecated
  java.lang.String getNonCompliantOrgPolicy();
  /**
   *
   *
   * <pre>
   * Optional. This field is deprecated and will be removed in future version of the API.
   * Name of the OrgPolicy which was modified with non-compliant change and
   * resulted in this violation.
   * Format:
   * projects/{project_number}/policies/{constraint_name}
   * folders/{folder_id}/policies/{constraint_name}
   * organizations/{organization_id}/policies/{constraint_name}
   * </pre>
   *
   * <code>
   * string non_compliant_org_policy = 3 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated
   *     google.cloud.assuredworkloads.v1.AcknowledgeViolationRequest.non_compliant_org_policy is
   *     deprecated. See google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=584
   * @return The bytes for nonCompliantOrgPolicy.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getNonCompliantOrgPolicyBytes();
}
