// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface NodeNetworkConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeNetworkConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Input only. Whether to create a new range for pod IPs in this node pool.
   * Defaults are provided for `pod_range` and `pod_ipv4_cidr_block` if they
   * are not specified.
   *
   * If neither `create_pod_range` or `pod_range` are specified, the
   * cluster-level default (`ip_allocation_policy.cluster_ipv4_cidr_block`) is
   * used.
   *
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   *
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>bool create_pod_range = 4 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   * @return The createPodRange.
   */
  boolean getCreatePodRange();

  /**
   * <pre>
   * The ID of the secondary range for pod IPs.
   * If `create_pod_range` is true, this ID is used for the new range.
   * If `create_pod_range` is false, uses an existing secondary range with this
   * ID.
   *
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   *
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_range = 5;</code>
   * @return The podRange.
   */
  java.lang.String getPodRange();
  /**
   * <pre>
   * The ID of the secondary range for pod IPs.
   * If `create_pod_range` is true, this ID is used for the new range.
   * If `create_pod_range` is false, uses an existing secondary range with this
   * ID.
   *
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   *
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_range = 5;</code>
   * @return The bytes for podRange.
   */
  com.google.protobuf.ByteString
      getPodRangeBytes();

  /**
   * <pre>
   * The IP address range for pod IPs in this node pool.
   *
   * Only applicable if `create_pod_range` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
   *
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   *
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_ipv4_cidr_block = 6;</code>
   * @return The podIpv4CidrBlock.
   */
  java.lang.String getPodIpv4CidrBlock();
  /**
   * <pre>
   * The IP address range for pod IPs in this node pool.
   *
   * Only applicable if `create_pod_range` is true.
   *
   * Set to blank to have a range chosen with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have a range chosen with a specific
   * netmask.
   *
   * Set to a
   * [CIDR](https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
   * notation (e.g. `10.96.0.0/14`) to pick a specific range to use.
   *
   * Only applicable if `ip_allocation_policy.use_ip_aliases` is true.
   *
   * This field cannot be changed after the node pool has been created.
   * </pre>
   *
   * <code>string pod_ipv4_cidr_block = 6;</code>
   * @return The bytes for podIpv4CidrBlock.
   */
  com.google.protobuf.ByteString
      getPodIpv4CidrBlockBytes();

  /**
   * <pre>
   * Whether nodes have internal IP addresses only.
   * If enable_private_nodes is not specified, then the value is derived from
   * [cluster.privateClusterConfig.enablePrivateNodes][google.container.v1beta1.PrivateClusterConfig.enablePrivateNodes]
   * </pre>
   *
   * <code>optional bool enable_private_nodes = 9;</code>
   * @return Whether the enablePrivateNodes field is set.
   */
  boolean hasEnablePrivateNodes();
  /**
   * <pre>
   * Whether nodes have internal IP addresses only.
   * If enable_private_nodes is not specified, then the value is derived from
   * [cluster.privateClusterConfig.enablePrivateNodes][google.container.v1beta1.PrivateClusterConfig.enablePrivateNodes]
   * </pre>
   *
   * <code>optional bool enable_private_nodes = 9;</code>
   * @return The enablePrivateNodes.
   */
  boolean getEnablePrivateNodes();

  /**
   * <pre>
   * Network bandwidth tier configuration.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.NodeNetworkConfig.NetworkPerformanceConfig network_performance_config = 11;</code>
   * @return Whether the networkPerformanceConfig field is set.
   */
  boolean hasNetworkPerformanceConfig();
  /**
   * <pre>
   * Network bandwidth tier configuration.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.NodeNetworkConfig.NetworkPerformanceConfig network_performance_config = 11;</code>
   * @return The networkPerformanceConfig.
   */
  com.google.container.v1beta1.NodeNetworkConfig.NetworkPerformanceConfig getNetworkPerformanceConfig();
  /**
   * <pre>
   * Network bandwidth tier configuration.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.NodeNetworkConfig.NetworkPerformanceConfig network_performance_config = 11;</code>
   */
  com.google.container.v1beta1.NodeNetworkConfig.NetworkPerformanceConfigOrBuilder getNetworkPerformanceConfigOrBuilder();

  /**
   * <pre>
   * [PRIVATE FIELD]
   * Pod CIDR size overprovisioning config for the nodepool.
   *
   * Pod CIDR size per node depends on max_pods_per_node. By default, the value
   * of max_pods_per_node is rounded off to next power of 2 and we then double
   * that to get the size of pod CIDR block per node.
   * Example: max_pods_per_node of 30 would result in 64 IPs (/26).
   *
   * This config can disable the doubling of IPs (we still round off to next
   * power of 2)
   * Example: max_pods_per_node of 30 will result in 32 IPs (/27) when
   * overprovisioning is disabled.
   * </pre>
   *
   * <code>.google.container.v1beta1.PodCIDROverprovisionConfig pod_cidr_overprovision_config = 13;</code>
   * @return Whether the podCidrOverprovisionConfig field is set.
   */
  boolean hasPodCidrOverprovisionConfig();
  /**
   * <pre>
   * [PRIVATE FIELD]
   * Pod CIDR size overprovisioning config for the nodepool.
   *
   * Pod CIDR size per node depends on max_pods_per_node. By default, the value
   * of max_pods_per_node is rounded off to next power of 2 and we then double
   * that to get the size of pod CIDR block per node.
   * Example: max_pods_per_node of 30 would result in 64 IPs (/26).
   *
   * This config can disable the doubling of IPs (we still round off to next
   * power of 2)
   * Example: max_pods_per_node of 30 will result in 32 IPs (/27) when
   * overprovisioning is disabled.
   * </pre>
   *
   * <code>.google.container.v1beta1.PodCIDROverprovisionConfig pod_cidr_overprovision_config = 13;</code>
   * @return The podCidrOverprovisionConfig.
   */
  com.google.container.v1beta1.PodCIDROverprovisionConfig getPodCidrOverprovisionConfig();
  /**
   * <pre>
   * [PRIVATE FIELD]
   * Pod CIDR size overprovisioning config for the nodepool.
   *
   * Pod CIDR size per node depends on max_pods_per_node. By default, the value
   * of max_pods_per_node is rounded off to next power of 2 and we then double
   * that to get the size of pod CIDR block per node.
   * Example: max_pods_per_node of 30 would result in 64 IPs (/26).
   *
   * This config can disable the doubling of IPs (we still round off to next
   * power of 2)
   * Example: max_pods_per_node of 30 will result in 32 IPs (/27) when
   * overprovisioning is disabled.
   * </pre>
   *
   * <code>.google.container.v1beta1.PodCIDROverprovisionConfig pod_cidr_overprovision_config = 13;</code>
   */
  com.google.container.v1beta1.PodCIDROverprovisionConfigOrBuilder getPodCidrOverprovisionConfigOrBuilder();

  /**
   * <pre>
   * We specify the additional node networks for this node pool using this list.
   * Each node network corresponds to an additional interface
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalNodeNetworkConfig additional_node_network_configs = 14;</code>
   */
  java.util.List<com.google.container.v1beta1.AdditionalNodeNetworkConfig> 
      getAdditionalNodeNetworkConfigsList();
  /**
   * <pre>
   * We specify the additional node networks for this node pool using this list.
   * Each node network corresponds to an additional interface
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalNodeNetworkConfig additional_node_network_configs = 14;</code>
   */
  com.google.container.v1beta1.AdditionalNodeNetworkConfig getAdditionalNodeNetworkConfigs(int index);
  /**
   * <pre>
   * We specify the additional node networks for this node pool using this list.
   * Each node network corresponds to an additional interface
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalNodeNetworkConfig additional_node_network_configs = 14;</code>
   */
  int getAdditionalNodeNetworkConfigsCount();
  /**
   * <pre>
   * We specify the additional node networks for this node pool using this list.
   * Each node network corresponds to an additional interface
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalNodeNetworkConfig additional_node_network_configs = 14;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.AdditionalNodeNetworkConfigOrBuilder> 
      getAdditionalNodeNetworkConfigsOrBuilderList();
  /**
   * <pre>
   * We specify the additional node networks for this node pool using this list.
   * Each node network corresponds to an additional interface
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalNodeNetworkConfig additional_node_network_configs = 14;</code>
   */
  com.google.container.v1beta1.AdditionalNodeNetworkConfigOrBuilder getAdditionalNodeNetworkConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * We specify the additional pod networks for this node pool using this list.
   * Each pod network corresponds to an additional alias IP range for the node
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalPodNetworkConfig additional_pod_network_configs = 15;</code>
   */
  java.util.List<com.google.container.v1beta1.AdditionalPodNetworkConfig> 
      getAdditionalPodNetworkConfigsList();
  /**
   * <pre>
   * We specify the additional pod networks for this node pool using this list.
   * Each pod network corresponds to an additional alias IP range for the node
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalPodNetworkConfig additional_pod_network_configs = 15;</code>
   */
  com.google.container.v1beta1.AdditionalPodNetworkConfig getAdditionalPodNetworkConfigs(int index);
  /**
   * <pre>
   * We specify the additional pod networks for this node pool using this list.
   * Each pod network corresponds to an additional alias IP range for the node
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalPodNetworkConfig additional_pod_network_configs = 15;</code>
   */
  int getAdditionalPodNetworkConfigsCount();
  /**
   * <pre>
   * We specify the additional pod networks for this node pool using this list.
   * Each pod network corresponds to an additional alias IP range for the node
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalPodNetworkConfig additional_pod_network_configs = 15;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.AdditionalPodNetworkConfigOrBuilder> 
      getAdditionalPodNetworkConfigsOrBuilderList();
  /**
   * <pre>
   * We specify the additional pod networks for this node pool using this list.
   * Each pod network corresponds to an additional alias IP range for the node
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.AdditionalPodNetworkConfig additional_pod_network_configs = 15;</code>
   */
  com.google.container.v1beta1.AdditionalPodNetworkConfigOrBuilder getAdditionalPodNetworkConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. [Output only] The utilization of the IPv4 range for the pod.
   * The ratio is Usage/[Total number of IPs in the secondary range],
   * Usage=numNodes*numZones*podIPsPerNode.
   * </pre>
   *
   * <code>double pod_ipv4_range_utilization = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The podIpv4RangeUtilization.
   */
  double getPodIpv4RangeUtilization();
}
