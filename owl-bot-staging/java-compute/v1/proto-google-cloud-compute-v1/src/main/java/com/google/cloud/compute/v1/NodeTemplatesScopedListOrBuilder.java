// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface NodeTemplatesScopedListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NodeTemplatesScopedList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] A list of node templates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeTemplate node_templates = 354111804;</code>
   */
  java.util.List<com.google.cloud.compute.v1.NodeTemplate> 
      getNodeTemplatesList();
  /**
   * <pre>
   * [Output Only] A list of node templates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeTemplate node_templates = 354111804;</code>
   */
  com.google.cloud.compute.v1.NodeTemplate getNodeTemplates(int index);
  /**
   * <pre>
   * [Output Only] A list of node templates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeTemplate node_templates = 354111804;</code>
   */
  int getNodeTemplatesCount();
  /**
   * <pre>
   * [Output Only] A list of node templates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeTemplate node_templates = 354111804;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.NodeTemplateOrBuilder> 
      getNodeTemplatesOrBuilderList();
  /**
   * <pre>
   * [Output Only] A list of node templates contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NodeTemplate node_templates = 354111804;</code>
   */
  com.google.cloud.compute.v1.NodeTemplateOrBuilder getNodeTemplatesOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node templates list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node templates list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   * @return The warning.
   */
  com.google.cloud.compute.v1.Warning getWarning();
  /**
   * <pre>
   * [Output Only] An informational warning that appears when the node templates list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder();
}
