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
// source: google/cloud/gdchardwaremanagement/v1alpha/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gdchardwaremanagement.v1alpha;

public interface HardwareInstallationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.HardwareInstallationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Location of the rack in the site e.g. Floor 2, Room 201, Row 7,
   * Rack 3.
   * </pre>
   *
   * <code>string rack_location = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The rackLocation.
   */
  java.lang.String getRackLocation();
  /**
   *
   *
   * <pre>
   * Optional. Location of the rack in the site e.g. Floor 2, Room 201, Row 7,
   * Rack 3.
   * </pre>
   *
   * <code>string rack_location = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for rackLocation.
   */
  com.google.protobuf.ByteString getRackLocationBytes();

  /**
   *
   *
   * <pre>
   * Required. Distance from the power outlet in meters.
   * </pre>
   *
   * <code>int32 power_distance_meters = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The powerDistanceMeters.
   */
  int getPowerDistanceMeters();

  /**
   *
   *
   * <pre>
   * Required. Distance from the network switch in meters.
   * </pre>
   *
   * <code>int32 switch_distance_meters = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The switchDistanceMeters.
   */
  int getSwitchDistanceMeters();

  /**
   *
   *
   * <pre>
   * Required. Dimensions of the rack unit.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Dimensions rack_unit_dimensions = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rackUnitDimensions field is set.
   */
  boolean hasRackUnitDimensions();
  /**
   *
   *
   * <pre>
   * Required. Dimensions of the rack unit.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Dimensions rack_unit_dimensions = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rackUnitDimensions.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.Dimensions getRackUnitDimensions();
  /**
   *
   *
   * <pre>
   * Required. Dimensions of the rack unit.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.Dimensions rack_unit_dimensions = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.DimensionsOrBuilder
      getRackUnitDimensionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Rack space allocated for the hardware.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.RackSpace rack_space = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the rackSpace field is set.
   */
  boolean hasRackSpace();
  /**
   *
   *
   * <pre>
   * Required. Rack space allocated for the hardware.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.RackSpace rack_space = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rackSpace.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.RackSpace getRackSpace();
  /**
   *
   *
   * <pre>
   * Required. Rack space allocated for the hardware.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.RackSpace rack_space = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.RackSpaceOrBuilder getRackSpaceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Type of the rack.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareInstallationInfo.RackType rack_type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for rackType.
   */
  int getRackTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Type of the rack.
   * </pre>
   *
   * <code>
   * .google.cloud.gdchardwaremanagement.v1alpha.HardwareInstallationInfo.RackType rack_type = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The rackType.
   */
  com.google.cloud.gdchardwaremanagement.v1alpha.HardwareInstallationInfo.RackType getRackType();
}
