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

public interface DiscoveryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.discovery.Discovery)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. The kind of analysis that is handled by this
   * discovery.
   * </pre>
   *
   * <code>.grafeas.v1beta1.NoteKind analysis_kind = 1;</code>
   *
   * @return The enum numeric value on the wire for analysisKind.
   */
  int getAnalysisKindValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The kind of analysis that is handled by this
   * discovery.
   * </pre>
   *
   * <code>.grafeas.v1beta1.NoteKind analysis_kind = 1;</code>
   *
   * @return The analysisKind.
   */
  io.grafeas.v1beta1.common.NoteKind getAnalysisKind();
}
