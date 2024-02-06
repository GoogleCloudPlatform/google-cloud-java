// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datacatalog.v1;

public interface CreateEntryGroupRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.CreateEntryGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The names of the project and location that the new entry group
   * belongs to.
   *
   * Note: The entry group itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The names of the project and location that the new entry group
   * belongs to.
   *
   * Note: The entry group itself and its child resources might not be
   * stored in the location specified in its name.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The ID of the entry group to create.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and must start with a letter or underscore.
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The entryGroupId.
   */
  java.lang.String getEntryGroupId();
  /**
   * <pre>
   * Required. The ID of the entry group to create.
   *
   * The ID must contain only letters (a-z, A-Z), numbers (0-9),
   * underscores (_), and must start with a letter or underscore.
   * The maximum size is 64 bytes when encoded in UTF-8.
   * </pre>
   *
   * <code>string entry_group_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for entryGroupId.
   */
  com.google.protobuf.ByteString
      getEntryGroupIdBytes();

  /**
   * <pre>
   * The entry group to create. Defaults to empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
   * @return Whether the entryGroup field is set.
   */
  boolean hasEntryGroup();
  /**
   * <pre>
   * The entry group to create. Defaults to empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
   * @return The entryGroup.
   */
  com.google.cloud.datacatalog.v1.EntryGroup getEntryGroup();
  /**
   * <pre>
   * The entry group to create. Defaults to empty.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.EntryGroup entry_group = 2;</code>
   */
  com.google.cloud.datacatalog.v1.EntryGroupOrBuilder getEntryGroupOrBuilder();
}
