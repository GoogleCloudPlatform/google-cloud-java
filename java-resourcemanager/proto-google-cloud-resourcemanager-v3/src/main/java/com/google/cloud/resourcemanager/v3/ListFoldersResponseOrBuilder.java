/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/folders.proto

package com.google.cloud.resourcemanager.v3;

public interface ListFoldersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.ListFoldersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A possibly paginated list of folders that are direct descendants of
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  java.util.List<com.google.cloud.resourcemanager.v3.Folder> getFoldersList();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of folders that are direct descendants of
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.Folder getFolders(int index);
  /**
   *
   *
   * <pre>
   * A possibly paginated list of folders that are direct descendants of
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  int getFoldersCount();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of folders that are direct descendants of
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  java.util.List<? extends com.google.cloud.resourcemanager.v3.FolderOrBuilder>
      getFoldersOrBuilderList();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of folders that are direct descendants of
   * the specified parent resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.Folder folders = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.FolderOrBuilder getFoldersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to `ListFolders`
   * that indicates from where listing should continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A pagination token returned from a previous call to `ListFolders`
   * that indicates from where listing should continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
