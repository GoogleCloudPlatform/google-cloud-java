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
// source: google/cloud/dialogflow/cx/v3beta1/test_case.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public interface BatchRunTestCasesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3beta1.BatchRunTestCasesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Agent name. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/ &lt;AgentID&gt;`.
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
   * Required. Agent name. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/ &lt;AgentID&gt;`.
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
   * Optional. If not set, draft environment is assumed. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
   * </pre>
   *
   * <code>
   * string environment = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();
  /**
   *
   *
   * <pre>
   * Optional. If not set, draft environment is assumed. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/environments/&lt;Environment ID&gt;`.
   * </pre>
   *
   * <code>
   * string environment = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();

  /**
   *
   *
   * <pre>
   * Required. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string test_cases = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the testCases.
   */
  java.util.List<java.lang.String> getTestCasesList();
  /**
   *
   *
   * <pre>
   * Required. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string test_cases = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of testCases.
   */
  int getTestCasesCount();
  /**
   *
   *
   * <pre>
   * Required. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string test_cases = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The testCases at the given index.
   */
  java.lang.String getTestCases(int index);
  /**
   *
   *
   * <pre>
   * Required. Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/agents/&lt;Agent ID&gt;/testCases/&lt;TestCase ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated string test_cases = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the testCases at the given index.
   */
  com.google.protobuf.ByteString getTestCasesBytes(int index);
}
