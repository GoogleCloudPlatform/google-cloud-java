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
// source: google/cloud/privilegedaccessmanager/v1/privilegedaccessmanager.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.privilegedaccessmanager.v1;

public interface GrantOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.privilegedaccessmanager.v1.Grant)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Name of this grant.
   * Possible formats:
   *
   * * `organizations/{organization-number}/locations/{region}/entitlements/{entitlement-id}/grants/{grant-id}`
   * * `folders/{folder-number}/locations/{region}/entitlements/{entitlement-id}/grants/{grant-id}`
   * * `projects/{project-id|project-number}/locations/{region}/entitlements/{entitlement-id}/grants/{grant-id}`
   *
   * The last segment of this name (`{grant-id}`) is autogenerated.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Name of this grant.
   * Possible formats:
   *
   * * `organizations/{organization-number}/locations/{region}/entitlements/{entitlement-id}/grants/{grant-id}`
   * * `folders/{folder-number}/locations/{region}/entitlements/{entitlement-id}/grants/{grant-id}`
   * * `projects/{project-id|project-number}/locations/{region}/entitlements/{entitlement-id}/grants/{grant-id}`
   *
   * The last segment of this name (`{grant-id}`) is autogenerated.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Create time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time stamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Username of the user who created this grant.
   * </pre>
   *
   * <code>string requester = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The requester.
   */
  java.lang.String getRequester();
  /**
   *
   *
   * <pre>
   * Output only. Username of the user who created this grant.
   * </pre>
   *
   * <code>string requester = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for requester.
   */
  com.google.protobuf.ByteString getRequesterBytes();

  /**
   *
   *
   * <pre>
   * Required. The amount of time access is needed for. This value should be
   * less than the `max_request_duration` value of the entitlement.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration requested_duration = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the requestedDuration field is set.
   */
  boolean hasRequestedDuration();
  /**
   *
   *
   * <pre>
   * Required. The amount of time access is needed for. This value should be
   * less than the `max_request_duration` value of the entitlement.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration requested_duration = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The requestedDuration.
   */
  com.google.protobuf.Duration getRequestedDuration();
  /**
   *
   *
   * <pre>
   * Required. The amount of time access is needed for. This value should be
   * less than the `max_request_duration` value of the entitlement.
   * </pre>
   *
   * <code>
   * .google.protobuf.Duration requested_duration = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.DurationOrBuilder getRequestedDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Justification of why this access is needed.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Justification justification = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the justification field is set.
   */
  boolean hasJustification();
  /**
   *
   *
   * <pre>
   * Optional. Justification of why this access is needed.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Justification justification = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The justification.
   */
  com.google.cloud.privilegedaccessmanager.v1.Justification getJustification();
  /**
   *
   *
   * <pre>
   * Optional. Justification of why this access is needed.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Justification justification = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.privilegedaccessmanager.v1.JustificationOrBuilder getJustificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Current state of this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. Current state of this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.privilegedaccessmanager.v1.Grant.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Timeline of this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.Timeline timeline = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the timeline field is set.
   */
  boolean hasTimeline();
  /**
   *
   *
   * <pre>
   * Output only. Timeline of this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.Timeline timeline = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The timeline.
   */
  com.google.cloud.privilegedaccessmanager.v1.Grant.Timeline getTimeline();
  /**
   *
   *
   * <pre>
   * Output only. Timeline of this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.Timeline timeline = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.privilegedaccessmanager.v1.Grant.TimelineOrBuilder getTimelineOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The access that would be granted by this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.PrivilegedAccess privileged_access = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the privilegedAccess field is set.
   */
  boolean hasPrivilegedAccess();
  /**
   *
   *
   * <pre>
   * Output only. The access that would be granted by this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.PrivilegedAccess privileged_access = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The privilegedAccess.
   */
  com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccess getPrivilegedAccess();
  /**
   *
   *
   * <pre>
   * Output only. The access that would be granted by this grant.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.PrivilegedAccess privileged_access = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.privilegedaccessmanager.v1.PrivilegedAccessOrBuilder
      getPrivilegedAccessOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Audit trail of access provided by this grant. If unspecified
   * then access was never granted.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.AuditTrail audit_trail = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the auditTrail field is set.
   */
  boolean hasAuditTrail();
  /**
   *
   *
   * <pre>
   * Output only. Audit trail of access provided by this grant. If unspecified
   * then access was never granted.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.AuditTrail audit_trail = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The auditTrail.
   */
  com.google.cloud.privilegedaccessmanager.v1.Grant.AuditTrail getAuditTrail();
  /**
   *
   *
   * <pre>
   * Output only. Audit trail of access provided by this grant. If unspecified
   * then access was never granted.
   * </pre>
   *
   * <code>
   * .google.cloud.privilegedaccessmanager.v1.Grant.AuditTrail audit_trail = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.privilegedaccessmanager.v1.Grant.AuditTrailOrBuilder getAuditTrailOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Additional email addresses to notify for all the actions
   * performed on the grant.
   * </pre>
   *
   * <code>
   * repeated string additional_email_recipients = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the additionalEmailRecipients.
   */
  java.util.List<java.lang.String> getAdditionalEmailRecipientsList();
  /**
   *
   *
   * <pre>
   * Optional. Additional email addresses to notify for all the actions
   * performed on the grant.
   * </pre>
   *
   * <code>
   * repeated string additional_email_recipients = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of additionalEmailRecipients.
   */
  int getAdditionalEmailRecipientsCount();
  /**
   *
   *
   * <pre>
   * Optional. Additional email addresses to notify for all the actions
   * performed on the grant.
   * </pre>
   *
   * <code>
   * repeated string additional_email_recipients = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The additionalEmailRecipients at the given index.
   */
  java.lang.String getAdditionalEmailRecipients(int index);
  /**
   *
   *
   * <pre>
   * Optional. Additional email addresses to notify for all the actions
   * performed on the grant.
   * </pre>
   *
   * <code>
   * repeated string additional_email_recipients = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the additionalEmailRecipients at the given index.
   */
  com.google.protobuf.ByteString getAdditionalEmailRecipientsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Flag set by the PAM system to indicate that policy bindings
   * made by this grant have been modified from outside PAM.
   *
   * After it is set, this flag remains set forever irrespective of the grant
   * state. A `true` value here indicates that PAM no longer has any certainty
   * on the access a user has because of this grant.
   * </pre>
   *
   * <code>bool externally_modified = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The externallyModified.
   */
  boolean getExternallyModified();
}
