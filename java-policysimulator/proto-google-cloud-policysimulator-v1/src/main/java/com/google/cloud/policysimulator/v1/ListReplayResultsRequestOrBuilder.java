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
// source: google/cloud/policysimulator/v1/simulator.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.policysimulator.v1;

public interface ListReplayResultsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.policysimulator.v1.ListReplayResultsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [Replay][google.cloud.policysimulator.v1.Replay] whose
   * results are listed, in the following format:
   *
   * `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`
   *
   * Example:
   * `projects/my-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The [Replay][google.cloud.policysimulator.v1.Replay] whose
   * results are listed, in the following format:
   *
   * `{projects|folders|organizations}/{resource-id}/locations/global/replays/{replay-id}`
   *
   * Example:
   * `projects/my-project/locations/global/replays/506a5f7f-38ce-4d7d-8e03-479ce1833c36`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The maximum number of
   * [ReplayResult][google.cloud.policysimulator.v1.ReplayResult] objects to
   * return. Defaults to 5000.
   *
   * The maximum value is 5000; values above 5000 are rounded down to 5000.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * [Simulator.ListReplayResults][google.cloud.policysimulator.v1.Simulator.ListReplayResults]
   * call. Provide this token to retrieve the next page of results.
   *
   * When paginating, all other parameters provided to
   * [Simulator.ListReplayResults[] must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * A page token, received from a previous
   * [Simulator.ListReplayResults][google.cloud.policysimulator.v1.Simulator.ListReplayResults]
   * call. Provide this token to retrieve the next page of results.
   *
   * When paginating, all other parameters provided to
   * [Simulator.ListReplayResults[] must match the call that provided the page
   * token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();
}
