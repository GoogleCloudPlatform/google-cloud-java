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

public interface DataProfileActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataProfileAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Export data profiles into a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.Export export_data = 1;</code>
   *
   * @return Whether the exportData field is set.
   */
  boolean hasExportData();
  /**
   *
   *
   * <pre>
   * Export data profiles into a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.Export export_data = 1;</code>
   *
   * @return The exportData.
   */
  com.google.privacy.dlp.v2.DataProfileAction.Export getExportData();
  /**
   *
   *
   * <pre>
   * Export data profiles into a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.Export export_data = 1;</code>
   */
  com.google.privacy.dlp.v2.DataProfileAction.ExportOrBuilder getExportDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Publish a message into the Pub/Sub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.PubSubNotification pub_sub_notification = 2;
   * </code>
   *
   * @return Whether the pubSubNotification field is set.
   */
  boolean hasPubSubNotification();
  /**
   *
   *
   * <pre>
   * Publish a message into the Pub/Sub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.PubSubNotification pub_sub_notification = 2;
   * </code>
   *
   * @return The pubSubNotification.
   */
  com.google.privacy.dlp.v2.DataProfileAction.PubSubNotification getPubSubNotification();
  /**
   *
   *
   * <pre>
   * Publish a message into the Pub/Sub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.PubSubNotification pub_sub_notification = 2;
   * </code>
   */
  com.google.privacy.dlp.v2.DataProfileAction.PubSubNotificationOrBuilder
      getPubSubNotificationOrBuilder();

  /**
   *
   *
   * <pre>
   * Publishes generated data profiles to Google Security Operations.
   * For more information, see [Use Sensitive Data Protection data in
   * context-aware
   * analytics](https://cloud.google.com/chronicle/docs/detection/usecase-dlp-high-risk-user-download).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.PublishToChronicle publish_to_chronicle = 3;
   * </code>
   *
   * @return Whether the publishToChronicle field is set.
   */
  boolean hasPublishToChronicle();
  /**
   *
   *
   * <pre>
   * Publishes generated data profiles to Google Security Operations.
   * For more information, see [Use Sensitive Data Protection data in
   * context-aware
   * analytics](https://cloud.google.com/chronicle/docs/detection/usecase-dlp-high-risk-user-download).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.PublishToChronicle publish_to_chronicle = 3;
   * </code>
   *
   * @return The publishToChronicle.
   */
  com.google.privacy.dlp.v2.DataProfileAction.PublishToChronicle getPublishToChronicle();
  /**
   *
   *
   * <pre>
   * Publishes generated data profiles to Google Security Operations.
   * For more information, see [Use Sensitive Data Protection data in
   * context-aware
   * analytics](https://cloud.google.com/chronicle/docs/detection/usecase-dlp-high-risk-user-download).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.PublishToChronicle publish_to_chronicle = 3;
   * </code>
   */
  com.google.privacy.dlp.v2.DataProfileAction.PublishToChronicleOrBuilder
      getPublishToChronicleOrBuilder();

  /**
   *
   *
   * <pre>
   * Publishes findings to SCC for each data profile.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DataProfileAction.PublishToSecurityCommandCenter publish_to_scc = 4;
   * </code>
   *
   * @return Whether the publishToScc field is set.
   */
  boolean hasPublishToScc();
  /**
   *
   *
   * <pre>
   * Publishes findings to SCC for each data profile.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DataProfileAction.PublishToSecurityCommandCenter publish_to_scc = 4;
   * </code>
   *
   * @return The publishToScc.
   */
  com.google.privacy.dlp.v2.DataProfileAction.PublishToSecurityCommandCenter getPublishToScc();
  /**
   *
   *
   * <pre>
   * Publishes findings to SCC for each data profile.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DataProfileAction.PublishToSecurityCommandCenter publish_to_scc = 4;
   * </code>
   */
  com.google.privacy.dlp.v2.DataProfileAction.PublishToSecurityCommandCenterOrBuilder
      getPublishToSccOrBuilder();

  /**
   *
   *
   * <pre>
   * Tags the profiled resources with the specified tag values.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.TagResources tag_resources = 8;</code>
   *
   * @return Whether the tagResources field is set.
   */
  boolean hasTagResources();
  /**
   *
   *
   * <pre>
   * Tags the profiled resources with the specified tag values.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.TagResources tag_resources = 8;</code>
   *
   * @return The tagResources.
   */
  com.google.privacy.dlp.v2.DataProfileAction.TagResources getTagResources();
  /**
   *
   *
   * <pre>
   * Tags the profiled resources with the specified tag values.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.TagResources tag_resources = 8;</code>
   */
  com.google.privacy.dlp.v2.DataProfileAction.TagResourcesOrBuilder getTagResourcesOrBuilder();

  com.google.privacy.dlp.v2.DataProfileAction.ActionCase getActionCase();
}
