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
// source: google/cloud/securitycenter/v2/resource.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public interface GcpMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.GcpMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full resource name of project that the resource belongs to.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The project.
   */
  java.lang.String getProject();
  /**
   *
   *
   * <pre>
   * The full resource name of project that the resource belongs to.
   * </pre>
   *
   * <code>string project = 1;</code>
   *
   * @return The bytes for project.
   */
  com.google.protobuf.ByteString getProjectBytes();

  /**
   *
   *
   * <pre>
   * The project ID that the resource belongs to.
   * </pre>
   *
   * <code>string project_display_name = 2;</code>
   *
   * @return The projectDisplayName.
   */
  java.lang.String getProjectDisplayName();
  /**
   *
   *
   * <pre>
   * The project ID that the resource belongs to.
   * </pre>
   *
   * <code>string project_display_name = 2;</code>
   *
   * @return The bytes for projectDisplayName.
   */
  com.google.protobuf.ByteString getProjectDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The full resource name of resource's parent.
   * </pre>
   *
   * <code>string parent = 3;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The full resource name of resource's parent.
   * </pre>
   *
   * <code>string parent = 3;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The human readable name of resource's parent.
   * </pre>
   *
   * <code>string parent_display_name = 4;</code>
   *
   * @return The parentDisplayName.
   */
  java.lang.String getParentDisplayName();
  /**
   *
   *
   * <pre>
   * The human readable name of resource's parent.
   * </pre>
   *
   * <code>string parent_display_name = 4;</code>
   *
   * @return The bytes for parentDisplayName.
   */
  com.google.protobuf.ByteString getParentDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets
   * ancestry. The first folder is the deepest nested folder, and the last
   * folder is the folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.Folder folders = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.securitycenter.v2.Folder> getFoldersList();
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets
   * ancestry. The first folder is the deepest nested folder, and the last
   * folder is the folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.Folder folders = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v2.Folder getFolders(int index);
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets
   * ancestry. The first folder is the deepest nested folder, and the last
   * folder is the folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.Folder folders = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getFoldersCount();
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets
   * ancestry. The first folder is the deepest nested folder, and the last
   * folder is the folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.Folder folders = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v2.FolderOrBuilder>
      getFoldersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Contains a Folder message for each folder in the assets
   * ancestry. The first folder is the deepest nested folder, and the last
   * folder is the folder directly under the Organization.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.securitycenter.v2.Folder folders = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.securitycenter.v2.FolderOrBuilder getFoldersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The name of the organization that the resource belongs to.
   * </pre>
   *
   * <code>string organization = 6;</code>
   *
   * @return The organization.
   */
  java.lang.String getOrganization();
  /**
   *
   *
   * <pre>
   * The name of the organization that the resource belongs to.
   * </pre>
   *
   * <code>string organization = 6;</code>
   *
   * @return The bytes for organization.
   */
  com.google.protobuf.ByteString getOrganizationBytes();
}
