// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface ReservationAffinityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ReservationAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Type of reservation to consume
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The enum numeric value on the wire for consumeReservationType.
   */
  int getConsumeReservationTypeValue();
  /**
   * <pre>
   * Optional. Type of reservation to consume
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.ReservationAffinity.Type consume_reservation_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The consumeReservationType.
   */
  com.google.cloud.dataproc.v1.ReservationAffinity.Type getConsumeReservationType();

  /**
   * <pre>
   * Optional. Corresponds to the label key of reservation resource.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Optional. Corresponds to the label key of reservation resource.
   * </pre>
   *
   * <code>string key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * Optional. Corresponds to the label values of reservation resource.
   * </pre>
   *
   * <code>repeated string values = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
