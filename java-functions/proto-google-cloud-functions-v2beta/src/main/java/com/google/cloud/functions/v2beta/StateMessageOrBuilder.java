/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.functions.v2beta;

public interface StateMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2beta.StateMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Severity of the state message.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StateMessage.Severity severity = 1;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Severity of the state message.
   * </pre>
   *
   * <code>.google.cloud.functions.v2beta.StateMessage.Severity severity = 1;</code>
   *
   * @return The severity.
   */
  com.google.cloud.functions.v2beta.StateMessage.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * One-word CamelCase type of the state message.
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * One-word CamelCase type of the state message.
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString getMessageBytes();
}
