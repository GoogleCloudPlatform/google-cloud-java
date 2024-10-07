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
// source: google/api/serviceusage/v1beta1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.api.serviceusage.v1beta1;

public interface AdminQuotaPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.AdminQuotaPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the policy.
   * This name is generated by the server when the policy is created.
   *
   * Example names would be:
   * `organizations/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminQuotaPolicies/4a3f2c1d`
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
   * The resource name of the policy.
   * This name is generated by the server when the policy is created.
   *
   * Example names would be:
   * `organizations/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminQuotaPolicies/4a3f2c1d`
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
   * The quota policy value.
   * Can be any nonnegative integer, or -1 (unlimited quota).
   * </pre>
   *
   * <code>int64 policy_value = 2;</code>
   *
   * @return The policyValue.
   */
  long getPolicyValue();

  /**
   *
   *
   * <pre>
   *
   * If this map is nonempty, then this policy applies only to specific values
   * for dimensions defined in the limit unit.
   *
   * For example, a policy on a limit with the unit `1/{project}/{region}`
   * could contain an entry with the key `region` and the value `us-east-1`;
   * the policy is only applied to quota consumed in that region.
   *
   * This map has the following restrictions:
   *
   * *   If `region` appears as a key, its value must be a valid Cloud region.
   * *   If `zone` appears as a key, its value must be a valid Cloud zone.
   * *   Keys other than `region` or `zone` are not valid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  int getDimensionsCount();
  /**
   *
   *
   * <pre>
   *
   * If this map is nonempty, then this policy applies only to specific values
   * for dimensions defined in the limit unit.
   *
   * For example, a policy on a limit with the unit `1/{project}/{region}`
   * could contain an entry with the key `region` and the value `us-east-1`;
   * the policy is only applied to quota consumed in that region.
   *
   * This map has the following restrictions:
   *
   * *   If `region` appears as a key, its value must be a valid Cloud region.
   * *   If `zone` appears as a key, its value must be a valid Cloud zone.
   * *   Keys other than `region` or `zone` are not valid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  boolean containsDimensions(java.lang.String key);
  /** Use {@link #getDimensionsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getDimensions();
  /**
   *
   *
   * <pre>
   *
   * If this map is nonempty, then this policy applies only to specific values
   * for dimensions defined in the limit unit.
   *
   * For example, a policy on a limit with the unit `1/{project}/{region}`
   * could contain an entry with the key `region` and the value `us-east-1`;
   * the policy is only applied to quota consumed in that region.
   *
   * This map has the following restrictions:
   *
   * *   If `region` appears as a key, its value must be a valid Cloud region.
   * *   If `zone` appears as a key, its value must be a valid Cloud zone.
   * *   Keys other than `region` or `zone` are not valid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getDimensionsMap();
  /**
   *
   *
   * <pre>
   *
   * If this map is nonempty, then this policy applies only to specific values
   * for dimensions defined in the limit unit.
   *
   * For example, a policy on a limit with the unit `1/{project}/{region}`
   * could contain an entry with the key `region` and the value `us-east-1`;
   * the policy is only applied to quota consumed in that region.
   *
   * This map has the following restrictions:
   *
   * *   If `region` appears as a key, its value must be a valid Cloud region.
   * *   If `zone` appears as a key, its value must be a valid Cloud zone.
   * *   Keys other than `region` or `zone` are not valid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  /* nullable */
  java.lang.String getDimensionsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   *
   * If this map is nonempty, then this policy applies only to specific values
   * for dimensions defined in the limit unit.
   *
   * For example, a policy on a limit with the unit `1/{project}/{region}`
   * could contain an entry with the key `region` and the value `us-east-1`;
   * the policy is only applied to quota consumed in that region.
   *
   * This map has the following restrictions:
   *
   * *   If `region` appears as a key, its value must be a valid Cloud region.
   * *   If `zone` appears as a key, its value must be a valid Cloud zone.
   * *   Keys other than `region` or `zone` are not valid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; dimensions = 3;</code>
   */
  java.lang.String getDimensionsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The name of the metric to which this policy applies.
   *
   * An example name would be:
   * `compute.googleapis.com/cpus`
   * </pre>
   *
   * <code>string metric = 4;</code>
   *
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   *
   *
   * <pre>
   * The name of the metric to which this policy applies.
   *
   * An example name would be:
   * `compute.googleapis.com/cpus`
   * </pre>
   *
   * <code>string metric = 4;</code>
   *
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString getMetricBytes();

  /**
   *
   *
   * <pre>
   * The limit unit of the limit to which this policy applies.
   *
   * An example unit would be:
   * `1/{project}/{region}`
   * Note that `{project}` and `{region}` are not placeholders in this example;
   * the literal characters `{` and `}` occur in the string.
   * </pre>
   *
   * <code>string unit = 5;</code>
   *
   * @return The unit.
   */
  java.lang.String getUnit();
  /**
   *
   *
   * <pre>
   * The limit unit of the limit to which this policy applies.
   *
   * An example unit would be:
   * `1/{project}/{region}`
   * Note that `{project}` and `{region}` are not placeholders in this example;
   * the literal characters `{` and `}` occur in the string.
   * </pre>
   *
   * <code>string unit = 5;</code>
   *
   * @return The bytes for unit.
   */
  com.google.protobuf.ByteString getUnitBytes();

  /**
   *
   *
   * <pre>
   * The cloud resource container at which the quota policy is created. The
   * format is `{container_type}/{container_number}`
   * </pre>
   *
   * <code>string container = 6;</code>
   *
   * @return The container.
   */
  java.lang.String getContainer();
  /**
   *
   *
   * <pre>
   * The cloud resource container at which the quota policy is created. The
   * format is `{container_type}/{container_number}`
   * </pre>
   *
   * <code>string container = 6;</code>
   *
   * @return The bytes for container.
   */
  com.google.protobuf.ByteString getContainerBytes();
}
