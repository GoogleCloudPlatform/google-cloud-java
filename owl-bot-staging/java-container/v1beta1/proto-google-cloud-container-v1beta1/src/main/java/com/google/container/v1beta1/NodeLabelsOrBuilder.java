// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface NodeLabelsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.NodeLabels)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  boolean containsLabels(
      java.lang.String key);
  /**
   * Use {@link #getLabelsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getLabels();
  /**
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Map of node label keys and node label values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 1;</code>
   */
  java.lang.String getLabelsOrThrow(
      java.lang.String key);
}
