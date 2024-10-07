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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.deploy.v1;

public interface StandardOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.Standard)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether to verify a deployment.
   * </pre>
   *
   * <code>bool verify = 1;</code>
   *
   * @return The verify.
   */
  boolean getVerify();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job. If this is not configured,
   * predeploy job will not be present.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Predeploy predeploy = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the predeploy field is set.
   */
  boolean hasPredeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job. If this is not configured,
   * predeploy job will not be present.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Predeploy predeploy = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The predeploy.
   */
  com.google.cloud.deploy.v1.Predeploy getPredeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the predeploy job. If this is not configured,
   * predeploy job will not be present.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Predeploy predeploy = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.PredeployOrBuilder getPredeployOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job. If this is not configured,
   * postdeploy job will not be present.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Postdeploy postdeploy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the postdeploy field is set.
   */
  boolean hasPostdeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job. If this is not configured,
   * postdeploy job will not be present.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Postdeploy postdeploy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The postdeploy.
   */
  com.google.cloud.deploy.v1.Postdeploy getPostdeploy();
  /**
   *
   *
   * <pre>
   * Optional. Configuration for the postdeploy job. If this is not configured,
   * postdeploy job will not be present.
   * </pre>
   *
   * <code>
   * .google.cloud.deploy.v1.Postdeploy postdeploy = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.deploy.v1.PostdeployOrBuilder getPostdeployOrBuilder();
}
