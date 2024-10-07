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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycentermanagement.v1;

public interface EventThreatDetectionCustomModuleOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the ETD custom module.
   *
   * Its format is:
   *
   *   * `organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}`.
   *   * `folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}`.
   *   * `projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Identifier. The resource name of the ETD custom module.
   *
   * Its format is:
   *
   *   * `organizations/{organization}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}`.
   *   * `folders/{folder}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}`.
   *   * `projects/{project}/locations/{location}/eventThreatDetectionCustomModules/{event_threat_detection_custom_module}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Config for the module. For the resident module, its config value
   * is defined at this level. For the inherited module, its config value is
   * inherited from the ancestor module.
   * </pre>
   *
   * <code>.google.protobuf.Struct config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   *
   *
   * <pre>
   * Optional. Config for the module. For the resident module, its config value
   * is defined at this level. For the inherited module, its config value is
   * inherited from the ancestor module.
   * </pre>
   *
   * <code>.google.protobuf.Struct config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The config.
   */
  com.google.protobuf.Struct getConfig();
  /**
   *
   *
   * <pre>
   * Optional. Config for the module. For the resident module, its config value
   * is defined at this level. For the inherited module, its config value is
   * inherited from the ancestor module.
   * </pre>
   *
   * <code>.google.protobuf.Struct config = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.StructOrBuilder getConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The closest ancestor module that this module inherits the
   * enablement state from. If empty, indicates that the custom module was
   * created in the requesting parent organization, folder, or project. The
   * format is the same as the EventThreatDetectionCustomModule resource name.
   * </pre>
   *
   * <code>
   * string ancestor_module = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The ancestorModule.
   */
  java.lang.String getAncestorModule();
  /**
   *
   *
   * <pre>
   * Output only. The closest ancestor module that this module inherits the
   * enablement state from. If empty, indicates that the custom module was
   * created in the requesting parent organization, folder, or project. The
   * format is the same as the EventThreatDetectionCustomModule resource name.
   * </pre>
   *
   * <code>
   * string ancestor_module = 3 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for ancestorModule.
   */
  com.google.protobuf.ByteString getAncestorModuleBytes();

  /**
   *
   *
   * <pre>
   * Optional. The state of enablement for the module at the given level of the
   * hierarchy.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule.EnablementState enablement_state = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for enablementState.
   */
  int getEnablementStateValue();
  /**
   *
   *
   * <pre>
   * Optional. The state of enablement for the module at the given level of the
   * hierarchy.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule.EnablementState enablement_state = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enablementState.
   */
  com.google.cloud.securitycentermanagement.v1.EventThreatDetectionCustomModule.EnablementState
      getEnablementState();

  /**
   *
   *
   * <pre>
   * Optional. Type for the module. e.g. CONFIGURABLE_BAD_IP.
   * </pre>
   *
   * <code>string type = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Optional. Type for the module. e.g. CONFIGURABLE_BAD_IP.
   * </pre>
   *
   * <code>string type = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The human readable name to be displayed for the module.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. The human readable name to be displayed for the module.
   * </pre>
   *
   * <code>string display_name = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. The description for the module.
   * </pre>
   *
   * <code>string description = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. The description for the module.
   * </pre>
   *
   * <code>string description = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time the module was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the module was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time the module was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The editor the module was last updated by.
   * </pre>
   *
   * <code>string last_editor = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The lastEditor.
   */
  java.lang.String getLastEditor();
  /**
   *
   *
   * <pre>
   * Output only. The editor the module was last updated by.
   * </pre>
   *
   * <code>string last_editor = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for lastEditor.
   */
  com.google.protobuf.ByteString getLastEditorBytes();
}
