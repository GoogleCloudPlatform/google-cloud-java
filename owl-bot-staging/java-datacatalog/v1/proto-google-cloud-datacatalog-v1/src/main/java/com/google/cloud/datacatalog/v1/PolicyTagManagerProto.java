// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanager.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public final class PolicyTagManagerProto {
  private PolicyTagManagerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Taxonomy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_PolicyTag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_PolicyTag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/datacatalog/v1/policytagm" +
      "anager.proto\022\033google.cloud.datacatalog.v" +
      "1\032\034google/api/annotations.proto\032\027google/" +
      "api/client.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\032(go" +
      "ogle/cloud/datacatalog/v1/common.proto\032," +
      "google/cloud/datacatalog/v1/timestamps.p" +
      "roto\032\036google/iam/v1/iam_policy.proto\032\032go" +
      "ogle/iam/v1/policy.proto\032\033google/protobu" +
      "f/empty.proto\032 google/protobuf/field_mas" +
      "k.proto\"\353\004\n\010Taxonomy\022\021\n\004name\030\001 \001(\tB\003\340A\010\022" +
      "\031\n\014display_name\030\002 \001(\tB\003\340A\002\022\030\n\013descriptio" +
      "n\030\003 \001(\tB\003\340A\001\022\035\n\020policy_tag_count\030\004 \001(\005B\003" +
      "\340A\003\022O\n\023taxonomy_timestamps\030\005 \001(\0132-.googl" +
      "e.cloud.datacatalog.v1.SystemTimestampsB" +
      "\003\340A\003\022U\n\026activated_policy_types\030\006 \003(\01620.g" +
      "oogle.cloud.datacatalog.v1.Taxonomy.Poli" +
      "cyTypeB\003\340A\001\022C\n\007service\030\007 \001(\0132-.google.cl" +
      "oud.datacatalog.v1.Taxonomy.ServiceB\003\340A\003" +
      "\032V\n\007Service\0229\n\004name\030\001 \001(\0162+.google.cloud" +
      ".datacatalog.v1.ManagingSystem\022\020\n\010identi" +
      "ty\030\002 \001(\t\"J\n\nPolicyType\022\033\n\027POLICY_TYPE_UN" +
      "SPECIFIED\020\000\022\037\n\033FINE_GRAINED_ACCESS_CONTR" +
      "OL\020\001:g\352Ad\n#datacatalog.googleapis.com/Ta" +
      "xonomy\022=projects/{project}/locations/{lo" +
      "cation}/taxonomies/{taxonomy}\"\214\002\n\tPolicy" +
      "Tag\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\031\n\014display_name\030\002" +
      " \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022\031\n\021parent" +
      "_policy_tag\030\004 \001(\t\022\036\n\021child_policy_tags\030\005" +
      " \003(\tB\003\340A\003:\200\001\352A}\n$datacatalog.googleapis." +
      "com/PolicyTag\022Uprojects/{project}/locati" +
      "ons/{location}/taxonomies/{taxonomy}/pol" +
      "icyTags/{policy_tag}\"\215\001\n\025CreateTaxonomyR" +
      "equest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\022#datacata" +
      "log.googleapis.com/Taxonomy\0227\n\010taxonomy\030" +
      "\002 \001(\0132%.google.cloud.datacatalog.v1.Taxo" +
      "nomy\"R\n\025DeleteTaxonomyRequest\0229\n\004name\030\001 " +
      "\001(\tB+\340A\002\372A%\n#datacatalog.googleapis.com/" +
      "Taxonomy\"\201\001\n\025UpdateTaxonomyRequest\0227\n\010ta" +
      "xonomy\030\001 \001(\0132%.google.cloud.datacatalog." +
      "v1.Taxonomy\022/\n\013update_mask\030\002 \001(\0132\032.googl" +
      "e.protobuf.FieldMask\"\213\001\n\025ListTaxonomiesR" +
      "equest\022;\n\006parent\030\001 \001(\tB+\340A\002\372A%\022#datacata" +
      "log.googleapis.com/Taxonomy\022\021\n\tpage_size" +
      "\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filter\030\004 \001" +
      "(\t\"l\n\026ListTaxonomiesResponse\0229\n\ntaxonomi" +
      "es\030\001 \003(\0132%.google.cloud.datacatalog.v1.T" +
      "axonomy\022\027\n\017next_page_token\030\002 \001(\t\"O\n\022GetT" +
      "axonomyRequest\0229\n\004name\030\001 \001(\tB+\340A\002\372A%\n#da" +
      "tacatalog.googleapis.com/Taxonomy\"\222\001\n\026Cr" +
      "eatePolicyTagRequest\022<\n\006parent\030\001 \001(\tB,\340A" +
      "\002\372A&\022$datacatalog.googleapis.com/PolicyT" +
      "ag\022:\n\npolicy_tag\030\002 \001(\0132&.google.cloud.da" +
      "tacatalog.v1.PolicyTag\"T\n\026DeletePolicyTa" +
      "gRequest\022:\n\004name\030\001 \001(\tB,\340A\002\372A&\n$datacata" +
      "log.googleapis.com/PolicyTag\"\205\001\n\026UpdateP" +
      "olicyTagRequest\022:\n\npolicy_tag\030\001 \001(\0132&.go" +
      "ogle.cloud.datacatalog.v1.PolicyTag\022/\n\013u" +
      "pdate_mask\030\002 \001(\0132\032.google.protobuf.Field" +
      "Mask\"|\n\025ListPolicyTagsRequest\022<\n\006parent\030" +
      "\001 \001(\tB,\340A\002\372A&\022$datacatalog.googleapis.co" +
      "m/PolicyTag\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_t" +
      "oken\030\003 \001(\t\"n\n\026ListPolicyTagsResponse\022;\n\013" +
      "policy_tags\030\001 \003(\0132&.google.cloud.datacat" +
      "alog.v1.PolicyTag\022\027\n\017next_page_token\030\002 \001" +
      "(\t\"Q\n\023GetPolicyTagRequest\022:\n\004name\030\001 \001(\tB" +
      ",\340A\002\372A&\n$datacatalog.googleapis.com/Poli" +
      "cyTag2\273\025\n\020PolicyTagManager\022\277\001\n\016CreateTax" +
      "onomy\0222.google.cloud.datacatalog.v1.Crea" +
      "teTaxonomyRequest\032%.google.cloud.datacat" +
      "alog.v1.Taxonomy\"R\332A\017parent,taxonomy\202\323\344\223" +
      "\002:\"./v1/{parent=projects/*/locations/*}/" +
      "taxonomies:\010taxonomy\022\233\001\n\016DeleteTaxonomy\022" +
      "2.google.cloud.datacatalog.v1.DeleteTaxo" +
      "nomyRequest\032\026.google.protobuf.Empty\"=\332A\004" +
      "name\202\323\344\223\0020*./v1/{name=projects/*/locatio" +
      "ns/*/taxonomies/*}\022\301\001\n\016UpdateTaxonomy\0222." +
      "google.cloud.datacatalog.v1.UpdateTaxono" +
      "myRequest\032%.google.cloud.datacatalog.v1." +
      "Taxonomy\"T\332A\010taxonomy\202\323\344\223\002C27/v1/{taxono" +
      "my.name=projects/*/locations/*/taxonomie" +
      "s/*}:\010taxonomy\022\272\001\n\016ListTaxonomies\0222.goog" +
      "le.cloud.datacatalog.v1.ListTaxonomiesRe" +
      "quest\0323.google.cloud.datacatalog.v1.List" +
      "TaxonomiesResponse\"?\332A\006parent\202\323\344\223\0020\022./v1" +
      "/{parent=projects/*/locations/*}/taxonom" +
      "ies\022\244\001\n\013GetTaxonomy\022/.google.cloud.datac" +
      "atalog.v1.GetTaxonomyRequest\032%.google.cl" +
      "oud.datacatalog.v1.Taxonomy\"=\332A\004name\202\323\344\223" +
      "\0020\022./v1/{name=projects/*/locations/*/tax" +
      "onomies/*}\022\323\001\n\017CreatePolicyTag\0223.google." +
      "cloud.datacatalog.v1.CreatePolicyTagRequ" +
      "est\032&.google.cloud.datacatalog.v1.Policy" +
      "Tag\"c\332A\021parent,policy_tag\202\323\344\223\002I\";/v1/{pa" +
      "rent=projects/*/locations/*/taxonomies/*" +
      "}/policyTags:\npolicy_tag\022\252\001\n\017DeletePolic" +
      "yTag\0223.google.cloud.datacatalog.v1.Delet" +
      "ePolicyTagRequest\032\026.google.protobuf.Empt" +
      "y\"J\332A\004name\202\323\344\223\002=*;/v1/{name=projects/*/l" +
      "ocations/*/taxonomies/*/policyTags/*}\022\327\001" +
      "\n\017UpdatePolicyTag\0223.google.cloud.datacat" +
      "alog.v1.UpdatePolicyTagRequest\032&.google." +
      "cloud.datacatalog.v1.PolicyTag\"g\332A\npolic" +
      "y_tag\202\323\344\223\002T2F/v1/{policy_tag.name=projec" +
      "ts/*/locations/*/taxonomies/*/policyTags" +
      "/*}:\npolicy_tag\022\307\001\n\016ListPolicyTags\0222.goo" +
      "gle.cloud.datacatalog.v1.ListPolicyTagsR" +
      "equest\0323.google.cloud.datacatalog.v1.Lis" +
      "tPolicyTagsResponse\"L\332A\006parent\202\323\344\223\002=\022;/v" +
      "1/{parent=projects/*/locations/*/taxonom" +
      "ies/*}/policyTags\022\264\001\n\014GetPolicyTag\0220.goo" +
      "gle.cloud.datacatalog.v1.GetPolicyTagReq" +
      "uest\032&.google.cloud.datacatalog.v1.Polic" +
      "yTag\"J\332A\004name\202\323\344\223\002=\022;/v1/{name=projects/" +
      "*/locations/*/taxonomies/*/policyTags/*}" +
      "\022\352\001\n\014GetIamPolicy\022\".google.iam.v1.GetIam" +
      "PolicyRequest\032\025.google.iam.v1.Policy\"\236\001\202" +
      "\323\344\223\002\227\001\"?/v1/{resource=projects/*/locatio" +
      "ns/*/taxonomies/*}:getIamPolicy:\001*ZQ\"L/v" +
      "1/{resource=projects/*/locations/*/taxon" +
      "omies/*/policyTags/*}:getIamPolicy:\001*\022\352\001" +
      "\n\014SetIamPolicy\022\".google.iam.v1.SetIamPol" +
      "icyRequest\032\025.google.iam.v1.Policy\"\236\001\202\323\344\223" +
      "\002\227\001\"?/v1/{resource=projects/*/locations/" +
      "*/taxonomies/*}:setIamPolicy:\001*ZQ\"L/v1/{" +
      "resource=projects/*/locations/*/taxonomi" +
      "es/*/policyTags/*}:setIamPolicy:\001*\022\226\002\n\022T" +
      "estIamPermissions\022(.google.iam.v1.TestIa" +
      "mPermissionsRequest\032).google.iam.v1.Test" +
      "IamPermissionsResponse\"\252\001\202\323\344\223\002\243\001\"E/v1/{r" +
      "esource=projects/*/locations/*/taxonomie" +
      "s/*}:testIamPermissions:\001*ZW\"R/v1/{resou" +
      "rce=projects/*/locations/*/taxonomies/*/" +
      "policyTags/*}:testIamPermissions:\001*\032N\312A\032" +
      "datacatalog.googleapis.com\322A.https://www" +
      ".googleapis.com/auth/cloud-platformB\335\001\n\037" +
      "com.google.cloud.datacatalog.v1B\025PolicyT" +
      "agManagerProtoP\001ZAcloud.google.com/go/da" +
      "tacatalog/apiv1/datacatalogpb;datacatalo" +
      "gpb\370\001\001\252\002\033Google.Cloud.DataCatalog.V1\312\002\033G" +
      "oogle\\Cloud\\DataCatalog\\V1\352\002\036Google::Clo" +
      "ud::DataCatalog::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.datacatalog.v1.Common.getDescriptor(),
          com.google.cloud.datacatalog.v1.Timestamps.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Taxonomy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "PolicyTagCount", "TaxonomyTimestamps", "ActivatedPolicyTypes", "Service", });
    internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_descriptor =
      internal_static_google_cloud_datacatalog_v1_Taxonomy_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_Taxonomy_Service_descriptor,
        new java.lang.String[] { "Name", "Identity", });
    internal_static_google_cloud_datacatalog_v1_PolicyTag_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datacatalog_v1_PolicyTag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_PolicyTag_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Description", "ParentPolicyTag", "ChildPolicyTags", });
    internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_CreateTaxonomyRequest_descriptor,
        new java.lang.String[] { "Parent", "Taxonomy", });
    internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DeleteTaxonomyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_UpdateTaxonomyRequest_descriptor,
        new java.lang.String[] { "Taxonomy", "UpdateMask", });
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_ListTaxonomiesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", "Filter", });
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_ListTaxonomiesResponse_descriptor,
        new java.lang.String[] { "Taxonomies", "NextPageToken", });
    internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_GetTaxonomyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_CreatePolicyTagRequest_descriptor,
        new java.lang.String[] { "Parent", "PolicyTag", });
    internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_DeletePolicyTagRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_UpdatePolicyTagRequest_descriptor,
        new java.lang.String[] { "PolicyTag", "UpdateMask", });
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_ListPolicyTagsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_ListPolicyTagsResponse_descriptor,
        new java.lang.String[] { "PolicyTags", "NextPageToken", });
    internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_datacatalog_v1_GetPolicyTagRequest_descriptor,
        new java.lang.String[] { "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.datacatalog.v1.Common.getDescriptor();
    com.google.cloud.datacatalog.v1.Timestamps.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
