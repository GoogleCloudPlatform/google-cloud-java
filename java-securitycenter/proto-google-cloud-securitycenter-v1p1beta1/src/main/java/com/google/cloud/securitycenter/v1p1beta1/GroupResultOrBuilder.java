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
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1p1beta1;

public interface GroupResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.GroupResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getProperties();
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  /* nullable */
  com.google.protobuf.Value getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);
  /**
   *
   *
   * <pre>
   * Properties matching the groupBy fields in the request.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; properties = 1;</code>
   */
  com.google.protobuf.Value getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Total count of resources for the given properties.
   * </pre>
   *
   * <code>int64 count = 2;</code>
   *
   * @return The count.
   */
  long getCount();
}
