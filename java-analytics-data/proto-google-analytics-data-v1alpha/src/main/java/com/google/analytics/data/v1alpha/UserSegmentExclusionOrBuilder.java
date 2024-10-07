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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1alpha;

public interface UserSegmentExclusionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.UserSegmentExclusion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies how long an exclusion will last if a user matches the
   * `userExclusionCriteria`.
   *
   * Optional. If unspecified, `userExclusionDuration` of
   * `USER_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;</code>
   *
   * @return The enum numeric value on the wire for userExclusionDuration.
   */
  int getUserExclusionDurationValue();
  /**
   *
   *
   * <pre>
   * Specifies how long an exclusion will last if a user matches the
   * `userExclusionCriteria`.
   *
   * Optional. If unspecified, `userExclusionDuration` of
   * `USER_EXCLUSION_TEMPORARY` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserExclusionDuration user_exclusion_duration = 1;</code>
   *
   * @return The userExclusionDuration.
   */
  com.google.analytics.data.v1alpha.UserExclusionDuration getUserExclusionDuration();

  /**
   *
   *
   * <pre>
   * If a user meets this condition, the user is excluded from membership in
   * the segment for the `userExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
   *
   * @return Whether the userExclusionCriteria field is set.
   */
  boolean hasUserExclusionCriteria();
  /**
   *
   *
   * <pre>
   * If a user meets this condition, the user is excluded from membership in
   * the segment for the `userExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
   *
   * @return The userExclusionCriteria.
   */
  com.google.analytics.data.v1alpha.UserSegmentCriteria getUserExclusionCriteria();
  /**
   *
   *
   * <pre>
   * If a user meets this condition, the user is excluded from membership in
   * the segment for the `userExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_exclusion_criteria = 2;</code>
   */
  com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder
      getUserExclusionCriteriaOrBuilder();
}
