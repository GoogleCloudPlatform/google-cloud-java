// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/scheduler/v1beta1/cloudscheduler.proto

package com.google.cloud.scheduler.v1beta1;

public interface ListJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1beta1.ListJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required.
   * The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required.
   * The location name. For example:
   * `projects/PROJECT_ID/locations/LOCATION_ID`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Requested page size.
   * The maximum page size is 500. If unspecified, the page size will
   * be the maximum. Fewer jobs than requested might be returned,
   * even if more jobs exist; use next_page_token to determine if more
   * jobs exist.
   * </pre>
   *
   * <code>int32 page_size = 5;</code>
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server will return. To
   * request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.scheduler.v1beta1.ListJobsResponse.next_page_token] returned from
   * the previous call to [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs]. It is an error to
   * switch the value of [filter][google.cloud.scheduler.v1beta1.ListJobsRequest.filter] or
   * [order_by][google.cloud.scheduler.v1beta1.ListJobsRequest.order_by] while iterating through pages.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A token identifying a page of results the server will return. To
   * request the first page results, page_token must be empty. To
   * request the next page of results, page_token must be the value of
   * [next_page_token][google.cloud.scheduler.v1beta1.ListJobsResponse.next_page_token] returned from
   * the previous call to [ListJobs][google.cloud.scheduler.v1beta1.CloudScheduler.ListJobs]. It is an error to
   * switch the value of [filter][google.cloud.scheduler.v1beta1.ListJobsRequest.filter] or
   * [order_by][google.cloud.scheduler.v1beta1.ListJobsRequest.order_by] while iterating through pages.
   * </pre>
   *
   * <code>string page_token = 6;</code>
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
