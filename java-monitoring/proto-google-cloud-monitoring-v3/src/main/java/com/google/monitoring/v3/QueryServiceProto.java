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
// source: google/monitoring/v3/query_service.proto

package com.google.monitoring.v3;

public final class QueryServiceProto {
  private QueryServiceProto() {}

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
      "\n(google/monitoring/v3/query_service.pro"
          + "to\022\024google.monitoring.v3\032\034google/api/ann"
          + "otations.proto\032)google/monitoring/v3/met"
          + "ric_service.proto\032\027google/api/client.pro"
          + "to2\336\002\n\014QueryService\022\241\001\n\017QueryTimeSeries\022"
          + ",.google.monitoring.v3.QueryTimeSeriesRe"
          + "quest\032-.google.monitoring.v3.QueryTimeSe"
          + "riesResponse\"1\202\323\344\223\002+\"&/v3/{name=projects"
          + "/*}/timeSeries:query:\001*\032\251\001\312A\031monitoring."
          + "googleapis.com\322A\211\001https://www.googleapis"
          + ".com/auth/cloud-platform,https://www.goo"
          + "gleapis.com/auth/monitoring,https://www."
          + "googleapis.com/auth/monitoring.readB\311\001\n\030"
          + "com.google.monitoring.v3B\021QueryServicePr"
          + "otoP\001Z>google.golang.org/genproto/google"
          + "apis/monitoring/v3;monitoring\252\002\032Google.C"
          + "loud.Monitoring.V3\312\002\032Google\\Cloud\\Monito"
          + "ring\\V3\352\002\035Google::Cloud::Monitoring::V3b"
          + "\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.monitoring.v3.MetricServiceProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.monitoring.v3.MetricServiceProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
