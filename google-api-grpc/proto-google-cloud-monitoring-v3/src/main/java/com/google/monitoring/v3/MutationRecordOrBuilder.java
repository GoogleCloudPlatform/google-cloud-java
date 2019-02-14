// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/mutation_record.proto

package com.google.monitoring.v3;

public interface MutationRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.MutationRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  boolean hasMutateTime();
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  com.google.protobuf.Timestamp getMutateTime();
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMutateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   */
  java.lang.String getMutatedBy();
  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   */
  com.google.protobuf.ByteString getMutatedByBytes();
}
