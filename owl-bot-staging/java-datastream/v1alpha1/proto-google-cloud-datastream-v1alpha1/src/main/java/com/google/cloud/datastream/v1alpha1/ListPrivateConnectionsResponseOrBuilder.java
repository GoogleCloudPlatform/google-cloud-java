// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datastream/v1alpha1/datastream.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datastream.v1alpha1;

public interface ListPrivateConnectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.ListPrivateConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of private connectivity configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.PrivateConnection private_connections = 1;</code>
   */
  java.util.List<com.google.cloud.datastream.v1alpha1.PrivateConnection> 
      getPrivateConnectionsList();
  /**
   * <pre>
   * List of private connectivity configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.PrivateConnection private_connections = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.PrivateConnection getPrivateConnections(int index);
  /**
   * <pre>
   * List of private connectivity configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.PrivateConnection private_connections = 1;</code>
   */
  int getPrivateConnectionsCount();
  /**
   * <pre>
   * List of private connectivity configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.PrivateConnection private_connections = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1alpha1.PrivateConnectionOrBuilder> 
      getPrivateConnectionsOrBuilderList();
  /**
   * <pre>
   * List of private connectivity configurations.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1alpha1.PrivateConnection private_connections = 1;</code>
   */
  com.google.cloud.datastream.v1alpha1.PrivateConnectionOrBuilder getPrivateConnectionsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
