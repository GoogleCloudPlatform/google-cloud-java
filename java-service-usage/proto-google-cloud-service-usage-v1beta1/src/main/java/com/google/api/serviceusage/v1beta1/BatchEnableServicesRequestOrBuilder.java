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
// source: google/api/serviceusage/v1beta1/serviceusage.proto

// Protobuf Java Version: 3.25.5
package com.google.api.serviceusage.v1beta1;

public interface BatchEnableServicesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.BatchEnableServicesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parent to enable services on.
   *
   * An example name would be:
   * `projects/123`
   * where `123` is the project number (not project ID).
   *
   * The `BatchEnableServices` method currently only supports projects.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Parent to enable services on.
   *
   * An example name would be:
   * `projects/123`
   * where `123` is the project number (not project ID).
   *
   * The `BatchEnableServices` method currently only supports projects.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be:
   * serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   *
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   *
   * @return A list containing the serviceIds.
   */
  java.util.List<java.lang.String> getServiceIdsList();
  /**
   *
   *
   * <pre>
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be:
   * serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   *
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   *
   * @return The count of serviceIds.
   */
  int getServiceIdsCount();
  /**
   *
   *
   * <pre>
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be:
   * serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   *
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The serviceIds at the given index.
   */
  java.lang.String getServiceIds(int index);
  /**
   *
   *
   * <pre>
   * The identifiers of the services to enable on the project.
   *
   * A valid identifier would be:
   * serviceusage.googleapis.com
   *
   * Enabling services requires that each service is public or is shared with
   * the user enabling the service.
   *
   * Two or more services must be specified. To enable a single service,
   * use the `EnableService` method instead.
   *
   * A single request can enable a maximum of 20 services at a time. If more
   * than 20 services are specified, the request will fail, and no state changes
   * will occur.
   * </pre>
   *
   * <code>repeated string service_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the serviceIds at the given index.
   */
  com.google.protobuf.ByteString getServiceIdsBytes(int index);
}
