// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InstanceGroupManagersPatchPerInstanceConfigsReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagersPatchPerInstanceConfigsReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;</code>
   */
  java.util.List<com.google.cloud.compute.v1.PerInstanceConfig> 
      getPerInstanceConfigsList();
  /**
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;</code>
   */
  com.google.cloud.compute.v1.PerInstanceConfig getPerInstanceConfigs(int index);
  /**
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;</code>
   */
  int getPerInstanceConfigsCount();
  /**
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.PerInstanceConfigOrBuilder> 
      getPerInstanceConfigsOrBuilderList();
  /**
   * <pre>
   * The list of per-instance configurations to insert or patch on this managed instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.PerInstanceConfig per_instance_configs = 526265001;</code>
   */
  com.google.cloud.compute.v1.PerInstanceConfigOrBuilder getPerInstanceConfigsOrBuilder(
      int index);
}
