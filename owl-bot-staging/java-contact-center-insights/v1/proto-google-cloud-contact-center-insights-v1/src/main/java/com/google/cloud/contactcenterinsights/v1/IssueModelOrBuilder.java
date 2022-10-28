// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

public interface IssueModelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.IssueModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the issue model.
   * Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name of the issue model.
   * Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The representative name for the issue model.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The representative name for the issue model.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. The time at which this issue model was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which this issue model was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which this issue model was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The most recent time at which the issue model was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time at which the issue model was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time at which the issue model was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. State of the model.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModel.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. State of the model.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModel.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.contactcenterinsights.v1.IssueModel.State getState();

  /**
   * <pre>
   * Configs for the input data that used to create the issue model.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModel.InputDataConfig input_data_config = 6;</code>
   * @return Whether the inputDataConfig field is set.
   */
  boolean hasInputDataConfig();
  /**
   * <pre>
   * Configs for the input data that used to create the issue model.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModel.InputDataConfig input_data_config = 6;</code>
   * @return The inputDataConfig.
   */
  com.google.cloud.contactcenterinsights.v1.IssueModel.InputDataConfig getInputDataConfig();
  /**
   * <pre>
   * Configs for the input data that used to create the issue model.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModel.InputDataConfig input_data_config = 6;</code>
   */
  com.google.cloud.contactcenterinsights.v1.IssueModel.InputDataConfigOrBuilder getInputDataConfigOrBuilder();

  /**
   * <pre>
   * Output only. Immutable. The issue model's label statistics on its training data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats training_stats = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the trainingStats field is set.
   */
  boolean hasTrainingStats();
  /**
   * <pre>
   * Output only. Immutable. The issue model's label statistics on its training data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats training_stats = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The trainingStats.
   */
  com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats getTrainingStats();
  /**
   * <pre>
   * Output only. Immutable. The issue model's label statistics on its training data.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats training_stats = 7 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.cloud.contactcenterinsights.v1.IssueModelLabelStatsOrBuilder getTrainingStatsOrBuilder();
}
