// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

public interface IdentityConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.IdentityConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getUserServiceAccountMappingCount();
  /**
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean containsUserServiceAccountMapping(
      java.lang.String key);
  /**
   * Use {@link #getUserServiceAccountMappingMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getUserServiceAccountMapping();
  /**
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getUserServiceAccountMappingMap();
  /**
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  /* nullable */
java.lang.String getUserServiceAccountMappingOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * Required. Map of user to service account.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_service_account_mapping = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getUserServiceAccountMappingOrThrow(
      java.lang.String key);
}
