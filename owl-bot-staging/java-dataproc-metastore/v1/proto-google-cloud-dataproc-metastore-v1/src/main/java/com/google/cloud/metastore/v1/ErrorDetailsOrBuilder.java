// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1/metastore.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1;

public interface ErrorDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1.ErrorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  int getDetailsCount();
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  boolean containsDetails(
      java.lang.String key);
  /**
   * Use {@link #getDetailsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getDetails();
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getDetailsMap();
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  /* nullable */
java.lang.String getDetailsOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Additional structured details about this error.
   *
   * Keys define the failure items.
   * Value describes the exception or details of the item.
   * </pre>
   *
   * <code>map&lt;string, string&gt; details = 1;</code>
   */
  java.lang.String getDetailsOrThrow(
      java.lang.String key);
}
