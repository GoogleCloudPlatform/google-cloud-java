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

public interface WebhookResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.WebhookResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The fulfillment response to send to the user. This field can be omitted by
   * the webhook if it does not intend to send any response to the user.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.WebhookResponse.FulfillmentResponse fulfillment_response = 1;
   * </code>
   *
   * @return Whether the fulfillmentResponse field is set.
   */
  boolean hasFulfillmentResponse();
  /**
   *
   *
   * <pre>
   * The fulfillment response to send to the user. This field can be omitted by
   * the webhook if it does not intend to send any response to the user.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.WebhookResponse.FulfillmentResponse fulfillment_response = 1;
   * </code>
   *
   * @return The fulfillmentResponse.
   */
  com.google.cloud.dialogflow.cx.v3beta1.WebhookResponse.FulfillmentResponse
      getFulfillmentResponse();
  /**
   *
   *
   * <pre>
   * The fulfillment response to send to the user. This field can be omitted by
   * the webhook if it does not intend to send any response to the user.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.WebhookResponse.FulfillmentResponse fulfillment_response = 1;
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.WebhookResponse.FulfillmentResponseOrBuilder
      getFulfillmentResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about page status. This field can be omitted by the webhook if
   * it does not intend to modify page status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.PageInfo page_info = 2;</code>
   *
   * @return Whether the pageInfo field is set.
   */
  boolean hasPageInfo();
  /**
   *
   *
   * <pre>
   * Information about page status. This field can be omitted by the webhook if
   * it does not intend to modify page status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.PageInfo page_info = 2;</code>
   *
   * @return The pageInfo.
   */
  com.google.cloud.dialogflow.cx.v3beta1.PageInfo getPageInfo();
  /**
   *
   *
   * <pre>
   * Information about page status. This field can be omitted by the webhook if
   * it does not intend to modify page status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.PageInfo page_info = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.PageInfoOrBuilder getPageInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about session status. This field can be omitted by the webhook
   * if it does not intend to modify session status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SessionInfo session_info = 3;</code>
   *
   * @return Whether the sessionInfo field is set.
   */
  boolean hasSessionInfo();
  /**
   *
   *
   * <pre>
   * Information about session status. This field can be omitted by the webhook
   * if it does not intend to modify session status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SessionInfo session_info = 3;</code>
   *
   * @return The sessionInfo.
   */
  com.google.cloud.dialogflow.cx.v3beta1.SessionInfo getSessionInfo();
  /**
   *
   *
   * <pre>
   * Information about session status. This field can be omitted by the webhook
   * if it does not intend to modify session status.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.SessionInfo session_info = 3;</code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.SessionInfoOrBuilder getSessionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Value to append directly to
   * [QueryResult.webhook_payloads][google.cloud.dialogflow.cx.v3beta1.QueryResult.webhook_payloads].
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   *
   * @return Whether the payload field is set.
   */
  boolean hasPayload();
  /**
   *
   *
   * <pre>
   * Value to append directly to
   * [QueryResult.webhook_payloads][google.cloud.dialogflow.cx.v3beta1.QueryResult.webhook_payloads].
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   *
   * @return The payload.
   */
  com.google.protobuf.Struct getPayload();
  /**
   *
   *
   * <pre>
   * Value to append directly to
   * [QueryResult.webhook_payloads][google.cloud.dialogflow.cx.v3beta1.QueryResult.webhook_payloads].
   * </pre>
   *
   * <code>.google.protobuf.Struct payload = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetPage field is set.
   */
  boolean hasTargetPage();
  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetPage.
   */
  java.lang.String getTargetPage();
  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 5 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetPage.
   */
  com.google.protobuf.ByteString getTargetPageBytes();

  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetFlow field is set.
   */
  boolean hasTargetFlow();
  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetFlow.
   */
  java.lang.String getTargetFlow();
  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 6 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetFlow.
   */
  com.google.protobuf.ByteString getTargetFlowBytes();

  com.google.cloud.dialogflow.cx.v3beta1.WebhookResponse.TransitionCase getTransitionCase();
}
