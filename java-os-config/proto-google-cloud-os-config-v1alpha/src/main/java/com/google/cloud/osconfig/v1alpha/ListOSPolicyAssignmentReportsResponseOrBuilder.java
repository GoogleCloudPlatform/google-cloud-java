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
// source: google/cloud/osconfig/v1alpha/os_policy_assignment_reports.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.osconfig.v1alpha;

public interface ListOSPolicyAssignmentReportsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.osconfig.v1alpha.ListOSPolicyAssignmentReportsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport os_policy_assignment_reports = 1;
   * </code>
   */
  java.util.List<com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport>
      getOsPolicyAssignmentReportsList();
  /**
   *
   *
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport os_policy_assignment_reports = 1;
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport getOsPolicyAssignmentReports(
      int index);
  /**
   *
   *
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport os_policy_assignment_reports = 1;
   * </code>
   */
  int getOsPolicyAssignmentReportsCount();
  /**
   *
   *
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport os_policy_assignment_reports = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportOrBuilder>
      getOsPolicyAssignmentReportsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of OS policy assignment reports.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.osconfig.v1alpha.OSPolicyAssignmentReport os_policy_assignment_reports = 1;
   * </code>
   */
  com.google.cloud.osconfig.v1alpha.OSPolicyAssignmentReportOrBuilder
      getOsPolicyAssignmentReportsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignment
   * report objects.
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
   * The pagination token to retrieve the next page of OS policy assignment
   * report objects.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
