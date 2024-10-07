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
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.datacatalog.v1beta1;

public interface ViewSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.ViewSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The query that defines the table view.
   * </pre>
   *
   * <code>string view_query = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The viewQuery.
   */
  java.lang.String getViewQuery();
  /**
   *
   *
   * <pre>
   * Output only. The query that defines the table view.
   * </pre>
   *
   * <code>string view_query = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for viewQuery.
   */
  com.google.protobuf.ByteString getViewQueryBytes();
}
