// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface ResourceUsageExportConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ResourceUsageExportConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration to use BigQuery as usage export destination.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig.BigQueryDestination bigquery_destination = 1;</code>
   * @return Whether the bigqueryDestination field is set.
   */
  boolean hasBigqueryDestination();
  /**
   * <pre>
   * Configuration to use BigQuery as usage export destination.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig.BigQueryDestination bigquery_destination = 1;</code>
   * @return The bigqueryDestination.
   */
  com.google.container.v1.ResourceUsageExportConfig.BigQueryDestination getBigqueryDestination();
  /**
   * <pre>
   * Configuration to use BigQuery as usage export destination.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig.BigQueryDestination bigquery_destination = 1;</code>
   */
  com.google.container.v1.ResourceUsageExportConfig.BigQueryDestinationOrBuilder getBigqueryDestinationOrBuilder();

  /**
   * <pre>
   * Whether to enable network egress metering for this cluster. If enabled, a
   * daemonset will be created in the cluster to meter network egress traffic.
   * </pre>
   *
   * <code>bool enable_network_egress_metering = 2;</code>
   * @return The enableNetworkEgressMetering.
   */
  boolean getEnableNetworkEgressMetering();

  /**
   * <pre>
   * Configuration to enable resource consumption metering.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig.ConsumptionMeteringConfig consumption_metering_config = 3;</code>
   * @return Whether the consumptionMeteringConfig field is set.
   */
  boolean hasConsumptionMeteringConfig();
  /**
   * <pre>
   * Configuration to enable resource consumption metering.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig.ConsumptionMeteringConfig consumption_metering_config = 3;</code>
   * @return The consumptionMeteringConfig.
   */
  com.google.container.v1.ResourceUsageExportConfig.ConsumptionMeteringConfig getConsumptionMeteringConfig();
  /**
   * <pre>
   * Configuration to enable resource consumption metering.
   * </pre>
   *
   * <code>.google.container.v1.ResourceUsageExportConfig.ConsumptionMeteringConfig consumption_metering_config = 3;</code>
   */
  com.google.container.v1.ResourceUsageExportConfig.ConsumptionMeteringConfigOrBuilder getConsumptionMeteringConfigOrBuilder();
}
