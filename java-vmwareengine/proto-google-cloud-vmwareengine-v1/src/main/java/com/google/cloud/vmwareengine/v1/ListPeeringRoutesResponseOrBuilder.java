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
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vmwareengine.v1;

public interface ListPeeringRoutesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.ListPeeringRoutesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of peering routes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.PeeringRoute peering_routes = 1;</code>
   */
  java.util.List<com.google.cloud.vmwareengine.v1.PeeringRoute> getPeeringRoutesList();
  /**
   *
   *
   * <pre>
   * A list of peering routes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.PeeringRoute peering_routes = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.PeeringRoute getPeeringRoutes(int index);
  /**
   *
   *
   * <pre>
   * A list of peering routes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.PeeringRoute peering_routes = 1;</code>
   */
  int getPeeringRoutesCount();
  /**
   *
   *
   * <pre>
   * A list of peering routes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.PeeringRoute peering_routes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vmwareengine.v1.PeeringRouteOrBuilder>
      getPeeringRoutesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of peering routes.
   * </pre>
   *
   * <code>repeated .google.cloud.vmwareengine.v1.PeeringRoute peering_routes = 1;</code>
   */
  com.google.cloud.vmwareengine.v1.PeeringRouteOrBuilder getPeeringRoutesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
