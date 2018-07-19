// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public interface GcsSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.GcsSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000 characters
   * long. Accepted forms:
   * * Full object path: gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1;</code>
   */
  java.util.List<java.lang.String>
      getInputUrisList();
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000 characters
   * long. Accepted forms:
   * * Full object path: gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1;</code>
   */
  int getInputUrisCount();
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000 characters
   * long. Accepted forms:
   * * Full object path: gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1;</code>
   */
  java.lang.String getInputUris(int index);
  /**
   * <pre>
   * Required. Google Cloud Storage URIs to input files, up to 2000 characters
   * long. Accepted forms:
   * * Full object path: gs://bucket/directory/object.csv
   * </pre>
   *
   * <code>repeated string input_uris = 1;</code>
   */
  com.google.protobuf.ByteString
      getInputUrisBytes(int index);
}
