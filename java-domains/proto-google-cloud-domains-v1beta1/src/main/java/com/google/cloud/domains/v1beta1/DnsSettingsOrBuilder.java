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
// source: google/cloud/domains/v1beta1/domains.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.domains.v1beta1;

public interface DnsSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1beta1.DnsSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An arbitrary DNS provider identified by its name servers.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings.CustomDns custom_dns = 1;</code>
   *
   * @return Whether the customDns field is set.
   */
  boolean hasCustomDns();
  /**
   *
   *
   * <pre>
   * An arbitrary DNS provider identified by its name servers.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings.CustomDns custom_dns = 1;</code>
   *
   * @return The customDns.
   */
  com.google.cloud.domains.v1beta1.DnsSettings.CustomDns getCustomDns();
  /**
   *
   *
   * <pre>
   * An arbitrary DNS provider identified by its name servers.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings.CustomDns custom_dns = 1;</code>
   */
  com.google.cloud.domains.v1beta1.DnsSettings.CustomDnsOrBuilder getCustomDnsOrBuilder();

  /**
   *
   *
   * <pre>
   * The free DNS zone provided by
   * [Google Domains](https://domains.google/).
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings.GoogleDomainsDns google_domains_dns = 2;</code>
   *
   * @return Whether the googleDomainsDns field is set.
   */
  boolean hasGoogleDomainsDns();
  /**
   *
   *
   * <pre>
   * The free DNS zone provided by
   * [Google Domains](https://domains.google/).
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings.GoogleDomainsDns google_domains_dns = 2;</code>
   *
   * @return The googleDomainsDns.
   */
  com.google.cloud.domains.v1beta1.DnsSettings.GoogleDomainsDns getGoogleDomainsDns();
  /**
   *
   *
   * <pre>
   * The free DNS zone provided by
   * [Google Domains](https://domains.google/).
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.DnsSettings.GoogleDomainsDns google_domains_dns = 2;</code>
   */
  com.google.cloud.domains.v1beta1.DnsSettings.GoogleDomainsDnsOrBuilder
      getGoogleDomainsDnsOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of glue records for this `Registration`. Commonly empty.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DnsSettings.GlueRecord glue_records = 4;</code>
   */
  java.util.List<com.google.cloud.domains.v1beta1.DnsSettings.GlueRecord> getGlueRecordsList();
  /**
   *
   *
   * <pre>
   * The list of glue records for this `Registration`. Commonly empty.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DnsSettings.GlueRecord glue_records = 4;</code>
   */
  com.google.cloud.domains.v1beta1.DnsSettings.GlueRecord getGlueRecords(int index);
  /**
   *
   *
   * <pre>
   * The list of glue records for this `Registration`. Commonly empty.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DnsSettings.GlueRecord glue_records = 4;</code>
   */
  int getGlueRecordsCount();
  /**
   *
   *
   * <pre>
   * The list of glue records for this `Registration`. Commonly empty.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DnsSettings.GlueRecord glue_records = 4;</code>
   */
  java.util.List<? extends com.google.cloud.domains.v1beta1.DnsSettings.GlueRecordOrBuilder>
      getGlueRecordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of glue records for this `Registration`. Commonly empty.
   * </pre>
   *
   * <code>repeated .google.cloud.domains.v1beta1.DnsSettings.GlueRecord glue_records = 4;</code>
   */
  com.google.cloud.domains.v1beta1.DnsSettings.GlueRecordOrBuilder getGlueRecordsOrBuilder(
      int index);

  com.google.cloud.domains.v1beta1.DnsSettings.DnsProviderCase getDnsProviderCase();
}
