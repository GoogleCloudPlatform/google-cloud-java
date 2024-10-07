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
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.telcoautomation.v1;

public interface SiteVersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.telcoautomation.v1.SiteVersion)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. NF vendor.
   * </pre>
   *
   * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nfVendor.
   */
  java.lang.String getNfVendor();
  /**
   *
   *
   * <pre>
   * Output only. NF vendor.
   * </pre>
   *
   * <code>string nf_vendor = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nfVendor.
   */
  com.google.protobuf.ByteString getNfVendorBytes();

  /**
   *
   *
   * <pre>
   * Output only. NF vendor type.
   * </pre>
   *
   * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nfType.
   */
  java.lang.String getNfType();
  /**
   *
   *
   * <pre>
   * Output only. NF vendor type.
   * </pre>
   *
   * <code>string nf_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nfType.
   */
  com.google.protobuf.ByteString getNfTypeBytes();

  /**
   *
   *
   * <pre>
   * Output only. NF version.
   * </pre>
   *
   * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The nfVersion.
   */
  java.lang.String getNfVersion();
  /**
   *
   *
   * <pre>
   * Output only. NF version.
   * </pre>
   *
   * <code>string nf_version = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for nfVersion.
   */
  com.google.protobuf.ByteString getNfVersionBytes();
}
