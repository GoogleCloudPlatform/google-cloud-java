// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orchestration/airflow/service/v1beta1/environments.proto

package com.google.cloud.orchestration.airflow.service.v1beta1;

public interface CreateEnvironmentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1beta1.CreateEnvironmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent must be of the form
   * "projects/{projectId}/locations/{locationId}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent must be of the form
   * "projects/{projectId}/locations/{locationId}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The environment to create.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.Environment environment = 2;</code>
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   * <pre>
   * The environment to create.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.Environment environment = 2;</code>
   * @return The environment.
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.Environment getEnvironment();
  /**
   * <pre>
   * The environment to create.
   * </pre>
   *
   * <code>.google.cloud.orchestration.airflow.service.v1beta1.Environment environment = 2;</code>
   */
  com.google.cloud.orchestration.airflow.service.v1beta1.EnvironmentOrBuilder getEnvironmentOrBuilder();
}
