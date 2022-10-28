// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3beta1/experiment.proto

package com.google.cloud.dialogflow.cx.v3beta1;

/**
 * <pre>
 * The history of variants update.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.VariantsHistory}
 */
public final class VariantsHistory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.VariantsHistory)
    VariantsHistoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VariantsHistory.newBuilder() to construct.
  private VariantsHistory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VariantsHistory() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VariantsHistory();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.class, com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.Builder.class);
  }

  private int variantsCase_ = 0;
  private java.lang.Object variants_;
  public enum VariantsCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VERSION_VARIANTS(1),
    VARIANTS_NOT_SET(0);
    private final int value;
    private VariantsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VariantsCase valueOf(int value) {
      return forNumber(value);
    }

    public static VariantsCase forNumber(int value) {
      switch (value) {
        case 1: return VERSION_VARIANTS;
        case 0: return VARIANTS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public VariantsCase
  getVariantsCase() {
    return VariantsCase.forNumber(
        variantsCase_);
  }

  public static final int VERSION_VARIANTS_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The flow versions as the variants.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
   * @return Whether the versionVariants field is set.
   */
  @java.lang.Override
  public boolean hasVersionVariants() {
    return variantsCase_ == 1;
  }
  /**
   * <pre>
   * The flow versions as the variants.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
   * @return The versionVariants.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.VersionVariants getVersionVariants() {
    if (variantsCase_ == 1) {
       return (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_;
    }
    return com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance();
  }
  /**
   * <pre>
   * The flow versions as the variants.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.VersionVariantsOrBuilder getVersionVariantsOrBuilder() {
    if (variantsCase_ == 1) {
       return (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_;
    }
    return com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance();
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   * <pre>
   * Update time of the variants.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   * <pre>
   * Update time of the variants.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   * <pre>
   * Update time of the variants.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
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
    if (variantsCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_);
    }
    if (updateTime_ != null) {
      output.writeMessage(2, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (variantsCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_);
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory other = (com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime()
          .equals(other.getUpdateTime())) return false;
    }
    if (!getVariantsCase().equals(other.getVariantsCase())) return false;
    switch (variantsCase_) {
      case 1:
        if (!getVersionVariants()
            .equals(other.getVersionVariants())) return false;
        break;
      case 0:
      default:
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
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    switch (variantsCase_) {
      case 1:
        hash = (37 * hash) + VERSION_VARIANTS_FIELD_NUMBER;
        hash = (53 * hash) + getVersionVariants().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory prototype) {
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
   * The history of variants update.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.VariantsHistory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.VariantsHistory)
      com.google.cloud.dialogflow.cx.v3beta1.VariantsHistoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.class, com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (versionVariantsBuilder_ != null) {
        versionVariantsBuilder_.clear();
      }
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      variantsCase_ = 0;
      variants_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.ExperimentProto.internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory build() {
      com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory result = new com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory(this);
      if (variantsCase_ == 1) {
        if (versionVariantsBuilder_ == null) {
          result.variants_ = variants_;
        } else {
          result.variants_ = versionVariantsBuilder_.build();
        }
      }
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.variantsCase_ = variantsCase_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory.getDefaultInstance()) return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      switch (other.getVariantsCase()) {
        case VERSION_VARIANTS: {
          mergeVersionVariants(other.getVersionVariants());
          break;
        }
        case VARIANTS_NOT_SET: {
          break;
        }
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
                  getVersionVariantsFieldBuilder().getBuilder(),
                  extensionRegistry);
              variantsCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateTimeFieldBuilder().getBuilder(),
                  extensionRegistry);

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
    private int variantsCase_ = 0;
    private java.lang.Object variants_;
    public VariantsCase
        getVariantsCase() {
      return VariantsCase.forNumber(
          variantsCase_);
    }

    public Builder clearVariants() {
      variantsCase_ = 0;
      variants_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.VersionVariants, com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.Builder, com.google.cloud.dialogflow.cx.v3beta1.VersionVariantsOrBuilder> versionVariantsBuilder_;
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     * @return Whether the versionVariants field is set.
     */
    @java.lang.Override
    public boolean hasVersionVariants() {
      return variantsCase_ == 1;
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     * @return The versionVariants.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.VersionVariants getVersionVariants() {
      if (versionVariantsBuilder_ == null) {
        if (variantsCase_ == 1) {
          return (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_;
        }
        return com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance();
      } else {
        if (variantsCase_ == 1) {
          return versionVariantsBuilder_.getMessage();
        }
        return com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    public Builder setVersionVariants(com.google.cloud.dialogflow.cx.v3beta1.VersionVariants value) {
      if (versionVariantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        variants_ = value;
        onChanged();
      } else {
        versionVariantsBuilder_.setMessage(value);
      }
      variantsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    public Builder setVersionVariants(
        com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.Builder builderForValue) {
      if (versionVariantsBuilder_ == null) {
        variants_ = builderForValue.build();
        onChanged();
      } else {
        versionVariantsBuilder_.setMessage(builderForValue.build());
      }
      variantsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    public Builder mergeVersionVariants(com.google.cloud.dialogflow.cx.v3beta1.VersionVariants value) {
      if (versionVariantsBuilder_ == null) {
        if (variantsCase_ == 1 &&
            variants_ != com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance()) {
          variants_ = com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.newBuilder((com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_)
              .mergeFrom(value).buildPartial();
        } else {
          variants_ = value;
        }
        onChanged();
      } else {
        if (variantsCase_ == 1) {
          versionVariantsBuilder_.mergeFrom(value);
        } else {
          versionVariantsBuilder_.setMessage(value);
        }
      }
      variantsCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    public Builder clearVersionVariants() {
      if (versionVariantsBuilder_ == null) {
        if (variantsCase_ == 1) {
          variantsCase_ = 0;
          variants_ = null;
          onChanged();
        }
      } else {
        if (variantsCase_ == 1) {
          variantsCase_ = 0;
          variants_ = null;
        }
        versionVariantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    public com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.Builder getVersionVariantsBuilder() {
      return getVersionVariantsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.VersionVariantsOrBuilder getVersionVariantsOrBuilder() {
      if ((variantsCase_ == 1) && (versionVariantsBuilder_ != null)) {
        return versionVariantsBuilder_.getMessageOrBuilder();
      } else {
        if (variantsCase_ == 1) {
          return (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_;
        }
        return com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * The flow versions as the variants.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.VersionVariants version_variants = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.dialogflow.cx.v3beta1.VersionVariants, com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.Builder, com.google.cloud.dialogflow.cx.v3beta1.VersionVariantsOrBuilder> 
        getVersionVariantsFieldBuilder() {
      if (versionVariantsBuilder_ == null) {
        if (!(variantsCase_ == 1)) {
          variants_ = com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.getDefaultInstance();
        }
        versionVariantsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.cx.v3beta1.VersionVariants, com.google.cloud.dialogflow.cx.v3beta1.VersionVariants.Builder, com.google.cloud.dialogflow.cx.v3beta1.VersionVariantsOrBuilder>(
                (com.google.cloud.dialogflow.cx.v3beta1.VersionVariants) variants_,
                getParentForChildren(),
                isClean());
        variants_ = null;
      }
      variantsCase_ = 1;
      onChanged();;
      return versionVariantsBuilder_;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> updateTimeBuilder_;
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder setUpdateTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
            com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
      }
    }
    /**
     * <pre>
     * Update time of the variants.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(),
                getParentForChildren(),
                isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.VariantsHistory)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.VariantsHistory)
  private static final com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VariantsHistory>
      PARSER = new com.google.protobuf.AbstractParser<VariantsHistory>() {
    @java.lang.Override
    public VariantsHistory parsePartialFrom(
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

  public static com.google.protobuf.Parser<VariantsHistory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VariantsHistory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.VariantsHistory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

