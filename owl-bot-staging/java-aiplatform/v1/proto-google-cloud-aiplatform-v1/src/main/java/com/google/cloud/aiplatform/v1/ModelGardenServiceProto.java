// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/model_garden_service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.aiplatform.v1;

public final class ModelGardenServiceProto {
  private ModelGardenServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/model_garde" +
      "n_service.proto\022\032google.cloud.aiplatform" +
      ".v1\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\0320" +
      "google/cloud/aiplatform/v1/publisher_mod" +
      "el.proto\"\271\001\n\030GetPublisherModelRequest\022>\n" +
      "\004name\030\001 \001(\tB0\340A\002\372A*\n(aiplatform.googleap" +
      "is.com/PublisherModel\022\032\n\rlanguage_code\030\002" +
      " \001(\tB\003\340A\001\022A\n\004view\030\003 \001(\0162..google.cloud.a" +
      "iplatform.v1.PublisherModelViewB\003\340A\001*\241\001\n" +
      "\022PublisherModelView\022$\n PUBLISHER_MODEL_V" +
      "IEW_UNSPECIFIED\020\000\022\036\n\032PUBLISHER_MODEL_VIE" +
      "W_BASIC\020\001\022\035\n\031PUBLISHER_MODEL_VIEW_FULL\020\002" +
      "\022&\n\"PUBLISHER_MODEL_VERSION_VIEW_BASIC\020\003" +
      "2\214\002\n\022ModelGardenService\022\246\001\n\021GetPublisher" +
      "Model\0224.google.cloud.aiplatform.v1.GetPu" +
      "blisherModelRequest\032*.google.cloud.aipla" +
      "tform.v1.PublisherModel\"/\332A\004name\202\323\344\223\002\"\022 " +
      "/v1/{name=publishers/*/models/*}\032M\312A\031aip" +
      "latform.googleapis.com\322A.https://www.goo" +
      "gleapis.com/auth/cloud-platformB\325\001\n\036com." +
      "google.cloud.aiplatform.v1B\027ModelGardenS" +
      "erviceProtoP\001Z>cloud.google.com/go/aipla" +
      "tform/apiv1/aiplatformpb;aiplatformpb\252\002\032" +
      "Google.Cloud.AIPlatform.V1\312\002\032Google\\Clou" +
      "d\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlatf" +
      "orm::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.PublisherModelProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor,
        new java.lang.String[] { "Name", "LanguageCode", "View", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PublisherModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
