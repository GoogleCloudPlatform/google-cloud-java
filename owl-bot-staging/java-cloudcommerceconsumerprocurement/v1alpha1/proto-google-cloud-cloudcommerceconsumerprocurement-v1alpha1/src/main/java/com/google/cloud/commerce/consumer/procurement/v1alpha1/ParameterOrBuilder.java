// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/commerce/consumer/procurement/v1alpha1/order.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.commerce.consumer.procurement.v1alpha1;

public interface ParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.commerce.consumer.procurement.v1alpha1.Parameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the parameter.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the parameter.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Value of parameter.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter.Value value = 2;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Value of parameter.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter.Value value = 2;</code>
   * @return The value.
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter.Value getValue();
  /**
   * <pre>
   * Value of parameter.
   * </pre>
   *
   * <code>.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter.Value value = 2;</code>
   */
  com.google.cloud.commerce.consumer.procurement.v1alpha1.Parameter.ValueOrBuilder getValueOrBuilder();
}
