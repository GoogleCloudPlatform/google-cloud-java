// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/folders.proto

package com.google.cloud.resourcemanager.v3;

public interface SearchFoldersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.SearchFoldersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  java.util.List<com.google.cloud.resourcemanager.v3.Folder> 
      getFoldersList();
  /**
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.Folder getFolders(int index);
  /**
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  int getFoldersCount();
  /**
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  java.util.List<? extends com.google.cloud.resourcemanager.v3.FolderOrBuilder> 
      getFoldersOrBuilderList();
  /**
   * <pre>
   * A possibly paginated folder search results.
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.FolderOrBuilder getFoldersOrBuilder(
      int index);

  /**
   * <pre>
   * A pagination token returned from a previous call to `SearchFolders`
   * that indicates from where searching should continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A pagination token returned from a previous call to `SearchFolders`
   * that indicates from where searching should continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
