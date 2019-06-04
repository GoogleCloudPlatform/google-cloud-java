// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/service.proto

package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for [AutoMl.ImportData][google.cloud.automl.v1beta1.AutoMl.ImportData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.automl.v1beta1.ImportDataRequest}
 */
public final class ImportDataRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.automl.v1beta1.ImportDataRequest)
    ImportDataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportDataRequest.newBuilder() to construct.
  private ImportDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportDataRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportDataRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ImportDataRequest(
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

              name_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.automl.v1beta1.InputConfig.Builder subBuilder = null;
              if (inputConfig_ != null) {
                subBuilder = inputConfig_.toBuilder();
              }
              inputConfig_ =
                  input.readMessage(
                      com.google.cloud.automl.v1beta1.InputConfig.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(inputConfig_);
                inputConfig_ = subBuilder.buildPartial();
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_ImportDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.automl.v1beta1.AutoMlProto
        .internal_static_google_cloud_automl_v1beta1_ImportDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.automl.v1beta1.ImportDataRequest.class,
            com.google.cloud.automl.v1beta1.ImportDataRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. Dataset name. Dataset must already exist. All imported
   * annotations and examples will be added.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Dataset name. Dataset must already exist. All imported
   * annotations and examples will be added.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.automl.v1beta1.InputConfig inputConfig_;
  /**
   *
   *
   * <pre>
   * Required. The desired input location and its domain specific semantics,
   * if any.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
   */
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The desired input location and its domain specific semantics,
   * if any.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
   */
  public com.google.cloud.automl.v1beta1.InputConfig getInputConfig() {
    return inputConfig_ == null
        ? com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance()
        : inputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. The desired input location and its domain specific semantics,
   * if any.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
   */
  public com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
    return getInputConfig();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (inputConfig_ != null) {
      output.writeMessage(3, getInputConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getInputConfig());
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
    if (!(obj instanceof com.google.cloud.automl.v1beta1.ImportDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.automl.v1beta1.ImportDataRequest other =
        (com.google.cloud.automl.v1beta1.ImportDataRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig().equals(other.getInputConfig())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.automl.v1beta1.ImportDataRequest prototype) {
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
   * Request message for [AutoMl.ImportData][google.cloud.automl.v1beta1.AutoMl.ImportData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.automl.v1beta1.ImportDataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.automl.v1beta1.ImportDataRequest)
      com.google.cloud.automl.v1beta1.ImportDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_ImportDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_ImportDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.automl.v1beta1.ImportDataRequest.class,
              com.google.cloud.automl.v1beta1.ImportDataRequest.Builder.class);
    }

    // Construct using com.google.cloud.automl.v1beta1.ImportDataRequest.newBuilder()
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
      name_ = "";

      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.automl.v1beta1.AutoMlProto
          .internal_static_google_cloud_automl_v1beta1_ImportDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImportDataRequest getDefaultInstanceForType() {
      return com.google.cloud.automl.v1beta1.ImportDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImportDataRequest build() {
      com.google.cloud.automl.v1beta1.ImportDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.automl.v1beta1.ImportDataRequest buildPartial() {
      com.google.cloud.automl.v1beta1.ImportDataRequest result =
          new com.google.cloud.automl.v1beta1.ImportDataRequest(this);
      result.name_ = name_;
      if (inputConfigBuilder_ == null) {
        result.inputConfig_ = inputConfig_;
      } else {
        result.inputConfig_ = inputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.automl.v1beta1.ImportDataRequest) {
        return mergeFrom((com.google.cloud.automl.v1beta1.ImportDataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.automl.v1beta1.ImportDataRequest other) {
      if (other == com.google.cloud.automl.v1beta1.ImportDataRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
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
      com.google.cloud.automl.v1beta1.ImportDataRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.automl.v1beta1.ImportDataRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Dataset name. Dataset must already exist. All imported
     * annotations and examples will be added.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset name. Dataset must already exist. All imported
     * annotations and examples will be added.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset name. Dataset must already exist. All imported
     * annotations and examples will be added.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset name. Dataset must already exist. All imported
     * annotations and examples will be added.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset name. Dataset must already exist. All imported
     * annotations and examples will be added.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.automl.v1beta1.InputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.InputConfig,
            com.google.cloud.automl.v1beta1.InputConfig.Builder,
            com.google.cloud.automl.v1beta1.InputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public boolean hasInputConfig() {
      return inputConfigBuilder_ != null || inputConfig_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.InputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null
            ? com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance()
            : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public Builder setInputConfig(com.google.cloud.automl.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public Builder setInputConfig(
        com.google.cloud.automl.v1beta1.InputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
        onChanged();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public Builder mergeInputConfig(com.google.cloud.automl.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (inputConfig_ != null) {
          inputConfig_ =
              com.google.cloud.automl.v1beta1.InputConfig.newBuilder(inputConfig_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          inputConfig_ = value;
        }
        onChanged();
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public Builder clearInputConfig() {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = null;
        onChanged();
      } else {
        inputConfig_ = null;
        inputConfigBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.InputConfig.Builder getInputConfigBuilder() {

      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    public com.google.cloud.automl.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null
            ? com.google.cloud.automl.v1beta1.InputConfig.getDefaultInstance()
            : inputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The desired input location and its domain specific semantics,
     * if any.
     * </pre>
     *
     * <code>.google.cloud.automl.v1beta1.InputConfig input_config = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.automl.v1beta1.InputConfig,
            com.google.cloud.automl.v1beta1.InputConfig.Builder,
            com.google.cloud.automl.v1beta1.InputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.automl.v1beta1.InputConfig,
                com.google.cloud.automl.v1beta1.InputConfig.Builder,
                com.google.cloud.automl.v1beta1.InputConfigOrBuilder>(
                getInputConfig(), getParentForChildren(), isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.automl.v1beta1.ImportDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.automl.v1beta1.ImportDataRequest)
  private static final com.google.cloud.automl.v1beta1.ImportDataRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.automl.v1beta1.ImportDataRequest();
  }

  public static com.google.cloud.automl.v1beta1.ImportDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportDataRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportDataRequest>() {
        @java.lang.Override
        public ImportDataRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ImportDataRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ImportDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.automl.v1beta1.ImportDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
