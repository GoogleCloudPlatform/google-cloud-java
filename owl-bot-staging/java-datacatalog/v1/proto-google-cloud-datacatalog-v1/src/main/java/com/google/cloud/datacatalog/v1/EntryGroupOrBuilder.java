// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface EntryGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.EntryGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the entry group in URL format.
   *
   * Note: The entry group itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the entry group in URL format.
   *
   * Note: The entry group itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A short name to identify the entry group, for example,
   * "analytics data - jan 2011". Default value is an empty string.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A short name to identify the entry group, for example,
   * "analytics data - jan 2011". Default value is an empty string.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Entry group description. Can consist of several sentences or
   * paragraphs that describe the entry group contents.
   * Default value is an empty string.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Entry group description. Can consist of several sentences or
   * paragraphs that describe the entry group contents.
   * Default value is an empty string.
   * </pre>
   *
   * <code>string description = 3;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. Timestamps of the entry group. Default value is empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SystemTimestamps data_catalog_timestamps = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the dataCatalogTimestamps field is set.
   */
  boolean hasDataCatalogTimestamps();
  /**
   * <pre>
   * Output only. Timestamps of the entry group. Default value is empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SystemTimestamps data_catalog_timestamps = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The dataCatalogTimestamps.
   */
  com.google.cloud.datacatalog.v1.SystemTimestamps getDataCatalogTimestamps();
  /**
   * <pre>
   * Output only. Timestamps of the entry group. Default value is empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.SystemTimestamps data_catalog_timestamps = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.datacatalog.v1.SystemTimestampsOrBuilder getDataCatalogTimestampsOrBuilder();
}
