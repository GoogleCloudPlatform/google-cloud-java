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

public interface CreateAzureClusterRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.CreateAzureClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent location where this
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resource will be
   * created.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
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
   * Required. The parent location where this
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resource will be
   * created.
   *
   * Location names are formatted as `projects/&lt;project-id&gt;/locations/&lt;region&gt;`.
   *
   * See [Resource Names](https://cloud.google.com/apis/design/resource_names)
   * for more details on Google Cloud resource names.
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
   * Required. The specification of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureCluster azure_cluster = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the azureCluster field is set.
   */
  boolean hasAzureCluster();
  /**
   *
   *
   * <pre>
   * Required. The specification of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureCluster azure_cluster = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The azureCluster.
   */
  com.google.cloud.gkemulticloud.v1.AzureCluster getAzureCluster();
  /**
   *
   *
   * <pre>
   * Required. The specification of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] to create.
   * </pre>
   *
   * <code>
   * .google.cloud.gkemulticloud.v1.AzureCluster azure_cluster = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureClusterOrBuilder getAzureClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. A client provided ID the resource. Must be unique within the
   * parent resource.
   *
   * The provided ID will be part of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resource name
   * formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;`.
   *
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   * </pre>
   *
   * <code>string azure_cluster_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The azureClusterId.
   */
  java.lang.String getAzureClusterId();
  /**
   *
   *
   * <pre>
   * Required. A client provided ID the resource. Must be unique within the
   * parent resource.
   *
   * The provided ID will be part of the
   * [AzureCluster][google.cloud.gkemulticloud.v1.AzureCluster] resource name
   * formatted as
   * `projects/&lt;project-id&gt;/locations/&lt;region&gt;/azureClusters/&lt;cluster-id&gt;`.
   *
   * Valid characters are `/[a-z][0-9]-/`. Cannot be longer than 63 characters.
   * </pre>
   *
   * <code>string azure_cluster_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for azureClusterId.
   */
  com.google.protobuf.ByteString getAzureClusterIdBytes();

  /**
   *
   *
   * <pre>
   * If set, only validate the request, but do not actually create the cluster.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   *
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
