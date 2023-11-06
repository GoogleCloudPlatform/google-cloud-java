// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

package com.google.cloud.datacatalog.lineage.v1;

public interface ProcessOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.Process)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the lineage process. Format:
   * `projects/{project}/locations/{location}/processes/{process}`.
   * Can be specified or auto-assigned.
   * {process} must be not longer than 200 characters and only
   * contain characters in a set: `a-zA-Z0-9_-:.`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Immutable. The resource name of the lineage process. Format:
   * `projects/{project}/locations/{location}/processes/{process}`.
   * Can be specified or auto-assigned.
   * {process} must be not longer than 200 characters and only
   * contain characters in a set: `a-zA-Z0-9_-:.`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Optional. A human-readable name you can set to display in a user interface.
   * Must be not longer than 200 characters and only contain UTF-8 letters
   * or numbers, spaces or characters like `_-:&amp;.`
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Optional. A human-readable name you can set to display in a user interface.
   * Must be not longer than 200 characters and only contain UTF-8 letters
   * or numbers, spaces or characters like `_-:&amp;.`
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Optional. The attributes of the process. Should only be used for the
   * purpose of non-semantic management (classifying, describing or labeling the
   * process).
   *
   * Up to 100 attributes are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Optional. The attributes of the process. Should only be used for the
   * purpose of non-semantic management (classifying, describing or labeling the
   * process).
   *
   * Up to 100 attributes are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getAttributes();
  /**
   * <pre>
   * Optional. The attributes of the process. Should only be used for the
   * purpose of non-semantic management (classifying, describing or labeling the
   * process).
   *
   * Up to 100 attributes are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value>
  getAttributesMap();
  /**
   * <pre>
   * Optional. The attributes of the process. Should only be used for the
   * purpose of non-semantic management (classifying, describing or labeling the
   * process).
   *
   * Up to 100 attributes are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
com.google.protobuf.Value getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Value defaultValue);
  /**
   * <pre>
   * Optional. The attributes of the process. Should only be used for the
   * purpose of non-semantic management (classifying, describing or labeling the
   * process).
   *
   * Up to 100 attributes are allowed.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; attributes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.Value getAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Optional. The origin of this process and its runs and lineage events.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.Origin origin = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();
  /**
   * <pre>
   * Optional. The origin of this process and its runs and lineage events.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.Origin origin = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The origin.
   */
  com.google.cloud.datacatalog.lineage.v1.Origin getOrigin();
  /**
   * <pre>
   * Optional. The origin of this process and its runs and lineage events.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.lineage.v1.Origin origin = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.cloud.datacatalog.lineage.v1.OriginOrBuilder getOriginOrBuilder();
}
