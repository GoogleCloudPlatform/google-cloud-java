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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface GlobalOrganizationSetPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GlobalOrganizationSetPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Binding bindings = 403251854;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Binding> getBindingsList();
  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Binding bindings = 403251854;</code>
   */
  com.google.cloud.compute.v1.Binding getBindings(int index);
  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Binding bindings = 403251854;</code>
   */
  int getBindingsCount();
  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Binding bindings = 403251854;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.BindingOrBuilder> getBindingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify bindings.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Binding bindings = 403251854;</code>
   */
  com.google.cloud.compute.v1.BindingOrBuilder getBindingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify the etag.
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return Whether the etag field is set.
   */
  boolean hasEtag();
  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify the etag.
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Flatten Policy to create a backward compatible wire-format. Deprecated. Use 'policy' to specify the etag.
   * </pre>
   *
   * <code>optional string etag = 3123477;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is limited to a few 10s of KB. An empty policy is in general a valid policy but certain services (like Projects) might reject them.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Policy policy = 91071794;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is limited to a few 10s of KB. An empty policy is in general a valid policy but certain services (like Projects) might reject them.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Policy policy = 91071794;</code>
   *
   * @return The policy.
   */
  com.google.cloud.compute.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * REQUIRED: The complete policy to be applied to the 'resource'. The size of the policy is limited to a few 10s of KB. An empty policy is in general a valid policy but certain services (like Projects) might reject them.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Policy policy = 91071794;</code>
   */
  com.google.cloud.compute.v1.PolicyOrBuilder getPolicyOrBuilder();
}
