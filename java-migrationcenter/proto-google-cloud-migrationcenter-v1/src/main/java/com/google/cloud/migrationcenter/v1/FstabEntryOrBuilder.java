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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.migrationcenter.v1;

public interface FstabEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.FstabEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The block special device or remote filesystem to be mounted.
   * </pre>
   *
   * <code>string spec = 1;</code>
   *
   * @return The spec.
   */
  java.lang.String getSpec();
  /**
   *
   *
   * <pre>
   * The block special device or remote filesystem to be mounted.
   * </pre>
   *
   * <code>string spec = 1;</code>
   *
   * @return The bytes for spec.
   */
  com.google.protobuf.ByteString getSpecBytes();

  /**
   *
   *
   * <pre>
   * The mount point for the filesystem.
   * </pre>
   *
   * <code>string file = 2;</code>
   *
   * @return The file.
   */
  java.lang.String getFile();
  /**
   *
   *
   * <pre>
   * The mount point for the filesystem.
   * </pre>
   *
   * <code>string file = 2;</code>
   *
   * @return The bytes for file.
   */
  com.google.protobuf.ByteString getFileBytes();

  /**
   *
   *
   * <pre>
   * The type of the filesystem.
   * </pre>
   *
   * <code>string vfstype = 3;</code>
   *
   * @return The vfstype.
   */
  java.lang.String getVfstype();
  /**
   *
   *
   * <pre>
   * The type of the filesystem.
   * </pre>
   *
   * <code>string vfstype = 3;</code>
   *
   * @return The bytes for vfstype.
   */
  com.google.protobuf.ByteString getVfstypeBytes();

  /**
   *
   *
   * <pre>
   * Mount options associated with the filesystem.
   * </pre>
   *
   * <code>string mntops = 4;</code>
   *
   * @return The mntops.
   */
  java.lang.String getMntops();
  /**
   *
   *
   * <pre>
   * Mount options associated with the filesystem.
   * </pre>
   *
   * <code>string mntops = 4;</code>
   *
   * @return The bytes for mntops.
   */
  com.google.protobuf.ByteString getMntopsBytes();

  /**
   *
   *
   * <pre>
   * Used by dump to determine which filesystems need to be dumped.
   * </pre>
   *
   * <code>int32 freq = 5;</code>
   *
   * @return The freq.
   */
  int getFreq();

  /**
   *
   *
   * <pre>
   * Used by the fsck(8) program to determine the order in which filesystem
   * checks are done at reboot time.
   * </pre>
   *
   * <code>int32 passno = 6;</code>
   *
   * @return The passno.
   */
  int getPassno();
}
