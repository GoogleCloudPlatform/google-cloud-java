/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/asset/v1p5beta1/asset_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.asset.v1p5beta1;

public interface ListAssetsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1p5beta1.ListAssetsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   *
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   *
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   *
   *
   * <pre>
   * Time the snapshot was taken.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Assets.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p5beta1.Asset assets = 2;</code>
   */
  java.util.List<com.google.cloud.asset.v1p5beta1.Asset> getAssetsList();
  /**
   *
   *
   * <pre>
   * Assets.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p5beta1.Asset assets = 2;</code>
   */
  com.google.cloud.asset.v1p5beta1.Asset getAssets(int index);
  /**
   *
   *
   * <pre>
   * Assets.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p5beta1.Asset assets = 2;</code>
   */
  int getAssetsCount();
  /**
   *
   *
   * <pre>
   * Assets.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p5beta1.Asset assets = 2;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1p5beta1.AssetOrBuilder>
      getAssetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Assets.
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1p5beta1.Asset assets = 2;</code>
   */
  com.google.cloud.asset.v1p5beta1.AssetOrBuilder getAssetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. It expires 72 hours after the
   * page token for the first page is generated. Set to empty if there are no
   * remaining results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results. It expires 72 hours after the
   * page token for the first page is generated. Set to empty if there are no
   * remaining results.
   * </pre>
   *
   * <code>string next_page_token = 3;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
