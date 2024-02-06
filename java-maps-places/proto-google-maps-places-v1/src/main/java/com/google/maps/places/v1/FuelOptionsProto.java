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
// source: google/maps/places/v1/fuel_options.proto

// Protobuf Java Version: 3.25.2
package com.google.maps.places.v1;

public final class FuelOptionsProto {
  private FuelOptionsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_FuelOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_FuelOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_FuelOptions_FuelPrice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_FuelOptions_FuelPrice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/maps/places/v1/fuel_options.pro"
          + "to\022\025google.maps.places.v1\032\037google/protob"
          + "uf/timestamp.proto\032\027google/type/money.pr"
          + "oto\"\377\003\n\013FuelOptions\022A\n\013fuel_prices\030\001 \003(\013"
          + "2,.google.maps.places.v1.FuelOptions.Fue"
          + "lPrice\032\254\003\n\tFuelPrice\022C\n\004type\030\001 \001(\01625.goo"
          + "gle.maps.places.v1.FuelOptions.FuelPrice"
          + ".FuelType\022!\n\005price\030\002 \001(\0132\022.google.type.M"
          + "oney\022/\n\013update_time\030\003 \001(\0132\032.google.proto"
          + "buf.Timestamp\"\205\002\n\010FuelType\022\031\n\025FUEL_TYPE_"
          + "UNSPECIFIED\020\000\022\n\n\006DIESEL\020\001\022\024\n\020REGULAR_UNL"
          + "EADED\020\002\022\014\n\010MIDGRADE\020\003\022\013\n\007PREMIUM\020\004\022\010\n\004SP"
          + "91\020\005\022\014\n\010SP91_E10\020\006\022\010\n\004SP92\020\007\022\010\n\004SP95\020\010\022\014"
          + "\n\010SP95_E10\020\t\022\010\n\004SP98\020\n\022\010\n\004SP99\020\013\022\t\n\005SP10"
          + "0\020\014\022\007\n\003LPG\020\r\022\007\n\003E80\020\016\022\007\n\003E85\020\017\022\013\n\007METHAN"
          + "E\020\020\022\016\n\nBIO_DIESEL\020\021\022\020\n\014TRUCK_DIESEL\020\022B\244\001"
          + "\n\031com.google.maps.places.v1B\020FuelOptions"
          + "ProtoP\001Z7cloud.google.com/go/maps/places"
          + "/apiv1/placespb;placespb\370\001\001\242\002\006GMPSV1\252\002\025G"
          + "oogle.Maps.Places.V1\312\002\025Google\\Maps\\Place"
          + "s\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_FuelOptions_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_FuelOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_FuelOptions_descriptor,
            new java.lang.String[] {
              "FuelPrices",
            });
    internal_static_google_maps_places_v1_FuelOptions_FuelPrice_descriptor =
        internal_static_google_maps_places_v1_FuelOptions_descriptor.getNestedTypes().get(0);
    internal_static_google_maps_places_v1_FuelOptions_FuelPrice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_FuelOptions_FuelPrice_descriptor,
            new java.lang.String[] {
              "Type", "Price", "UpdateTime",
            });
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
