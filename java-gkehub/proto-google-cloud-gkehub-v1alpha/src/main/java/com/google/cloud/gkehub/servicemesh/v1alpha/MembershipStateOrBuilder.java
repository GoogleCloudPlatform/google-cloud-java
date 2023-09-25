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
// source: google/cloud/gkehub/v1alpha/servicemesh/servicemesh.proto

package com.google.cloud.gkehub.servicemesh.v1alpha;

public interface MembershipStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.servicemesh.v1alpha.MembershipState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage>
      getAnalysisMessagesList();
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage getAnalysisMessages(int index);
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getAnalysisMessagesCount();
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder>
      getAnalysisMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Results of running Service Mesh analyzers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessage analysis_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageOrBuilder getAnalysisMessagesOrBuilder(
      int index);
}
