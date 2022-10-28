// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/tasks/v2/cloudtasks.proto

package com.google.cloud.tasks.v2;

public interface PurgeQueueRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.PurgeQueueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The queue name. For example:
   * `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The queue name. For example:
   * `projects/PROJECT_ID/location/LOCATION_ID/queues/QUEUE_ID`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
