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
// source: google/cloud/commerce/consumer/procurement/v1/license_management_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.commerce.consumer.procurement.v1;

public interface AssignmentProtocolOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Allow manual assignments triggered by administrative operations only.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.ManualAssignmentType manual_assignment_type = 2;
   * </code>
   *
   * @return Whether the manualAssignmentType field is set.
   */
  boolean hasManualAssignmentType();
  /**
   *
   *
   * <pre>
   * Allow manual assignments triggered by administrative operations only.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.ManualAssignmentType manual_assignment_type = 2;
   * </code>
   *
   * @return The manualAssignmentType.
   */
  com.google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.ManualAssignmentType
      getManualAssignmentType();
  /**
   *
   *
   * <pre>
   * Allow manual assignments triggered by administrative operations only.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.ManualAssignmentType manual_assignment_type = 2;
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.ManualAssignmentTypeOrBuilder
      getManualAssignmentTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Allow automatic assignments triggered by data plane operations.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.AutoAssignmentType auto_assignment_type = 3;
   * </code>
   *
   * @return Whether the autoAssignmentType field is set.
   */
  boolean hasAutoAssignmentType();
  /**
   *
   *
   * <pre>
   * Allow automatic assignments triggered by data plane operations.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.AutoAssignmentType auto_assignment_type = 3;
   * </code>
   *
   * @return The autoAssignmentType.
   */
  com.google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.AutoAssignmentType
      getAutoAssignmentType();
  /**
   *
   *
   * <pre>
   * Allow automatic assignments triggered by data plane operations.
   * </pre>
   *
   * <code>
   * .google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.AutoAssignmentType auto_assignment_type = 3;
   * </code>
   */
  com.google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.AutoAssignmentTypeOrBuilder
      getAutoAssignmentTypeOrBuilder();

  com.google.cloud.commerce.consumer.procurement.v1.AssignmentProtocol.AssignmentTypeCase
      getAssignmentTypeCase();
}
