/*
 * Copyright 2024 Google LLC
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
// source: google/cloud/contentwarehouse/v1/common.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * Options for Update operations.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.UpdateOptions}
 */
public final class UpdateOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.UpdateOptions)
    UpdateOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateOptions.newBuilder() to construct.
  private UpdateOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateOptions() {
    updateType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.CommonProto
        .internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.CommonProto
        .internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.UpdateOptions.class,
            com.google.cloud.contentwarehouse.v1.UpdateOptions.Builder.class);
  }

  private int bitField0_;
  public static final int UPDATE_TYPE_FIELD_NUMBER = 1;
  private int updateType_ = 0;
  /**
   *
   *
   * <pre>
   * Type for update.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
   *
   * @return The enum numeric value on the wire for updateType.
   */
  @java.lang.Override
  public int getUpdateTypeValue() {
    return updateType_;
  }
  /**
   *
   *
   * <pre>
   * Type for update.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
   *
   * @return The updateType.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.UpdateType getUpdateType() {
    com.google.cloud.contentwarehouse.v1.UpdateType result =
        com.google.cloud.contentwarehouse.v1.UpdateType.forNumber(updateType_);
    return result == null ? com.google.cloud.contentwarehouse.v1.UpdateType.UNRECOGNIZED : result;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Field mask for merging Document fields.
   * For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Field mask for merging Document fields.
   * For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
   * Field mask for merging Document fields.
   * For the `FieldMask` definition,
   * see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int MERGE_FIELDS_OPTIONS_FIELD_NUMBER = 3;
  private com.google.cloud.contentwarehouse.v1.MergeFieldsOptions mergeFieldsOptions_;
  /**
   *
   *
   * <pre>
   * Options for merging.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
   *
   * @return Whether the mergeFieldsOptions field is set.
   */
  @java.lang.Override
  public boolean hasMergeFieldsOptions() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Options for merging.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
   *
   * @return The mergeFieldsOptions.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.MergeFieldsOptions getMergeFieldsOptions() {
    return mergeFieldsOptions_ == null
        ? com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.getDefaultInstance()
        : mergeFieldsOptions_;
  }
  /**
   *
   *
   * <pre>
   * Options for merging.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.MergeFieldsOptionsOrBuilder
      getMergeFieldsOptionsOrBuilder() {
    return mergeFieldsOptions_ == null
        ? com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.getDefaultInstance()
        : mergeFieldsOptions_;
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
    if (updateType_
        != com.google.cloud.contentwarehouse.v1.UpdateType.UPDATE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, updateType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getMergeFieldsOptions());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateType_
        != com.google.cloud.contentwarehouse.v1.UpdateType.UPDATE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, updateType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getMergeFieldsOptions());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.UpdateOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.UpdateOptions other =
        (com.google.cloud.contentwarehouse.v1.UpdateOptions) obj;

    if (updateType_ != other.updateType_) return false;
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
    }
    if (hasMergeFieldsOptions() != other.hasMergeFieldsOptions()) return false;
    if (hasMergeFieldsOptions()) {
      if (!getMergeFieldsOptions().equals(other.getMergeFieldsOptions())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UPDATE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + updateType_;
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    if (hasMergeFieldsOptions()) {
      hash = (37 * hash) + MERGE_FIELDS_OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getMergeFieldsOptions().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.UpdateOptions prototype) {
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
   * Options for Update operations.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.UpdateOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.UpdateOptions)
      com.google.cloud.contentwarehouse.v1.UpdateOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.CommonProto
          .internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.CommonProto
          .internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.UpdateOptions.class,
              com.google.cloud.contentwarehouse.v1.UpdateOptions.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.UpdateOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUpdateMaskFieldBuilder();
        getMergeFieldsOptionsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateType_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      mergeFieldsOptions_ = null;
      if (mergeFieldsOptionsBuilder_ != null) {
        mergeFieldsOptionsBuilder_.dispose();
        mergeFieldsOptionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.CommonProto
          .internal_static_google_cloud_contentwarehouse_v1_UpdateOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateOptions getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.UpdateOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateOptions build() {
      com.google.cloud.contentwarehouse.v1.UpdateOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateOptions buildPartial() {
      com.google.cloud.contentwarehouse.v1.UpdateOptions result =
          new com.google.cloud.contentwarehouse.v1.UpdateOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.UpdateOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateType_ = updateType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mergeFieldsOptions_ =
            mergeFieldsOptionsBuilder_ == null
                ? mergeFieldsOptions_
                : mergeFieldsOptionsBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.UpdateOptions) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.UpdateOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.UpdateOptions other) {
      if (other == com.google.cloud.contentwarehouse.v1.UpdateOptions.getDefaultInstance())
        return this;
      if (other.updateType_ != 0) {
        setUpdateTypeValue(other.getUpdateTypeValue());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      if (other.hasMergeFieldsOptions()) {
        mergeMergeFieldsOptions(other.getMergeFieldsOptions());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                updateType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(
                    getMergeFieldsOptionsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int updateType_ = 0;
    /**
     *
     *
     * <pre>
     * Type for update.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
     *
     * @return The enum numeric value on the wire for updateType.
     */
    @java.lang.Override
    public int getUpdateTypeValue() {
      return updateType_;
    }
    /**
     *
     *
     * <pre>
     * Type for update.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for updateType to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateTypeValue(int value) {
      updateType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type for update.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
     *
     * @return The updateType.
     */
    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.UpdateType getUpdateType() {
      com.google.cloud.contentwarehouse.v1.UpdateType result =
          com.google.cloud.contentwarehouse.v1.UpdateType.forNumber(updateType_);
      return result == null ? com.google.cloud.contentwarehouse.v1.UpdateType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Type for update.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
     *
     * @param value The updateType to set.
     * @return This builder for chaining.
     */
    public Builder setUpdateType(com.google.cloud.contentwarehouse.v1.UpdateType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      updateType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type for update.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.UpdateType update_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUpdateType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateType_ = 0;
      onChanged();
      return this;
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
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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
     * Field mask for merging Document fields.
     * For the `FieldMask` definition,
     * see
     * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
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

    private com.google.cloud.contentwarehouse.v1.MergeFieldsOptions mergeFieldsOptions_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.MergeFieldsOptions,
            com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.Builder,
            com.google.cloud.contentwarehouse.v1.MergeFieldsOptionsOrBuilder>
        mergeFieldsOptionsBuilder_;
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     *
     * @return Whether the mergeFieldsOptions field is set.
     */
    public boolean hasMergeFieldsOptions() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     *
     * @return The mergeFieldsOptions.
     */
    public com.google.cloud.contentwarehouse.v1.MergeFieldsOptions getMergeFieldsOptions() {
      if (mergeFieldsOptionsBuilder_ == null) {
        return mergeFieldsOptions_ == null
            ? com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.getDefaultInstance()
            : mergeFieldsOptions_;
      } else {
        return mergeFieldsOptionsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    public Builder setMergeFieldsOptions(
        com.google.cloud.contentwarehouse.v1.MergeFieldsOptions value) {
      if (mergeFieldsOptionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mergeFieldsOptions_ = value;
      } else {
        mergeFieldsOptionsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    public Builder setMergeFieldsOptions(
        com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.Builder builderForValue) {
      if (mergeFieldsOptionsBuilder_ == null) {
        mergeFieldsOptions_ = builderForValue.build();
      } else {
        mergeFieldsOptionsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    public Builder mergeMergeFieldsOptions(
        com.google.cloud.contentwarehouse.v1.MergeFieldsOptions value) {
      if (mergeFieldsOptionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && mergeFieldsOptions_ != null
            && mergeFieldsOptions_
                != com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.getDefaultInstance()) {
          getMergeFieldsOptionsBuilder().mergeFrom(value);
        } else {
          mergeFieldsOptions_ = value;
        }
      } else {
        mergeFieldsOptionsBuilder_.mergeFrom(value);
      }
      if (mergeFieldsOptions_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    public Builder clearMergeFieldsOptions() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mergeFieldsOptions_ = null;
      if (mergeFieldsOptionsBuilder_ != null) {
        mergeFieldsOptionsBuilder_.dispose();
        mergeFieldsOptionsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    public com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.Builder
        getMergeFieldsOptionsBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getMergeFieldsOptionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    public com.google.cloud.contentwarehouse.v1.MergeFieldsOptionsOrBuilder
        getMergeFieldsOptionsOrBuilder() {
      if (mergeFieldsOptionsBuilder_ != null) {
        return mergeFieldsOptionsBuilder_.getMessageOrBuilder();
      } else {
        return mergeFieldsOptions_ == null
            ? com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.getDefaultInstance()
            : mergeFieldsOptions_;
      }
    }
    /**
     *
     *
     * <pre>
     * Options for merging.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.MergeFieldsOptions merge_fields_options = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.MergeFieldsOptions,
            com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.Builder,
            com.google.cloud.contentwarehouse.v1.MergeFieldsOptionsOrBuilder>
        getMergeFieldsOptionsFieldBuilder() {
      if (mergeFieldsOptionsBuilder_ == null) {
        mergeFieldsOptionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.MergeFieldsOptions,
                com.google.cloud.contentwarehouse.v1.MergeFieldsOptions.Builder,
                com.google.cloud.contentwarehouse.v1.MergeFieldsOptionsOrBuilder>(
                getMergeFieldsOptions(), getParentForChildren(), isClean());
        mergeFieldsOptions_ = null;
      }
      return mergeFieldsOptionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.UpdateOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.UpdateOptions)
  private static final com.google.cloud.contentwarehouse.v1.UpdateOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.UpdateOptions();
  }

  public static com.google.cloud.contentwarehouse.v1.UpdateOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateOptions> PARSER =
      new com.google.protobuf.AbstractParser<UpdateOptions>() {
        @java.lang.Override
        public UpdateOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<UpdateOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.UpdateOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
