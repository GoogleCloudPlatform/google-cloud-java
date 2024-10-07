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
// source: google/analytics/data/v1beta/data.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1beta;

public interface MinuteRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.MinuteRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The inclusive start minute for the query as a number of minutes before now.
   * For example, `"startMinutesAgo": 29` specifies the report should include
   * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
   *
   * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
   * properties can request up to the last 30 minutes of event data
   * (`startMinutesAgo &lt;= 29`), and 360 Analytics properties can request up to
   * the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 start_minutes_ago = 1;</code>
   *
   * @return Whether the startMinutesAgo field is set.
   */
  boolean hasStartMinutesAgo();
  /**
   *
   *
   * <pre>
   * The inclusive start minute for the query as a number of minutes before now.
   * For example, `"startMinutesAgo": 29` specifies the report should include
   * event data from 29 minutes ago and after. Cannot be after `endMinutesAgo`.
   *
   * If unspecified, `startMinutesAgo` is defaulted to 29. Standard Analytics
   * properties can request up to the last 30 minutes of event data
   * (`startMinutesAgo &lt;= 29`), and 360 Analytics properties can request up to
   * the last 60 minutes of event data (`startMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 start_minutes_ago = 1;</code>
   *
   * @return The startMinutesAgo.
   */
  int getStartMinutesAgo();

  /**
   *
   *
   * <pre>
   * The inclusive end minute for the query as a number of minutes before now.
   * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
   * specifies the report should include event data from prior to 15 minutes
   * ago.
   *
   * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
   * properties can request any minute in the last 30 minutes of event data
   * (`endMinutesAgo &lt;= 29`), and 360 Analytics properties can request any
   * minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 end_minutes_ago = 2;</code>
   *
   * @return Whether the endMinutesAgo field is set.
   */
  boolean hasEndMinutesAgo();
  /**
   *
   *
   * <pre>
   * The inclusive end minute for the query as a number of minutes before now.
   * Cannot be before `startMinutesAgo`. For example, `"endMinutesAgo": 15`
   * specifies the report should include event data from prior to 15 minutes
   * ago.
   *
   * If unspecified, `endMinutesAgo` is defaulted to 0. Standard Analytics
   * properties can request any minute in the last 30 minutes of event data
   * (`endMinutesAgo &lt;= 29`), and 360 Analytics properties can request any
   * minute in the last 60 minutes of event data (`endMinutesAgo &lt;= 59`).
   * </pre>
   *
   * <code>optional int32 end_minutes_ago = 2;</code>
   *
   * @return The endMinutesAgo.
   */
  int getEndMinutesAgo();

  /**
   *
   *
   * <pre>
   * Assigns a name to this minute range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, minute ranges are named by their zero based index
   * in the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Assigns a name to this minute range. The dimension `dateRange` is valued to
   * this name in a report response. If set, cannot begin with `date_range_` or
   * `RESERVED_`. If not set, minute ranges are named by their zero based index
   * in the request: `date_range_0`, `date_range_1`, etc.
   * </pre>
   *
   * <code>string name = 3;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
