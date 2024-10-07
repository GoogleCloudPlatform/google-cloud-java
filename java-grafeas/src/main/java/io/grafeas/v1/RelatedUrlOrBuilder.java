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

public interface RelatedUrlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.RelatedUrl)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specific URL associated with the resource.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * Specific URL associated with the resource.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * Label to describe usage of the URL.
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   *
   *
   * <pre>
   * Label to describe usage of the URL.
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();
}
