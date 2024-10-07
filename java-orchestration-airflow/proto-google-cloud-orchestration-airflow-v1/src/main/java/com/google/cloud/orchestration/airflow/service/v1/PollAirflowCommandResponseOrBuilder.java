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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.orchestration.airflow.service.v1;

public interface PollAirflowCommandResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output from the command execution. It may not contain the full output
   * and the caller may need to poll for more lines.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line output = 1;
   * </code>
   */
  java.util.List<com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line>
      getOutputList();
  /**
   *
   *
   * <pre>
   * Output from the command execution. It may not contain the full output
   * and the caller may need to poll for more lines.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line output = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line getOutput(
      int index);
  /**
   *
   *
   * <pre>
   * Output from the command execution. It may not contain the full output
   * and the caller may need to poll for more lines.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line output = 1;
   * </code>
   */
  int getOutputCount();
  /**
   *
   *
   * <pre>
   * Output from the command execution. It may not contain the full output
   * and the caller may need to poll for more lines.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line output = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse
                  .LineOrBuilder>
      getOutputOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output from the command execution. It may not contain the full output
   * and the caller may need to poll for more lines.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.Line output = 1;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.LineOrBuilder
      getOutputOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Whether the command execution has finished and there is no more output.
   * </pre>
   *
   * <code>bool output_end = 2;</code>
   *
   * @return The outputEnd.
   */
  boolean getOutputEnd();

  /**
   *
   *
   * <pre>
   * The result exit status of the command.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.ExitInfo exit_info = 3;
   * </code>
   *
   * @return Whether the exitInfo field is set.
   */
  boolean hasExitInfo();
  /**
   *
   *
   * <pre>
   * The result exit status of the command.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.ExitInfo exit_info = 3;
   * </code>
   *
   * @return The exitInfo.
   */
  com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.ExitInfo
      getExitInfo();
  /**
   *
   *
   * <pre>
   * The result exit status of the command.
   * </pre>
   *
   * <code>
   * .google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.ExitInfo exit_info = 3;
   * </code>
   */
  com.google.cloud.orchestration.airflow.service.v1.PollAirflowCommandResponse.ExitInfoOrBuilder
      getExitInfoOrBuilder();
}
