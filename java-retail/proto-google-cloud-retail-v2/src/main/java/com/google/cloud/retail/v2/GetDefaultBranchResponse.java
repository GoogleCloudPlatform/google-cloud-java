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
// source: google/cloud/retail/v2/catalog_service.proto

package com.google.cloud.retail.v2;

/**
 *
 *
 * <pre>
 * Response message of
 * [CatalogService.GetDefaultBranch][google.cloud.retail.v2.CatalogService.GetDefaultBranch].
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2.GetDefaultBranchResponse}
 */
public final class GetDefaultBranchResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2.GetDefaultBranchResponse)
    GetDefaultBranchResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetDefaultBranchResponse.newBuilder() to construct.
  private GetDefaultBranchResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetDefaultBranchResponse() {
    branch_ = "";
    note_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetDefaultBranchResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GetDefaultBranchResponse(
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
              java.lang.String s = input.readStringRequireUtf8();

              branch_ = s;
              break;
            }
          case 18:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (setTime_ != null) {
                subBuilder = setTime_.toBuilder();
              }
              setTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(setTime_);
                setTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              note_ = s;
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
    return com.google.cloud.retail.v2.CatalogServiceProto
        .internal_static_google_cloud_retail_v2_GetDefaultBranchResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2.CatalogServiceProto
        .internal_static_google_cloud_retail_v2_GetDefaultBranchResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2.GetDefaultBranchResponse.class,
            com.google.cloud.retail.v2.GetDefaultBranchResponse.Builder.class);
  }

  public static final int BRANCH_FIELD_NUMBER = 1;
  private volatile java.lang.Object branch_;
  /**
   *
   *
   * <pre>
   * Full resource name of the branch id currently set as default branch.
   * </pre>
   *
   * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The branch.
   */
  @java.lang.Override
  public java.lang.String getBranch() {
    java.lang.Object ref = branch_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      branch_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Full resource name of the branch id currently set as default branch.
   * </pre>
   *
   * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for branch.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBranchBytes() {
    java.lang.Object ref = branch_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      branch_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SET_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp setTime_;
  /**
   *
   *
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   *
   * @return Whether the setTime field is set.
   */
  @java.lang.Override
  public boolean hasSetTime() {
    return setTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   *
   * @return The setTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getSetTime() {
    return setTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : setTime_;
  }
  /**
   *
   *
   * <pre>
   * The time when this branch is set to default.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp set_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getSetTimeOrBuilder() {
    return getSetTime();
  }

  public static final int NOTE_FIELD_NUMBER = 3;
  private volatile java.lang.Object note_;
  /**
   *
   *
   * <pre>
   * This corresponds to
   * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
   * field, when this branch was set as default.
   * </pre>
   *
   * <code>string note = 3;</code>
   *
   * @return The note.
   */
  @java.lang.Override
  public java.lang.String getNote() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      note_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * This corresponds to
   * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
   * field, when this branch was set as default.
   * </pre>
   *
   * <code>string note = 3;</code>
   *
   * @return The bytes for note.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNoteBytes() {
    java.lang.Object ref = note_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      note_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(branch_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, branch_);
    }
    if (setTime_ != null) {
      output.writeMessage(2, getSetTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(note_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, note_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(branch_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, branch_);
    }
    if (setTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSetTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(note_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, note_);
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
    if (!(obj instanceof com.google.cloud.retail.v2.GetDefaultBranchResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2.GetDefaultBranchResponse other =
        (com.google.cloud.retail.v2.GetDefaultBranchResponse) obj;

    if (!getBranch().equals(other.getBranch())) return false;
    if (hasSetTime() != other.hasSetTime()) return false;
    if (hasSetTime()) {
      if (!getSetTime().equals(other.getSetTime())) return false;
    }
    if (!getNote().equals(other.getNote())) return false;
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
    hash = (37 * hash) + BRANCH_FIELD_NUMBER;
    hash = (53 * hash) + getBranch().hashCode();
    if (hasSetTime()) {
      hash = (37 * hash) + SET_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSetTime().hashCode();
    }
    hash = (37 * hash) + NOTE_FIELD_NUMBER;
    hash = (53 * hash) + getNote().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2.GetDefaultBranchResponse prototype) {
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
   * Response message of
   * [CatalogService.GetDefaultBranch][google.cloud.retail.v2.CatalogService.GetDefaultBranch].
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2.GetDefaultBranchResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2.GetDefaultBranchResponse)
      com.google.cloud.retail.v2.GetDefaultBranchResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2.CatalogServiceProto
          .internal_static_google_cloud_retail_v2_GetDefaultBranchResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2.CatalogServiceProto
          .internal_static_google_cloud_retail_v2_GetDefaultBranchResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2.GetDefaultBranchResponse.class,
              com.google.cloud.retail.v2.GetDefaultBranchResponse.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2.GetDefaultBranchResponse.newBuilder()
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
      branch_ = "";

      if (setTimeBuilder_ == null) {
        setTime_ = null;
      } else {
        setTime_ = null;
        setTimeBuilder_ = null;
      }
      note_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2.CatalogServiceProto
          .internal_static_google_cloud_retail_v2_GetDefaultBranchResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.GetDefaultBranchResponse getDefaultInstanceForType() {
      return com.google.cloud.retail.v2.GetDefaultBranchResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.GetDefaultBranchResponse build() {
      com.google.cloud.retail.v2.GetDefaultBranchResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2.GetDefaultBranchResponse buildPartial() {
      com.google.cloud.retail.v2.GetDefaultBranchResponse result =
          new com.google.cloud.retail.v2.GetDefaultBranchResponse(this);
      result.branch_ = branch_;
      if (setTimeBuilder_ == null) {
        result.setTime_ = setTime_;
      } else {
        result.setTime_ = setTimeBuilder_.build();
      }
      result.note_ = note_;
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
      if (other instanceof com.google.cloud.retail.v2.GetDefaultBranchResponse) {
        return mergeFrom((com.google.cloud.retail.v2.GetDefaultBranchResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2.GetDefaultBranchResponse other) {
      if (other == com.google.cloud.retail.v2.GetDefaultBranchResponse.getDefaultInstance())
        return this;
      if (!other.getBranch().isEmpty()) {
        branch_ = other.branch_;
        onChanged();
      }
      if (other.hasSetTime()) {
        mergeSetTime(other.getSetTime());
      }
      if (!other.getNote().isEmpty()) {
        note_ = other.note_;
        onChanged();
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
      com.google.cloud.retail.v2.GetDefaultBranchResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.retail.v2.GetDefaultBranchResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object branch_ = "";
    /**
     *
     *
     * <pre>
     * Full resource name of the branch id currently set as default branch.
     * </pre>
     *
     * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The branch.
     */
    public java.lang.String getBranch() {
      java.lang.Object ref = branch_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        branch_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full resource name of the branch id currently set as default branch.
     * </pre>
     *
     * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for branch.
     */
    public com.google.protobuf.ByteString getBranchBytes() {
      java.lang.Object ref = branch_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        branch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Full resource name of the branch id currently set as default branch.
     * </pre>
     *
     * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The branch to set.
     * @return This builder for chaining.
     */
    public Builder setBranch(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      branch_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full resource name of the branch id currently set as default branch.
     * </pre>
     *
     * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBranch() {

      branch_ = getDefaultInstance().getBranch();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Full resource name of the branch id currently set as default branch.
     * </pre>
     *
     * <code>string branch = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for branch to set.
     * @return This builder for chaining.
     */
    public Builder setBranchBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      branch_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp setTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        setTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     *
     * @return Whether the setTime field is set.
     */
    public boolean hasSetTime() {
      return setTimeBuilder_ != null || setTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     *
     * @return The setTime.
     */
    public com.google.protobuf.Timestamp getSetTime() {
      if (setTimeBuilder_ == null) {
        return setTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : setTime_;
      } else {
        return setTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    public Builder setSetTime(com.google.protobuf.Timestamp value) {
      if (setTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        setTime_ = value;
        onChanged();
      } else {
        setTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    public Builder setSetTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (setTimeBuilder_ == null) {
        setTime_ = builderForValue.build();
        onChanged();
      } else {
        setTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    public Builder mergeSetTime(com.google.protobuf.Timestamp value) {
      if (setTimeBuilder_ == null) {
        if (setTime_ != null) {
          setTime_ =
              com.google.protobuf.Timestamp.newBuilder(setTime_).mergeFrom(value).buildPartial();
        } else {
          setTime_ = value;
        }
        onChanged();
      } else {
        setTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    public Builder clearSetTime() {
      if (setTimeBuilder_ == null) {
        setTime_ = null;
        onChanged();
      } else {
        setTime_ = null;
        setTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getSetTimeBuilder() {

      onChanged();
      return getSetTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSetTimeOrBuilder() {
      if (setTimeBuilder_ != null) {
        return setTimeBuilder_.getMessageOrBuilder();
      } else {
        return setTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : setTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time when this branch is set to default.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp set_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getSetTimeFieldBuilder() {
      if (setTimeBuilder_ == null) {
        setTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getSetTime(), getParentForChildren(), isClean());
        setTime_ = null;
      }
      return setTimeBuilder_;
    }

    private java.lang.Object note_ = "";
    /**
     *
     *
     * <pre>
     * This corresponds to
     * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
     * field, when this branch was set as default.
     * </pre>
     *
     * <code>string note = 3;</code>
     *
     * @return The note.
     */
    public java.lang.String getNote() {
      java.lang.Object ref = note_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        note_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This corresponds to
     * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
     * field, when this branch was set as default.
     * </pre>
     *
     * <code>string note = 3;</code>
     *
     * @return The bytes for note.
     */
    public com.google.protobuf.ByteString getNoteBytes() {
      java.lang.Object ref = note_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        note_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * This corresponds to
     * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
     * field, when this branch was set as default.
     * </pre>
     *
     * <code>string note = 3;</code>
     *
     * @param value The note to set.
     * @return This builder for chaining.
     */
    public Builder setNote(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      note_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This corresponds to
     * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
     * field, when this branch was set as default.
     * </pre>
     *
     * <code>string note = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNote() {

      note_ = getDefaultInstance().getNote();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This corresponds to
     * [SetDefaultBranchRequest.note][google.cloud.retail.v2.SetDefaultBranchRequest.note]
     * field, when this branch was set as default.
     * </pre>
     *
     * <code>string note = 3;</code>
     *
     * @param value The bytes for note to set.
     * @return This builder for chaining.
     */
    public Builder setNoteBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      note_ = value;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2.GetDefaultBranchResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2.GetDefaultBranchResponse)
  private static final com.google.cloud.retail.v2.GetDefaultBranchResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2.GetDefaultBranchResponse();
  }

  public static com.google.cloud.retail.v2.GetDefaultBranchResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetDefaultBranchResponse> PARSER =
      new com.google.protobuf.AbstractParser<GetDefaultBranchResponse>() {
        @java.lang.Override
        public GetDefaultBranchResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GetDefaultBranchResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GetDefaultBranchResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetDefaultBranchResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2.GetDefaultBranchResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
