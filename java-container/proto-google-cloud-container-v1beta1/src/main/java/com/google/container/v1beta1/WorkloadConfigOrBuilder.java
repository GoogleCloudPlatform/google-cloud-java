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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface WorkloadConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.WorkloadConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Sets which mode of auditing should be used for the cluster's workloads.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
   *
   * @return Whether the auditMode field is set.
   */
  boolean hasAuditMode();
  /**
   *
   *
   * <pre>
   * Sets which mode of auditing should be used for the cluster's workloads.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
   *
   * @return The enum numeric value on the wire for auditMode.
   */
  int getAuditModeValue();
  /**
   *
   *
   * <pre>
   * Sets which mode of auditing should be used for the cluster's workloads.
   * </pre>
   *
   * <code>optional .google.container.v1beta1.WorkloadConfig.Mode audit_mode = 1;</code>
   *
   * @return The auditMode.
   */
  com.google.container.v1beta1.WorkloadConfig.Mode getAuditMode();
}
