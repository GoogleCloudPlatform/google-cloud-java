/*
 * Copyright 2023 Google LLC
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
// source: google/shopping/merchant/inventories/v1beta/regionalinventory.proto

package com.google.shopping.merchant.inventories.v1beta;

public final class RegionalInventoryProto {
  private RegionalInventoryProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_inventories_v1beta_RegionalInventory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_inventories_v1beta_RegionalInventory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_shopping_merchant_inventories_v1beta_DeleteRegionalInventoryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_shopping_merchant_inventories_v1beta_DeleteRegionalInventoryRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/shopping/merchant/inventories/v"
          + "1beta/regionalinventory.proto\022+google.sh"
          + "opping.merchant.inventories.v1beta\032\034goog"
          + "le/api/annotations.proto\032\027google/api/cli"
          + "ent.proto\032\037google/api/field_behavior.pro"
          + "to\032\031google/api/resource.proto\032\033google/pr"
          + "otobuf/empty.proto\032 google/shopping/type"
          + "/types.proto\032\032google/type/interval.proto"
          + "\"\320\003\n\021RegionalInventory\022\022\n\004name\030\001 \001(\tB\004\342A"
          + "\001\003\022\025\n\007account\030\002 \001(\003B\004\342A\001\003\022\024\n\006region\030\003 \001("
          + "\tB\004\342A\001\002\022*\n\005price\030\004 \001(\0132\033.google.shopping"
          + ".type.Price\022/\n\nsale_price\030\005 \001(\0132\033.google"
          + ".shopping.type.Price\0228\n\031sale_price_effec"
          + "tive_date\030\006 \001(\0132\025.google.type.Interval\022\031"
          + "\n\014availability\030\007 \001(\tH\000\210\001\001\022@\n\021custom_attr"
          + "ibutes\030\010 \003(\0132%.google.shopping.type.Cust"
          + "omAttribute:u\352Ar\n,merchantapi.googleapis"
          + ".com/RegionalInventory\022Baccounts/{accoun"
          + "t}/products/{product}/regionalInventorie"
          + "s/{region}B\017\n\r_availability\"]\n\036ListRegio"
          + "nalInventoriesRequest\022\024\n\006parent\030\001 \001(\tB\004\342"
          + "A\001\002\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"\230\001\n\037ListRegionalInventoriesResponse\022\\"
          + "\n\024regional_inventories\030\001 \003(\0132>.google.sh"
          + "opping.merchant.inventories.v1beta.Regio"
          + "nalInventory\022\027\n\017next_page_token\030\002 \001(\t\"\230\001"
          + "\n\036InsertRegionalInventoryRequest\022\024\n\006pare"
          + "nt\030\001 \001(\tB\004\342A\001\002\022`\n\022regional_inventory\030\002 \001"
          + "(\0132>.google.shopping.merchant.inventorie"
          + "s.v1beta.RegionalInventoryB\004\342A\001\002\"e\n\036Dele"
          + "teRegionalInventoryRequest\022C\n\004name\030\001 \001(\t"
          + "B5\342A\001\002\372A.\n,merchantapi.googleapis.com/Re"
          + "gionalInventory2\337\006\n\030RegionalInventorySer"
          + "vice\022\215\002\n\027ListRegionalInventories\022K.googl"
          + "e.shopping.merchant.inventories.v1beta.L"
          + "istRegionalInventoriesRequest\032L.google.s"
          + "hopping.merchant.inventories.v1beta.List"
          + "RegionalInventoriesResponse\"W\332A\006parent\202\323"
          + "\344\223\002H\022F/inventories/v1beta/{parent=accoun"
          + "ts/*/products/*}/regionalInventories\022\221\002\n"
          + "\027InsertRegionalInventory\022K.google.shoppi"
          + "ng.merchant.inventories.v1beta.InsertReg"
          + "ionalInventoryRequest\032>.google.shopping."
          + "merchant.inventories.v1beta.RegionalInve"
          + "ntory\"i\202\323\344\223\002c\"M/inventories/v1beta/{pare"
          + "nt=accounts/*/products/*}/regionalInvent"
          + "ories:insert:\022regional_inventory\022\325\001\n\027Del"
          + "eteRegionalInventory\022K.google.shopping.m"
          + "erchant.inventories.v1beta.DeleteRegiona"
          + "lInventoryRequest\032\026.google.protobuf.Empt"
          + "y\"U\332A\004name\202\323\344\223\002H*F/inventories/v1beta/{n"
          + "ame=accounts/*/products/*/regionalInvent"
          + "ories/*}\032G\312A\032merchantapi.googleapis.com\322"
          + "A\'https://www.googleapis.com/auth/conten"
          + "tB\244\001\n/com.google.shopping.merchant.inven"
          + "tories.v1betaB\026RegionalInventoryProtoP\001Z"
          + "Wcloud.google.com/go/shopping/merchant/i"
          + "nventories/apiv1beta/inventoriespb;inven"
          + "toriespbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.shopping.type.TypesProto.getDescriptor(),
              com.google.type.IntervalProto.getDescriptor(),
            });
    internal_static_google_shopping_merchant_inventories_v1beta_RegionalInventory_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_shopping_merchant_inventories_v1beta_RegionalInventory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_inventories_v1beta_RegionalInventory_descriptor,
            new java.lang.String[] {
              "Name",
              "Account",
              "Region",
              "Price",
              "SalePrice",
              "SalePriceEffectiveDate",
              "Availability",
              "CustomAttributes",
              "Availability",
            });
    internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_inventories_v1beta_ListRegionalInventoriesResponse_descriptor,
            new java.lang.String[] {
              "RegionalInventories", "NextPageToken",
            });
    internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_inventories_v1beta_InsertRegionalInventoryRequest_descriptor,
            new java.lang.String[] {
              "Parent", "RegionalInventory",
            });
    internal_static_google_shopping_merchant_inventories_v1beta_DeleteRegionalInventoryRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_shopping_merchant_inventories_v1beta_DeleteRegionalInventoryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_shopping_merchant_inventories_v1beta_DeleteRegionalInventoryRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.shopping.type.TypesProto.getDescriptor();
    com.google.type.IntervalProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
