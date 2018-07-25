// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The protocol for the `CreateUptimeCheckConfig` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateUptimeCheckConfigRequest}
 */
public  final class CreateUptimeCheckConfigRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateUptimeCheckConfigRequest)
    CreateUptimeCheckConfigRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateUptimeCheckConfigRequest.newBuilder() to construct.
  private CreateUptimeCheckConfigRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateUptimeCheckConfigRequest() {
    parent_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateUptimeCheckConfigRequest(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            parent_ = s;
            break;
          }
          case 18: {
            com.google.monitoring.v3.UptimeCheckConfig.Builder subBuilder = null;
            if (uptimeCheckConfig_ != null) {
              subBuilder = uptimeCheckConfig_.toBuilder();
            }
            uptimeCheckConfig_ = input.readMessage(com.google.monitoring.v3.UptimeCheckConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(uptimeCheckConfig_);
              uptimeCheckConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateUptimeCheckConfigRequest.class, com.google.monitoring.v3.CreateUptimeCheckConfigRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   * <pre>
   * The project in which to create the uptime check. The format is:
   *   `projects/[PROJECT_ID]`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The project in which to create the uptime check. The format is:
   *   `projects/[PROJECT_ID]`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString
      getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPTIME_CHECK_CONFIG_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.UptimeCheckConfig uptimeCheckConfig_;
  /**
   * <pre>
   * The new uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
   */
  public boolean hasUptimeCheckConfig() {
    return uptimeCheckConfig_ != null;
  }
  /**
   * <pre>
   * The new uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
   */
  public com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig() {
    return uptimeCheckConfig_ == null ? com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance() : uptimeCheckConfig_;
  }
  /**
   * <pre>
   * The new uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
   */
  public com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder() {
    return getUptimeCheckConfig();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (uptimeCheckConfig_ != null) {
      output.writeMessage(2, getUptimeCheckConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (uptimeCheckConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUptimeCheckConfig());
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
    if (!(obj instanceof com.google.monitoring.v3.CreateUptimeCheckConfigRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateUptimeCheckConfigRequest other = (com.google.monitoring.v3.CreateUptimeCheckConfigRequest) obj;

    boolean result = true;
    result = result && getParent()
        .equals(other.getParent());
    result = result && (hasUptimeCheckConfig() == other.hasUptimeCheckConfig());
    if (hasUptimeCheckConfig()) {
      result = result && getUptimeCheckConfig()
          .equals(other.getUptimeCheckConfig());
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasUptimeCheckConfig()) {
      hash = (37 * hash) + UPTIME_CHECK_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getUptimeCheckConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest parseFrom(
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
  public static Builder newBuilder(com.google.monitoring.v3.CreateUptimeCheckConfigRequest prototype) {
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
   * The protocol for the `CreateUptimeCheckConfig` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateUptimeCheckConfigRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateUptimeCheckConfigRequest)
      com.google.monitoring.v3.CreateUptimeCheckConfigRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateUptimeCheckConfigRequest.class, com.google.monitoring.v3.CreateUptimeCheckConfigRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateUptimeCheckConfigRequest.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfig_ = null;
      } else {
        uptimeCheckConfig_ = null;
        uptimeCheckConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.UptimeServiceProto.internal_static_google_monitoring_v3_CreateUptimeCheckConfigRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateUptimeCheckConfigRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateUptimeCheckConfigRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateUptimeCheckConfigRequest build() {
      com.google.monitoring.v3.CreateUptimeCheckConfigRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateUptimeCheckConfigRequest buildPartial() {
      com.google.monitoring.v3.CreateUptimeCheckConfigRequest result = new com.google.monitoring.v3.CreateUptimeCheckConfigRequest(this);
      result.parent_ = parent_;
      if (uptimeCheckConfigBuilder_ == null) {
        result.uptimeCheckConfig_ = uptimeCheckConfig_;
      } else {
        result.uptimeCheckConfig_ = uptimeCheckConfigBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.CreateUptimeCheckConfigRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateUptimeCheckConfigRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateUptimeCheckConfigRequest other) {
      if (other == com.google.monitoring.v3.CreateUptimeCheckConfigRequest.getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasUptimeCheckConfig()) {
        mergeUptimeCheckConfig(other.getUptimeCheckConfig());
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
      com.google.monitoring.v3.CreateUptimeCheckConfigRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.CreateUptimeCheckConfigRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     * <pre>
     * The project in which to create the uptime check. The format is:
     *   `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The project in which to create the uptime check. The format is:
     *   `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString
        getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The project in which to create the uptime check. The format is:
     *   `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      parent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project in which to create the uptime check. The format is:
     *   `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {
      
      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The project in which to create the uptime check. The format is:
     *   `projects/[PROJECT_ID]`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.monitoring.v3.UptimeCheckConfig uptimeCheckConfig_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.UptimeCheckConfig, com.google.monitoring.v3.UptimeCheckConfig.Builder, com.google.monitoring.v3.UptimeCheckConfigOrBuilder> uptimeCheckConfigBuilder_;
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public boolean hasUptimeCheckConfig() {
      return uptimeCheckConfigBuilder_ != null || uptimeCheckConfig_ != null;
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig() {
      if (uptimeCheckConfigBuilder_ == null) {
        return uptimeCheckConfig_ == null ? com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance() : uptimeCheckConfig_;
      } else {
        return uptimeCheckConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public Builder setUptimeCheckConfig(com.google.monitoring.v3.UptimeCheckConfig value) {
      if (uptimeCheckConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        uptimeCheckConfig_ = value;
        onChanged();
      } else {
        uptimeCheckConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public Builder setUptimeCheckConfig(
        com.google.monitoring.v3.UptimeCheckConfig.Builder builderForValue) {
      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfig_ = builderForValue.build();
        onChanged();
      } else {
        uptimeCheckConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public Builder mergeUptimeCheckConfig(com.google.monitoring.v3.UptimeCheckConfig value) {
      if (uptimeCheckConfigBuilder_ == null) {
        if (uptimeCheckConfig_ != null) {
          uptimeCheckConfig_ =
            com.google.monitoring.v3.UptimeCheckConfig.newBuilder(uptimeCheckConfig_).mergeFrom(value).buildPartial();
        } else {
          uptimeCheckConfig_ = value;
        }
        onChanged();
      } else {
        uptimeCheckConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public Builder clearUptimeCheckConfig() {
      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfig_ = null;
        onChanged();
      } else {
        uptimeCheckConfig_ = null;
        uptimeCheckConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public com.google.monitoring.v3.UptimeCheckConfig.Builder getUptimeCheckConfigBuilder() {
      
      onChanged();
      return getUptimeCheckConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    public com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder() {
      if (uptimeCheckConfigBuilder_ != null) {
        return uptimeCheckConfigBuilder_.getMessageOrBuilder();
      } else {
        return uptimeCheckConfig_ == null ?
            com.google.monitoring.v3.UptimeCheckConfig.getDefaultInstance() : uptimeCheckConfig_;
      }
    }
    /**
     * <pre>
     * The new uptime check configuration.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.monitoring.v3.UptimeCheckConfig, com.google.monitoring.v3.UptimeCheckConfig.Builder, com.google.monitoring.v3.UptimeCheckConfigOrBuilder> 
        getUptimeCheckConfigFieldBuilder() {
      if (uptimeCheckConfigBuilder_ == null) {
        uptimeCheckConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.UptimeCheckConfig, com.google.monitoring.v3.UptimeCheckConfig.Builder, com.google.monitoring.v3.UptimeCheckConfigOrBuilder>(
                getUptimeCheckConfig(),
                getParentForChildren(),
                isClean());
        uptimeCheckConfig_ = null;
      }
      return uptimeCheckConfigBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateUptimeCheckConfigRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateUptimeCheckConfigRequest)
  private static final com.google.monitoring.v3.CreateUptimeCheckConfigRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateUptimeCheckConfigRequest();
  }

  public static com.google.monitoring.v3.CreateUptimeCheckConfigRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateUptimeCheckConfigRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateUptimeCheckConfigRequest>() {
    @java.lang.Override
    public CreateUptimeCheckConfigRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateUptimeCheckConfigRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateUptimeCheckConfigRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateUptimeCheckConfigRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateUptimeCheckConfigRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

