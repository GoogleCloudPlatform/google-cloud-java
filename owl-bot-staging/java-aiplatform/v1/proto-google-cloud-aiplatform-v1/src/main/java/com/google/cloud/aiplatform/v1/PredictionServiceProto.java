// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/prediction_service.proto

package com.google.cloud.aiplatform.v1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RawPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_StreamingPredictRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StreamingPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_StreamingPredictResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StreamingPredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplainRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1_ExplainResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExplainResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/aiplatform/v1/prediction_" +
      "service.proto\022\032google.cloud.aiplatform.v" +
      "1\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/httpbody.proto\032\031go" +
      "ogle/api/resource.proto\032,google/cloud/ai" +
      "platform/v1/explanation.proto\032&google/cl" +
      "oud/aiplatform/v1/types.proto\032\034google/pr" +
      "otobuf/struct.proto\"\254\001\n\016PredictRequest\022=" +
      "\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplatform.go" +
      "ogleapis.com/Endpoint\022/\n\tinstances\030\002 \003(\013" +
      "2\026.google.protobuf.ValueB\004\342A\001\002\022*\n\nparame" +
      "ters\030\003 \001(\0132\026.google.protobuf.Value\"\204\002\n\017P" +
      "redictResponse\022+\n\013predictions\030\001 \003(\0132\026.go" +
      "ogle.protobuf.Value\022\031\n\021deployed_model_id" +
      "\030\002 \001(\t\0227\n\005model\030\003 \001(\tB(\342A\001\003\372A!\n\037aiplatfo" +
      "rm.googleapis.com/Model\022\036\n\020model_version" +
      "_id\030\005 \001(\tB\004\342A\001\003\022 \n\022model_display_name\030\004 " +
      "\001(\tB\004\342A\001\003\022.\n\010metadata\030\006 \001(\0132\026.google.pro" +
      "tobuf.ValueB\004\342A\001\003\"{\n\021RawPredictRequest\022=" +
      "\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplatform.go" +
      "ogleapis.com/Endpoint\022\'\n\thttp_body\030\002 \001(\013" +
      "2\024.google.api.HttpBody\"\304\001\n\027StreamingPred" +
      "ictRequest\022=\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\"a" +
      "iplatform.googleapis.com/Endpoint\0222\n\006inp" +
      "uts\030\002 \003(\0132\".google.cloud.aiplatform.v1.T" +
      "ensor\0226\n\nparameters\030\003 \001(\0132\".google.cloud" +
      ".aiplatform.v1.Tensor\"\207\001\n\030StreamingPredi" +
      "ctResponse\0223\n\007outputs\030\001 \003(\0132\".google.clo" +
      "ud.aiplatform.v1.Tensor\0226\n\nparameters\030\002 " +
      "\001(\0132\".google.cloud.aiplatform.v1.Tensor\"" +
      "\237\002\n\016ExplainRequest\022=\n\010endpoint\030\001 \001(\tB+\342A" +
      "\001\002\372A$\n\"aiplatform.googleapis.com/Endpoin" +
      "t\022/\n\tinstances\030\002 \003(\0132\026.google.protobuf.V" +
      "alueB\004\342A\001\002\022*\n\nparameters\030\004 \001(\0132\026.google." +
      "protobuf.Value\022V\n\031explanation_spec_overr" +
      "ide\030\005 \001(\01323.google.cloud.aiplatform.v1.E" +
      "xplanationSpecOverride\022\031\n\021deployed_model" +
      "_id\030\003 \001(\t\"\230\001\n\017ExplainResponse\022=\n\014explana" +
      "tions\030\001 \003(\0132\'.google.cloud.aiplatform.v1" +
      ".Explanation\022\031\n\021deployed_model_id\030\002 \001(\t\022" +
      "+\n\013predictions\030\003 \003(\0132\026.google.protobuf.V" +
      "alue2\217\t\n\021PredictionService\022\224\002\n\007Predict\022*" +
      ".google.cloud.aiplatform.v1.PredictReque" +
      "st\032+.google.cloud.aiplatform.v1.PredictR" +
      "esponse\"\257\001\332A\035endpoint,instances,paramete" +
      "rs\202\323\344\223\002\210\001\"9/v1/{endpoint=projects/*/loca" +
      "tions/*/endpoints/*}:predict:\001*ZH\"C/v1/{" +
      "endpoint=projects/*/locations/*/publishe" +
      "rs/*/models/*}:predict:\001*\022\376\001\n\nRawPredict" +
      "\022-.google.cloud.aiplatform.v1.RawPredict" +
      "Request\032\024.google.api.HttpBody\"\252\001\332A\022endpo" +
      "int,http_body\202\323\344\223\002\216\001\"</v1/{endpoint=proj" +
      "ects/*/locations/*/endpoints/*}:rawPredi" +
      "ct:\001*ZK\"F/v1/{endpoint=projects/*/locati" +
      "ons/*/publishers/*/models/*}:rawPredict:" +
      "\001*\022\265\002\n\026ServerStreamingPredict\0223.google.c" +
      "loud.aiplatform.v1.StreamingPredictReque" +
      "st\0324.google.cloud.aiplatform.v1.Streamin" +
      "gPredictResponse\"\255\001\202\323\344\223\002\246\001\"H/v1/{endpoin" +
      "t=projects/*/locations/*/endpoints/*}:se" +
      "rverStreamingPredict:\001*ZW\"R/v1/{endpoint" +
      "=projects/*/locations/*/publishers/*/mod" +
      "els/*}:serverStreamingPredict:\001*0\001\022\332\001\n\007E" +
      "xplain\022*.google.cloud.aiplatform.v1.Expl" +
      "ainRequest\032+.google.cloud.aiplatform.v1." +
      "ExplainResponse\"v\332A/endpoint,instances,p" +
      "arameters,deployed_model_id\202\323\344\223\002>\"9/v1/{" +
      "endpoint=projects/*/locations/*/endpoint" +
      "s/*}:explain:\001*\032M\312A\031aiplatform.googleapi" +
      "s.com\322A.https://www.googleapis.com/auth/" +
      "cloud-platformB\324\001\n\036com.google.cloud.aipl" +
      "atform.v1B\026PredictionServiceProtoP\001Z>clo" +
      "ud.google.com/go/aiplatform/apiv1/aiplat" +
      "formpb;aiplatformpb\252\002\032Google.Cloud.AIPla" +
      "tform.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035" +
      "Google::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.HttpBodyProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
          com.google.cloud.aiplatform.v1.TypesProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_PredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PredictRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Instances", "Parameters", });
    internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PredictResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_PredictResponse_descriptor,
        new java.lang.String[] { "Predictions", "DeployedModelId", "Model", "ModelVersionId", "ModelDisplayName", "Metadata", });
    internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_RawPredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_RawPredictRequest_descriptor,
        new java.lang.String[] { "Endpoint", "HttpBody", });
    internal_static_google_cloud_aiplatform_v1_StreamingPredictRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_StreamingPredictRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_StreamingPredictRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Inputs", "Parameters", });
    internal_static_google_cloud_aiplatform_v1_StreamingPredictResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_StreamingPredictResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_StreamingPredictResponse_descriptor,
        new java.lang.String[] { "Outputs", "Parameters", });
    internal_static_google_cloud_aiplatform_v1_ExplainRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_ExplainRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplainRequest_descriptor,
        new java.lang.String[] { "Endpoint", "Instances", "Parameters", "ExplanationSpecOverride", "DeployedModelId", });
    internal_static_google_cloud_aiplatform_v1_ExplainResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_ExplainResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1_ExplainResponse_descriptor,
        new java.lang.String[] { "Explanations", "DeployedModelId", "Predictions", });
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
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1.TypesProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
