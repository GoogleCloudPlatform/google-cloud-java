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

public interface LocalFileSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.maps.mapsplatformdatasets.v1.LocalFileSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The file name of the uploaded file.
   * </pre>
   *
   * <code>string filename = 1;</code>
   *
   * @return The filename.
   */
  java.lang.String getFilename();
  /**
   *
   *
   * <pre>
   * The file name of the uploaded file.
   * </pre>
   *
   * <code>string filename = 1;</code>
   *
   * @return The bytes for filename.
   */
  com.google.protobuf.ByteString getFilenameBytes();

  /**
   *
   *
   * <pre>
   * The format of the file that is being uploaded.
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
   * The format of the file that is being uploaded.
   * </pre>
   *
   * <code>.google.maps.mapsplatformdatasets.v1.FileFormat file_format = 2;</code>
   *
   * @return The fileFormat.
   */
  com.google.maps.mapsplatformdatasets.v1.FileFormat getFileFormat();
}
