// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface AutoscalingPolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.AutoscalingPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The number of seconds that your application takes to initialize on a VM instance. This is referred to as the [initialization period](/compute/docs/autoscaler#cool_down_period). Specifying an accurate initialization period improves autoscaler decisions. For example, when scaling out, the autoscaler ignores data from VMs that are still initializing because those VMs might not yet represent normal usage of your application. The default initialization period is 60 seconds. Initialization periods might vary because of numerous factors. We recommend that you test how long your application takes to initialize. To do this, create a VM and time your application's startup process.
   * </pre>
   *
   * <code>optional int32 cool_down_period_sec = 107692954;</code>
   * @return Whether the coolDownPeriodSec field is set.
   */
  boolean hasCoolDownPeriodSec();
  /**
   * <pre>
   * The number of seconds that your application takes to initialize on a VM instance. This is referred to as the [initialization period](/compute/docs/autoscaler#cool_down_period). Specifying an accurate initialization period improves autoscaler decisions. For example, when scaling out, the autoscaler ignores data from VMs that are still initializing because those VMs might not yet represent normal usage of your application. The default initialization period is 60 seconds. Initialization periods might vary because of numerous factors. We recommend that you test how long your application takes to initialize. To do this, create a VM and time your application's startup process.
   * </pre>
   *
   * <code>optional int32 cool_down_period_sec = 107692954;</code>
   * @return The coolDownPeriodSec.
   */
  int getCoolDownPeriodSec();

  /**
   * <pre>
   * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyCpuUtilization cpu_utilization = 381211147;</code>
   * @return Whether the cpuUtilization field is set.
   */
  boolean hasCpuUtilization();
  /**
   * <pre>
   * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyCpuUtilization cpu_utilization = 381211147;</code>
   * @return The cpuUtilization.
   */
  com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilization getCpuUtilization();
  /**
   * <pre>
   * Defines the CPU utilization policy that allows the autoscaler to scale based on the average CPU utilization of a managed instance group.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyCpuUtilization cpu_utilization = 381211147;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyCpuUtilizationOrBuilder getCpuUtilizationOrBuilder();

  /**
   * <pre>
   * Configuration parameters of autoscaling based on a custom metric.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization custom_metric_utilizations = 131972850;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization> 
      getCustomMetricUtilizationsList();
  /**
   * <pre>
   * Configuration parameters of autoscaling based on a custom metric.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization custom_metric_utilizations = 131972850;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization getCustomMetricUtilizations(int index);
  /**
   * <pre>
   * Configuration parameters of autoscaling based on a custom metric.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization custom_metric_utilizations = 131972850;</code>
   */
  int getCustomMetricUtilizationsCount();
  /**
   * <pre>
   * Configuration parameters of autoscaling based on a custom metric.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization custom_metric_utilizations = 131972850;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilizationOrBuilder> 
      getCustomMetricUtilizationsOrBuilderList();
  /**
   * <pre>
   * Configuration parameters of autoscaling based on a custom metric.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilization custom_metric_utilizations = 131972850;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyCustomMetricUtilizationOrBuilder getCustomMetricUtilizationsOrBuilder(
      int index);

  /**
   * <pre>
   * Configuration parameters of autoscaling based on load balancer.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization load_balancing_utilization = 429746403;</code>
   * @return Whether the loadBalancingUtilization field is set.
   */
  boolean hasLoadBalancingUtilization();
  /**
   * <pre>
   * Configuration parameters of autoscaling based on load balancer.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization load_balancing_utilization = 429746403;</code>
   * @return The loadBalancingUtilization.
   */
  com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization getLoadBalancingUtilization();
  /**
   * <pre>
   * Configuration parameters of autoscaling based on load balancer.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilization load_balancing_utilization = 429746403;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyLoadBalancingUtilizationOrBuilder getLoadBalancingUtilizationOrBuilder();

  /**
   * <pre>
   * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
   * </pre>
   *
   * <code>optional int32 max_num_replicas = 62327375;</code>
   * @return Whether the maxNumReplicas field is set.
   */
  boolean hasMaxNumReplicas();
  /**
   * <pre>
   * The maximum number of instances that the autoscaler can scale out to. This is required when creating or updating an autoscaler. The maximum number of replicas must not be lower than minimal number of replicas.
   * </pre>
   *
   * <code>optional int32 max_num_replicas = 62327375;</code>
   * @return The maxNumReplicas.
   */
  int getMaxNumReplicas();

  /**
   * <pre>
   * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
   * </pre>
   *
   * <code>optional int32 min_num_replicas = 535329825;</code>
   * @return Whether the minNumReplicas field is set.
   */
  boolean hasMinNumReplicas();
  /**
   * <pre>
   * The minimum number of replicas that the autoscaler can scale in to. This cannot be less than 0. If not provided, autoscaler chooses a default value depending on maximum number of instances allowed.
   * </pre>
   *
   * <code>optional int32 min_num_replicas = 535329825;</code>
   * @return The minNumReplicas.
   */
  int getMinNumReplicas();

  /**
   * <pre>
   * Defines the operating mode for this policy. The following modes are available: - OFF: Disables the autoscaler but maintains its configuration. - ONLY_SCALE_OUT: Restricts the autoscaler to add VM instances only. - ON: Enables all autoscaler activities according to its policy. For more information, see "Turning off or restricting an autoscaler"
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   * @return Whether the mode field is set.
   */
  boolean hasMode();
  /**
   * <pre>
   * Defines the operating mode for this policy. The following modes are available: - OFF: Disables the autoscaler but maintains its configuration. - ONLY_SCALE_OUT: Restricts the autoscaler to add VM instances only. - ON: Enables all autoscaler activities according to its policy. For more information, see "Turning off or restricting an autoscaler"
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   * <pre>
   * Defines the operating mode for this policy. The following modes are available: - OFF: Disables the autoscaler but maintains its configuration. - ONLY_SCALE_OUT: Restricts the autoscaler to add VM instances only. - ON: Enables all autoscaler activities according to its policy. For more information, see "Turning off or restricting an autoscaler"
   * Check the Mode enum for the list of possible values.
   * </pre>
   *
   * <code>optional string mode = 3357091;</code>
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString
      getModeBytes();

  /**
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyScaleInControl scale_in_control = 527670872;</code>
   * @return Whether the scaleInControl field is set.
   */
  boolean hasScaleInControl();
  /**
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyScaleInControl scale_in_control = 527670872;</code>
   * @return The scaleInControl.
   */
  com.google.cloud.compute.v1.AutoscalingPolicyScaleInControl getScaleInControl();
  /**
   * <code>optional .google.cloud.compute.v1.AutoscalingPolicyScaleInControl scale_in_control = 527670872;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyScaleInControlOrBuilder getScaleInControlOrBuilder();

  /**
   * <pre>
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.AutoscalingPolicyScalingSchedule&gt; scaling_schedules = 355416580;</code>
   */
  int getScalingSchedulesCount();
  /**
   * <pre>
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.AutoscalingPolicyScalingSchedule&gt; scaling_schedules = 355416580;</code>
   */
  boolean containsScalingSchedules(
      java.lang.String key);
  /**
   * Use {@link #getScalingSchedulesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.AutoscalingPolicyScalingSchedule>
  getScalingSchedules();
  /**
   * <pre>
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.AutoscalingPolicyScalingSchedule&gt; scaling_schedules = 355416580;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.compute.v1.AutoscalingPolicyScalingSchedule>
  getScalingSchedulesMap();
  /**
   * <pre>
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.AutoscalingPolicyScalingSchedule&gt; scaling_schedules = 355416580;</code>
   */
  /* nullable */
com.google.cloud.compute.v1.AutoscalingPolicyScalingSchedule getScalingSchedulesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.compute.v1.AutoscalingPolicyScalingSchedule defaultValue);
  /**
   * <pre>
   * Scaling schedules defined for an autoscaler. Multiple schedules can be set on an autoscaler, and they can overlap. During overlapping periods the greatest min_required_replicas of all scaling schedules is applied. Up to 128 scaling schedules are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.AutoscalingPolicyScalingSchedule&gt; scaling_schedules = 355416580;</code>
   */
  com.google.cloud.compute.v1.AutoscalingPolicyScalingSchedule getScalingSchedulesOrThrow(
      java.lang.String key);
}
