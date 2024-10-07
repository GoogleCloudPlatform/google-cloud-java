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

public interface GetMembershipRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.GetMembershipRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the membership to retrieve.
   *
   * To get the app's own membership [by using user
   * authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user),
   * you can optionally use `spaces/{space}/members/app`.
   *
   * Format: `spaces/{space}/members/{member}` or `spaces/{space}/members/app`
   *
   * When [authenticated as a
   * user](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user),
   * you can use the user's email as an alias for `{member}`. For example,
   * `spaces/{space}/members/example&#64;gmail.com` where `example&#64;gmail.com` is the
   * email of the Google Chat user.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the membership to retrieve.
   *
   * To get the app's own membership [by using user
   * authentication](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user),
   * you can optionally use `spaces/{space}/members/app`.
   *
   * Format: `spaces/{space}/members/{member}` or `spaces/{space}/members/app`
   *
   * When [authenticated as a
   * user](https://developers.google.com/workspace/chat/authenticate-authorize-chat-user),
   * you can use the user's email as an alias for `{member}`. For example,
   * `spaces/{space}/members/example&#64;gmail.com` where `example&#64;gmail.com` is the
   * email of the Google Chat user.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

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
   * Requires the `chat.admin.memberships` or `chat.admin.memberships.readonly`
   * [OAuth 2.0
   * scopes](https://developers.google.com/workspace/chat/authenticate-authorize#chat-api-scopes).
   *
   * Getting app memberships in a space isn't supported when using admin access.
   * </pre>
   *
   * <code>bool use_admin_access = 3;</code>
   *
   * @return The useAdminAccess.
   */
  boolean getUseAdminAccess();
}
