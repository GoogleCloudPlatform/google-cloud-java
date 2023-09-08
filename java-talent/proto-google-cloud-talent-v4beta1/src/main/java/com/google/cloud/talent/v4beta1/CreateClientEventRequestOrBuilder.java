/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/talent/v4beta1/event_service.proto

package com.google.cloud.talent.v4beta1;

public interface CreateClientEventRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CreateClientEventRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the tenant under which the event is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created, for example, "projects/foo".
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
   * Required. Resource name of the tenant under which the event is created.
   *
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
   * is created, for example, "projects/foo".
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
   * Required. Events issued when end user interacts with customer's application
   * that uses Cloud Talent Solution.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the clientEvent field is set.
   */
  boolean hasClientEvent();
  /**
   *
   *
   * <pre>
   * Required. Events issued when end user interacts with customer's application
   * that uses Cloud Talent Solution.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The clientEvent.
   */
  com.google.cloud.talent.v4beta1.ClientEvent getClientEvent();
  /**
   *
   *
   * <pre>
   * Required. Events issued when end user interacts with customer's application
   * that uses Cloud Talent Solution.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.ClientEvent client_event = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.talent.v4beta1.ClientEventOrBuilder getClientEventOrBuilder();
}
