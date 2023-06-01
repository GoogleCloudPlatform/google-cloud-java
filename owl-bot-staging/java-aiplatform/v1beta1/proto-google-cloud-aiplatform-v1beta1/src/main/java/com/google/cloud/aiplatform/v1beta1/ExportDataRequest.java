// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/dataset_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 * <pre>
 * Request message for
 * [DatasetService.ExportData][google.cloud.aiplatform.v1beta1.DatasetService.ExportData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExportDataRequest}
 */
public final class ExportDataRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ExportDataRequest)
    ExportDataRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExportDataRequest.newBuilder() to construct.
  private ExportDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExportDataRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExportDataRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ExportDataRequest.class, com.google.cloud.aiplatform.v1beta1.ExportDataRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The name of the Dataset resource.
   * Format:
   * `projects/{project}/locations/{location}/datasets/{dataset}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXPORT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.ExportDataConfig exportConfig_;
  /**
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the exportConfig field is set.
   */
  @java.lang.Override
  public boolean hasExportConfig() {
    return exportConfig_ != null;
  }
  /**
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The exportConfig.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataConfig getExportConfig() {
    return exportConfig_ == null ? com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance() : exportConfig_;
  }
  /**
   * <pre>
   * Required. The desired output location.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder getExportConfigOrBuilder() {
    return exportConfig_ == null ? com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance() : exportConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (exportConfig_ != null) {
      output.writeMessage(2, getExportConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (exportConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExportConfig());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ExportDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ExportDataRequest other = (com.google.cloud.aiplatform.v1beta1.ExportDataRequest) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasExportConfig() != other.hasExportConfig()) return false;
    if (hasExportConfig()) {
      if (!getExportConfig()
          .equals(other.getExportConfig())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasExportConfig()) {
      hash = (37 * hash) + EXPORT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getExportConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.ExportDataRequest prototype) {
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
   * Request message for
   * [DatasetService.ExportData][google.cloud.aiplatform.v1beta1.DatasetService.ExportData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ExportDataRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ExportDataRequest)
      com.google.cloud.aiplatform.v1beta1.ExportDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ExportDataRequest.class, com.google.cloud.aiplatform.v1beta1.ExportDataRequest.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ExportDataRequest.newBuilder()
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
      name_ = "";
      exportConfig_ = null;
      if (exportConfigBuilder_ != null) {
        exportConfigBuilder_.dispose();
        exportConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.DatasetServiceProto.internal_static_google_cloud_aiplatform_v1beta1_ExportDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataRequest getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ExportDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataRequest build() {
      com.google.cloud.aiplatform.v1beta1.ExportDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ExportDataRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ExportDataRequest result = new com.google.cloud.aiplatform.v1beta1.ExportDataRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.ExportDataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exportConfig_ = exportConfigBuilder_ == null
            ? exportConfig_
            : exportConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ExportDataRequest) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ExportDataRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.ExportDataRequest other) {
      if (other == com.google.cloud.aiplatform.v1beta1.ExportDataRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasExportConfig()) {
        mergeExportConfig(other.getExportConfig());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getExportConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The name of the Dataset resource.
     * Format:
     * `projects/{project}/locations/{location}/datasets/{dataset}`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.ExportDataConfig exportConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExportDataConfig, com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder, com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder> exportConfigBuilder_;
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the exportConfig field is set.
     */
    public boolean hasExportConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The exportConfig.
     */
    public com.google.cloud.aiplatform.v1beta1.ExportDataConfig getExportConfig() {
      if (exportConfigBuilder_ == null) {
        return exportConfig_ == null ? com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance() : exportConfig_;
      } else {
        return exportConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setExportConfig(com.google.cloud.aiplatform.v1beta1.ExportDataConfig value) {
      if (exportConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exportConfig_ = value;
      } else {
        exportConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setExportConfig(
        com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder builderForValue) {
      if (exportConfigBuilder_ == null) {
        exportConfig_ = builderForValue.build();
      } else {
        exportConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeExportConfig(com.google.cloud.aiplatform.v1beta1.ExportDataConfig value) {
      if (exportConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          exportConfig_ != null &&
          exportConfig_ != com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance()) {
          getExportConfigBuilder().mergeFrom(value);
        } else {
          exportConfig_ = value;
        }
      } else {
        exportConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearExportConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      exportConfig_ = null;
      if (exportConfigBuilder_ != null) {
        exportConfigBuilder_.dispose();
        exportConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder getExportConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExportConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder getExportConfigOrBuilder() {
      if (exportConfigBuilder_ != null) {
        return exportConfigBuilder_.getMessageOrBuilder();
      } else {
        return exportConfig_ == null ?
            com.google.cloud.aiplatform.v1beta1.ExportDataConfig.getDefaultInstance() : exportConfig_;
      }
    }
    /**
     * <pre>
     * Required. The desired output location.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ExportDataConfig export_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1beta1.ExportDataConfig, com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder, com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder> 
        getExportConfigFieldBuilder() {
      if (exportConfigBuilder_ == null) {
        exportConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ExportDataConfig, com.google.cloud.aiplatform.v1beta1.ExportDataConfig.Builder, com.google.cloud.aiplatform.v1beta1.ExportDataConfigOrBuilder>(
                getExportConfig(),
                getParentForChildren(),
                isClean());
        exportConfig_ = null;
      }
      return exportConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ExportDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ExportDataRequest)
  private static final com.google.cloud.aiplatform.v1beta1.ExportDataRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ExportDataRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.ExportDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExportDataRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExportDataRequest>() {
    @java.lang.Override
    public ExportDataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExportDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExportDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ExportDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

