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
// source: google/cloud/cloudcontrolspartner/v1beta/monitoring.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.cloudcontrolspartner.v1beta;

public final class MonitoringProto {
  private MonitoringProto() {}

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
      "\n9google/cloud/cloudcontrolspartner/v1be"
          + "ta/monitoring.proto\022(google.cloud.cloudc"
          + "ontrolspartner.v1beta\032\034google/api/annota"
          + "tions.proto\032\027google/api/client.proto\0329go"
          + "ogle/cloud/cloudcontrolspartner/v1beta/v"
          + "iolations.proto2\326\004\n\036CloudControlsPartner"
          + "Monitoring\022\365\001\n\016ListViolations\022?.google.c"
          + "loud.cloudcontrolspartner.v1beta.ListVio"
          + "lationsRequest\032@.google.cloud.cloudcontr"
          + "olspartner.v1beta.ListViolationsResponse"
          + "\"`\332A\006parent\202\323\344\223\002Q\022O/v1beta/{parent=organ"
          + "izations/*/locations/*/customers/*/workl"
          + "oads/*}/violations\022\342\001\n\014GetViolation\022=.go"
          + "ogle.cloud.cloudcontrolspartner.v1beta.G"
          + "etViolationRequest\0323.google.cloud.cloudc"
          + "ontrolspartner.v1beta.Violation\"^\332A\004name"
          + "\202\323\344\223\002Q\022O/v1beta/{name=organizations/*/lo"
          + "cations/*/customers/*/workloads/*/violat"
          + "ions/*}\032W\312A#cloudcontrolspartner.googlea"
          + "pis.com\322A.https://www.googleapis.com/aut"
          + "h/cloud-platformB\247\002\n,com.google.cloud.cl"
          + "oudcontrolspartner.v1betaB\017MonitoringPro"
          + "toP\001Z`cloud.google.com/go/cloudcontrolsp"
          + "artner/apiv1beta/cloudcontrolspartnerpb;"
          + "cloudcontrolspartnerpb\252\002(Google.Cloud.Cl"
          + "oudControlsPartner.V1Beta\312\002(Google\\Cloud"
          + "\\CloudControlsPartner\\V1beta\352\002+Google::C"
          + "loud::CloudControlsPartner::V1betab\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.ViolationsProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.ViolationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
