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
// source: google/cloud/websecurityscanner/v1/web_security_scanner.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.websecurityscanner.v1;

public interface CreateScanConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1.CreateScanConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name where the scan is created, which should be a
   * project resource name in the format 'projects/{projectId}'.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.ScanConfig scan_config = 2;</code>
   *
   * @return Whether the scanConfig field is set.
   */
  boolean hasScanConfig();
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.ScanConfig scan_config = 2;</code>
   *
   * @return The scanConfig.
   */
  com.google.cloud.websecurityscanner.v1.ScanConfig getScanConfig();
  /**
   *
   *
   * <pre>
   * Required. The ScanConfig to be created.
   * </pre>
   *
   * <code>.google.cloud.websecurityscanner.v1.ScanConfig scan_config = 2;</code>
   */
  com.google.cloud.websecurityscanner.v1.ScanConfigOrBuilder getScanConfigOrBuilder();
}
