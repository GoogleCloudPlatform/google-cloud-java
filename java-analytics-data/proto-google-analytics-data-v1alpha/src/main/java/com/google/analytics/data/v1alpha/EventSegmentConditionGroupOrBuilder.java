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

public interface EventSegmentConditionGroupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.EventSegmentConditionGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
   *
   * Optional. If unspecified, a `conditionScoping` of
   * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
   *
   * @return The enum numeric value on the wire for conditionScoping.
   */
  int getConditionScopingValue();
  /**
   *
   *
   * <pre>
   * `conditionScoping` should always be `EVENT_CRITERIA_WITHIN_SAME_EVENT`.
   *
   * Optional. If unspecified, a `conditionScoping` of
   * `EVENT_CRITERIA_WITHIN_SAME_EVENT` is used.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.EventCriteriaScoping condition_scoping = 1;</code>
   *
   * @return The conditionScoping.
   */
  com.google.analytics.data.v1alpha.EventCriteriaScoping getConditionScoping();

  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
   * </code>
   *
   * @return Whether the segmentFilterExpression field is set.
   */
  boolean hasSegmentFilterExpression();
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
   * </code>
   *
   * @return The segmentFilterExpression.
   */
  com.google.analytics.data.v1alpha.SegmentFilterExpression getSegmentFilterExpression();
  /**
   *
   *
   * <pre>
   * Data is included or excluded from the segment based on if it matches
   * this expression. Expressions express criteria on dimension, metrics,
   * and/or parameters.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.SegmentFilterExpression segment_filter_expression = 2;
   * </code>
   */
  com.google.analytics.data.v1alpha.SegmentFilterExpressionOrBuilder
      getSegmentFilterExpressionOrBuilder();
}
