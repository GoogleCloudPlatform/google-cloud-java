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
// source: google/cloud/datacatalog/v1/search.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1;

public interface SearchCatalogResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.SearchCatalogResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the search result.
   *
   * You can use this field to determine which get method to call to fetch the
   * full resource.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SearchResultType search_result_type = 1;</code>
   *
   * @return The enum numeric value on the wire for searchResultType.
   */
  int getSearchResultTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the search result.
   *
   * You can use this field to determine which get method to call to fetch the
   * full resource.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SearchResultType search_result_type = 1;</code>
   *
   * @return The searchResultType.
   */
  com.google.cloud.datacatalog.v1.SearchResultType getSearchResultType();

  /**
   *
   *
   * <pre>
   * Sub-type of the search result.
   *
   * A dot-delimited full type of the resource. The same type you
   * specify in the `type` search predicate.
   *
   * Examples: `entry.table`, `entry.dataStream`, `tagTemplate`.
   * </pre>
   *
   * <code>string search_result_subtype = 2;</code>
   *
   * @return The searchResultSubtype.
   */
  java.lang.String getSearchResultSubtype();
  /**
   *
   *
   * <pre>
   * Sub-type of the search result.
   *
   * A dot-delimited full type of the resource. The same type you
   * specify in the `type` search predicate.
   *
   * Examples: `entry.table`, `entry.dataStream`, `tagTemplate`.
   * </pre>
   *
   * <code>string search_result_subtype = 2;</code>
   *
   * @return The bytes for searchResultSubtype.
   */
  com.google.protobuf.ByteString getSearchResultSubtypeBytes();

  /**
   *
   *
   * <pre>
   * The relative name of the resource in URL format.
   *
   * Examples:
   *
   *  * `projects/{PROJECT_ID}/locations/{LOCATION_ID}/entryGroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`
   *  * `projects/{PROJECT_ID}/tagTemplates/{TAG_TEMPLATE_ID}`
   * </pre>
   *
   * <code>string relative_resource_name = 3;</code>
   *
   * @return The relativeResourceName.
   */
  java.lang.String getRelativeResourceName();
  /**
   *
   *
   * <pre>
   * The relative name of the resource in URL format.
   *
   * Examples:
   *
   *  * `projects/{PROJECT_ID}/locations/{LOCATION_ID}/entryGroups/{ENTRY_GROUP_ID}/entries/{ENTRY_ID}`
   *  * `projects/{PROJECT_ID}/tagTemplates/{TAG_TEMPLATE_ID}`
   * </pre>
   *
   * <code>string relative_resource_name = 3;</code>
   *
   * @return The bytes for relativeResourceName.
   */
  com.google.protobuf.ByteString getRelativeResourceNameBytes();

  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud resource the entry belongs to.
   *
   * For more information, see [Full Resource Name]
   * (/apis/design/resource_names#full_resource_name).
   *
   * Example:
   *
   * `//bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID`
   * </pre>
   *
   * <code>string linked_resource = 4;</code>
   *
   * @return The linkedResource.
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * The full name of the Google Cloud resource the entry belongs to.
   *
   * For more information, see [Full Resource Name]
   * (/apis/design/resource_names#full_resource_name).
   *
   * Example:
   *
   * `//bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID`
   * </pre>
   *
   * <code>string linked_resource = 4;</code>
   *
   * @return The bytes for linkedResource.
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * The last modification timestamp of the entry in the source system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 7;</code>
   *
   * @return Whether the modifyTime field is set.
   */
  boolean hasModifyTime();
  /**
   *
   *
   * <pre>
   * The last modification timestamp of the entry in the source system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 7;</code>
   *
   * @return The modifyTime.
   */
  com.google.protobuf.Timestamp getModifyTime();
  /**
   *
   *
   * <pre>
   * The last modification timestamp of the entry in the source system.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp modify_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifyTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The source system that Data Catalog automatically integrates
   * with, such as BigQuery, Cloud Pub/Sub, or Dataproc Metastore.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.IntegratedSystem integrated_system = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the integratedSystem field is set.
   */
  boolean hasIntegratedSystem();
  /**
   *
   *
   * <pre>
   * Output only. The source system that Data Catalog automatically integrates
   * with, such as BigQuery, Cloud Pub/Sub, or Dataproc Metastore.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.IntegratedSystem integrated_system = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for integratedSystem.
   */
  int getIntegratedSystemValue();
  /**
   *
   *
   * <pre>
   * Output only. The source system that Data Catalog automatically integrates
   * with, such as BigQuery, Cloud Pub/Sub, or Dataproc Metastore.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.IntegratedSystem integrated_system = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The integratedSystem.
   */
  com.google.cloud.datacatalog.v1.IntegratedSystem getIntegratedSystem();

  /**
   *
   *
   * <pre>
   * Custom source system that you can manually integrate Data Catalog with.
   * </pre>
   *
   * <code>string user_specified_system = 9;</code>
   *
   * @return Whether the userSpecifiedSystem field is set.
   */
  boolean hasUserSpecifiedSystem();
  /**
   *
   *
   * <pre>
   * Custom source system that you can manually integrate Data Catalog with.
   * </pre>
   *
   * <code>string user_specified_system = 9;</code>
   *
   * @return The userSpecifiedSystem.
   */
  java.lang.String getUserSpecifiedSystem();
  /**
   *
   *
   * <pre>
   * Custom source system that you can manually integrate Data Catalog with.
   * </pre>
   *
   * <code>string user_specified_system = 9;</code>
   *
   * @return The bytes for userSpecifiedSystem.
   */
  com.google.protobuf.ByteString getUserSpecifiedSystemBytes();

  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the resource.
   *
   * FQNs take two forms:
   *
   * * For non-regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * * For regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * Example for a DPMS table:
   *
   * `dataproc_metastore:PROJECT_ID.LOCATION_ID.INSTANCE_ID.DATABASE_ID.TABLE_ID`
   * </pre>
   *
   * <code>string fully_qualified_name = 10;</code>
   *
   * @return The fullyQualifiedName.
   */
  java.lang.String getFullyQualifiedName();
  /**
   *
   *
   * <pre>
   * Fully qualified name (FQN) of the resource.
   *
   * FQNs take two forms:
   *
   * * For non-regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * * For regionalized resources:
   *
   *   `{SYSTEM}:{PROJECT}.{LOCATION_ID}.{PATH_TO_RESOURCE_SEPARATED_WITH_DOTS}`
   *
   * Example for a DPMS table:
   *
   * `dataproc_metastore:PROJECT_ID.LOCATION_ID.INSTANCE_ID.DATABASE_ID.TABLE_ID`
   * </pre>
   *
   * <code>string fully_qualified_name = 10;</code>
   *
   * @return The bytes for fullyQualifiedName.
   */
  com.google.protobuf.ByteString getFullyQualifiedNameBytes();

  /**
   *
   *
   * <pre>
   * The display name of the result.
   * </pre>
   *
   * <code>string display_name = 12;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the result.
   * </pre>
   *
   * <code>string display_name = 12;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Entry description that can consist of several sentences or paragraphs that
   * describe entry contents.
   * </pre>
   *
   * <code>string description = 13;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Entry description that can consist of several sentences or paragraphs that
   * describe entry contents.
   * </pre>
   *
   * <code>string description = 13;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  com.google.cloud.datacatalog.v1.SearchCatalogResult.SystemCase getSystemCase();
}
