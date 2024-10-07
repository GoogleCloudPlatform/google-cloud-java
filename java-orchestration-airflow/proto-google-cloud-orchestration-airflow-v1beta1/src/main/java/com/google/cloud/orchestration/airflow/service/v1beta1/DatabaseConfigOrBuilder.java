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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface DatabaseConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.DatabaseConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Cloud SQL machine type used by Airflow database.
   * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
   * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
   * Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * Optional. Cloud SQL machine type used by Airflow database.
   * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
   * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
   * Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine zone where the Airflow database is created. If
   * zone is provided, it must be in the region selected for the environment. If
   * zone is not provided, a zone is automatically selected. The zone can only
   * be set during environment creation. Supported for Cloud Composer
   * environments in versions composer-2.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine zone where the Airflow database is created. If
   * zone is provided, it must be in the region selected for the environment. If
   * zone is not provided, a zone is automatically selected. The zone can only
   * be set during environment creation. Supported for Cloud Composer
   * environments in versions composer-2.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
