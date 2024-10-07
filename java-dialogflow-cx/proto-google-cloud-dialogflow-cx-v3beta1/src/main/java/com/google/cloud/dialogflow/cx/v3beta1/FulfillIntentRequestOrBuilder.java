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
// source: google/cloud/dialogflow/cx/v3beta1/session.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface FulfillIntentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.FulfillIntentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Must be same as the corresponding MatchIntent request, otherwise the
   * behavior is undefined.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.MatchIntentRequest match_intent_request = 1;</code>
   *
   * @return Whether the matchIntentRequest field is set.
   */
  boolean hasMatchIntentRequest();
  /**
   *
   *
   * <pre>
   * Must be same as the corresponding MatchIntent request, otherwise the
   * behavior is undefined.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.MatchIntentRequest match_intent_request = 1;</code>
   *
   * @return The matchIntentRequest.
   */
  com.google.cloud.dialogflow.cx.v3beta1.MatchIntentRequest getMatchIntentRequest();
  /**
   *
   *
   * <pre>
   * Must be same as the corresponding MatchIntent request, otherwise the
   * behavior is undefined.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.MatchIntentRequest match_intent_request = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.MatchIntentRequestOrBuilder
      getMatchIntentRequestOrBuilder();

  /**
   *
   *
   * <pre>
   * The matched intent/event to fulfill.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Match match = 2;</code>
   *
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   *
   *
   * <pre>
   * The matched intent/event to fulfill.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Match match = 2;</code>
   *
   * @return The match.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Match getMatch();
  /**
   *
   *
   * <pre>
   * The matched intent/event to fulfill.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.Match match = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.MatchOrBuilder getMatchOrBuilder();

  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 3;</code>
   *
   * @return Whether the outputAudioConfig field is set.
   */
  boolean hasOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 3;</code>
   *
   * @return The outputAudioConfig.
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig getOutputAudioConfig();
  /**
   *
   *
   * <pre>
   * Instructs the speech synthesizer how to generate output audio.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfig output_audio_config = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.OutputAudioConfigOrBuilder getOutputAudioConfigOrBuilder();
}
