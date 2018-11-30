// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/common.proto

package com.google.monitoring.v3;

public interface AggregationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Aggregation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The alignment period for per-[time series][google.monitoring.v3.TimeSeries]
   * alignment. If present, `alignmentPeriod` must be at least 60
   * seconds.  After per-time series alignment, each time series will
   * contain data points only on the period boundaries. If
   * `perSeriesAligner` is not specified or equals `ALIGN_NONE`, then
   * this field is ignored. If `perSeriesAligner` is specified and
   * does not equal `ALIGN_NONE`, then this field must be defined;
   * otherwise an error is returned.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   */
  boolean hasAlignmentPeriod();
  /**
   *
   *
   * <pre>
   * The alignment period for per-[time series][google.monitoring.v3.TimeSeries]
   * alignment. If present, `alignmentPeriod` must be at least 60
   * seconds.  After per-time series alignment, each time series will
   * contain data points only on the period boundaries. If
   * `perSeriesAligner` is not specified or equals `ALIGN_NONE`, then
   * this field is ignored. If `perSeriesAligner` is specified and
   * does not equal `ALIGN_NONE`, then this field must be defined;
   * otherwise an error is returned.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   */
  com.google.protobuf.Duration getAlignmentPeriod();
  /**
   *
   *
   * <pre>
   * The alignment period for per-[time series][google.monitoring.v3.TimeSeries]
   * alignment. If present, `alignmentPeriod` must be at least 60
   * seconds.  After per-time series alignment, each time series will
   * contain data points only on the period boundaries. If
   * `perSeriesAligner` is not specified or equals `ALIGN_NONE`, then
   * this field is ignored. If `perSeriesAligner` is specified and
   * does not equal `ALIGN_NONE`, then this field must be defined;
   * otherwise an error is returned.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getAlignmentPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * The approach to be used to align individual time series. Not all
   * alignment functions may be applied to all time series, depending
   * on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of
   * the time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Aligner per_series_aligner = 2;</code>
   */
  int getPerSeriesAlignerValue();
  /**
   *
   *
   * <pre>
   * The approach to be used to align individual time series. Not all
   * alignment functions may be applied to all time series, depending
   * on the metric type and value type of the original time
   * series. Alignment may change the metric type or the value type of
   * the time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Aligner per_series_aligner = 2;</code>
   */
  com.google.monitoring.v3.Aggregation.Aligner getPerSeriesAligner();

  /**
   *
   *
   * <pre>
   * The approach to be used to combine time series. Not all reducer
   * functions may be applied to all time series, depending on the
   * metric type and the value type of the original time
   * series. Reduction may change the metric type of value type of the
   * time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Reducer cross_series_reducer = 4;</code>
   */
  int getCrossSeriesReducerValue();
  /**
   *
   *
   * <pre>
   * The approach to be used to combine time series. Not all reducer
   * functions may be applied to all time series, depending on the
   * metric type and the value type of the original time
   * series. Reduction may change the metric type of value type of the
   * time series.
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `crossSeriesReducer` is specified, then
   * `perSeriesAligner` must be specified and not equal `ALIGN_NONE`
   * and `alignmentPeriod` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Reducer cross_series_reducer = 4;</code>
   */
  com.google.monitoring.v3.Aggregation.Reducer getCrossSeriesReducer();

  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   */
  java.util.List<java.lang.String> getGroupByFieldsList();
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   */
  int getGroupByFieldsCount();
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   */
  java.lang.String getGroupByFields(int index);
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `crossSeriesReducer` is
   * specified. The `groupByFields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * function. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `crossSeriesReducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `groupByFields` are aggregated away.  If
   * `groupByFields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `crossSeriesReducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   */
  com.google.protobuf.ByteString getGroupByFieldsBytes(int index);
}
