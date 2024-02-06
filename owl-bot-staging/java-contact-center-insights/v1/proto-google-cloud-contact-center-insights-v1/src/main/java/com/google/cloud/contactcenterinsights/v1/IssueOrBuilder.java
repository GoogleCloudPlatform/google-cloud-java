// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface IssueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.Issue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the issue.
   * Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}/issues/{issue}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name of the issue.
   * Format:
   * projects/{project}/locations/{location}/issueModels/{issue_model}/issues/{issue}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The representative name for the issue.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The representative name for the issue.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. The time at which this issue was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time at which this issue was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time at which this issue was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The most recent time that this issue was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time that this issue was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The most recent time that this issue was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Output only. Resource names of the sample representative utterances that
   * match to this issue.
   * </pre>
   *
   * <code>repeated string sample_utterances = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the sampleUtterances.
   */
  java.util.List<java.lang.String>
      getSampleUtterancesList();
  /**
   * <pre>
   * Output only. Resource names of the sample representative utterances that
   * match to this issue.
   * </pre>
   *
   * <code>repeated string sample_utterances = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of sampleUtterances.
   */
  int getSampleUtterancesCount();
  /**
   * <pre>
   * Output only. Resource names of the sample representative utterances that
   * match to this issue.
   * </pre>
   *
   * <code>repeated string sample_utterances = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The sampleUtterances at the given index.
   */
  java.lang.String getSampleUtterances(int index);
  /**
   * <pre>
   * Output only. Resource names of the sample representative utterances that
   * match to this issue.
   * </pre>
   *
   * <code>repeated string sample_utterances = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the sampleUtterances at the given index.
   */
  com.google.protobuf.ByteString
      getSampleUtterancesBytes(int index);
}
