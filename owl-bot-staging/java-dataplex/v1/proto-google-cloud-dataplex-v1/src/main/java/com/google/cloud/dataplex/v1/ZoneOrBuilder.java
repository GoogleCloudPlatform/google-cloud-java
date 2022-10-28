// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/resources.proto

package com.google.cloud.dataplex.v1;

public interface ZoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.Zone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The relative resource name of the zone, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The relative resource name of the zone, of the form:
   * `projects/{project_number}/locations/{location_id}/lakes/{lake_id}/zones/{zone_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. User friendly display name.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Output only. System generated globally unique ID for the zone. This ID will be
   * different if the zone is deleted and re-created with the same name.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   * <pre>
   * Output only. System generated globally unique ID for the zone. This ID will be
   * different if the zone is deleted and re-created with the same name.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString
      getUidBytes();

  /**
   * <pre>
   * Output only. The time when the zone was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   * <pre>
   * Output only. The time when the zone was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   * <pre>
   * Output only. The time when the zone was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   * <pre>
   * Output only. The time when the zone was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. The time when the zone was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. The time when the zone was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * Optional. User defined labels for the zone.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   * <pre>
   * Optional. User defined labels for the zone.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. User defined labels for the zone.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getLabelsMap();
  /**
   * <pre>
   * Optional. User defined labels for the zone.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  /* nullable */
java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Optional. User defined labels for the zone.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */

  java.lang.String getLabelsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. Description of the zone.
   * </pre>
   *
   * <code>string description = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Optional. Description of the zone.
   * </pre>
   *
   * <code>string description = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Output only. Current state of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * Output only. Current state of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.State state = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  com.google.cloud.dataplex.v1.State getState();

  /**
   * <pre>
   * Required. Immutable. The type of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.Type type = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. Immutable. The type of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.Type type = 9 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.cloud.dataplex.v1.Zone.Type getType();

  /**
   * <pre>
   * Optional. Specification of the discovery feature applied to data in this zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.DiscoverySpec discovery_spec = 103 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the discoverySpec field is set.
   */
  boolean hasDiscoverySpec();
  /**
   * <pre>
   * Optional. Specification of the discovery feature applied to data in this zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.DiscoverySpec discovery_spec = 103 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The discoverySpec.
   */
  com.google.cloud.dataplex.v1.Zone.DiscoverySpec getDiscoverySpec();
  /**
   * <pre>
   * Optional. Specification of the discovery feature applied to data in this zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.DiscoverySpec discovery_spec = 103 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.dataplex.v1.Zone.DiscoverySpecOrBuilder getDiscoverySpecOrBuilder();

  /**
   * <pre>
   * Required. Specification of the resources that are referenced by the assets within
   * this zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.ResourceSpec resource_spec = 104 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the resourceSpec field is set.
   */
  boolean hasResourceSpec();
  /**
   * <pre>
   * Required. Specification of the resources that are referenced by the assets within
   * this zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.ResourceSpec resource_spec = 104 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The resourceSpec.
   */
  com.google.cloud.dataplex.v1.Zone.ResourceSpec getResourceSpec();
  /**
   * <pre>
   * Required. Specification of the resources that are referenced by the assets within
   * this zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.Zone.ResourceSpec resource_spec = 104 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.dataplex.v1.Zone.ResourceSpecOrBuilder getResourceSpecOrBuilder();

  /**
   * <pre>
   * Output only. Aggregated status of the underlying assets of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.AssetStatus asset_status = 105 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the assetStatus field is set.
   */
  boolean hasAssetStatus();
  /**
   * <pre>
   * Output only. Aggregated status of the underlying assets of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.AssetStatus asset_status = 105 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetStatus.
   */
  com.google.cloud.dataplex.v1.AssetStatus getAssetStatus();
  /**
   * <pre>
   * Output only. Aggregated status of the underlying assets of the zone.
   * </pre>
   *
   * <code>.google.cloud.dataplex.v1.AssetStatus asset_status = 105 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.dataplex.v1.AssetStatusOrBuilder getAssetStatusOrBuilder();
}
