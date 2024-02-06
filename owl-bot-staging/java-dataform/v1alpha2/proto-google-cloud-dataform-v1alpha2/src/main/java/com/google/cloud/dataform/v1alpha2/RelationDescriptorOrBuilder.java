// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1alpha2/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1alpha2;

public interface RelationDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1alpha2.RelationDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A text description of the relation.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A text description of the relation.
   * </pre>
   *
   * <code>string description = 1;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * A list of descriptions of columns within the relation.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor columns = 2;</code>
   */
  java.util.List<com.google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor> 
      getColumnsList();
  /**
   * <pre>
   * A list of descriptions of columns within the relation.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor columns = 2;</code>
   */
  com.google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor getColumns(int index);
  /**
   * <pre>
   * A list of descriptions of columns within the relation.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor columns = 2;</code>
   */
  int getColumnsCount();
  /**
   * <pre>
   * A list of descriptions of columns within the relation.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor columns = 2;</code>
   */
  java.util.List<? extends com.google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptorOrBuilder> 
      getColumnsOrBuilderList();
  /**
   * <pre>
   * A list of descriptions of columns within the relation.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptor columns = 2;</code>
   */
  com.google.cloud.dataform.v1alpha2.RelationDescriptor.ColumnDescriptorOrBuilder getColumnsOrBuilder(
      int index);

  /**
   * <pre>
   * A set of BigQuery labels that should be applied to the relation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; bigquery_labels = 3;</code>
   */
  int getBigqueryLabelsCount();
  /**
   * <pre>
   * A set of BigQuery labels that should be applied to the relation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; bigquery_labels = 3;</code>
   */
  boolean containsBigqueryLabels(
      java.lang.String key);
  /**
   * Use {@link #getBigqueryLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getBigqueryLabels();
  /**
   * <pre>
   * A set of BigQuery labels that should be applied to the relation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; bigquery_labels = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getBigqueryLabelsMap();
  /**
   * <pre>
   * A set of BigQuery labels that should be applied to the relation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; bigquery_labels = 3;</code>
   */
  /* nullable */
java.lang.String getBigqueryLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * A set of BigQuery labels that should be applied to the relation.
   * </pre>
   *
   * <code>map&lt;string, string&gt; bigquery_labels = 3;</code>
   */
  java.lang.String getBigqueryLabelsOrThrow(
      java.lang.String key);
}
