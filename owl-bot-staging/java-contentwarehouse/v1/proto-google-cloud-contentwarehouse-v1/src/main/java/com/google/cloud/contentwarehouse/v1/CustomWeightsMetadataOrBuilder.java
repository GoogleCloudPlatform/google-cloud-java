// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/filters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

public interface CustomWeightsMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.CustomWeightsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty> 
      getWeightedSchemaPropertiesList();
  /**
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.WeightedSchemaProperty getWeightedSchemaProperties(int index);
  /**
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;</code>
   */
  int getWeightedSchemaPropertiesCount();
  /**
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder> 
      getWeightedSchemaPropertiesOrBuilderList();
  /**
   * <pre>
   * List of schema and property name. Allows a maximum of 10 schemas to be
   * specified for relevance boosting.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.WeightedSchemaProperty weighted_schema_properties = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.WeightedSchemaPropertyOrBuilder getWeightedSchemaPropertiesOrBuilder(
      int index);
}
