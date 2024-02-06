// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

public interface GetJSONWebKeysResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.GetJSONWebKeysResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1.Jwk keys = 1;</code>
   */
  java.util.List<com.google.container.v1.Jwk> 
      getKeysList();
  /**
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1.Jwk keys = 1;</code>
   */
  com.google.container.v1.Jwk getKeys(int index);
  /**
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1.Jwk keys = 1;</code>
   */
  int getKeysCount();
  /**
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1.Jwk keys = 1;</code>
   */
  java.util.List<? extends com.google.container.v1.JwkOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <pre>
   * The public component of the keys used by the cluster to sign token
   * requests.
   * </pre>
   *
   * <code>repeated .google.container.v1.Jwk keys = 1;</code>
   */
  com.google.container.v1.JwkOrBuilder getKeysOrBuilder(
      int index);
}
