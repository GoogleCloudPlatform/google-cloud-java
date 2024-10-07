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
// source: google/cloud/networkconnectivity/v1/hub.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkconnectivity.v1;

public interface SpokeSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.SpokeSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes of each type that are
   * associated with a specific hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount spoke_type_counts = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount>
      getSpokeTypeCountsList();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes of each type that are
   * associated with a specific hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount spoke_type_counts = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount getSpokeTypeCounts(int index);
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes of each type that are
   * associated with a specific hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount spoke_type_counts = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSpokeTypeCountsCount();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes of each type that are
   * associated with a specific hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount spoke_type_counts = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCountOrBuilder>
      getSpokeTypeCountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes of each type that are
   * associated with a specific hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCount spoke_type_counts = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeTypeCountOrBuilder
      getSpokeTypeCountsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are in each state
   * and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount spoke_state_counts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount>
      getSpokeStateCountsList();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are in each state
   * and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount spoke_state_counts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount getSpokeStateCounts(
      int index);
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are in each state
   * and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount spoke_state_counts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSpokeStateCountsCount();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are in each state
   * and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount spoke_state_counts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCountOrBuilder>
      getSpokeStateCountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are in each state
   * and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCount spoke_state_counts = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateCountOrBuilder
      getSpokeStateCountsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are inactive for each
   * possible reason and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount spoke_state_reason_counts = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount>
      getSpokeStateReasonCountsList();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are inactive for each
   * possible reason and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount spoke_state_reason_counts = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount
      getSpokeStateReasonCounts(int index);
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are inactive for each
   * possible reason and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount spoke_state_reason_counts = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSpokeStateReasonCountsCount();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are inactive for each
   * possible reason and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount spoke_state_reason_counts = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCountOrBuilder>
      getSpokeStateReasonCountsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Counts the number of spokes that are inactive for each
   * possible reason and associated with a given hub.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCount spoke_state_reason_counts = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.networkconnectivity.v1.SpokeSummary.SpokeStateReasonCountOrBuilder
      getSpokeStateReasonCountsOrBuilder(int index);
}
