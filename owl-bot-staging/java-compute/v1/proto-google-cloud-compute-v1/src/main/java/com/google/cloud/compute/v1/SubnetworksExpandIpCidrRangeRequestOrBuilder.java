// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface SubnetworksExpandIpCidrRangeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SubnetworksExpandIpCidrRangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork. This range should be disjoint from other subnetworks within this network. This range can only be larger than (i.e. a superset of) the range previously defined before the update.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return Whether the ipCidrRange field is set.
   */
  boolean hasIpCidrRange();
  /**
   * <pre>
   * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork. This range should be disjoint from other subnetworks within this network. This range can only be larger than (i.e. a superset of) the range previously defined before the update.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return The ipCidrRange.
   */
  java.lang.String getIpCidrRange();
  /**
   * <pre>
   * The IP (in CIDR format or netmask) of internal addresses that are legal on this Subnetwork. This range should be disjoint from other subnetworks within this network. This range can only be larger than (i.e. a superset of) the range previously defined before the update.
   * </pre>
   *
   * <code>optional string ip_cidr_range = 98117322;</code>
   * @return The bytes for ipCidrRange.
   */
  com.google.protobuf.ByteString
      getIpCidrRangeBytes();
}
