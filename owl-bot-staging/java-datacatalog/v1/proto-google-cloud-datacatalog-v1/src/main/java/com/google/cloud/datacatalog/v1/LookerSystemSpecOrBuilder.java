// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface LookerSystemSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.LookerSystemSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the parent Looker Instance. Empty if it does not exist.
   * Example value: `someinstance.looker.com`
   * </pre>
   *
   * <code>string parent_instance_id = 1;</code>
   * @return The parentInstanceId.
   */
  java.lang.String getParentInstanceId();
  /**
   * <pre>
   * ID of the parent Looker Instance. Empty if it does not exist.
   * Example value: `someinstance.looker.com`
   * </pre>
   *
   * <code>string parent_instance_id = 1;</code>
   * @return The bytes for parentInstanceId.
   */
  com.google.protobuf.ByteString
      getParentInstanceIdBytes();

  /**
   * <pre>
   * Name of the parent Looker Instance. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_instance_display_name = 2;</code>
   * @return The parentInstanceDisplayName.
   */
  java.lang.String getParentInstanceDisplayName();
  /**
   * <pre>
   * Name of the parent Looker Instance. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_instance_display_name = 2;</code>
   * @return The bytes for parentInstanceDisplayName.
   */
  com.google.protobuf.ByteString
      getParentInstanceDisplayNameBytes();

  /**
   * <pre>
   * ID of the parent Model. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_model_id = 3;</code>
   * @return The parentModelId.
   */
  java.lang.String getParentModelId();
  /**
   * <pre>
   * ID of the parent Model. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_model_id = 3;</code>
   * @return The bytes for parentModelId.
   */
  com.google.protobuf.ByteString
      getParentModelIdBytes();

  /**
   * <pre>
   * Name of the parent Model. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_model_display_name = 4;</code>
   * @return The parentModelDisplayName.
   */
  java.lang.String getParentModelDisplayName();
  /**
   * <pre>
   * Name of the parent Model. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_model_display_name = 4;</code>
   * @return The bytes for parentModelDisplayName.
   */
  com.google.protobuf.ByteString
      getParentModelDisplayNameBytes();

  /**
   * <pre>
   * ID of the parent View. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_view_id = 5;</code>
   * @return The parentViewId.
   */
  java.lang.String getParentViewId();
  /**
   * <pre>
   * ID of the parent View. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_view_id = 5;</code>
   * @return The bytes for parentViewId.
   */
  com.google.protobuf.ByteString
      getParentViewIdBytes();

  /**
   * <pre>
   * Name of the parent View. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_view_display_name = 6;</code>
   * @return The parentViewDisplayName.
   */
  java.lang.String getParentViewDisplayName();
  /**
   * <pre>
   * Name of the parent View. Empty if it does not exist.
   * </pre>
   *
   * <code>string parent_view_display_name = 6;</code>
   * @return The bytes for parentViewDisplayName.
   */
  com.google.protobuf.ByteString
      getParentViewDisplayNameBytes();
}
