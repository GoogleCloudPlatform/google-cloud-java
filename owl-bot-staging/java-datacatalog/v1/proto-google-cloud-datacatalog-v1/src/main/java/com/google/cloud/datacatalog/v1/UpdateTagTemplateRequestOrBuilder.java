// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface UpdateTagTemplateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.UpdateTagTemplateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The template to update. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the tagTemplate field is set.
   */
  boolean hasTagTemplate();
  /**
   * <pre>
   * Required. The template to update. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The tagTemplate.
   */
  com.google.cloud.datacatalog.v1.TagTemplate getTagTemplate();
  /**
   * <pre>
   * Required. The template to update. The `name` field must be set.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TagTemplate tag_template = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.datacatalog.v1.TagTemplateOrBuilder getTagTemplateOrBuilder();

  /**
   * <pre>
   * Names of fields whose values to overwrite on a tag template. Currently,
   * only `display_name` and `is_publicly_readable` can be overwritten.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   *
   * Note: Updating the `is_publicly_readable` field may require up to 12
   * hours to take effect in search results.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Names of fields whose values to overwrite on a tag template. Currently,
   * only `display_name` and `is_publicly_readable` can be overwritten.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   *
   * Note: Updating the `is_publicly_readable` field may require up to 12
   * hours to take effect in search results.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Names of fields whose values to overwrite on a tag template. Currently,
   * only `display_name` and `is_publicly_readable` can be overwritten.
   *
   * If this parameter is absent or empty, all modifiable fields
   * are overwritten. If such fields are non-required and omitted in the
   * request body, their values are emptied.
   *
   * Note: Updating the `is_publicly_readable` field may require up to 12
   * hours to take effect in search results.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
