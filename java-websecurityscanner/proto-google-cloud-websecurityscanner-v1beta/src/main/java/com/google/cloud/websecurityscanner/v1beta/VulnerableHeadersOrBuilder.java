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
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1beta;

public interface VulnerableHeadersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.VulnerableHeaders)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header>
      getHeadersList();
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header getHeaders(int index);
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder>
      getHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder getHeadersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header>
      getMissingHeadersList();
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header getMissingHeaders(int index);
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  int getMissingHeadersCount();
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder>
      getMissingHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder
      getMissingHeadersOrBuilder(int index);
}
