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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface HostRuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.HostRule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * An optional description of this resource. Provide this property when you create the resource.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character, and if followed by anything, the immediate following character must be either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @return A list containing the hosts.
   */
  java.util.List<java.lang.String> getHostsList();
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character, and if followed by anything, the immediate following character must be either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @return The count of hosts.
   */
  int getHostsCount();
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character, and if followed by anything, the immediate following character must be either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @param index The index of the element to return.
   * @return The hosts at the given index.
   */
  java.lang.String getHosts(int index);
  /**
   *
   *
   * <pre>
   * The list of host patterns to match. They must be valid hostnames with optional port numbers in the format host:port. * matches any string of ([a-z0-9-.]*). In that case, * must be the first character, and if followed by anything, the immediate following character must be either - or .. * based matching is not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
   * </pre>
   *
   * <code>repeated string hosts = 99467211;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the hosts at the given index.
   */
  com.google.protobuf.ByteString getHostsBytes(int index);

  /**
   *
   *
   * <pre>
   * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
   * </pre>
   *
   * <code>optional string path_matcher = 337813272;</code>
   *
   * @return Whether the pathMatcher field is set.
   */
  boolean hasPathMatcher();
  /**
   *
   *
   * <pre>
   * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
   * </pre>
   *
   * <code>optional string path_matcher = 337813272;</code>
   *
   * @return The pathMatcher.
   */
  java.lang.String getPathMatcher();
  /**
   *
   *
   * <pre>
   * The name of the PathMatcher to use to match the path portion of the URL if the hostRule matches the URL's host portion.
   * </pre>
   *
   * <code>optional string path_matcher = 337813272;</code>
   *
   * @return The bytes for pathMatcher.
   */
  com.google.protobuf.ByteString getPathMatcherBytes();
}
