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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface SslPolicyReferenceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SslPolicyReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy associated with the target proxy resource.
   * </pre>
   *
   * <code>optional string ssl_policy = 295190213;</code>
   *
   * @return Whether the sslPolicy field is set.
   */
  boolean hasSslPolicy();
  /**
   *
   *
   * <pre>
   * URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy associated with the target proxy resource.
   * </pre>
   *
   * <code>optional string ssl_policy = 295190213;</code>
   *
   * @return The sslPolicy.
   */
  java.lang.String getSslPolicy();
  /**
   *
   *
   * <pre>
   * URL of the SSL policy resource. Set this to empty string to clear any existing SSL policy associated with the target proxy resource.
   * </pre>
   *
   * <code>optional string ssl_policy = 295190213;</code>
   *
   * @return The bytes for sslPolicy.
   */
  com.google.protobuf.ByteString getSslPolicyBytes();
}
