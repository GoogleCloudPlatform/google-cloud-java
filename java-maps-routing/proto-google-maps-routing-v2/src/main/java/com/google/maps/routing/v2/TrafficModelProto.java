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
// source: google/maps/routing/v2/traffic_model.proto

package com.google.maps.routing.v2;

public final class TrafficModelProto {
  private TrafficModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/maps/routing/v2/traffic_model.p"
          + "roto\022\026google.maps.routing.v2*^\n\014TrafficM"
          + "odel\022\035\n\031TRAFFIC_MODEL_UNSPECIFIED\020\000\022\016\n\nB"
          + "EST_GUESS\020\001\022\017\n\013PESSIMISTIC\020\002\022\016\n\nOPTIMIST"
          + "IC\020\003B\306\001\n\032com.google.maps.routing.v2B\021Tra"
          + "fficModelProtoP\001Z:cloud.google.com/go/ma"
          + "ps/routing/apiv2/routingpb;routingpb\370\001\001\242"
          + "\002\005GMRV2\252\002\026Google.Maps.Routing.V2\312\002\026Googl"
          + "e\\Maps\\Routing\\V2\352\002\031Google::Maps::Routin"
          + "g::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
