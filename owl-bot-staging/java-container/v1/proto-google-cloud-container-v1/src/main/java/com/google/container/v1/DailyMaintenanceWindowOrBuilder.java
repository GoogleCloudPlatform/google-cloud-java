// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface DailyMaintenanceWindowOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.DailyMaintenanceWindow)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Time within the maintenance window to start the maintenance operations.
   * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
   * </pre>
   *
   * <code>string start_time = 2;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <pre>
   * Time within the maintenance window to start the maintenance operations.
   * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
   * </pre>
   *
   * <code>string start_time = 2;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be
   * smallest possible in the given scenario.
   * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "PTnHnMnS".
   * </pre>
   *
   * <code>string duration = 3;</code>
   * @return The duration.
   */
  java.lang.String getDuration();
  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be
   * smallest possible in the given scenario.
   * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "PTnHnMnS".
   * </pre>
   *
   * <code>string duration = 3;</code>
   * @return The bytes for duration.
   */
  com.google.protobuf.ByteString
      getDurationBytes();
}
