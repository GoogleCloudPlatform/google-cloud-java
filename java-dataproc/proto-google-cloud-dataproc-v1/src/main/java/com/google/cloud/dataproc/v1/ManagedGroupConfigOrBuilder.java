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
// source: google/cloud/dataproc/v1/clusters.proto

package com.google.cloud.dataproc.v1;

public interface ManagedGroupConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ManagedGroupConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Template used for the Managed
   * Instance Group.
   * </pre>
   *
   * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The instanceTemplateName.
   */
  java.lang.String getInstanceTemplateName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Template used for the Managed
   * Instance Group.
   * </pre>
   *
   * <code>string instance_template_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for instanceTemplateName.
   */
  com.google.protobuf.ByteString getInstanceTemplateNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Group Manager for this group.
   * </pre>
   *
   * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The instanceGroupManagerName.
   */
  java.lang.String getInstanceGroupManagerName();
  /**
   *
   *
   * <pre>
   * Output only. The name of the Instance Group Manager for this group.
   * </pre>
   *
   * <code>string instance_group_manager_name = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for instanceGroupManagerName.
   */
  com.google.protobuf.ByteString getInstanceGroupManagerNameBytes();
}
