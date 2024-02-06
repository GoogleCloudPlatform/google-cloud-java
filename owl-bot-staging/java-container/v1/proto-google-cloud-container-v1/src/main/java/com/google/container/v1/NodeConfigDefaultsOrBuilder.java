// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface NodeConfigDefaultsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.NodeConfigDefaults)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * GCFS (Google Container File System, also known as Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   * @return Whether the gcfsConfig field is set.
   */
  boolean hasGcfsConfig();
  /**
   * <pre>
   * GCFS (Google Container File System, also known as Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   * @return The gcfsConfig.
   */
  com.google.container.v1.GcfsConfig getGcfsConfig();
  /**
   * <pre>
   * GCFS (Google Container File System, also known as Riptide) options.
   * </pre>
   *
   * <code>.google.container.v1.GcfsConfig gcfs_config = 1;</code>
   */
  com.google.container.v1.GcfsConfigOrBuilder getGcfsConfigOrBuilder();

  /**
   * <pre>
   * Logging configuration for node pools.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
   * @return Whether the loggingConfig field is set.
   */
  boolean hasLoggingConfig();
  /**
   * <pre>
   * Logging configuration for node pools.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
   * @return The loggingConfig.
   */
  com.google.container.v1.NodePoolLoggingConfig getLoggingConfig();
  /**
   * <pre>
   * Logging configuration for node pools.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolLoggingConfig logging_config = 3;</code>
   */
  com.google.container.v1.NodePoolLoggingConfigOrBuilder getLoggingConfigOrBuilder();
}
