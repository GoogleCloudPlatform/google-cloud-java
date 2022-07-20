/*
 * Copyright 2020 Google LLC
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

package com.google.analytics.data.v1alpha;

public interface EventSegmentExclusionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.EventSegmentExclusion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
   * Optional. If unspecified, an `eventExclusionDuration` of
   * `EVENT_EXCLUSION_PERMANENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for eventExclusionDuration.
   */
  int getEventExclusionDurationValue();
  /**
   *
   *
   * <pre>
   * `eventExclusionDuration` should always be `PERMANENTLY_EXCLUDE`.
   * Optional. If unspecified, an `eventExclusionDuration` of
   * `EVENT_EXCLUSION_PERMANENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventExclusionDuration event_exclusion_duration = 1;
   * </code>
   *
   * @return The eventExclusionDuration.
   */
  com.google.analytics.data.v1alpha.EventExclusionDuration getEventExclusionDuration();

  /**
   *
   *
   * <pre>
   * If an event meets this condition, the event is excluded from membership
   * in the segment for the `eventExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;</code>
   *
   * @return Whether the eventExclusionCriteria field is set.
   */
  boolean hasEventExclusionCriteria();
  /**
   *
   *
   * <pre>
   * If an event meets this condition, the event is excluded from membership
   * in the segment for the `eventExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;</code>
   *
   * @return The eventExclusionCriteria.
   */
  com.google.analytics.data.v1alpha.EventSegmentCriteria getEventExclusionCriteria();
  /**
   *
   *
   * <pre>
   * If an event meets this condition, the event is excluded from membership
   * in the segment for the `eventExclusionDuration`.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventSegmentCriteria event_exclusion_criteria = 2;</code>
   */
  com.google.analytics.data.v1alpha.EventSegmentCriteriaOrBuilder
      getEventExclusionCriteriaOrBuilder();
}
