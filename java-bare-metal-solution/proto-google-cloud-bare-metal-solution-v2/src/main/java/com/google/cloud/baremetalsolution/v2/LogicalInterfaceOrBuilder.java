/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/baremetalsolution/v2/network.proto

package com.google.cloud.baremetalsolution.v2;

public interface LogicalInterfaceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.baremetalsolution.v2.LogicalInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of logical network interfaces within a logical interface.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface logical_network_interfaces = 1;
   * </code>
   */
  java.util.List<com.google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface>
      getLogicalNetworkInterfacesList();
  /**
   *
   *
   * <pre>
   * List of logical network interfaces within a logical interface.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface logical_network_interfaces = 1;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface
      getLogicalNetworkInterfaces(int index);
  /**
   *
   *
   * <pre>
   * List of logical network interfaces within a logical interface.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface logical_network_interfaces = 1;
   * </code>
   */
  int getLogicalNetworkInterfacesCount();
  /**
   *
   *
   * <pre>
   * List of logical network interfaces within a logical interface.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface logical_network_interfaces = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.baremetalsolution.v2.LogicalInterface
                  .LogicalNetworkInterfaceOrBuilder>
      getLogicalNetworkInterfacesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of logical network interfaces within a logical interface.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterface logical_network_interfaces = 1;
   * </code>
   */
  com.google.cloud.baremetalsolution.v2.LogicalInterface.LogicalNetworkInterfaceOrBuilder
      getLogicalNetworkInterfacesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Interface name. This is of syntax &lt;bond&gt;&lt;bond_mode&gt; or &lt;nic&gt; and
   * forms part of the network template name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Interface name. This is of syntax &lt;bond&gt;&lt;bond_mode&gt; or &lt;nic&gt; and
   * forms part of the network template name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The index of the logical interface mapping to the index of the hardware
   * bond or nic on the chosen network template.
   * </pre>
   *
   * <code>int32 interface_index = 3;</code>
   *
   * @return The interfaceIndex.
   */
  int getInterfaceIndex();
}
