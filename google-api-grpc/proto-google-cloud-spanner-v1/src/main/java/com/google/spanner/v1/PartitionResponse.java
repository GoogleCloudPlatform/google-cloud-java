// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/spanner.proto

package com.google.spanner.v1;

/**
 * <pre>
 * The response for [PartitionQuery][google.spanner.v1.Spanner.PartitionQuery]
 * or [PartitionRead][google.spanner.v1.Spanner.PartitionRead]
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.PartitionResponse}
 */
public  final class PartitionResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.PartitionResponse)
    PartitionResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartitionResponse.newBuilder() to construct.
  private PartitionResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartitionResponse() {
    partitions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartitionResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              partitions_ = new java.util.ArrayList<com.google.spanner.v1.Partition>();
              mutable_bitField0_ |= 0x00000001;
            }
            partitions_.add(
                input.readMessage(com.google.spanner.v1.Partition.parser(), extensionRegistry));
            break;
          }
          case 18: {
            com.google.spanner.v1.Transaction.Builder subBuilder = null;
            if (transaction_ != null) {
              subBuilder = transaction_.toBuilder();
            }
            transaction_ = input.readMessage(com.google.spanner.v1.Transaction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transaction_);
              transaction_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        partitions_ = java.util.Collections.unmodifiableList(partitions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_PartitionResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_PartitionResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.PartitionResponse.class, com.google.spanner.v1.PartitionResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PARTITIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.spanner.v1.Partition> partitions_;
  /**
   * <pre>
   * Partitions created by this request.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
   */
  public java.util.List<com.google.spanner.v1.Partition> getPartitionsList() {
    return partitions_;
  }
  /**
   * <pre>
   * Partitions created by this request.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
   */
  public java.util.List<? extends com.google.spanner.v1.PartitionOrBuilder> 
      getPartitionsOrBuilderList() {
    return partitions_;
  }
  /**
   * <pre>
   * Partitions created by this request.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
   */
  public int getPartitionsCount() {
    return partitions_.size();
  }
  /**
   * <pre>
   * Partitions created by this request.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
   */
  public com.google.spanner.v1.Partition getPartitions(int index) {
    return partitions_.get(index);
  }
  /**
   * <pre>
   * Partitions created by this request.
   * </pre>
   *
   * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
   */
  public com.google.spanner.v1.PartitionOrBuilder getPartitionsOrBuilder(
      int index) {
    return partitions_.get(index);
  }

  public static final int TRANSACTION_FIELD_NUMBER = 2;
  private com.google.spanner.v1.Transaction transaction_;
  /**
   * <pre>
   * Transaction created by this request.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  public boolean hasTransaction() {
    return transaction_ != null;
  }
  /**
   * <pre>
   * Transaction created by this request.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  public com.google.spanner.v1.Transaction getTransaction() {
    return transaction_ == null ? com.google.spanner.v1.Transaction.getDefaultInstance() : transaction_;
  }
  /**
   * <pre>
   * Transaction created by this request.
   * </pre>
   *
   * <code>.google.spanner.v1.Transaction transaction = 2;</code>
   */
  public com.google.spanner.v1.TransactionOrBuilder getTransactionOrBuilder() {
    return getTransaction();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < partitions_.size(); i++) {
      output.writeMessage(1, partitions_.get(i));
    }
    if (transaction_ != null) {
      output.writeMessage(2, getTransaction());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < partitions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, partitions_.get(i));
    }
    if (transaction_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransaction());
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
    if (!(obj instanceof com.google.spanner.v1.PartitionResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.PartitionResponse other = (com.google.spanner.v1.PartitionResponse) obj;

    boolean result = true;
    result = result && getPartitionsList()
        .equals(other.getPartitionsList());
    result = result && (hasTransaction() == other.hasTransaction());
    if (hasTransaction()) {
      result = result && getTransaction()
          .equals(other.getTransaction());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPartitionsCount() > 0) {
      hash = (37 * hash) + PARTITIONS_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionsList().hashCode();
    }
    if (hasTransaction()) {
      hash = (37 * hash) + TRANSACTION_FIELD_NUMBER;
      hash = (53 * hash) + getTransaction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.PartitionResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.PartitionResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.PartitionResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.spanner.v1.PartitionResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.spanner.v1.PartitionResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The response for [PartitionQuery][google.spanner.v1.Spanner.PartitionQuery]
   * or [PartitionRead][google.spanner.v1.Spanner.PartitionRead]
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.PartitionResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.PartitionResponse)
      com.google.spanner.v1.PartitionResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_PartitionResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_PartitionResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.PartitionResponse.class, com.google.spanner.v1.PartitionResponse.Builder.class);
    }

    // Construct using com.google.spanner.v1.PartitionResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPartitionsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        partitionsBuilder_.clear();
      }
      if (transactionBuilder_ == null) {
        transaction_ = null;
      } else {
        transaction_ = null;
        transactionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.spanner.v1.SpannerProto.internal_static_google_spanner_v1_PartitionResponse_descriptor;
    }

    public com.google.spanner.v1.PartitionResponse getDefaultInstanceForType() {
      return com.google.spanner.v1.PartitionResponse.getDefaultInstance();
    }

    public com.google.spanner.v1.PartitionResponse build() {
      com.google.spanner.v1.PartitionResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.spanner.v1.PartitionResponse buildPartial() {
      com.google.spanner.v1.PartitionResponse result = new com.google.spanner.v1.PartitionResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (partitionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          partitions_ = java.util.Collections.unmodifiableList(partitions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.partitions_ = partitions_;
      } else {
        result.partitions_ = partitionsBuilder_.build();
      }
      if (transactionBuilder_ == null) {
        result.transaction_ = transaction_;
      } else {
        result.transaction_ = transactionBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.PartitionResponse) {
        return mergeFrom((com.google.spanner.v1.PartitionResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.PartitionResponse other) {
      if (other == com.google.spanner.v1.PartitionResponse.getDefaultInstance()) return this;
      if (partitionsBuilder_ == null) {
        if (!other.partitions_.isEmpty()) {
          if (partitions_.isEmpty()) {
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePartitionsIsMutable();
            partitions_.addAll(other.partitions_);
          }
          onChanged();
        }
      } else {
        if (!other.partitions_.isEmpty()) {
          if (partitionsBuilder_.isEmpty()) {
            partitionsBuilder_.dispose();
            partitionsBuilder_ = null;
            partitions_ = other.partitions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            partitionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPartitionsFieldBuilder() : null;
          } else {
            partitionsBuilder_.addAllMessages(other.partitions_);
          }
        }
      }
      if (other.hasTransaction()) {
        mergeTransaction(other.getTransaction());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.v1.PartitionResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.PartitionResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.spanner.v1.Partition> partitions_ =
      java.util.Collections.emptyList();
    private void ensurePartitionsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        partitions_ = new java.util.ArrayList<com.google.spanner.v1.Partition>(partitions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.spanner.v1.Partition, com.google.spanner.v1.Partition.Builder, com.google.spanner.v1.PartitionOrBuilder> partitionsBuilder_;

    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public java.util.List<com.google.spanner.v1.Partition> getPartitionsList() {
      if (partitionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(partitions_);
      } else {
        return partitionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public int getPartitionsCount() {
      if (partitionsBuilder_ == null) {
        return partitions_.size();
      } else {
        return partitionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public com.google.spanner.v1.Partition getPartitions(int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);
      } else {
        return partitionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder setPartitions(
        int index, com.google.spanner.v1.Partition value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.set(index, value);
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder setPartitions(
        int index, com.google.spanner.v1.Partition.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.set(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(com.google.spanner.v1.Partition value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(
        int index, com.google.spanner.v1.Partition value) {
      if (partitionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePartitionsIsMutable();
        partitions_.add(index, value);
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(
        com.google.spanner.v1.Partition.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder addPartitions(
        int index, com.google.spanner.v1.Partition.Builder builderForValue) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.add(index, builderForValue.build());
        onChanged();
      } else {
        partitionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder addAllPartitions(
        java.lang.Iterable<? extends com.google.spanner.v1.Partition> values) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, partitions_);
        onChanged();
      } else {
        partitionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder clearPartitions() {
      if (partitionsBuilder_ == null) {
        partitions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        partitionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public Builder removePartitions(int index) {
      if (partitionsBuilder_ == null) {
        ensurePartitionsIsMutable();
        partitions_.remove(index);
        onChanged();
      } else {
        partitionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public com.google.spanner.v1.Partition.Builder getPartitionsBuilder(
        int index) {
      return getPartitionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public com.google.spanner.v1.PartitionOrBuilder getPartitionsOrBuilder(
        int index) {
      if (partitionsBuilder_ == null) {
        return partitions_.get(index);  } else {
        return partitionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public java.util.List<? extends com.google.spanner.v1.PartitionOrBuilder> 
         getPartitionsOrBuilderList() {
      if (partitionsBuilder_ != null) {
        return partitionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(partitions_);
      }
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public com.google.spanner.v1.Partition.Builder addPartitionsBuilder() {
      return getPartitionsFieldBuilder().addBuilder(
          com.google.spanner.v1.Partition.getDefaultInstance());
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public com.google.spanner.v1.Partition.Builder addPartitionsBuilder(
        int index) {
      return getPartitionsFieldBuilder().addBuilder(
          index, com.google.spanner.v1.Partition.getDefaultInstance());
    }
    /**
     * <pre>
     * Partitions created by this request.
     * </pre>
     *
     * <code>repeated .google.spanner.v1.Partition partitions = 1;</code>
     */
    public java.util.List<com.google.spanner.v1.Partition.Builder> 
         getPartitionsBuilderList() {
      return getPartitionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.spanner.v1.Partition, com.google.spanner.v1.Partition.Builder, com.google.spanner.v1.PartitionOrBuilder> 
        getPartitionsFieldBuilder() {
      if (partitionsBuilder_ == null) {
        partitionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.v1.Partition, com.google.spanner.v1.Partition.Builder, com.google.spanner.v1.PartitionOrBuilder>(
                partitions_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        partitions_ = null;
      }
      return partitionsBuilder_;
    }

    private com.google.spanner.v1.Transaction transaction_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.Transaction, com.google.spanner.v1.Transaction.Builder, com.google.spanner.v1.TransactionOrBuilder> transactionBuilder_;
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public boolean hasTransaction() {
      return transactionBuilder_ != null || transaction_ != null;
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public com.google.spanner.v1.Transaction getTransaction() {
      if (transactionBuilder_ == null) {
        return transaction_ == null ? com.google.spanner.v1.Transaction.getDefaultInstance() : transaction_;
      } else {
        return transactionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder setTransaction(com.google.spanner.v1.Transaction value) {
      if (transactionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transaction_ = value;
        onChanged();
      } else {
        transactionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder setTransaction(
        com.google.spanner.v1.Transaction.Builder builderForValue) {
      if (transactionBuilder_ == null) {
        transaction_ = builderForValue.build();
        onChanged();
      } else {
        transactionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder mergeTransaction(com.google.spanner.v1.Transaction value) {
      if (transactionBuilder_ == null) {
        if (transaction_ != null) {
          transaction_ =
            com.google.spanner.v1.Transaction.newBuilder(transaction_).mergeFrom(value).buildPartial();
        } else {
          transaction_ = value;
        }
        onChanged();
      } else {
        transactionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public Builder clearTransaction() {
      if (transactionBuilder_ == null) {
        transaction_ = null;
        onChanged();
      } else {
        transaction_ = null;
        transactionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public com.google.spanner.v1.Transaction.Builder getTransactionBuilder() {
      
      onChanged();
      return getTransactionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    public com.google.spanner.v1.TransactionOrBuilder getTransactionOrBuilder() {
      if (transactionBuilder_ != null) {
        return transactionBuilder_.getMessageOrBuilder();
      } else {
        return transaction_ == null ?
            com.google.spanner.v1.Transaction.getDefaultInstance() : transaction_;
      }
    }
    /**
     * <pre>
     * Transaction created by this request.
     * </pre>
     *
     * <code>.google.spanner.v1.Transaction transaction = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.spanner.v1.Transaction, com.google.spanner.v1.Transaction.Builder, com.google.spanner.v1.TransactionOrBuilder> 
        getTransactionFieldBuilder() {
      if (transactionBuilder_ == null) {
        transactionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.Transaction, com.google.spanner.v1.Transaction.Builder, com.google.spanner.v1.TransactionOrBuilder>(
                getTransaction(),
                getParentForChildren(),
                isClean());
        transaction_ = null;
      }
      return transactionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.spanner.v1.PartitionResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.PartitionResponse)
  private static final com.google.spanner.v1.PartitionResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.PartitionResponse();
  }

  public static com.google.spanner.v1.PartitionResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartitionResponse>
      PARSER = new com.google.protobuf.AbstractParser<PartitionResponse>() {
    public PartitionResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PartitionResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartitionResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartitionResponse> getParserForType() {
    return PARSER;
  }

  public com.google.spanner.v1.PartitionResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

