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
// source: google/cloud/gkebackup/v1/common.proto

package com.google.cloud.gkebackup.v1;

public interface NamespacedNamesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.NamespacedNames)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  java.util.List<com.google.cloud.gkebackup.v1.NamespacedName> getNamespacedNamesList();
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  com.google.cloud.gkebackup.v1.NamespacedName getNamespacedNames(int index);
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  int getNamespacedNamesCount();
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder>
      getNamespacedNamesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of namespaced Kubernetes resources.
   * </pre>
   *
   * <code>repeated .google.cloud.gkebackup.v1.NamespacedName namespaced_names = 1;</code>
   */
  com.google.cloud.gkebackup.v1.NamespacedNameOrBuilder getNamespacedNamesOrBuilder(int index);
}
