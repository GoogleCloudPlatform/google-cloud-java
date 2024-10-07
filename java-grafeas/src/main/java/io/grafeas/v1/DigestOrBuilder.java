/*
 * Copyright 2024 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/common.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

public interface DigestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Digest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * `SHA1`, `SHA512` etc.
   * </pre>
   *
   * <code>string algo = 1;</code>
   *
   * @return The algo.
   */
  java.lang.String getAlgo();
  /**
   *
   *
   * <pre>
   * `SHA1`, `SHA512` etc.
   * </pre>
   *
   * <code>string algo = 1;</code>
   *
   * @return The bytes for algo.
   */
  com.google.protobuf.ByteString getAlgoBytes();

  /**
   *
   *
   * <pre>
   * Value of the digest.
   * </pre>
   *
   * <code>bytes digest_bytes = 2;</code>
   *
   * @return The digestBytes.
   */
  com.google.protobuf.ByteString getDigestBytes();
}
