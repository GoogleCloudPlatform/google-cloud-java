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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface DistributionPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DistributionPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
   * Check the TargetShape enum for the list of possible values.
   * </pre>
   *
   * <code>optional string target_shape = 338621299;</code>
   *
   * @return Whether the targetShape field is set.
   */
  boolean hasTargetShape();
  /**
   *
   *
   * <pre>
   * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
   * Check the TargetShape enum for the list of possible values.
   * </pre>
   *
   * <code>optional string target_shape = 338621299;</code>
   *
   * @return The targetShape.
   */
  java.lang.String getTargetShape();
  /**
   *
   *
   * <pre>
   * The distribution shape to which the group converges either proactively or on resize events (depending on the value set in updatePolicy.instanceRedistributionType).
   * Check the TargetShape enum for the list of possible values.
   * </pre>
   *
   * <code>optional string target_shape = 338621299;</code>
   *
   * @return The bytes for targetShape.
   */
  com.google.protobuf.ByteString getTargetShapeBytes();

  /**
   *
   *
   * <pre>
   * Zones where the regional managed instance group will create and manage its instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DistributionPolicyZoneConfiguration zones = 116085319;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration> getZonesList();
  /**
   *
   *
   * <pre>
   * Zones where the regional managed instance group will create and manage its instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DistributionPolicyZoneConfiguration zones = 116085319;
   * </code>
   */
  com.google.cloud.compute.v1.DistributionPolicyZoneConfiguration getZones(int index);
  /**
   *
   *
   * <pre>
   * Zones where the regional managed instance group will create and manage its instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DistributionPolicyZoneConfiguration zones = 116085319;
   * </code>
   */
  int getZonesCount();
  /**
   *
   *
   * <pre>
   * Zones where the regional managed instance group will create and manage its instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DistributionPolicyZoneConfiguration zones = 116085319;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.DistributionPolicyZoneConfigurationOrBuilder>
      getZonesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Zones where the regional managed instance group will create and manage its instances.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DistributionPolicyZoneConfiguration zones = 116085319;
   * </code>
   */
  com.google.cloud.compute.v1.DistributionPolicyZoneConfigurationOrBuilder getZonesOrBuilder(
      int index);
}
