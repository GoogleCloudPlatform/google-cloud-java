// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ZoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Zone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] Available cpu/platform selections for the zone.
   * </pre>
   *
   * <code>repeated string available_cpu_platforms = 175536531;</code>
   * @return A list containing the availableCpuPlatforms.
   */
  java.util.List<java.lang.String>
      getAvailableCpuPlatformsList();
  /**
   * <pre>
   * [Output Only] Available cpu/platform selections for the zone.
   * </pre>
   *
   * <code>repeated string available_cpu_platforms = 175536531;</code>
   * @return The count of availableCpuPlatforms.
   */
  int getAvailableCpuPlatformsCount();
  /**
   * <pre>
   * [Output Only] Available cpu/platform selections for the zone.
   * </pre>
   *
   * <code>repeated string available_cpu_platforms = 175536531;</code>
   * @param index The index of the element to return.
   * @return The availableCpuPlatforms at the given index.
   */
  java.lang.String getAvailableCpuPlatforms(int index);
  /**
   * <pre>
   * [Output Only] Available cpu/platform selections for the zone.
   * </pre>
   *
   * <code>repeated string available_cpu_platforms = 175536531;</code>
   * @param index The index of the value to return.
   * @return The bytes of the availableCpuPlatforms at the given index.
   */
  com.google.protobuf.ByteString
      getAvailableCpuPlatformsBytes(int index);

  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return Whether the creationTimestamp field is set.
   */
  boolean hasCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The creationTimestamp.
   */
  java.lang.String getCreationTimestamp();
  /**
   * <pre>
   * [Output Only] Creation timestamp in RFC3339 text format.
   * </pre>
   *
   * <code>optional string creation_timestamp = 30525366;</code>
   * @return The bytes for creationTimestamp.
   */
  com.google.protobuf.ByteString
      getCreationTimestampBytes();

  /**
   * <pre>
   * [Output Only] The deprecation status associated with this zone.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();
  /**
   * <pre>
   * [Output Only] The deprecation status associated with this zone.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   * @return The deprecated.
   */
  com.google.cloud.compute.v1.DeprecationStatus getDeprecated();
  /**
   * <pre>
   * [Output Only] The deprecation status associated with this zone.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.DeprecationStatus deprecated = 515138995;</code>
   */
  com.google.cloud.compute.v1.DeprecationStatusOrBuilder getDeprecatedOrBuilder();

  /**
   * <pre>
   * [Output Only] Textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * [Output Only] Textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * [Output Only] Textual description of the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * </pre>
   *
   * <code>optional uint64 id = 3355;</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#zone for zones.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#zone for zones.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#zone for zones.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * [Output Only] Name of the resource.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * [Output Only] Name of the resource.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * [Output Only] Name of the resource.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [Output Only] Full URL reference to the region which hosts the zone.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   * <pre>
   * [Output Only] Full URL reference to the region which hosts the zone.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * [Output Only] Full URL reference to the region which hosts the zone.
   * </pre>
   *
   * <code>optional string region = 138946292;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return Whether the selfLink field is set.
   */
  boolean hasSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The selfLink.
   */
  java.lang.String getSelfLink();
  /**
   * <pre>
   * [Output Only] Server-defined URL for the resource.
   * </pre>
   *
   * <code>optional string self_link = 456214797;</code>
   * @return The bytes for selfLink.
   */
  com.google.protobuf.ByteString
      getSelfLinkBytes();

  /**
   * <pre>
   * [Output Only] Status of the zone, either UP or DOWN.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * [Output Only] Status of the zone, either UP or DOWN.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * [Output Only] Status of the zone, either UP or DOWN.
   * Check the Status enum for the list of possible values.
   * </pre>
   *
   * <code>optional string status = 181260274;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool supports_pzs = 83983214;</code>
   * @return Whether the supportsPzs field is set.
   */
  boolean hasSupportsPzs();
  /**
   * <pre>
   * [Output Only] Reserved for future use.
   * </pre>
   *
   * <code>optional bool supports_pzs = 83983214;</code>
   * @return The supportsPzs.
   */
  boolean getSupportsPzs();
}
