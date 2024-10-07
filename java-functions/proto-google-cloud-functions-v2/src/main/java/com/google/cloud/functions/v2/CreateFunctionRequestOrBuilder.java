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
// source: google/cloud/functions/v2/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v2;

public interface CreateFunctionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2.CreateFunctionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and location in which the function should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
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
   * Required. The project and location in which the function should be created,
   * specified in the format `projects/&#42;&#47;locations/&#42;`
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
   * Required. Function to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2.Function function = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   *
   *
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2.Function function = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The function.
   */
  com.google.cloud.functions.v2.Function getFunction();
  /**
   *
   *
   * <pre>
   * Required. Function to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.functions.v2.Function function = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.functions.v2.FunctionOrBuilder getFunctionOrBuilder();

  /**
   *
   *
   * <pre>
   * The ID to use for the function, which will become the final component of
   * the function's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string function_id = 3;</code>
   *
   * @return The functionId.
   */
  java.lang.String getFunctionId();
  /**
   *
   *
   * <pre>
   * The ID to use for the function, which will become the final component of
   * the function's resource name.
   *
   * This value should be 4-63 characters, and valid characters
   * are /[a-z][0-9]-/.
   * </pre>
   *
   * <code>string function_id = 3;</code>
   *
   * @return The bytes for functionId.
   */
  com.google.protobuf.ByteString getFunctionIdBytes();
}
