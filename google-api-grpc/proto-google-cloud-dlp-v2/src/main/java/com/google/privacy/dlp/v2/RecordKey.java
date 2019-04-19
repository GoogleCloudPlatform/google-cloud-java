// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Message for a unique key indicating a record that contains a finding.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.RecordKey}
 */
public final class RecordKey extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.RecordKey)
    RecordKeyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RecordKey.newBuilder() to construct.
  private RecordKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RecordKey() {
    idValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private RecordKey(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 18:
            {
              com.google.privacy.dlp.v2.DatastoreKey.Builder subBuilder = null;
              if (typeCase_ == 2) {
                subBuilder = ((com.google.privacy.dlp.v2.DatastoreKey) type_).toBuilder();
              }
              type_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.DatastoreKey.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.privacy.dlp.v2.DatastoreKey) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 2;
              break;
            }
          case 26:
            {
              com.google.privacy.dlp.v2.BigQueryKey.Builder subBuilder = null;
              if (typeCase_ == 3) {
                subBuilder = ((com.google.privacy.dlp.v2.BigQueryKey) type_).toBuilder();
              }
              type_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.BigQueryKey.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.privacy.dlp.v2.BigQueryKey) type_);
                type_ = subBuilder.buildPartial();
              }
              typeCase_ = 3;
              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000004) != 0)) {
                idValues_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000004;
              }
              idValues_.add(s);
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000004) != 0)) {
        idValues_ = idValues_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_RecordKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_RecordKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.RecordKey.class,
            com.google.privacy.dlp.v2.RecordKey.Builder.class);
  }

  private int bitField0_;
  private int typeCase_ = 0;
  private java.lang.Object type_;

  public enum TypeCase implements com.google.protobuf.Internal.EnumLite {
    DATASTORE_KEY(2),
    BIG_QUERY_KEY(3),
    TYPE_NOT_SET(0);
    private final int value;

    private TypeCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 2:
          return DATASTORE_KEY;
        case 3:
          return BIG_QUERY_KEY;
        case 0:
          return TYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase getTypeCase() {
    return TypeCase.forNumber(typeCase_);
  }

  public static final int DATASTORE_KEY_FIELD_NUMBER = 2;
  /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
  public boolean hasDatastoreKey() {
    return typeCase_ == 2;
  }
  /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
  public com.google.privacy.dlp.v2.DatastoreKey getDatastoreKey() {
    if (typeCase_ == 2) {
      return (com.google.privacy.dlp.v2.DatastoreKey) type_;
    }
    return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
  }
  /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
  public com.google.privacy.dlp.v2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder() {
    if (typeCase_ == 2) {
      return (com.google.privacy.dlp.v2.DatastoreKey) type_;
    }
    return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
  }

  public static final int BIG_QUERY_KEY_FIELD_NUMBER = 3;
  /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
  public boolean hasBigQueryKey() {
    return typeCase_ == 3;
  }
  /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
  public com.google.privacy.dlp.v2.BigQueryKey getBigQueryKey() {
    if (typeCase_ == 3) {
      return (com.google.privacy.dlp.v2.BigQueryKey) type_;
    }
    return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
  }
  /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
  public com.google.privacy.dlp.v2.BigQueryKeyOrBuilder getBigQueryKeyOrBuilder() {
    if (typeCase_ == 3) {
      return (com.google.privacy.dlp.v2.BigQueryKey) type_;
    }
    return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
  }

  public static final int ID_VALUES_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList idValues_;
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of field identifiers specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   */
  public com.google.protobuf.ProtocolStringList getIdValuesList() {
    return idValues_;
  }
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of field identifiers specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   */
  public int getIdValuesCount() {
    return idValues_.size();
  }
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of field identifiers specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   */
  public java.lang.String getIdValues(int index) {
    return idValues_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Values of identifying columns in the given row. Order of values matches
   * the order of field identifiers specified in the scanning request.
   * </pre>
   *
   * <code>repeated string id_values = 5;</code>
   */
  public com.google.protobuf.ByteString getIdValuesBytes(int index) {
    return idValues_.getByteString(index);
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
    if (typeCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2.DatastoreKey) type_);
    }
    if (typeCase_ == 3) {
      output.writeMessage(3, (com.google.privacy.dlp.v2.BigQueryKey) type_);
    }
    for (int i = 0; i < idValues_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, idValues_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.privacy.dlp.v2.DatastoreKey) type_);
    }
    if (typeCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.privacy.dlp.v2.BigQueryKey) type_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < idValues_.size(); i++) {
        dataSize += computeStringSizeNoTag(idValues_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getIdValuesList().size();
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
    if (!(obj instanceof com.google.privacy.dlp.v2.RecordKey)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.RecordKey other = (com.google.privacy.dlp.v2.RecordKey) obj;

    if (!getIdValuesList().equals(other.getIdValuesList())) return false;
    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 2:
        if (!getDatastoreKey().equals(other.getDatastoreKey())) return false;
        break;
      case 3:
        if (!getBigQueryKey().equals(other.getBigQueryKey())) return false;
        break;
      case 0:
      default:
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
    if (getIdValuesCount() > 0) {
      hash = (37 * hash) + ID_VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getIdValuesList().hashCode();
    }
    switch (typeCase_) {
      case 2:
        hash = (37 * hash) + DATASTORE_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getDatastoreKey().hashCode();
        break;
      case 3:
        hash = (37 * hash) + BIG_QUERY_KEY_FIELD_NUMBER;
        hash = (53 * hash) + getBigQueryKey().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.RecordKey parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.RecordKey prototype) {
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
   * Message for a unique key indicating a record that contains a finding.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.RecordKey}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.RecordKey)
      com.google.privacy.dlp.v2.RecordKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_RecordKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_RecordKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.RecordKey.class,
              com.google.privacy.dlp.v2.RecordKey.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.RecordKey.newBuilder()
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
      idValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_RecordKey_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordKey getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.RecordKey.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordKey build() {
      com.google.privacy.dlp.v2.RecordKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.RecordKey buildPartial() {
      com.google.privacy.dlp.v2.RecordKey result = new com.google.privacy.dlp.v2.RecordKey(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (typeCase_ == 2) {
        if (datastoreKeyBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = datastoreKeyBuilder_.build();
        }
      }
      if (typeCase_ == 3) {
        if (bigQueryKeyBuilder_ == null) {
          result.type_ = type_;
        } else {
          result.type_ = bigQueryKeyBuilder_.build();
        }
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        idValues_ = idValues_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.idValues_ = idValues_;
      result.bitField0_ = to_bitField0_;
      result.typeCase_ = typeCase_;
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
      if (other instanceof com.google.privacy.dlp.v2.RecordKey) {
        return mergeFrom((com.google.privacy.dlp.v2.RecordKey) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.RecordKey other) {
      if (other == com.google.privacy.dlp.v2.RecordKey.getDefaultInstance()) return this;
      if (!other.idValues_.isEmpty()) {
        if (idValues_.isEmpty()) {
          idValues_ = other.idValues_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureIdValuesIsMutable();
          idValues_.addAll(other.idValues_);
        }
        onChanged();
      }
      switch (other.getTypeCase()) {
        case DATASTORE_KEY:
          {
            mergeDatastoreKey(other.getDatastoreKey());
            break;
          }
        case BIG_QUERY_KEY:
          {
            mergeBigQueryKey(other.getBigQueryKey());
            break;
          }
        case TYPE_NOT_SET:
          {
            break;
          }
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
      com.google.privacy.dlp.v2.RecordKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.RecordKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int typeCase_ = 0;
    private java.lang.Object type_;

    public TypeCase getTypeCase() {
      return TypeCase.forNumber(typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DatastoreKey,
            com.google.privacy.dlp.v2.DatastoreKey.Builder,
            com.google.privacy.dlp.v2.DatastoreKeyOrBuilder>
        datastoreKeyBuilder_;
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public boolean hasDatastoreKey() {
      return typeCase_ == 2;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public com.google.privacy.dlp.v2.DatastoreKey getDatastoreKey() {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2.DatastoreKey) type_;
        }
        return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
      } else {
        if (typeCase_ == 2) {
          return datastoreKeyBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder setDatastoreKey(com.google.privacy.dlp.v2.DatastoreKey value) {
      if (datastoreKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        datastoreKeyBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder setDatastoreKey(com.google.privacy.dlp.v2.DatastoreKey.Builder builderForValue) {
      if (datastoreKeyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        datastoreKeyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 2;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder mergeDatastoreKey(com.google.privacy.dlp.v2.DatastoreKey value) {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2
            && type_ != com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance()) {
          type_ =
              com.google.privacy.dlp.v2.DatastoreKey.newBuilder(
                      (com.google.privacy.dlp.v2.DatastoreKey) type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 2) {
          datastoreKeyBuilder_.mergeFrom(value);
        }
        datastoreKeyBuilder_.setMessage(value);
      }
      typeCase_ = 2;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public Builder clearDatastoreKey() {
      if (datastoreKeyBuilder_ == null) {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 2) {
          typeCase_ = 0;
          type_ = null;
        }
        datastoreKeyBuilder_.clear();
      }
      return this;
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public com.google.privacy.dlp.v2.DatastoreKey.Builder getDatastoreKeyBuilder() {
      return getDatastoreKeyFieldBuilder().getBuilder();
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    public com.google.privacy.dlp.v2.DatastoreKeyOrBuilder getDatastoreKeyOrBuilder() {
      if ((typeCase_ == 2) && (datastoreKeyBuilder_ != null)) {
        return datastoreKeyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 2) {
          return (com.google.privacy.dlp.v2.DatastoreKey) type_;
        }
        return com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.DatastoreKey datastore_key = 2;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DatastoreKey,
            com.google.privacy.dlp.v2.DatastoreKey.Builder,
            com.google.privacy.dlp.v2.DatastoreKeyOrBuilder>
        getDatastoreKeyFieldBuilder() {
      if (datastoreKeyBuilder_ == null) {
        if (!(typeCase_ == 2)) {
          type_ = com.google.privacy.dlp.v2.DatastoreKey.getDefaultInstance();
        }
        datastoreKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.DatastoreKey,
                com.google.privacy.dlp.v2.DatastoreKey.Builder,
                com.google.privacy.dlp.v2.DatastoreKeyOrBuilder>(
                (com.google.privacy.dlp.v2.DatastoreKey) type_, getParentForChildren(), isClean());
        type_ = null;
      }
      typeCase_ = 2;
      onChanged();
      ;
      return datastoreKeyBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryKey,
            com.google.privacy.dlp.v2.BigQueryKey.Builder,
            com.google.privacy.dlp.v2.BigQueryKeyOrBuilder>
        bigQueryKeyBuilder_;
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public boolean hasBigQueryKey() {
      return typeCase_ == 3;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public com.google.privacy.dlp.v2.BigQueryKey getBigQueryKey() {
      if (bigQueryKeyBuilder_ == null) {
        if (typeCase_ == 3) {
          return (com.google.privacy.dlp.v2.BigQueryKey) type_;
        }
        return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
      } else {
        if (typeCase_ == 3) {
          return bigQueryKeyBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder setBigQueryKey(com.google.privacy.dlp.v2.BigQueryKey value) {
      if (bigQueryKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        bigQueryKeyBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder setBigQueryKey(com.google.privacy.dlp.v2.BigQueryKey.Builder builderForValue) {
      if (bigQueryKeyBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        bigQueryKeyBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 3;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder mergeBigQueryKey(com.google.privacy.dlp.v2.BigQueryKey value) {
      if (bigQueryKeyBuilder_ == null) {
        if (typeCase_ == 3 && type_ != com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance()) {
          type_ =
              com.google.privacy.dlp.v2.BigQueryKey.newBuilder(
                      (com.google.privacy.dlp.v2.BigQueryKey) type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 3) {
          bigQueryKeyBuilder_.mergeFrom(value);
        }
        bigQueryKeyBuilder_.setMessage(value);
      }
      typeCase_ = 3;
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public Builder clearBigQueryKey() {
      if (bigQueryKeyBuilder_ == null) {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 3) {
          typeCase_ = 0;
          type_ = null;
        }
        bigQueryKeyBuilder_.clear();
      }
      return this;
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public com.google.privacy.dlp.v2.BigQueryKey.Builder getBigQueryKeyBuilder() {
      return getBigQueryKeyFieldBuilder().getBuilder();
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    public com.google.privacy.dlp.v2.BigQueryKeyOrBuilder getBigQueryKeyOrBuilder() {
      if ((typeCase_ == 3) && (bigQueryKeyBuilder_ != null)) {
        return bigQueryKeyBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 3) {
          return (com.google.privacy.dlp.v2.BigQueryKey) type_;
        }
        return com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
      }
    }
    /** <code>.google.privacy.dlp.v2.BigQueryKey big_query_key = 3;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryKey,
            com.google.privacy.dlp.v2.BigQueryKey.Builder,
            com.google.privacy.dlp.v2.BigQueryKeyOrBuilder>
        getBigQueryKeyFieldBuilder() {
      if (bigQueryKeyBuilder_ == null) {
        if (!(typeCase_ == 3)) {
          type_ = com.google.privacy.dlp.v2.BigQueryKey.getDefaultInstance();
        }
        bigQueryKeyBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.BigQueryKey,
                com.google.privacy.dlp.v2.BigQueryKey.Builder,
                com.google.privacy.dlp.v2.BigQueryKeyOrBuilder>(
                (com.google.privacy.dlp.v2.BigQueryKey) type_, getParentForChildren(), isClean());
        type_ = null;
      }
      typeCase_ = 3;
      onChanged();
      ;
      return bigQueryKeyBuilder_;
    }

    private com.google.protobuf.LazyStringList idValues_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureIdValuesIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        idValues_ = new com.google.protobuf.LazyStringArrayList(idValues_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList getIdValuesList() {
      return idValues_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public int getIdValuesCount() {
      return idValues_.size();
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public java.lang.String getIdValues(int index) {
      return idValues_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public com.google.protobuf.ByteString getIdValuesBytes(int index) {
      return idValues_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public Builder setIdValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIdValuesIsMutable();
      idValues_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public Builder addIdValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIdValuesIsMutable();
      idValues_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public Builder addAllIdValues(java.lang.Iterable<java.lang.String> values) {
      ensureIdValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, idValues_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public Builder clearIdValues() {
      idValues_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Values of identifying columns in the given row. Order of values matches
     * the order of field identifiers specified in the scanning request.
     * </pre>
     *
     * <code>repeated string id_values = 5;</code>
     */
    public Builder addIdValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureIdValuesIsMutable();
      idValues_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.RecordKey)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.RecordKey)
  private static final com.google.privacy.dlp.v2.RecordKey DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.RecordKey();
  }

  public static com.google.privacy.dlp.v2.RecordKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordKey> PARSER =
      new com.google.protobuf.AbstractParser<RecordKey>() {
        @java.lang.Override
        public RecordKey parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new RecordKey(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<RecordKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.RecordKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
