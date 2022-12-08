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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface CreateNotificationConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateNotificationConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the new notification config's parent. Its format
   * is "organizations/[organization_id]", "folders/[folder_id]", or
   * "projects/[project_id]".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Resource name of the new notification config's parent. Its format
   * is "organizations/[organization_id]", "folders/[folder_id]", or
   * "projects/[project_id]".
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required.
   * Unique identifier provided by the client within the parent scope.
   * It must be between 1 and 128 characters and contain alphanumeric
   * characters, underscores, or hyphens only.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The configId.
   */
  java.lang.String getConfigId();
  /**
   *
   *
   * <pre>
   * Required.
   * Unique identifier provided by the client within the parent scope.
   * It must be between 1 and 128 characters and contain alphanumeric
   * characters, underscores, or hyphens only.
   * </pre>
   *
   * <code>string config_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for configId.
   */
  com.google.protobuf.ByteString getConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The notification config being created. The name and the service
   * account will be ignored as they are both output only fields on this
   * resource.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.NotificationConfig notification_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the notificationConfig field is set.
   */
  boolean hasNotificationConfig();
  /**
   *
   *
   * <pre>
   * Required. The notification config being created. The name and the service
   * account will be ignored as they are both output only fields on this
   * resource.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.NotificationConfig notification_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The notificationConfig.
   */
  com.google.cloud.securitycenter.v1.NotificationConfig getNotificationConfig();
  /**
   *
   *
   * <pre>
   * Required. The notification config being created. The name and the service
   * account will be ignored as they are both output only fields on this
   * resource.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.NotificationConfig notification_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1.NotificationConfigOrBuilder getNotificationConfigOrBuilder();
}
