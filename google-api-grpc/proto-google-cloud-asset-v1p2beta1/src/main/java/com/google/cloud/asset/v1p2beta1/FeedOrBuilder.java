// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p2beta1/asset_service.proto

package com.google.cloud.asset.v1p2beta1;

public interface FeedOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p2beta1.Feed)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The format will be
   * projects/{project_number}/feeds/{client-assigned_feed_identifier} or
   * folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier}
   * The client-assigned feed identifier must be unique within the parent
   * project/folder/organization.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The format will be
   * projects/{project_number}/feeds/{client-assigned_feed_identifier} or
   * folders/{folder_number}/feeds/{client-assigned_feed_identifier} or
   * organizations/{organization_number}/feeds/{client-assigned_feed_identifier}
   * The client-assigned feed identifier must be unique within the parent
   * project/folder/organization.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed. For
   * example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  java.util.List<java.lang.String> getAssetNamesList();
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed. For
   * example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  int getAssetNamesCount();
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed. For
   * example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  java.lang.String getAssetNames(int index);
  /**
   *
   *
   * <pre>
   * A list of the full names of the assets to receive updates. You must specify
   * either or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed. For
   * example:
   * `//compute.googleapis.com/projects/my_project_123/zones/zone1/instances/instance1`.
   * See [Resource
   * Names](https://cloud.google.com/apis/design/resource_names#full_resource_name)
   * for more info.
   * </pre>
   *
   * <code>repeated string asset_names = 2;</code>
   */
  com.google.protobuf.ByteString getAssetNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed.
   * For example:
   * "compute.googleapis.com/Disk" See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   */
  java.util.List<java.lang.String> getAssetTypesList();
  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed.
   * For example:
   * "compute.googleapis.com/Disk" See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   */
  int getAssetTypesCount();
  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed.
   * For example:
   * "compute.googleapis.com/Disk" See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   */
  java.lang.String getAssetTypes(int index);
  /**
   *
   *
   * <pre>
   * A list of types of the assets to receive updates. You must specify either
   * or both of asset_names and asset_types. Only asset updates matching
   * specified asset_names and asset_types are exported to the feed.
   * For example:
   * "compute.googleapis.com/Disk" See [Introduction to Cloud Asset
   * Inventory](https://cloud.google.com/resource-manager/docs/cloud-asset-inventory/overview)
   * for all supported asset types.
   * </pre>
   *
   * <code>repeated string asset_types = 3;</code>
   */
  com.google.protobuf.ByteString getAssetTypesBytes(int index);

  /**
   *
   *
   * <pre>
   * Asset content type. If not specified, no content but the asset name and
   * type will be returned.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.ContentType content_type = 4;</code>
   */
  int getContentTypeValue();
  /**
   *
   *
   * <pre>
   * Asset content type. If not specified, no content but the asset name and
   * type will be returned.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.ContentType content_type = 4;</code>
   */
  com.google.cloud.asset.v1p2beta1.ContentType getContentType();

  /**
   *
   *
   * <pre>
   * Required. Feed output configuration defining where the asset updates are
   * published to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.FeedOutputConfig feed_output_config = 5;</code>
   */
  boolean hasFeedOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. Feed output configuration defining where the asset updates are
   * published to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.FeedOutputConfig feed_output_config = 5;</code>
   */
  com.google.cloud.asset.v1p2beta1.FeedOutputConfig getFeedOutputConfig();
  /**
   *
   *
   * <pre>
   * Required. Feed output configuration defining where the asset updates are
   * published to.
   * </pre>
   *
   * <code>.google.cloud.asset.v1p2beta1.FeedOutputConfig feed_output_config = 5;</code>
   */
  com.google.cloud.asset.v1p2beta1.FeedOutputConfigOrBuilder getFeedOutputConfigOrBuilder();
}
