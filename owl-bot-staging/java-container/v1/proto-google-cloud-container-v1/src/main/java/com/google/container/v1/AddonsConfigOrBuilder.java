// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface AddonsConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AddonsConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>.google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   * @return Whether the httpLoadBalancing field is set.
   */
  boolean hasHttpLoadBalancing();
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>.google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   * @return The httpLoadBalancing.
   */
  com.google.container.v1.HttpLoadBalancing getHttpLoadBalancing();
  /**
   * <pre>
   * Configuration for the HTTP (L7) load balancing controller addon, which
   * makes it easy to set up HTTP load balancers for services in a cluster.
   * </pre>
   *
   * <code>.google.container.v1.HttpLoadBalancing http_load_balancing = 1;</code>
   */
  com.google.container.v1.HttpLoadBalancingOrBuilder getHttpLoadBalancingOrBuilder();

  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>.google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   * @return Whether the horizontalPodAutoscaling field is set.
   */
  boolean hasHorizontalPodAutoscaling();
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>.google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   * @return The horizontalPodAutoscaling.
   */
  com.google.container.v1.HorizontalPodAutoscaling getHorizontalPodAutoscaling();
  /**
   * <pre>
   * Configuration for the horizontal pod autoscaling feature, which
   * increases or decreases the number of replica pods a replication controller
   * has based on the resource usage of the existing pods.
   * </pre>
   *
   * <code>.google.container.v1.HorizontalPodAutoscaling horizontal_pod_autoscaling = 2;</code>
   */
  com.google.container.v1.HorizontalPodAutoscalingOrBuilder getHorizontalPodAutoscalingOrBuilder();

  /**
   * <pre>
   * Configuration for the Kubernetes Dashboard.
   * This addon is deprecated, and will be disabled in 1.15. It is recommended
   * to use the Cloud Console to manage and monitor your Kubernetes clusters,
   * workloads and applications. For more information, see:
   * https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
   * </pre>
   *
   * <code>.google.container.v1.KubernetesDashboard kubernetes_dashboard = 3 [deprecated = true];</code>
   * @deprecated google.container.v1.AddonsConfig.kubernetes_dashboard is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1196
   * @return Whether the kubernetesDashboard field is set.
   */
  @java.lang.Deprecated boolean hasKubernetesDashboard();
  /**
   * <pre>
   * Configuration for the Kubernetes Dashboard.
   * This addon is deprecated, and will be disabled in 1.15. It is recommended
   * to use the Cloud Console to manage and monitor your Kubernetes clusters,
   * workloads and applications. For more information, see:
   * https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
   * </pre>
   *
   * <code>.google.container.v1.KubernetesDashboard kubernetes_dashboard = 3 [deprecated = true];</code>
   * @deprecated google.container.v1.AddonsConfig.kubernetes_dashboard is deprecated.
   *     See google/container/v1/cluster_service.proto;l=1196
   * @return The kubernetesDashboard.
   */
  @java.lang.Deprecated com.google.container.v1.KubernetesDashboard getKubernetesDashboard();
  /**
   * <pre>
   * Configuration for the Kubernetes Dashboard.
   * This addon is deprecated, and will be disabled in 1.15. It is recommended
   * to use the Cloud Console to manage and monitor your Kubernetes clusters,
   * workloads and applications. For more information, see:
   * https://cloud.google.com/kubernetes-engine/docs/concepts/dashboards
   * </pre>
   *
   * <code>.google.container.v1.KubernetesDashboard kubernetes_dashboard = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.container.v1.KubernetesDashboardOrBuilder getKubernetesDashboardOrBuilder();

  /**
   * <pre>
   * Configuration for NetworkPolicy. This only tracks whether the addon
   * is enabled or not on the Master, it does not track whether network policy
   * is enabled for the nodes.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicyConfig network_policy_config = 4;</code>
   * @return Whether the networkPolicyConfig field is set.
   */
  boolean hasNetworkPolicyConfig();
  /**
   * <pre>
   * Configuration for NetworkPolicy. This only tracks whether the addon
   * is enabled or not on the Master, it does not track whether network policy
   * is enabled for the nodes.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicyConfig network_policy_config = 4;</code>
   * @return The networkPolicyConfig.
   */
  com.google.container.v1.NetworkPolicyConfig getNetworkPolicyConfig();
  /**
   * <pre>
   * Configuration for NetworkPolicy. This only tracks whether the addon
   * is enabled or not on the Master, it does not track whether network policy
   * is enabled for the nodes.
   * </pre>
   *
   * <code>.google.container.v1.NetworkPolicyConfig network_policy_config = 4;</code>
   */
  com.google.container.v1.NetworkPolicyConfigOrBuilder getNetworkPolicyConfigOrBuilder();

  /**
   * <pre>
   * Configuration for the Cloud Run addon, which allows the user to use a
   * managed Knative service.
   * </pre>
   *
   * <code>.google.container.v1.CloudRunConfig cloud_run_config = 7;</code>
   * @return Whether the cloudRunConfig field is set.
   */
  boolean hasCloudRunConfig();
  /**
   * <pre>
   * Configuration for the Cloud Run addon, which allows the user to use a
   * managed Knative service.
   * </pre>
   *
   * <code>.google.container.v1.CloudRunConfig cloud_run_config = 7;</code>
   * @return The cloudRunConfig.
   */
  com.google.container.v1.CloudRunConfig getCloudRunConfig();
  /**
   * <pre>
   * Configuration for the Cloud Run addon, which allows the user to use a
   * managed Knative service.
   * </pre>
   *
   * <code>.google.container.v1.CloudRunConfig cloud_run_config = 7;</code>
   */
  com.google.container.v1.CloudRunConfigOrBuilder getCloudRunConfigOrBuilder();

  /**
   * <pre>
   * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
   * </pre>
   *
   * <code>.google.container.v1.DnsCacheConfig dns_cache_config = 8;</code>
   * @return Whether the dnsCacheConfig field is set.
   */
  boolean hasDnsCacheConfig();
  /**
   * <pre>
   * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
   * </pre>
   *
   * <code>.google.container.v1.DnsCacheConfig dns_cache_config = 8;</code>
   * @return The dnsCacheConfig.
   */
  com.google.container.v1.DnsCacheConfig getDnsCacheConfig();
  /**
   * <pre>
   * Configuration for NodeLocalDNS, a dns cache running on cluster nodes
   * </pre>
   *
   * <code>.google.container.v1.DnsCacheConfig dns_cache_config = 8;</code>
   */
  com.google.container.v1.DnsCacheConfigOrBuilder getDnsCacheConfigOrBuilder();

  /**
   * <pre>
   * Configuration for the ConfigConnector add-on, a Kubernetes
   * extension to manage hosted GCP services through the Kubernetes API
   * </pre>
   *
   * <code>.google.container.v1.ConfigConnectorConfig config_connector_config = 10;</code>
   * @return Whether the configConnectorConfig field is set.
   */
  boolean hasConfigConnectorConfig();
  /**
   * <pre>
   * Configuration for the ConfigConnector add-on, a Kubernetes
   * extension to manage hosted GCP services through the Kubernetes API
   * </pre>
   *
   * <code>.google.container.v1.ConfigConnectorConfig config_connector_config = 10;</code>
   * @return The configConnectorConfig.
   */
  com.google.container.v1.ConfigConnectorConfig getConfigConnectorConfig();
  /**
   * <pre>
   * Configuration for the ConfigConnector add-on, a Kubernetes
   * extension to manage hosted GCP services through the Kubernetes API
   * </pre>
   *
   * <code>.google.container.v1.ConfigConnectorConfig config_connector_config = 10;</code>
   */
  com.google.container.v1.ConfigConnectorConfigOrBuilder getConfigConnectorConfigOrBuilder();

  /**
   * <pre>
   * Configuration for the Compute Engine Persistent Disk CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcePersistentDiskCsiDriverConfig gce_persistent_disk_csi_driver_config = 11;</code>
   * @return Whether the gcePersistentDiskCsiDriverConfig field is set.
   */
  boolean hasGcePersistentDiskCsiDriverConfig();
  /**
   * <pre>
   * Configuration for the Compute Engine Persistent Disk CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcePersistentDiskCsiDriverConfig gce_persistent_disk_csi_driver_config = 11;</code>
   * @return The gcePersistentDiskCsiDriverConfig.
   */
  com.google.container.v1.GcePersistentDiskCsiDriverConfig getGcePersistentDiskCsiDriverConfig();
  /**
   * <pre>
   * Configuration for the Compute Engine Persistent Disk CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcePersistentDiskCsiDriverConfig gce_persistent_disk_csi_driver_config = 11;</code>
   */
  com.google.container.v1.GcePersistentDiskCsiDriverConfigOrBuilder getGcePersistentDiskCsiDriverConfigOrBuilder();

  /**
   * <pre>
   * Configuration for the GCP Filestore CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcpFilestoreCsiDriverConfig gcp_filestore_csi_driver_config = 14;</code>
   * @return Whether the gcpFilestoreCsiDriverConfig field is set.
   */
  boolean hasGcpFilestoreCsiDriverConfig();
  /**
   * <pre>
   * Configuration for the GCP Filestore CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcpFilestoreCsiDriverConfig gcp_filestore_csi_driver_config = 14;</code>
   * @return The gcpFilestoreCsiDriverConfig.
   */
  com.google.container.v1.GcpFilestoreCsiDriverConfig getGcpFilestoreCsiDriverConfig();
  /**
   * <pre>
   * Configuration for the GCP Filestore CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcpFilestoreCsiDriverConfig gcp_filestore_csi_driver_config = 14;</code>
   */
  com.google.container.v1.GcpFilestoreCsiDriverConfigOrBuilder getGcpFilestoreCsiDriverConfigOrBuilder();

  /**
   * <pre>
   * Configuration for the Backup for GKE agent addon.
   * </pre>
   *
   * <code>.google.container.v1.GkeBackupAgentConfig gke_backup_agent_config = 16;</code>
   * @return Whether the gkeBackupAgentConfig field is set.
   */
  boolean hasGkeBackupAgentConfig();
  /**
   * <pre>
   * Configuration for the Backup for GKE agent addon.
   * </pre>
   *
   * <code>.google.container.v1.GkeBackupAgentConfig gke_backup_agent_config = 16;</code>
   * @return The gkeBackupAgentConfig.
   */
  com.google.container.v1.GkeBackupAgentConfig getGkeBackupAgentConfig();
  /**
   * <pre>
   * Configuration for the Backup for GKE agent addon.
   * </pre>
   *
   * <code>.google.container.v1.GkeBackupAgentConfig gke_backup_agent_config = 16;</code>
   */
  com.google.container.v1.GkeBackupAgentConfigOrBuilder getGkeBackupAgentConfigOrBuilder();

  /**
   * <pre>
   * Configuration for the Cloud Storage Fuse CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcsFuseCsiDriverConfig gcs_fuse_csi_driver_config = 17;</code>
   * @return Whether the gcsFuseCsiDriverConfig field is set.
   */
  boolean hasGcsFuseCsiDriverConfig();
  /**
   * <pre>
   * Configuration for the Cloud Storage Fuse CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcsFuseCsiDriverConfig gcs_fuse_csi_driver_config = 17;</code>
   * @return The gcsFuseCsiDriverConfig.
   */
  com.google.container.v1.GcsFuseCsiDriverConfig getGcsFuseCsiDriverConfig();
  /**
   * <pre>
   * Configuration for the Cloud Storage Fuse CSI driver.
   * </pre>
   *
   * <code>.google.container.v1.GcsFuseCsiDriverConfig gcs_fuse_csi_driver_config = 17;</code>
   */
  com.google.container.v1.GcsFuseCsiDriverConfigOrBuilder getGcsFuseCsiDriverConfigOrBuilder();
}
