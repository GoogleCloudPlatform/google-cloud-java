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
// source: google/cloud/vision/v1p4beta1/product_search_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.vision.v1p4beta1;

public interface ImportProductSetsInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1p4beta1.ImportProductSetsInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImportProductSetsGcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImportProductSetsGcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.vision.v1p4beta1.ImportProductSetsGcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for a csv file which preserves a list
   * of ImportProductSetRequests in each line.
   * </pre>
   *
   * <code>.google.cloud.vision.v1p4beta1.ImportProductSetsGcsSource gcs_source = 1;</code>
   */
  com.google.cloud.vision.v1p4beta1.ImportProductSetsGcsSourceOrBuilder getGcsSourceOrBuilder();

  com.google.cloud.vision.v1p4beta1.ImportProductSetsInputConfig.SourceCase getSourceCase();
}
