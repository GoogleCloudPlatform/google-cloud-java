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

public interface TargetTcpProxiesSetProxyHeaderRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.TargetTcpProxiesSetProxyHeaderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return Whether the proxyHeader field is set.
   */
  boolean hasProxyHeader();
  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The proxyHeader.
   */
  java.lang.String getProxyHeader();
  /**
   *
   *
   * <pre>
   * The new type of proxy header to append before sending data to the backend. NONE or PROXY_V1 are allowed.
   * Check the ProxyHeader enum for the list of possible values.
   * </pre>
   *
   * <code>optional string proxy_header = 160374142;</code>
   *
   * @return The bytes for proxyHeader.
   */
  com.google.protobuf.ByteString getProxyHeaderBytes();
}
