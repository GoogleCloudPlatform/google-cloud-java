// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/v1/cloud_catalog.proto

package com.google.cloud.billing.v1;

public interface ListServicesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.ListServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Requested page size. Defaults to 5000.
   * </pre>
   *
   * <code>int32 page_size = 1;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * A token identifying a page of results to return. This should be a
   * `next_page_token` value returned from a previous `ListServices`
   * call. If unspecified, the first page of results is returned.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * A token identifying a page of results to return. This should be a
   * `next_page_token` value returned from a previous `ListServices`
   * call. If unspecified, the first page of results is returned.
   * </pre>
   *
   * <code>string page_token = 2;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
