// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface ReconcileTagsMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ReconcileTagsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * State of the reconciliation operation.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * State of the reconciliation operation.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState state = 1;</code>
   * @return The state.
   */
  com.google.cloud.datacatalog.v1.ReconcileTagsMetadata.ReconciliationState getState();

  /**
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  boolean containsErrors(
      java.lang.String key);
  /**
   * Use {@link #getErrorsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.rpc.Status>
  getErrors();
  /**
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  java.util.Map<java.lang.String, com.google.rpc.Status>
  getErrorsMap();
  /**
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  /* nullable */
com.google.rpc.Status getErrorsOrDefault(
      java.lang.String key,
      /* nullable */
com.google.rpc.Status defaultValue);
  /**
   * <pre>
   * Maps the name of each tagged column (or empty string for a
   * sole entry) to tagging operation [status][google.rpc.Status].
   * </pre>
   *
   * <code>map&lt;string, .google.rpc.Status&gt; errors = 2;</code>
   */
  com.google.rpc.Status getErrorsOrThrow(
      java.lang.String key);
}
