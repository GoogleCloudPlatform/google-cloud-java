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
// source: grafeas/v1/provenance.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1;

public interface HashOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.Hash)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The type of hash that was performed, e.g. "SHA-256".
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Required. The type of hash that was performed, e.g. "SHA-256".
   * </pre>
   *
   * <code>string type = 1;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The hash value.
   * </pre>
   *
   * <code>bytes value = 2;</code>
   *
   * @return The value.
   */
  com.google.protobuf.ByteString getValue();
}
