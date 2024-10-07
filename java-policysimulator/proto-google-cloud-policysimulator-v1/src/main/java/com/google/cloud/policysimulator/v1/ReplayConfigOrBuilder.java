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
// source: google/cloud/policysimulator/v1/simulator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.policysimulator.v1;

public interface ReplayConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policysimulator.v1.ReplayConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A mapping of the resources that you want to simulate policies for and the
   * policies that you want to simulate.
   *
   * Keys are the full resource names for the resources. For example,
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   *
   * Values are [Policy][google.iam.v1.Policy] objects representing the policies
   * that you want to simulate.
   *
   * Replays automatically take into account any IAM policies inherited through
   * the resource hierarchy, and any policies set on descendant resources. You
   * do not need to include these policies in the policy overlay.
   * </pre>
   *
   * <code>map&lt;string, .google.iam.v1.Policy&gt; policy_overlay = 1;</code>
   */
  int getPolicyOverlayCount();
  /**
   *
   *
   * <pre>
   * A mapping of the resources that you want to simulate policies for and the
   * policies that you want to simulate.
   *
   * Keys are the full resource names for the resources. For example,
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   *
   * Values are [Policy][google.iam.v1.Policy] objects representing the policies
   * that you want to simulate.
   *
   * Replays automatically take into account any IAM policies inherited through
   * the resource hierarchy, and any policies set on descendant resources. You
   * do not need to include these policies in the policy overlay.
   * </pre>
   *
   * <code>map&lt;string, .google.iam.v1.Policy&gt; policy_overlay = 1;</code>
   */
  boolean containsPolicyOverlay(java.lang.String key);
  /** Use {@link #getPolicyOverlayMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.iam.v1.Policy> getPolicyOverlay();
  /**
   *
   *
   * <pre>
   * A mapping of the resources that you want to simulate policies for and the
   * policies that you want to simulate.
   *
   * Keys are the full resource names for the resources. For example,
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   *
   * Values are [Policy][google.iam.v1.Policy] objects representing the policies
   * that you want to simulate.
   *
   * Replays automatically take into account any IAM policies inherited through
   * the resource hierarchy, and any policies set on descendant resources. You
   * do not need to include these policies in the policy overlay.
   * </pre>
   *
   * <code>map&lt;string, .google.iam.v1.Policy&gt; policy_overlay = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.iam.v1.Policy> getPolicyOverlayMap();
  /**
   *
   *
   * <pre>
   * A mapping of the resources that you want to simulate policies for and the
   * policies that you want to simulate.
   *
   * Keys are the full resource names for the resources. For example,
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   *
   * Values are [Policy][google.iam.v1.Policy] objects representing the policies
   * that you want to simulate.
   *
   * Replays automatically take into account any IAM policies inherited through
   * the resource hierarchy, and any policies set on descendant resources. You
   * do not need to include these policies in the policy overlay.
   * </pre>
   *
   * <code>map&lt;string, .google.iam.v1.Policy&gt; policy_overlay = 1;</code>
   */
  /* nullable */
  com.google.iam.v1.Policy getPolicyOverlayOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.iam.v1.Policy defaultValue);
  /**
   *
   *
   * <pre>
   * A mapping of the resources that you want to simulate policies for and the
   * policies that you want to simulate.
   *
   * Keys are the full resource names for the resources. For example,
   * `//cloudresourcemanager.googleapis.com/projects/my-project`.
   * For examples of full resource names for Google Cloud services, see
   * https://cloud.google.com/iam/help/troubleshooter/full-resource-names.
   *
   * Values are [Policy][google.iam.v1.Policy] objects representing the policies
   * that you want to simulate.
   *
   * Replays automatically take into account any IAM policies inherited through
   * the resource hierarchy, and any policies set on descendant resources. You
   * do not need to include these policies in the policy overlay.
   * </pre>
   *
   * <code>map&lt;string, .google.iam.v1.Policy&gt; policy_overlay = 1;</code>
   */
  com.google.iam.v1.Policy getPolicyOverlayOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The logs to use as input for the
   * [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>.google.cloud.policysimulator.v1.ReplayConfig.LogSource log_source = 2;</code>
   *
   * @return The enum numeric value on the wire for logSource.
   */
  int getLogSourceValue();
  /**
   *
   *
   * <pre>
   * The logs to use as input for the
   * [Replay][google.cloud.policysimulator.v1.Replay].
   * </pre>
   *
   * <code>.google.cloud.policysimulator.v1.ReplayConfig.LogSource log_source = 2;</code>
   *
   * @return The logSource.
   */
  com.google.cloud.policysimulator.v1.ReplayConfig.LogSource getLogSource();
}
