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
// source: google/cloud/discoveryengine/v1alpha/grounded_generation_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.discoveryengine.v1alpha;

public interface CheckGroundingSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.CheckGroundingSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The threshold (in [0,1]) used for determining whether a fact must be
   * cited for a claim in the answer candidate. Choosing a higher threshold
   * will lead to fewer but very strong citations, while choosing a lower
   * threshold may lead to more but somewhat weaker citations. If unset, the
   * threshold will default to 0.6.
   * </pre>
   *
   * <code>optional double citation_threshold = 1;</code>
   *
   * @return Whether the citationThreshold field is set.
   */
  boolean hasCitationThreshold();
  /**
   *
   *
   * <pre>
   * The threshold (in [0,1]) used for determining whether a fact must be
   * cited for a claim in the answer candidate. Choosing a higher threshold
   * will lead to fewer but very strong citations, while choosing a lower
   * threshold may lead to more but somewhat weaker citations. If unset, the
   * threshold will default to 0.6.
   * </pre>
   *
   * <code>optional double citation_threshold = 1;</code>
   *
   * @return The citationThreshold.
   */
  double getCitationThreshold();
}
