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
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.clouderrorreporting.v1beta1;

public interface ListGroupStatsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ListGroupStatsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The error group stats which match the given request.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats error_group_stats = 1;
   * </code>
   */
  java.util.List<com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats>
      getErrorGroupStatsList();
  /**
   *
   *
   * <pre>
   * The error group stats which match the given request.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats error_group_stats = 1;
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats getErrorGroupStats(int index);
  /**
   *
   *
   * <pre>
   * The error group stats which match the given request.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats error_group_stats = 1;
   * </code>
   */
  int getErrorGroupStatsCount();
  /**
   *
   *
   * <pre>
   * The error group stats which match the given request.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats error_group_stats = 1;
   * </code>
   */
  java.util.List<? extends com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupStatsOrBuilder>
      getErrorGroupStatsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The error group stats which match the given request.
   * </pre>
   *
   * <code>
   * repeated .google.devtools.clouderrorreporting.v1beta1.ErrorGroupStats error_group_stats = 1;
   * </code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorGroupStatsOrBuilder
      getErrorGroupStatsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If non-empty, more results are available.
   * Pass this token, along with the same query parameters as the first
   * request, to view the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If non-empty, more results are available.
   * Pass this token, along with the same query parameters as the first
   * request, to view the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The timestamp specifies the start time to which the request was restricted.
   * The start time is set based on the requested time range. It may be adjusted
   * to a later time if a project has exceeded the storage quota and older data
   * has been deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_range_begin = 4;</code>
   *
   * @return Whether the timeRangeBegin field is set.
   */
  boolean hasTimeRangeBegin();
  /**
   *
   *
   * <pre>
   * The timestamp specifies the start time to which the request was restricted.
   * The start time is set based on the requested time range. It may be adjusted
   * to a later time if a project has exceeded the storage quota and older data
   * has been deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_range_begin = 4;</code>
   *
   * @return The timeRangeBegin.
   */
  com.google.protobuf.Timestamp getTimeRangeBegin();
  /**
   *
   *
   * <pre>
   * The timestamp specifies the start time to which the request was restricted.
   * The start time is set based on the requested time range. It may be adjusted
   * to a later time if a project has exceeded the storage quota and older data
   * has been deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time_range_begin = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeRangeBeginOrBuilder();
}
