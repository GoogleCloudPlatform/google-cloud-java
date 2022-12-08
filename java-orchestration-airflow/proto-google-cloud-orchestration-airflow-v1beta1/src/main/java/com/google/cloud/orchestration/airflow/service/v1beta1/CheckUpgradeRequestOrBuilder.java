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
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface CheckUpgradeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.CheckUpgradeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the environment to check upgrade for, in the
   * form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The environment.
   */
  java.lang.String getEnvironment();
  /**
   *
   *
   * <pre>
   * The resource name of the environment to check upgrade for, in the
   * form:
   * "projects/{projectId}/locations/{locationId}/environments/{environmentId}"
   * </pre>
   *
   * <code>string environment = 1;</code>
   *
   * @return The bytes for environment.
   */
  com.google.protobuf.ByteString getEnvironmentBytes();

  /**
   *
   *
   * <pre>
   * The version of the software running in the environment.
   * This encapsulates both the version of Cloud Composer functionality and the
   * version of Apache Airflow. It must match the regular expression
   * `composer-([0-9]+(&#92;.[0-9]+&#92;.[0-9]+(-preview&#92;.[0-9]+)?)?|latest)-airflow-([0-9]+(&#92;.[0-9]+(&#92;.[0-9]+)?)?)`.
   * When used as input, the server also checks if the provided version is
   * supported and denies the request for an unsupported version.
   * The Cloud Composer portion of the image version is a full
   * [semantic version](https://semver.org), or an alias in the form of major
   * version number or `latest`. When an alias is provided, the server replaces
   * it with the current Cloud Composer version that satisfies the alias.
   * The Apache Airflow portion of the image version is a full semantic version
   * that points to one of the supported Apache Airflow versions, or an alias in
   * the form of only major or major.minor versions specified. When an alias is
   * provided, the server replaces it with the latest Apache Airflow version
   * that satisfies the alias and is supported in the given Cloud Composer
   * version.
   * In all cases, the resolved image version is stored in the same field.
   * See also [version
   * list](/composer/docs/concepts/versioning/composer-versions) and [versioning
   * overview](/composer/docs/concepts/versioning/composer-versioning-overview).
   * </pre>
   *
   * <code>string image_version = 2;</code>
   *
   * @return The imageVersion.
   */
  java.lang.String getImageVersion();
  /**
   *
   *
   * <pre>
   * The version of the software running in the environment.
   * This encapsulates both the version of Cloud Composer functionality and the
   * version of Apache Airflow. It must match the regular expression
   * `composer-([0-9]+(&#92;.[0-9]+&#92;.[0-9]+(-preview&#92;.[0-9]+)?)?|latest)-airflow-([0-9]+(&#92;.[0-9]+(&#92;.[0-9]+)?)?)`.
   * When used as input, the server also checks if the provided version is
   * supported and denies the request for an unsupported version.
   * The Cloud Composer portion of the image version is a full
   * [semantic version](https://semver.org), or an alias in the form of major
   * version number or `latest`. When an alias is provided, the server replaces
   * it with the current Cloud Composer version that satisfies the alias.
   * The Apache Airflow portion of the image version is a full semantic version
   * that points to one of the supported Apache Airflow versions, or an alias in
   * the form of only major or major.minor versions specified. When an alias is
   * provided, the server replaces it with the latest Apache Airflow version
   * that satisfies the alias and is supported in the given Cloud Composer
   * version.
   * In all cases, the resolved image version is stored in the same field.
   * See also [version
   * list](/composer/docs/concepts/versioning/composer-versions) and [versioning
   * overview](/composer/docs/concepts/versioning/composer-versioning-overview).
   * </pre>
   *
   * <code>string image_version = 2;</code>
   *
   * @return The bytes for imageVersion.
   */
  com.google.protobuf.ByteString getImageVersionBytes();
}
