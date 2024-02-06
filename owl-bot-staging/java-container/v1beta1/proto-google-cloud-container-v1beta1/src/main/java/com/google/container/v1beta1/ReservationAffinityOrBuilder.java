// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1beta1;

public interface ReservationAffinityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.ReservationAffinity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Corresponds to the type of reservation consumption.
   * </pre>
   *
   * <code>.google.container.v1beta1.ReservationAffinity.Type consume_reservation_type = 1;</code>
   * @return The enum numeric value on the wire for consumeReservationType.
   */
  int getConsumeReservationTypeValue();
  /**
   * <pre>
   * Corresponds to the type of reservation consumption.
   * </pre>
   *
   * <code>.google.container.v1beta1.ReservationAffinity.Type consume_reservation_type = 1;</code>
   * @return The consumeReservationType.
   */
  com.google.container.v1beta1.ReservationAffinity.Type getConsumeReservationType();

  /**
   * <pre>
   * Corresponds to the label key of a reservation resource. To target a
   * SPECIFIC_RESERVATION by name, specify
   * "compute.googleapis.com/reservation-name" as the key and specify the name
   * of your reservation as its value.
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * Corresponds to the label key of a reservation resource. To target a
   * SPECIFIC_RESERVATION by name, specify
   * "compute.googleapis.com/reservation-name" as the key and specify the name
   * of your reservation as its value.
   * </pre>
   *
   * <code>string key = 2;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * Corresponds to the label value(s) of reservation resource(s).
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * Corresponds to the label value(s) of reservation resource(s).
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * Corresponds to the label value(s) of reservation resource(s).
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * Corresponds to the label value(s) of reservation resource(s).
   * </pre>
   *
   * <code>repeated string values = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
