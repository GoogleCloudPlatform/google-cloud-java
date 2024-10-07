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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.CommitmentsScopedList}
 */
public final class CommitmentsScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.CommitmentsScopedList)
    CommitmentsScopedListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CommitmentsScopedList.newBuilder() to construct.
  private CommitmentsScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CommitmentsScopedList() {
    commitments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CommitmentsScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CommitmentsScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_CommitmentsScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.CommitmentsScopedList.class,
            com.google.cloud.compute.v1.CommitmentsScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int COMMITMENTS_FIELD_NUMBER = 450664446;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.Commitment> commitments_;
  /**
   *
   *
   * <pre>
   * [Output Only] A list of commitments contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.Commitment> getCommitmentsList() {
    return commitments_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of commitments contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.CommitmentOrBuilder>
      getCommitmentsOrBuilderList() {
    return commitments_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of commitments contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
   */
  @java.lang.Override
  public int getCommitmentsCount() {
    return commitments_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of commitments contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Commitment getCommitments(int index) {
    return commitments_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of commitments contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.CommitmentOrBuilder getCommitmentsOrBuilder(int index) {
    return commitments_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < commitments_.size(); i++) {
      output.writeMessage(450664446, commitments_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < commitments_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(450664446, commitments_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.CommitmentsScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.CommitmentsScopedList other =
        (com.google.cloud.compute.v1.CommitmentsScopedList) obj;

    if (!getCommitmentsList().equals(other.getCommitmentsList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getCommitmentsCount() > 0) {
      hash = (37 * hash) + COMMITMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getCommitmentsList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.CommitmentsScopedList prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.CommitmentsScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.CommitmentsScopedList)
      com.google.cloud.compute.v1.CommitmentsScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CommitmentsScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CommitmentsScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.CommitmentsScopedList.class,
              com.google.cloud.compute.v1.CommitmentsScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.CommitmentsScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCommitmentsFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (commitmentsBuilder_ == null) {
        commitments_ = java.util.Collections.emptyList();
      } else {
        commitments_ = null;
        commitmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_CommitmentsScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CommitmentsScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.CommitmentsScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CommitmentsScopedList build() {
      com.google.cloud.compute.v1.CommitmentsScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.CommitmentsScopedList buildPartial() {
      com.google.cloud.compute.v1.CommitmentsScopedList result =
          new com.google.cloud.compute.v1.CommitmentsScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.CommitmentsScopedList result) {
      if (commitmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          commitments_ = java.util.Collections.unmodifiableList(commitments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.commitments_ = commitments_;
      } else {
        result.commitments_ = commitmentsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.CommitmentsScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.compute.v1.CommitmentsScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.CommitmentsScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.CommitmentsScopedList other) {
      if (other == com.google.cloud.compute.v1.CommitmentsScopedList.getDefaultInstance())
        return this;
      if (commitmentsBuilder_ == null) {
        if (!other.commitments_.isEmpty()) {
          if (commitments_.isEmpty()) {
            commitments_ = other.commitments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCommitmentsIsMutable();
            commitments_.addAll(other.commitments_);
          }
          onChanged();
        }
      } else {
        if (!other.commitments_.isEmpty()) {
          if (commitmentsBuilder_.isEmpty()) {
            commitmentsBuilder_.dispose();
            commitmentsBuilder_ = null;
            commitments_ = other.commitments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            commitmentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCommitmentsFieldBuilder()
                    : null;
          } else {
            commitmentsBuilder_.addAllMessages(other.commitments_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case -689651726:
              {
                com.google.cloud.compute.v1.Commitment m =
                    input.readMessage(
                        com.google.cloud.compute.v1.Commitment.parser(), extensionRegistry);
                if (commitmentsBuilder_ == null) {
                  ensureCommitmentsIsMutable();
                  commitments_.add(m);
                } else {
                  commitmentsBuilder_.addMessage(m);
                }
                break;
              } // case -689651726
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

    private java.util.List<com.google.cloud.compute.v1.Commitment> commitments_ =
        java.util.Collections.emptyList();

    private void ensureCommitmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        commitments_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.Commitment>(commitments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Commitment,
            com.google.cloud.compute.v1.Commitment.Builder,
            com.google.cloud.compute.v1.CommitmentOrBuilder>
        commitmentsBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Commitment> getCommitmentsList() {
      if (commitmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(commitments_);
      } else {
        return commitmentsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public int getCommitmentsCount() {
      if (commitmentsBuilder_ == null) {
        return commitments_.size();
      } else {
        return commitmentsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public com.google.cloud.compute.v1.Commitment getCommitments(int index) {
      if (commitmentsBuilder_ == null) {
        return commitments_.get(index);
      } else {
        return commitmentsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder setCommitments(int index, com.google.cloud.compute.v1.Commitment value) {
      if (commitmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommitmentsIsMutable();
        commitments_.set(index, value);
        onChanged();
      } else {
        commitmentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder setCommitments(
        int index, com.google.cloud.compute.v1.Commitment.Builder builderForValue) {
      if (commitmentsBuilder_ == null) {
        ensureCommitmentsIsMutable();
        commitments_.set(index, builderForValue.build());
        onChanged();
      } else {
        commitmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder addCommitments(com.google.cloud.compute.v1.Commitment value) {
      if (commitmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommitmentsIsMutable();
        commitments_.add(value);
        onChanged();
      } else {
        commitmentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder addCommitments(int index, com.google.cloud.compute.v1.Commitment value) {
      if (commitmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCommitmentsIsMutable();
        commitments_.add(index, value);
        onChanged();
      } else {
        commitmentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder addCommitments(com.google.cloud.compute.v1.Commitment.Builder builderForValue) {
      if (commitmentsBuilder_ == null) {
        ensureCommitmentsIsMutable();
        commitments_.add(builderForValue.build());
        onChanged();
      } else {
        commitmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder addCommitments(
        int index, com.google.cloud.compute.v1.Commitment.Builder builderForValue) {
      if (commitmentsBuilder_ == null) {
        ensureCommitmentsIsMutable();
        commitments_.add(index, builderForValue.build());
        onChanged();
      } else {
        commitmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder addAllCommitments(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.Commitment> values) {
      if (commitmentsBuilder_ == null) {
        ensureCommitmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, commitments_);
        onChanged();
      } else {
        commitmentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder clearCommitments() {
      if (commitmentsBuilder_ == null) {
        commitments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        commitmentsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public Builder removeCommitments(int index) {
      if (commitmentsBuilder_ == null) {
        ensureCommitmentsIsMutable();
        commitments_.remove(index);
        onChanged();
      } else {
        commitmentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public com.google.cloud.compute.v1.Commitment.Builder getCommitmentsBuilder(int index) {
      return getCommitmentsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public com.google.cloud.compute.v1.CommitmentOrBuilder getCommitmentsOrBuilder(int index) {
      if (commitmentsBuilder_ == null) {
        return commitments_.get(index);
      } else {
        return commitmentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.CommitmentOrBuilder>
        getCommitmentsOrBuilderList() {
      if (commitmentsBuilder_ != null) {
        return commitmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(commitments_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public com.google.cloud.compute.v1.Commitment.Builder addCommitmentsBuilder() {
      return getCommitmentsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.Commitment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public com.google.cloud.compute.v1.Commitment.Builder addCommitmentsBuilder(int index) {
      return getCommitmentsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.Commitment.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of commitments contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.Commitment commitments = 450664446;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.Commitment.Builder>
        getCommitmentsBuilderList() {
      return getCommitmentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.Commitment,
            com.google.cloud.compute.v1.Commitment.Builder,
            com.google.cloud.compute.v1.CommitmentOrBuilder>
        getCommitmentsFieldBuilder() {
      if (commitmentsBuilder_ == null) {
        commitmentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.Commitment,
                com.google.cloud.compute.v1.Commitment.Builder,
                com.google.cloud.compute.v1.CommitmentOrBuilder>(
                commitments_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        commitments_ = null;
      }
      return commitmentsBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] Informational warning which replaces the list of commitments when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.CommitmentsScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.CommitmentsScopedList)
  private static final com.google.cloud.compute.v1.CommitmentsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.CommitmentsScopedList();
  }

  public static com.google.cloud.compute.v1.CommitmentsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommitmentsScopedList> PARSER =
      new com.google.protobuf.AbstractParser<CommitmentsScopedList>() {
        @java.lang.Override
        public CommitmentsScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<CommitmentsScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommitmentsScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.CommitmentsScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
