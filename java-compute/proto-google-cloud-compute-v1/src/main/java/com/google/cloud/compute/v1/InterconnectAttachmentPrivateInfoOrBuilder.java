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

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface InterconnectAttachmentPrivateInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InterconnectAttachmentPrivateInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
   * </pre>
   *
   * <code>optional uint32 tag8021q = 271820992;</code>
   *
   * @return Whether the tag8021q field is set.
   */
  boolean hasTag8021Q();
  /**
   *
   *
   * <pre>
   * [Output Only] 802.1q encapsulation tag to be used for traffic between Google and the customer, going to and from this network and region.
   * </pre>
   *
   * <code>optional uint32 tag8021q = 271820992;</code>
   *
   * @return The tag8021q.
   */
  int getTag8021Q();
}
