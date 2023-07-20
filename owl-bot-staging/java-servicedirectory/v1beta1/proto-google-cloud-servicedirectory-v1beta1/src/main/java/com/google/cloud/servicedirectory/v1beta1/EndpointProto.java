// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/servicedirectory/v1beta1/endpoint.proto

package com.google.cloud.servicedirectory.v1beta1;

public final class EndpointProto {
  private EndpointProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/servicedirectory/v1beta1/" +
      "endpoint.proto\022%google.cloud.servicedire" +
      "ctory.v1beta1\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\037googl" +
      "e/protobuf/timestamp.proto\"\256\004\n\010Endpoint\022" +
      "\022\n\004name\030\001 \001(\tB\004\342A\001\005\022\025\n\007address\030\002 \001(\tB\004\342A" +
      "\001\001\022\022\n\004port\030\003 \001(\005B\004\342A\001\001\022U\n\010metadata\030\004 \003(\013" +
      "2=.google.cloud.servicedirectory.v1beta1" +
      ".Endpoint.MetadataEntryB\004\342A\001\001\022A\n\007network" +
      "\030\005 \001(\tB0\342A\001\005\372A)\n\'servicedirectory.google" +
      "apis.com/Network\0225\n\013create_time\030\006 \001(\0132\032." +
      "google.protobuf.TimestampB\004\342A\001\003\0225\n\013updat" +
      "e_time\030\007 \001(\0132\032.google.protobuf.Timestamp" +
      "B\004\342A\001\003\022\021\n\003uid\030\010 \001(\tB\004\342A\001\003\032/\n\rMetadataEnt" +
      "ry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001:\226\001\352A\222" +
      "\001\n(servicedirectory.googleapis.com/Endpo" +
      "int\022fprojects/{project}/locations/{locat" +
      "ion}/namespaces/{namespace}/services/{se" +
      "rvice}/endpoints/{endpoint}B\365\002\n)com.goog" +
      "le.cloud.servicedirectory.v1beta1B\rEndpo" +
      "intProtoP\001ZUcloud.google.com/go/serviced" +
      "irectory/apiv1beta1/servicedirectorypb;s" +
      "ervicedirectorypb\370\001\001\252\002%Google.Cloud.Serv" +
      "iceDirectory.V1Beta1\312\002%Google\\Cloud\\Serv" +
      "iceDirectory\\V1beta1\352\002(Google::Cloud::Se" +
      "rviceDirectory::V1beta1\352Aa\n\'servicedirec" +
      "tory.googleapis.com/Network\0226projects/{p" +
      "roject}/locations/global/networks/{netwo" +
      "rk}b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor,
        new java.lang.String[] { "Name", "Address", "Port", "Metadata", "Network", "CreateTime", "UpdateTime", "Uid", });
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_descriptor =
      internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_servicedirectory_v1beta1_Endpoint_MetadataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
