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
// source: google/cloud/domains/v1/domains.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.domains.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.domains.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Server-defined resource path for the target of the operation.
   * </pre>
   *
   * <code>string target = 3;</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   *
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   *
   *
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   *
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString getVerbBytes();

  /**
   *
   *
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   *
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   *
   *
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   *
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString getStatusDetailBytes();

  /**
   *
   *
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 6;</code>
   *
   * @return The apiVersion.
   */
  java.lang.String getApiVersion();
  /**
   *
   *
   * <pre>
   * API version used to start the operation.
   * </pre>
   *
   * <code>string api_version = 6;</code>
   *
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString getApiVersionBytes();
}
