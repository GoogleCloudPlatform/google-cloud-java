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
// source: google/cloud/vision/v1p4beta1/text_annotation.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1p4beta1;

public interface PageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.Page)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty property = 1;</code>
   *
   * @return Whether the property field is set.
   */
  boolean hasProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty property = 1;</code>
   *
   * @return The property.
   */
  com.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty getProperty();
  /**
   *
   *
   * <pre>
   * Additional information detected on the page.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.TextAnnotation.TextProperty property = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.TextAnnotation.TextPropertyOrBuilder getPropertyOrBuilder();

  /**
   *
   *
   * <pre>
   * Page width. For PDFs the unit is points. For images (including
   * TIFFs) the unit is pixels.
   * </pre>
   *
   * <code>int32 width = 2;</code>
   *
   * @return The width.
   */
  int getWidth();

  /**
   *
   *
   * <pre>
   * Page height. For PDFs the unit is points. For images (including
   * TIFFs) the unit is pixels.
   * </pre>
   *
   * <code>int32 height = 3;</code>
   *
   * @return The height.
   */
  int getHeight();

  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  java.util.List<com.google.cloud.vision.v1p4beta1.Block> getBlocksList();
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  com.google.cloud.vision.v1p4beta1.Block getBlocks(int index);
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  int getBlocksCount();
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1p4beta1.BlockOrBuilder>
      getBlocksOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of blocks of text, images etc on this page.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1p4beta1.Block blocks = 4;</code>
   */
  com.google.cloud.vision.v1p4beta1.BlockOrBuilder getBlocksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Confidence of the OCR results on the page. Range [0, 1].
   * </pre>
   *
   * <code>float confidence = 5;</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}
