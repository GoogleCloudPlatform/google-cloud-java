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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface RawDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RawDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
   * Check the ContainerType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string container_type = 318809144;</code>
   *
   * @return Whether the containerType field is set.
   */
  boolean hasContainerType();
  /**
   *
   *
   * <pre>
   * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
   * Check the ContainerType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string container_type = 318809144;</code>
   *
   * @return The containerType.
   */
  java.lang.String getContainerType();
  /**
   *
   *
   * <pre>
   * The format used to encode and transmit the block device, which should be TAR. This is just a container and transmission format and not a runtime format. Provided by the client when the disk image is created.
   * Check the ContainerType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string container_type = 318809144;</code>
   *
   * @return The bytes for containerType.
   */
  com.google.protobuf.ByteString getContainerTypeBytes();

  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
   * </pre>
   *
   * <code>optional string sha1_checksum = 314444349;</code>
   *
   * @return Whether the sha1Checksum field is set.
   */
  boolean hasSha1Checksum();
  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
   * </pre>
   *
   * <code>optional string sha1_checksum = 314444349;</code>
   *
   * @return The sha1Checksum.
   */
  java.lang.String getSha1Checksum();
  /**
   *
   *
   * <pre>
   * [Deprecated] This field is deprecated. An optional SHA1 checksum of the disk image before unpackaging provided by the client when the disk image is created.
   * </pre>
   *
   * <code>optional string sha1_checksum = 314444349;</code>
   *
   * @return The bytes for sha1Checksum.
   */
  com.google.protobuf.ByteString getSha1ChecksumBytes();

  /**
   *
   *
   * <pre>
   * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The source.
   */
  java.lang.String getSource();
  /**
   *
   *
   * <pre>
   * The full Google Cloud Storage URL where the raw disk image archive is stored. The following are valid formats for the URL: - https://storage.googleapis.com/bucket_name/image_archive_name - https://storage.googleapis.com/bucket_name/folder_name/ image_archive_name In order to create an image, you must provide the full or partial URL of one of the following: - The rawDisk.source URL - The sourceDisk URL - The sourceImage URL - The sourceSnapshot URL
   * </pre>
   *
   * <code>optional string source = 177235995;</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();
}
