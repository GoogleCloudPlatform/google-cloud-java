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
// source: google/shopping/merchant/lfp/v1beta/lfpsale.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.lfp.v1beta;

public final class LfpSaleProto {
  private LfpSaleProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_LfpSale_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_LfpSale_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpSaleRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpSaleRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/shopping/merchant/lfp/v1beta/lf"
          + "psale.proto\022#google.shopping.merchant.lf"
          + "p.v1beta\032\034google/api/annotations.proto\032\027"
          + "google/api/client.proto\032\037google/api/fiel"
          + "d_behavior.proto\032\033google/api/field_info."
          + "proto\032\031google/api/resource.proto\032\037google"
          + "/protobuf/timestamp.proto\032 google/shoppi"
          + "ng/type/types.proto\"\350\003\n\007LfpSale\022\024\n\004name\030"
          + "\001 \001(\tB\006\340A\003\340A\010\022\033\n\016target_account\030\002 \001(\003B\003\340"
          + "A\002\022\027\n\nstore_code\030\003 \001(\tB\003\340A\002\022\025\n\010offer_id\030"
          + "\004 \001(\tB\003\340A\002\022\030\n\013region_code\030\005 \001(\tB\003\340A\002\022\035\n\020"
          + "content_language\030\006 \001(\tB\003\340A\002\022\021\n\004gtin\030\007 \001("
          + "\tB\003\340A\002\022/\n\005price\030\010 \001(\0132\033.google.shopping."
          + "type.PriceB\003\340A\002\022\025\n\010quantity\030\t \001(\003B\003\340A\002\0222"
          + "\n\tsale_time\030\n \001(\0132\032.google.protobuf.Time"
          + "stampB\003\340A\002\022\035\n\003uid\030\013 \001(\tB\013\340A\003\342\214\317\327\010\002\010\001H\000\210\001"
          + "\001\022\034\n\nfeed_label\030\014 \001(\tB\003\340A\001H\001\210\001\001:^\352A[\n\"me"
          + "rchantapi.googleapis.com/LfpSale\022\"accoun"
          + "ts/{account}/lfpSales/{sale}*\010lfpSales2\007"
          + "lfpSaleB\006\n\004_uidB\r\n\013_feed_label\"p\n\024Insert"
          + "LfpSaleRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022C\n\010l"
          + "fp_sale\030\002 \001(\0132,.google.shopping.merchant"
          + ".lfp.v1beta.LfpSaleB\003\340A\0022\227\002\n\016LfpSaleServ"
          + "ice\022\273\001\n\rInsertLfpSale\0229.google.shopping."
          + "merchant.lfp.v1beta.InsertLfpSaleRequest"
          + "\032,.google.shopping.merchant.lfp.v1beta.L"
          + "fpSale\"A\202\323\344\223\002;\"//lfp/v1beta/{parent=acco"
          + "unts/*}/lfpSales:insert:\010lfp_sale\032G\312A\032me"
          + "rchantapi.googleapis.com\322A\'https://www.g"
          + "oogleapis.com/auth/contentBz\n\'com.google"
          + ".shopping.merchant.lfp.v1betaB\014LfpSalePr"
          + "otoP\001Z?cloud.google.com/go/shopping/merc"
          + "hant/lfp/apiv1beta/lfppb;lfppbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_lfp_v1beta_LfpSale_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_lfp_v1beta_LfpSale_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_LfpSale_descriptor,
            new java.lang.String[] {
              "Name",
              "TargetAccount",
              "StoreCode",
              "OfferId",
              "RegionCode",
              "ContentLanguage",
              "Gtin",
              "Price",
              "Quantity",
              "SaleTime",
              "Uid",
              "FeedLabel",
            });
    internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpSaleRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpSaleRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_lfp_v1beta_InsertLfpSaleRequest_descriptor,
            new java.lang.String[] {
              "Parent", "LfpSale",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
