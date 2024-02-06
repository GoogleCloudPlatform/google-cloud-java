// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1/datastream.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1;

public interface ListStreamObjectsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.ListStreamObjectsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.StreamObject> 
      getStreamObjectsList();
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.StreamObject getStreamObjects(int index);
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  int getStreamObjectsCount();
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.StreamObjectOrBuilder> 
      getStreamObjectsOrBuilderList();
  /**
   * <pre>
   * List of stream objects.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.StreamObject stream_objects = 1;</code>
   */
  com.google.cloud.datastream.v1.StreamObjectOrBuilder getStreamObjectsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
