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
// source: google/cloud/video/stitcher/v1/live_configs.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.stitcher.v1;

public interface LiveConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.LiveConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the live config, in the form of
   * `projects/{project}/locations/{location}/liveConfigs/{id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the live config, in the form of
   * `projects/{project}/locations/{location}/liveConfigs/{id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Source URI for the live stream manifest.
   * </pre>
   *
   * <code>string source_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The sourceUri.
   */
  java.lang.String getSourceUri();
  /**
   *
   *
   * <pre>
   * Required. Source URI for the live stream manifest.
   * </pre>
   *
   * <code>string source_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for sourceUri.
   */
  com.google.protobuf.ByteString getSourceUriBytes();

  /**
   *
   *
   * <pre>
   * The default ad tag associated with this live stream config.
   * </pre>
   *
   * <code>string ad_tag_uri = 3;</code>
   *
   * @return The adTagUri.
   */
  java.lang.String getAdTagUri();
  /**
   *
   *
   * <pre>
   * The default ad tag associated with this live stream config.
   * </pre>
   *
   * <code>string ad_tag_uri = 3;</code>
   *
   * @return The bytes for adTagUri.
   */
  com.google.protobuf.ByteString getAdTagUriBytes();

  /**
   *
   *
   * <pre>
   * Additional metadata used to register a live stream with Google Ad Manager
   * (GAM)
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.GamLiveConfig gam_live_config = 4;</code>
   *
   * @return Whether the gamLiveConfig field is set.
   */
  boolean hasGamLiveConfig();
  /**
   *
   *
   * <pre>
   * Additional metadata used to register a live stream with Google Ad Manager
   * (GAM)
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.GamLiveConfig gam_live_config = 4;</code>
   *
   * @return The gamLiveConfig.
   */
  com.google.cloud.video.stitcher.v1.GamLiveConfig getGamLiveConfig();
  /**
   *
   *
   * <pre>
   * Additional metadata used to register a live stream with Google Ad Manager
   * (GAM)
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.GamLiveConfig gam_live_config = 4;</code>
   */
  com.google.cloud.video.stitcher.v1.GamLiveConfigOrBuilder getGamLiveConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. State of the live config.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.LiveConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the live config.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.LiveConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.video.stitcher.v1.LiveConfig.State getState();

  /**
   *
   *
   * <pre>
   * Required. Determines how the ads are tracked.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.AdTracking ad_tracking = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for adTracking.
   */
  int getAdTrackingValue();
  /**
   *
   *
   * <pre>
   * Required. Determines how the ads are tracked.
   * </pre>
   *
   * <code>
   * .google.cloud.video.stitcher.v1.AdTracking ad_tracking = 6 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The adTracking.
   */
  com.google.cloud.video.stitcher.v1.AdTracking getAdTracking();

  /**
   *
   *
   * <pre>
   * This must refer to a slate in the same
   * project. If Google Ad Manager (GAM) is used for ads, this string sets the
   * value of `slateCreativeId` in
   * https://developers.google.com/ad-manager/api/reference/v202211/LiveStreamEventService.LiveStreamEvent#slateCreativeId
   * </pre>
   *
   * <code>string default_slate = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The defaultSlate.
   */
  java.lang.String getDefaultSlate();
  /**
   *
   *
   * <pre>
   * This must refer to a slate in the same
   * project. If Google Ad Manager (GAM) is used for ads, this string sets the
   * value of `slateCreativeId` in
   * https://developers.google.com/ad-manager/api/reference/v202211/LiveStreamEventService.LiveStreamEvent#slateCreativeId
   * </pre>
   *
   * <code>string default_slate = 7 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for defaultSlate.
   */
  com.google.protobuf.ByteString getDefaultSlateBytes();

  /**
   *
   *
   * <pre>
   * Defines the stitcher behavior in case an ad does not align exactly with
   * the ad break boundaries. If not specified, the default is `CUT_CURRENT`.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveConfig.StitchingPolicy stitching_policy = 8;</code>
   *
   * @return The enum numeric value on the wire for stitchingPolicy.
   */
  int getStitchingPolicyValue();
  /**
   *
   *
   * <pre>
   * Defines the stitcher behavior in case an ad does not align exactly with
   * the ad break boundaries. If not specified, the default is `CUT_CURRENT`.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.LiveConfig.StitchingPolicy stitching_policy = 8;</code>
   *
   * @return The stitchingPolicy.
   */
  com.google.cloud.video.stitcher.v1.LiveConfig.StitchingPolicy getStitchingPolicy();

  /**
   *
   *
   * <pre>
   * The configuration for prefetching ads.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.PrefetchConfig prefetch_config = 10;</code>
   *
   * @return Whether the prefetchConfig field is set.
   */
  boolean hasPrefetchConfig();
  /**
   *
   *
   * <pre>
   * The configuration for prefetching ads.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.PrefetchConfig prefetch_config = 10;</code>
   *
   * @return The prefetchConfig.
   */
  com.google.cloud.video.stitcher.v1.PrefetchConfig getPrefetchConfig();
  /**
   *
   *
   * <pre>
   * The configuration for prefetching ads.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.PrefetchConfig prefetch_config = 10;</code>
   */
  com.google.cloud.video.stitcher.v1.PrefetchConfigOrBuilder getPrefetchConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Options for fetching source manifests and segments.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.FetchOptions source_fetch_options = 16;</code>
   *
   * @return Whether the sourceFetchOptions field is set.
   */
  boolean hasSourceFetchOptions();
  /**
   *
   *
   * <pre>
   * Options for fetching source manifests and segments.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.FetchOptions source_fetch_options = 16;</code>
   *
   * @return The sourceFetchOptions.
   */
  com.google.cloud.video.stitcher.v1.FetchOptions getSourceFetchOptions();
  /**
   *
   *
   * <pre>
   * Options for fetching source manifests and segments.
   * </pre>
   *
   * <code>.google.cloud.video.stitcher.v1.FetchOptions source_fetch_options = 16;</code>
   */
  com.google.cloud.video.stitcher.v1.FetchOptionsOrBuilder getSourceFetchOptionsOrBuilder();
}
