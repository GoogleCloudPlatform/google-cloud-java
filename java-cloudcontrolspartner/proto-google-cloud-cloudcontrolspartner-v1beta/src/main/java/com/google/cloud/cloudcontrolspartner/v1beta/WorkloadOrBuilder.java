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
// source: google/cloud/cloudcontrolspartner/v1beta/customer_workloads.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.cloudcontrolspartner.v1beta;

public interface WorkloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1beta.Workload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * `organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. Format:
   * `organizations/{organization}/locations/{location}/customers/{customer}/workloads/{workload}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Folder id this workload is associated with
   * </pre>
   *
   * <code>int64 folder_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The folderId.
   */
  long getFolderId();

  /**
   *
   *
   * <pre>
   * Output only. Time the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the resource was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of container folder of the assured workload
   * </pre>
   *
   * <code>string folder = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The folder.
   */
  java.lang.String getFolder();
  /**
   *
   *
   * <pre>
   * Output only. The name of container folder of the assured workload
   * </pre>
   *
   * <code>string folder = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for folder.
   */
  com.google.protobuf.ByteString getFolderBytes();

  /**
   *
   *
   * <pre>
   * Container for workload onboarding steps.
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingState workload_onboarding_state = 5;
   * </code>
   *
   * @return Whether the workloadOnboardingState field is set.
   */
  boolean hasWorkloadOnboardingState();
  /**
   *
   *
   * <pre>
   * Container for workload onboarding steps.
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingState workload_onboarding_state = 5;
   * </code>
   *
   * @return The workloadOnboardingState.
   */
  com.google.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingState getWorkloadOnboardingState();
  /**
   *
   *
   * <pre>
   * Container for workload onboarding steps.
   * </pre>
   *
   * <code>
   * .google.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingState workload_onboarding_state = 5;
   * </code>
   */
  com.google.cloud.cloudcontrolspartner.v1beta.WorkloadOnboardingStateOrBuilder
      getWorkloadOnboardingStateOrBuilder();

  /**
   *
   *
   * <pre>
   * Indicates whether a workload is fully onboarded.
   * </pre>
   *
   * <code>bool is_onboarded = 6;</code>
   *
   * @return The isOnboarded.
   */
  boolean getIsOnboarded();

  /**
   *
   *
   * <pre>
   * The project id of the key management project for the workload
   * </pre>
   *
   * <code>string key_management_project_id = 7;</code>
   *
   * @return The keyManagementProjectId.
   */
  java.lang.String getKeyManagementProjectId();
  /**
   *
   *
   * <pre>
   * The project id of the key management project for the workload
   * </pre>
   *
   * <code>string key_management_project_id = 7;</code>
   *
   * @return The bytes for keyManagementProjectId.
   */
  com.google.protobuf.ByteString getKeyManagementProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The Google Cloud location of the workload
   * </pre>
   *
   * <code>string location = 8;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The Google Cloud location of the workload
   * </pre>
   *
   * <code>string location = 8;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Partner associated with this workload.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.Workload.Partner partner = 9;</code>
   *
   * @return The enum numeric value on the wire for partner.
   */
  int getPartnerValue();
  /**
   *
   *
   * <pre>
   * Partner associated with this workload.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.Workload.Partner partner = 9;</code>
   *
   * @return The partner.
   */
  com.google.cloud.cloudcontrolspartner.v1beta.Workload.Partner getPartner();
}
