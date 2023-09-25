/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/documentai/v1beta3/geometry.proto

package com.google.cloud.documentai.v1beta3;

public interface BoundingPolyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.BoundingPoly)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Vertex vertices = 1;</code>
   */
  java.util.List<com.google.cloud.documentai.v1beta3.Vertex> getVerticesList();
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Vertex vertices = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.Vertex getVertices(int index);
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Vertex vertices = 1;</code>
   */
  int getVerticesCount();
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Vertex vertices = 1;</code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta3.VertexOrBuilder>
      getVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The bounding polygon vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.Vertex vertices = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.VertexOrBuilder getVerticesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.NormalizedVertex normalized_vertices = 2;
   * </code>
   */
  java.util.List<com.google.cloud.documentai.v1beta3.NormalizedVertex> getNormalizedVerticesList();
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.NormalizedVertex normalized_vertices = 2;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.NormalizedVertex getNormalizedVertices(int index);
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.NormalizedVertex normalized_vertices = 2;
   * </code>
   */
  int getNormalizedVerticesCount();
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.NormalizedVertex normalized_vertices = 2;
   * </code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta3.NormalizedVertexOrBuilder>
      getNormalizedVerticesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The bounding polygon normalized vertices.
   * </pre>
   *
   * <code>repeated .google.cloud.documentai.v1beta3.NormalizedVertex normalized_vertices = 2;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.NormalizedVertexOrBuilder getNormalizedVerticesOrBuilder(
      int index);
}
