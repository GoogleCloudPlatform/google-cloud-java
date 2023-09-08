/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/retail/v2alpha/common.proto

package com.google.cloud.retail.v2alpha;

public interface ImageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.Image)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. URI of the image.
   *
   * This field must be a valid UTF-8 encoded URI with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [image_link](https://support.google.com/merchants/answer/6324350).
   * Schema.org property [Product.image](https://schema.org/image).
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Required. URI of the image.
   *
   * This field must be a valid UTF-8 encoded URI with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   *
   * Google Merchant Center property
   * [image_link](https://support.google.com/merchants/answer/6324350).
   * Schema.org property [Product.image](https://schema.org/image).
   * </pre>
   *
   * <code>string uri = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Height of the image in number of pixels.
   *
   * This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>int32 height = 2;</code>
   *
   * @return The height.
   */
  int getHeight();

  /**
   *
   *
   * <pre>
   * Width of the image in number of pixels.
   *
   * This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * </pre>
   *
   * <code>int32 width = 3;</code>
   *
   * @return The width.
   */
  int getWidth();
}
