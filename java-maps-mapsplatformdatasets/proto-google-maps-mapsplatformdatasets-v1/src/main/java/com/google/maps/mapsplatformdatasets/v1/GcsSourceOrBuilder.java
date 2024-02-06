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
// source: google/maps/mapsplatformdatasets/v1/data_source.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.mapsplatformdatasets.v1;

public interface GcsSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Source data URI. For example, `gs://my_bucket/my_object`.
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The inputUri.
   */
  java.lang.String getInputUri();
  /**
   *
   *
   * <pre>
   * Source data URI. For example, `gs://my_bucket/my_object`.
   * </pre>
   *
   * <code>string input_uri = 1;</code>
   *
   * @return The bytes for inputUri.
   */
  com.google.protobuf.ByteString getInputUriBytes();

  /**
   *
   *
   * <pre>
   * The file format of the Google Cloud Storage object. This is used mainly for
   * validation.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1.FileFormat file_format = 2;</code>
   *
   * @return The enum numeric value on the wire for fileFormat.
   */
  int getFileFormatValue();
  /**
   *
   *
   * <pre>
   * The file format of the Google Cloud Storage object. This is used mainly for
   * validation.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1.FileFormat file_format = 2;</code>
   *
   * @return The fileFormat.
   */
  com.google.maps.mapsplatformdatasets.v1.FileFormat getFileFormat();
}
