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
// source: google/cloud/retail/v2/purge_config.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.retail.v2;

public interface PurgeProductsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.PurgeProductsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The total count of products purged as a result of the operation.
   * </pre>
   *
   * <code>int64 purge_count = 1;</code>
   *
   * @return The purgeCount.
   */
  long getPurgeCount();

  /**
   *
   *
   * <pre>
   * A sample of the product names that will be deleted.
   * Only populated if `force` is set to false. A max of 100 names will be
   * returned and the names are chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the purgeSample.
   */
  java.util.List<java.lang.String> getPurgeSampleList();
  /**
   *
   *
   * <pre>
   * A sample of the product names that will be deleted.
   * Only populated if `force` is set to false. A max of 100 names will be
   * returned and the names are chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of purgeSample.
   */
  int getPurgeSampleCount();
  /**
   *
   *
   * <pre>
   * A sample of the product names that will be deleted.
   * Only populated if `force` is set to false. A max of 100 names will be
   * returned and the names are chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The purgeSample at the given index.
   */
  java.lang.String getPurgeSample(int index);
  /**
   *
   *
   * <pre>
   * A sample of the product names that will be deleted.
   * Only populated if `force` is set to false. A max of 100 names will be
   * returned and the names are chosen at random.
   * </pre>
   *
   * <code>repeated string purge_sample = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the purgeSample at the given index.
   */
  com.google.protobuf.ByteString getPurgeSampleBytes(int index);
}
