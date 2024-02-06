// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/data_profile.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface DataProfileSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.DataProfileSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The percentage of the records to be selected from the dataset for
   * DataScan.
   *
   * * Value can range between 0.0 and 100.0 with up to 3 significant decimal
   * digits.
   * * Sampling is not applied if `sampling_percent` is not specified, 0 or
   * 100.
   * </pre>
   *
   * <code>float sampling_percent = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The samplingPercent.
   */
  float getSamplingPercent();

  /**
   * <pre>
   * Optional. A filter applied to all rows in a single DataScan job.
   * The filter needs to be a valid SQL expression for a WHERE clause in
   * BigQuery standard SQL syntax.
   * Example: col1 &gt;= 0 AND col2 &lt; 10
   * </pre>
   *
   * <code>string row_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The rowFilter.
   */
  java.lang.String getRowFilter();
  /**
   * <pre>
   * Optional. A filter applied to all rows in a single DataScan job.
   * The filter needs to be a valid SQL expression for a WHERE clause in
   * BigQuery standard SQL syntax.
   * Example: col1 &gt;= 0 AND col2 &lt; 10
   * </pre>
   *
   * <code>string row_filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for rowFilter.
   */
  com.google.protobuf.ByteString
      getRowFilterBytes();

  /**
   * <pre>
   * Optional. Actions to take upon job completion..
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.PostScanActions post_scan_actions = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the postScanActions field is set.
   */
  boolean hasPostScanActions();
  /**
   * <pre>
   * Optional. Actions to take upon job completion..
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.PostScanActions post_scan_actions = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The postScanActions.
   */
  com.google.cloud.dataplex.v1.DataProfileSpec.PostScanActions getPostScanActions();
  /**
   * <pre>
   * Optional. Actions to take upon job completion..
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.PostScanActions post_scan_actions = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataplex.v1.DataProfileSpec.PostScanActionsOrBuilder getPostScanActionsOrBuilder();

  /**
   * <pre>
   * Optional. The fields to include in data profile.
   *
   * If not specified, all fields at the time of profile scan job execution are
   * included, except for ones listed in `exclude_fields`.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields include_fields = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the includeFields field is set.
   */
  boolean hasIncludeFields();
  /**
   * <pre>
   * Optional. The fields to include in data profile.
   *
   * If not specified, all fields at the time of profile scan job execution are
   * included, except for ones listed in `exclude_fields`.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields include_fields = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The includeFields.
   */
  com.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields getIncludeFields();
  /**
   * <pre>
   * Optional. The fields to include in data profile.
   *
   * If not specified, all fields at the time of profile scan job execution are
   * included, except for ones listed in `exclude_fields`.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields include_fields = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataplex.v1.DataProfileSpec.SelectedFieldsOrBuilder getIncludeFieldsOrBuilder();

  /**
   * <pre>
   * Optional. The fields to exclude from data profile.
   *
   * If specified, the fields will be excluded from data profile, regardless of
   * `include_fields` value.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields exclude_fields = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the excludeFields field is set.
   */
  boolean hasExcludeFields();
  /**
   * <pre>
   * Optional. The fields to exclude from data profile.
   *
   * If specified, the fields will be excluded from data profile, regardless of
   * `include_fields` value.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields exclude_fields = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The excludeFields.
   */
  com.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields getExcludeFields();
  /**
   * <pre>
   * Optional. The fields to exclude from data profile.
   *
   * If specified, the fields will be excluded from data profile, regardless of
   * `include_fields` value.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.DataProfileSpec.SelectedFields exclude_fields = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataplex.v1.DataProfileSpec.SelectedFieldsOrBuilder getExcludeFieldsOrBuilder();
}
