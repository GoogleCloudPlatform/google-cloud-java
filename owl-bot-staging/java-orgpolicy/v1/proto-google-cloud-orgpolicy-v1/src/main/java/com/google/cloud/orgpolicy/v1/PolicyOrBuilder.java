// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/orgpolicy/v1/orgpolicy.proto

package com.google.cloud.orgpolicy.v1;

public interface PolicyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v1.Policy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Version of the `Policy`. Default version is 0;
   * </pre>
   *
   * <code>int32 version = 1;</code>
   * @return The version.
   */
  int getVersion();

  /**
   * <pre>
   * The name of the `Constraint` the `Policy` is configuring, for example,
   * `constraints/serviceuser.services`.
   * Immutable after creation.
   * </pre>
   *
   * <code>string constraint = 2;</code>
   * @return The constraint.
   */
  java.lang.String getConstraint();
  /**
   * <pre>
   * The name of the `Constraint` the `Policy` is configuring, for example,
   * `constraints/serviceuser.services`.
   * Immutable after creation.
   * </pre>
   *
   * <code>string constraint = 2;</code>
   * @return The bytes for constraint.
   */
  com.google.protobuf.ByteString
      getConstraintBytes();

  /**
   * <pre>
   * An opaque tag indicating the current version of the `Policy`, used for
   * concurrency control.
   * When the `Policy` is returned from either a `GetPolicy` or a
   * `ListOrgPolicy` request, this `etag` indicates the version of the current
   * `Policy` to use when executing a read-modify-write loop.
   * When the `Policy` is returned from a `GetEffectivePolicy` request, the
   * `etag` will be unset.
   * When the `Policy` is used in a `SetOrgPolicy` method, use the `etag` value
   * that was returned from a `GetOrgPolicy` request as part of a
   * read-modify-write loop for concurrency control. Not setting the `etag`in a
   * `SetOrgPolicy` request will result in an unconditional write of the
   * `Policy`.
   * </pre>
   *
   * <code>bytes etag = 3;</code>
   * @return The etag.
   */
  com.google.protobuf.ByteString getEtag();

  /**
   * <pre>
   * The time stamp the `Policy` was previously updated. This is set by the
   * server, not specified by the caller, and represents the last time a call to
   * `SetOrgPolicy` was made for that `Policy`. Any value set by the client will
   * be ignored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * The time stamp the `Policy` was previously updated. This is set by the
   * server, not specified by the caller, and represents the last time a call to
   * `SetOrgPolicy` was made for that `Policy`. Any value set by the client will
   * be ignored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * The time stamp the `Policy` was previously updated. This is set by the
   * server, not specified by the caller, and represents the last time a call to
   * `SetOrgPolicy` was made for that `Policy`. Any value set by the client will
   * be ignored.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   * <pre>
   * List of values either allowed or disallowed.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.ListPolicy list_policy = 5;</code>
   * @return Whether the listPolicy field is set.
   */
  boolean hasListPolicy();
  /**
   * <pre>
   * List of values either allowed or disallowed.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.ListPolicy list_policy = 5;</code>
   * @return The listPolicy.
   */
  com.google.cloud.orgpolicy.v1.Policy.ListPolicy getListPolicy();
  /**
   * <pre>
   * List of values either allowed or disallowed.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.ListPolicy list_policy = 5;</code>
   */
  com.google.cloud.orgpolicy.v1.Policy.ListPolicyOrBuilder getListPolicyOrBuilder();

  /**
   * <pre>
   * For boolean `Constraints`, whether to enforce the `Constraint` or not.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.BooleanPolicy boolean_policy = 6;</code>
   * @return Whether the booleanPolicy field is set.
   */
  boolean hasBooleanPolicy();
  /**
   * <pre>
   * For boolean `Constraints`, whether to enforce the `Constraint` or not.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.BooleanPolicy boolean_policy = 6;</code>
   * @return The booleanPolicy.
   */
  com.google.cloud.orgpolicy.v1.Policy.BooleanPolicy getBooleanPolicy();
  /**
   * <pre>
   * For boolean `Constraints`, whether to enforce the `Constraint` or not.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.BooleanPolicy boolean_policy = 6;</code>
   */
  com.google.cloud.orgpolicy.v1.Policy.BooleanPolicyOrBuilder getBooleanPolicyOrBuilder();

  /**
   * <pre>
   * Restores the default behavior of the constraint; independent of
   * `Constraint` type.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.RestoreDefault restore_default = 7;</code>
   * @return Whether the restoreDefault field is set.
   */
  boolean hasRestoreDefault();
  /**
   * <pre>
   * Restores the default behavior of the constraint; independent of
   * `Constraint` type.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.RestoreDefault restore_default = 7;</code>
   * @return The restoreDefault.
   */
  com.google.cloud.orgpolicy.v1.Policy.RestoreDefault getRestoreDefault();
  /**
   * <pre>
   * Restores the default behavior of the constraint; independent of
   * `Constraint` type.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v1.Policy.RestoreDefault restore_default = 7;</code>
   */
  com.google.cloud.orgpolicy.v1.Policy.RestoreDefaultOrBuilder getRestoreDefaultOrBuilder();

  public com.google.cloud.orgpolicy.v1.Policy.PolicyTypeCase getPolicyTypeCase();
}
