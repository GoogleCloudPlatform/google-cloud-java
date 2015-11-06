// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ListSubscriptionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ListSubscriptionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string project = 1;</code>
   *
   * <pre>
   * The name of the cloud project that subscriptions belong to.
   * </pre>
   */
  java.lang.String getProject();
  /**
   * <code>optional string project = 1;</code>
   *
   * <pre>
   * The name of the cloud project that subscriptions belong to.
   * </pre>
   */
  com.google.protobuf.ByteString
      getProjectBytes();

  /**
   * <code>optional int32 page_size = 2;</code>
   *
   * <pre>
   * Maximum number of subscriptions to return.
   * </pre>
   */
  int getPageSize();

  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The value returned by the last ListSubscriptionsResponse; indicates that
   * this is a continuation of a prior ListSubscriptions call, and that the
   * system should return the next page of data.
   * </pre>
   */
  java.lang.String getPageToken();
  /**
   * <code>optional string page_token = 3;</code>
   *
   * <pre>
   * The value returned by the last ListSubscriptionsResponse; indicates that
   * this is a continuation of a prior ListSubscriptions call, and that the
   * system should return the next page of data.
   * </pre>
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
