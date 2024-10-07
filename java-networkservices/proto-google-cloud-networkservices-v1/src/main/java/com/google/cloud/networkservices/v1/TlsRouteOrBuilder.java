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
// source: google/cloud/networkservices/v1/tls_route.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.networkservices.v1;

public interface TlsRouteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkservices.v1.TlsRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the TlsRoute resource. It matches pattern
   * `projects/&#42;&#47;locations/global/tlsRoutes/tls_route_name&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Name of the TlsRoute resource. It matches pattern
   * `projects/&#42;&#47;locations/global/tlsRoutes/tls_route_name&gt;`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Server-defined URL of this resource
   * </pre>
   *
   * <code>string self_link = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   *
   *
   * <pre>
   * Output only. Server-defined URL of this resource
   * </pre>
   *
   * <code>string self_link = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString getSelfLinkBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when the resource was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. A free-text description of the resource. Max length 1024
   * characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled. At least one
   * RouteRule must be supplied. If there are multiple rules then the action
   * taken will be the first rule to match.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.TlsRoute.RouteRule rules = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.networkservices.v1.TlsRoute.RouteRule> getRulesList();
  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled. At least one
   * RouteRule must be supplied. If there are multiple rules then the action
   * taken will be the first rule to match.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.TlsRoute.RouteRule rules = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.TlsRoute.RouteRule getRules(int index);
  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled. At least one
   * RouteRule must be supplied. If there are multiple rules then the action
   * taken will be the first rule to match.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.TlsRoute.RouteRule rules = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRulesCount();
  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled. At least one
   * RouteRule must be supplied. If there are multiple rules then the action
   * taken will be the first rule to match.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.TlsRoute.RouteRule rules = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.networkservices.v1.TlsRoute.RouteRuleOrBuilder>
      getRulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. Rules that define how traffic is routed and handled. At least one
   * RouteRule must be supplied. If there are multiple rules then the action
   * taken will be the first rule to match.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.networkservices.v1.TlsRoute.RouteRule rules = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networkservices.v1.TlsRoute.RouteRuleOrBuilder getRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this TlsRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the meshes.
   */
  java.util.List<java.lang.String> getMeshesList();
  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this TlsRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of meshes.
   */
  int getMeshesCount();
  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this TlsRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The meshes at the given index.
   */
  java.lang.String getMeshes(int index);
  /**
   *
   *
   * <pre>
   * Optional. Meshes defines a list of meshes this TlsRoute is attached to, as
   * one of the routing rules to route the requests served by the mesh.
   *
   * Each mesh reference should match the pattern:
   * `projects/&#42;&#47;locations/global/meshes/&lt;mesh_name&gt;`
   *
   * The attached Mesh should be of a type SIDECAR
   * </pre>
   *
   * <code>
   * repeated string meshes = 6 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the meshes at the given index.
   */
  com.google.protobuf.ByteString getMeshesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this TlsRoute is attached to,
   * as one of the routing rules to route the requests served by the gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the gateways.
   */
  java.util.List<java.lang.String> getGatewaysList();
  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this TlsRoute is attached to,
   * as one of the routing rules to route the requests served by the gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of gateways.
   */
  int getGatewaysCount();
  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this TlsRoute is attached to,
   * as one of the routing rules to route the requests served by the gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The gateways at the given index.
   */
  java.lang.String getGateways(int index);
  /**
   *
   *
   * <pre>
   * Optional. Gateways defines a list of gateways this TlsRoute is attached to,
   * as one of the routing rules to route the requests served by the gateway.
   *
   * Each gateway reference should match the pattern:
   * `projects/&#42;&#47;locations/global/gateways/&lt;gateway_name&gt;`
   * </pre>
   *
   * <code>
   * repeated string gateways = 7 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the gateways at the given index.
   */
  com.google.protobuf.ByteString getGatewaysBytes(int index);
}
