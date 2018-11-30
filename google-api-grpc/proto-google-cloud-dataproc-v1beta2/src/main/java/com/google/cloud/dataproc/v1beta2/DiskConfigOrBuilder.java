// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface DiskConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.DiskConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Type of the boot disk (default is "pd-standard").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
   * "pd-standard" (Persistent Disk Hard Disk Drive).
   * </pre>
   *
   * <code>string boot_disk_type = 3;</code>
   */
  java.lang.String getBootDiskType();
  /**
   *
   *
   * <pre>
   * Optional. Type of the boot disk (default is "pd-standard").
   * Valid values: "pd-ssd" (Persistent Disk Solid State Drive) or
   * "pd-standard" (Persistent Disk Hard Disk Drive).
   * </pre>
   *
   * <code>string boot_disk_type = 3;</code>
   */
  com.google.protobuf.ByteString getBootDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Size in GB of the boot disk (default is 500GB).
   * </pre>
   *
   * <code>int32 boot_disk_size_gb = 1;</code>
   */
  int getBootDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. Number of attached SSDs, from 0 to 4 (default is 0).
   * If SSDs are not attached, the boot disk is used to store runtime logs and
   * [HDFS](https://hadoop.apache.org/docs/r1.2.1/hdfs_user_guide.html) data.
   * If one or more SSDs are attached, this runtime bulk
   * data is spread across them, and the boot disk contains only basic
   * config and installed binaries.
   * </pre>
   *
   * <code>int32 num_local_ssds = 2;</code>
   */
  int getNumLocalSsds();
}
