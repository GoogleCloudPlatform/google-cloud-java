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
// source: google/cloud/cloudcontrolspartner/v1beta/customers.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.cloudcontrolspartner.v1beta;

public final class CustomersProto {
  private CustomersProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Customer_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_Customer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_GetCustomerRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_GetCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingStep_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/cloudcontrolspartner/v1be"
          + "ta/customers.proto\022(google.cloud.cloudco"
          + "ntrolspartner.v1beta\032\037google/api/field_b"
          + "ehavior.proto\032\031google/api/resource.proto"
          + "\032?google/cloud/cloudcontrolspartner/v1be"
          + "ta/completion_state.proto\032\037google/protob"
          + "uf/timestamp.proto\"\320\002\n\010Customer\022\021\n\004name\030"
          + "\001 \001(\tB\003\340A\010\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022i\n"
          + "\031customer_onboarding_state\030\003 \001(\0132A.googl"
          + "e.cloud.cloudcontrolspartner.v1beta.Cust"
          + "omerOnboardingStateB\003\340A\003\022\031\n\014is_onboarded"
          + "\030\004 \001(\010B\003\340A\003:\217\001\352A\213\001\n,cloudcontrolspartner"
          + ".googleapis.com/Customer\022Forganizations/"
          + "{organization}/locations/{location}/cust"
          + "omers/{customer}*\tcustomers2\010customer\"\257\001"
          + "\n\024ListCustomersRequest\022D\n\006parent\030\001 \001(\tB4"
          + "\340A\002\372A.\022,cloudcontrolspartner.googleapis."
          + "com/Customer\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_"
          + "token\030\003 \001(\t\022\023\n\006filter\030\004 \001(\tB\003\340A\001\022\025\n\010orde"
          + "r_by\030\005 \001(\tB\003\340A\001\"\214\001\n\025ListCustomersRespons"
          + "e\022E\n\tcustomers\030\001 \003(\01322.google.cloud.clou"
          + "dcontrolspartner.v1beta.Customer\022\027\n\017next"
          + "_page_token\030\002 \001(\t\022\023\n\013unreachable\030\003 \003(\t\"X"
          + "\n\022GetCustomerRequest\022B\n\004name\030\001 \001(\tB4\340A\002\372"
          + "A.\n,cloudcontrolspartner.googleapis.com/"
          + "Customer\"u\n\027CustomerOnboardingState\022Z\n\020o"
          + "nboarding_steps\030\001 \003(\0132@.google.cloud.clo"
          + "udcontrolspartner.v1beta.CustomerOnboard"
          + "ingStep\"\370\002\n\026CustomerOnboardingStep\022S\n\004st"
          + "ep\030\001 \001(\0162E.google.cloud.cloudcontrolspar"
          + "tner.v1beta.CustomerOnboardingStep.Step\022"
          + ".\n\nstart_time\030\002 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\0223\n\017completion_time\030\003 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022X\n\020completion_state"
          + "\030\004 \001(\01629.google.cloud.cloudcontrolspartn"
          + "er.v1beta.CompletionStateB\003\340A\003\"J\n\004Step\022\024"
          + "\n\020STEP_UNSPECIFIED\020\000\022\022\n\016KAJ_ENROLLMENT\020\001"
          + "\022\030\n\024CUSTOMER_ENVIRONMENT\020\002B\246\002\n,com.googl"
          + "e.cloud.cloudcontrolspartner.v1betaB\016Cus"
          + "tomersProtoP\001Z`cloud.google.com/go/cloud"
          + "controlspartner/apiv1beta/cloudcontrolsp"
          + "artnerpb;cloudcontrolspartnerpb\252\002(Google"
          + ".Cloud.CloudControlsPartner.V1Beta\312\002(Goo"
          + "gle\\Cloud\\CloudControlsPartner\\V1beta\352\002+"
          + "Google::Cloud::CloudControlsPartner::V1b"
          + "etab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.cloudcontrolspartner.v1beta.CompletionStateProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Customer_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_Customer_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_Customer_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "CustomerOnboardingState", "IsOnboarded",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_ListCustomersResponse_descriptor,
            new java.lang.String[] {
              "Customers", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_GetCustomerRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_GetCustomerRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_GetCustomerRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingState_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingState_descriptor,
            new java.lang.String[] {
              "OnboardingSteps",
            });
    internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingStep_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_cloudcontrolspartner_v1beta_CustomerOnboardingStep_descriptor,
            new java.lang.String[] {
              "Step", "StartTime", "CompletionTime", "CompletionState",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.cloudcontrolspartner.v1beta.CompletionStateProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
