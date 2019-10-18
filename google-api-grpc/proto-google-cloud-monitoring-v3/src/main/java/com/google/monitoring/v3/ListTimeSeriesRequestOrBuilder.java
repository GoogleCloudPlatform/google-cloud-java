// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

public interface ListTimeSeriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListTimeSeriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project on which to execute the request. The format is
   * "projects/{project_id_or_number}".
   * </pre>
   *
   * <code>string name = 10;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The project on which to execute the request. The format is
   * "projects/{project_id_or_number}".
   * </pre>
   *
   * <code>string name = 10;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A [monitoring filter](/monitoring/api/v3/filters) that specifies which time
   * series should be returned.  The filter must specify a single metric type,
   * and can additionally specify metric labels and other information. For
   * example:
   *     metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *         metric.labels.instance_name = "my-instance-name"
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * A [monitoring filter](/monitoring/api/v3/filters) that specifies which time
   * series should be returned.  The filter must specify a single metric type,
   * and can additionally specify metric labels and other information. For
   * example:
   *     metric.type = "compute.googleapis.com/instance/cpu/usage_time" AND
   *         metric.labels.instance_name = "my-instance-name"
   * </pre>
   *
   * <code>string filter = 2;</code>
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The time interval for which results should be returned. Only time series
   * that contain data points in the specified interval are included
   * in the response.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 4;</code>
   */
  boolean hasInterval();
  /**
   *
   *
   * <pre>
   * The time interval for which results should be returned. Only time series
   * that contain data points in the specified interval are included
   * in the response.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 4;</code>
   */
  com.google.monitoring.v3.TimeInterval getInterval();
  /**
   *
   *
   * <pre>
   * The time interval for which results should be returned. Only time series
   * that contain data points in the specified interval are included
   * in the response.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeInterval interval = 4;</code>
   */
  com.google.monitoring.v3.TimeIntervalOrBuilder getIntervalOrBuilder();

  /**
   *
   *
   * <pre>
   * By default, the raw time series data is returned.
   * Use this field to combine multiple time series for different
   * views of the data.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation aggregation = 5;</code>
   */
  boolean hasAggregation();
  /**
   *
   *
   * <pre>
   * By default, the raw time series data is returned.
   * Use this field to combine multiple time series for different
   * views of the data.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation aggregation = 5;</code>
   */
  com.google.monitoring.v3.Aggregation getAggregation();
  /**
   *
   *
   * <pre>
   * By default, the raw time series data is returned.
   * Use this field to combine multiple time series for different
   * views of the data.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation aggregation = 5;</code>
   */
  com.google.monitoring.v3.AggregationOrBuilder getAggregationOrBuilder();

  /**
   *
   *
   * <pre>
   * Unsupported: must be left blank. The points in each time series are
   * returned in reverse time order.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Unsupported: must be left blank. The points in each time series are
   * returned in reverse time order.
   * </pre>
   *
   * <code>string order_by = 6;</code>
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * Specifies which information is returned about the time series.
   * </pre>
   *
   * <code>.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView view = 7;</code>
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Specifies which information is returned about the time series.
   * </pre>
   *
   * <code>.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView view = 7;</code>
   */
  com.google.monitoring.v3.ListTimeSeriesRequest.TimeSeriesView getView();

  /**
   *
   *
   * <pre>
   * A positive number that is the maximum number of results to return. If
   * `page_size` is empty or more than 100,000 results, the effective
   * `page_size` is 100,000 results. If `view` is set to `FULL`, this is the
   * maximum number of `Points` returned. If `view` is set to `HEADERS`, this is
   * the maximum number of `TimeSeries` returned.
   * </pre>
   *
   * <code>int32 page_size = 8;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 9;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * If this field is not empty then it must contain the `nextPageToken` value
   * returned by a previous call to this method.  Using this field causes the
   * method to return additional results from the previous method call.
   * </pre>
   *
   * <code>string page_token = 9;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
