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
// source: google/devtools/clouddebugger/v2/debugger.proto

// Protobuf Java Version: 3.25.5
package com.google.devtools.clouddebugger.v2;

public interface ListBreakpointsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.ListBreakpointsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of breakpoints matching the request.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
   * are cleared on each breakpoint regardless of its status.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  java.util.List<com.google.devtools.clouddebugger.v2.Breakpoint> getBreakpointsList();
  /**
   *
   *
   * <pre>
   * List of breakpoints matching the request.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
   * are cleared on each breakpoint regardless of its status.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.Breakpoint getBreakpoints(int index);
  /**
   *
   *
   * <pre>
   * List of breakpoints matching the request.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
   * are cleared on each breakpoint regardless of its status.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  int getBreakpointsCount();
  /**
   *
   *
   * <pre>
   * List of breakpoints matching the request.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
   * are cleared on each breakpoint regardless of its status.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  java.util.List<? extends com.google.devtools.clouddebugger.v2.BreakpointOrBuilder>
      getBreakpointsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of breakpoints matching the request.
   * The fields `id` and `location` are guaranteed to be set on each breakpoint.
   * The fields: `stack_frames`, `evaluated_expressions` and `variable_table`
   * are cleared on each breakpoint regardless of its status.
   * </pre>
   *
   * <code>repeated .google.devtools.clouddebugger.v2.Breakpoint breakpoints = 1;</code>
   */
  com.google.devtools.clouddebugger.v2.BreakpointOrBuilder getBreakpointsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A wait token that can be used in the next call to `list` (REST) or
   * `ListBreakpoints` (RPC) to block until the list of breakpoints has changes.
   * </pre>
   *
   * <code>string next_wait_token = 2;</code>
   *
   * @return The nextWaitToken.
   */
  java.lang.String getNextWaitToken();
  /**
   *
   *
   * <pre>
   * A wait token that can be used in the next call to `list` (REST) or
   * `ListBreakpoints` (RPC) to block until the list of breakpoints has changes.
   * </pre>
   *
   * <code>string next_wait_token = 2;</code>
   *
   * @return The bytes for nextWaitToken.
   */
  com.google.protobuf.ByteString getNextWaitTokenBytes();
}
