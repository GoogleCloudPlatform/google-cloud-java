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
// source: google/maps/addressvalidation/v1/geocode.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.addressvalidation.v1;

public interface GeocodeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.addressvalidation.v1.Geocode)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The geocoded location of the input.
   *
   * Using place IDs is preferred over using addresses,
   * latitude/longitude coordinates, or plus codes. Using coordinates when
   * routing or calculating driving directions will always result in the point
   * being snapped to the road nearest to those coordinates. This may not be a
   * road that will quickly or safely lead to the destination and may not be
   * near an access point to the property. Additionally, when a location is
   * reverse geocoded, there is no guarantee that the returned address will
   * match the original.
   * </pre>
   *
   * <code>.google.type.LatLng location = 1;</code>
   *
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   *
   *
   * <pre>
   * The geocoded location of the input.
   *
   * Using place IDs is preferred over using addresses,
   * latitude/longitude coordinates, or plus codes. Using coordinates when
   * routing or calculating driving directions will always result in the point
   * being snapped to the road nearest to those coordinates. This may not be a
   * road that will quickly or safely lead to the destination and may not be
   * near an access point to the property. Additionally, when a location is
   * reverse geocoded, there is no guarantee that the returned address will
   * match the original.
   * </pre>
   *
   * <code>.google.type.LatLng location = 1;</code>
   *
   * @return The location.
   */
  com.google.type.LatLng getLocation();
  /**
   *
   *
   * <pre>
   * The geocoded location of the input.
   *
   * Using place IDs is preferred over using addresses,
   * latitude/longitude coordinates, or plus codes. Using coordinates when
   * routing or calculating driving directions will always result in the point
   * being snapped to the road nearest to those coordinates. This may not be a
   * road that will quickly or safely lead to the destination and may not be
   * near an access point to the property. Additionally, when a location is
   * reverse geocoded, there is no guarantee that the returned address will
   * match the original.
   * </pre>
   *
   * <code>.google.type.LatLng location = 1;</code>
   */
  com.google.type.LatLngOrBuilder getLocationOrBuilder();

  /**
   *
   *
   * <pre>
   * The plus code corresponding to the `location`.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.PlusCode plus_code = 2;</code>
   *
   * @return Whether the plusCode field is set.
   */
  boolean hasPlusCode();
  /**
   *
   *
   * <pre>
   * The plus code corresponding to the `location`.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.PlusCode plus_code = 2;</code>
   *
   * @return The plusCode.
   */
  com.google.maps.addressvalidation.v1.PlusCode getPlusCode();
  /**
   *
   *
   * <pre>
   * The plus code corresponding to the `location`.
   * </pre>
   *
   * <code>.google.maps.addressvalidation.v1.PlusCode plus_code = 2;</code>
   */
  com.google.maps.addressvalidation.v1.PlusCodeOrBuilder getPlusCodeOrBuilder();

  /**
   *
   *
   * <pre>
   * The bounds of the geocoded place.
   * </pre>
   *
   * <code>.google.geo.type.Viewport bounds = 4;</code>
   *
   * @return Whether the bounds field is set.
   */
  boolean hasBounds();
  /**
   *
   *
   * <pre>
   * The bounds of the geocoded place.
   * </pre>
   *
   * <code>.google.geo.type.Viewport bounds = 4;</code>
   *
   * @return The bounds.
   */
  com.google.geo.type.Viewport getBounds();
  /**
   *
   *
   * <pre>
   * The bounds of the geocoded place.
   * </pre>
   *
   * <code>.google.geo.type.Viewport bounds = 4;</code>
   */
  com.google.geo.type.ViewportOrBuilder getBoundsOrBuilder();

  /**
   *
   *
   * <pre>
   * The size of the geocoded place, in meters. This is another measure of the
   * coarseness of the geocoded location, but in physical size rather than in
   * semantic meaning.
   * </pre>
   *
   * <code>float feature_size_meters = 5;</code>
   *
   * @return The featureSizeMeters.
   */
  float getFeatureSizeMeters();

  /**
   *
   *
   * <pre>
   * The PlaceID of the place this input geocodes to.
   *
   * For more information about Place IDs see
   * [here](https://developers.google.com/maps/documentation/places/web-service/place-id).
   * </pre>
   *
   * <code>string place_id = 6;</code>
   *
   * @return The placeId.
   */
  java.lang.String getPlaceId();
  /**
   *
   *
   * <pre>
   * The PlaceID of the place this input geocodes to.
   *
   * For more information about Place IDs see
   * [here](https://developers.google.com/maps/documentation/places/web-service/place-id).
   * </pre>
   *
   * <code>string place_id = 6;</code>
   *
   * @return The bytes for placeId.
   */
  com.google.protobuf.ByteString getPlaceIdBytes();

  /**
   *
   *
   * <pre>
   * The type(s) of place that the input geocoded to. For example,
   * `['locality', 'political']`. The full list of types can be found
   * [here](https://developers.google.com/maps/documentation/geocoding/requests-geocoding#Types).
   * </pre>
   *
   * <code>repeated string place_types = 7;</code>
   *
   * @return A list containing the placeTypes.
   */
  java.util.List<java.lang.String> getPlaceTypesList();
  /**
   *
   *
   * <pre>
   * The type(s) of place that the input geocoded to. For example,
   * `['locality', 'political']`. The full list of types can be found
   * [here](https://developers.google.com/maps/documentation/geocoding/requests-geocoding#Types).
   * </pre>
   *
   * <code>repeated string place_types = 7;</code>
   *
   * @return The count of placeTypes.
   */
  int getPlaceTypesCount();
  /**
   *
   *
   * <pre>
   * The type(s) of place that the input geocoded to. For example,
   * `['locality', 'political']`. The full list of types can be found
   * [here](https://developers.google.com/maps/documentation/geocoding/requests-geocoding#Types).
   * </pre>
   *
   * <code>repeated string place_types = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The placeTypes at the given index.
   */
  java.lang.String getPlaceTypes(int index);
  /**
   *
   *
   * <pre>
   * The type(s) of place that the input geocoded to. For example,
   * `['locality', 'political']`. The full list of types can be found
   * [here](https://developers.google.com/maps/documentation/geocoding/requests-geocoding#Types).
   * </pre>
   *
   * <code>repeated string place_types = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the placeTypes at the given index.
   */
  com.google.protobuf.ByteString getPlaceTypesBytes(int index);
}
