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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface PrivateEnvironmentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.PrivateEnvironmentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. If `true`, a Private IP Cloud Composer environment is created.
   * If this field is set to true, `IPAllocationPolicy.use_ip_aliases` must be
   * set to true for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>bool enable_private_environment = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enablePrivateEnvironment.
   */
  boolean getEnablePrivateEnvironment();

  /**
   *
   *
   * <pre>
   * Optional. If `true`, builds performed during operations that install Python
   * packages have only private connectivity to Google services (including
   * Artifact Registry) and VPC network (if either `NodeConfig.network` and
   * `NodeConfig.subnetwork` fields or `NodeConfig.composer_network_attachment`
   * field are specified). If `false`, the builds also have access to the
   * internet.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-3.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>bool enable_private_builds_only = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enablePrivateBuildsOnly.
   */
  boolean getEnablePrivateBuildsOnly();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the private GKE cluster for a Private IP
   * Cloud Composer environment.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig private_cluster_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the privateClusterConfig field is set.
   */
  boolean hasPrivateClusterConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the private GKE cluster for a Private IP
   * Cloud Composer environment.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig private_cluster_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The privateClusterConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig
      getPrivateClusterConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the private GKE cluster for a Private IP
   * Cloud Composer environment.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfig private_cluster_config = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.PrivateClusterConfigOrBuilder
      getPrivateClusterConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IP range for web server will be
   * reserved. Needs to be disjoint from
   * private_cluster_config.master_ipv4_cidr_block and
   * cloud_sql_ipv4_cidr_block.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string web_server_ipv4_cidr_block = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The webServerIpv4CidrBlock.
   */
  java.lang.String getWebServerIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IP range for web server will be
   * reserved. Needs to be disjoint from
   * private_cluster_config.master_ipv4_cidr_block and
   * cloud_sql_ipv4_cidr_block.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string web_server_ipv4_cidr_block = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for webServerIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getWebServerIpv4CidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IP range in tenant project will be
   * reserved for Cloud SQL. Needs to be disjoint from
   * web_server_ipv4_cidr_block
   * </pre>
   *
   * <code>string cloud_sql_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The cloudSqlIpv4CidrBlock.
   */
  java.lang.String getCloudSqlIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IP range in tenant project will be
   * reserved for Cloud SQL. Needs to be disjoint from
   * web_server_ipv4_cidr_block
   * </pre>
   *
   * <code>string cloud_sql_ipv4_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for cloudSqlIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getCloudSqlIpv4CidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Output only. The IP range reserved for the tenant project's App Engine VMs.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string web_server_ipv4_reserved_range = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The webServerIpv4ReservedRange.
   */
  java.lang.String getWebServerIpv4ReservedRange();
  /**
   *
   *
   * <pre>
   * Output only. The IP range reserved for the tenant project's App Engine VMs.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string web_server_ipv4_reserved_range = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for webServerIpv4ReservedRange.
   */
  com.google.protobuf.ByteString getWebServerIpv4ReservedRangeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IP range for Cloud Composer Network in
   * tenant project will be reserved. Needs to be disjoint from
   * private_cluster_config.master_ipv4_cidr_block and
   * cloud_sql_ipv4_cidr_block.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * string cloud_composer_network_ipv4_cidr_block = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudComposerNetworkIpv4CidrBlock.
   */
  java.lang.String getCloudComposerNetworkIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The CIDR block from which IP range for Cloud Composer Network in
   * tenant project will be reserved. Needs to be disjoint from
   * private_cluster_config.master_ipv4_cidr_block and
   * cloud_sql_ipv4_cidr_block.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * string cloud_composer_network_ipv4_cidr_block = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for cloudComposerNetworkIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getCloudComposerNetworkIpv4CidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Output only. The IP range reserved for the tenant project's Cloud Composer
   * network.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * string cloud_composer_network_ipv4_reserved_range = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The cloudComposerNetworkIpv4ReservedRange.
   */
  java.lang.String getCloudComposerNetworkIpv4ReservedRange();
  /**
   *
   *
   * <pre>
   * Output only. The IP range reserved for the tenant project's Cloud Composer
   * network.
   *
   * This field is supported for Cloud Composer environments in versions
   * composer-2.*.*-airflow-*.*.* and newer.
   * </pre>
   *
   * <code>
   * string cloud_composer_network_ipv4_reserved_range = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for cloudComposerNetworkIpv4ReservedRange.
   */
  com.google.protobuf.ByteString getCloudComposerNetworkIpv4ReservedRangeBytes();

  /**
   *
   *
   * <pre>
   * Optional. When enabled, IPs from public (non-RFC1918) ranges can be used
   * for `IPAllocationPolicy.cluster_ipv4_cidr_block` and
   * `IPAllocationPolicy.service_ipv4_cidr_block`.
   * </pre>
   *
   * <code>bool enable_privately_used_public_ips = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enablePrivatelyUsedPublicIps.
   */
  boolean getEnablePrivatelyUsedPublicIps();

  /**
   *
   *
   * <pre>
   * Optional. When specified, the environment will use Private Service Connect
   * instead of VPC peerings to connect to Cloud SQL in the Tenant Project,
   * and the PSC endpoint in the Customer Project will use an IP address from
   * this subnetwork.
   * </pre>
   *
   * <code>
   * string cloud_composer_connection_subnetwork = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudComposerConnectionSubnetwork.
   */
  java.lang.String getCloudComposerConnectionSubnetwork();
  /**
   *
   *
   * <pre>
   * Optional. When specified, the environment will use Private Service Connect
   * instead of VPC peerings to connect to Cloud SQL in the Tenant Project,
   * and the PSC endpoint in the Customer Project will use an IP address from
   * this subnetwork.
   * </pre>
   *
   * <code>
   * string cloud_composer_connection_subnetwork = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The bytes for cloudComposerConnectionSubnetwork.
   */
  com.google.protobuf.ByteString getCloudComposerConnectionSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the network connections configuration in the
   * environment.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.NetworkingConfig networking_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the networkingConfig field is set.
   */
  boolean hasNetworkingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the network connections configuration in the
   * environment.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.NetworkingConfig networking_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The networkingConfig.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.NetworkingConfig getNetworkingConfig();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the network connections configuration in the
   * environment.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1beta1.NetworkingConfig networking_config = 10 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.NetworkingConfigOrBuilder
      getNetworkingConfigOrBuilder();
}
