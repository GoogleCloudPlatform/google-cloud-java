/*
 * Copyright 2020 Google LLC
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
// source: google/apps/script/type/extension_point.proto

package com.google.apps.script.type;

public interface MenuItemExtensionPointOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.script.type.MenuItemExtensionPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The endpoint to execute when this extension point is
   * activated.
   * </pre>
   *
   * <code>string run_function = 1;</code>
   *
   * @return The runFunction.
   */
  java.lang.String getRunFunction();
  /**
   *
   *
   * <pre>
   * Required. The endpoint to execute when this extension point is
   * activated.
   * </pre>
   *
   * <code>string run_function = 1;</code>
   *
   * @return The bytes for runFunction.
   */
  com.google.protobuf.ByteString getRunFunctionBytes();

  /**
   *
   *
   * <pre>
   * Required. User-visible text describing the action taken by activating this
   * extension point. For example, "Insert invoice".
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   *
   *
   * <pre>
   * Required. User-visible text describing the action taken by activating this
   * extension point. For example, "Insert invoice".
   * </pre>
   *
   * <code>string label = 2;</code>
   *
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString getLabelBytes();

  /**
   *
   *
   * <pre>
   * The URL for the logo image shown in the add-on toolbar.
   * If not set, defaults to the add-on's primary logo URL.
   * </pre>
   *
   * <code>string logo_url = 3;</code>
   *
   * @return The logoUrl.
   */
  java.lang.String getLogoUrl();
  /**
   *
   *
   * <pre>
   * The URL for the logo image shown in the add-on toolbar.
   * If not set, defaults to the add-on's primary logo URL.
   * </pre>
   *
   * <code>string logo_url = 3;</code>
   *
   * @return The bytes for logoUrl.
   */
  com.google.protobuf.ByteString getLogoUrlBytes();
}
