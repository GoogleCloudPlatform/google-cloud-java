// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/secretmanager/v1/service.proto

package com.google.cloud.secretmanager.v1;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_GetSecretRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_GetSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/secretmanager/v1/service." +
      "proto\022\035google.cloud.secretmanager.v1\032\034go" +
      "ogle/api/annotations.proto\032\027google/api/c" +
      "lient.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032-google/" +
      "cloud/secretmanager/v1/resources.proto\032\036" +
      "google/iam/v1/iam_policy.proto\032\032google/i" +
      "am/v1/policy.proto\032\033google/protobuf/empt" +
      "y.proto\032 google/protobuf/field_mask.prot" +
      "o\"\243\001\n\022ListSecretsRequest\022D\n\006parent\030\001 \001(\t" +
      "B4\342A\001\002\372A-\n+cloudresourcemanager.googleap" +
      "is.com/Project\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022" +
      "\030\n\npage_token\030\003 \001(\tB\004\342A\001\001\022\024\n\006filter\030\004 \001(" +
      "\tB\004\342A\001\001\"z\n\023ListSecretsResponse\0226\n\007secret" +
      "s\030\001 \003(\0132%.google.cloud.secretmanager.v1." +
      "Secret\022\027\n\017next_page_token\030\002 \001(\t\022\022\n\ntotal" +
      "_size\030\003 \001(\005\"\261\001\n\023CreateSecretRequest\022D\n\006p" +
      "arent\030\001 \001(\tB4\342A\001\002\372A-\n+cloudresourcemanag" +
      "er.googleapis.com/Project\022\027\n\tsecret_id\030\002" +
      " \001(\tB\004\342A\001\002\022;\n\006secret\030\003 \001(\0132%.google.clou" +
      "d.secretmanager.v1.SecretB\004\342A\001\002\"\234\001\n\027AddS" +
      "ecretVersionRequest\022<\n\006parent\030\001 \001(\tB,\342A\001" +
      "\002\372A%\n#secretmanager.googleapis.com/Secre" +
      "t\022C\n\007payload\030\002 \001(\0132,.google.cloud.secret" +
      "manager.v1.SecretPayloadB\004\342A\001\002\"N\n\020GetSec" +
      "retRequest\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#secre" +
      "tmanager.googleapis.com/Secret\"\242\001\n\031ListS" +
      "ecretVersionsRequest\022<\n\006parent\030\001 \001(\tB,\342A" +
      "\001\002\372A%\n#secretmanager.googleapis.com/Secr" +
      "et\022\027\n\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_toke" +
      "n\030\003 \001(\tB\004\342A\001\001\022\024\n\006filter\030\004 \001(\tB\004\342A\001\001\"\211\001\n\032" +
      "ListSecretVersionsResponse\022>\n\010versions\030\001" +
      " \003(\0132,.google.cloud.secretmanager.v1.Sec" +
      "retVersion\022\027\n\017next_page_token\030\002 \001(\t\022\022\n\nt" +
      "otal_size\030\003 \001(\005\"\\\n\027GetSecretVersionReque" +
      "st\022A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*secretmanager" +
      ".googleapis.com/SecretVersion\"\211\001\n\023Update" +
      "SecretRequest\022;\n\006secret\030\001 \001(\0132%.google.c" +
      "loud.secretmanager.v1.SecretB\004\342A\001\002\0225\n\013up" +
      "date_mask\030\002 \001(\0132\032.google.protobuf.FieldM" +
      "askB\004\342A\001\002\"_\n\032AccessSecretVersionRequest\022" +
      "A\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*secretmanager.go" +
      "ogleapis.com/SecretVersion\"\233\001\n\033AccessSec" +
      "retVersionResponse\022=\n\004name\030\001 \001(\tB/\372A,\n*s" +
      "ecretmanager.googleapis.com/SecretVersio" +
      "n\022=\n\007payload\030\002 \001(\0132,.google.cloud.secret" +
      "manager.v1.SecretPayload\"e\n\023DeleteSecret" +
      "Request\022:\n\004name\030\001 \001(\tB,\342A\001\002\372A%\n#secretma" +
      "nager.googleapis.com/Secret\022\022\n\004etag\030\002 \001(" +
      "\tB\004\342A\001\001\"t\n\033DisableSecretVersionRequest\022A" +
      "\n\004name\030\001 \001(\tB3\342A\001\002\372A,\n*secretmanager.goo" +
      "gleapis.com/SecretVersion\022\022\n\004etag\030\002 \001(\tB" +
      "\004\342A\001\001\"s\n\032EnableSecretVersionRequest\022A\n\004n" +
      "ame\030\001 \001(\tB3\342A\001\002\372A,\n*secretmanager.google" +
      "apis.com/SecretVersion\022\022\n\004etag\030\002 \001(\tB\004\342A" +
      "\001\001\"t\n\033DestroySecretVersionRequest\022A\n\004nam" +
      "e\030\001 \001(\tB3\342A\001\002\372A,\n*secretmanager.googleap" +
      "is.com/SecretVersion\022\022\n\004etag\030\002 \001(\tB\004\342A\001\001" +
      "2\317\025\n\024SecretManagerService\022\246\001\n\013ListSecret" +
      "s\0221.google.cloud.secretmanager.v1.ListSe" +
      "cretsRequest\0322.google.cloud.secretmanage" +
      "r.v1.ListSecretsResponse\"0\332A\006parent\202\323\344\223\002" +
      "!\022\037/v1/{parent=projects/*}/secrets\022\264\001\n\014C" +
      "reateSecret\0222.google.cloud.secretmanager" +
      ".v1.CreateSecretRequest\032%.google.cloud.s" +
      "ecretmanager.v1.Secret\"I\332A\027parent,secret" +
      "_id,secret\202\323\344\223\002)\"\037/v1/{parent=projects/*" +
      "}/secrets:\006secret\022\302\001\n\020AddSecretVersion\0226" +
      ".google.cloud.secretmanager.v1.AddSecret" +
      "VersionRequest\032,.google.cloud.secretmana" +
      "ger.v1.SecretVersion\"H\332A\016parent,payload\202" +
      "\323\344\223\0021\",/v1/{parent=projects/*/secrets/*}" +
      ":addVersion:\001*\022\223\001\n\tGetSecret\022/.google.cl" +
      "oud.secretmanager.v1.GetSecretRequest\032%." +
      "google.cloud.secretmanager.v1.Secret\".\332A" +
      "\004name\202\323\344\223\002!\022\037/v1/{name=projects/*/secret" +
      "s/*}\022\266\001\n\014UpdateSecret\0222.google.cloud.sec" +
      "retmanager.v1.UpdateSecretRequest\032%.goog" +
      "le.cloud.secretmanager.v1.Secret\"K\332A\022sec" +
      "ret,update_mask\202\323\344\223\00202&/v1/{secret.name=" +
      "projects/*/secrets/*}:\006secret\022\212\001\n\014Delete" +
      "Secret\0222.google.cloud.secretmanager.v1.D" +
      "eleteSecretRequest\032\026.google.protobuf.Emp" +
      "ty\".\332A\004name\202\323\344\223\002!*\037/v1/{name=projects/*/" +
      "secrets/*}\022\306\001\n\022ListSecretVersions\0228.goog" +
      "le.cloud.secretmanager.v1.ListSecretVers" +
      "ionsRequest\0329.google.cloud.secretmanager" +
      ".v1.ListSecretVersionsResponse\";\332A\006paren" +
      "t\202\323\344\223\002,\022*/v1/{parent=projects/*/secrets/" +
      "*}/versions\022\263\001\n\020GetSecretVersion\0226.googl" +
      "e.cloud.secretmanager.v1.GetSecretVersio" +
      "nRequest\032,.google.cloud.secretmanager.v1" +
      ".SecretVersion\"9\332A\004name\202\323\344\223\002,\022*/v1/{name" +
      "=projects/*/secrets/*/versions/*}\022\316\001\n\023Ac" +
      "cessSecretVersion\0229.google.cloud.secretm" +
      "anager.v1.AccessSecretVersionRequest\032:.g" +
      "oogle.cloud.secretmanager.v1.AccessSecre" +
      "tVersionResponse\"@\332A\004name\202\323\344\223\0023\0221/v1/{na" +
      "me=projects/*/secrets/*/versions/*}:acce" +
      "ss\022\306\001\n\024DisableSecretVersion\022:.google.clo" +
      "ud.secretmanager.v1.DisableSecretVersion" +
      "Request\032,.google.cloud.secretmanager.v1." +
      "SecretVersion\"D\332A\004name\202\323\344\223\0027\"2/v1/{name=" +
      "projects/*/secrets/*/versions/*}:disable" +
      ":\001*\022\303\001\n\023EnableSecretVersion\0229.google.clo" +
      "ud.secretmanager.v1.EnableSecretVersionR" +
      "equest\032,.google.cloud.secretmanager.v1.S" +
      "ecretVersion\"C\332A\004name\202\323\344\223\0026\"1/v1/{name=p" +
      "rojects/*/secrets/*/versions/*}:enable:\001" +
      "*\022\306\001\n\024DestroySecretVersion\022:.google.clou" +
      "d.secretmanager.v1.DestroySecretVersionR" +
      "equest\032,.google.cloud.secretmanager.v1.S" +
      "ecretVersion\"D\332A\004name\202\323\344\223\0027\"2/v1/{name=p" +
      "rojects/*/secrets/*/versions/*}:destroy:" +
      "\001*\022\206\001\n\014SetIamPolicy\022\".google.iam.v1.SetI" +
      "amPolicyRequest\032\025.google.iam.v1.Policy\";" +
      "\202\323\344\223\0025\"0/v1/{resource=projects/*/secrets" +
      "/*}:setIamPolicy:\001*\022\203\001\n\014GetIamPolicy\022\".g" +
      "oogle.iam.v1.GetIamPolicyRequest\032\025.googl" +
      "e.iam.v1.Policy\"8\202\323\344\223\0022\0220/v1/{resource=p" +
      "rojects/*/secrets/*}:getIamPolicy\022\254\001\n\022Te" +
      "stIamPermissions\022(.google.iam.v1.TestIam" +
      "PermissionsRequest\032).google.iam.v1.TestI" +
      "amPermissionsResponse\"A\202\323\344\223\002;\"6/v1/{reso" +
      "urce=projects/*/secrets/*}:testIamPermis" +
      "sions:\001*\032P\312A\034secretmanager.googleapis.co" +
      "m\322A.https://www.googleapis.com/auth/clou" +
      "d-platformB\350\001\n!com.google.cloud.secretma" +
      "nager.v1B\014ServiceProtoP\001ZGcloud.google.c" +
      "om/go/secretmanager/apiv1/secretmanagerp" +
      "b;secretmanagerpb\370\001\001\242\002\003GSM\252\002\035Google.Clou" +
      "d.SecretManager.V1\312\002\035Google\\Cloud\\Secret" +
      "Manager\\V1\352\002 Google::Cloud::SecretManage" +
      "r::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.secretmanager.v1.ResourcesProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_ListSecretsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_ListSecretsResponse_descriptor,
        new java.lang.String[] { "Secrets", "NextPageToken", "TotalSize", });
    internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_CreateSecretRequest_descriptor,
        new java.lang.String[] { "Parent", "SecretId", "Secret", });
    internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_AddSecretVersionRequest_descriptor,
        new java.lang.String[] { "Parent", "Payload", });
    internal_static_google_cloud_secretmanager_v1_GetSecretRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_secretmanager_v1_GetSecretRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_GetSecretRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_ListSecretVersionsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_ListSecretVersionsResponse_descriptor,
        new java.lang.String[] { "Versions", "NextPageToken", "TotalSize", });
    internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_GetSecretVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_UpdateSecretRequest_descriptor,
        new java.lang.String[] { "Secret", "UpdateMask", });
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_AccessSecretVersionRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_AccessSecretVersionResponse_descriptor,
        new java.lang.String[] { "Name", "Payload", });
    internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_DeleteSecretRequest_descriptor,
        new java.lang.String[] { "Name", "Etag", });
    internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_DisableSecretVersionRequest_descriptor,
        new java.lang.String[] { "Name", "Etag", });
    internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_EnableSecretVersionRequest_descriptor,
        new java.lang.String[] { "Name", "Etag", });
    internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_secretmanager_v1_DestroySecretVersionRequest_descriptor,
        new java.lang.String[] { "Name", "Etag", });
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
    com.google.cloud.secretmanager.v1.ResourcesProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
