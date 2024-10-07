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

public interface UsableSubnetworkSecondaryRangeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.UsableSubnetworkSecondaryRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return Whether the ipCidrRange field is set.
   */
  boolean hasIpCidrRange();
  /**
   *
   *
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   *
   *
   * <pre>
   * The range of IP addresses belonging to this subnetwork secondary range.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   *
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString getIpCidrRangeBytes();

  /**
   *
   *
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
   * </pre>
   *
   * <code>optional string range_name = 332216397;</code>
   *
   * @return Whether the rangeName field is set.
   */
  boolean hasRangeName();
  /**
   *
   *
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
   * </pre>
   *
   * <code>optional string range_name = 332216397;</code>
   *
   * @return The rangeName.
   */
  java.lang.String getRangeName();
  /**
   *
   *
   * <pre>
   * The name associated with this subnetwork secondary range, used when adding an alias IP range to a VM instance. The name must be 1-63 characters long, and comply with RFC1035. The name must be unique within the subnetwork.
   * </pre>
   *
   * <code>optional string range_name = 332216397;</code>
   *
   * @return The bytes for rangeName.
   */
  com.google.protobuf.ByteString getRangeNameBytes();
}
