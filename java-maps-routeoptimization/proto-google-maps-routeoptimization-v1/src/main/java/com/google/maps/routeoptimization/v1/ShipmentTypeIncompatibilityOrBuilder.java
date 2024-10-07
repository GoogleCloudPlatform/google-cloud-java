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
// source: google/maps/routeoptimization/v1/route_optimization_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.routeoptimization.v1;

public interface ShipmentTypeIncompatibilityOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.routeoptimization.v1.ShipmentTypeIncompatibility)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of incompatible types. Two shipments having different `shipment_types`
   * among those listed are "incompatible".
   * </pre>
   *
   * <code>repeated string types = 1;</code>
   *
   * @return A list containing the types.
   */
  java.util.List<java.lang.String> getTypesList();
  /**
   *
   *
   * <pre>
   * List of incompatible types. Two shipments having different `shipment_types`
   * among those listed are "incompatible".
   * </pre>
   *
   * <code>repeated string types = 1;</code>
   *
   * @return The count of types.
   */
  int getTypesCount();
  /**
   *
   *
   * <pre>
   * List of incompatible types. Two shipments having different `shipment_types`
   * among those listed are "incompatible".
   * </pre>
   *
   * <code>repeated string types = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The types at the given index.
   */
  java.lang.String getTypes(int index);
  /**
   *
   *
   * <pre>
   * List of incompatible types. Two shipments having different `shipment_types`
   * among those listed are "incompatible".
   * </pre>
   *
   * <code>repeated string types = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the types at the given index.
   */
  com.google.protobuf.ByteString getTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Mode applied to the incompatibility.
   * </pre>
   *
   * <code>
   * .google.maps.routeoptimization.v1.ShipmentTypeIncompatibility.IncompatibilityMode incompatibility_mode = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for incompatibilityMode.
   */
  int getIncompatibilityModeValue();
  /**
   *
   *
   * <pre>
   * Mode applied to the incompatibility.
   * </pre>
   *
   * <code>
   * .google.maps.routeoptimization.v1.ShipmentTypeIncompatibility.IncompatibilityMode incompatibility_mode = 2;
   * </code>
   *
   * @return The incompatibilityMode.
   */
  com.google.maps.routeoptimization.v1.ShipmentTypeIncompatibility.IncompatibilityMode
      getIncompatibilityMode();
}
