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
// source: google/cloud/functions/v2beta/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v2beta;

public interface EventFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.EventFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of a CloudEvents attribute.
   * </pre>
   *
   * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The attribute.
   */
  java.lang.String getAttribute();
  /**
   *
   *
   * <pre>
   * Required. The name of a CloudEvents attribute.
   * </pre>
   *
   * <code>string attribute = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for attribute.
   */
  com.google.protobuf.ByteString getAttributeBytes();

  /**
   *
   *
   * <pre>
   * Required. The value for the attribute.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * Required. The value for the attribute.
   * </pre>
   *
   * <code>string value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * Optional. The operator used for matching the events with the value of the
   * filter. If not specified, only events that have an exact key-value pair
   * specified in the filter are matched. The only allowed value is
   * `match-path-pattern`.
   * </pre>
   *
   * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The operator.
   */
  java.lang.String getOperator();
  /**
   *
   *
   * <pre>
   * Optional. The operator used for matching the events with the value of the
   * filter. If not specified, only events that have an exact key-value pair
   * specified in the filter are matched. The only allowed value is
   * `match-path-pattern`.
   * </pre>
   *
   * <code>string operator = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for operator.
   */
  com.google.protobuf.ByteString getOperatorBytes();
}
