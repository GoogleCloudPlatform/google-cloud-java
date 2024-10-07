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
// source: google/maps/places/v1/reference.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.places.v1;

public interface ReferencesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.References)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Reviews that serve as references.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Review reviews = 1;</code>
   */
  java.util.List<com.google.maps.places.v1.Review> getReviewsList();
  /**
   *
   *
   * <pre>
   * Reviews that serve as references.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Review reviews = 1;</code>
   */
  com.google.maps.places.v1.Review getReviews(int index);
  /**
   *
   *
   * <pre>
   * Reviews that serve as references.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Review reviews = 1;</code>
   */
  int getReviewsCount();
  /**
   *
   *
   * <pre>
   * Reviews that serve as references.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Review reviews = 1;</code>
   */
  java.util.List<? extends com.google.maps.places.v1.ReviewOrBuilder> getReviewsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Reviews that serve as references.
   * </pre>
   *
   * <code>repeated .google.maps.places.v1.Review reviews = 1;</code>
   */
  com.google.maps.places.v1.ReviewOrBuilder getReviewsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The list of resource names of the referenced places. This name can be used
   * in other APIs that accept Place resource names.
   * </pre>
   *
   * <code>repeated string places = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the places.
   */
  java.util.List<java.lang.String> getPlacesList();
  /**
   *
   *
   * <pre>
   * The list of resource names of the referenced places. This name can be used
   * in other APIs that accept Place resource names.
   * </pre>
   *
   * <code>repeated string places = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of places.
   */
  int getPlacesCount();
  /**
   *
   *
   * <pre>
   * The list of resource names of the referenced places. This name can be used
   * in other APIs that accept Place resource names.
   * </pre>
   *
   * <code>repeated string places = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The places at the given index.
   */
  java.lang.String getPlaces(int index);
  /**
   *
   *
   * <pre>
   * The list of resource names of the referenced places. This name can be used
   * in other APIs that accept Place resource names.
   * </pre>
   *
   * <code>repeated string places = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the places at the given index.
   */
  com.google.protobuf.ByteString getPlacesBytes(int index);
}
