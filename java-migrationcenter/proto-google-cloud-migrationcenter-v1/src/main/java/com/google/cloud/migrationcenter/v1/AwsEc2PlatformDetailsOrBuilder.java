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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.migrationcenter.v1;

public interface AwsEc2PlatformDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.AwsEc2PlatformDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * AWS platform's machine type label.
   * </pre>
   *
   * <code>string machine_type_label = 1;</code>
   *
   * @return The machineTypeLabel.
   */
  java.lang.String getMachineTypeLabel();
  /**
   *
   *
   * <pre>
   * AWS platform's machine type label.
   * </pre>
   *
   * <code>string machine_type_label = 1;</code>
   *
   * @return The bytes for machineTypeLabel.
   */
  com.google.protobuf.ByteString getMachineTypeLabelBytes();

  /**
   *
   *
   * <pre>
   * The location of the machine in the AWS format.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The location of the machine in the AWS format.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}
