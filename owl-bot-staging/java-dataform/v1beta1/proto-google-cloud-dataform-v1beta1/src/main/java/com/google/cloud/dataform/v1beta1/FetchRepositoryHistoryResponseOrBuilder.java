// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataform.v1beta1;

public interface FetchRepositoryHistoryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.FetchRepositoryHistoryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of commit logs, ordered by 'git log' default order.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CommitLogEntry commits = 1;</code>
   */
  java.util.List<com.google.cloud.dataform.v1beta1.CommitLogEntry> 
      getCommitsList();
  /**
   * <pre>
   * A list of commit logs, ordered by 'git log' default order.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CommitLogEntry commits = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.CommitLogEntry getCommits(int index);
  /**
   * <pre>
   * A list of commit logs, ordered by 'git log' default order.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CommitLogEntry commits = 1;</code>
   */
  int getCommitsCount();
  /**
   * <pre>
   * A list of commit logs, ordered by 'git log' default order.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CommitLogEntry commits = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataform.v1beta1.CommitLogEntryOrBuilder> 
      getCommitsOrBuilderList();
  /**
   * <pre>
   * A list of commit logs, ordered by 'git log' default order.
   * </pre>
   *
   * <code>repeated .google.cloud.dataform.v1beta1.CommitLogEntry commits = 1;</code>
   */
  com.google.cloud.dataform.v1beta1.CommitLogEntryOrBuilder getCommitsOrBuilder(
      int index);

  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
