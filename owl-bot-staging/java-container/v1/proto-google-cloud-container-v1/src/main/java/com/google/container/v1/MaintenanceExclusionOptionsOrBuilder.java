// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface MaintenanceExclusionOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.MaintenanceExclusionOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Scope specifies the upgrade scope which upgrades are blocked by the
   * exclusion.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
   * @return The enum numeric value on the wire for scope.
   */
  int getScopeValue();
  /**
   * <pre>
   * Scope specifies the upgrade scope which upgrades are blocked by the
   * exclusion.
   * </pre>
   *
   * <code>.google.container.v1.MaintenanceExclusionOptions.Scope scope = 1;</code>
   * @return The scope.
   */
  com.google.container.v1.MaintenanceExclusionOptions.Scope getScope();
}
