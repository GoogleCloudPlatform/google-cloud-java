// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/operations.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.datalabeling.v1beta1;

/**
 * <pre>
 * Metadata of a LabelImageClassification operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata}
 */
public final class LabelImageClassificationOperationMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata)
    LabelImageClassificationOperationMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LabelImageClassificationOperationMetadata.newBuilder() to construct.
  private LabelImageClassificationOperationMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LabelImageClassificationOperationMetadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LabelImageClassificationOperationMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.datalabeling.v1beta1.Operations.internal_static_google_cloud_datalabeling_v1beta1_LabelImageClassificationOperationMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datalabeling.v1beta1.Operations.internal_static_google_cloud_datalabeling_v1beta1_LabelImageClassificationOperationMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.class, com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int BASIC_CONFIG_FIELD_NUMBER = 1;
  private com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basicConfig_;
  /**
   * <pre>
   * Basic human annotation config used in labeling request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
   * @return Whether the basicConfig field is set.
   */
  @java.lang.Override
  public boolean hasBasicConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Basic human annotation config used in labeling request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
   * @return The basicConfig.
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig() {
    return basicConfig_ == null ? com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance() : basicConfig_;
  }
  /**
   * <pre>
   * Basic human annotation config used in labeling request.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder getBasicConfigOrBuilder() {
    return basicConfig_ == null ? com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance() : basicConfig_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getBasicConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBasicConfig());
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
    if (!(obj instanceof com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata other = (com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata) obj;

    if (hasBasicConfig() != other.hasBasicConfig()) return false;
    if (hasBasicConfig()) {
      if (!getBasicConfig()
          .equals(other.getBasicConfig())) return false;
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
    if (hasBasicConfig()) {
      hash = (37 * hash) + BASIC_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getBasicConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata prototype) {
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
   * Metadata of a LabelImageClassification operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata)
      com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.datalabeling.v1beta1.Operations.internal_static_google_cloud_datalabeling_v1beta1_LabelImageClassificationOperationMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datalabeling.v1beta1.Operations.internal_static_google_cloud_datalabeling_v1beta1_LabelImageClassificationOperationMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.class, com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.Builder.class);
    }

    // Construct using com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.newBuilder()
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
        getBasicConfigFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      basicConfig_ = null;
      if (basicConfigBuilder_ != null) {
        basicConfigBuilder_.dispose();
        basicConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.datalabeling.v1beta1.Operations.internal_static_google_cloud_datalabeling_v1beta1_LabelImageClassificationOperationMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata getDefaultInstanceForType() {
      return com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata build() {
      com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata buildPartial() {
      com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata result = new com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.basicConfig_ = basicConfigBuilder_ == null
            ? basicConfig_
            : basicConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata) {
        return mergeFrom((com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata other) {
      if (other == com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata.getDefaultInstance()) return this;
      if (other.hasBasicConfig()) {
        mergeBasicConfig(other.getBasicConfig());
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
            case 10: {
              input.readMessage(
                  getBasicConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basicConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig, com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder, com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder> basicConfigBuilder_;
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     * @return Whether the basicConfig field is set.
     */
    public boolean hasBasicConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     * @return The basicConfig.
     */
    public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig() {
      if (basicConfigBuilder_ == null) {
        return basicConfig_ == null ? com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance() : basicConfig_;
      } else {
        return basicConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    public Builder setBasicConfig(com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig value) {
      if (basicConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        basicConfig_ = value;
      } else {
        basicConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    public Builder setBasicConfig(
        com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder builderForValue) {
      if (basicConfigBuilder_ == null) {
        basicConfig_ = builderForValue.build();
      } else {
        basicConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    public Builder mergeBasicConfig(com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig value) {
      if (basicConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          basicConfig_ != null &&
          basicConfig_ != com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance()) {
          getBasicConfigBuilder().mergeFrom(value);
        } else {
          basicConfig_ = value;
        }
      } else {
        basicConfigBuilder_.mergeFrom(value);
      }
      if (basicConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    public Builder clearBasicConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      basicConfig_ = null;
      if (basicConfigBuilder_ != null) {
        basicConfigBuilder_.dispose();
        basicConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder getBasicConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBasicConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    public com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder getBasicConfigOrBuilder() {
      if (basicConfigBuilder_ != null) {
        return basicConfigBuilder_.getMessageOrBuilder();
      } else {
        return basicConfig_ == null ?
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.getDefaultInstance() : basicConfig_;
      }
    }
    /**
     * <pre>
     * Basic human annotation config used in labeling request.
     * </pre>
     *
     * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig, com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder, com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder> 
        getBasicConfigFieldBuilder() {
      if (basicConfigBuilder_ == null) {
        basicConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig, com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig.Builder, com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder>(
                getBasicConfig(),
                getParentForChildren(),
                isClean());
        basicConfig_ = null;
      }
      return basicConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata)
  private static final com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata();
  }

  public static com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LabelImageClassificationOperationMetadata>
      PARSER = new com.google.protobuf.AbstractParser<LabelImageClassificationOperationMetadata>() {
    @java.lang.Override
    public LabelImageClassificationOperationMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<LabelImageClassificationOperationMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LabelImageClassificationOperationMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datalabeling.v1beta1.LabelImageClassificationOperationMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

