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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface DataProfileConfigSnapshotOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataProfileConfigSnapshot)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return Whether the inspectConfig field is set.
   */
  boolean hasInspectConfig();
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   *
   * @return The inspectConfig.
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   *
   *
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile. This is
   * deprecated, and the DiscoveryConfig field is preferred moving forward.
   * DataProfileJobConfig will still be written here for Discovery in BigQuery
   * for backwards compatibility, but will not be updated with new fields, while
   * DiscoveryConfig will.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3 [deprecated = true];
   * </code>
   *
   * @deprecated google.privacy.dlp.v2.DataProfileConfigSnapshot.data_profile_job is deprecated. See
   *     google/privacy/dlp/v2/dlp.proto;l=7251
   * @return Whether the dataProfileJob field is set.
   */
  @java.lang.Deprecated
  boolean hasDataProfileJob();
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile. This is
   * deprecated, and the DiscoveryConfig field is preferred moving forward.
   * DataProfileJobConfig will still be written here for Discovery in BigQuery
   * for backwards compatibility, but will not be updated with new fields, while
   * DiscoveryConfig will.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3 [deprecated = true];
   * </code>
   *
   * @deprecated google.privacy.dlp.v2.DataProfileConfigSnapshot.data_profile_job is deprecated. See
   *     google/privacy/dlp/v2/dlp.proto;l=7251
   * @return The dataProfileJob.
   */
  @java.lang.Deprecated
  com.google.privacy.dlp.v2.DataProfileJobConfig getDataProfileJob();
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile. This is
   * deprecated, and the DiscoveryConfig field is preferred moving forward.
   * DataProfileJobConfig will still be written here for Discovery in BigQuery
   * for backwards compatibility, but will not be updated with new fields, while
   * DiscoveryConfig will.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder getDataProfileJobOrBuilder();

  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryConfig discovery_config = 4;</code>
   *
   * @return Whether the discoveryConfig field is set.
   */
  boolean hasDiscoveryConfig();
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryConfig discovery_config = 4;</code>
   *
   * @return The discoveryConfig.
   */
  com.google.privacy.dlp.v2.DiscoveryConfig getDiscoveryConfig();
  /**
   *
   *
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryConfig discovery_config = 4;</code>
   */
  com.google.privacy.dlp.v2.DiscoveryConfigOrBuilder getDiscoveryConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Name of the inspection template used to generate this profile
   * </pre>
   *
   * <code>string inspect_template_name = 5;</code>
   *
   * @return The inspectTemplateName.
   */
  java.lang.String getInspectTemplateName();
  /**
   *
   *
   * <pre>
   * Name of the inspection template used to generate this profile
   * </pre>
   *
   * <code>string inspect_template_name = 5;</code>
   *
   * @return The bytes for inspectTemplateName.
   */
  com.google.protobuf.ByteString getInspectTemplateNameBytes();

  /**
   *
   *
   * <pre>
   * Timestamp when the template was modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp inspect_template_modified_time = 6;</code>
   *
   * @return Whether the inspectTemplateModifiedTime field is set.
   */
  boolean hasInspectTemplateModifiedTime();
  /**
   *
   *
   * <pre>
   * Timestamp when the template was modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp inspect_template_modified_time = 6;</code>
   *
   * @return The inspectTemplateModifiedTime.
   */
  com.google.protobuf.Timestamp getInspectTemplateModifiedTime();
  /**
   *
   *
   * <pre>
   * Timestamp when the template was modified
   * </pre>
   *
   * <code>.google.protobuf.Timestamp inspect_template_modified_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getInspectTemplateModifiedTimeOrBuilder();
}
