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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.channel.v1;

public interface ListEntitlementChangesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.ListEntitlementChangesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of entitlement changes.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.EntitlementChange entitlement_changes = 1;</code>
   */
  java.util.List<com.google.cloud.channel.v1.EntitlementChange> getEntitlementChangesList();
  /**
   *
   *
   * <pre>
   * The list of entitlement changes.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.EntitlementChange entitlement_changes = 1;</code>
   */
  com.google.cloud.channel.v1.EntitlementChange getEntitlementChanges(int index);
  /**
   *
   *
   * <pre>
   * The list of entitlement changes.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.EntitlementChange entitlement_changes = 1;</code>
   */
  int getEntitlementChangesCount();
  /**
   *
   *
   * <pre>
   * The list of entitlement changes.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.EntitlementChange entitlement_changes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.channel.v1.EntitlementChangeOrBuilder>
      getEntitlementChangesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of entitlement changes.
   * </pre>
   *
   * <code>repeated .google.cloud.channel.v1.EntitlementChange entitlement_changes = 1;</code>
   */
  com.google.cloud.channel.v1.EntitlementChangeOrBuilder getEntitlementChangesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to list the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to list the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
