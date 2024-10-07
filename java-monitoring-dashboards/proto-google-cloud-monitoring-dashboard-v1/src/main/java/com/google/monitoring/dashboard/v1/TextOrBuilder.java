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
// source: google/monitoring/dashboard/v1/text.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.dashboard.v1;

public interface TextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.Text)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The text content to be displayed.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The content.
   */
  java.lang.String getContent();
  /**
   *
   *
   * <pre>
   * The text content to be displayed.
   * </pre>
   *
   * <code>string content = 1;</code>
   *
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString getContentBytes();

  /**
   *
   *
   * <pre>
   * How the text content is formatted.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
   *
   * @return The enum numeric value on the wire for format.
   */
  int getFormatValue();
  /**
   *
   *
   * <pre>
   * How the text content is formatted.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.Format format = 2;</code>
   *
   * @return The format.
   */
  com.google.monitoring.dashboard.v1.Text.Format getFormat();

  /**
   *
   *
   * <pre>
   * How the text is styled
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.TextStyle style = 3;</code>
   *
   * @return Whether the style field is set.
   */
  boolean hasStyle();
  /**
   *
   *
   * <pre>
   * How the text is styled
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.TextStyle style = 3;</code>
   *
   * @return The style.
   */
  com.google.monitoring.dashboard.v1.Text.TextStyle getStyle();
  /**
   *
   *
   * <pre>
   * How the text is styled
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.Text.TextStyle style = 3;</code>
   */
  com.google.monitoring.dashboard.v1.Text.TextStyleOrBuilder getStyleOrBuilder();
}
