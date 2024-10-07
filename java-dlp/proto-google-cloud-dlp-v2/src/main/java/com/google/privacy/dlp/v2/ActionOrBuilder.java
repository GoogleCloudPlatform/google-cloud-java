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

public interface ActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Action)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Save resulting findings in a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.SaveFindings save_findings = 1;</code>
   *
   * @return Whether the saveFindings field is set.
   */
  boolean hasSaveFindings();
  /**
   *
   *
   * <pre>
   * Save resulting findings in a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.SaveFindings save_findings = 1;</code>
   *
   * @return The saveFindings.
   */
  com.google.privacy.dlp.v2.Action.SaveFindings getSaveFindings();
  /**
   *
   *
   * <pre>
   * Save resulting findings in a provided location.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.SaveFindings save_findings = 1;</code>
   */
  com.google.privacy.dlp.v2.Action.SaveFindingsOrBuilder getSaveFindingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Publish a notification to a Pub/Sub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToPubSub pub_sub = 2;</code>
   *
   * @return Whether the pubSub field is set.
   */
  boolean hasPubSub();
  /**
   *
   *
   * <pre>
   * Publish a notification to a Pub/Sub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToPubSub pub_sub = 2;</code>
   *
   * @return The pubSub.
   */
  com.google.privacy.dlp.v2.Action.PublishToPubSub getPubSub();
  /**
   *
   *
   * <pre>
   * Publish a notification to a Pub/Sub topic.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToPubSub pub_sub = 2;</code>
   */
  com.google.privacy.dlp.v2.Action.PublishToPubSubOrBuilder getPubSubOrBuilder();

  /**
   *
   *
   * <pre>
   * Publish summary to Cloud Security Command Center (Alpha).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishSummaryToCscc publish_summary_to_cscc = 3;</code>
   *
   * @return Whether the publishSummaryToCscc field is set.
   */
  boolean hasPublishSummaryToCscc();
  /**
   *
   *
   * <pre>
   * Publish summary to Cloud Security Command Center (Alpha).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishSummaryToCscc publish_summary_to_cscc = 3;</code>
   *
   * @return The publishSummaryToCscc.
   */
  com.google.privacy.dlp.v2.Action.PublishSummaryToCscc getPublishSummaryToCscc();
  /**
   *
   *
   * <pre>
   * Publish summary to Cloud Security Command Center (Alpha).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishSummaryToCscc publish_summary_to_cscc = 3;</code>
   */
  com.google.privacy.dlp.v2.Action.PublishSummaryToCsccOrBuilder getPublishSummaryToCsccOrBuilder();

  /**
   *
   *
   * <pre>
   * Publish findings to Cloud Datahub.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.Action.PublishFindingsToCloudDataCatalog publish_findings_to_cloud_data_catalog = 5;
   * </code>
   *
   * @return Whether the publishFindingsToCloudDataCatalog field is set.
   */
  boolean hasPublishFindingsToCloudDataCatalog();
  /**
   *
   *
   * <pre>
   * Publish findings to Cloud Datahub.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.Action.PublishFindingsToCloudDataCatalog publish_findings_to_cloud_data_catalog = 5;
   * </code>
   *
   * @return The publishFindingsToCloudDataCatalog.
   */
  com.google.privacy.dlp.v2.Action.PublishFindingsToCloudDataCatalog
      getPublishFindingsToCloudDataCatalog();
  /**
   *
   *
   * <pre>
   * Publish findings to Cloud Datahub.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.Action.PublishFindingsToCloudDataCatalog publish_findings_to_cloud_data_catalog = 5;
   * </code>
   */
  com.google.privacy.dlp.v2.Action.PublishFindingsToCloudDataCatalogOrBuilder
      getPublishFindingsToCloudDataCatalogOrBuilder();

  /**
   *
   *
   * <pre>
   * Create a de-identified copy of the input data.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.Deidentify deidentify = 7;</code>
   *
   * @return Whether the deidentify field is set.
   */
  boolean hasDeidentify();
  /**
   *
   *
   * <pre>
   * Create a de-identified copy of the input data.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.Deidentify deidentify = 7;</code>
   *
   * @return The deidentify.
   */
  com.google.privacy.dlp.v2.Action.Deidentify getDeidentify();
  /**
   *
   *
   * <pre>
   * Create a de-identified copy of the input data.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.Deidentify deidentify = 7;</code>
   */
  com.google.privacy.dlp.v2.Action.DeidentifyOrBuilder getDeidentifyOrBuilder();

  /**
   *
   *
   * <pre>
   * Sends an email when the job completes. The email goes to IAM project
   * owners and technical [Essential
   * Contacts](https://cloud.google.com/resource-manager/docs/managing-notification-contacts).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.JobNotificationEmails job_notification_emails = 8;</code>
   *
   * @return Whether the jobNotificationEmails field is set.
   */
  boolean hasJobNotificationEmails();
  /**
   *
   *
   * <pre>
   * Sends an email when the job completes. The email goes to IAM project
   * owners and technical [Essential
   * Contacts](https://cloud.google.com/resource-manager/docs/managing-notification-contacts).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.JobNotificationEmails job_notification_emails = 8;</code>
   *
   * @return The jobNotificationEmails.
   */
  com.google.privacy.dlp.v2.Action.JobNotificationEmails getJobNotificationEmails();
  /**
   *
   *
   * <pre>
   * Sends an email when the job completes. The email goes to IAM project
   * owners and technical [Essential
   * Contacts](https://cloud.google.com/resource-manager/docs/managing-notification-contacts).
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.JobNotificationEmails job_notification_emails = 8;</code>
   */
  com.google.privacy.dlp.v2.Action.JobNotificationEmailsOrBuilder
      getJobNotificationEmailsOrBuilder();

  /**
   *
   *
   * <pre>
   * Enable Stackdriver metric dlp.googleapis.com/finding_count.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToStackdriver publish_to_stackdriver = 9;</code>
   *
   * @return Whether the publishToStackdriver field is set.
   */
  boolean hasPublishToStackdriver();
  /**
   *
   *
   * <pre>
   * Enable Stackdriver metric dlp.googleapis.com/finding_count.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToStackdriver publish_to_stackdriver = 9;</code>
   *
   * @return The publishToStackdriver.
   */
  com.google.privacy.dlp.v2.Action.PublishToStackdriver getPublishToStackdriver();
  /**
   *
   *
   * <pre>
   * Enable Stackdriver metric dlp.googleapis.com/finding_count.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Action.PublishToStackdriver publish_to_stackdriver = 9;</code>
   */
  com.google.privacy.dlp.v2.Action.PublishToStackdriverOrBuilder getPublishToStackdriverOrBuilder();

  com.google.privacy.dlp.v2.Action.ActionCase getActionCase();
}
