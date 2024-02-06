// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v2/repositories.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v2;

public interface ListConnectionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v2.ListConnectionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of Connections.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Connection connections = 1;</code>
   */
  java.util.List<com.google.cloudbuild.v2.Connection> 
      getConnectionsList();
  /**
   * <pre>
   * The list of Connections.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Connection connections = 1;</code>
   */
  com.google.cloudbuild.v2.Connection getConnections(int index);
  /**
   * <pre>
   * The list of Connections.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Connection connections = 1;</code>
   */
  int getConnectionsCount();
  /**
   * <pre>
   * The list of Connections.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Connection connections = 1;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v2.ConnectionOrBuilder> 
      getConnectionsOrBuilderList();
  /**
   * <pre>
   * The list of Connections.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v2.Connection connections = 1;</code>
   */
  com.google.cloudbuild.v2.ConnectionOrBuilder getConnectionsOrBuilder(
      int index);

  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token identifying a page of results the server should return.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
