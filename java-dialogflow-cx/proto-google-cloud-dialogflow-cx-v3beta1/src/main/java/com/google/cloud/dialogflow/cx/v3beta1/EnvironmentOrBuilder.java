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
// source: google/cloud/dialogflow/cx/v3beta1/environment.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface EnvironmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.Environment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the environment.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
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
   * The name of the environment.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
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
   * Required. The human-readable name of the environment (unique in an agent).
   * Limit of 64 characters.
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
   * Required. The human-readable name of the environment (unique in an agent).
   * Limit of 64 characters.
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
   * The human-readable description of the environment. The maximum length is
   * 500 characters. If exceeded, the request is rejected.
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
   * The human-readable description of the environment. The maximum length is
   * 500 characters. If exceeded, the request is rejected.
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
   * A list of configurations for flow versions. You should include version
   * configs for all flows that are reachable from [`Start
   * Flow`][Agent.start_flow] in the agent. Otherwise, an error will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig version_configs = 6;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig>
      getVersionConfigsList();
  /**
   *
   *
   * <pre>
   * A list of configurations for flow versions. You should include version
   * configs for all flows that are reachable from [`Start
   * Flow`][Agent.start_flow] in the agent. Otherwise, an error will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig version_configs = 6;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig getVersionConfigs(int index);
  /**
   *
   *
   * <pre>
   * A list of configurations for flow versions. You should include version
   * configs for all flows that are reachable from [`Start
   * Flow`][Agent.start_flow] in the agent. Otherwise, an error will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig version_configs = 6;
   * </code>
   */
  int getVersionConfigsCount();
  /**
   *
   *
   * <pre>
   * A list of configurations for flow versions. You should include version
   * configs for all flows that are reachable from [`Start
   * Flow`][Agent.start_flow] in the agent. Otherwise, an error will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig version_configs = 6;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfigOrBuilder>
      getVersionConfigsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of configurations for flow versions. You should include version
   * configs for all flows that are reachable from [`Start
   * Flow`][Agent.start_flow] in the agent. Otherwise, an error will be
   * returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfig version_configs = 6;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment.VersionConfigOrBuilder
      getVersionConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Update time of this environment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time of this environment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Update time of this environment.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The test cases config for continuous tests of this environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment.TestCasesConfig test_cases_config = 7;
   * </code>
   *
   * @return Whether the testCasesConfig field is set.
   */
  boolean hasTestCasesConfig();
  /**
   *
   *
   * <pre>
   * The test cases config for continuous tests of this environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment.TestCasesConfig test_cases_config = 7;
   * </code>
   *
   * @return The testCasesConfig.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment.TestCasesConfig getTestCasesConfig();
  /**
   *
   *
   * <pre>
   * The test cases config for continuous tests of this environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment.TestCasesConfig test_cases_config = 7;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment.TestCasesConfigOrBuilder
      getTestCasesConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The webhook configuration for this environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment.WebhookConfig webhook_config = 10;</code>
   *
   * @return Whether the webhookConfig field is set.
   */
  boolean hasWebhookConfig();
  /**
   *
   *
   * <pre>
   * The webhook configuration for this environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment.WebhookConfig webhook_config = 10;</code>
   *
   * @return The webhookConfig.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment.WebhookConfig getWebhookConfig();
  /**
   *
   *
   * <pre>
   * The webhook configuration for this environment.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Environment.WebhookConfig webhook_config = 10;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.Environment.WebhookConfigOrBuilder
      getWebhookConfigOrBuilder();
}
