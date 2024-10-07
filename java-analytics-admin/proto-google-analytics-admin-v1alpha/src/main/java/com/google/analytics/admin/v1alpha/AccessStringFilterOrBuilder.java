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
// source: google/analytics/admin/v1alpha/access_report.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

public interface AccessStringFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AccessStringFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The match type for this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessStringFilter.MatchType match_type = 1;</code>
   *
   * @return The enum numeric value on the wire for matchType.
   */
  int getMatchTypeValue();
  /**
   *
   *
   * <pre>
   * The match type for this filter.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessStringFilter.MatchType match_type = 1;</code>
   *
   * @return The matchType.
   */
  com.google.analytics.admin.v1alpha.AccessStringFilter.MatchType getMatchType();

  /**
   *
   *
   * <pre>
   * The string value used for the matching.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The value.
   */
  java.lang.String getValue();
  /**
   *
   *
   * <pre>
   * The string value used for the matching.
   * </pre>
   *
   * <code>string value = 2;</code>
   *
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString getValueBytes();

  /**
   *
   *
   * <pre>
   * If true, the string value is case sensitive.
   * </pre>
   *
   * <code>bool case_sensitive = 3;</code>
   *
   * @return The caseSensitive.
   */
  boolean getCaseSensitive();
}
