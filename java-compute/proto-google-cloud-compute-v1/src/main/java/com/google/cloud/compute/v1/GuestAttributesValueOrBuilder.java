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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

public interface GuestAttributesValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.GuestAttributesValue)
    com.google.protobuf.MessageOrBuilder {

  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  java.util.List<com.google.cloud.compute.v1.GuestAttributesEntry> getItemsList();
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  com.google.cloud.compute.v1.GuestAttributesEntry getItems(int index);
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  int getItemsCount();
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  java.util.List<? extends com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder>
      getItemsOrBuilderList();
  /** <code>repeated .google.cloud.compute.v1.GuestAttributesEntry items = 100526016;</code> */
  com.google.cloud.compute.v1.GuestAttributesEntryOrBuilder getItemsOrBuilder(int index);
}
