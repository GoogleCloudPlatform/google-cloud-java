// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/deployment_resource_pool_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class DeploymentResourcePoolServiceProto {
  private DeploymentResourcePoolServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/cloud/aiplatform/v1beta1/deploy" +
      "ment_resource_pool_service.proto\022\037google" +
      ".cloud.aiplatform.v1beta1\032\034google/api/an" +
      "notations.proto\032\027google/api/client.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\0328google/cloud/aipla" +
      "tform/v1beta1/deployed_model_ref.proto\032>" +
      "google/cloud/aiplatform/v1beta1/deployme" +
      "nt_resource_pool.proto\032.google/cloud/aip" +
      "latform/v1beta1/endpoint.proto\032/google/c" +
      "loud/aiplatform/v1beta1/operation.proto\032" +
      "#google/longrunning/operations.proto\"\352\001\n" +
      "#CreateDeploymentResourcePoolRequest\0229\n\006" +
      "parent\030\001 \001(\tB)\340A\002\372A#\n!locations.googleap" +
      "is.com/Location\022^\n\030deployment_resource_p" +
      "ool\030\002 \001(\01327.google.cloud.aiplatform.v1be" +
      "ta1.DeploymentResourcePoolB\003\340A\002\022(\n\033deplo" +
      "yment_resource_pool_id\030\003 \001(\tB\003\340A\002\"\204\001\n-Cr" +
      "eateDeploymentResourcePoolOperationMetad" +
      "ata\022S\n\020generic_metadata\030\001 \001(\01329.google.c" +
      "loud.aiplatform.v1beta1.GenericOperation" +
      "Metadata\"j\n GetDeploymentResourcePoolReq" +
      "uest\022F\n\004name\030\001 \001(\tB8\340A\002\372A2\n0aiplatform.g" +
      "oogleapis.com/DeploymentResourcePool\"\206\001\n" +
      "\"ListDeploymentResourcePoolsRequest\0229\n\006p" +
      "arent\030\001 \001(\tB)\340A\002\372A#\022!locations.googleapi" +
      "s.com/Location\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npag" +
      "e_token\030\003 \001(\t\"\232\001\n#ListDeploymentResource" +
      "PoolsResponse\022Z\n\031deployment_resource_poo" +
      "ls\030\001 \003(\01327.google.cloud.aiplatform.v1bet" +
      "a1.DeploymentResourcePool\022\027\n\017next_page_t" +
      "oken\030\002 \001(\t\"\204\001\n-UpdateDeploymentResourceP" +
      "oolOperationMetadata\022S\n\020generic_metadata" +
      "\030\001 \001(\01329.google.cloud.aiplatform.v1beta1" +
      ".GenericOperationMetadata\"m\n#DeleteDeplo" +
      "ymentResourcePoolRequest\022F\n\004name\030\001 \001(\tB8" +
      "\340A\002\372A2\n0aiplatform.googleapis.com/Deploy" +
      "mentResourcePool\"j\n\032QueryDeployedModelsR" +
      "equest\022%\n\030deployment_resource_pool\030\001 \001(\t" +
      "B\003\340A\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003" +
      " \001(\t\"\225\002\n\033QueryDeployedModelsResponse\022K\n\017" +
      "deployed_models\030\001 \003(\0132..google.cloud.aip" +
      "latform.v1beta1.DeployedModelB\002\030\001\022\027\n\017nex" +
      "t_page_token\030\002 \001(\t\022N\n\023deployed_model_ref" +
      "s\030\003 \003(\01321.google.cloud.aiplatform.v1beta" +
      "1.DeployedModelRef\022\"\n\032total_deployed_mod" +
      "el_count\030\004 \001(\005\022\034\n\024total_endpoint_count\030\005" +
      " \001(\0052\337\013\n\035DeploymentResourcePoolService\022\331" +
      "\002\n\034CreateDeploymentResourcePool\022D.google" +
      ".cloud.aiplatform.v1beta1.CreateDeployme" +
      "ntResourcePoolRequest\032\035.google.longrunni" +
      "ng.Operation\"\323\001\202\323\344\223\002E\"@/v1beta1/{parent=" +
      "projects/*/locations/*}/deploymentResour" +
      "cePools:\001*\332A;parent,deployment_resource_" +
      "pool,deployment_resource_pool_id\312AG\n\026Dep" +
      "loymentResourcePool\022-CreateDeploymentRes" +
      "ourcePoolOperationMetadata\022\350\001\n\031GetDeploy" +
      "mentResourcePool\022A.google.cloud.aiplatfo" +
      "rm.v1beta1.GetDeploymentResourcePoolRequ" +
      "est\0327.google.cloud.aiplatform.v1beta1.De" +
      "ploymentResourcePool\"O\202\323\344\223\002B\022@/v1beta1/{" +
      "name=projects/*/locations/*/deploymentRe" +
      "sourcePools/*}\332A\004name\022\373\001\n\033ListDeployment" +
      "ResourcePools\022C.google.cloud.aiplatform." +
      "v1beta1.ListDeploymentResourcePoolsReque" +
      "st\032D.google.cloud.aiplatform.v1beta1.Lis" +
      "tDeploymentResourcePoolsResponse\"Q\202\323\344\223\002B" +
      "\022@/v1beta1/{parent=projects/*/locations/" +
      "*}/deploymentResourcePools\332A\006parent\022\210\002\n\034" +
      "DeleteDeploymentResourcePool\022D.google.cl" +
      "oud.aiplatform.v1beta1.DeleteDeploymentR" +
      "esourcePoolRequest\032\035.google.longrunning." +
      "Operation\"\202\001\202\323\344\223\002B*@/v1beta1/{name=proje" +
      "cts/*/locations/*/deploymentResourcePool" +
      "s/*}\332A\004name\312A0\n\025google.protobuf.Empty\022\027D" +
      "eleteOperationMetadata\022\236\002\n\023QueryDeployed" +
      "Models\022;.google.cloud.aiplatform.v1beta1" +
      ".QueryDeployedModelsRequest\032<.google.clo" +
      "ud.aiplatform.v1beta1.QueryDeployedModel" +
      "sResponse\"\213\001\202\323\344\223\002j\022h/v1beta1/{deployment" +
      "_resource_pool=projects/*/locations/*/de" +
      "ploymentResourcePools/*}:queryDeployedMo" +
      "dels\332A\030deployment_resource_pool\032M\312A\031aipl" +
      "atform.googleapis.com\322A.https://www.goog" +
      "leapis.com/auth/cloud-platformB\377\001\n#com.g" +
      "oogle.cloud.aiplatform.v1beta1B\"Deployme" +
      "ntResourcePoolServiceProtoP\001ZIgoogle.gol" +
      "ang.org/genproto/googleapis/cloud/aiplat" +
      "form/v1beta1;aiplatform\252\002\037Google.Cloud.A" +
      "IPlatform.V1Beta1\312\002\037Google\\Cloud\\AIPlatf" +
      "orm\\V1beta1\352\002\"Google::Cloud::AIPlatform:" +
      ":V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor(),
          com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
        });
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Parent", "DeploymentResourcePool", "DeploymentResourcePoolId", });
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_CreateDeploymentResourcePoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_GetDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_ListDeploymentResourcePoolsResponse_descriptor,
        new java.lang.String[] { "DeploymentResourcePools", "NextPageToken", });
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_UpdateDeploymentResourcePoolOperationMetadata_descriptor,
        new java.lang.String[] { "GenericMetadata", });
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_DeleteDeploymentResourcePoolRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsRequest_descriptor,
        new java.lang.String[] { "DeploymentResourcePool", "PageSize", "PageToken", });
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_aiplatform_v1beta1_QueryDeployedModelsResponse_descriptor,
        new java.lang.String[] { "DeployedModels", "NextPageToken", "DeployedModelRefs", "TotalDeployedModelCount", "TotalEndpointCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.DeploymentResourcePoolProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.EndpointProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
