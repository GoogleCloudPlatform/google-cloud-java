// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/networksecurity/v1/tls.proto

package com.google.cloud.networksecurity.v1;

/**
 * <pre>
 * Specification of a TLS certificate provider instance. Workloads may have one
 * or more CertificateProvider instances (plugins) and one of them is enabled
 * and configured by specifying this message. Workloads use the values from this
 * message to locate and load the CertificateProvider instance configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1.CertificateProviderInstance}
 */
public final class CertificateProviderInstance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1.CertificateProviderInstance)
    CertificateProviderInstanceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CertificateProviderInstance.newBuilder() to construct.
  private CertificateProviderInstance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CertificateProviderInstance() {
    pluginInstance_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CertificateProviderInstance();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.networksecurity.v1.TlsProto.internal_static_google_cloud_networksecurity_v1_CertificateProviderInstance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1.TlsProto.internal_static_google_cloud_networksecurity_v1_CertificateProviderInstance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1.CertificateProviderInstance.class, com.google.cloud.networksecurity.v1.CertificateProviderInstance.Builder.class);
  }

  public static final int PLUGIN_INSTANCE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pluginInstance_ = "";
  /**
   * <pre>
   * Required. Plugin instance name, used to locate and load CertificateProvider instance
   * configuration. Set to "google_cloud_private_spiffe" to use Certificate
   * Authority Service certificate provider instance.
   * </pre>
   *
   * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The pluginInstance.
   */
  @java.lang.Override
  public java.lang.String getPluginInstance() {
    java.lang.Object ref = pluginInstance_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pluginInstance_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Plugin instance name, used to locate and load CertificateProvider instance
   * configuration. Set to "google_cloud_private_spiffe" to use Certificate
   * Authority Service certificate provider instance.
   * </pre>
   *
   * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for pluginInstance.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPluginInstanceBytes() {
    java.lang.Object ref = pluginInstance_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pluginInstance_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pluginInstance_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pluginInstance_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pluginInstance_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pluginInstance_);
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1.CertificateProviderInstance)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1.CertificateProviderInstance other = (com.google.cloud.networksecurity.v1.CertificateProviderInstance) obj;

    if (!getPluginInstance()
        .equals(other.getPluginInstance())) return false;
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
    hash = (37 * hash) + PLUGIN_INSTANCE_FIELD_NUMBER;
    hash = (53 * hash) + getPluginInstance().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance parseFrom(
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
  public static Builder newBuilder(com.google.cloud.networksecurity.v1.CertificateProviderInstance prototype) {
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
   * Specification of a TLS certificate provider instance. Workloads may have one
   * or more CertificateProvider instances (plugins) and one of them is enabled
   * and configured by specifying this message. Workloads use the values from this
   * message to locate and load the CertificateProvider instance configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1.CertificateProviderInstance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1.CertificateProviderInstance)
      com.google.cloud.networksecurity.v1.CertificateProviderInstanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.networksecurity.v1.TlsProto.internal_static_google_cloud_networksecurity_v1_CertificateProviderInstance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1.TlsProto.internal_static_google_cloud_networksecurity_v1_CertificateProviderInstance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1.CertificateProviderInstance.class, com.google.cloud.networksecurity.v1.CertificateProviderInstance.Builder.class);
    }

    // Construct using com.google.cloud.networksecurity.v1.CertificateProviderInstance.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      pluginInstance_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.networksecurity.v1.TlsProto.internal_static_google_cloud_networksecurity_v1_CertificateProviderInstance_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.CertificateProviderInstance getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1.CertificateProviderInstance.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.CertificateProviderInstance build() {
      com.google.cloud.networksecurity.v1.CertificateProviderInstance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.CertificateProviderInstance buildPartial() {
      com.google.cloud.networksecurity.v1.CertificateProviderInstance result = new com.google.cloud.networksecurity.v1.CertificateProviderInstance(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.networksecurity.v1.CertificateProviderInstance result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pluginInstance_ = pluginInstance_;
      }
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
      if (other instanceof com.google.cloud.networksecurity.v1.CertificateProviderInstance) {
        return mergeFrom((com.google.cloud.networksecurity.v1.CertificateProviderInstance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networksecurity.v1.CertificateProviderInstance other) {
      if (other == com.google.cloud.networksecurity.v1.CertificateProviderInstance.getDefaultInstance()) return this;
      if (!other.getPluginInstance().isEmpty()) {
        pluginInstance_ = other.pluginInstance_;
        bitField0_ |= 0x00000001;
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
            case 10: {
              pluginInstance_ = input.readStringRequireUtf8();
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

    private java.lang.Object pluginInstance_ = "";
    /**
     * <pre>
     * Required. Plugin instance name, used to locate and load CertificateProvider instance
     * configuration. Set to "google_cloud_private_spiffe" to use Certificate
     * Authority Service certificate provider instance.
     * </pre>
     *
     * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The pluginInstance.
     */
    public java.lang.String getPluginInstance() {
      java.lang.Object ref = pluginInstance_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pluginInstance_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Plugin instance name, used to locate and load CertificateProvider instance
     * configuration. Set to "google_cloud_private_spiffe" to use Certificate
     * Authority Service certificate provider instance.
     * </pre>
     *
     * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for pluginInstance.
     */
    public com.google.protobuf.ByteString
        getPluginInstanceBytes() {
      java.lang.Object ref = pluginInstance_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pluginInstance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Plugin instance name, used to locate and load CertificateProvider instance
     * configuration. Set to "google_cloud_private_spiffe" to use Certificate
     * Authority Service certificate provider instance.
     * </pre>
     *
     * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The pluginInstance to set.
     * @return This builder for chaining.
     */
    public Builder setPluginInstance(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pluginInstance_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Plugin instance name, used to locate and load CertificateProvider instance
     * configuration. Set to "google_cloud_private_spiffe" to use Certificate
     * Authority Service certificate provider instance.
     * </pre>
     *
     * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPluginInstance() {
      pluginInstance_ = getDefaultInstance().getPluginInstance();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Plugin instance name, used to locate and load CertificateProvider instance
     * configuration. Set to "google_cloud_private_spiffe" to use Certificate
     * Authority Service certificate provider instance.
     * </pre>
     *
     * <code>string plugin_instance = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for pluginInstance to set.
     * @return This builder for chaining.
     */
    public Builder setPluginInstanceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pluginInstance_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1.CertificateProviderInstance)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1.CertificateProviderInstance)
  private static final com.google.cloud.networksecurity.v1.CertificateProviderInstance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1.CertificateProviderInstance();
  }

  public static com.google.cloud.networksecurity.v1.CertificateProviderInstance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateProviderInstance>
      PARSER = new com.google.protobuf.AbstractParser<CertificateProviderInstance>() {
    @java.lang.Override
    public CertificateProviderInstance parsePartialFrom(
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

  public static com.google.protobuf.Parser<CertificateProviderInstance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateProviderInstance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1.CertificateProviderInstance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

