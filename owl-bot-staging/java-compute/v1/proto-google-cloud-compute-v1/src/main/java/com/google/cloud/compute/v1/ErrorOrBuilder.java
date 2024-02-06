// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.Error)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  java.util.List<com.google.cloud.compute.v1.Errors> 
      getErrorsList();
  /**
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  com.google.cloud.compute.v1.Errors getErrors(int index);
  /**
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  int getErrorsCount();
  /**
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.ErrorsOrBuilder> 
      getErrorsOrBuilderList();
  /**
   * <pre>
   * [Output Only] The array of errors encountered while processing this operation.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  com.google.cloud.compute.v1.ErrorsOrBuilder getErrorsOrBuilder(
      int index);
}
