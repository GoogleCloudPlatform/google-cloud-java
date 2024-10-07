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

public interface InstanceGroupManagerStatusAllInstancesConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceGroupManagerStatusAllInstancesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string current_revision = 38355937;</code>
   *
   * @return Whether the currentRevision field is set.
   */
  boolean hasCurrentRevision();
  /**
   *
   *
   * <pre>
   * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string current_revision = 38355937;</code>
   *
   * @return The currentRevision.
   */
  java.lang.String getCurrentRevision();
  /**
   *
   *
   * <pre>
   * [Output Only] Current all-instances configuration revision. This value is in RFC3339 text format.
   * </pre>
   *
   * <code>optional string current_revision = 38355937;</code>
   *
   * @return The bytes for currentRevision.
   */
  com.google.protobuf.ByteString getCurrentRevisionBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
   * </pre>
   *
   * <code>optional bool effective = 141961639;</code>
   *
   * @return Whether the effective field is set.
   */
  boolean hasEffective();
  /**
   *
   *
   * <pre>
   * [Output Only] A bit indicating whether this configuration has been applied to all managed instances in the group.
   * </pre>
   *
   * <code>optional bool effective = 141961639;</code>
   *
   * @return The effective.
   */
  boolean getEffective();
}
