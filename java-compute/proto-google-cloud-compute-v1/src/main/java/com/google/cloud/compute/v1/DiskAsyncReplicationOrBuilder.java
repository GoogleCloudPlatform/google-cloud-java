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

public interface DiskAsyncReplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.DiskAsyncReplication)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the DiskConsistencyGroupPolicy if replication was started on the disk as a member of a group.
   * </pre>
   *
   * <code>optional string consistency_group_policy = 1991097;</code>
   *
   * @return Whether the consistencyGroupPolicy field is set.
   */
  boolean hasConsistencyGroupPolicy();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the DiskConsistencyGroupPolicy if replication was started on the disk as a member of a group.
   * </pre>
   *
   * <code>optional string consistency_group_policy = 1991097;</code>
   *
   * @return The consistencyGroupPolicy.
   */
  java.lang.String getConsistencyGroupPolicy();
  /**
   *
   *
   * <pre>
   * [Output Only] URL of the DiskConsistencyGroupPolicy if replication was started on the disk as a member of a group.
   * </pre>
   *
   * <code>optional string consistency_group_policy = 1991097;</code>
   *
   * @return The bytes for consistencyGroupPolicy.
   */
  com.google.protobuf.ByteString getConsistencyGroupPolicyBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] ID of the DiskConsistencyGroupPolicy if replication was started on the disk as a member of a group.
   * </pre>
   *
   * <code>optional string consistency_group_policy_id = 261065057;</code>
   *
   * @return Whether the consistencyGroupPolicyId field is set.
   */
  boolean hasConsistencyGroupPolicyId();
  /**
   *
   *
   * <pre>
   * [Output Only] ID of the DiskConsistencyGroupPolicy if replication was started on the disk as a member of a group.
   * </pre>
   *
   * <code>optional string consistency_group_policy_id = 261065057;</code>
   *
   * @return The consistencyGroupPolicyId.
   */
  java.lang.String getConsistencyGroupPolicyId();
  /**
   *
   *
   * <pre>
   * [Output Only] ID of the DiskConsistencyGroupPolicy if replication was started on the disk as a member of a group.
   * </pre>
   *
   * <code>optional string consistency_group_policy_id = 261065057;</code>
   *
   * @return The bytes for consistencyGroupPolicyId.
   */
  com.google.protobuf.ByteString getConsistencyGroupPolicyIdBytes();

  /**
   *
   *
   * <pre>
   * The other disk asynchronously replicated to or from the current disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
   * </pre>
   *
   * <code>optional string disk = 3083677;</code>
   *
   * @return Whether the disk field is set.
   */
  boolean hasDisk();
  /**
   *
   *
   * <pre>
   * The other disk asynchronously replicated to or from the current disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
   * </pre>
   *
   * <code>optional string disk = 3083677;</code>
   *
   * @return The disk.
   */
  java.lang.String getDisk();
  /**
   *
   *
   * <pre>
   * The other disk asynchronously replicated to or from the current disk. You can provide this as a partial or full URL to the resource. For example, the following are valid values: - https://www.googleapis.com/compute/v1/projects/project/zones/zone /disks/disk - projects/project/zones/zone/disks/disk - zones/zone/disks/disk
   * </pre>
   *
   * <code>optional string disk = 3083677;</code>
   *
   * @return The bytes for disk.
   */
  com.google.protobuf.ByteString getDiskBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the other disk asynchronously replicated to or from the current disk. This value identifies the exact disk that was used to create this replication. For example, if you started replicating the persistent disk from a disk that was later deleted and recreated under the same name, the disk ID would identify the exact version of the disk that was used.
   * </pre>
   *
   * <code>optional string disk_id = 60990205;</code>
   *
   * @return Whether the diskId field is set.
   */
  boolean hasDiskId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the other disk asynchronously replicated to or from the current disk. This value identifies the exact disk that was used to create this replication. For example, if you started replicating the persistent disk from a disk that was later deleted and recreated under the same name, the disk ID would identify the exact version of the disk that was used.
   * </pre>
   *
   * <code>optional string disk_id = 60990205;</code>
   *
   * @return The diskId.
   */
  java.lang.String getDiskId();
  /**
   *
   *
   * <pre>
   * [Output Only] The unique ID of the other disk asynchronously replicated to or from the current disk. This value identifies the exact disk that was used to create this replication. For example, if you started replicating the persistent disk from a disk that was later deleted and recreated under the same name, the disk ID would identify the exact version of the disk that was used.
   * </pre>
   *
   * <code>optional string disk_id = 60990205;</code>
   *
   * @return The bytes for diskId.
   */
  com.google.protobuf.ByteString getDiskIdBytes();
}
