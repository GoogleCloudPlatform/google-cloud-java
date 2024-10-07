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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

public interface VmCreationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.VmCreationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. VM instance machine type to create.
   * </pre>
   *
   * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vmMachineType.
   */
  java.lang.String getVmMachineType();
  /**
   *
   *
   * <pre>
   * Required. VM instance machine type to create.
   * </pre>
   *
   * <code>string vm_machine_type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vmMachineType.
   */
  com.google.protobuf.ByteString getVmMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud Platform zone to create the VM in.
   * </pre>
   *
   * <code>string vm_zone = 2;</code>
   *
   * @return The vmZone.
   */
  java.lang.String getVmZone();
  /**
   *
   *
   * <pre>
   * The Google Cloud Platform zone to create the VM in.
   * </pre>
   *
   * <code>string vm_zone = 2;</code>
   *
   * @return The bytes for vmZone.
   */
  com.google.protobuf.ByteString getVmZoneBytes();

  /**
   *
   *
   * <pre>
   * The subnet name the vm needs to be created in.
   * </pre>
   *
   * <code>string subnet = 3;</code>
   *
   * @return The subnet.
   */
  java.lang.String getSubnet();
  /**
   *
   *
   * <pre>
   * The subnet name the vm needs to be created in.
   * </pre>
   *
   * <code>string subnet = 3;</code>
   *
   * @return The bytes for subnet.
   */
  com.google.protobuf.ByteString getSubnetBytes();
}
