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
// source: google/apps/script/type/addon_widget_set.proto

// Protobuf Java Version: 3.25.5
package com.google.apps.script.type;

public interface AddOnWidgetSetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.script.type.AddOnWidgetSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of widgets used in an add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.AddOnWidgetSet.WidgetType used_widgets = 1;</code>
   *
   * @return A list containing the usedWidgets.
   */
  java.util.List<com.google.apps.script.type.AddOnWidgetSet.WidgetType> getUsedWidgetsList();
  /**
   *
   *
   * <pre>
   * The list of widgets used in an add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.AddOnWidgetSet.WidgetType used_widgets = 1;</code>
   *
   * @return The count of usedWidgets.
   */
  int getUsedWidgetsCount();
  /**
   *
   *
   * <pre>
   * The list of widgets used in an add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.AddOnWidgetSet.WidgetType used_widgets = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The usedWidgets at the given index.
   */
  com.google.apps.script.type.AddOnWidgetSet.WidgetType getUsedWidgets(int index);
  /**
   *
   *
   * <pre>
   * The list of widgets used in an add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.AddOnWidgetSet.WidgetType used_widgets = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for usedWidgets.
   */
  java.util.List<java.lang.Integer> getUsedWidgetsValueList();
  /**
   *
   *
   * <pre>
   * The list of widgets used in an add-on.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.AddOnWidgetSet.WidgetType used_widgets = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of usedWidgets at the given index.
   */
  int getUsedWidgetsValue(int index);
}
