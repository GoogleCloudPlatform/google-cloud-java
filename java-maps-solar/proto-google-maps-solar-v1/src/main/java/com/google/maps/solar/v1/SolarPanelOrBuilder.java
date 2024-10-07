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
// source: google/maps/solar/v1/solar_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.solar.v1;

public interface SolarPanelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.solar.v1.SolarPanel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The centre of the panel.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1;</code>
   *
   * @return Whether the center field is set.
   */
  boolean hasCenter();
  /**
   *
   *
   * <pre>
   * The centre of the panel.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1;</code>
   *
   * @return The center.
   */
  com.google.type.LatLng getCenter();
  /**
   *
   *
   * <pre>
   * The centre of the panel.
   * </pre>
   *
   * <code>.google.type.LatLng center = 1;</code>
   */
  com.google.type.LatLngOrBuilder getCenterOrBuilder();

  /**
   *
   *
   * <pre>
   * The orientation of the panel.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
   *
   * @return The enum numeric value on the wire for orientation.
   */
  int getOrientationValue();
  /**
   *
   *
   * <pre>
   * The orientation of the panel.
   * </pre>
   *
   * <code>.google.maps.solar.v1.SolarPanelOrientation orientation = 2;</code>
   *
   * @return The orientation.
   */
  com.google.maps.solar.v1.SolarPanelOrientation getOrientation();

  /**
   *
   *
   * <pre>
   * How much sunlight energy this layout captures over the course of a
   * year, in DC kWh.
   * </pre>
   *
   * <code>float yearly_energy_dc_kwh = 3;</code>
   *
   * @return The yearlyEnergyDcKwh.
   */
  float getYearlyEnergyDcKwh();

  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
   * roof segment that this panel is placed on.
   * </pre>
   *
   * <code>optional int32 segment_index = 4;</code>
   *
   * @return Whether the segmentIndex field is set.
   */
  boolean hasSegmentIndex();
  /**
   *
   *
   * <pre>
   * Index in [roof_segment_stats]
   * [google.maps.solar.v1.SolarPotential.roof_segment_stats]
   * of the `RoofSegmentSizeAndSunshineStats` which corresponds to the
   * roof segment that this panel is placed on.
   * </pre>
   *
   * <code>optional int32 segment_index = 4;</code>
   *
   * @return The segmentIndex.
   */
  int getSegmentIndex();
}
