// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ResourceStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] An opaque ID of the host on which the VM is running.
   * </pre>
   *
   * <code>optional string physical_host = 464370704;</code>
   * @return Whether the physicalHost field is set.
   */
  boolean hasPhysicalHost();
  /**
   * <pre>
   * [Output Only] An opaque ID of the host on which the VM is running.
   * </pre>
   *
   * <code>optional string physical_host = 464370704;</code>
   * @return The physicalHost.
   */
  java.lang.String getPhysicalHost();
  /**
   * <pre>
   * [Output Only] An opaque ID of the host on which the VM is running.
   * </pre>
   *
   * <code>optional string physical_host = 464370704;</code>
   * @return The bytes for physicalHost.
   */
  com.google.protobuf.ByteString
      getPhysicalHostBytes();

  /**
   * <code>optional .google.cloud.compute.v1.UpcomingMaintenance upcoming_maintenance = 227348592;</code>
   * @return Whether the upcomingMaintenance field is set.
   */
  boolean hasUpcomingMaintenance();
  /**
   * <code>optional .google.cloud.compute.v1.UpcomingMaintenance upcoming_maintenance = 227348592;</code>
   * @return The upcomingMaintenance.
   */
  com.google.cloud.compute.v1.UpcomingMaintenance getUpcomingMaintenance();
  /**
   * <code>optional .google.cloud.compute.v1.UpcomingMaintenance upcoming_maintenance = 227348592;</code>
   */
  com.google.cloud.compute.v1.UpcomingMaintenanceOrBuilder getUpcomingMaintenanceOrBuilder();
}
