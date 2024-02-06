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
// source: google/cloud/iot/v1/device_manager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.iot.v1;

public interface CreateDeviceRegistryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.CreateDeviceRegistryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The project and cloud region where this device registry must be created.
   * For example, `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The project and cloud region where this device registry must be created.
   * For example, `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>
   * .google.cloud.iot.v1.DeviceRegistry device_registry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deviceRegistry field is set.
   */
  boolean hasDeviceRegistry();
  /**
   *
   *
   * <pre>
   * Required. The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>
   * .google.cloud.iot.v1.DeviceRegistry device_registry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deviceRegistry.
   */
  com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry();
  /**
   *
   *
   * <pre>
   * Required. The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>
   * .google.cloud.iot.v1.DeviceRegistry device_registry = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder();
}
