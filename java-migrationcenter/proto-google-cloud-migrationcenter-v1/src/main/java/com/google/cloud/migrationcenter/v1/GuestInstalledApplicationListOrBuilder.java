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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.migrationcenter.v1;

public interface GuestInstalledApplicationListOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.migrationcenter.v1.GuestInstalledApplicationList)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Application entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.GuestInstalledApplication entries = 1;</code>
   */
  java.util.List<com.google.cloud.migrationcenter.v1.GuestInstalledApplication> getEntriesList();
  /**
   *
   *
   * <pre>
   * Application entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.GuestInstalledApplication entries = 1;</code>
   */
  com.google.cloud.migrationcenter.v1.GuestInstalledApplication getEntries(int index);
  /**
   *
   *
   * <pre>
   * Application entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.GuestInstalledApplication entries = 1;</code>
   */
  int getEntriesCount();
  /**
   *
   *
   * <pre>
   * Application entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.GuestInstalledApplication entries = 1;</code>
   */
  java.util.List<? extends com.google.cloud.migrationcenter.v1.GuestInstalledApplicationOrBuilder>
      getEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Application entries.
   * </pre>
   *
   * <code>repeated .google.cloud.migrationcenter.v1.GuestInstalledApplication entries = 1;</code>
   */
  com.google.cloud.migrationcenter.v1.GuestInstalledApplicationOrBuilder getEntriesOrBuilder(
      int index);
}
