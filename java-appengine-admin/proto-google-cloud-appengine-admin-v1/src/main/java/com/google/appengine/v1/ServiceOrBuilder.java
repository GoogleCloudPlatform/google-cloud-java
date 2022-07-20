/*
 * Copyright 2020 Google LLC
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
// source: google/appengine/v1/service.proto

package com.google.appengine.v1;

public interface ServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Service)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full path to the Service resource in the API.
   * Example: `apps/myapp/services/default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Full path to the Service resource in the API.
   * Example: `apps/myapp/services/default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Relative name of the service within the application.
   * Example: `default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Relative name of the service within the application.
   * Example: `default`.
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Mapping that defines fractional HTTP traffic diversion to
   * different versions within the service.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit split = 3;</code>
   *
   * @return Whether the split field is set.
   */
  boolean hasSplit();
  /**
   *
   *
   * <pre>
   * Mapping that defines fractional HTTP traffic diversion to
   * different versions within the service.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit split = 3;</code>
   *
   * @return The split.
   */
  com.google.appengine.v1.TrafficSplit getSplit();
  /**
   *
   *
   * <pre>
   * Mapping that defines fractional HTTP traffic diversion to
   * different versions within the service.
   * </pre>
   *
   * <code>.google.appengine.v1.TrafficSplit split = 3;</code>
   */
  com.google.appengine.v1.TrafficSplitOrBuilder getSplitOrBuilder();

  /**
   *
   *
   * <pre>
   * A set of labels to apply to this service. Labels are key/value pairs that
   * describe the service and all resources that belong to it (e.g.,
   * versions). The labels can be used to search and group resources, and are
   * propagated to the usage and billing reports, enabling fine-grain analysis
   * of costs. An example of using labels is to tag resources belonging to
   * different environments (e.g., "env=prod", "env=qa").
   * &lt;p&gt;Label keys and values can be no longer than 63 characters and can only
   * contain lowercase letters, numeric characters, underscores, dashes, and
   * international characters. Label keys must start with a lowercase letter
   * or an international character. Each service can have at most 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * A set of labels to apply to this service. Labels are key/value pairs that
   * describe the service and all resources that belong to it (e.g.,
   * versions). The labels can be used to search and group resources, and are
   * propagated to the usage and billing reports, enabling fine-grain analysis
   * of costs. An example of using labels is to tag resources belonging to
   * different environments (e.g., "env=prod", "env=qa").
   * &lt;p&gt;Label keys and values can be no longer than 63 characters and can only
   * contain lowercase letters, numeric characters, underscores, dashes, and
   * international characters. Label keys must start with a lowercase letter
   * or an international character. Each service can have at most 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * A set of labels to apply to this service. Labels are key/value pairs that
   * describe the service and all resources that belong to it (e.g.,
   * versions). The labels can be used to search and group resources, and are
   * propagated to the usage and billing reports, enabling fine-grain analysis
   * of costs. An example of using labels is to tag resources belonging to
   * different environments (e.g., "env=prod", "env=qa").
   * &lt;p&gt;Label keys and values can be no longer than 63 characters and can only
   * contain lowercase letters, numeric characters, underscores, dashes, and
   * international characters. Label keys must start with a lowercase letter
   * or an international character. Each service can have at most 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * A set of labels to apply to this service. Labels are key/value pairs that
   * describe the service and all resources that belong to it (e.g.,
   * versions). The labels can be used to search and group resources, and are
   * propagated to the usage and billing reports, enabling fine-grain analysis
   * of costs. An example of using labels is to tag resources belonging to
   * different environments (e.g., "env=prod", "env=qa").
   * &lt;p&gt;Label keys and values can be no longer than 63 characters and can only
   * contain lowercase letters, numeric characters, underscores, dashes, and
   * international characters. Label keys must start with a lowercase letter
   * or an international character. Each service can have at most 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */

  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * A set of labels to apply to this service. Labels are key/value pairs that
   * describe the service and all resources that belong to it (e.g.,
   * versions). The labels can be used to search and group resources, and are
   * propagated to the usage and billing reports, enabling fine-grain analysis
   * of costs. An example of using labels is to tag resources belonging to
   * different environments (e.g., "env=prod", "env=qa").
   * &lt;p&gt;Label keys and values can be no longer than 63 characters and can only
   * contain lowercase letters, numeric characters, underscores, dashes, and
   * international characters. Label keys must start with a lowercase letter
   * or an international character. Each service can have at most 32 labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 4;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Ingress settings for this service. Will apply to all versions.
   * </pre>
   *
   * <code>.google.appengine.v1.NetworkSettings network_settings = 6;</code>
   *
   * @return Whether the networkSettings field is set.
   */
  boolean hasNetworkSettings();
  /**
   *
   *
   * <pre>
   * Ingress settings for this service. Will apply to all versions.
   * </pre>
   *
   * <code>.google.appengine.v1.NetworkSettings network_settings = 6;</code>
   *
   * @return The networkSettings.
   */
  com.google.appengine.v1.NetworkSettings getNetworkSettings();
  /**
   *
   *
   * <pre>
   * Ingress settings for this service. Will apply to all versions.
   * </pre>
   *
   * <code>.google.appengine.v1.NetworkSettings network_settings = 6;</code>
   */
  com.google.appengine.v1.NetworkSettingsOrBuilder getNetworkSettingsOrBuilder();
}
