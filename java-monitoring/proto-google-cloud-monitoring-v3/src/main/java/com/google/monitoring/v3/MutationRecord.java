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
// source: google/monitoring/v3/mutation_record.proto

// Protobuf Java Version: 3.25.5
package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Describes a change made to a configuration.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.MutationRecord}
 */
public final class MutationRecord extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.MutationRecord)
    MutationRecordOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MutationRecord.newBuilder() to construct.
  private MutationRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MutationRecord() {
    mutatedBy_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MutationRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MutationRecordProto
        .internal_static_google_monitoring_v3_MutationRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MutationRecordProto
        .internal_static_google_monitoring_v3_MutationRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.MutationRecord.class,
            com.google.monitoring.v3.MutationRecord.Builder.class);
  }

  private int bitField0_;
  public static final int MUTATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp mutateTime_;
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   *
   * @return Whether the mutateTime field is set.
   */
  @java.lang.Override
  public boolean hasMutateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   *
   * @return The mutateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getMutateTime() {
    return mutateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : mutateTime_;
  }
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getMutateTimeOrBuilder() {
    return mutateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : mutateTime_;
  }

  public static final int MUTATED_BY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object mutatedBy_ = "";
  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   *
   * @return The mutatedBy.
   */
  @java.lang.Override
  public java.lang.String getMutatedBy() {
    java.lang.Object ref = mutatedBy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      mutatedBy_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   *
   * @return The bytes for mutatedBy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMutatedByBytes() {
    java.lang.Object ref = mutatedBy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      mutatedBy_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMutateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mutatedBy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, mutatedBy_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMutateTime());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(mutatedBy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, mutatedBy_);
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
    if (!(obj instanceof com.google.monitoring.v3.MutationRecord)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.MutationRecord other = (com.google.monitoring.v3.MutationRecord) obj;

    if (hasMutateTime() != other.hasMutateTime()) return false;
    if (hasMutateTime()) {
      if (!getMutateTime().equals(other.getMutateTime())) return false;
    }
    if (!getMutatedBy().equals(other.getMutatedBy())) return false;
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
    if (hasMutateTime()) {
      hash = (37 * hash) + MUTATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getMutateTime().hashCode();
    }
    hash = (37 * hash) + MUTATED_BY_FIELD_NUMBER;
    hash = (53 * hash) + getMutatedBy().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.MutationRecord parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.MutationRecord parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.MutationRecord prototype) {
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
   * Describes a change made to a configuration.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.MutationRecord}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.MutationRecord)
      com.google.monitoring.v3.MutationRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MutationRecordProto
          .internal_static_google_monitoring_v3_MutationRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MutationRecordProto
          .internal_static_google_monitoring_v3_MutationRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.MutationRecord.class,
              com.google.monitoring.v3.MutationRecord.Builder.class);
    }

    // Construct using com.google.monitoring.v3.MutationRecord.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMutateTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mutateTime_ = null;
      if (mutateTimeBuilder_ != null) {
        mutateTimeBuilder_.dispose();
        mutateTimeBuilder_ = null;
      }
      mutatedBy_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MutationRecordProto
          .internal_static_google_monitoring_v3_MutationRecord_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.MutationRecord getDefaultInstanceForType() {
      return com.google.monitoring.v3.MutationRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.MutationRecord build() {
      com.google.monitoring.v3.MutationRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.MutationRecord buildPartial() {
      com.google.monitoring.v3.MutationRecord result =
          new com.google.monitoring.v3.MutationRecord(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.monitoring.v3.MutationRecord result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mutateTime_ = mutateTimeBuilder_ == null ? mutateTime_ : mutateTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.mutatedBy_ = mutatedBy_;
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
      if (other instanceof com.google.monitoring.v3.MutationRecord) {
        return mergeFrom((com.google.monitoring.v3.MutationRecord) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.MutationRecord other) {
      if (other == com.google.monitoring.v3.MutationRecord.getDefaultInstance()) return this;
      if (other.hasMutateTime()) {
        mergeMutateTime(other.getMutateTime());
      }
      if (!other.getMutatedBy().isEmpty()) {
        mutatedBy_ = other.mutatedBy_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10:
              {
                input.readMessage(getMutateTimeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                mutatedBy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.protobuf.Timestamp mutateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        mutateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     *
     * @return Whether the mutateTime field is set.
     */
    public boolean hasMutateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     *
     * @return The mutateTime.
     */
    public com.google.protobuf.Timestamp getMutateTime() {
      if (mutateTimeBuilder_ == null) {
        return mutateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : mutateTime_;
      } else {
        return mutateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder setMutateTime(com.google.protobuf.Timestamp value) {
      if (mutateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mutateTime_ = value;
      } else {
        mutateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder setMutateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (mutateTimeBuilder_ == null) {
        mutateTime_ = builderForValue.build();
      } else {
        mutateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder mergeMutateTime(com.google.protobuf.Timestamp value) {
      if (mutateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && mutateTime_ != null
            && mutateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getMutateTimeBuilder().mergeFrom(value);
        } else {
          mutateTime_ = value;
        }
      } else {
        mutateTimeBuilder_.mergeFrom(value);
      }
      if (mutateTime_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public Builder clearMutateTime() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mutateTime_ = null;
      if (mutateTimeBuilder_ != null) {
        mutateTimeBuilder_.dispose();
        mutateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getMutateTimeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMutateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getMutateTimeOrBuilder() {
      if (mutateTimeBuilder_ != null) {
        return mutateTimeBuilder_.getMessageOrBuilder();
      } else {
        return mutateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : mutateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * When the change occurred.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getMutateTimeFieldBuilder() {
      if (mutateTimeBuilder_ == null) {
        mutateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getMutateTime(), getParentForChildren(), isClean());
        mutateTime_ = null;
      }
      return mutateTimeBuilder_;
    }

    private java.lang.Object mutatedBy_ = "";
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     *
     * @return The mutatedBy.
     */
    public java.lang.String getMutatedBy() {
      java.lang.Object ref = mutatedBy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        mutatedBy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     *
     * @return The bytes for mutatedBy.
     */
    public com.google.protobuf.ByteString getMutatedByBytes() {
      java.lang.Object ref = mutatedBy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        mutatedBy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     *
     * @param value The mutatedBy to set.
     * @return This builder for chaining.
     */
    public Builder setMutatedBy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      mutatedBy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMutatedBy() {
      mutatedBy_ = getDefaultInstance().getMutatedBy();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The email address of the user making the change.
     * </pre>
     *
     * <code>string mutated_by = 2;</code>
     *
     * @param value The bytes for mutatedBy to set.
     * @return This builder for chaining.
     */
    public Builder setMutatedByBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      mutatedBy_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.MutationRecord)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.MutationRecord)
  private static final com.google.monitoring.v3.MutationRecord DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.MutationRecord();
  }

  public static com.google.monitoring.v3.MutationRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutationRecord> PARSER =
      new com.google.protobuf.AbstractParser<MutationRecord>() {
        @java.lang.Override
        public MutationRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutationRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutationRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.MutationRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
