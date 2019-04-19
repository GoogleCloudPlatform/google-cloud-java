// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

public interface BatchGetAssetsHistoryResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.BatchGetAssetsHistoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of assets with valid time windows.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TemporalAsset assets = 1;</code>
   */
  java.util.List<com.google.cloud.asset.v1.TemporalAsset> getAssetsList();
  /**
   *
   *
   * <pre>
   * A list of assets with valid time windows.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TemporalAsset assets = 1;</code>
   */
  com.google.cloud.asset.v1.TemporalAsset getAssets(int index);
  /**
   *
   *
   * <pre>
   * A list of assets with valid time windows.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TemporalAsset assets = 1;</code>
   */
  int getAssetsCount();
  /**
   *
   *
   * <pre>
   * A list of assets with valid time windows.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TemporalAsset assets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.TemporalAssetOrBuilder>
      getAssetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of assets with valid time windows.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.TemporalAsset assets = 1;</code>
   */
  com.google.cloud.asset.v1.TemporalAssetOrBuilder getAssetsOrBuilder(int index);
}
