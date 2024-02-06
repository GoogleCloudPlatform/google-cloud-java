// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface SoleTenantConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.SoleTenantConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * NodeAffinities used to match to a shared sole tenant node group.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.SoleTenantConfig.NodeAffinity node_affinities = 1;</code>
   */
  java.util.List<com.google.container.v1beta1.SoleTenantConfig.NodeAffinity> 
      getNodeAffinitiesList();
  /**
   * <pre>
   * NodeAffinities used to match to a shared sole tenant node group.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.SoleTenantConfig.NodeAffinity node_affinities = 1;</code>
   */
  com.google.container.v1beta1.SoleTenantConfig.NodeAffinity getNodeAffinities(int index);
  /**
   * <pre>
   * NodeAffinities used to match to a shared sole tenant node group.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.SoleTenantConfig.NodeAffinity node_affinities = 1;</code>
   */
  int getNodeAffinitiesCount();
  /**
   * <pre>
   * NodeAffinities used to match to a shared sole tenant node group.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.SoleTenantConfig.NodeAffinity node_affinities = 1;</code>
   */
  java.util.List<? extends com.google.container.v1beta1.SoleTenantConfig.NodeAffinityOrBuilder> 
      getNodeAffinitiesOrBuilderList();
  /**
   * <pre>
   * NodeAffinities used to match to a shared sole tenant node group.
   * </pre>
   *
   * <code>repeated .google.container.v1beta1.SoleTenantConfig.NodeAffinity node_affinities = 1;</code>
   */
  com.google.container.v1beta1.SoleTenantConfig.NodeAffinityOrBuilder getNodeAffinitiesOrBuilder(
      int index);
}
