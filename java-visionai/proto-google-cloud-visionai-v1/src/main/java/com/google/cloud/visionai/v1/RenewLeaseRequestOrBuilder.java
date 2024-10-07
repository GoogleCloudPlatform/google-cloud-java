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
// source: google/cloud/visionai/v1/streaming_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.visionai.v1;

public interface RenewLeaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.RenewLeaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Lease id.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Lease id.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Series name.
   * </pre>
   *
   * <code>string series = 2;</code>
   *
   * @return The series.
   */
  java.lang.String getSeries();
  /**
   *
   *
   * <pre>
   * Series name.
   * </pre>
   *
   * <code>string series = 2;</code>
   *
   * @return The bytes for series.
   */
  com.google.protobuf.ByteString getSeriesBytes();

  /**
   *
   *
   * <pre>
   * Lease owner.
   * </pre>
   *
   * <code>string owner = 3;</code>
   *
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   *
   *
   * <pre>
   * Lease owner.
   * </pre>
   *
   * <code>string owner = 3;</code>
   *
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString getOwnerBytes();

  /**
   *
   *
   * <pre>
   * Lease term.
   * </pre>
   *
   * <code>.google.protobuf.Duration term = 4;</code>
   *
   * @return Whether the term field is set.
   */
  boolean hasTerm();
  /**
   *
   *
   * <pre>
   * Lease term.
   * </pre>
   *
   * <code>.google.protobuf.Duration term = 4;</code>
   *
   * @return The term.
   */
  com.google.protobuf.Duration getTerm();
  /**
   *
   *
   * <pre>
   * Lease term.
   * </pre>
   *
   * <code>.google.protobuf.Duration term = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getTermOrBuilder();
}
