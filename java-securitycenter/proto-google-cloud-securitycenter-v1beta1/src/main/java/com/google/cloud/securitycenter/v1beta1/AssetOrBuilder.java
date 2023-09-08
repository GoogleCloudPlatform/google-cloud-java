/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/securitycenter/v1beta1/asset.proto

package com.google.cloud.securitycenter.v1beta1;

public interface AssetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1beta1.Asset)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this asset. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/assets/{asset_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of this asset. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/assets/{asset_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Security Command Center managed properties. These properties are managed by
   * Security Command Center and cannot be modified by the user.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties security_center_properties = 2;
   * </code>
   *
   * @return Whether the securityCenterProperties field is set.
   */
  boolean hasSecurityCenterProperties();
  /**
   *
   *
   * <pre>
   * Security Command Center managed properties. These properties are managed by
   * Security Command Center and cannot be modified by the user.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties security_center_properties = 2;
   * </code>
   *
   * @return The securityCenterProperties.
   */
  com.google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties
      getSecurityCenterProperties();
  /**
   *
   *
   * <pre>
   * Security Command Center managed properties. These properties are managed by
   * Security Command Center and cannot be modified by the user.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties security_center_properties = 2;
   * </code>
   */
  com.google.cloud.securitycenter.v1beta1.Asset.SecurityCenterPropertiesOrBuilder
      getSecurityCenterPropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource managed properties. These properties are managed and defined by
   * the Google Cloud resource and cannot be modified by the user.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; resource_properties = 7;</code>
   */
  int getResourcePropertiesCount();
  /**
   *
   *
   * <pre>
   * Resource managed properties. These properties are managed and defined by
   * the Google Cloud resource and cannot be modified by the user.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; resource_properties = 7;</code>
   */
  boolean containsResourceProperties(java.lang.String key);
  /** Use {@link #getResourcePropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getResourceProperties();
  /**
   *
   *
   * <pre>
   * Resource managed properties. These properties are managed and defined by
   * the Google Cloud resource and cannot be modified by the user.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; resource_properties = 7;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getResourcePropertiesMap();
  /**
   *
   *
   * <pre>
   * Resource managed properties. These properties are managed and defined by
   * the Google Cloud resource and cannot be modified by the user.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; resource_properties = 7;</code>
   */
  /* nullable */
  com.google.protobuf.Value getResourcePropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Resource managed properties. These properties are managed and defined by
   * the Google Cloud resource and cannot be modified by the user.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; resource_properties = 7;</code>
   */
  com.google.protobuf.Value getResourcePropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * User specified security marks. These marks are entirely managed by the user
   * and come from the SecurityMarks resource that belongs to the asset.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.SecurityMarks security_marks = 8;</code>
   *
   * @return Whether the securityMarks field is set.
   */
  boolean hasSecurityMarks();
  /**
   *
   *
   * <pre>
   * User specified security marks. These marks are entirely managed by the user
   * and come from the SecurityMarks resource that belongs to the asset.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.SecurityMarks security_marks = 8;</code>
   *
   * @return The securityMarks.
   */
  com.google.cloud.securitycenter.v1beta1.SecurityMarks getSecurityMarks();
  /**
   *
   *
   * <pre>
   * User specified security marks. These marks are entirely managed by the user
   * and come from the SecurityMarks resource that belongs to the asset.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1beta1.SecurityMarks security_marks = 8;</code>
   */
  com.google.cloud.securitycenter.v1beta1.SecurityMarksOrBuilder getSecurityMarksOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the asset was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the asset was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time at which the asset was created in Security Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which the asset was last updated, added, or deleted in Security
   * Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time at which the asset was last updated, added, or deleted in Security
   * Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time at which the asset was last updated, added, or deleted in Security
   * Command Center.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
