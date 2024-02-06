// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

public interface ApprovalConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.ApprovalConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether or not approval is needed. If this is set on a build, it will
   * become pending when created, and will need to be explicitly approved
   * to start.
   * </pre>
   *
   * <code>bool approval_required = 1;</code>
   * @return The approvalRequired.
   */
  boolean getApprovalRequired();
}
