// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

public interface ManagedInstanceLastAttemptOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ManagedInstanceLastAttempt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * [Output Only] Encountered errors during the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
   * @return Whether the errors field is set.
   */
  boolean hasErrors();
  /**
   * <pre>
   * [Output Only] Encountered errors during the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
   * @return The errors.
   */
  com.google.cloud.compute.v1.Errors getErrors();
  /**
   * <pre>
   * [Output Only] Encountered errors during the last attempt to create or delete the instance.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Errors errors = 315977579;</code>
   */
  com.google.cloud.compute.v1.ErrorsOrBuilder getErrorsOrBuilder();
}
