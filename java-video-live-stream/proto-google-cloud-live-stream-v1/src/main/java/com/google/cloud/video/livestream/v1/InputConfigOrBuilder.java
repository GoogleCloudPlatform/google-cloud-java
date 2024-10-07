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
// source: google/cloud/video/livestream/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.video.livestream.v1;

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.livestream.v1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input switch mode. Default mode is `FAILOVER_PREFER_PRIMARY`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.InputConfig.InputSwitchMode input_switch_mode = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for inputSwitchMode.
   */
  int getInputSwitchModeValue();
  /**
   *
   *
   * <pre>
   * Input switch mode. Default mode is `FAILOVER_PREFER_PRIMARY`.
   * </pre>
   *
   * <code>.google.cloud.video.livestream.v1.InputConfig.InputSwitchMode input_switch_mode = 1;
   * </code>
   *
   * @return The inputSwitchMode.
   */
  com.google.cloud.video.livestream.v1.InputConfig.InputSwitchMode getInputSwitchMode();
}
