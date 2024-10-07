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
// source: google/cloud/tasks/v2beta3/target.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.tasks.v2beta3;

public interface UriOverrideOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta3.UriOverride)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Scheme override.
   *
   * When specified, the task URI scheme is replaced by the provided value (HTTP
   * or HTTPS).
   * </pre>
   *
   * <code>optional .google.cloud.tasks.v2beta3.UriOverride.Scheme scheme = 1;</code>
   *
   * @return Whether the scheme field is set.
   */
  boolean hasScheme();
  /**
   *
   *
   * <pre>
   * Scheme override.
   *
   * When specified, the task URI scheme is replaced by the provided value (HTTP
   * or HTTPS).
   * </pre>
   *
   * <code>optional .google.cloud.tasks.v2beta3.UriOverride.Scheme scheme = 1;</code>
   *
   * @return The enum numeric value on the wire for scheme.
   */
  int getSchemeValue();
  /**
   *
   *
   * <pre>
   * Scheme override.
   *
   * When specified, the task URI scheme is replaced by the provided value (HTTP
   * or HTTPS).
   * </pre>
   *
   * <code>optional .google.cloud.tasks.v2beta3.UriOverride.Scheme scheme = 1;</code>
   *
   * @return The scheme.
   */
  com.google.cloud.tasks.v2beta3.UriOverride.Scheme getScheme();

  /**
   *
   *
   * <pre>
   * Host override.
   *
   * When specified, replaces the host part of the task URL. For example,
   * if the task URL is "https://www.google.com," and host value is set to
   * "example.net", the overridden URI will be changed to "https://example.net."
   * Host value cannot be an empty string (INVALID_ARGUMENT).
   * </pre>
   *
   * <code>optional string host = 2;</code>
   *
   * @return Whether the host field is set.
   */
  boolean hasHost();
  /**
   *
   *
   * <pre>
   * Host override.
   *
   * When specified, replaces the host part of the task URL. For example,
   * if the task URL is "https://www.google.com," and host value is set to
   * "example.net", the overridden URI will be changed to "https://example.net."
   * Host value cannot be an empty string (INVALID_ARGUMENT).
   * </pre>
   *
   * <code>optional string host = 2;</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Host override.
   *
   * When specified, replaces the host part of the task URL. For example,
   * if the task URL is "https://www.google.com," and host value is set to
   * "example.net", the overridden URI will be changed to "https://example.net."
   * Host value cannot be an empty string (INVALID_ARGUMENT).
   * </pre>
   *
   * <code>optional string host = 2;</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Port override.
   *
   * When specified, replaces the port part of the task URI. For instance,
   * for a URI http://www.google.com/foo and port=123, the overridden URI
   * becomes http://www.google.com:123/foo. Note that the port value must be a
   * positive integer. Setting the port to 0 (Zero) clears the URI port.
   * </pre>
   *
   * <code>optional int64 port = 3;</code>
   *
   * @return Whether the port field is set.
   */
  boolean hasPort();
  /**
   *
   *
   * <pre>
   * Port override.
   *
   * When specified, replaces the port part of the task URI. For instance,
   * for a URI http://www.google.com/foo and port=123, the overridden URI
   * becomes http://www.google.com:123/foo. Note that the port value must be a
   * positive integer. Setting the port to 0 (Zero) clears the URI port.
   * </pre>
   *
   * <code>optional int64 port = 3;</code>
   *
   * @return The port.
   */
  long getPort();

  /**
   *
   *
   * <pre>
   * URI path.
   *
   * When specified, replaces the existing path of the task URL. Setting the
   * path value to an empty string clears the URI path segment.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.PathOverride path_override = 4;</code>
   *
   * @return Whether the pathOverride field is set.
   */
  boolean hasPathOverride();
  /**
   *
   *
   * <pre>
   * URI path.
   *
   * When specified, replaces the existing path of the task URL. Setting the
   * path value to an empty string clears the URI path segment.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.PathOverride path_override = 4;</code>
   *
   * @return The pathOverride.
   */
  com.google.cloud.tasks.v2beta3.PathOverride getPathOverride();
  /**
   *
   *
   * <pre>
   * URI path.
   *
   * When specified, replaces the existing path of the task URL. Setting the
   * path value to an empty string clears the URI path segment.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.PathOverride path_override = 4;</code>
   */
  com.google.cloud.tasks.v2beta3.PathOverrideOrBuilder getPathOverrideOrBuilder();

  /**
   *
   *
   * <pre>
   * URI Query.
   *
   * When specified, replaces the query part of the task URI. Setting the
   * query value to an empty string clears the URI query segment.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.QueryOverride query_override = 5;</code>
   *
   * @return Whether the queryOverride field is set.
   */
  boolean hasQueryOverride();
  /**
   *
   *
   * <pre>
   * URI Query.
   *
   * When specified, replaces the query part of the task URI. Setting the
   * query value to an empty string clears the URI query segment.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.QueryOverride query_override = 5;</code>
   *
   * @return The queryOverride.
   */
  com.google.cloud.tasks.v2beta3.QueryOverride getQueryOverride();
  /**
   *
   *
   * <pre>
   * URI Query.
   *
   * When specified, replaces the query part of the task URI. Setting the
   * query value to an empty string clears the URI query segment.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta3.QueryOverride query_override = 5;</code>
   */
  com.google.cloud.tasks.v2beta3.QueryOverrideOrBuilder getQueryOverrideOrBuilder();

  /**
   *
   *
   * <pre>
   * URI Override Enforce Mode
   *
   * When specified, determines the Target UriOverride mode. If not specified,
   * it defaults to ALWAYS.
   * </pre>
   *
   * <code>
   * .google.cloud.tasks.v2beta3.UriOverride.UriOverrideEnforceMode uri_override_enforce_mode = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for uriOverrideEnforceMode.
   */
  int getUriOverrideEnforceModeValue();
  /**
   *
   *
   * <pre>
   * URI Override Enforce Mode
   *
   * When specified, determines the Target UriOverride mode. If not specified,
   * it defaults to ALWAYS.
   * </pre>
   *
   * <code>
   * .google.cloud.tasks.v2beta3.UriOverride.UriOverrideEnforceMode uri_override_enforce_mode = 6;
   * </code>
   *
   * @return The uriOverrideEnforceMode.
   */
  com.google.cloud.tasks.v2beta3.UriOverride.UriOverrideEnforceMode getUriOverrideEnforceMode();
}
