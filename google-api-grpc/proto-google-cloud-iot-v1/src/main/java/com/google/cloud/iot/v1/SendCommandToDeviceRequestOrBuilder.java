// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

public interface SendCommandToDeviceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.iot.v1.SendCommandToDeviceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The command data to send to the device.
   * </pre>
   *
   * <code>bytes binary_data = 2;</code>
   */
  com.google.protobuf.ByteString getBinaryData();

  /**
   *
   *
   * <pre>
   * Optional subfolder for the command. If empty, the command will be delivered
   * to the /devices/{device-id}/commands topic, otherwise it will be delivered
   * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
   * subfolders are allowed. This field must not have more than 256 characters,
   * and must not contain any MQTT wildcards ("+" or "#") or null characters.
   * </pre>
   *
   * <code>string subfolder = 3;</code>
   */
  java.lang.String getSubfolder();
  /**
   *
   *
   * <pre>
   * Optional subfolder for the command. If empty, the command will be delivered
   * to the /devices/{device-id}/commands topic, otherwise it will be delivered
   * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
   * subfolders are allowed. This field must not have more than 256 characters,
   * and must not contain any MQTT wildcards ("+" or "#") or null characters.
   * </pre>
   *
   * <code>string subfolder = 3;</code>
   */
  com.google.protobuf.ByteString getSubfolderBytes();
}
