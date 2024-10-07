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
// source: google/cloud/lifesciences/v2beta/workflows.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.lifesciences.v2beta;

public interface VolumeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Volume)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user-supplied name for the volume. Used when mounting the volume into
   * [`Actions`][google.cloud.lifesciences.v2beta.Action]. The name must contain
   * only upper and lowercase alphanumeric characters and hyphens and cannot
   * start with a hyphen.
   * </pre>
   *
   * <code>string volume = 1;</code>
   *
   * @return The volume.
   */
  java.lang.String getVolume();
  /**
   *
   *
   * <pre>
   * A user-supplied name for the volume. Used when mounting the volume into
   * [`Actions`][google.cloud.lifesciences.v2beta.Action]. The name must contain
   * only upper and lowercase alphanumeric characters and hyphens and cannot
   * start with a hyphen.
   * </pre>
   *
   * <code>string volume = 1;</code>
   *
   * @return The bytes for volume.
   */
  com.google.protobuf.ByteString getVolumeBytes();

  /**
   *
   *
   * <pre>
   * Configuration for a persistent disk.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PersistentDisk persistent_disk = 2;</code>
   *
   * @return Whether the persistentDisk field is set.
   */
  boolean hasPersistentDisk();
  /**
   *
   *
   * <pre>
   * Configuration for a persistent disk.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PersistentDisk persistent_disk = 2;</code>
   *
   * @return The persistentDisk.
   */
  com.google.cloud.lifesciences.v2beta.PersistentDisk getPersistentDisk();
  /**
   *
   *
   * <pre>
   * Configuration for a persistent disk.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.PersistentDisk persistent_disk = 2;</code>
   */
  com.google.cloud.lifesciences.v2beta.PersistentDiskOrBuilder getPersistentDiskOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for a existing disk.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ExistingDisk existing_disk = 3;</code>
   *
   * @return Whether the existingDisk field is set.
   */
  boolean hasExistingDisk();
  /**
   *
   *
   * <pre>
   * Configuration for a existing disk.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ExistingDisk existing_disk = 3;</code>
   *
   * @return The existingDisk.
   */
  com.google.cloud.lifesciences.v2beta.ExistingDisk getExistingDisk();
  /**
   *
   *
   * <pre>
   * Configuration for a existing disk.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.ExistingDisk existing_disk = 3;</code>
   */
  com.google.cloud.lifesciences.v2beta.ExistingDiskOrBuilder getExistingDiskOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for an NFS mount.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.NFSMount nfs_mount = 4;</code>
   *
   * @return Whether the nfsMount field is set.
   */
  boolean hasNfsMount();
  /**
   *
   *
   * <pre>
   * Configuration for an NFS mount.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.NFSMount nfs_mount = 4;</code>
   *
   * @return The nfsMount.
   */
  com.google.cloud.lifesciences.v2beta.NFSMount getNfsMount();
  /**
   *
   *
   * <pre>
   * Configuration for an NFS mount.
   * </pre>
   *
   * <code>.google.cloud.lifesciences.v2beta.NFSMount nfs_mount = 4;</code>
   */
  com.google.cloud.lifesciences.v2beta.NFSMountOrBuilder getNfsMountOrBuilder();

  com.google.cloud.lifesciences.v2beta.Volume.StorageCase getStorageCase();
}
