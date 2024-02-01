// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.data.v1alpha;

public interface QuotaStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.QuotaStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Quota consumed by this request.
   * </pre>
   *
   * <code>int32 consumed = 1;</code>
   * @return The consumed.
   */
  int getConsumed();

  /**
   * <pre>
   * Quota remaining after this request.
   * </pre>
   *
   * <code>int32 remaining = 2;</code>
   * @return The remaining.
   */
  int getRemaining();
}
