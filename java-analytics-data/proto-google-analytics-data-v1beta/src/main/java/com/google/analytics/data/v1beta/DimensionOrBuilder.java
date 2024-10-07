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

public interface DimensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.Dimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
   * for the list of dimension names supported by core reporting methods such
   * as `runReport` and `batchRunReports`. See
   * [Realtime
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#dimensions)
   * for the list of dimension names supported by the `runRealtimeReport`
   * method. See
   * [Funnel
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#dimensions)
   * for the list of dimension names supported by the `runFunnelReport`
   * method.
   *
   * If `dimensionExpression` is specified, `name` can be any string that you
   * would like within the allowed character set. For example if a
   * `dimensionExpression` concatenates `country` and `city`, you could call
   * that dimension `countryAndCity`. Dimension names that you choose must match
   * the regular expression `^[a-zA-Z0-9_]$`.
   *
   * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
   * `dimensionExpression`, and `pivots`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/api-schema#dimensions)
   * for the list of dimension names supported by core reporting methods such
   * as `runReport` and `batchRunReports`. See
   * [Realtime
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/realtime-api-schema#dimensions)
   * for the list of dimension names supported by the `runRealtimeReport`
   * method. See
   * [Funnel
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/exploration-api-schema#dimensions)
   * for the list of dimension names supported by the `runFunnelReport`
   * method.
   *
   * If `dimensionExpression` is specified, `name` can be any string that you
   * would like within the allowed character set. For example if a
   * `dimensionExpression` concatenates `country` and `city`, you could call
   * that dimension `countryAndCity`. Dimension names that you choose must match
   * the regular expression `^[a-zA-Z0-9_]$`.
   *
   * Dimensions are referenced by `name` in `dimensionFilter`, `orderBys`,
   * `dimensionExpression`, and `pivots`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.DimensionExpression dimension_expression = 2;</code>
   *
   * @return Whether the dimensionExpression field is set.
   */
  boolean hasDimensionExpression();
  /**
   *
   *
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.DimensionExpression dimension_expression = 2;</code>
   *
   * @return The dimensionExpression.
   */
  com.google.analytics.data.v1beta.DimensionExpression getDimensionExpression();
  /**
   *
   *
   * <pre>
   * One dimension can be the result of an expression of multiple dimensions.
   * For example, dimension "country, city": concatenate(country, ", ", city).
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.DimensionExpression dimension_expression = 2;</code>
   */
  com.google.analytics.data.v1beta.DimensionExpressionOrBuilder getDimensionExpressionOrBuilder();
}
