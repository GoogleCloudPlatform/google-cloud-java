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
// source: google/cloud/datalabeling/v1beta1/data_payloads.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datalabeling.v1beta1;

public interface ImagePayloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.ImagePayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * Image format.
   * </pre>
   *
   * <code>string mime_type = 1;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();

  /**
   *
   *
   * <pre>
   * A byte string of a thumbnail image.
   * </pre>
   *
   * <code>bytes image_thumbnail = 2;</code>
   *
   * @return The imageThumbnail.
   */
  com.google.protobuf.ByteString getImageThumbnail();

  /**
   *
   *
   * <pre>
   * Image uri from the user bucket.
   * </pre>
   *
   * <code>string image_uri = 3;</code>
   *
   * @return The imageUri.
   */
  java.lang.String getImageUri();
  /**
   *
   *
   * <pre>
   * Image uri from the user bucket.
   * </pre>
   *
   * <code>string image_uri = 3;</code>
   *
   * @return The bytes for imageUri.
   */
  com.google.protobuf.ByteString getImageUriBytes();

  /**
   *
   *
   * <pre>
   * Signed uri of the image file in the service bucket.
   * </pre>
   *
   * <code>string signed_uri = 4;</code>
   *
   * @return The signedUri.
   */
  java.lang.String getSignedUri();
  /**
   *
   *
   * <pre>
   * Signed uri of the image file in the service bucket.
   * </pre>
   *
   * <code>string signed_uri = 4;</code>
   *
   * @return The bytes for signedUri.
   */
  com.google.protobuf.ByteString getSignedUriBytes();
}
