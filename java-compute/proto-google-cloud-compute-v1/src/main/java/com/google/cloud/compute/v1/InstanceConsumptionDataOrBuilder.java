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

public interface InstanceConsumptionDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceConsumptionData)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
   * </code>
   *
   * @return Whether the consumptionInfo field is set.
   */
  boolean hasConsumptionInfo();
  /**
   *
   *
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
   * </code>
   *
   * @return The consumptionInfo.
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfo getConsumptionInfo();
  /**
   *
   *
   * <pre>
   * Resources consumed by the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceConsumptionInfo consumption_info = 146354898;
   * </code>
   */
  com.google.cloud.compute.v1.InstanceConsumptionInfoOrBuilder getConsumptionInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return Whether the instance field is set.
   */
  boolean hasInstance();
  /**
   *
   *
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The instance.
   */
  java.lang.String getInstance();
  /**
   *
   *
   * <pre>
   * Server-defined URL for the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();
}
