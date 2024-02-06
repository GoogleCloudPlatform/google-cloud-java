// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/cloudquotas/v1/cloudquotas.proto

// Protobuf Java Version: 3.25.2
package com.google.api.cloudquotas.v1;

public interface GetQuotaPreferenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1.GetQuotaPreferenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the resource
   *
   * Example name:
   * `projects/123/locations/global/quota_preferences/my-config-for-us-east1`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the resource
   *
   * Example name:
   * `projects/123/locations/global/quota_preferences/my-config-for-us-east1`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
