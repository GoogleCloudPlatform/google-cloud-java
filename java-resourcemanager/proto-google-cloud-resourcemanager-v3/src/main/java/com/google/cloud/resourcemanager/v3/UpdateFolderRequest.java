/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/resourcemanager/v3/folders.proto

package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The request sent to the
 * [UpdateFolder][google.cloud.resourcemanager.v3.Folder.UpdateFolder]
 * method.
 * Only the `display_name` field can be changed. All other fields will be
 * ignored. Use the
 * [MoveFolder][google.cloud.resourcemanager.v3.Folders.MoveFolder] method to
 * change the `parent` field.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.UpdateFolderRequest}
 */
public final class UpdateFolderRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.UpdateFolderRequest)
    UpdateFolderRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateFolderRequest.newBuilder() to construct.
  private UpdateFolderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateFolderRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateFolderRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private UpdateFolderRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              com.google.cloud.resourcemanager.v3.Folder.Builder subBuilder = null;
              if (folder_ != null) {
                subBuilder = folder_.toBuilder();
              }
              folder_ =
                  input.readMessage(
                      com.google.cloud.resourcemanager.v3.Folder.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(folder_);
                folder_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.protobuf.FieldMask.Builder subBuilder = null;
              if (updateMask_ != null) {
                subBuilder = updateMask_.toBuilder();
              }
              updateMask_ =
                  input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateMask_);
                updateMask_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.FoldersProto
        .internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.FoldersProto
        .internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.UpdateFolderRequest.class,
            com.google.cloud.resourcemanager.v3.UpdateFolderRequest.Builder.class);
  }

  public static final int FOLDER_FIELD_NUMBER = 1;
  private com.google.cloud.resourcemanager.v3.Folder folder_;
  /**
   *
   *
   * <pre>
   * Required. The new definition of the Folder. It must include the `name` field, which
   * cannot be changed.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the folder field is set.
   */
  @java.lang.Override
  public boolean hasFolder() {
    return folder_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new definition of the Folder. It must include the `name` field, which
   * cannot be changed.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The folder.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.Folder getFolder() {
    return folder_ == null
        ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
        : folder_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new definition of the Folder. It must include the `name` field, which
   * cannot be changed.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.FolderOrBuilder getFolderOrBuilder() {
    return getFolder();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Required. Fields to be updated.
   * Only the `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Fields to be updated.
   * Only the `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Required. Fields to be updated.
   * Only the `display_name` can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (folder_ != null) {
      output.writeMessage(1, getFolder());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (folder_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFolder());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.UpdateFolderRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.UpdateFolderRequest other =
        (com.google.cloud.resourcemanager.v3.UpdateFolderRequest) obj;

    if (hasFolder() != other.hasFolder()) return false;
    if (hasFolder()) {
      if (!getFolder().equals(other.getFolder())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFolder()) {
      hash = (37 * hash) + FOLDER_FIELD_NUMBER;
      hash = (53 * hash) + getFolder().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.resourcemanager.v3.UpdateFolderRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The request sent to the
   * [UpdateFolder][google.cloud.resourcemanager.v3.Folder.UpdateFolder]
   * method.
   * Only the `display_name` field can be changed. All other fields will be
   * ignored. Use the
   * [MoveFolder][google.cloud.resourcemanager.v3.Folders.MoveFolder] method to
   * change the `parent` field.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.UpdateFolderRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.UpdateFolderRequest)
      com.google.cloud.resourcemanager.v3.UpdateFolderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.UpdateFolderRequest.class,
              com.google.cloud.resourcemanager.v3.UpdateFolderRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.UpdateFolderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (folderBuilder_ == null) {
        folder_ = null;
      } else {
        folder_ = null;
        folderBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_UpdateFolderRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateFolderRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.UpdateFolderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateFolderRequest build() {
      com.google.cloud.resourcemanager.v3.UpdateFolderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.UpdateFolderRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.UpdateFolderRequest result =
          new com.google.cloud.resourcemanager.v3.UpdateFolderRequest(this);
      if (folderBuilder_ == null) {
        result.folder_ = folder_;
      } else {
        result.folder_ = folderBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.resourcemanager.v3.UpdateFolderRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.UpdateFolderRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.UpdateFolderRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.UpdateFolderRequest.getDefaultInstance())
        return this;
      if (other.hasFolder()) {
        mergeFolder(other.getFolder());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.resourcemanager.v3.UpdateFolderRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.resourcemanager.v3.UpdateFolderRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.resourcemanager.v3.Folder folder_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Folder,
            com.google.cloud.resourcemanager.v3.Folder.Builder,
            com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        folderBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the folder field is set.
     */
    public boolean hasFolder() {
      return folderBuilder_ != null || folder_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The folder.
     */
    public com.google.cloud.resourcemanager.v3.Folder getFolder() {
      if (folderBuilder_ == null) {
        return folder_ == null
            ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
            : folder_;
      } else {
        return folderBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFolder(com.google.cloud.resourcemanager.v3.Folder value) {
      if (folderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        folder_ = value;
        onChanged();
      } else {
        folderBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFolder(com.google.cloud.resourcemanager.v3.Folder.Builder builderForValue) {
      if (folderBuilder_ == null) {
        folder_ = builderForValue.build();
        onChanged();
      } else {
        folderBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFolder(com.google.cloud.resourcemanager.v3.Folder value) {
      if (folderBuilder_ == null) {
        if (folder_ != null) {
          folder_ =
              com.google.cloud.resourcemanager.v3.Folder.newBuilder(folder_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          folder_ = value;
        }
        onChanged();
      } else {
        folderBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFolder() {
      if (folderBuilder_ == null) {
        folder_ = null;
        onChanged();
      } else {
        folder_ = null;
        folderBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.Folder.Builder getFolderBuilder() {

      onChanged();
      return getFolderFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.FolderOrBuilder getFolderOrBuilder() {
      if (folderBuilder_ != null) {
        return folderBuilder_.getMessageOrBuilder();
      } else {
        return folder_ == null
            ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
            : folder_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new definition of the Folder. It must include the `name` field, which
     * cannot be changed.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Folder,
            com.google.cloud.resourcemanager.v3.Folder.Builder,
            com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        getFolderFieldBuilder() {
      if (folderBuilder_ == null) {
        folderBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.Folder,
                com.google.cloud.resourcemanager.v3.Folder.Builder,
                com.google.cloud.resourcemanager.v3.FolderOrBuilder>(
                getFolder(), getParentForChildren(), isClean());
        folder_ = null;
      }
      return folderBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
              com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {

      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Fields to be updated.
     * Only the `display_name` can be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.UpdateFolderRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.UpdateFolderRequest)
  private static final com.google.cloud.resourcemanager.v3.UpdateFolderRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.UpdateFolderRequest();
  }

  public static com.google.cloud.resourcemanager.v3.UpdateFolderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateFolderRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateFolderRequest>() {
        @java.lang.Override
        public UpdateFolderRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new UpdateFolderRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<UpdateFolderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateFolderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.UpdateFolderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
