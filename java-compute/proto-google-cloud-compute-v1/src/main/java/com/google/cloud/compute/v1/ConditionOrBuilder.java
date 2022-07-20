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
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface ConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Condition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Iam enum for the list of possible values.
   * </pre>
   *
   * <code>optional string iam = 104021;</code>
   *
   * @return Whether the iam field is set.
   */
  boolean hasIam();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Iam enum for the list of possible values.
   * </pre>
   *
   * <code>optional string iam = 104021;</code>
   *
   * @return The iam.
   */
  java.lang.String getIam();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Iam enum for the list of possible values.
   * </pre>
   *
   * <code>optional string iam = 104021;</code>
   *
   * @return The bytes for iam.
   */
  com.google.protobuf.ByteString getIamBytes();

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Op enum for the list of possible values.
   * </pre>
   *
   * <code>optional string op = 3553;</code>
   *
   * @return Whether the op field is set.
   */
  boolean hasOp();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Op enum for the list of possible values.
   * </pre>
   *
   * <code>optional string op = 3553;</code>
   *
   * @return The op.
   */
  java.lang.String getOp();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Op enum for the list of possible values.
   * </pre>
   *
   * <code>optional string op = 3553;</code>
   *
   * @return The bytes for op.
   */
  com.google.protobuf.ByteString getOpBytes();

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string svc = 114272;</code>
   *
   * @return Whether the svc field is set.
   */
  boolean hasSvc();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string svc = 114272;</code>
   *
   * @return The svc.
   */
  java.lang.String getSvc();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional string svc = 114272;</code>
   *
   * @return The bytes for svc.
   */
  com.google.protobuf.ByteString getSvcBytes();

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Sys enum for the list of possible values.
   * </pre>
   *
   * <code>optional string sys = 114381;</code>
   *
   * @return Whether the sys field is set.
   */
  boolean hasSys();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Sys enum for the list of possible values.
   * </pre>
   *
   * <code>optional string sys = 114381;</code>
   *
   * @return The sys.
   */
  java.lang.String getSys();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * Check the Sys enum for the list of possible values.
   * </pre>
   *
   * <code>optional string sys = 114381;</code>
   *
   * @return The bytes for sys.
   */
  com.google.protobuf.ByteString getSysBytes();

  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @return A list containing the values.
   */
  java.util.List<java.lang.String> getValuesList();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @return The count of values.
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   *
   *
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>repeated string values = 249928994;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString getValuesBytes(int index);
}
