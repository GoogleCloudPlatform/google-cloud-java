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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.5
package com.google.container.v1beta1;

public interface K8sBetaAPIConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.K8sBetaAPIConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * api name, e.g. storage.k8s.io/v1beta1/csistoragecapacities.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @return A list containing the enabledApis.
   */
  java.util.List<java.lang.String> getEnabledApisList();
  /**
   *
   *
   * <pre>
   * api name, e.g. storage.k8s.io/v1beta1/csistoragecapacities.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @return The count of enabledApis.
   */
  int getEnabledApisCount();
  /**
   *
   *
   * <pre>
   * api name, e.g. storage.k8s.io/v1beta1/csistoragecapacities.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The enabledApis at the given index.
   */
  java.lang.String getEnabledApis(int index);
  /**
   *
   *
   * <pre>
   * api name, e.g. storage.k8s.io/v1beta1/csistoragecapacities.
   * </pre>
   *
   * <code>repeated string enabled_apis = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the enabledApis at the given index.
   */
  com.google.protobuf.ByteString getEnabledApisBytes(int index);
}
