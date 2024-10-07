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
// source: google/chat/v1/membership.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public interface ListMembershipsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.ListMembershipsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the space for which to fetch a membership
   * list.
   *
   * Format: spaces/{space}
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
   * Required. The resource name of the space for which to fetch a membership
   * list.
   *
   * Format: spaces/{space}
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
   * Optional. The maximum number of memberships to return. The service might
   * return fewer than this value.
   *
   * If unspecified, at most 100 memberships are returned.
   *
   * The maximum value is 1000. If you use a value more than 1000, it's
   * automatically changed to 1000.
   *
   * Negative values return an `INVALID_ARGUMENT` error.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous call to list memberships.
   * Provide this parameter to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided should match the call that
   * provided the page token. Passing different values to the other parameters
   * might lead to unexpected results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token, received from a previous call to list memberships.
   * Provide this parameter to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided should match the call that
   * provided the page token. Passing different values to the other parameters
   * might lead to unexpected results.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A query filter.
   *
   * You can filter memberships by a member's role
   * ([`role`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.members#membershiprole))
   * and type
   * ([`member.type`](https://developers.google.com/workspace/chat/api/reference/rest/v1/User#type)).
   *
   * To filter by role, set `role` to `ROLE_MEMBER` or `ROLE_MANAGER`.
   *
   * To filter by type, set `member.type` to `HUMAN` or `BOT`. You can also
   * filter for `member.type` using the `!=` operator.
   *
   * To filter by both role and type, use the `AND` operator. To filter by
   * either role or type, use the `OR` operator.
   *
   * Either `member.type = "HUMAN"` or `member.type != "BOT"` is required
   * when `use_admin_access` is set to true. Other member type filters will be
   * rejected.
   *
   * For example, the following queries are valid:
   *
   * ```
   * role = "ROLE_MANAGER" OR role = "ROLE_MEMBER"
   * member.type = "HUMAN" AND role = "ROLE_MANAGER"
   *
   * member.type != "BOT"
   * ```
   *
   * The following queries are invalid:
   *
   * ```
   * member.type = "HUMAN" AND member.type = "BOT"
   * role = "ROLE_MANAGER" AND role = "ROLE_MEMBER"
   * ```
   *
   * Invalid queries are rejected by the server with an `INVALID_ARGUMENT`
   * error.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A query filter.
   *
   * You can filter memberships by a member's role
   * ([`role`](https://developers.google.com/workspace/chat/api/reference/rest/v1/spaces.members#membershiprole))
   * and type
   * ([`member.type`](https://developers.google.com/workspace/chat/api/reference/rest/v1/User#type)).
   *
   * To filter by role, set `role` to `ROLE_MEMBER` or `ROLE_MANAGER`.
   *
   * To filter by type, set `member.type` to `HUMAN` or `BOT`. You can also
   * filter for `member.type` using the `!=` operator.
   *
   * To filter by both role and type, use the `AND` operator. To filter by
   * either role or type, use the `OR` operator.
   *
   * Either `member.type = "HUMAN"` or `member.type != "BOT"` is required
   * when `use_admin_access` is set to true. Other member type filters will be
   * rejected.
   *
   * For example, the following queries are valid:
   *
   * ```
   * role = "ROLE_MANAGER" OR role = "ROLE_MEMBER"
   * member.type = "HUMAN" AND role = "ROLE_MANAGER"
   *
   * member.type != "BOT"
   * ```
   *
   * The following queries are invalid:
   *
   * ```
   * member.type = "HUMAN" AND member.type = "BOT"
   * role = "ROLE_MANAGER" AND role = "ROLE_MEMBER"
   * ```
   *
   * Invalid queries are rejected by the server with an `INVALID_ARGUMENT`
   * error.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. When `true`, also returns memberships associated with a
   * [Google Group][google.chat.v1.Membership.group_member], in
   * addition to other types of memberships. If a
   * [filter][google.chat.v1.ListMembershipsRequest.filter] is set,
   * [Google Group][google.chat.v1.Membership.group_member]
   * memberships that don't match the filter criteria aren't returned.
   * </pre>
   *
   * <code>bool show_groups = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The showGroups.
   */
  boolean getShowGroups();

  /**
   *
   *
   * <pre>
   * Optional. When `true`, also returns memberships associated with
   * [invited][google.chat.v1.Membership.MembershipState.INVITED] members, in
   * addition to other types of memberships. If a
   * filter is set,
   * [invited][google.chat.v1.Membership.MembershipState.INVITED] memberships
   * that don't match the filter criteria aren't returned.
   *
   * Currently requires [user
   * authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user).
   * </pre>
   *
   * <code>bool show_invited = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The showInvited.
   */
  boolean getShowInvited();

  /**
   *
   *
   * <pre>
   * When `true`, the method runs using the user's Google Workspace
   * administrator privileges.
   *
   * The calling user must be a Google Workspace administrator with the
   * [manage chat and spaces conversations
   * privilege](https://support.google.com/a/answer/13369245).
   *
   * Requires either the `chat.admin.memberships.readonly` or
   * `chat.admin.memberships` [OAuth 2.0
   * scope](https://developers.google.com/workspace/chat/authenticate-authorize#chat-api-scopes).
   *
   * Listing app memberships in a space isn't supported when using admin access.
   * </pre>
   *
   * <code>bool use_admin_access = 8;</code>
   *
   * @return The useAdminAccess.
   */
  boolean getUseAdminAccess();
}
