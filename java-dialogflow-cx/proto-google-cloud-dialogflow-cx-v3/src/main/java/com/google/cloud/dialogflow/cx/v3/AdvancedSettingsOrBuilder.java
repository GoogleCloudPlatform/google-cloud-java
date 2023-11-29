/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/dialogflow/cx/v3/advanced_settings.proto

package com.google.cloud.dialogflow.cx.v3;

public interface AdvancedSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.AdvancedSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If present, incoming audio is exported by Dialogflow to the configured
   * Google Cloud Storage destination.
   * Exposed at the following levels:
   * - Agent level
   * - Flow level
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.GcsDestination audio_export_gcs_destination = 2;</code>
   *
   * @return Whether the audioExportGcsDestination field is set.
   */
  boolean hasAudioExportGcsDestination();
  /**
   *
   *
   * <pre>
   * If present, incoming audio is exported by Dialogflow to the configured
   * Google Cloud Storage destination.
   * Exposed at the following levels:
   * - Agent level
   * - Flow level
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.GcsDestination audio_export_gcs_destination = 2;</code>
   *
   * @return The audioExportGcsDestination.
   */
  com.google.cloud.dialogflow.cx.v3.GcsDestination getAudioExportGcsDestination();
  /**
   *
   *
   * <pre>
   * If present, incoming audio is exported by Dialogflow to the configured
   * Google Cloud Storage destination.
   * Exposed at the following levels:
   * - Agent level
   * - Flow level
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.GcsDestination audio_export_gcs_destination = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.GcsDestinationOrBuilder getAudioExportGcsDestinationOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings for DTMF.
   * Exposed at the following levels:
   * - Agent level
   * - Flow level
   * - Page level
   * - Parameter level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.DtmfSettings dtmf_settings = 5;</code>
   *
   * @return Whether the dtmfSettings field is set.
   */
  boolean hasDtmfSettings();
  /**
   *
   *
   * <pre>
   * Settings for DTMF.
   * Exposed at the following levels:
   * - Agent level
   * - Flow level
   * - Page level
   * - Parameter level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.DtmfSettings dtmf_settings = 5;</code>
   *
   * @return The dtmfSettings.
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings.DtmfSettings getDtmfSettings();
  /**
   *
   *
   * <pre>
   * Settings for DTMF.
   * Exposed at the following levels:
   * - Agent level
   * - Flow level
   * - Page level
   * - Parameter level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.DtmfSettings dtmf_settings = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings.DtmfSettingsOrBuilder
      getDtmfSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Settings for logging.
   * Settings for Dialogflow History, Contact Center messages, StackDriver logs,
   * and speech logging.
   * Exposed at the following levels:
   * - Agent level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings logging_settings = 6;
   * </code>
   *
   * @return Whether the loggingSettings field is set.
   */
  boolean hasLoggingSettings();
  /**
   *
   *
   * <pre>
   * Settings for logging.
   * Settings for Dialogflow History, Contact Center messages, StackDriver logs,
   * and speech logging.
   * Exposed at the following levels:
   * - Agent level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings logging_settings = 6;
   * </code>
   *
   * @return The loggingSettings.
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings getLoggingSettings();
  /**
   *
   *
   * <pre>
   * Settings for logging.
   * Settings for Dialogflow History, Contact Center messages, StackDriver logs,
   * and speech logging.
   * Exposed at the following levels:
   * - Agent level.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettings logging_settings = 6;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.AdvancedSettings.LoggingSettingsOrBuilder
      getLoggingSettingsOrBuilder();
}
