/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/networkconnectivity/v1/hub.proto

package com.google.cloud.networkconnectivity.v1;

public interface LocationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkconnectivity.v1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @return A list containing the locationFeatures.
   */
  java.util.List<com.google.cloud.networkconnectivity.v1.LocationFeature> getLocationFeaturesList();
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @return The count of locationFeatures.
   */
  int getLocationFeaturesCount();
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @param index The index of the element to return.
   * @return The locationFeatures at the given index.
   */
  com.google.cloud.networkconnectivity.v1.LocationFeature getLocationFeatures(int index);
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for locationFeatures.
   */
  java.util.List<java.lang.Integer> getLocationFeaturesValueList();
  /**
   *
   *
   * <pre>
   * List of supported features
   * </pre>
   *
   * <code>repeated .google.cloud.networkconnectivity.v1.LocationFeature location_features = 1;
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of locationFeatures at the given index.
   */
  int getLocationFeaturesValue(int index);
}
