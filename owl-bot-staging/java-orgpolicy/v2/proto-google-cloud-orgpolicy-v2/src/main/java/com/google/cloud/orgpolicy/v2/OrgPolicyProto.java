// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

package com.google.cloud.orgpolicy.v2;

public final class OrgPolicyProto {
  private OrgPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_Policy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_Policy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_PolicySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_StringValues_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_StringValues_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_ListConstraintsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_ListConstraintsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_ListPoliciesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_ListPoliciesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_ListPoliciesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_ListPoliciesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_GetPolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_GetPolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_GetEffectivePolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_GetEffectivePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_orgpolicy_v2_DeletePolicyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_orgpolicy_v2_DeletePolicyRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)google/cloud/orgpolicy/v2/orgpolicy.pr" +
      "oto\022\031google.cloud.orgpolicy.v2\032\034google/a" +
      "pi/annotations.proto\032\027google/api/client." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\032*google/cloud/" +
      "orgpolicy/v2/constraint.proto\032\033google/pr" +
      "otobuf/empty.proto\032 google/protobuf/fiel" +
      "d_mask.proto\032\037google/protobuf/timestamp." +
      "proto\032\026google/type/expr.proto\"\366\002\n\006Policy" +
      "\022\021\n\004name\030\001 \001(\tB\003\340A\005\0223\n\004spec\030\002 \001(\0132%.goog" +
      "le.cloud.orgpolicy.v2.PolicySpec\022E\n\talte" +
      "rnate\030\003 \001(\0132..google.cloud.orgpolicy.v2." +
      "AlternatePolicySpecB\002\030\001\022;\n\014dry_run_spec\030" +
      "\004 \001(\0132%.google.cloud.orgpolicy.v2.Policy" +
      "Spec:\237\001\352A\233\001\n\037orgpolicy.googleapis.com/Po" +
      "licy\022$projects/{project}/policies/{polic" +
      "y}\022\"folders/{folder}/policies/{policy}\022." +
      "organizations/{organization}/policies/{p" +
      "olicy}\"Z\n\023AlternatePolicySpec\022\016\n\006launch\030" +
      "\001 \001(\t\0223\n\004spec\030\002 \001(\0132%.google.cloud.orgpo" +
      "licy.v2.PolicySpec\"\306\003\n\nPolicySpec\022\014\n\004eta" +
      "g\030\001 \001(\t\0224\n\013update_time\030\002 \001(\0132\032.google.pr" +
      "otobuf.TimestampB\003\340A\003\022?\n\005rules\030\003 \003(\01320.g" +
      "oogle.cloud.orgpolicy.v2.PolicySpec.Poli" +
      "cyRule\022\033\n\023inherit_from_parent\030\004 \001(\010\022\r\n\005r" +
      "eset\030\005 \001(\010\032\206\002\n\nPolicyRule\022O\n\006values\030\001 \001(" +
      "\0132=.google.cloud.orgpolicy.v2.PolicySpec" +
      ".PolicyRule.StringValuesH\000\022\023\n\tallow_all\030" +
      "\002 \001(\010H\000\022\022\n\010deny_all\030\003 \001(\010H\000\022\021\n\007enforce\030\004" +
      " \001(\010H\000\022$\n\tcondition\030\005 \001(\0132\021.google.type." +
      "Expr\032=\n\014StringValues\022\026\n\016allowed_values\030\001" +
      " \003(\t\022\025\n\rdenied_values\030\002 \003(\tB\006\n\004kind\"|\n\026L" +
      "istConstraintsRequest\022;\n\006parent\030\001 \001(\tB+\340" +
      "A\002\372A%\022#orgpolicy.googleapis.com/Constrai" +
      "nt\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(" +
      "\t\"n\n\027ListConstraintsResponse\022:\n\013constrai" +
      "nts\030\001 \003(\0132%.google.cloud.orgpolicy.v2.Co" +
      "nstraint\022\027\n\017next_page_token\030\002 \001(\t\"u\n\023Lis" +
      "tPoliciesRequest\0227\n\006parent\030\001 \001(\tB\'\340A\002\372A!" +
      "\022\037orgpolicy.googleapis.com/Policy\022\021\n\tpag" +
      "e_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"d\n\024List" +
      "PoliciesResponse\0223\n\010policies\030\001 \003(\0132!.goo" +
      "gle.cloud.orgpolicy.v2.Policy\022\027\n\017next_pa" +
      "ge_token\030\002 \001(\t\"I\n\020GetPolicyRequest\0225\n\004na" +
      "me\030\001 \001(\tB\'\340A\002\372A!\n\037orgpolicy.googleapis.c" +
      "om/Policy\"R\n\031GetEffectivePolicyRequest\0225" +
      "\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037orgpolicy.googleap" +
      "is.com/Policy\"\206\001\n\023CreatePolicyRequest\0227\n" +
      "\006parent\030\001 \001(\tB\'\340A\002\372A!\022\037orgpolicy.googlea" +
      "pis.com/Policy\0226\n\006policy\030\003 \001(\0132!.google." +
      "cloud.orgpolicy.v2.PolicyB\003\340A\002\"~\n\023Update" +
      "PolicyRequest\0226\n\006policy\030\001 \001(\0132!.google.c" +
      "loud.orgpolicy.v2.PolicyB\003\340A\002\022/\n\013update_" +
      "mask\030\003 \001(\0132\032.google.protobuf.FieldMask\"L" +
      "\n\023DeletePolicyRequest\0225\n\004name\030\001 \001(\tB\'\340A\002" +
      "\372A!\n\037orgpolicy.googleapis.com/Policy2\275\016\n" +
      "\tOrgPolicy\022\201\002\n\017ListConstraints\0221.google." +
      "cloud.orgpolicy.v2.ListConstraintsReques" +
      "t\0322.google.cloud.orgpolicy.v2.ListConstr" +
      "aintsResponse\"\206\001\202\323\344\223\002w\022#/v2/{parent=proj" +
      "ects/*}/constraintsZ$\022\"/v2/{parent=folde" +
      "rs/*}/constraintsZ*\022(/v2/{parent=organiz" +
      "ations/*}/constraints\332A\006parent\022\356\001\n\014ListP" +
      "olicies\022..google.cloud.orgpolicy.v2.List" +
      "PoliciesRequest\032/.google.cloud.orgpolicy" +
      ".v2.ListPoliciesResponse\"}\202\323\344\223\002n\022 /v2/{p" +
      "arent=projects/*}/policiesZ!\022\037/v2/{paren" +
      "t=folders/*}/policiesZ\'\022%/v2/{parent=org" +
      "anizations/*}/policies\332A\006parent\022\330\001\n\tGetP" +
      "olicy\022+.google.cloud.orgpolicy.v2.GetPol" +
      "icyRequest\032!.google.cloud.orgpolicy.v2.P" +
      "olicy\"{\202\323\344\223\002n\022 /v2/{name=projects/*/poli" +
      "cies/*}Z!\022\037/v2/{name=folders/*/policies/" +
      "*}Z\'\022%/v2/{name=organizations/*/policies" +
      "/*}\332A\004name\022\245\002\n\022GetEffectivePolicy\0224.goog" +
      "le.cloud.orgpolicy.v2.GetEffectivePolicy" +
      "Request\032!.google.cloud.orgpolicy.v2.Poli" +
      "cy\"\265\001\202\323\344\223\002\247\001\0223/v2/{name=projects/*/polic" +
      "ies/*}:getEffectivePolicyZ4\0222/v2/{name=f" +
      "olders/*/policies/*}:getEffectivePolicyZ" +
      ":\0228/v2/{name=organizations/*/policies/*}" +
      ":getEffectivePolicy\332A\004name\022\201\002\n\014CreatePol" +
      "icy\022..google.cloud.orgpolicy.v2.CreatePo" +
      "licyRequest\032!.google.cloud.orgpolicy.v2." +
      "Policy\"\235\001\202\323\344\223\002\206\001\" /v2/{parent=projects/*" +
      "}/policies:\006policyZ)\"\037/v2/{parent=folder" +
      "s/*}/policies:\006policyZ/\"%/v2/{parent=org" +
      "anizations/*}/policies:\006policy\332A\rparent," +
      "policy\022\217\002\n\014UpdatePolicy\022..google.cloud.o" +
      "rgpolicy.v2.UpdatePolicyRequest\032!.google" +
      ".cloud.orgpolicy.v2.Policy\"\253\001\202\323\344\223\002\233\0012\'/v" +
      "2/{policy.name=projects/*/policies/*}:\006p" +
      "olicyZ02&/v2/{policy.name=folders/*/poli" +
      "cies/*}:\006policyZ62,/v2/{policy.name=orga" +
      "nizations/*/policies/*}:\006policy\332A\006policy" +
      "\022\323\001\n\014DeletePolicy\022..google.cloud.orgpoli" +
      "cy.v2.DeletePolicyRequest\032\026.google.proto" +
      "buf.Empty\"{\202\323\344\223\002n* /v2/{name=projects/*/" +
      "policies/*}Z!*\037/v2/{name=folders/*/polic" +
      "ies/*}Z\'*%/v2/{name=organizations/*/poli" +
      "cies/*}\332A\004name\032L\312A\030orgpolicy.googleapis." +
      "com\322A.https://www.googleapis.com/auth/cl" +
      "oud-platformB\305\001\n\035com.google.cloud.orgpol" +
      "icy.v2B\016OrgPolicyProtoP\001Z;cloud.google.c" +
      "om/go/orgpolicy/apiv2/orgpolicypb;orgpol" +
      "icypb\252\002\031Google.Cloud.OrgPolicy.V2\312\002\031Goog" +
      "le\\Cloud\\OrgPolicy\\V2\352\002\034Google::Cloud::O" +
      "rgPolicy::V2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.orgpolicy.v2.ConstraintProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.type.ExprProto.getDescriptor(),
        });
    internal_static_google_cloud_orgpolicy_v2_Policy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_Policy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_Policy_descriptor,
        new java.lang.String[] { "Name", "Spec", "Alternate", "DryRunSpec", });
    internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_descriptor,
        new java.lang.String[] { "Launch", "Spec", });
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_PolicySpec_descriptor,
        new java.lang.String[] { "Etag", "UpdateTime", "Rules", "InheritFromParent", "Reset", });
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_descriptor =
      internal_static_google_cloud_orgpolicy_v2_PolicySpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_descriptor,
        new java.lang.String[] { "Values", "AllowAll", "DenyAll", "Enforce", "Condition", "Kind", });
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_StringValues_descriptor =
      internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_StringValues_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_PolicySpec_PolicyRule_StringValues_descriptor,
        new java.lang.String[] { "AllowedValues", "DeniedValues", });
    internal_static_google_cloud_orgpolicy_v2_ListConstraintsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_orgpolicy_v2_ListConstraintsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_ListConstraintsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_ListConstraintsResponse_descriptor,
        new java.lang.String[] { "Constraints", "NextPageToken", });
    internal_static_google_cloud_orgpolicy_v2_ListPoliciesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_orgpolicy_v2_ListPoliciesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_ListPoliciesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_orgpolicy_v2_ListPoliciesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_orgpolicy_v2_ListPoliciesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_ListPoliciesResponse_descriptor,
        new java.lang.String[] { "Policies", "NextPageToken", });
    internal_static_google_cloud_orgpolicy_v2_GetPolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_orgpolicy_v2_GetPolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_GetPolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_orgpolicy_v2_GetEffectivePolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_orgpolicy_v2_GetEffectivePolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_GetEffectivePolicyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_CreatePolicyRequest_descriptor,
        new java.lang.String[] { "Parent", "Policy", });
    internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_UpdatePolicyRequest_descriptor,
        new java.lang.String[] { "Policy", "UpdateMask", });
    internal_static_google_cloud_orgpolicy_v2_DeletePolicyRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_orgpolicy_v2_DeletePolicyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_orgpolicy_v2_DeletePolicyRequest_descriptor,
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
    com.google.cloud.orgpolicy.v2.ConstraintProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.ExprProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
