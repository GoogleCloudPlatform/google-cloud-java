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
// source: google/cloud/tasks/v2/queue.proto

package com.google.cloud.tasks.v2;

public interface StackdriverLoggingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2.StackdriverLoggingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the fraction of operations to write to
   * [Stackdriver Logging](https://cloud.google.com/logging/docs/).
   * This field may contain any value between 0.0 and 1.0, inclusive.
   * 0.0 is the default and means that no operations are logged.
   * </pre>
   *
   * <code>double sampling_ratio = 1;</code>
   *
   * @return The samplingRatio.
   */
  double getSamplingRatio();
}
