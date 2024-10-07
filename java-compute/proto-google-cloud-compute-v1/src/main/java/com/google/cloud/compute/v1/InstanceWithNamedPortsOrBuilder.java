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

public interface InstanceWithNamedPortsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceWithNamedPorts)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The URL of the instance.
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
   * [Output Only] The URL of the instance.
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
   * [Output Only] The URL of the instance.
   * </pre>
   *
   * <code>optional string instance = 18257045;</code>
   *
   * @return The bytes for instance.
   */
  com.google.protobuf.ByteString getInstanceBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The named ports that belong to this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NamedPort> getNamedPortsList();
  /**
   *
   *
   * <pre>
   * [Output Only] The named ports that belong to this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  com.google.cloud.compute.v1.NamedPort getNamedPorts(int index);
  /**
   *
   *
   * <pre>
   * [Output Only] The named ports that belong to this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  int getNamedPortsCount();
  /**
   *
   *
   * <pre>
   * [Output Only] The named ports that belong to this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NamedPortOrBuilder>
      getNamedPortsOrBuilderList();
  /**
   *
   *
   * <pre>
   * [Output Only] The named ports that belong to this instance group.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NamedPort named_ports = 427598732;</code>
   */
  com.google.cloud.compute.v1.NamedPortOrBuilder getNamedPortsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   *
   *
   * <pre>
   * [Output Only] The status of the instance.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();
}
