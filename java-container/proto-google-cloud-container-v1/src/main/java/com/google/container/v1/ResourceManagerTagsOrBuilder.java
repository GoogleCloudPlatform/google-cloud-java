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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1;

public interface ResourceManagerTagsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.ResourceManagerTags)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * TagKeyValue must be in one of the following formats ([KEY]=[VALUE])
   * 1. `tagKeys/{tag_key_id}=tagValues/{tag_value_id}`
   * 2. `{org_id}/{tag_key_name}={tag_value_name}`
   * 3. `{project_id}/{tag_key_name}={tag_value_name}`
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 1;</code>
   */
  int getTagsCount();
  /**
   *
   *
   * <pre>
   * TagKeyValue must be in one of the following formats ([KEY]=[VALUE])
   * 1. `tagKeys/{tag_key_id}=tagValues/{tag_value_id}`
   * 2. `{org_id}/{tag_key_name}={tag_value_name}`
   * 3. `{project_id}/{tag_key_name}={tag_value_name}`
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 1;</code>
   */
  boolean containsTags(java.lang.String key);
  /** Use {@link #getTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getTags();
  /**
   *
   *
   * <pre>
   * TagKeyValue must be in one of the following formats ([KEY]=[VALUE])
   * 1. `tagKeys/{tag_key_id}=tagValues/{tag_value_id}`
   * 2. `{org_id}/{tag_key_name}={tag_value_name}`
   * 3. `{project_id}/{tag_key_name}={tag_value_name}`
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getTagsMap();
  /**
   *
   *
   * <pre>
   * TagKeyValue must be in one of the following formats ([KEY]=[VALUE])
   * 1. `tagKeys/{tag_key_id}=tagValues/{tag_value_id}`
   * 2. `{org_id}/{tag_key_name}={tag_value_name}`
   * 3. `{project_id}/{tag_key_name}={tag_value_name}`
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 1;</code>
   */
  /* nullable */
  java.lang.String getTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * TagKeyValue must be in one of the following formats ([KEY]=[VALUE])
   * 1. `tagKeys/{tag_key_id}=tagValues/{tag_value_id}`
   * 2. `{org_id}/{tag_key_name}={tag_value_name}`
   * 3. `{project_id}/{tag_key_name}={tag_value_name}`
   * </pre>
   *
   * <code>map&lt;string, string&gt; tags = 1;</code>
   */
  java.lang.String getTagsOrThrow(java.lang.String key);
}
