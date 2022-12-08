// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/featurestore_online_service.proto

package com.google.cloud.aiplatform.v1;

public final class FeaturestoreOnlineServiceProto {
  private FeaturestoreOnlineServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_FeatureValuesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_FeatureDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_Header_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_Header_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_Data_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_StreamingReadFeatureValuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StreamingReadFeatureValuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_FeatureValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_FeatureValue_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureValue_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_FeatureValueList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FeatureValueList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1/featurestor" +
      "e_online_service.proto\022\032google.cloud.aip" +
      "latform.v1\032\034google/api/annotations.proto" +
      "\032\027google/api/client.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\0321google/cloud/aiplatform/v1/featur" +
      "e_selector.proto\032&google/cloud/aiplatfor" +
      "m/v1/types.proto\032\037google/protobuf/timest" +
      "amp.proto\"\254\001\n\031WriteFeatureValuesRequest\022" +
      "A\n\013entity_type\030\001 \001(\tB,\340A\002\372A&\n$aiplatform" +
      ".googleapis.com/EntityType\022L\n\010payloads\030\002" +
      " \003(\01325.google.cloud.aiplatform.v1.WriteF" +
      "eatureValuesPayloadB\003\340A\002\"\372\001\n\031WriteFeatur" +
      "eValuesPayload\022\026\n\tentity_id\030\001 \001(\tB\003\340A\002\022e" +
      "\n\016feature_values\030\002 \003(\0132H.google.cloud.ai" +
      "platform.v1.WriteFeatureValuesPayload.Fe" +
      "atureValuesEntryB\003\340A\002\032^\n\022FeatureValuesEn" +
      "try\022\013\n\003key\030\001 \001(\t\0227\n\005value\030\002 \001(\0132(.google" +
      ".cloud.aiplatform.v1.FeatureValue:\0028\001\"\034\n" +
      "\032WriteFeatureValuesResponse\"\301\001\n\030ReadFeat" +
      "ureValuesRequest\022A\n\013entity_type\030\001 \001(\tB,\340" +
      "A\002\372A&\n$aiplatform.googleapis.com/EntityT" +
      "ype\022\026\n\tentity_id\030\002 \001(\tB\003\340A\002\022J\n\020feature_s" +
      "elector\030\003 \001(\0132+.google.cloud.aiplatform." +
      "v1.FeatureSelectorB\003\340A\002\"\225\005\n\031ReadFeatureV" +
      "aluesResponse\022L\n\006header\030\001 \001(\0132<.google.c" +
      "loud.aiplatform.v1.ReadFeatureValuesResp" +
      "onse.Header\022U\n\013entity_view\030\002 \001(\0132@.googl" +
      "e.cloud.aiplatform.v1.ReadFeatureValuesR" +
      "esponse.EntityView\032\037\n\021FeatureDescriptor\022" +
      "\n\n\002id\030\001 \001(\t\032\256\001\n\006Header\022>\n\013entity_type\030\001 " +
      "\001(\tB)\372A&\n$aiplatform.googleapis.com/Enti" +
      "tyType\022d\n\023feature_descriptors\030\002 \003(\0132G.go" +
      "ogle.cloud.aiplatform.v1.ReadFeatureValu" +
      "esResponse.FeatureDescriptor\032\200\002\n\nEntityV" +
      "iew\022\021\n\tentity_id\030\001 \001(\t\022S\n\004data\030\002 \003(\0132E.g" +
      "oogle.cloud.aiplatform.v1.ReadFeatureVal" +
      "uesResponse.EntityView.Data\032\211\001\n\004Data\0229\n\005" +
      "value\030\001 \001(\0132(.google.cloud.aiplatform.v1" +
      ".FeatureValueH\000\022>\n\006values\030\002 \001(\0132,.google" +
      ".cloud.aiplatform.v1.FeatureValueListH\000B" +
      "\006\n\004data\"\313\001\n!StreamingReadFeatureValuesRe" +
      "quest\022A\n\013entity_type\030\001 \001(\tB,\340A\002\372A&\n$aipl" +
      "atform.googleapis.com/EntityType\022\027\n\nenti" +
      "ty_ids\030\002 \003(\tB\003\340A\002\022J\n\020feature_selector\030\003 " +
      "\001(\0132+.google.cloud.aiplatform.v1.Feature" +
      "SelectorB\003\340A\002\"\245\004\n\014FeatureValue\022\024\n\nbool_v" +
      "alue\030\001 \001(\010H\000\022\026\n\014double_value\030\002 \001(\001H\000\022\025\n\013" +
      "int64_value\030\005 \001(\003H\000\022\026\n\014string_value\030\006 \001(" +
      "\tH\000\022A\n\020bool_array_value\030\007 \001(\0132%.google.c" +
      "loud.aiplatform.v1.BoolArrayH\000\022E\n\022double" +
      "_array_value\030\010 \001(\0132\'.google.cloud.aiplat" +
      "form.v1.DoubleArrayH\000\022C\n\021int64_array_val" +
      "ue\030\013 \001(\0132&.google.cloud.aiplatform.v1.In" +
      "t64ArrayH\000\022E\n\022string_array_value\030\014 \001(\0132\'" +
      ".google.cloud.aiplatform.v1.StringArrayH" +
      "\000\022\025\n\013bytes_value\030\r \001(\014H\000\022C\n\010metadata\030\016 \001" +
      "(\01321.google.cloud.aiplatform.v1.FeatureV" +
      "alue.Metadata\032=\n\010Metadata\0221\n\rgenerate_ti" +
      "me\030\001 \001(\0132\032.google.protobuf.TimestampB\007\n\005" +
      "value\"L\n\020FeatureValueList\0228\n\006values\030\001 \003(" +
      "\0132(.google.cloud.aiplatform.v1.FeatureVa" +
      "lue2\375\006\n FeaturestoreOnlineServingService" +
      "\022\363\001\n\021ReadFeatureValues\0224.google.cloud.ai" +
      "platform.v1.ReadFeatureValuesRequest\0325.g" +
      "oogle.cloud.aiplatform.v1.ReadFeatureVal" +
      "uesResponse\"q\202\323\344\223\002]\"X/v1/{entity_type=pr" +
      "ojects/*/locations/*/featurestores/*/ent" +
      "ityTypes/*}:readFeatureValues:\001*\332A\013entit" +
      "y_type\022\220\002\n\032StreamingReadFeatureValues\022=." +
      "google.cloud.aiplatform.v1.StreamingRead" +
      "FeatureValuesRequest\0325.google.cloud.aipl" +
      "atform.v1.ReadFeatureValuesResponse\"z\202\323\344" +
      "\223\002f\"a/v1/{entity_type=projects/*/locatio" +
      "ns/*/featurestores/*/entityTypes/*}:stre" +
      "amingReadFeatureValues:\001*\332A\013entity_type0" +
      "\001\022\200\002\n\022WriteFeatureValues\0225.google.cloud." +
      "aiplatform.v1.WriteFeatureValuesRequest\032" +
      "6.google.cloud.aiplatform.v1.WriteFeatur" +
      "eValuesResponse\"{\202\323\344\223\002^\"Y/v1/{entity_typ" +
      "e=projects/*/locations/*/featurestores/*" +
      "/entityTypes/*}:writeFeatureValues:\001*\332A\024" +
      "entity_type,payloads\032M\312A\031aiplatform.goog" +
      "leapis.com\322A.https://www.googleapis.com/" +
      "auth/cloud-platformB\342\001\n\036com.google.cloud" +
      ".aiplatform.v1B\036FeaturestoreOnlineServic" +
      "eProtoP\001ZDgoogle.golang.org/genproto/goo" +
      "gleapis/cloud/aiplatform/v1;aiplatform\252\002" +
      "\032Google.Cloud.AIPlatform.V1\312\002\032Google\\Clo" +
      "ud\\AIPlatform\\V1\352\002\035Google::Cloud::AIPlat" +
      "form::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.FeatureSelectorProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.TypesProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesRequest_descriptor,
        new java.lang.String[] { "EntityType", "Payloads", });
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_descriptor,
        new java.lang.String[] { "EntityId", "FeatureValues", });
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor =
      internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_FeatureValuesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesPayload_FeatureValuesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_WriteFeatureValuesResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesRequest_descriptor,
        new java.lang.String[] { "EntityType", "EntityId", "FeatureSelector", });
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_descriptor,
        new java.lang.String[] { "Header", "EntityView", });
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor =
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_FeatureDescriptor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_FeatureDescriptor_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_Header_descriptor =
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_Header_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_Header_descriptor,
        new java.lang.String[] { "EntityType", "FeatureDescriptors", });
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_descriptor =
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_descriptor,
        new java.lang.String[] { "EntityId", "Data", });
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_Data_descriptor =
      internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ReadFeatureValuesResponse_EntityView_Data_descriptor,
        new java.lang.String[] { "Value", "Values", "Data", });
    internal_static_google_cloud_aiplatform_v1_StreamingReadFeatureValuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_StreamingReadFeatureValuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_StreamingReadFeatureValuesRequest_descriptor,
        new java.lang.String[] { "EntityType", "EntityIds", "FeatureSelector", });
    internal_static_google_cloud_aiplatform_v1_FeatureValue_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_FeatureValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_FeatureValue_descriptor,
        new java.lang.String[] { "BoolValue", "DoubleValue", "Int64Value", "StringValue", "BoolArrayValue", "DoubleArrayValue", "Int64ArrayValue", "StringArrayValue", "BytesValue", "Metadata", "Value", });
    internal_static_google_cloud_aiplatform_v1_FeatureValue_Metadata_descriptor =
      internal_static_google_cloud_aiplatform_v1_FeatureValue_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_FeatureValue_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_FeatureValue_Metadata_descriptor,
        new java.lang.String[] { "GenerateTime", });
    internal_static_google_cloud_aiplatform_v1_FeatureValueList_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_FeatureValueList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_FeatureValueList_descriptor,
        new java.lang.String[] { "Values", });
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
    com.google.cloud.aiplatform.v1.FeatureSelectorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.TypesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
