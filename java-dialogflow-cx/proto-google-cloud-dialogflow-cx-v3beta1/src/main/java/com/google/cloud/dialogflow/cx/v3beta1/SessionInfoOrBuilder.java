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
// source: google/cloud/dialogflow/cx/v3beta1/webhook.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface SessionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.SessionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Always present for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Ignored for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * unique identifier of the
   * [session][google.cloud.dialogflow.cx.v3beta1.DetectIntentRequest.session].
   * This field can be used by the webhook to identify a session. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`
   * if environment is specified.
   * </pre>
   *
   * <code>string session = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The session.
   */
  java.lang.String getSession();
  /**
   *
   *
   * <pre>
   * Always present for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Ignored for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * unique identifier of the
   * [session][google.cloud.dialogflow.cx.v3beta1.DetectIntentRequest.session].
   * This field can be used by the webhook to identify a session. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/sessions/&lt;Session ID&gt;` or `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/environments/&lt;Environment ID&gt;/sessions/&lt;Session ID&gt;`
   * if environment is specified.
   * </pre>
   *
   * <code>string session = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for session.
   */
  com.google.protobuf.ByteString getSessionBytes();

  /**
   *
   *
   * <pre>
   * Optional for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Optional for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. All
   * parameters collected from forms and intents during the session. Parameters
   * can be created, updated, or removed by the webhook. To remove a parameter
   * from the session, the webhook should explicitly set the parameter value to
   * null in
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * map is keyed by parameters' display names.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; parameters = 2;</code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Optional for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Optional for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. All
   * parameters collected from forms and intents during the session. Parameters
   * can be created, updated, or removed by the webhook. To remove a parameter
   * from the session, the webhook should explicitly set the parameter value to
   * null in
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * map is keyed by parameters' display names.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; parameters = 2;</code>
   */
  boolean containsParameters(java.lang.String key);
  /** Use {@link #getParametersMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParameters();
  /**
   *
   *
   * <pre>
   * Optional for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Optional for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. All
   * parameters collected from forms and intents during the session. Parameters
   * can be created, updated, or removed by the webhook. To remove a parameter
   * from the session, the webhook should explicitly set the parameter value to
   * null in
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * map is keyed by parameters' display names.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; parameters = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getParametersMap();
  /**
   *
   *
   * <pre>
   * Optional for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Optional for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. All
   * parameters collected from forms and intents during the session. Parameters
   * can be created, updated, or removed by the webhook. To remove a parameter
   * from the session, the webhook should explicitly set the parameter value to
   * null in
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * map is keyed by parameters' display names.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; parameters = 2;</code>
   */
  /* nullable */
  com.google.protobuf.Value getParametersOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Optional for
   * [WebhookRequest][google.cloud.dialogflow.cx.v3beta1.WebhookRequest].
   * Optional for
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. All
   * parameters collected from forms and intents during the session. Parameters
   * can be created, updated, or removed by the webhook. To remove a parameter
   * from the session, the webhook should explicitly set the parameter value to
   * null in
   * [WebhookResponse][google.cloud.dialogflow.cx.v3beta1.WebhookResponse]. The
   * map is keyed by parameters' display names.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; parameters = 2;</code>
   */
  com.google.protobuf.Value getParametersOrThrow(java.lang.String key);
}
