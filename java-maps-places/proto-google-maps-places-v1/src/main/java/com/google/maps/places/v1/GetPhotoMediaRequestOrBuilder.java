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
// source: google/maps/places/v1/places_service.proto

// Protobuf Java Version: 3.25.5
package com.google.maps.places.v1;

public interface GetPhotoMediaRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.places.v1.GetPhotoMediaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of a photo media in the format:
   * `places/{place_id}/photos/{photo_reference}/media`.
   *
   * The resource name of a photo as returned in a Place object's `photos.name`
   * field comes with the format
   * `places/{place_id}/photos/{photo_reference}`. You need to append `/media`
   * at the end of the photo resource to get the photo media resource name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The resource name of a photo media in the format:
   * `places/{place_id}/photos/{photo_reference}/media`.
   *
   * The resource name of a photo as returned in a Place object's `photos.name`
   * field comes with the format
   * `places/{place_id}/photos/{photo_reference}`. You need to append `/media`
   * at the end of the photo resource to get the photo media resource name.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the maximum desired width, in pixels, of the image. If
   * the image is smaller than the values specified, the original image will be
   * returned. If the image is larger in either dimension, it will be scaled to
   * match the smaller of the two dimensions, restricted to its original aspect
   * ratio. Both the max_height_px and max_width_px properties accept an integer
   * between 1 and 4800, inclusively. If the value is not within the allowed
   * range, an INVALID_ARGUMENT error will be returned.
   *
   * At least one of max_height_px or max_width_px needs to be specified. If
   * neither max_height_px nor max_width_px is specified, an INVALID_ARGUMENT
   * error will be returned.
   * </pre>
   *
   * <code>int32 max_width_px = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxWidthPx.
   */
  int getMaxWidthPx();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the maximum desired height, in pixels, of the image. If
   * the image is smaller than the values specified, the original image will be
   * returned. If the image is larger in either dimension, it will be scaled to
   * match the smaller of the two dimensions, restricted to its original aspect
   * ratio. Both the max_height_px and max_width_px properties accept an integer
   * between 1 and 4800, inclusively. If the value is not within the allowed
   * range, an INVALID_ARGUMENT error will be returned.
   *
   * At least one of max_height_px or max_width_px needs to be specified. If
   * neither max_height_px nor max_width_px is specified, an INVALID_ARGUMENT
   * error will be returned.
   * </pre>
   *
   * <code>int32 max_height_px = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxHeightPx.
   */
  int getMaxHeightPx();

  /**
   *
   *
   * <pre>
   * Optional. If set, skip the default HTTP redirect behavior and render a text
   * format (for example, in JSON format for HTTP use case) response. If not
   * set, an HTTP redirect will be issued to redirect the call to the image
   * media. This option is ignored for non-HTTP requests.
   * </pre>
   *
   * <code>bool skip_http_redirect = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The skipHttpRedirect.
   */
  boolean getSkipHttpRedirect();
}
