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

public interface SubnetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gdchardwaremanagement.v1alpha.Subnet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Address range for this subnet in CIDR notation.
   * </pre>
   *
   * <code>
   * string address_range = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The addressRange.
   */
  java.lang.String getAddressRange();
  /**
   *
   *
   * <pre>
   * Required. Address range for this subnet in CIDR notation.
   * </pre>
   *
   * <code>
   * string address_range = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for addressRange.
   */
  com.google.protobuf.ByteString getAddressRangeBytes();

  /**
   *
   *
   * <pre>
   * Required. Default gateway for this subnet.
   * </pre>
   *
   * <code>
   * string default_gateway_ip_address = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The defaultGatewayIpAddress.
   */
  java.lang.String getDefaultGatewayIpAddress();
  /**
   *
   *
   * <pre>
   * Required. Default gateway for this subnet.
   * </pre>
   *
   * <code>
   * string default_gateway_ip_address = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for defaultGatewayIpAddress.
   */
  com.google.protobuf.ByteString getDefaultGatewayIpAddressBytes();
}
