// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface StartupConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.StartupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The config setting to enable cluster creation/ updation to be
   * successful only after required_registration_fraction of instances are up
   * and running. This configuration is applicable to only secondary workers for
   * now. The cluster will fail if required_registration_fraction of instances
   * are not available. This will include instance creation, agent registration,
   * and service registration (if enabled).
   * </pre>
   *
   * <code>optional double required_registration_fraction = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the requiredRegistrationFraction field is set.
   */
  boolean hasRequiredRegistrationFraction();
  /**
   * <pre>
   * Optional. The config setting to enable cluster creation/ updation to be
   * successful only after required_registration_fraction of instances are up
   * and running. This configuration is applicable to only secondary workers for
   * now. The cluster will fail if required_registration_fraction of instances
   * are not available. This will include instance creation, agent registration,
   * and service registration (if enabled).
   * </pre>
   *
   * <code>optional double required_registration_fraction = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The requiredRegistrationFraction.
   */
  double getRequiredRegistrationFraction();
}
