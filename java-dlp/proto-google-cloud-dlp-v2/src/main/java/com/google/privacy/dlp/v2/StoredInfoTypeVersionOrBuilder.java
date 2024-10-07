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

public interface StoredInfoTypeVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.StoredInfoTypeVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * StoredInfoType configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 1;</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * StoredInfoType configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 1;</code>
   *
   * @return The config.
   */
  com.google.privacy.dlp.v2.StoredInfoTypeConfig getConfig();
  /**
   *
   *
   * <pre>
   * StoredInfoType configuration.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeConfig config = 1;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeConfigOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Create timestamp of the version. Read-only, determined by the system
   * when the version is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Create timestamp of the version. Read-only, determined by the system
   * when the version is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Create timestamp of the version. Read-only, determined by the system
   * when the version is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Stored info type version state. Read-only, updated by the system
   * during dictionary creation.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeState state = 3;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Stored info type version state. Read-only, updated by the system
   * during dictionary creation.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeState state = 3;</code>
   *
   * @return The state.
   */
  com.google.privacy.dlp.v2.StoredInfoTypeState getState();

  /**
   *
   *
   * <pre>
   * Errors that occurred when creating this storedInfoType version, or
   * anomalies detected in the storedInfoType data that render it unusable. Only
   * the five most recent errors will be displayed, with the most recent error
   * appearing first.
   *
   * For example, some of the data for stored custom dictionaries is put in
   * the user's Cloud Storage bucket, and if this data is modified or
   * deleted by the user or another system, the dictionary becomes invalid.
   *
   * If any errors occur, fix the problem indicated by the error message and
   * use the UpdateStoredInfoType API method to create another version of the
   * storedInfoType to continue using it, reusing the same `config` if it was
   * not the source of the error.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Error errors = 4;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.Error> getErrorsList();
  /**
   *
   *
   * <pre>
   * Errors that occurred when creating this storedInfoType version, or
   * anomalies detected in the storedInfoType data that render it unusable. Only
   * the five most recent errors will be displayed, with the most recent error
   * appearing first.
   *
   * For example, some of the data for stored custom dictionaries is put in
   * the user's Cloud Storage bucket, and if this data is modified or
   * deleted by the user or another system, the dictionary becomes invalid.
   *
   * If any errors occur, fix the problem indicated by the error message and
   * use the UpdateStoredInfoType API method to create another version of the
   * storedInfoType to continue using it, reusing the same `config` if it was
   * not the source of the error.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Error errors = 4;</code>
   */
  com.google.privacy.dlp.v2.Error getErrors(int index);
  /**
   *
   *
   * <pre>
   * Errors that occurred when creating this storedInfoType version, or
   * anomalies detected in the storedInfoType data that render it unusable. Only
   * the five most recent errors will be displayed, with the most recent error
   * appearing first.
   *
   * For example, some of the data for stored custom dictionaries is put in
   * the user's Cloud Storage bucket, and if this data is modified or
   * deleted by the user or another system, the dictionary becomes invalid.
   *
   * If any errors occur, fix the problem indicated by the error message and
   * use the UpdateStoredInfoType API method to create another version of the
   * storedInfoType to continue using it, reusing the same `config` if it was
   * not the source of the error.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Error errors = 4;</code>
   */
  int getErrorsCount();
  /**
   *
   *
   * <pre>
   * Errors that occurred when creating this storedInfoType version, or
   * anomalies detected in the storedInfoType data that render it unusable. Only
   * the five most recent errors will be displayed, with the most recent error
   * appearing first.
   *
   * For example, some of the data for stored custom dictionaries is put in
   * the user's Cloud Storage bucket, and if this data is modified or
   * deleted by the user or another system, the dictionary becomes invalid.
   *
   * If any errors occur, fix the problem indicated by the error message and
   * use the UpdateStoredInfoType API method to create another version of the
   * storedInfoType to continue using it, reusing the same `config` if it was
   * not the source of the error.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Error errors = 4;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.ErrorOrBuilder> getErrorsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Errors that occurred when creating this storedInfoType version, or
   * anomalies detected in the storedInfoType data that render it unusable. Only
   * the five most recent errors will be displayed, with the most recent error
   * appearing first.
   *
   * For example, some of the data for stored custom dictionaries is put in
   * the user's Cloud Storage bucket, and if this data is modified or
   * deleted by the user or another system, the dictionary becomes invalid.
   *
   * If any errors occur, fix the problem indicated by the error message and
   * use the UpdateStoredInfoType API method to create another version of the
   * storedInfoType to continue using it, reusing the same `config` if it was
   * not the source of the error.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Error errors = 4;</code>
   */
  com.google.privacy.dlp.v2.ErrorOrBuilder getErrorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Statistics about this storedInfoType version.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeStats stats = 5;</code>
   *
   * @return Whether the stats field is set.
   */
  boolean hasStats();
  /**
   *
   *
   * <pre>
   * Statistics about this storedInfoType version.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeStats stats = 5;</code>
   *
   * @return The stats.
   */
  com.google.privacy.dlp.v2.StoredInfoTypeStats getStats();
  /**
   *
   *
   * <pre>
   * Statistics about this storedInfoType version.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.StoredInfoTypeStats stats = 5;</code>
   */
  com.google.privacy.dlp.v2.StoredInfoTypeStatsOrBuilder getStatsOrBuilder();
}
