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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

public interface TableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.Table)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Headers of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.FieldId> getHeadersList();
  /**
   *
   *
   * <pre>
   * Headers of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code>
   */
  com.google.privacy.dlp.v2.FieldId getHeaders(int index);
  /**
   *
   *
   * <pre>
   * Headers of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * Headers of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.FieldIdOrBuilder> getHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Headers of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.FieldId headers = 1;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getHeadersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Rows of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.Table.Row> getRowsList();
  /**
   *
   *
   * <pre>
   * Rows of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code>
   */
  com.google.privacy.dlp.v2.Table.Row getRows(int index);
  /**
   *
   *
   * <pre>
   * Rows of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code>
   */
  int getRowsCount();
  /**
   *
   *
   * <pre>
   * Rows of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.Table.RowOrBuilder> getRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Rows of the table.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.Table.Row rows = 2;</code>
   */
  com.google.privacy.dlp.v2.Table.RowOrBuilder getRowsOrBuilder(int index);
}
