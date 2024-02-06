// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/dump_content.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface TaggedEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.TaggedEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Non-encrypted Data Catalog v1 Entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry v1_entry = 1;</code>
   * @return Whether the v1Entry field is set.
   */
  boolean hasV1Entry();
  /**
   * <pre>
   * Non-encrypted Data Catalog v1 Entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry v1_entry = 1;</code>
   * @return The v1Entry.
   */
  com.google.cloud.datacatalog.v1.Entry getV1Entry();
  /**
   * <pre>
   * Non-encrypted Data Catalog v1 Entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.Entry v1_entry = 1;</code>
   */
  com.google.cloud.datacatalog.v1.EntryOrBuilder getV1EntryOrBuilder();

  /**
   * <pre>
   * Optional. Tags that should be ingested into the Data Catalog.
   * Caller should populate template name, column and fields.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag present_tags = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.Tag> 
      getPresentTagsList();
  /**
   * <pre>
   * Optional. Tags that should be ingested into the Data Catalog.
   * Caller should populate template name, column and fields.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag present_tags = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.v1.Tag getPresentTags(int index);
  /**
   * <pre>
   * Optional. Tags that should be ingested into the Data Catalog.
   * Caller should populate template name, column and fields.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag present_tags = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPresentTagsCount();
  /**
   * <pre>
   * Optional. Tags that should be ingested into the Data Catalog.
   * Caller should populate template name, column and fields.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag present_tags = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.TagOrBuilder> 
      getPresentTagsOrBuilderList();
  /**
   * <pre>
   * Optional. Tags that should be ingested into the Data Catalog.
   * Caller should populate template name, column and fields.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag present_tags = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.v1.TagOrBuilder getPresentTagsOrBuilder(
      int index);

  /**
   * <pre>
   * Optional. Tags that should be deleted from the Data Catalog.
   * Caller should populate template name and column only.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag absent_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.Tag> 
      getAbsentTagsList();
  /**
   * <pre>
   * Optional. Tags that should be deleted from the Data Catalog.
   * Caller should populate template name and column only.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag absent_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.v1.Tag getAbsentTags(int index);
  /**
   * <pre>
   * Optional. Tags that should be deleted from the Data Catalog.
   * Caller should populate template name and column only.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag absent_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAbsentTagsCount();
  /**
   * <pre>
   * Optional. Tags that should be deleted from the Data Catalog.
   * Caller should populate template name and column only.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag absent_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.TagOrBuilder> 
      getAbsentTagsOrBuilderList();
  /**
   * <pre>
   * Optional. Tags that should be deleted from the Data Catalog.
   * Caller should populate template name and column only.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.Tag absent_tags = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.v1.TagOrBuilder getAbsentTagsOrBuilder(
      int index);

  com.google.cloud.datacatalog.v1.TaggedEntry.EntryCase getEntryCase();
}
