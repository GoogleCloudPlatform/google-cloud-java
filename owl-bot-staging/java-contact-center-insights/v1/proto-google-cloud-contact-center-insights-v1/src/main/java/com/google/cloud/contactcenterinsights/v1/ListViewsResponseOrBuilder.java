// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contactcenterinsights.v1;

public interface ListViewsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.ListViewsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  java.util.List<com.google.cloud.contactcenterinsights.v1.View> 
      getViewsList();
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  com.google.cloud.contactcenterinsights.v1.View getViews(int index);
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  int getViewsCount();
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contactcenterinsights.v1.ViewOrBuilder> 
      getViewsOrBuilderList();
  /**
   * <pre>
   * The views that match the request.
   * </pre>
   *
   * <code>repeated .google.cloud.contactcenterinsights.v1.View views = 1;</code>
   */
  com.google.cloud.contactcenterinsights.v1.ViewOrBuilder getViewsOrBuilder(
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
