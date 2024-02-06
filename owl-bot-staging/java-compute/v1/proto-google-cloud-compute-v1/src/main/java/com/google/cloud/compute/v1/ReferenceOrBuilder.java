// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Reference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#reference for references.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#reference for references.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#reference for references.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
   * </pre>
   *
   * <code>optional string reference_type = 247521198;</code>
   * @return Whether the referenceType field is set.
   */
  boolean hasReferenceType();
  /**
   * <pre>
   * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
   * </pre>
   *
   * <code>optional string reference_type = 247521198;</code>
   * @return The referenceType.
   */
  java.lang.String getReferenceType();
  /**
   * <pre>
   * A description of the reference type with no implied semantics. Possible values include: 1. MEMBER_OF 
   * </pre>
   *
   * <code>optional string reference_type = 247521198;</code>
   * @return The bytes for referenceType.
   */
  com.google.protobuf.ByteString
      getReferenceTypeBytes();

  /**
   * <pre>
   * URL of the resource which refers to the target.
   * </pre>
   *
   * <code>optional string referrer = 351173663;</code>
   * @return Whether the referrer field is set.
   */
  boolean hasReferrer();
  /**
   * <pre>
   * URL of the resource which refers to the target.
   * </pre>
   *
   * <code>optional string referrer = 351173663;</code>
   * @return The referrer.
   */
  java.lang.String getReferrer();
  /**
   * <pre>
   * URL of the resource which refers to the target.
   * </pre>
   *
   * <code>optional string referrer = 351173663;</code>
   * @return The bytes for referrer.
   */
  com.google.protobuf.ByteString
      getReferrerBytes();

  /**
   * <pre>
   * URL of the resource to which this reference points.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return Whether the target field is set.
   */
  boolean hasTarget();
  /**
   * <pre>
   * URL of the resource to which this reference points.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   * <pre>
   * URL of the resource to which this reference points.
   * </pre>
   *
   * <code>optional string target = 192835985;</code>
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString
      getTargetBytes();
}
