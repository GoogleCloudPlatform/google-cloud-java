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
// source: google/cloud/notebooks/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.notebooks.v1;

public interface UpdateInstanceMetadataItemsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.UpdateInstanceMetadataItemsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Map of items that were added/updated to/in the metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 1;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * Map of items that were added/updated to/in the metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 1;</code>
   */
  boolean containsItems(java.lang.String key);
  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getItems();
  /**
   *
   *
   * <pre>
   * Map of items that were added/updated to/in the metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getItemsMap();
  /**
   *
   *
   * <pre>
   * Map of items that were added/updated to/in the metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 1;</code>
   */
  /* nullable */
  java.lang.String getItemsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Map of items that were added/updated to/in the metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; items = 1;</code>
   */
  java.lang.String getItemsOrThrow(java.lang.String key);
}
