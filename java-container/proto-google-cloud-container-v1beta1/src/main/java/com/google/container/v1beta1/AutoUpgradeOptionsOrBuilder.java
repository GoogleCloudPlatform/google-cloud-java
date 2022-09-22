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
// source: google/container/v1beta1/cluster_service.proto

package com.google.container.v1beta1;

public interface AutoUpgradeOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.AutoUpgradeOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the approximate start time for the upgrades, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string auto_upgrade_start_time = 1;</code>
   *
   * @return The autoUpgradeStartTime.
   */
  java.lang.String getAutoUpgradeStartTime();
  /**
   *
   *
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the approximate start time for the upgrades, in
   * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
   * </pre>
   *
   * <code>string auto_upgrade_start_time = 1;</code>
   *
   * @return The bytes for autoUpgradeStartTime.
   */
  com.google.protobuf.ByteString getAutoUpgradeStartTimeBytes();

  /**
   *
   *
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the description of the upgrade.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * [Output only] This field is set when upgrades are about to commence
   * with the description of the upgrade.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
