// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

public interface FetchRepositoryHistoryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.FetchRepositoryHistoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The repository's name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. Maximum number of commits to return. The server may return fewer
   * items than requested. If unspecified, the server will pick an appropriate
   * default.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * Optional. Page token received from a previous `FetchRepositoryHistory`
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `FetchRepositoryHistory`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * Optional. Page token received from a previous `FetchRepositoryHistory`
   * call. Provide this to retrieve the subsequent page.
   *
   * When paginating, all other parameters provided to `FetchRepositoryHistory`
   * must match the call that provided the page token.
   * </pre>
   *
   * <code>string page_token = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
