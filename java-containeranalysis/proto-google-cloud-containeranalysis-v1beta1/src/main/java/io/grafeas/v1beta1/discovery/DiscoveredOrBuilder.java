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
// source: google/devtools/containeranalysis/v1beta1/discovery/discovery.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.discovery;

public interface DiscoveredOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.discovery.Discovered)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether the resource is continuously analyzed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovered.ContinuousAnalysis continuous_analysis = 1;</code>
   *
   * @return The enum numeric value on the wire for continuousAnalysis.
   */
  int getContinuousAnalysisValue();
  /**
   *
   *
   * <pre>
   * Whether the resource is continuously analyzed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovered.ContinuousAnalysis continuous_analysis = 1;</code>
   *
   * @return The continuousAnalysis.
   */
  io.grafeas.v1beta1.discovery.Discovered.ContinuousAnalysis getContinuousAnalysis();

  /**
   *
   *
   * <pre>
   * The last time continuous analysis was done for this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_analysis_time = 2;</code>
   *
   * @return Whether the lastAnalysisTime field is set.
   */
  boolean hasLastAnalysisTime();
  /**
   *
   *
   * <pre>
   * The last time continuous analysis was done for this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_analysis_time = 2;</code>
   *
   * @return The lastAnalysisTime.
   */
  com.google.protobuf.Timestamp getLastAnalysisTime();
  /**
   *
   *
   * <pre>
   * The last time continuous analysis was done for this resource.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp last_analysis_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastAnalysisTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The status of discovery for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovered.AnalysisStatus analysis_status = 3;</code>
   *
   * @return The enum numeric value on the wire for analysisStatus.
   */
  int getAnalysisStatusValue();
  /**
   *
   *
   * <pre>
   * The status of discovery for the resource.
   * </pre>
   *
   * <code>.grafeas.v1beta1.discovery.Discovered.AnalysisStatus analysis_status = 3;</code>
   *
   * @return The analysisStatus.
   */
  io.grafeas.v1beta1.discovery.Discovered.AnalysisStatus getAnalysisStatus();

  /**
   *
   *
   * <pre>
   * When an error is encountered this will contain a LocalizedMessage under
   * details to show to the user. The LocalizedMessage is output only and
   * populated by the API.
   * </pre>
   *
   * <code>.google.rpc.Status analysis_status_error = 4;</code>
   *
   * @return Whether the analysisStatusError field is set.
   */
  boolean hasAnalysisStatusError();
  /**
   *
   *
   * <pre>
   * When an error is encountered this will contain a LocalizedMessage under
   * details to show to the user. The LocalizedMessage is output only and
   * populated by the API.
   * </pre>
   *
   * <code>.google.rpc.Status analysis_status_error = 4;</code>
   *
   * @return The analysisStatusError.
   */
  com.google.rpc.Status getAnalysisStatusError();
  /**
   *
   *
   * <pre>
   * When an error is encountered this will contain a LocalizedMessage under
   * details to show to the user. The LocalizedMessage is output only and
   * populated by the API.
   * </pre>
   *
   * <code>.google.rpc.Status analysis_status_error = 4;</code>
   */
  com.google.rpc.StatusOrBuilder getAnalysisStatusErrorOrBuilder();
}
