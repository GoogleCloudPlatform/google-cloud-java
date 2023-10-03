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
// source: google/cloud/aiplatform/v1/value.proto

package com.google.cloud.aiplatform.v1;

public interface ValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   *
   * @return Whether the intValue field is set.
   */
  boolean hasIntValue();
  /**
   *
   *
   * <pre>
   * An integer value.
   * </pre>
   *
   * <code>int64 int_value = 1;</code>
   *
   * @return The intValue.
   */
  long getIntValue();

  /**
   *
   *
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return Whether the doubleValue field is set.
   */
  boolean hasDoubleValue();
  /**
   *
   *
   * <pre>
   * A double value.
   * </pre>
   *
   * <code>double double_value = 2;</code>
   *
   * @return The doubleValue.
   */
  double getDoubleValue();

  /**
   *
   *
   * <pre>
   * A string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return Whether the stringValue field is set.
   */
  boolean hasStringValue();
  /**
   *
   *
   * <pre>
   * A string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   *
   *
   * <pre>
   * A string value.
   * </pre>
   *
   * <code>string string_value = 3;</code>
   *
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString getStringValueBytes();

  com.google.cloud.aiplatform.v1.Value.ValueCase getValueCase();
}
