/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1beta1/accelerator_type.proto

package com.google.cloud.aiplatform.v1beta1;

public final class AcceleratorTypeProto {
  private AcceleratorTypeProto() {}

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
      "\n6google/cloud/aiplatform/v1beta1/accele"
          + "rator_type.proto\022\037google.cloud.aiplatfor"
          + "m.v1beta1*\320\001\n\017AcceleratorType\022 \n\034ACCELER"
          + "ATOR_TYPE_UNSPECIFIED\020\000\022\024\n\020NVIDIA_TESLA_"
          + "K80\020\001\022\025\n\021NVIDIA_TESLA_P100\020\002\022\025\n\021NVIDIA_T"
          + "ESLA_V100\020\003\022\023\n\017NVIDIA_TESLA_P4\020\004\022\023\n\017NVID"
          + "IA_TESLA_T4\020\005\022\025\n\021NVIDIA_TESLA_A100\020\010\022\n\n\006"
          + "TPU_V2\020\006\022\n\n\006TPU_V3\020\007B\361\001\n#com.google.clou"
          + "d.aiplatform.v1beta1B\024AcceleratorTypePro"
          + "toP\001ZIgoogle.golang.org/genproto/googlea"
          + "pis/cloud/aiplatform/v1beta1;aiplatform\252"
          + "\002\037Google.Cloud.AIPlatform.V1Beta1\312\002\037Goog"
          + "le\\Cloud\\AIPlatform\\V1beta1\352\002\"Google::Cl"
          + "oud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
  }

  // @@protoc_insertion_point(outer_class_scope)
}
