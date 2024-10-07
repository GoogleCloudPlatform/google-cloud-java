/*
 * Copyright 2024 Google LLC
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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface DataProfilePubSubMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataProfilePubSubMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `full_resource` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
   *
   * @return Whether the profile field is set.
   */
  boolean hasProfile();
  /**
   *
   *
   * <pre>
   * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `full_resource` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
   *
   * @return The profile.
   */
  com.google.privacy.dlp.v2.TableDataProfile getProfile();
  /**
   *
   *
   * <pre>
   * If `DetailLevel` is `TABLE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `full_resource` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TableDataProfile profile = 1;</code>
   */
  com.google.privacy.dlp.v2.TableDataProfileOrBuilder getProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * If `DetailLevel` is `FILE_STORE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `file_store_path` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FileStoreDataProfile file_store_profile = 3;</code>
   *
   * @return Whether the fileStoreProfile field is set.
   */
  boolean hasFileStoreProfile();
  /**
   *
   *
   * <pre>
   * If `DetailLevel` is `FILE_STORE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `file_store_path` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FileStoreDataProfile file_store_profile = 3;</code>
   *
   * @return The fileStoreProfile.
   */
  com.google.privacy.dlp.v2.FileStoreDataProfile getFileStoreProfile();
  /**
   *
   *
   * <pre>
   * If `DetailLevel` is `FILE_STORE_PROFILE` this will be fully populated.
   * Otherwise, if `DetailLevel` is `RESOURCE_NAME`, then only `name` and
   * `file_store_path` will be populated.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FileStoreDataProfile file_store_profile = 3;</code>
   */
  com.google.privacy.dlp.v2.FileStoreDataProfileOrBuilder getFileStoreProfileOrBuilder();

  /**
   *
   *
   * <pre>
   * The event that caused the Pub/Sub message to be sent.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
   *
   * @return The enum numeric value on the wire for event.
   */
  int getEventValue();
  /**
   *
   *
   * <pre>
   * The event that caused the Pub/Sub message to be sent.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileAction.EventType event = 2;</code>
   *
   * @return The event.
   */
  com.google.privacy.dlp.v2.DataProfileAction.EventType getEvent();
}
