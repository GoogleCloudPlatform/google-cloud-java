// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/snooze_service.proto

package com.google.monitoring.v3;

public interface GetSnoozeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.GetSnoozeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the `Snooze` to retrieve. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/snoozes/[SNOOZE_ID]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The ID of the `Snooze` to retrieve. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/snoozes/[SNOOZE_ID]
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
