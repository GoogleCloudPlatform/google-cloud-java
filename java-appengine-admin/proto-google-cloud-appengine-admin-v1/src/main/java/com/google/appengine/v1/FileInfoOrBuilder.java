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
// source: google/appengine/v1/deploy.proto

package com.google.appengine.v1;

public interface FileInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.FileInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL source to use to fetch this file. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 1;</code>
   *
   * @return The sourceUrl.
   */
  java.lang.String getSourceUrl();
  /**
   *
   *
   * <pre>
   * URL source to use to fetch this file. Must be a URL to a resource in
   * Google Cloud Storage in the form
   * 'http(s)://storage.googleapis.com/&#92;&lt;bucket&#92;&gt;/&#92;&lt;object&#92;&gt;'.
   * </pre>
   *
   * <code>string source_url = 1;</code>
   *
   * @return The bytes for sourceUrl.
   */
  com.google.protobuf.ByteString getSourceUrlBytes();

  /**
   *
   *
   * <pre>
   * The SHA1 hash of the file, in hex.
   * </pre>
   *
   * <code>string sha1_sum = 2;</code>
   *
   * @return The sha1Sum.
   */
  java.lang.String getSha1Sum();
  /**
   *
   *
   * <pre>
   * The SHA1 hash of the file, in hex.
   * </pre>
   *
   * <code>string sha1_sum = 2;</code>
   *
   * @return The bytes for sha1Sum.
   */
  com.google.protobuf.ByteString getSha1SumBytes();

  /**
   *
   *
   * <pre>
   * The MIME type of the file.
   * Defaults to the value from Google Cloud Storage.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The mimeType.
   */
  java.lang.String getMimeType();
  /**
   *
   *
   * <pre>
   * The MIME type of the file.
   * Defaults to the value from Google Cloud Storage.
   * </pre>
   *
   * <code>string mime_type = 3;</code>
   *
   * @return The bytes for mimeType.
   */
  com.google.protobuf.ByteString getMimeTypeBytes();
}
