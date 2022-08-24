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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NodeTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeTemplate)
    com.google.protobuf.MessageOrBuilder {

  /** <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code> */
  java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getAcceleratorsList();
  /** <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code> */
  com.google.cloud.compute.v1.AcceleratorConfig getAccelerators(int index);
  /** <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code> */
  int getAcceleratorsCount();
  /** <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code> */
  java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getAcceleratorsOrBuilderList();
  /** <code>repeated .google.cloud.compute.v1.AcceleratorConfig accelerators = 269577064;</code> */
  com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getAcceleratorsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * Check the CpuOvercommitType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cpu_overcommit_type = 247727959;</code>
   *
   * @return Whether the cpuOvercommitType field is set.
   */
  boolean hasCpuOvercommitType();
  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * Check the CpuOvercommitType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cpu_overcommit_type = 247727959;</code>
   *
   * @return The cpuOvercommitType.
   */
  java.lang.String getCpuOvercommitType();
  /**
   *
   *
   * <pre>
   * CPU overcommit.
   * Check the CpuOvercommitType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string cpu_overcommit_type = 247727959;</code>
   *
   * @return The bytes for cpuOvercommitType.
   */
  com.google.protobuf.ByteString getCpuOvercommitTypeBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   *
   *
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   *
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString getCreationTimestampBytes();

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /** <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code> */
  java.util.List<com.google.cloud.compute.v1.LocalDisk> getDisksList();
  /** <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code> */
  com.google.cloud.compute.v1.LocalDisk getDisks(int index);
  /** <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code> */
  int getDisksCount();
  /** <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code> */
  java.util.List<? extends com.google.cloud.compute.v1.LocalDiskOrBuilder> getDisksOrBuilderList();
  /** <code>repeated .google.cloud.compute.v1.LocalDisk disks = 95594102;</code> */
  com.google.cloud.compute.v1.LocalDiskOrBuilder getDisksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   *
   * @return The id.
   */
  long getId();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the resource. Always compute#nodeTemplate for node templates.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Labels to use for node affinity, which will be used in instance scheduling.
   * </pre>
   *
   * <code>map&lt;string, string&gt; node_affinity_labels = 339007161;</code>
   */
  int getNodeAffinityLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to use for node affinity, which will be used in instance scheduling.
   * </pre>
   *
   * <code>map&lt;string, string&gt; node_affinity_labels = 339007161;</code>
   */
  boolean containsNodeAffinityLabels(java.lang.String key);
  /** Use {@link #getNodeAffinityLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getNodeAffinityLabels();
  /**
   *
   *
   * <pre>
   * Labels to use for node affinity, which will be used in instance scheduling.
   * </pre>
   *
   * <code>map&lt;string, string&gt; node_affinity_labels = 339007161;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getNodeAffinityLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to use for node affinity, which will be used in instance scheduling.
   * </pre>
   *
   * <code>map&lt;string, string&gt; node_affinity_labels = 339007161;</code>
   */

  /* nullable */
  java.lang.String getNodeAffinityLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels to use for node affinity, which will be used in instance scheduling.
   * </pre>
   *
   * <code>map&lt;string, string&gt; node_affinity_labels = 339007161;</code>
   */
  java.lang.String getNodeAffinityLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The node type to use for nodes group that are created from this template.
   * </pre>
   *
   * <code>optional string node_type = 465832791;</code>
   *
   * @return Whether the nodeType field is set.
   */
  boolean hasNodeType();
  /**
   *
   *
   * <pre>
   * The node type to use for nodes group that are created from this template.
   * </pre>
   *
   * <code>optional string node_type = 465832791;</code>
   *
   * @return The nodeType.
   */
  java.lang.String getNodeType();
  /**
   *
   *
   * <pre>
   * The node type to use for nodes group that are created from this template.
   * </pre>
   *
   * <code>optional string node_type = 465832791;</code>
   *
   * @return The bytes for nodeType.
   */
  com.google.protobuf.ByteString getNodeTypeBytes();

  /**
   *
   *
   * <pre>
   * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility node_type_flexibility = 315257905;
   * </code>
   *
   * @return Whether the nodeTypeFlexibility field is set.
   */
  boolean hasNodeTypeFlexibility();
  /**
   *
   *
   * <pre>
   * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility node_type_flexibility = 315257905;
   * </code>
   *
   * @return The nodeTypeFlexibility.
   */
  com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility getNodeTypeFlexibility();
  /**
   *
   *
   * <pre>
   * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.NodeTemplateNodeTypeFlexibility node_type_flexibility = 315257905;
   * </code>
   */
  com.google.cloud.compute.v1.NodeTemplateNodeTypeFlexibilityOrBuilder
      getNodeTypeFlexibilityOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The name of the region where the node template resides, such as us-central1.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] The name of the region where the node template resides, such as us-central1.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   *
   *
   * <pre>
   * [Output Only] The name of the region where the node template resides, such as us-central1.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   *
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString getRegionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   *
   * @return Whether the serverBinding field is set.
   */
  boolean hasServerBinding();
  /**
   *
   *
   * <pre>
   * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   *
   * @return The serverBinding.
   */
  com.google.cloud.compute.v1.ServerBinding getServerBinding();
  /**
   *
   *
   * <pre>
   * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.ServerBinding server_binding = 208179593;</code>
   */
  com.google.cloud.compute.v1.ServerBindingOrBuilder getServerBindingOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] The status of the node template. One of the following values: CREATING, READY, and DELETING.
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
   * [Output Only] The status of the node template. One of the following values: CREATING, READY, and DELETING.
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
   * [Output Only] The status of the node template. One of the following values: CREATING, READY, and DELETING.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   *
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString getStatusBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>optional string status_message = 297428154;</code>
   *
   * @return Whether the statusMessage field is set.
   */
  boolean hasStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>optional string status_message = 297428154;</code>
   *
   * @return The statusMessage.
   */
  java.lang.String getStatusMessage();
  /**
   *
   *
   * <pre>
   * [Output Only] An optional, human-readable explanation of the status.
   * </pre>
   *
   * <code>optional string status_message = 297428154;</code>
   *
   * @return The bytes for statusMessage.
   */
  com.google.protobuf.ByteString getStatusMessageBytes();
}
