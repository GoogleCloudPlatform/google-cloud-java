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
// source: google/cloud/retail/v2alpha/catalog_service.proto

package com.google.cloud.retail.v2alpha;

public interface GetDefaultBranchResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.GetDefaultBranchResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full resource name of the branch id currently set as default branch.
   * </pre>
   *
   * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The branch.
   */
  java.lang.String getBranch();
  /**
   *
   *
   * <pre>
   * Full resource name of the branch id currently set as default branch.
   * </pre>
   *
   * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for branch.
   */
  com.google.protobuf.ByteString getBranchBytes();

  /**
   *
   *
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   *
   * @return Whether the setTime field is set.
   */
  boolean hasSetTime();
  /**
   *
   *
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   *
   * @return The setTime.
   */
  com.google.protobuf.Timestamp getSetTime();
  /**
   *
   *
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSetTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * This corresponds to
   * [SetDefaultBranchRequest.note][google.cloud.retail.v2alpha.SetDefaultBranchRequest.note]
   * field, when this branch was set as default.
   * </pre>
   *
   * <code>string note = 3;</code>
   *
   * @return The note.
   */
  java.lang.String getNote();
  /**
   *
   *
   * <pre>
   * This corresponds to
   * [SetDefaultBranchRequest.note][google.cloud.retail.v2alpha.SetDefaultBranchRequest.note]
   * field, when this branch was set as default.
   * </pre>
   *
   * <code>string note = 3;</code>
   *
   * @return The bytes for note.
   */
  com.google.protobuf.ByteString getNoteBytes();
}
