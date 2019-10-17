// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface ClusterStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ClusterStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The cluster's state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.ClusterStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The cluster's state.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.ClusterStatus.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.ClusterStatus.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Optional details of cluster's state.
   * </pre>
   *
   * <code>string detail = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getDetail();
  /**
   *
   *
   * <pre>
   * Output only. Optional details of cluster's state.
   * </pre>
   *
   * <code>string detail = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean hasStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.Timestamp getStateStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this state was entered.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp state_start_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Additional state information that includes
   * status reported by the agent.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.ClusterStatus.Substate substate = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getSubstateValue();
  /**
   *
   *
   * <pre>
   * Output only. Additional state information that includes
   * status reported by the agent.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1beta2.ClusterStatus.Substate substate = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1beta2.ClusterStatus.Substate getSubstate();
}
