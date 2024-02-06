// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/cloudquotas/v1/cloudquotas.proto

// Protobuf Java Version: 3.25.2
package com.google.api.cloudquotas.v1;

public interface ListQuotaPreferencesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.cloudquotas.v1.ListQuotaPreferencesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of QuotaPreference
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaPreference quota_preferences = 1;</code>
   */
  java.util.List<com.google.api.cloudquotas.v1.QuotaPreference> 
      getQuotaPreferencesList();
  /**
   * <pre>
   * The list of QuotaPreference
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaPreference quota_preferences = 1;</code>
   */
  com.google.api.cloudquotas.v1.QuotaPreference getQuotaPreferences(int index);
  /**
   * <pre>
   * The list of QuotaPreference
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaPreference quota_preferences = 1;</code>
   */
  int getQuotaPreferencesCount();
  /**
   * <pre>
   * The list of QuotaPreference
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaPreference quota_preferences = 1;</code>
   */
  java.util.List<? extends com.google.api.cloudquotas.v1.QuotaPreferenceOrBuilder> 
      getQuotaPreferencesOrBuilderList();
  /**
   * <pre>
   * The list of QuotaPreference
   * </pre>
   *
   * <code>repeated .google.api.cloudquotas.v1.QuotaPreference quota_preferences = 1;</code>
   */
  com.google.api.cloudquotas.v1.QuotaPreferenceOrBuilder getQuotaPreferencesOrBuilder(
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

  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String>
      getUnreachableList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableBytes(int index);
}
