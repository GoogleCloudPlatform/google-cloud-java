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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface FileStoreCollectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.FileStoreCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A collection of regular expressions to match a file store
   * against.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.FileStoreRegexes include_regexes = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the includeRegexes field is set.
   */
  boolean hasIncludeRegexes();
  /**
   *
   *
   * <pre>
   * Optional. A collection of regular expressions to match a file store
   * against.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.FileStoreRegexes include_regexes = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The includeRegexes.
   */
  com.google.privacy.dlp.v2.FileStoreRegexes getIncludeRegexes();
  /**
   *
   *
   * <pre>
   * Optional. A collection of regular expressions to match a file store
   * against.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.FileStoreRegexes include_regexes = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.privacy.dlp.v2.FileStoreRegexesOrBuilder getIncludeRegexesOrBuilder();

  com.google.privacy.dlp.v2.FileStoreCollection.PatternCase getPatternCase();
}
