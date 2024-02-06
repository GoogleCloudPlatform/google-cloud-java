// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1alpha2;

public interface WorkflowInvocationActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.WorkflowInvocationAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. This action's identifier. Unique within the workflow invocation.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target target = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * Output only. This action's identifier. Unique within the workflow invocation.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target target = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The target.
   */
  com.google.cloud.dataform.v1alpha2.Target getTarget();
  /**
   * <pre>
   * Output only. This action's identifier. Unique within the workflow invocation.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target target = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataform.v1alpha2.TargetOrBuilder getTargetOrBuilder();

  /**
   * <pre>
   * Output only. The action's identifier if the project had been compiled without any
   * overrides configured. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target canonical_target = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the canonicalTarget field is set.
   */
  boolean hasCanonicalTarget();
  /**
   * <pre>
   * Output only. The action's identifier if the project had been compiled without any
   * overrides configured. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target canonical_target = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The canonicalTarget.
   */
  com.google.cloud.dataform.v1alpha2.Target getCanonicalTarget();
  /**
   * <pre>
   * Output only. The action's identifier if the project had been compiled without any
   * overrides configured. Unique within the compilation result.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.Target canonical_target = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataform.v1alpha2.TargetOrBuilder getCanonicalTargetOrBuilder();

  /**
   * <pre>
   * Output only. This action's current state.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. This action's current state.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.State state = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.State getState();

  /**
   * <pre>
   * Output only. If and only if action's state is FAILED a failure reason is set.
   * </pre>
   *
   * <code>string failure_reason = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The failureReason.
   */
  java.lang.String getFailureReason();
  /**
   * <pre>
   * Output only. If and only if action's state is FAILED a failure reason is set.
   * </pre>
   *
   * <code>string failure_reason = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for failureReason.
   */
  com.google.protobuf.ByteString
      getFailureReasonBytes();

  /**
   * <pre>
   * Output only. This action's timing details.
   * `start_time` will be set if the action is in [RUNNING, SUCCEEDED,
   * CANCELLED, FAILED] state.
   * `end_time` will be set if the action is in [SUCCEEDED, CANCELLED, FAILED]
   * state.
   * </pre>
   *
   * <code>.google.type.Interval invocation_timing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the invocationTiming field is set.
   */
  boolean hasInvocationTiming();
  /**
   * <pre>
   * Output only. This action's timing details.
   * `start_time` will be set if the action is in [RUNNING, SUCCEEDED,
   * CANCELLED, FAILED] state.
   * `end_time` will be set if the action is in [SUCCEEDED, CANCELLED, FAILED]
   * state.
   * </pre>
   *
   * <code>.google.type.Interval invocation_timing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The invocationTiming.
   */
  com.google.type.Interval getInvocationTiming();
  /**
   * <pre>
   * Output only. This action's timing details.
   * `start_time` will be set if the action is in [RUNNING, SUCCEEDED,
   * CANCELLED, FAILED] state.
   * `end_time` will be set if the action is in [SUCCEEDED, CANCELLED, FAILED]
   * state.
   * </pre>
   *
   * <code>.google.type.Interval invocation_timing = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.type.IntervalOrBuilder getInvocationTimingOrBuilder();

  /**
   * <pre>
   * Output only. The workflow action's bigquery action details.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.BigQueryAction bigquery_action = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the bigqueryAction field is set.
   */
  boolean hasBigqueryAction();
  /**
   * <pre>
   * Output only. The workflow action's bigquery action details.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.BigQueryAction bigquery_action = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bigqueryAction.
   */
  com.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.BigQueryAction getBigqueryAction();
  /**
   * <pre>
   * Output only. The workflow action's bigquery action details.
   * </pre>
   *
   * <code>.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.BigQueryAction bigquery_action = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataform.v1alpha2.WorkflowInvocationAction.BigQueryActionOrBuilder getBigqueryActionOrBuilder();
}
