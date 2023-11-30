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
// source: google/api/servicecontrol/v2/service_controller.proto

package com.google.api.servicecontrol.v2;

public interface ReportRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v2.ReportRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See
   * [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service)
   * for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The serviceName.
   */
  java.lang.String getServiceName();
  /**
   *
   *
   * <pre>
   * The service name as specified in its service configuration. For example,
   * `"pubsub.googleapis.com"`.
   *
   * See
   * [google.api.Service](https://cloud.google.com/service-management/reference/rpc/google.api#google.api.Service)
   * for the definition of a service name.
   * </pre>
   *
   * <code>string service_name = 1;</code>
   *
   * @return The bytes for serviceName.
   */
  com.google.protobuf.ByteString getServiceNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies the version of the service configuration that should be used to
   * process the request. Must not be empty. Set this field to 'latest' to
   * specify using the latest configuration.
   * </pre>
   *
   * <code>string service_config_id = 2;</code>
   *
   * @return The serviceConfigId.
   */
  java.lang.String getServiceConfigId();
  /**
   *
   *
   * <pre>
   * Specifies the version of the service configuration that should be used to
   * process the request. Must not be empty. Set this field to 'latest' to
   * specify using the latest configuration.
   * </pre>
   *
   * <code>string service_config_id = 2;</code>
   *
   * @return The bytes for serviceConfigId.
   */
  com.google.protobuf.ByteString getServiceConfigIdBytes();

  /**
   *
   *
   * <pre>
   * Describes the list of operations to be reported. Each operation is
   * represented as an AttributeContext, and contains all attributes around an
   * API access.
   * </pre>
   *
   * <code>repeated .google.rpc.context.AttributeContext operations = 3;</code>
   */
  java.util.List<com.google.rpc.context.AttributeContext> getOperationsList();
  /**
   *
   *
   * <pre>
   * Describes the list of operations to be reported. Each operation is
   * represented as an AttributeContext, and contains all attributes around an
   * API access.
   * </pre>
   *
   * <code>repeated .google.rpc.context.AttributeContext operations = 3;</code>
   */
  com.google.rpc.context.AttributeContext getOperations(int index);
  /**
   *
   *
   * <pre>
   * Describes the list of operations to be reported. Each operation is
   * represented as an AttributeContext, and contains all attributes around an
   * API access.
   * </pre>
   *
   * <code>repeated .google.rpc.context.AttributeContext operations = 3;</code>
   */
  int getOperationsCount();
  /**
   *
   *
   * <pre>
   * Describes the list of operations to be reported. Each operation is
   * represented as an AttributeContext, and contains all attributes around an
   * API access.
   * </pre>
   *
   * <code>repeated .google.rpc.context.AttributeContext operations = 3;</code>
   */
  java.util.List<? extends com.google.rpc.context.AttributeContextOrBuilder>
      getOperationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Describes the list of operations to be reported. Each operation is
   * represented as an AttributeContext, and contains all attributes around an
   * API access.
   * </pre>
   *
   * <code>repeated .google.rpc.context.AttributeContext operations = 3;</code>
   */
  com.google.rpc.context.AttributeContextOrBuilder getOperationsOrBuilder(int index);
}
