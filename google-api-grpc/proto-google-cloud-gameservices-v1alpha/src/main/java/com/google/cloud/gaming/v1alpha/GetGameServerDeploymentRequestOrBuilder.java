// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

public interface GetGameServerDeploymentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.GetGameServerDeploymentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the game server deployment to retrieve, using the
   * form:
   * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The name of the game server deployment to retrieve, using the
   * form:
   * `projects/{project_id}/locations/{location}/gameServerDeployments/{deployment_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();
}
