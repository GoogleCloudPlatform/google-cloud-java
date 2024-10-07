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
// source: google/cloud/dialogflow/cx/v3beta1/import_strategy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.dialogflow.cx.v3beta1;

public final class ImportStrategyProto {
  private ImportStrategyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/dialogflow/cx/v3beta1/imp"
          + "ort_strategy.proto\022\"google.cloud.dialogf"
          + "low.cx.v3beta1*\304\001\n\016ImportStrategy\022\037\n\033IMP"
          + "ORT_STRATEGY_UNSPECIFIED\020\000\022\036\n\032IMPORT_STR"
          + "ATEGY_CREATE_NEW\020\001\022\033\n\027IMPORT_STRATEGY_RE"
          + "PLACE\020\002\022\030\n\024IMPORT_STRATEGY_KEEP\020\003\022\031\n\025IMP"
          + "ORT_STRATEGY_MERGE\020\004\022\037\n\033IMPORT_STRATEGY_"
          + "THROW_ERROR\020\005B\315\001\n&com.google.cloud.dialo"
          + "gflow.cx.v3beta1B\023ImportStrategyProtoP\001Z"
          + "6cloud.google.com/go/dialogflow/cx/apiv3"
          + "beta1/cxpb;cxpb\370\001\001\242\002\002DF\252\002\"Google.Cloud.D"
          + "ialogflow.Cx.V3Beta1\352\002&Google::Cloud::Di"
          + "alogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
