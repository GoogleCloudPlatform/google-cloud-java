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
// source: google/cloud/gkemulticloud/v1/azure_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkemulticloud.v1;

public interface UpdateAzureClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.UpdateAzureClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]
   * resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureCluster azure_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the azureCluster field is set.
   */
  boolean hasAzureCluster();
  /**
   *
   *
   * <pre>
   * Required. The [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]
   * resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureCluster azure_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The azureCluster.
   */
  com.google.cloud.gkemulticloud.v1.AzureCluster getAzureCluster();
  /**
   *
   *
   * <pre>
   * Required. The [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]
   * resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureCluster azure_cluster = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder getAzureClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * If set, only validate the request, but do not actually update the cluster.
   * </pre>
   *
   * <code>bool validate_only = 2;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();

  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]:
   *
   *  *   `description`.
   *  *   `azureClient`.
   *  *   `control_plane.version`.
   *  *   `control_plane.vm_size`.
   *  *   `annotations`.
   *  *   `authorization.admin_users`.
   *  *   `authorization.admin_groups`.
   *  *   `control_plane.root_volume.size_gib`.
   *  *   `azure_services_authentication`.
   *  *   `azure_services_authentication.tenant_id`.
   *  *   `azure_services_authentication.application_id`.
   *  *   `control_plane.proxy_config`.
   *  *   `control_plane.proxy_config.resource_group_id`.
   *  *   `control_plane.proxy_config.secret_id`.
   *  *   `control_plane.ssh_config.authorized_key`.
   *  *   `logging_config.component_config.enable_components`
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]:
   *
   *  *   `description`.
   *  *   `azureClient`.
   *  *   `control_plane.version`.
   *  *   `control_plane.vm_size`.
   *  *   `annotations`.
   *  *   `authorization.admin_users`.
   *  *   `authorization.admin_groups`.
   *  *   `control_plane.root_volume.size_gib`.
   *  *   `azure_services_authentication`.
   *  *   `azure_services_authentication.tenant_id`.
   *  *   `azure_services_authentication.application_id`.
   *  *   `control_plane.proxy_config`.
   *  *   `control_plane.proxy_config.resource_group_id`.
   *  *   `control_plane.proxy_config.secret_id`.
   *  *   `control_plane.ssh_config.authorized_key`.
   *  *   `logging_config.component_config.enable_components`
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. Mask of fields to update. At least one path must be supplied in
   * this field. The elements of the repeated paths field can only include these
   * fields from [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster]:
   *
   *  *   `description`.
   *  *   `azureClient`.
   *  *   `control_plane.version`.
   *  *   `control_plane.vm_size`.
   *  *   `annotations`.
   *  *   `authorization.admin_users`.
   *  *   `authorization.admin_groups`.
   *  *   `control_plane.root_volume.size_gib`.
   *  *   `azure_services_authentication`.
   *  *   `azure_services_authentication.tenant_id`.
   *  *   `azure_services_authentication.application_id`.
   *  *   `control_plane.proxy_config`.
   *  *   `control_plane.proxy_config.resource_group_id`.
   *  *   `control_plane.proxy_config.secret_id`.
   *  *   `control_plane.ssh_config.authorized_key`.
   *  *   `logging_config.component_config.enable_components`
   *  *   `monitoring_config.managed_prometheus_config.enabled`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
