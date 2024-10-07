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
// source: google/cloud/aiplatform/v1beta1/feature_online_store_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.aiplatform.v1beta1;

public interface StreamingFetchFeatureValuesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.StreamingFetchFeatureValuesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>
   * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The featureView.
   */
  java.lang.String getFeatureView();
  /**
   *
   *
   * <pre>
   * Required. FeatureView resource format
   * `projects/{project}/locations/{location}/featureOnlineStores/{featureOnlineStore}/featureViews/{featureView}`
   * </pre>
   *
   * <code>
   * string feature_view = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for featureView.
   */
  com.google.protobuf.ByteString getFeatureViewBytes();

  /** <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys = 2;</code> */
  java.util.List<com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey> getDataKeysList();
  /** <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys = 2;</code> */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKey getDataKeys(int index);
  /** <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys = 2;</code> */
  int getDataKeysCount();
  /** <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys = 2;</code> */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.FeatureViewDataKeyOrBuilder>
      getDataKeysOrBuilderList();
  /** <code>repeated .google.cloud.aiplatform.v1beta1.FeatureViewDataKey data_keys = 2;</code> */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataKeyOrBuilder getDataKeysOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Specify response data format. If not set, KeyValue format will be used.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataFormat data_format = 3;</code>
   *
   * @return The enum numeric value on the wire for dataFormat.
   */
  int getDataFormatValue();
  /**
   *
   *
   * <pre>
   * Specify response data format. If not set, KeyValue format will be used.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.FeatureViewDataFormat data_format = 3;</code>
   *
   * @return The dataFormat.
   */
  com.google.cloud.aiplatform.v1beta1.FeatureViewDataFormat getDataFormat();
}
