// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1beta1;

public interface ModelDeploymentMonitoringBigQueryTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The source of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
   * @return The enum numeric value on the wire for logSource.
   */
  int getLogSourceValue();
  /**
   * <pre>
   * The source of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable.LogSource log_source = 1;</code>
   * @return The logSource.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable.LogSource getLogSource();

  /**
   * <pre>
   * The type of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
   * @return The enum numeric value on the wire for logType.
   */
  int getLogTypeValue();
  /**
   * <pre>
   * The type of log.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable.LogType log_type = 2;</code>
   * @return The logType.
   */
  com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringBigQueryTable.LogType getLogType();

  /**
   * <pre>
   * The created BigQuery table to store logs. Customer could do their own query
   * &amp; analysis. Format:
   * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
   * </pre>
   *
   * <code>string bigquery_table_path = 3;</code>
   * @return The bigqueryTablePath.
   */
  java.lang.String getBigqueryTablePath();
  /**
   * <pre>
   * The created BigQuery table to store logs. Customer could do their own query
   * &amp; analysis. Format:
   * `bq://&lt;project_id&gt;.model_deployment_monitoring_&lt;endpoint_id&gt;.&lt;tolower(log_source)&gt;_&lt;tolower(log_type)&gt;`
   * </pre>
   *
   * <code>string bigquery_table_path = 3;</code>
   * @return The bytes for bigqueryTablePath.
   */
  com.google.protobuf.ByteString
      getBigqueryTablePathBytes();

  /**
   * <pre>
   * Output only. The schema version of the request/response logging BigQuery
   * table. Default to v1 if unset.
   * </pre>
   *
   * <code>string request_response_logging_schema_version = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The requestResponseLoggingSchemaVersion.
   */
  java.lang.String getRequestResponseLoggingSchemaVersion();
  /**
   * <pre>
   * Output only. The schema version of the request/response logging BigQuery
   * table. Default to v1 if unset.
   * </pre>
   *
   * <code>string request_response_logging_schema_version = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for requestResponseLoggingSchemaVersion.
   */
  com.google.protobuf.ByteString
      getRequestResponseLoggingSchemaVersionBytes();
}
