// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/gcs.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Google Cloud Storage location for the inputs.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.GcsSources}
 */
public final class GcsSources extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.GcsSources)
    GcsSourcesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GcsSources.newBuilder() to construct.
  private GcsSources(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GcsSources() {
    uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GcsSources();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.GcsProto.internal_static_google_cloud_dialogflow_v2_GcsSources_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.GcsProto.internal_static_google_cloud_dialogflow_v2_GcsSources_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.GcsSources.class, com.google.cloud.dialogflow.v2.GcsSources.Builder.class);
  }

  public static final int URIS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList uris_;
  /**
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
   *   gs://bucket/object-prefix-or-name
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return A list containing the uris.
   */
  public com.google.protobuf.ProtocolStringList
      getUrisList() {
    return uris_;
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
   *   gs://bucket/object-prefix-or-name
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The count of uris.
   */
  public int getUrisCount() {
    return uris_.size();
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
   *   gs://bucket/object-prefix-or-name
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the element to return.
   * @return The uris at the given index.
   */
  public java.lang.String getUris(int index) {
    return uris_.get(index);
  }
  /**
   * <pre>
   * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
   *   gs://bucket/object-prefix-or-name
   * Whether a prefix or name is used depends on the use case.
   * </pre>
   *
   * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @param index The index of the value to return.
   * @return The bytes of the uris at the given index.
   */
  public com.google.protobuf.ByteString
      getUrisBytes(int index) {
    return uris_.getByteString(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < uris_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uris_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < uris_.size(); i++) {
        dataSize += computeStringSizeNoTag(uris_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getUrisList().size();
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.GcsSources)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.GcsSources other = (com.google.cloud.dialogflow.v2.GcsSources) obj;

    if (!getUrisList()
        .equals(other.getUrisList())) return false;
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
    if (getUrisCount() > 0) {
      hash = (37 * hash) + URIS_FIELD_NUMBER;
      hash = (53 * hash) + getUrisList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.GcsSources parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.GcsSources prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Google Cloud Storage location for the inputs.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.GcsSources}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.GcsSources)
      com.google.cloud.dialogflow.v2.GcsSourcesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.GcsProto.internal_static_google_cloud_dialogflow_v2_GcsSources_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.GcsProto.internal_static_google_cloud_dialogflow_v2_GcsSources_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.GcsSources.class, com.google.cloud.dialogflow.v2.GcsSources.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.GcsSources.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.GcsProto.internal_static_google_cloud_dialogflow_v2_GcsSources_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.GcsSources getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.GcsSources.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.GcsSources build() {
      com.google.cloud.dialogflow.v2.GcsSources result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.GcsSources buildPartial() {
      com.google.cloud.dialogflow.v2.GcsSources result = new com.google.cloud.dialogflow.v2.GcsSources(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        uris_ = uris_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.uris_ = uris_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.GcsSources) {
        return mergeFrom((com.google.cloud.dialogflow.v2.GcsSources)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.GcsSources other) {
      if (other == com.google.cloud.dialogflow.v2.GcsSources.getDefaultInstance()) return this;
      if (!other.uris_.isEmpty()) {
        if (uris_.isEmpty()) {
          uris_ = other.uris_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureUrisIsMutable();
          uris_.addAll(other.uris_);
        }
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureUrisIsMutable();
              uris_.add(s);
              break;
            } // case 18
            default: {
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

    private com.google.protobuf.LazyStringList uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureUrisIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        uris_ = new com.google.protobuf.LazyStringArrayList(uris_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return A list containing the uris.
     */
    public com.google.protobuf.ProtocolStringList
        getUrisList() {
      return uris_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The count of uris.
     */
    public int getUrisCount() {
      return uris_.size();
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the element to return.
     * @return The uris at the given index.
     */
    public java.lang.String getUris(int index) {
      return uris_.get(index);
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index of the value to return.
     * @return The bytes of the uris at the given index.
     */
    public com.google.protobuf.ByteString
        getUrisBytes(int index) {
      return uris_.getByteString(index);
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param index The index to set the value at.
     * @param value The uris to set.
     * @return This builder for chaining.
     */
    public Builder setUris(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUrisIsMutable();
      uris_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The uris to add.
     * @return This builder for chaining.
     */
    public Builder addUris(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureUrisIsMutable();
      uris_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param values The uris to add.
     * @return This builder for chaining.
     */
    public Builder addAllUris(
        java.lang.Iterable<java.lang.String> values) {
      ensureUrisIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, uris_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearUris() {
      uris_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Google Cloud Storage URIs for the inputs. A URI is of the form:
     *   gs://bucket/object-prefix-or-name
     * Whether a prefix or name is used depends on the use case.
     * </pre>
     *
     * <code>repeated string uris = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes of the uris to add.
     * @return This builder for chaining.
     */
    public Builder addUrisBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureUrisIsMutable();
      uris_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.GcsSources)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.GcsSources)
  private static final com.google.cloud.dialogflow.v2.GcsSources DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.GcsSources();
  }

  public static com.google.cloud.dialogflow.v2.GcsSources getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GcsSources>
      PARSER = new com.google.protobuf.AbstractParser<GcsSources>() {
    @java.lang.Override
    public GcsSources parsePartialFrom(
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

  public static com.google.protobuf.Parser<GcsSources> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GcsSources> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.GcsSources getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

