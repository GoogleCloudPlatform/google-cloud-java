// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface QuotaExceededInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.QuotaExceededInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The map holding related quota dimensions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 414334925;</code>
   */
  int getDimensionsCount();
  /**
   * <pre>
   * The map holding related quota dimensions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 414334925;</code>
   */
  boolean containsDimensions(
      java.lang.String key);
  /**
   * Use {@link #getDimensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDimensions();
  /**
   * <pre>
   * The map holding related quota dimensions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 414334925;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDimensionsMap();
  /**
   * <pre>
   * The map holding related quota dimensions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 414334925;</code>
   */
  /* nullable */
java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * The map holding related quota dimensions.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 414334925;</code>
   */
  java.lang.String getDimensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Future quota limit being rolled out. The limit's unit depends on the quota type or metric.
   * </pre>
   *
   * <code>optional double future_limit = 456564287;</code>
   * @return Whether the futureLimit field is set.
   */
  boolean hasFutureLimit();
  /**
   * <pre>
   * Future quota limit being rolled out. The limit's unit depends on the quota type or metric.
   * </pre>
   *
   * <code>optional double future_limit = 456564287;</code>
   * @return The futureLimit.
   */
  double getFutureLimit();

  /**
   * <pre>
   * Current effective quota limit. The limit's unit depends on the quota type or metric.
   * </pre>
   *
   * <code>optional double limit = 102976443;</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * Current effective quota limit. The limit's unit depends on the quota type or metric.
   * </pre>
   *
   * <code>optional double limit = 102976443;</code>
   * @return The limit.
   */
  double getLimit();

  /**
   * <pre>
   * The name of the quota limit.
   * </pre>
   *
   * <code>optional string limit_name = 398197903;</code>
   * @return Whether the limitName field is set.
   */
  boolean hasLimitName();
  /**
   * <pre>
   * The name of the quota limit.
   * </pre>
   *
   * <code>optional string limit_name = 398197903;</code>
   * @return The limitName.
   */
  java.lang.String getLimitName();
  /**
   * <pre>
   * The name of the quota limit.
   * </pre>
   *
   * <code>optional string limit_name = 398197903;</code>
   * @return The bytes for limitName.
   */
  com.google.protobuf.ByteString
      getLimitNameBytes();

  /**
   * <pre>
   * The Compute Engine quota metric name.
   * </pre>
   *
   * <code>optional string metric_name = 409881530;</code>
   * @return Whether the metricName field is set.
   */
  boolean hasMetricName();
  /**
   * <pre>
   * The Compute Engine quota metric name.
   * </pre>
   *
   * <code>optional string metric_name = 409881530;</code>
   * @return The metricName.
   */
  java.lang.String getMetricName();
  /**
   * <pre>
   * The Compute Engine quota metric name.
   * </pre>
   *
   * <code>optional string metric_name = 409881530;</code>
   * @return The bytes for metricName.
   */
  com.google.protobuf.ByteString
      getMetricNameBytes();

  /**
   * <pre>
   * Rollout status of the future quota limit.
   * Check the RolloutStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string rollout_status = 476426816;</code>
   * @return Whether the rolloutStatus field is set.
   */
  boolean hasRolloutStatus();
  /**
   * <pre>
   * Rollout status of the future quota limit.
   * Check the RolloutStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string rollout_status = 476426816;</code>
   * @return The rolloutStatus.
   */
  java.lang.String getRolloutStatus();
  /**
   * <pre>
   * Rollout status of the future quota limit.
   * Check the RolloutStatus enum for the list of possible values.
   * </pre>
   *
   * <code>optional string rollout_status = 476426816;</code>
   * @return The bytes for rolloutStatus.
   */
  com.google.protobuf.ByteString
      getRolloutStatusBytes();
}
