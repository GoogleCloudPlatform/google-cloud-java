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
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public interface SecurityProjectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.SecurityProjection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   *
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   *
   *
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   *
   * @return The details.
   */
  com.google.protobuf.Struct getDetails();
  /**
   *
   *
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getDetailsOrBuilder();
}
