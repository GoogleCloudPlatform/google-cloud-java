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
// source: google/cloud/run/v2/k8s.min.proto

package com.google.cloud.run.v2;

public interface TCPSocketActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.TCPSocketAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Port number to access on the container. Must be in the range 1 to 65535.
   * If not specified, defaults to the exposed port of the container, which is
   * the value of container.ports[0].containerPort.
   * </pre>
   *
   * <code>int32 port = 1;</code>
   *
   * @return The port.
   */
  int getPort();
}
