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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface CloudRunConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CloudRunConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether Cloud Deploy should update the traffic stanza in a Cloud Run
   * Service on the user's behalf to facilitate traffic splitting. This is
   * required to be true for CanaryDeployments, but optional for
   * CustomCanaryDeployments.
   * </pre>
   *
   * <code>bool automatic_traffic_control = 1;</code>
   *
   * @return The automaticTrafficControl.
   */
  boolean getAutomaticTrafficControl();

  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the canary revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string canary_revision_tags = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the canaryRevisionTags.
   */
  java.util.List<java.lang.String> getCanaryRevisionTagsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the canary revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string canary_revision_tags = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of canaryRevisionTags.
   */
  int getCanaryRevisionTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the canary revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string canary_revision_tags = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The canaryRevisionTags at the given index.
   */
  java.lang.String getCanaryRevisionTags(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the canary revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string canary_revision_tags = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the canaryRevisionTags at the given index.
   */
  com.google.protobuf.ByteString getCanaryRevisionTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the prior revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string prior_revision_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the priorRevisionTags.
   */
  java.util.List<java.lang.String> getPriorRevisionTagsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the prior revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string prior_revision_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of priorRevisionTags.
   */
  int getPriorRevisionTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the prior revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string prior_revision_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The priorRevisionTags at the given index.
   */
  java.lang.String getPriorRevisionTags(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the prior revision while the
   * canary phase is in progress.
   * </pre>
   *
   * <code>repeated string prior_revision_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the priorRevisionTags at the given index.
   */
  com.google.protobuf.ByteString getPriorRevisionTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the final stable revision when
   * the stable phase is applied.
   * </pre>
   *
   * <code>repeated string stable_revision_tags = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return A list containing the stableRevisionTags.
   */
  java.util.List<java.lang.String> getStableRevisionTagsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the final stable revision when
   * the stable phase is applied.
   * </pre>
   *
   * <code>repeated string stable_revision_tags = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The count of stableRevisionTags.
   */
  int getStableRevisionTagsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the final stable revision when
   * the stable phase is applied.
   * </pre>
   *
   * <code>repeated string stable_revision_tags = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The stableRevisionTags at the given index.
   */
  java.lang.String getStableRevisionTags(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of tags that are added to the final stable revision when
   * the stable phase is applied.
   * </pre>
   *
   * <code>repeated string stable_revision_tags = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the stableRevisionTags at the given index.
   */
  com.google.protobuf.ByteString getStableRevisionTagsBytes(int index);
}
