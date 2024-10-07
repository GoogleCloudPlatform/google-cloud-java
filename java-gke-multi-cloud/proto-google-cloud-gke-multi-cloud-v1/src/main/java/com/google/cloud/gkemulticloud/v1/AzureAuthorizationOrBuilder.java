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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.gkemulticloud.v1;

public interface AzureAuthorizationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureAuthorization)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterUser> getAdminUsersList();
  /**
   *
   *
   * <pre>
   * Optional. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureClusterUser getAdminUsers(int index);
  /**
   *
   *
   * <pre>
   * Optional. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAdminUsersCount();
  /**
   *
   *
   * <pre>
   * Optional. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder>
      getAdminUsersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Users that can perform operations as a cluster admin. A managed
   * ClusterRoleBinding will be created to grant the `cluster-admin` ClusterRole
   * to the users. Up to ten admin users can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterUser admin_users = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureClusterUserOrBuilder getAdminUsersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Groups of users that can perform operations as a cluster admin. A
   * managed ClusterRoleBinding will be created to grant the `cluster-admin`
   * ClusterRole to the groups. Up to ten admin groups can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterGroup admin_groups = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.gkemulticloud.v1.AzureClusterGroup> getAdminGroupsList();
  /**
   *
   *
   * <pre>
   * Optional. Groups of users that can perform operations as a cluster admin. A
   * managed ClusterRoleBinding will be created to grant the `cluster-admin`
   * ClusterRole to the groups. Up to ten admin groups can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterGroup admin_groups = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureClusterGroup getAdminGroups(int index);
  /**
   *
   *
   * <pre>
   * Optional. Groups of users that can perform operations as a cluster admin. A
   * managed ClusterRoleBinding will be created to grant the `cluster-admin`
   * ClusterRole to the groups. Up to ten admin groups can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterGroup admin_groups = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAdminGroupsCount();
  /**
   *
   *
   * <pre>
   * Optional. Groups of users that can perform operations as a cluster admin. A
   * managed ClusterRoleBinding will be created to grant the `cluster-admin`
   * ClusterRole to the groups. Up to ten admin groups can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterGroup admin_groups = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkemulticloud.v1.AzureClusterGroupOrBuilder>
      getAdminGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Groups of users that can perform operations as a cluster admin. A
   * managed ClusterRoleBinding will be created to grant the `cluster-admin`
   * ClusterRole to the groups. Up to ten admin groups can be provided.
   *
   * For more info on RBAC, see
   * https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkemulticloud.v1.AzureClusterGroup admin_groups = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.gkemulticloud.v1.AzureClusterGroupOrBuilder getAdminGroupsOrBuilder(int index);
}
