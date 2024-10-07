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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.5
package com.google.cloudbuild.v1;

public interface ReceiveTriggerWebhookRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.ReceiveTriggerWebhookRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the `ReceiveTriggerWebhook` to retrieve.
   * Format: `projects/{project}/locations/{location}/triggers/{trigger}`
   * </pre>
   *
   * <code>string name = 5;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the `ReceiveTriggerWebhook` to retrieve.
   * Format: `projects/{project}/locations/{location}/triggers/{trigger}`
   * </pre>
   *
   * <code>string name = 5;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * HTTP request body.
   * </pre>
   *
   * <code>.google.api.HttpBody body = 1;</code>
   *
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   *
   *
   * <pre>
   * HTTP request body.
   * </pre>
   *
   * <code>.google.api.HttpBody body = 1;</code>
   *
   * @return The body.
   */
  com.google.api.HttpBody getBody();
  /**
   *
   *
   * <pre>
   * HTTP request body.
   * </pre>
   *
   * <code>.google.api.HttpBody body = 1;</code>
   */
  com.google.api.HttpBodyOrBuilder getBodyOrBuilder();

  /**
   *
   *
   * <pre>
   * Project in which the specified trigger lives
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project in which the specified trigger lives
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Name of the trigger to run the payload against
   * </pre>
   *
   * <code>string trigger = 3;</code>
   *
   * @return The trigger.
   */
  java.lang.String getTrigger();
  /**
   *
   *
   * <pre>
   * Name of the trigger to run the payload against
   * </pre>
   *
   * <code>string trigger = 3;</code>
   *
   * @return The bytes for trigger.
   */
  com.google.protobuf.ByteString getTriggerBytes();

  /**
   *
   *
   * <pre>
   * Secret token used for authorization if an OAuth token isn't provided.
   * </pre>
   *
   * <code>string secret = 4;</code>
   *
   * @return The secret.
   */
  java.lang.String getSecret();
  /**
   *
   *
   * <pre>
   * Secret token used for authorization if an OAuth token isn't provided.
   * </pre>
   *
   * <code>string secret = 4;</code>
   *
   * @return The bytes for secret.
   */
  com.google.protobuf.ByteString getSecretBytes();
}
