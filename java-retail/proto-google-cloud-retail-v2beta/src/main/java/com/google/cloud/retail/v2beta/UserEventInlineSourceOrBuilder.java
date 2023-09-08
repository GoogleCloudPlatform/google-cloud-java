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
// source: google/cloud/retail/v2beta/import_config.proto

package com.google.cloud.retail.v2beta;

public interface UserEventInlineSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.UserEventInlineSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.UserEvent user_events = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.retail.v2beta.UserEvent> getUserEventsList();
  /**
   *
   *
   * <pre>
   * Required. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.UserEvent user_events = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.UserEvent getUserEvents(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.UserEvent user_events = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getUserEventsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.UserEvent user_events = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.retail.v2beta.UserEventOrBuilder>
      getUserEventsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. A list of user events to import. Recommended max of 10k items.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2beta.UserEvent user_events = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.retail.v2beta.UserEventOrBuilder getUserEventsOrBuilder(int index);
}
