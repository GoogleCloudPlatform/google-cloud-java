// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface ReadModifyWriteRowResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ReadModifyWriteRowResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Row containing the new contents of all cells modified by the request.
   * </pre>
   *
   * <code>.google.bigtable.v2.Row row = 1;</code>
   */
  boolean hasRow();
  /**
   *
   *
   * <pre>
   * A Row containing the new contents of all cells modified by the request.
   * </pre>
   *
   * <code>.google.bigtable.v2.Row row = 1;</code>
   */
  com.google.bigtable.v2.Row getRow();
  /**
   *
   *
   * <pre>
   * A Row containing the new contents of all cells modified by the request.
   * </pre>
   *
   * <code>.google.bigtable.v2.Row row = 1;</code>
   */
  com.google.bigtable.v2.RowOrBuilder getRowOrBuilder();
}
