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
// source: google/cloud/aiplatform/v1beta1/training_pipeline.proto

package com.google.cloud.aiplatform.v1beta1;

public interface PredefinedSplitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.PredefinedSplit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The value of the key (either the label's value or value in the column)
   * must be one of {`training`, `validation`, `test`}, and it defines to which
   * set the given piece of data is assigned. If for a piece of data the key
   * is not present or has an invalid value, that piece is ignored by the
   * pipeline.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  java.lang.String getKey();
  /**
   *
   *
   * <pre>
   * Required. The key is a name of one of the Dataset's data columns.
   * The value of the key (either the label's value or value in the column)
   * must be one of {`training`, `validation`, `test`}, and it defines to which
   * set the given piece of data is assigned. If for a piece of data the key
   * is not present or has an invalid value, that piece is ignored by the
   * pipeline.
   * </pre>
   *
   * <code>string key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString getKeyBytes();
}
