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
// source: google/cloud/securitycenter/v2/kernel_rootkit.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v2;

public interface KernelRootkitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.KernelRootkit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Rootkit name, when available.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Rootkit name, when available.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * True if unexpected modifications of kernel code memory are present.
   * </pre>
   *
   * <code>bool unexpected_code_modification = 2;</code>
   *
   * @return The unexpectedCodeModification.
   */
  boolean getUnexpectedCodeModification();

  /**
   *
   *
   * <pre>
   * True if unexpected modifications of kernel read-only data memory are
   * present.
   * </pre>
   *
   * <code>bool unexpected_read_only_data_modification = 3;</code>
   *
   * @return The unexpectedReadOnlyDataModification.
   */
  boolean getUnexpectedReadOnlyDataModification();

  /**
   *
   *
   * <pre>
   * True if `ftrace` points are present with callbacks pointing to regions
   * that are not in the expected kernel or module code range.
   * </pre>
   *
   * <code>bool unexpected_ftrace_handler = 4;</code>
   *
   * @return The unexpectedFtraceHandler.
   */
  boolean getUnexpectedFtraceHandler();

  /**
   *
   *
   * <pre>
   * True if `kprobe` points are present with callbacks pointing to regions
   * that are not in the expected kernel or module code range.
   * </pre>
   *
   * <code>bool unexpected_kprobe_handler = 5;</code>
   *
   * @return The unexpectedKprobeHandler.
   */
  boolean getUnexpectedKprobeHandler();

  /**
   *
   *
   * <pre>
   * True if kernel code pages that are not in the expected kernel or module
   * code regions are present.
   * </pre>
   *
   * <code>bool unexpected_kernel_code_pages = 6;</code>
   *
   * @return The unexpectedKernelCodePages.
   */
  boolean getUnexpectedKernelCodePages();

  /**
   *
   *
   * <pre>
   * True if system call handlers that are are not in the expected kernel or
   * module code regions are present.
   * </pre>
   *
   * <code>bool unexpected_system_call_handler = 7;</code>
   *
   * @return The unexpectedSystemCallHandler.
   */
  boolean getUnexpectedSystemCallHandler();

  /**
   *
   *
   * <pre>
   * True if interrupt handlers that are are not in the expected kernel or
   * module code regions are present.
   * </pre>
   *
   * <code>bool unexpected_interrupt_handler = 8;</code>
   *
   * @return The unexpectedInterruptHandler.
   */
  boolean getUnexpectedInterruptHandler();

  /**
   *
   *
   * <pre>
   * True if unexpected processes in the scheduler run queue are present. Such
   * processes are in the run queue, but not in the process task list.
   * </pre>
   *
   * <code>bool unexpected_processes_in_runqueue = 9;</code>
   *
   * @return The unexpectedProcessesInRunqueue.
   */
  boolean getUnexpectedProcessesInRunqueue();
}
