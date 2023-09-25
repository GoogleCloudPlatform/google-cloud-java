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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

package com.google.cloud.clouddms.v1;

public interface EntityMappingLogEntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.EntityMappingLogEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Which rule caused this log entry.
   * </pre>
   *
   * <code>string rule_id = 1;</code>
   *
   * @return The ruleId.
   */
  java.lang.String getRuleId();
  /**
   *
   *
   * <pre>
   * Which rule caused this log entry.
   * </pre>
   *
   * <code>string rule_id = 1;</code>
   *
   * @return The bytes for ruleId.
   */
  com.google.protobuf.ByteString getRuleIdBytes();

  /**
   *
   *
   * <pre>
   * Rule revision ID.
   * </pre>
   *
   * <code>string rule_revision_id = 2;</code>
   *
   * @return The ruleRevisionId.
   */
  java.lang.String getRuleRevisionId();
  /**
   *
   *
   * <pre>
   * Rule revision ID.
   * </pre>
   *
   * <code>string rule_revision_id = 2;</code>
   *
   * @return The bytes for ruleRevisionId.
   */
  com.google.protobuf.ByteString getRuleRevisionIdBytes();

  /**
   *
   *
   * <pre>
   * Comment.
   * </pre>
   *
   * <code>string mapping_comment = 3;</code>
   *
   * @return The mappingComment.
   */
  java.lang.String getMappingComment();
  /**
   *
   *
   * <pre>
   * Comment.
   * </pre>
   *
   * <code>string mapping_comment = 3;</code>
   *
   * @return The bytes for mappingComment.
   */
  com.google.protobuf.ByteString getMappingCommentBytes();
}
