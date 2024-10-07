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
// source: google/cloud/dialogflow/cx/v3beta1/tool.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface CreateToolRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.CreateToolRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The agent to create a Tool for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The agent to create a Tool for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The Tool to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Tool tool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the tool field is set.
   */
  boolean hasTool();
  /**
   *
   *
   * <pre>
   * Required. The Tool to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Tool tool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The tool.
   */
  com.google.cloud.dialogflow.cx.v3beta1.Tool getTool();
  /**
   *
   *
   * <pre>
   * Required. The Tool to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.Tool tool = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3beta1.ToolOrBuilder getToolOrBuilder();
}
