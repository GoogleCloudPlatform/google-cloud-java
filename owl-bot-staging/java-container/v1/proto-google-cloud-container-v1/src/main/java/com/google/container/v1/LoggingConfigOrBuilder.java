// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface LoggingConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.LoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logging components configuration
   * </pre>
   *
   * <code>.google.container.v1.LoggingComponentConfig component_config = 1;</code>
   * @return Whether the componentConfig field is set.
   */
  boolean hasComponentConfig();
  /**
   * <pre>
   * Logging components configuration
   * </pre>
   *
   * <code>.google.container.v1.LoggingComponentConfig component_config = 1;</code>
   * @return The componentConfig.
   */
  com.google.container.v1.LoggingComponentConfig getComponentConfig();
  /**
   * <pre>
   * Logging components configuration
   * </pre>
   *
   * <code>.google.container.v1.LoggingComponentConfig component_config = 1;</code>
   */
  com.google.container.v1.LoggingComponentConfigOrBuilder getComponentConfigOrBuilder();
}
