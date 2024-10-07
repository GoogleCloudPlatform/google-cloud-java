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
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.telcoautomation.v1;

public interface FullManagementConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.FullManagementConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the VPC Network to put the GKE cluster and nodes in. The
   * VPC will be created if it doesn't exist.
   * </pre>
   *
   * <code>string network = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Optional. Name of the VPC Network to put the GKE cluster and nodes in. The
   * VPC will be created if it doesn't exist.
   * </pre>
   *
   * <code>string network = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the subnet that the interface will be part of. Network
   * key must be specified and the subnet must be a subnetwork of the specified
   * network.
   * </pre>
   *
   * <code>string subnet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The subnet.
   */
  java.lang.String getSubnet();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the subnet that the interface will be part of. Network
   * key must be specified and the subnet must be a subnetwork of the specified
   * network.
   * </pre>
   *
   * <code>string subnet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for subnet.
   */
  com.google.protobuf.ByteString getSubnetBytes();

  /**
   *
   *
   * <pre>
   * Optional. The /28 network that the masters will use.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The masterIpv4CidrBlock.
   */
  java.lang.String getMasterIpv4CidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The /28 network that the masters will use.
   * </pre>
   *
   * <code>string master_ipv4_cidr_block = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for masterIpv4CidrBlock.
   */
  com.google.protobuf.ByteString getMasterIpv4CidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Optional. The IP address range for the cluster pod IPs. Set to blank to
   * have a range chosen with the default size. Set to /netmask (e.g. /14) to
   * have a range chosen with a specific netmask. Set to a CIDR notation
   * (e.g. 10.96.0.0/14) from the RFC-1918 private networks (e.g. 10.0.0.0/8,
   * 172.16.0.0/12, 192.168.0.0/16) to pick a specific range to use.
   * </pre>
   *
   * <code>string cluster_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The clusterCidrBlock.
   */
  java.lang.String getClusterCidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The IP address range for the cluster pod IPs. Set to blank to
   * have a range chosen with the default size. Set to /netmask (e.g. /14) to
   * have a range chosen with a specific netmask. Set to a CIDR notation
   * (e.g. 10.96.0.0/14) from the RFC-1918 private networks (e.g. 10.0.0.0/8,
   * 172.16.0.0/12, 192.168.0.0/16) to pick a specific range to use.
   * </pre>
   *
   * <code>string cluster_cidr_block = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for clusterCidrBlock.
   */
  com.google.protobuf.ByteString getClusterCidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Optional. The IP address range for the cluster service IPs. Set to blank to
   * have a range chosen with the default size. Set to /netmask (e.g. /14) to
   * have a range chosen with a specific netmask. Set to a CIDR notation (e.g.
   * 10.96.0.0/14) from the RFC-1918 private networks (e.g. 10.0.0.0/8,
   * 172.16.0.0/12, 192.168.0.0/16) to pick a specific range to use.
   * </pre>
   *
   * <code>string services_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The servicesCidrBlock.
   */
  java.lang.String getServicesCidrBlock();
  /**
   *
   *
   * <pre>
   * Optional. The IP address range for the cluster service IPs. Set to blank to
   * have a range chosen with the default size. Set to /netmask (e.g. /14) to
   * have a range chosen with a specific netmask. Set to a CIDR notation (e.g.
   * 10.96.0.0/14) from the RFC-1918 private networks (e.g. 10.0.0.0/8,
   * 172.16.0.0/12, 192.168.0.0/16) to pick a specific range to use.
   * </pre>
   *
   * <code>string services_cidr_block = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for servicesCidrBlock.
   */
  com.google.protobuf.ByteString getServicesCidrBlockBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the existing secondary range in the cluster's
   * subnetwork to use for pod IP addresses. Alternatively, cluster_cidr_block
   * can be used to automatically create a GKE-managed one.
   * </pre>
   *
   * <code>string cluster_named_range = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The clusterNamedRange.
   */
  java.lang.String getClusterNamedRange();
  /**
   *
   *
   * <pre>
   * Optional. The name of the existing secondary range in the cluster's
   * subnetwork to use for pod IP addresses. Alternatively, cluster_cidr_block
   * can be used to automatically create a GKE-managed one.
   * </pre>
   *
   * <code>string cluster_named_range = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for clusterNamedRange.
   */
  com.google.protobuf.ByteString getClusterNamedRangeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The name of the existing secondary range in the cluster's
   * subnetwork to use for service ClusterIPs. Alternatively,
   * services_cidr_block can be used to automatically create a GKE-managed one.
   * </pre>
   *
   * <code>string services_named_range = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The servicesNamedRange.
   */
  java.lang.String getServicesNamedRange();
  /**
   *
   *
   * <pre>
   * Optional. The name of the existing secondary range in the cluster's
   * subnetwork to use for service ClusterIPs. Alternatively,
   * services_cidr_block can be used to automatically create a GKE-managed one.
   * </pre>
   *
   * <code>string services_named_range = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for servicesNamedRange.
   */
  com.google.protobuf.ByteString getServicesNamedRangeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Master Authorized Network that supports multiple CIDR blocks.
   * Allows access to the k8s master from multiple blocks. It cannot be set at
   * the same time with the field man_block.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1.MasterAuthorizedNetworksConfig master_authorized_networks_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the masterAuthorizedNetworksConfig field is set.
   */
  boolean hasMasterAuthorizedNetworksConfig();
  /**
   *
   *
   * <pre>
   * Optional. Master Authorized Network that supports multiple CIDR blocks.
   * Allows access to the k8s master from multiple blocks. It cannot be set at
   * the same time with the field man_block.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1.MasterAuthorizedNetworksConfig master_authorized_networks_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The masterAuthorizedNetworksConfig.
   */
  com.google.cloud.telcoautomation.v1.MasterAuthorizedNetworksConfig
      getMasterAuthorizedNetworksConfig();
  /**
   *
   *
   * <pre>
   * Optional. Master Authorized Network that supports multiple CIDR blocks.
   * Allows access to the k8s master from multiple blocks. It cannot be set at
   * the same time with the field man_block.
   * </pre>
   *
   * <code>
   * .google.cloud.telcoautomation.v1.MasterAuthorizedNetworksConfig master_authorized_networks_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.telcoautomation.v1.MasterAuthorizedNetworksConfigOrBuilder
      getMasterAuthorizedNetworksConfigOrBuilder();
}
