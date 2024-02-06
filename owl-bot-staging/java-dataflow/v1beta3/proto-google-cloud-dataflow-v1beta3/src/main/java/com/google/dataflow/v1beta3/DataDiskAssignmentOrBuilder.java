// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/streaming.proto

// Protobuf Java Version: 3.25.2
package com.google.dataflow.v1beta3;

public interface DataDiskAssignmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.DataDiskAssignment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * VM instance name the data disks mounted to, for example
   * "myproject-1014-104817-4c2-harness-0".
   * </pre>
   *
   * <code>string vm_instance = 1;</code>
   * @return The vmInstance.
   */
  java.lang.String getVmInstance();
  /**
   * <pre>
   * VM instance name the data disks mounted to, for example
   * "myproject-1014-104817-4c2-harness-0".
   * </pre>
   *
   * <code>string vm_instance = 1;</code>
   * @return The bytes for vmInstance.
   */
  com.google.protobuf.ByteString
      getVmInstanceBytes();

  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @return A list containing the dataDisks.
   */
  java.util.List<java.lang.String>
      getDataDisksList();
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @return The count of dataDisks.
   */
  int getDataDisksCount();
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @param index The index of the element to return.
   * @return The dataDisks at the given index.
   */
  java.lang.String getDataDisks(int index);
  /**
   * <pre>
   * Mounted data disks. The order is important a data disk's 0-based index in
   * this list defines which persistent directory the disk is mounted to, for
   * example the list of { "myproject-1014-104817-4c2-harness-0-disk-0" },
   * { "myproject-1014-104817-4c2-harness-0-disk-1" }.
   * </pre>
   *
   * <code>repeated string data_disks = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dataDisks at the given index.
   */
  com.google.protobuf.ByteString
      getDataDisksBytes(int index);
}
