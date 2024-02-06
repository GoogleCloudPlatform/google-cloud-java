// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datafusion/v1beta1/v1beta1.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datafusion.v1beta1;

public interface NamespaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datafusion.v1beta1.Namespace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the given namespace.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the given namespace.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * IAM policy associated with this namespace.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
   * @return Whether the iamPolicy field is set.
   */
  boolean hasIamPolicy();
  /**
   * <pre>
   * IAM policy associated with this namespace.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
   * @return The iamPolicy.
   */
  com.google.cloud.datafusion.v1beta1.IAMPolicy getIamPolicy();
  /**
   * <pre>
   * IAM policy associated with this namespace.
   * </pre>
   *
   * <code>.google.cloud.datafusion.v1beta1.IAMPolicy iam_policy = 2;</code>
   */
  com.google.cloud.datafusion.v1beta1.IAMPolicyOrBuilder getIamPolicyOrBuilder();
}
