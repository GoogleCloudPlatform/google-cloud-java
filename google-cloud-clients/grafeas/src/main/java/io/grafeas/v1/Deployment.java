/*
 * Copyright 2019 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/deployment.proto

package io.grafeas.v1;

public final class Deployment {
  private Deployment() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_DeploymentNote_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_DeploymentNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_grafeas_v1_DeploymentOccurrence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1_DeploymentOccurrence_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\033grafeas/v1/deployment.proto\022\ngrafeas.v"
          + "1\032\037google/protobuf/timestamp.proto\"&\n\016De"
          + "ploymentNote\022\024\n\014resource_uri\030\001 \003(\t\"\307\002\n\024D"
          + "eploymentOccurrence\022\022\n\nuser_email\030\001 \001(\t\022"
          + "/\n\013deploy_time\030\002 \001(\0132\032.google.protobuf.T"
          + "imestamp\0221\n\rundeploy_time\030\003 \001(\0132\032.google"
          + ".protobuf.Timestamp\022\016\n\006config\030\004 \001(\t\022\017\n\007a"
          + "ddress\030\005 \001(\t\022\024\n\014resource_uri\030\006 \003(\t\022;\n\010pl"
          + "atform\030\007 \001(\0162).grafeas.v1.DeploymentOccu"
          + "rrence.Platform\"C\n\010Platform\022\030\n\024PLATFORM_"
          + "UNSPECIFIED\020\000\022\007\n\003GKE\020\001\022\010\n\004FLEX\020\002\022\n\n\006CUST"
          + "OM\020\003BQ\n\rio.grafeas.v1P\001Z8google.golang.o"
          + "rg/genproto/googleapis/grafeas/v1;grafea"
          + "s\242\002\003GRAb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        },
        assigner);
    internal_static_grafeas_v1_DeploymentNote_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1_DeploymentNote_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_DeploymentNote_descriptor,
            new java.lang.String[] {
              "ResourceUri",
            });
    internal_static_grafeas_v1_DeploymentOccurrence_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1_DeploymentOccurrence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_grafeas_v1_DeploymentOccurrence_descriptor,
            new java.lang.String[] {
              "UserEmail",
              "DeployTime",
              "UndeployTime",
              "Config",
              "Address",
              "ResourceUri",
              "Platform",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
