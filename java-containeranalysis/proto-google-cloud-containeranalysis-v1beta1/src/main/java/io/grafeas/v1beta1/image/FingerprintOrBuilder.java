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
// source: google/devtools/containeranalysis/v1beta1/image/image.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.image;

public interface FingerprintOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.image.Fingerprint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The layer ID of the final layer in the Docker image's v1
   * representation.
   * </pre>
   *
   * <code>string v1_name = 1;</code>
   *
   * @return The v1Name.
   */
  java.lang.String getV1Name();
  /**
   *
   *
   * <pre>
   * Required. The layer ID of the final layer in the Docker image's v1
   * representation.
   * </pre>
   *
   * <code>string v1_name = 1;</code>
   *
   * @return The bytes for v1Name.
   */
  com.google.protobuf.ByteString getV1NameBytes();

  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @return A list containing the v2Blob.
   */
  java.util.List<java.lang.String> getV2BlobList();
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @return The count of v2Blob.
   */
  int getV2BlobCount();
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The v2Blob at the given index.
   */
  java.lang.String getV2Blob(int index);
  /**
   *
   *
   * <pre>
   * Required. The ordered list of v2 blobs that represent a given image.
   * </pre>
   *
   * <code>repeated string v2_blob = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the v2Blob at the given index.
   */
  com.google.protobuf.ByteString getV2BlobBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. The name of the image's v2 blobs computed via:
   *   [bottom] := v2_blob[bottom]
   *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
   * Only the name of the final blob is kept.
   * </pre>
   *
   * <code>string v2_name = 3;</code>
   *
   * @return The v2Name.
   */
  java.lang.String getV2Name();
  /**
   *
   *
   * <pre>
   * Output only. The name of the image's v2 blobs computed via:
   *   [bottom] := v2_blob[bottom]
   *   [N] := sha256(v2_blob[N] + " " + v2_name[N+1])
   * Only the name of the final blob is kept.
   * </pre>
   *
   * <code>string v2_name = 3;</code>
   *
   * @return The bytes for v2Name.
   */
  com.google.protobuf.ByteString getV2NameBytes();
}
