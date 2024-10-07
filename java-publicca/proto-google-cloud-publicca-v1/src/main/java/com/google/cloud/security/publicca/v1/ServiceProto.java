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
// source: google/cloud/security/publicca/v1/service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.security.publicca.v1;

public final class ServiceProto {
  private ServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_security_publicca_v1_CreateExternalAccountKeyRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_security_publicca_v1_CreateExternalAccountKeyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/security/publicca/v1/serv"
          + "ice.proto\022!google.cloud.security.publicc"
          + "a.v1\032\034google/api/annotations.proto\032\027goog"
          + "le/api/client.proto\032\037google/api/field_be"
          + "havior.proto\032\031google/api/resource.proto\032"
          + "1google/cloud/security/publicca/v1/resou"
          + "rces.proto\"\277\001\n\037CreateExternalAccountKeyR"
          + "equest\022B\n\006parent\030\001 \001(\tB2\340A\002\372A,\022*publicca"
          + ".googleapis.com/ExternalAccountKey\022X\n\024ex"
          + "ternal_account_key\030\002 \001(\01325.google.cloud."
          + "security.publicca.v1.ExternalAccountKeyB"
          + "\003\340A\0022\375\002\n!PublicCertificateAuthorityServi"
          + "ce\022\212\002\n\030CreateExternalAccountKey\022B.google"
          + ".cloud.security.publicca.v1.CreateExtern"
          + "alAccountKeyRequest\0325.google.cloud.secur"
          + "ity.publicca.v1.ExternalAccountKey\"s\332A\033p"
          + "arent,external_account_key\202\323\344\223\002O\"7/v1/{p"
          + "arent=projects/*/locations/*}/externalAc"
          + "countKeys:\024external_account_key\032K\312A\027publ"
          + "icca.googleapis.com\322A.https://www.google"
          + "apis.com/auth/cloud-platformB\355\001\n%com.goo"
          + "gle.cloud.security.publicca.v1B\014ServiceP"
          + "rotoP\001ZAcloud.google.com/go/security/pub"
          + "licca/apiv1/publiccapb;publiccapb\370\001\001\252\002!G"
          + "oogle.Cloud.Security.PublicCA.V1\312\002!Googl"
          + "e\\Cloud\\Security\\PublicCA\\V1\352\002%Google::C"
          + "loud::Security::PublicCA::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.security.publicca.v1.ResourcesProto.getDescriptor(),
            });
    internal_static_google_cloud_security_publicca_v1_CreateExternalAccountKeyRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_security_publicca_v1_CreateExternalAccountKeyRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_security_publicca_v1_CreateExternalAccountKeyRequest_descriptor,
            new java.lang.String[] {
              "Parent", "ExternalAccountKey",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.security.publicca.v1.ResourcesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
