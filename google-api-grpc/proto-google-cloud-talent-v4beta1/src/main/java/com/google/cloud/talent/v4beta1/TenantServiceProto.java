// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/tenant_service.proto

package com.google.cloud.talent.v4beta1;

public final class TenantServiceProto {
  private TenantServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_GetTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/talent/v4beta1/tenant_ser"
          + "vice.proto\022\033google.cloud.talent.v4beta1\032"
          + "\034google/api/annotations.proto\032\027google/ap"
          + "i/client.proto\032\037google/api/field_behavio"
          + "r.proto\032(google/cloud/talent/v4beta1/com"
          + "mon.proto\032(google/cloud/talent/v4beta1/t"
          + "enant.proto\032\033google/protobuf/empty.proto"
          + "\032 google/protobuf/field_mask.proto\"d\n\023Cr"
          + "eateTenantRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\0228"
          + "\n\006tenant\030\002 \001(\0132#.google.cloud.talent.v4b"
          + "eta1.TenantB\003\340A\002\"%\n\020GetTenantRequest\022\021\n\004"
          + "name\030\001 \001(\tB\003\340A\002\"\200\001\n\023UpdateTenantRequest\022"
          + "8\n\006tenant\030\001 \001(\0132#.google.cloud.talent.v4"
          + "beta1.TenantB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032"
          + ".google.protobuf.FieldMask\"(\n\023DeleteTena"
          + "ntRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"P\n\022ListTena"
          + "ntsRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022\022\n\npage_"
          + "token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\"\245\001\n\023ListT"
          + "enantsResponse\0224\n\007tenants\030\001 \003(\0132#.google"
          + ".cloud.talent.v4beta1.Tenant\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\022?\n\010metadata\030\003 \001(\0132-.google"
          + ".cloud.talent.v4beta1.ResponseMetadata2\360"
          + "\006\n\rTenantService\022\226\001\n\014CreateTenant\0220.goog"
          + "le.cloud.talent.v4beta1.CreateTenantRequ"
          + "est\032#.google.cloud.talent.v4beta1.Tenant"
          + "\"/\202\323\344\223\002)\"$/v4beta1/{parent=projects/*}/t"
          + "enants:\001*\022\215\001\n\tGetTenant\022-.google.cloud.t"
          + "alent.v4beta1.GetTenantRequest\032#.google."
          + "cloud.talent.v4beta1.Tenant\",\202\323\344\223\002&\022$/v4"
          + "beta1/{name=projects/*/tenants/*}\022\235\001\n\014Up"
          + "dateTenant\0220.google.cloud.talent.v4beta1"
          + ".UpdateTenantRequest\032#.google.cloud.tale"
          + "nt.v4beta1.Tenant\"6\202\323\344\223\00202+/v4beta1/{ten"
          + "ant.name=projects/*/tenants/*}:\001*\022\206\001\n\014De"
          + "leteTenant\0220.google.cloud.talent.v4beta1"
          + ".DeleteTenantRequest\032\026.google.protobuf.E"
          + "mpty\",\202\323\344\223\002&*$/v4beta1/{name=projects/*/"
          + "tenants/*}\022\236\001\n\013ListTenants\022/.google.clou"
          + "d.talent.v4beta1.ListTenantsRequest\0320.go"
          + "ogle.cloud.talent.v4beta1.ListTenantsRes"
          + "ponse\",\202\323\344\223\002&\022$/v4beta1/{parent=projects"
          + "/*}/tenants\032l\312A\023jobs.googleapis.com\322ASht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "form,https://www.googleapis.com/auth/job"
          + "sB\200\001\n\037com.google.cloud.talent.v4beta1B\022T"
          + "enantServiceProtoP\001ZAgoogle.golang.org/g"
          + "enproto/googleapis/cloud/talent/v4beta1;"
          + "talent\242\002\003CTSb\006proto3"
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
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.TenantResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CreateTenantRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Tenant",
            });
    internal_static_google_cloud_talent_v4beta1_GetTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_GetTenantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_UpdateTenantRequest_descriptor,
            new java.lang.String[] {
              "Tenant", "UpdateMask",
            });
    internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeleteTenantRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListTenantsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageToken", "PageSize",
            });
    internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ListTenantsResponse_descriptor,
            new java.lang.String[] {
              "Tenants", "NextPageToken", "Metadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.TenantResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
