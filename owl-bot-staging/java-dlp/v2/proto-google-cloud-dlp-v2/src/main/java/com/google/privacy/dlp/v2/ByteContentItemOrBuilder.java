// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface ByteContentItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ByteContentItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
   * @return The type.
   */
  com.google.privacy.dlp.v2.ByteContentItem.BytesType getType();

  /**
   * <pre>
   * Content data to inspect or redact.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
