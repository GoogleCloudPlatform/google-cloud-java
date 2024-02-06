// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/tags.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface TagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.Tag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the tag in URL format where tag ID is a
   * system-generated identifier.
   *
   * Note: The tag itself might not be stored in the location specified in its
   * name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the tag in URL format where tag ID is a
   * system-generated identifier.
   *
   * Note: The tag itself might not be stored in the location specified in its
   * name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The resource name of the tag template this tag uses. Example:
   *
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE_ID}`
   *
   * This field cannot be modified after creation.
   * </pre>
   *
   * <code>string template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The template.
   */
  java.lang.String getTemplate();
  /**
   * <pre>
   * Required. The resource name of the tag template this tag uses. Example:
   *
   * `projects/{PROJECT_ID}/locations/{LOCATION}/tagTemplates/{TAG_TEMPLATE_ID}`
   *
   * This field cannot be modified after creation.
   * </pre>
   *
   * <code>string template = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for template.
   */
  com.google.protobuf.ByteString
      getTemplateBytes();

  /**
   * <pre>
   * Output only. The display name of the tag template.
   * </pre>
   *
   * <code>string template_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The templateDisplayName.
   */
  java.lang.String getTemplateDisplayName();
  /**
   * <pre>
   * Output only. The display name of the tag template.
   * </pre>
   *
   * <code>string template_display_name = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for templateDisplayName.
   */
  com.google.protobuf.ByteString
      getTemplateDisplayNameBytes();

  /**
   * <pre>
   * Resources like entry can have schemas associated with them. This scope
   * allows you to attach tags to an individual column based on that schema.
   *
   * To attach a tag to a nested column, separate column names with a dot
   * (`.`). Example: `column.nested_column`.
   * </pre>
   *
   * <code>string column = 4;</code>
   * @return Whether the column field is set.
   */
  boolean hasColumn();
  /**
   * <pre>
   * Resources like entry can have schemas associated with them. This scope
   * allows you to attach tags to an individual column based on that schema.
   *
   * To attach a tag to a nested column, separate column names with a dot
   * (`.`). Example: `column.nested_column`.
   * </pre>
   *
   * <code>string column = 4;</code>
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   * <pre>
   * Resources like entry can have schemas associated with them. This scope
   * allows you to attach tags to an individual column based on that schema.
   *
   * To attach a tag to a nested column, separate column names with a dot
   * (`.`). Example: `column.nested_column`.
   * </pre>
   *
   * <code>string column = 4;</code>
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString
      getColumnBytes();

  /**
   * <pre>
   * Required. Maps the ID of a tag field to its value and additional
   * information about that field.
   *
   * Tag template defines valid field IDs. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getFieldsCount();
  /**
   * <pre>
   * Required. Maps the ID of a tag field to its value and additional
   * information about that field.
   *
   * Tag template defines valid field IDs. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsFields(
      java.lang.String key);
  /**
   * Use {@link #getFieldsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.TagField>
  getFields();
  /**
   * <pre>
   * Required. Maps the ID of a tag field to its value and additional
   * information about that field.
   *
   * Tag template defines valid field IDs. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.TagField>
  getFieldsMap();
  /**
   * <pre>
   * Required. Maps the ID of a tag field to its value and additional
   * information about that field.
   *
   * Tag template defines valid field IDs. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  /* nullable */
com.google.cloud.datacatalog.v1.TagField getFieldsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.datacatalog.v1.TagField defaultValue);
  /**
   * <pre>
   * Required. Maps the ID of a tag field to its value and additional
   * information about that field.
   *
   * Tag template defines valid field IDs. A tag
   * must have at least 1 field and at most 500 fields.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.datacatalog.v1.TagField&gt; fields = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.TagField getFieldsOrThrow(
      java.lang.String key);

  com.google.cloud.datacatalog.v1.Tag.ScopeCase getScopeCase();
}
