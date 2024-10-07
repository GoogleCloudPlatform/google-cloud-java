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
// source: google/cloud/functions/v2/functions.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.functions.v2;

public interface StorageSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.functions.v2.StorageSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket containing the source (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket containing the source (see
   * [Bucket Name
   * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage object containing the source.
   *
   * This object must be a gzipped archive file (`.tar.gz`) containing source to
   * build.
   * </pre>
   *
   * <code>string object = 2;</code>
   *
   * @return The object.
   */
  java.lang.String getObject();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage object containing the source.
   *
   * This object must be a gzipped archive file (`.tar.gz`) containing source to
   * build.
   * </pre>
   *
   * <code>string object = 2;</code>
   *
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString getObjectBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage generation for the object. If the generation is
   * omitted, the latest generation will be used.
   * </pre>
   *
   * <code>int64 generation = 3;</code>
   *
   * @return The generation.
   */
  long getGeneration();

  /**
   *
   *
   * <pre>
   * When the specified storage bucket is a 1st gen function uploard url bucket,
   * this field should be set as the generated upload url for 1st gen
   * deployment.
   * </pre>
   *
   * <code>string source_upload_url = 4;</code>
   *
   * @return The sourceUploadUrl.
   */
  java.lang.String getSourceUploadUrl();
  /**
   *
   *
   * <pre>
   * When the specified storage bucket is a 1st gen function uploard url bucket,
   * this field should be set as the generated upload url for 1st gen
   * deployment.
   * </pre>
   *
   * <code>string source_upload_url = 4;</code>
   *
   * @return The bytes for sourceUploadUrl.
   */
  com.google.protobuf.ByteString getSourceUploadUrlBytes();
}
