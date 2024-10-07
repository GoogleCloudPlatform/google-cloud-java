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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkehub.v1beta1;

public interface ResourceManifestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.ResourceManifest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 1;</code>
   *
   * @return The manifest.
   */
  java.lang.String getManifest();
  /**
   *
   *
   * <pre>
   * YAML manifest of the resource.
   * </pre>
   *
   * <code>string manifest = 1;</code>
   *
   * @return The bytes for manifest.
   */
  com.google.protobuf.ByteString getManifestBytes();

  /**
   *
   *
   * <pre>
   * Whether the resource provided in the manifest is `cluster_scoped`.
   * If unset, the manifest is assumed to be namespace scoped.
   *
   * This field is used for REST mapping when applying the resource in a
   * cluster.
   * </pre>
   *
   * <code>bool cluster_scoped = 2;</code>
   *
   * @return The clusterScoped.
   */
  boolean getClusterScoped();
}
