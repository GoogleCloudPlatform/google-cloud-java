// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface RuleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Rule)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Action enum for the list of possible values.
   * </pre>
   *
   * <code>optional string action = 187661878;</code>
   * @return Whether the action field is set.
   */
  boolean hasAction();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Action enum for the list of possible values.
   * </pre>
   *
   * <code>optional string action = 187661878;</code>
   * @return The action.
   */
  java.lang.String getAction();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Action enum for the list of possible values.
   * </pre>
   *
   * <code>optional string action = 187661878;</code>
   * @return The bytes for action.
   */
  com.google.protobuf.ByteString
      getActionBytes();

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Condition> 
      getConditionsList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  com.google.cloud.compute.v1.Condition getConditions(int index);
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  int getConditionsCount();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ConditionOrBuilder> 
      getConditionsOrBuilderList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Condition conditions = 142882488;</code>
   */
  com.google.cloud.compute.v1.ConditionOrBuilder getConditionsOrBuilder(
      int index);

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string description = 422937596;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   * @return A list containing the ins.
   */
  java.util.List<java.lang.String>
      getInsList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   * @return The count of ins.
   */
  int getInsCount();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   * @param index The index of the element to return.
   * @return The ins at the given index.
   */
  java.lang.String getIns(int index);
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string ins = 104430;</code>
   * @param index The index of the value to return.
   * @return The bytes of the ins at the given index.
   */
  com.google.protobuf.ByteString
      getInsBytes(int index);

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  java.util.List<com.google.cloud.compute.v1.LogConfig> 
      getLogConfigsList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  com.google.cloud.compute.v1.LogConfig getLogConfigs(int index);
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  int getLogConfigsCount();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.LogConfigOrBuilder> 
      getLogConfigsOrBuilderList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.LogConfig log_configs = 152873846;</code>
   */
  com.google.cloud.compute.v1.LogConfigOrBuilder getLogConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   * @return A list containing the notIns.
   */
  java.util.List<java.lang.String>
      getNotInsList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   * @return The count of notIns.
   */
  int getNotInsCount();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   * @param index The index of the element to return.
   * @return The notIns at the given index.
   */
  java.lang.String getNotIns(int index);
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string not_ins = 518443138;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notIns at the given index.
   */
  com.google.protobuf.ByteString
      getNotInsBytes(int index);

  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   * @return A list containing the permissions.
   */
  java.util.List<java.lang.String>
      getPermissionsList();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   * @return The count of permissions.
   */
  int getPermissionsCount();
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   * @param index The index of the element to return.
   * @return The permissions at the given index.
   */
  java.lang.String getPermissions(int index);
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string permissions = 59962500;</code>
   * @param index The index of the value to return.
   * @return The bytes of the permissions at the given index.
   */
  com.google.protobuf.ByteString
      getPermissionsBytes(int index);
}
