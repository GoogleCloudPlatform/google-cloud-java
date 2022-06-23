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
// source: google/monitoring/dashboard/v1/metrics.proto

package com.google.monitoring.dashboard.v1;

public interface TimeSeriesQueryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.TimeSeriesQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Filter parameters to fetch time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilter time_series_filter = 1;</code>
   *
   * @return Whether the timeSeriesFilter field is set.
   */
  boolean hasTimeSeriesFilter();
  /**
   *
   *
   * <pre>
   * Filter parameters to fetch time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilter time_series_filter = 1;</code>
   *
   * @return The timeSeriesFilter.
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilter getTimeSeriesFilter();
  /**
   *
   *
   * <pre>
   * Filter parameters to fetch time series.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilter time_series_filter = 1;</code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterOrBuilder getTimeSeriesFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Parameters to fetch a ratio between two time series filters.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio time_series_filter_ratio = 2;
   * </code>
   *
   * @return Whether the timeSeriesFilterRatio field is set.
   */
  boolean hasTimeSeriesFilterRatio();
  /**
   *
   *
   * <pre>
   * Parameters to fetch a ratio between two time series filters.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio time_series_filter_ratio = 2;
   * </code>
   *
   * @return The timeSeriesFilterRatio.
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterRatio getTimeSeriesFilterRatio();
  /**
   *
   *
   * <pre>
   * Parameters to fetch a ratio between two time series filters.
   * </pre>
   *
   * <code>.google.monitoring.dashboard.v1.TimeSeriesFilterRatio time_series_filter_ratio = 2;
   * </code>
   */
  com.google.monitoring.dashboard.v1.TimeSeriesFilterRatioOrBuilder
      getTimeSeriesFilterRatioOrBuilder();

  /**
   *
   *
   * <pre>
   * A query used to fetch time series.
   * </pre>
   *
   * <code>string time_series_query_language = 3;</code>
   *
   * @return Whether the timeSeriesQueryLanguage field is set.
   */
  boolean hasTimeSeriesQueryLanguage();
  /**
   *
   *
   * <pre>
   * A query used to fetch time series.
   * </pre>
   *
   * <code>string time_series_query_language = 3;</code>
   *
   * @return The timeSeriesQueryLanguage.
   */
  java.lang.String getTimeSeriesQueryLanguage();
  /**
   *
   *
   * <pre>
   * A query used to fetch time series.
   * </pre>
   *
   * <code>string time_series_query_language = 3;</code>
   *
   * @return The bytes for timeSeriesQueryLanguage.
   */
  com.google.protobuf.ByteString getTimeSeriesQueryLanguageBytes();

  /**
   *
   *
   * <pre>
   * The unit of data contained in fetched time series. If non-empty, this
   * unit will override any unit that accompanies fetched data. The format is
   * the same as the
   * [`unit`](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors)
   * field in `MetricDescriptor`.
   * </pre>
   *
   * <code>string unit_override = 5;</code>
   *
   * @return The unitOverride.
   */
  java.lang.String getUnitOverride();
  /**
   *
   *
   * <pre>
   * The unit of data contained in fetched time series. If non-empty, this
   * unit will override any unit that accompanies fetched data. The format is
   * the same as the
   * [`unit`](https://cloud.google.com/monitoring/api/ref_v3/rest/v3/projects.metricDescriptors)
   * field in `MetricDescriptor`.
   * </pre>
   *
   * <code>string unit_override = 5;</code>
   *
   * @return The bytes for unitOverride.
   */
  com.google.protobuf.ByteString getUnitOverrideBytes();

  public com.google.monitoring.dashboard.v1.TimeSeriesQuery.SourceCase getSourceCase();
}
