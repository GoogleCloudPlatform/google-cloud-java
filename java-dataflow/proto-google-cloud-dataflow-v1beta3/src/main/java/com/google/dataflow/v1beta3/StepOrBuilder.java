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
// source: google/dataflow/v1beta3/jobs.proto

package com.google.dataflow.v1beta3;

public interface StepOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.Step)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The kind of step in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   *
   *
   * <pre>
   * The kind of step in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string kind = 1;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The name that identifies the step. This must be unique for each
   * step with respect to all other steps in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The name that identifies the step. This must be unique for each
   * step with respect to all other steps in the Cloud Dataflow job.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Named properties associated with the step. Each kind of
   * predefined step has its own required set of properties.
   * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 3;</code>
   *
   * @return Whether the properties field is set.
   */
  boolean hasProperties();
  /**
   *
   *
   * <pre>
   * Named properties associated with the step. Each kind of
   * predefined step has its own required set of properties.
   * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 3;</code>
   *
   * @return The properties.
   */
  com.google.protobuf.Struct getProperties();
  /**
   *
   *
   * <pre>
   * Named properties associated with the step. Each kind of
   * predefined step has its own required set of properties.
   * Must be provided on Create.  Only retrieved with JOB_VIEW_ALL.
   * </pre>
   *
   * <code>.google.protobuf.Struct properties = 3;</code>
   */
  com.google.protobuf.StructOrBuilder getPropertiesOrBuilder();
}
