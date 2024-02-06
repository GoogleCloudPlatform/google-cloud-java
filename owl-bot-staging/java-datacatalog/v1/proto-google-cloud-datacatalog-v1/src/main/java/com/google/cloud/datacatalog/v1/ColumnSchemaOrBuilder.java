// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/schema.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface ColumnSchemaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ColumnSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the column.
   *
   * Must be a UTF-8 string without dots (.).
   * The maximum size is 64 bytes.
   * </pre>
   *
   * <code>string column = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The column.
   */
  java.lang.String getColumn();
  /**
   * <pre>
   * Required. Name of the column.
   *
   * Must be a UTF-8 string without dots (.).
   * The maximum size is 64 bytes.
   * </pre>
   *
   * <code>string column = 6 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for column.
   */
  com.google.protobuf.ByteString
      getColumnBytes();

  /**
   * <pre>
   * Required. Type of the column.
   *
   * Must be a UTF-8 string with the maximum size of 128 bytes.
   * </pre>
   *
   * <code>string type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Required. Type of the column.
   *
   * Must be a UTF-8 string with the maximum size of 128 bytes.
   * </pre>
   *
   * <code>string type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Optional. Description of the column. Default value is an empty string.
   *
   * The description must be a UTF-8 string with the maximum size of 2000
   * bytes.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description of the column. Default value is an empty string.
   *
   * The description must be a UTF-8 string with the maximum size of 2000
   * bytes.
   * </pre>
   *
   * <code>string description = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Optional. A column's mode indicates whether values in this column are
   * required, nullable, or repeated.
   *
   * Only `NULLABLE`, `REQUIRED`, and `REPEATED` values are supported.
   * Default mode is `NULLABLE`.
   * </pre>
   *
   * <code>string mode = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The mode.
   */
  java.lang.String getMode();
  /**
   * <pre>
   * Optional. A column's mode indicates whether values in this column are
   * required, nullable, or repeated.
   *
   * Only `NULLABLE`, `REQUIRED`, and `REPEATED` values are supported.
   * Default mode is `NULLABLE`.
   * </pre>
   *
   * <code>string mode = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for mode.
   */
  com.google.protobuf.ByteString
      getModeBytes();

  /**
   * <pre>
   * Optional. Default value for the column.
   * </pre>
   *
   * <code>string default_value = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The defaultValue.
   */
  java.lang.String getDefaultValue();
  /**
   * <pre>
   * Optional. Default value for the column.
   * </pre>
   *
   * <code>string default_value = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for defaultValue.
   */
  com.google.protobuf.ByteString
      getDefaultValueBytes();

  /**
   * <pre>
   * Optional. Ordinal position
   * </pre>
   *
   * <code>int32 ordinal_position = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The ordinalPosition.
   */
  int getOrdinalPosition();

  /**
   * <pre>
   * Optional. Most important inclusion of this column.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ColumnSchema.IndexingType highest_indexing_type = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for highestIndexingType.
   */
  int getHighestIndexingTypeValue();
  /**
   * <pre>
   * Optional. Most important inclusion of this column.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ColumnSchema.IndexingType highest_indexing_type = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The highestIndexingType.
   */
  com.google.cloud.datacatalog.v1.ColumnSchema.IndexingType getHighestIndexingType();

  /**
   * <pre>
   * Optional. Schema of sub-columns. A column can have zero or more
   * sub-columns.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema subcolumns = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.ColumnSchema> 
      getSubcolumnsList();
  /**
   * <pre>
   * Optional. Schema of sub-columns. A column can have zero or more
   * sub-columns.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema subcolumns = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.v1.ColumnSchema getSubcolumns(int index);
  /**
   * <pre>
   * Optional. Schema of sub-columns. A column can have zero or more
   * sub-columns.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema subcolumns = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getSubcolumnsCount();
  /**
   * <pre>
   * Optional. Schema of sub-columns. A column can have zero or more
   * sub-columns.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema subcolumns = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.ColumnSchemaOrBuilder> 
      getSubcolumnsOrBuilderList();
  /**
   * <pre>
   * Optional. Schema of sub-columns. A column can have zero or more
   * sub-columns.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.ColumnSchema subcolumns = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.v1.ColumnSchemaOrBuilder getSubcolumnsOrBuilder(
      int index);

  /**
   * <pre>
   * Looker specific column info of this column.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ColumnSchema.LookerColumnSpec looker_column_spec = 18;</code>
   * @return Whether the lookerColumnSpec field is set.
   */
  boolean hasLookerColumnSpec();
  /**
   * <pre>
   * Looker specific column info of this column.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ColumnSchema.LookerColumnSpec looker_column_spec = 18;</code>
   * @return The lookerColumnSpec.
   */
  com.google.cloud.datacatalog.v1.ColumnSchema.LookerColumnSpec getLookerColumnSpec();
  /**
   * <pre>
   * Looker specific column info of this column.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ColumnSchema.LookerColumnSpec looker_column_spec = 18;</code>
   */
  com.google.cloud.datacatalog.v1.ColumnSchema.LookerColumnSpecOrBuilder getLookerColumnSpecOrBuilder();

  /**
   * <pre>
   * Optional. Garbage collection policy for the column or column family.
   * Applies to systems like Cloud Bigtable.
   * </pre>
   *
   * <code>string gc_rule = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The gcRule.
   */
  java.lang.String getGcRule();
  /**
   * <pre>
   * Optional. Garbage collection policy for the column or column family.
   * Applies to systems like Cloud Bigtable.
   * </pre>
   *
   * <code>string gc_rule = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for gcRule.
   */
  com.google.protobuf.ByteString
      getGcRuleBytes();

  com.google.cloud.datacatalog.v1.ColumnSchema.SystemSpecCase getSystemSpecCase();
}
