// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1beta;

public interface ScalingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1beta.ScalingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
   * @return Whether the instanceSize field is set.
   */
  boolean hasInstanceSize();
  /**
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
   * @return The enum numeric value on the wire for instanceSize.
   */
  int getInstanceSizeValue();
  /**
   * <pre>
   * An enum of readable instance sizes, with each instance size mapping to a
   * float value (e.g. InstanceSize.EXTRA_SMALL = scaling_factor(0.1))
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize instance_size = 1;</code>
   * @return The instanceSize.
   */
  com.google.cloud.metastore.v1beta.ScalingConfig.InstanceSize getInstanceSize();

  /**
   * <pre>
   * Scaling factor, increments of 0.1 for values less than 1.0, and
   * increments of 1.0 for values greater than 1.0.
   * </pre>
   *
   * <code>float scaling_factor = 2;</code>
   * @return Whether the scalingFactor field is set.
   */
  boolean hasScalingFactor();
  /**
   * <pre>
   * Scaling factor, increments of 0.1 for values less than 1.0, and
   * increments of 1.0 for values greater than 1.0.
   * </pre>
   *
   * <code>float scaling_factor = 2;</code>
   * @return The scalingFactor.
   */
  float getScalingFactor();

  com.google.cloud.metastore.v1beta.ScalingConfig.ScalingModelCase getScalingModelCase();
}
