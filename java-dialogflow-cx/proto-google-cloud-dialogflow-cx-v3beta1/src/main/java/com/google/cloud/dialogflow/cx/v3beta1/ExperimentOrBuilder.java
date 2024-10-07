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
// source: google/cloud/dialogflow/cx/v3beta1/experiment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface ExperimentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Experiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the experiment.
   * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/experiments/&lt;Experiment ID&gt;..
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the experiment.
   * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;/experiments/&lt;Experiment ID&gt;..
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the experiment (unique in an
   * environment). Limit of 64 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The human-readable name of the experiment (unique in an
   * environment). Limit of 64 characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The human-readable description of the experiment.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The human-readable description of the experiment.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The current state of the experiment.
   * Transition triggered by Experiments.StartExperiment: DRAFT-&gt;RUNNING.
   * Transition triggered by Experiments.CancelExperiment: DRAFT-&gt;DONE or
   * RUNNING-&gt;DONE.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.State state = 4;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current state of the experiment.
   * Transition triggered by Experiments.StartExperiment: DRAFT-&gt;RUNNING.
   * Transition triggered by Experiments.CancelExperiment: DRAFT-&gt;DONE or
   * RUNNING-&gt;DONE.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.State state = 4;</code>
   *
   * @return The state.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Experiment.State getState();

  /**
   *
   *
   * <pre>
   * The definition of the experiment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.Definition definition = 5;</code>
   *
   * @return Whether the definition field is set.
   */
  boolean hasDefinition();
  /**
   *
   *
   * <pre>
   * The definition of the experiment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.Definition definition = 5;</code>
   *
   * @return The definition.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Experiment.Definition getDefinition();
  /**
   *
   *
   * <pre>
   * The definition of the experiment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.Definition definition = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Experiment.DefinitionOrBuilder getDefinitionOrBuilder();

  /**
   *
   *
   * <pre>
   * The configuration for auto rollout. If set, there should be exactly two
   * variants in the experiment (control variant being the default version of
   * the flow), the traffic allocation for the non-control variant will
   * gradually increase to 100% when conditions are met, and eventually
   * replace the control variant to become the default version of the flow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RolloutConfig rollout_config = 14;</code>
   *
   * @return Whether the rolloutConfig field is set.
   */
  boolean hasRolloutConfig();
  /**
   *
   *
   * <pre>
   * The configuration for auto rollout. If set, there should be exactly two
   * variants in the experiment (control variant being the default version of
   * the flow), the traffic allocation for the non-control variant will
   * gradually increase to 100% when conditions are met, and eventually
   * replace the control variant to become the default version of the flow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RolloutConfig rollout_config = 14;</code>
   *
   * @return The rolloutConfig.
   */
  com.google.cloud.dialogflow.cx.v3beta1.RolloutConfig getRolloutConfig();
  /**
   *
   *
   * <pre>
   * The configuration for auto rollout. If set, there should be exactly two
   * variants in the experiment (control variant being the default version of
   * the flow), the traffic allocation for the non-control variant will
   * gradually increase to 100% when conditions are met, and eventually
   * replace the control variant to become the default version of the flow.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RolloutConfig rollout_config = 14;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.RolloutConfigOrBuilder getRolloutConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * State of the auto rollout process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RolloutState rollout_state = 15;</code>
   *
   * @return Whether the rolloutState field is set.
   */
  boolean hasRolloutState();
  /**
   *
   *
   * <pre>
   * State of the auto rollout process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RolloutState rollout_state = 15;</code>
   *
   * @return The rolloutState.
   */
  com.google.cloud.dialogflow.cx.v3beta1.RolloutState getRolloutState();
  /**
   *
   *
   * <pre>
   * State of the auto rollout process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.RolloutState rollout_state = 15;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.RolloutStateOrBuilder getRolloutStateOrBuilder();

  /**
   *
   *
   * <pre>
   * The reason why rollout has failed. Should only be set when state is
   * ROLLOUT_FAILED.
   * </pre>
   *
   * <code>string rollout_failure_reason = 16;</code>
   *
   * @return The rolloutFailureReason.
   */
  java.lang.String getRolloutFailureReason();
  /**
   *
   *
   * <pre>
   * The reason why rollout has failed. Should only be set when state is
   * ROLLOUT_FAILED.
   * </pre>
   *
   * <code>string rollout_failure_reason = 16;</code>
   *
   * @return The bytes for rolloutFailureReason.
   */
  com.google.protobuf.ByteString getRolloutFailureReasonBytes();

  /**
   *
   *
   * <pre>
   * Inference result of the experiment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.Result result = 6;</code>
   *
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   *
   *
   * <pre>
   * Inference result of the experiment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.Result result = 6;</code>
   *
   * @return The result.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Experiment.Result getResult();
  /**
   *
   *
   * <pre>
   * Inference result of the experiment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Experiment.Result result = 6;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Experiment.ResultOrBuilder getResultOrBuilder();

  /**
   *
   *
   * <pre>
   * Creation time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Creation time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Creation time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Start time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Start time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8;</code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Start time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * End time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 9;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * End time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 9;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * End time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Last update time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 10;</code>
   *
   * @return Whether the lastUpdateTime field is set.
   */
  boolean hasLastUpdateTime();
  /**
   *
   *
   * <pre>
   * Last update time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 10;</code>
   *
   * @return The lastUpdateTime.
   */
  com.google.protobuf.Timestamp getLastUpdateTime();
  /**
   *
   *
   * <pre>
   * Last update time of this experiment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_update_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Maximum number of days to run the experiment. If auto-rollout is
   * not enabled, default value and maximum will be 30 days. If auto-rollout is
   * enabled, default value and maximum will be 6 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration experiment_length = 11;</code>
   *
   * @return Whether the experimentLength field is set.
   */
  boolean hasExperimentLength();
  /**
   *
   *
   * <pre>
   * Maximum number of days to run the experiment. If auto-rollout is
   * not enabled, default value and maximum will be 30 days. If auto-rollout is
   * enabled, default value and maximum will be 6 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration experiment_length = 11;</code>
   *
   * @return The experimentLength.
   */
  com.google.protobuf.Duration getExperimentLength();
  /**
   *
   *
   * <pre>
   * Maximum number of days to run the experiment. If auto-rollout is
   * not enabled, default value and maximum will be 30 days. If auto-rollout is
   * enabled, default value and maximum will be 6 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration experiment_length = 11;</code>
   */
  com.google.protobuf.DurationOrBuilder getExperimentLengthOrBuilder();

  /**
   *
   *
   * <pre>
   * The history of updates to the experiment variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.VariantsHistory variants_history = 12;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory> getVariantsHistoryList();
  /**
   *
   *
   * <pre>
   * The history of updates to the experiment variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.VariantsHistory variants_history = 12;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory getVariantsHistory(int index);
  /**
   *
   *
   * <pre>
   * The history of updates to the experiment variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.VariantsHistory variants_history = 12;
   * </code>
   */
  int getVariantsHistoryCount();
  /**
   *
   *
   * <pre>
   * The history of updates to the experiment variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.VariantsHistory variants_history = 12;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.cx.v3beta1.VariantsHistoryOrBuilder>
      getVariantsHistoryOrBuilderList();
  /**
   *
   *
   * <pre>
   * The history of updates to the experiment variants.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.cx.v3beta1.VariantsHistory variants_history = 12;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.VariantsHistoryOrBuilder getVariantsHistoryOrBuilder(
      int index);
}
