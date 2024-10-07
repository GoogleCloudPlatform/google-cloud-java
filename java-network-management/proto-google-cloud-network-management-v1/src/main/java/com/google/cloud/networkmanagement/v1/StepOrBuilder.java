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
// source: google/cloud/networkmanagement/v1/trace.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkmanagement.v1;

public interface StepOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.Step)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A description of the step. Usually this is a summary of the state.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of the step. Usually this is a summary of the state.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Each step is in one of the pre-defined states.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.Step.State state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Each step is in one of the pre-defined states.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.Step.State state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.networkmanagement.v1.Step.State getState();

  /**
   *
   *
   * <pre>
   * This is a step that leads to the final state Drop.
   * </pre>
   *
   * <code>bool causes_drop = 3;</code>
   *
   * @return The causesDrop.
   */
  boolean getCausesDrop();

  /**
   *
   *
   * <pre>
   * Project ID that contains the configuration this step is validating.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project ID that contains the configuration this step is validating.
   * </pre>
   *
   * <code>string project_id = 4;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine instance.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.InstanceInfo instance = 5;</code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine instance.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.InstanceInfo instance = 5;</code>
   *
   * @return The instance.
   */
  com.google.cloud.networkmanagement.v1.InstanceInfo getInstance();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine instance.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.InstanceInfo instance = 5;</code>
   */
  com.google.cloud.networkmanagement.v1.InstanceInfoOrBuilder getInstanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine firewall rule.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.FirewallInfo firewall = 6;</code>
   *
   * @return Whether the firewall field is set.
   */
  boolean hasFirewall();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine firewall rule.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.FirewallInfo firewall = 6;</code>
   *
   * @return The firewall.
   */
  com.google.cloud.networkmanagement.v1.FirewallInfo getFirewall();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine firewall rule.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.FirewallInfo firewall = 6;</code>
   */
  com.google.cloud.networkmanagement.v1.FirewallInfoOrBuilder getFirewallOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine route.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.RouteInfo route = 7;</code>
   *
   * @return Whether the route field is set.
   */
  boolean hasRoute();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine route.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.RouteInfo route = 7;</code>
   *
   * @return The route.
   */
  com.google.cloud.networkmanagement.v1.RouteInfo getRoute();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine route.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.RouteInfo route = 7;</code>
   */
  com.google.cloud.networkmanagement.v1.RouteInfoOrBuilder getRouteOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of the source and destination under analysis.
   * The endpoint information in an intermediate state may differ with the
   * initial input, as it might be modified by state like NAT,
   * or Connection Proxy.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.EndpointInfo endpoint = 8;</code>
   *
   * @return Whether the endpoint field is set.
   */
  boolean hasEndpoint();
  /**
   *
   *
   * <pre>
   * Display information of the source and destination under analysis.
   * The endpoint information in an intermediate state may differ with the
   * initial input, as it might be modified by state like NAT,
   * or Connection Proxy.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.EndpointInfo endpoint = 8;</code>
   *
   * @return The endpoint.
   */
  com.google.cloud.networkmanagement.v1.EndpointInfo getEndpoint();
  /**
   *
   *
   * <pre>
   * Display information of the source and destination under analysis.
   * The endpoint information in an intermediate state may differ with the
   * initial input, as it might be modified by state like NAT,
   * or Connection Proxy.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.EndpointInfo endpoint = 8;</code>
   */
  com.google.cloud.networkmanagement.v1.EndpointInfoOrBuilder getEndpointOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Google service
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.GoogleServiceInfo google_service = 24;</code>
   *
   * @return Whether the googleService field is set.
   */
  boolean hasGoogleService();
  /**
   *
   *
   * <pre>
   * Display information of a Google service
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.GoogleServiceInfo google_service = 24;</code>
   *
   * @return The googleService.
   */
  com.google.cloud.networkmanagement.v1.GoogleServiceInfo getGoogleService();
  /**
   *
   *
   * <pre>
   * Display information of a Google service
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.GoogleServiceInfo google_service = 24;</code>
   */
  com.google.cloud.networkmanagement.v1.GoogleServiceInfoOrBuilder getGoogleServiceOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ForwardingRuleInfo forwarding_rule = 9;</code>
   *
   * @return Whether the forwardingRule field is set.
   */
  boolean hasForwardingRule();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ForwardingRuleInfo forwarding_rule = 9;</code>
   *
   * @return The forwardingRule.
   */
  com.google.cloud.networkmanagement.v1.ForwardingRuleInfo getForwardingRule();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine forwarding rule.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ForwardingRuleInfo forwarding_rule = 9;</code>
   */
  com.google.cloud.networkmanagement.v1.ForwardingRuleInfoOrBuilder getForwardingRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine VPN gateway.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpnGatewayInfo vpn_gateway = 10;</code>
   *
   * @return Whether the vpnGateway field is set.
   */
  boolean hasVpnGateway();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine VPN gateway.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpnGatewayInfo vpn_gateway = 10;</code>
   *
   * @return The vpnGateway.
   */
  com.google.cloud.networkmanagement.v1.VpnGatewayInfo getVpnGateway();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine VPN gateway.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpnGatewayInfo vpn_gateway = 10;</code>
   */
  com.google.cloud.networkmanagement.v1.VpnGatewayInfoOrBuilder getVpnGatewayOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine VPN tunnel.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpnTunnelInfo vpn_tunnel = 11;</code>
   *
   * @return Whether the vpnTunnel field is set.
   */
  boolean hasVpnTunnel();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine VPN tunnel.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpnTunnelInfo vpn_tunnel = 11;</code>
   *
   * @return The vpnTunnel.
   */
  com.google.cloud.networkmanagement.v1.VpnTunnelInfo getVpnTunnel();
  /**
   *
   *
   * <pre>
   * Display information of a Compute Engine VPN tunnel.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpnTunnelInfo vpn_tunnel = 11;</code>
   */
  com.google.cloud.networkmanagement.v1.VpnTunnelInfoOrBuilder getVpnTunnelOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a VPC connector.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpcConnectorInfo vpc_connector = 21;</code>
   *
   * @return Whether the vpcConnector field is set.
   */
  boolean hasVpcConnector();
  /**
   *
   *
   * <pre>
   * Display information of a VPC connector.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpcConnectorInfo vpc_connector = 21;</code>
   *
   * @return The vpcConnector.
   */
  com.google.cloud.networkmanagement.v1.VpcConnectorInfo getVpcConnector();
  /**
   *
   *
   * <pre>
   * Display information of a VPC connector.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.VpcConnectorInfo vpc_connector = 21;</code>
   */
  com.google.cloud.networkmanagement.v1.VpcConnectorInfoOrBuilder getVpcConnectorOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of the final state "deliver" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DeliverInfo deliver = 12;</code>
   *
   * @return Whether the deliver field is set.
   */
  boolean hasDeliver();
  /**
   *
   *
   * <pre>
   * Display information of the final state "deliver" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DeliverInfo deliver = 12;</code>
   *
   * @return The deliver.
   */
  com.google.cloud.networkmanagement.v1.DeliverInfo getDeliver();
  /**
   *
   *
   * <pre>
   * Display information of the final state "deliver" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DeliverInfo deliver = 12;</code>
   */
  com.google.cloud.networkmanagement.v1.DeliverInfoOrBuilder getDeliverOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of the final state "forward" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ForwardInfo forward = 13;</code>
   *
   * @return Whether the forward field is set.
   */
  boolean hasForward();
  /**
   *
   *
   * <pre>
   * Display information of the final state "forward" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ForwardInfo forward = 13;</code>
   *
   * @return The forward.
   */
  com.google.cloud.networkmanagement.v1.ForwardInfo getForward();
  /**
   *
   *
   * <pre>
   * Display information of the final state "forward" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ForwardInfo forward = 13;</code>
   */
  com.google.cloud.networkmanagement.v1.ForwardInfoOrBuilder getForwardOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of the final state "abort" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.AbortInfo abort = 14;</code>
   *
   * @return Whether the abort field is set.
   */
  boolean hasAbort();
  /**
   *
   *
   * <pre>
   * Display information of the final state "abort" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.AbortInfo abort = 14;</code>
   *
   * @return The abort.
   */
  com.google.cloud.networkmanagement.v1.AbortInfo getAbort();
  /**
   *
   *
   * <pre>
   * Display information of the final state "abort" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.AbortInfo abort = 14;</code>
   */
  com.google.cloud.networkmanagement.v1.AbortInfoOrBuilder getAbortOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of the final state "drop" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DropInfo drop = 15;</code>
   *
   * @return Whether the drop field is set.
   */
  boolean hasDrop();
  /**
   *
   *
   * <pre>
   * Display information of the final state "drop" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DropInfo drop = 15;</code>
   *
   * @return The drop.
   */
  com.google.cloud.networkmanagement.v1.DropInfo getDrop();
  /**
   *
   *
   * <pre>
   * Display information of the final state "drop" and reason.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.DropInfo drop = 15;</code>
   */
  com.google.cloud.networkmanagement.v1.DropInfoOrBuilder getDropOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of the load balancers. Deprecated in favor of the
   * `load_balancer_backend_info` field, not used in new tests.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerInfo load_balancer = 16 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.networkmanagement.v1.Step.load_balancer is deprecated. See
   *     google/cloud/networkmanagement/v1/trace.proto;l=241
   * @return Whether the loadBalancer field is set.
   */
  @java.lang.Deprecated
  boolean hasLoadBalancer();
  /**
   *
   *
   * <pre>
   * Display information of the load balancers. Deprecated in favor of the
   * `load_balancer_backend_info` field, not used in new tests.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerInfo load_balancer = 16 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.networkmanagement.v1.Step.load_balancer is deprecated. See
   *     google/cloud/networkmanagement/v1/trace.proto;l=241
   * @return The loadBalancer.
   */
  @java.lang.Deprecated
  com.google.cloud.networkmanagement.v1.LoadBalancerInfo getLoadBalancer();
  /**
   *
   *
   * <pre>
   * Display information of the load balancers. Deprecated in favor of the
   * `load_balancer_backend_info` field, not used in new tests.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerInfo load_balancer = 16 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.networkmanagement.v1.LoadBalancerInfoOrBuilder getLoadBalancerOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Google Cloud network.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.NetworkInfo network = 17;</code>
   *
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   *
   *
   * <pre>
   * Display information of a Google Cloud network.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.NetworkInfo network = 17;</code>
   *
   * @return The network.
   */
  com.google.cloud.networkmanagement.v1.NetworkInfo getNetwork();
  /**
   *
   *
   * <pre>
   * Display information of a Google Cloud network.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.NetworkInfo network = 17;</code>
   */
  com.google.cloud.networkmanagement.v1.NetworkInfoOrBuilder getNetworkOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Google Kubernetes Engine cluster master.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.GKEMasterInfo gke_master = 18;</code>
   *
   * @return Whether the gkeMaster field is set.
   */
  boolean hasGkeMaster();
  /**
   *
   *
   * <pre>
   * Display information of a Google Kubernetes Engine cluster master.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.GKEMasterInfo gke_master = 18;</code>
   *
   * @return The gkeMaster.
   */
  com.google.cloud.networkmanagement.v1.GKEMasterInfo getGkeMaster();
  /**
   *
   *
   * <pre>
   * Display information of a Google Kubernetes Engine cluster master.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.GKEMasterInfo gke_master = 18;</code>
   */
  com.google.cloud.networkmanagement.v1.GKEMasterInfoOrBuilder getGkeMasterOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudSQLInstanceInfo cloud_sql_instance = 19;</code>
   *
   * @return Whether the cloudSqlInstance field is set.
   */
  boolean hasCloudSqlInstance();
  /**
   *
   *
   * <pre>
   * Display information of a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudSQLInstanceInfo cloud_sql_instance = 19;</code>
   *
   * @return The cloudSqlInstance.
   */
  com.google.cloud.networkmanagement.v1.CloudSQLInstanceInfo getCloudSqlInstance();
  /**
   *
   *
   * <pre>
   * Display information of a Cloud SQL instance.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudSQLInstanceInfo cloud_sql_instance = 19;</code>
   */
  com.google.cloud.networkmanagement.v1.CloudSQLInstanceInfoOrBuilder
      getCloudSqlInstanceOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Cloud Function.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudFunctionInfo cloud_function = 20;</code>
   *
   * @return Whether the cloudFunction field is set.
   */
  boolean hasCloudFunction();
  /**
   *
   *
   * <pre>
   * Display information of a Cloud Function.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudFunctionInfo cloud_function = 20;</code>
   *
   * @return The cloudFunction.
   */
  com.google.cloud.networkmanagement.v1.CloudFunctionInfo getCloudFunction();
  /**
   *
   *
   * <pre>
   * Display information of a Cloud Function.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudFunctionInfo cloud_function = 20;</code>
   */
  com.google.cloud.networkmanagement.v1.CloudFunctionInfoOrBuilder getCloudFunctionOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of an App Engine service version.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.AppEngineVersionInfo app_engine_version = 22;</code>
   *
   * @return Whether the appEngineVersion field is set.
   */
  boolean hasAppEngineVersion();
  /**
   *
   *
   * <pre>
   * Display information of an App Engine service version.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.AppEngineVersionInfo app_engine_version = 22;</code>
   *
   * @return The appEngineVersion.
   */
  com.google.cloud.networkmanagement.v1.AppEngineVersionInfo getAppEngineVersion();
  /**
   *
   *
   * <pre>
   * Display information of an App Engine service version.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.AppEngineVersionInfo app_engine_version = 22;</code>
   */
  com.google.cloud.networkmanagement.v1.AppEngineVersionInfoOrBuilder
      getAppEngineVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Cloud Run revision.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudRunRevisionInfo cloud_run_revision = 23;</code>
   *
   * @return Whether the cloudRunRevision field is set.
   */
  boolean hasCloudRunRevision();
  /**
   *
   *
   * <pre>
   * Display information of a Cloud Run revision.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudRunRevisionInfo cloud_run_revision = 23;</code>
   *
   * @return The cloudRunRevision.
   */
  com.google.cloud.networkmanagement.v1.CloudRunRevisionInfo getCloudRunRevision();
  /**
   *
   *
   * <pre>
   * Display information of a Cloud Run revision.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.CloudRunRevisionInfo cloud_run_revision = 23;</code>
   */
  com.google.cloud.networkmanagement.v1.CloudRunRevisionInfoOrBuilder
      getCloudRunRevisionOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a NAT.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.NatInfo nat = 25;</code>
   *
   * @return Whether the nat field is set.
   */
  boolean hasNat();
  /**
   *
   *
   * <pre>
   * Display information of a NAT.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.NatInfo nat = 25;</code>
   *
   * @return The nat.
   */
  com.google.cloud.networkmanagement.v1.NatInfo getNat();
  /**
   *
   *
   * <pre>
   * Display information of a NAT.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.NatInfo nat = 25;</code>
   */
  com.google.cloud.networkmanagement.v1.NatInfoOrBuilder getNatOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a ProxyConnection.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProxyConnectionInfo proxy_connection = 26;</code>
   *
   * @return Whether the proxyConnection field is set.
   */
  boolean hasProxyConnection();
  /**
   *
   *
   * <pre>
   * Display information of a ProxyConnection.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProxyConnectionInfo proxy_connection = 26;</code>
   *
   * @return The proxyConnection.
   */
  com.google.cloud.networkmanagement.v1.ProxyConnectionInfo getProxyConnection();
  /**
   *
   *
   * <pre>
   * Display information of a ProxyConnection.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.ProxyConnectionInfo proxy_connection = 26;</code>
   */
  com.google.cloud.networkmanagement.v1.ProxyConnectionInfoOrBuilder getProxyConnectionOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a specific load balancer backend.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerBackendInfo load_balancer_backend_info = 27;
   * </code>
   *
   * @return Whether the loadBalancerBackendInfo field is set.
   */
  boolean hasLoadBalancerBackendInfo();
  /**
   *
   *
   * <pre>
   * Display information of a specific load balancer backend.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerBackendInfo load_balancer_backend_info = 27;
   * </code>
   *
   * @return The loadBalancerBackendInfo.
   */
  com.google.cloud.networkmanagement.v1.LoadBalancerBackendInfo getLoadBalancerBackendInfo();
  /**
   *
   *
   * <pre>
   * Display information of a specific load balancer backend.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1.LoadBalancerBackendInfo load_balancer_backend_info = 27;
   * </code>
   */
  com.google.cloud.networkmanagement.v1.LoadBalancerBackendInfoOrBuilder
      getLoadBalancerBackendInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information of a Storage Bucket. Used only for return traces.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.StorageBucketInfo storage_bucket = 28;</code>
   *
   * @return Whether the storageBucket field is set.
   */
  boolean hasStorageBucket();
  /**
   *
   *
   * <pre>
   * Display information of a Storage Bucket. Used only for return traces.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.StorageBucketInfo storage_bucket = 28;</code>
   *
   * @return The storageBucket.
   */
  com.google.cloud.networkmanagement.v1.StorageBucketInfo getStorageBucket();
  /**
   *
   *
   * <pre>
   * Display information of a Storage Bucket. Used only for return traces.
   * </pre>
   *
   * <code>.google.cloud.networkmanagement.v1.StorageBucketInfo storage_bucket = 28;</code>
   */
  com.google.cloud.networkmanagement.v1.StorageBucketInfoOrBuilder getStorageBucketOrBuilder();

  com.google.cloud.networkmanagement.v1.Step.StepInfoCase getStepInfoCase();
}
