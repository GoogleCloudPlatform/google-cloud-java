// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataplex/v1/service.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataplex.v1;

public interface ListLakesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataplex.v1.ListLakesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Lakes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Lake lakes = 1;</code>
   */
  java.util.List<com.google.cloud.dataplex.v1.Lake> 
      getLakesList();
  /**
   * <pre>
   * Lakes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Lake lakes = 1;</code>
   */
  com.google.cloud.dataplex.v1.Lake getLakes(int index);
  /**
   * <pre>
   * Lakes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Lake lakes = 1;</code>
   */
  int getLakesCount();
  /**
   * <pre>
   * Lakes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Lake lakes = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dataplex.v1.LakeOrBuilder> 
      getLakesOrBuilderList();
  /**
   * <pre>
   * Lakes under the given parent location.
   * </pre>
   *
   * <code>repeated .google.cloud.dataplex.v1.Lake lakes = 1;</code>
   */
  com.google.cloud.dataplex.v1.LakeOrBuilder getLakesOrBuilder(
      int index);

  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
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
   * <code>repeated string unreachable_locations = 3;</code>
   * @return A list containing the unreachableLocations.
   */
  java.util.List<java.lang.String>
      getUnreachableLocationsList();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   * @return The count of unreachableLocations.
   */
  int getUnreachableLocationsCount();
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   * @param index The index of the element to return.
   * @return The unreachableLocations at the given index.
   */
  java.lang.String getUnreachableLocations(int index);
  /**
   * <pre>
   * Locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the unreachableLocations at the given index.
   */
  com.google.protobuf.ByteString
      getUnreachableLocationsBytes(int index);
}
