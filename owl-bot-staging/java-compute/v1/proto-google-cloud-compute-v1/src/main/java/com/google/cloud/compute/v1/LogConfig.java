// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.compute.v1;

/**
 * <pre>
 * This is deprecated and has no effect. Do not use.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.LogConfig}
 */
public final class LogConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.LogConfig)
    LogConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogConfig.newBuilder() to construct.
  private LogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.LogConfig.class, com.google.cloud.compute.v1.LogConfig.Builder.class);
  }

  private int bitField0_;
  public static final int CLOUD_AUDIT_FIELD_NUMBER = 412852561;
  private com.google.cloud.compute.v1.LogConfigCloudAuditOptions cloudAudit_;
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
   * @return Whether the cloudAudit field is set.
   */
  @java.lang.Override
  public boolean hasCloudAudit() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
   * @return The cloudAudit.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigCloudAuditOptions getCloudAudit() {
    return cloudAudit_ == null ? com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance() : cloudAudit_;
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder getCloudAuditOrBuilder() {
    return cloudAudit_ == null ? com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance() : cloudAudit_;
  }

  public static final int COUNTER_FIELD_NUMBER = 420959740;
  private com.google.cloud.compute.v1.LogConfigCounterOptions counter_;
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
   * @return Whether the counter field is set.
   */
  @java.lang.Override
  public boolean hasCounter() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
   * @return The counter.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigCounterOptions getCounter() {
    return counter_ == null ? com.google.cloud.compute.v1.LogConfigCounterOptions.getDefaultInstance() : counter_;
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigCounterOptionsOrBuilder getCounterOrBuilder() {
    return counter_ == null ? com.google.cloud.compute.v1.LogConfigCounterOptions.getDefaultInstance() : counter_;
  }

  public static final int DATA_ACCESS_FIELD_NUMBER = 286633881;
  private com.google.cloud.compute.v1.LogConfigDataAccessOptions dataAccess_;
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
   * @return Whether the dataAccess field is set.
   */
  @java.lang.Override
  public boolean hasDataAccess() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
   * @return The dataAccess.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigDataAccessOptions getDataAccess() {
    return dataAccess_ == null ? com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance() : dataAccess_;
  }
  /**
   * <pre>
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder getDataAccessOrBuilder() {
    return dataAccess_ == null ? com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance() : dataAccess_;
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
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(286633881, getDataAccess());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(412852561, getCloudAudit());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(420959740, getCounter());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(286633881, getDataAccess());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(412852561, getCloudAudit());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(420959740, getCounter());
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
    if (!(obj instanceof com.google.cloud.compute.v1.LogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.LogConfig other = (com.google.cloud.compute.v1.LogConfig) obj;

    if (hasCloudAudit() != other.hasCloudAudit()) return false;
    if (hasCloudAudit()) {
      if (!getCloudAudit()
          .equals(other.getCloudAudit())) return false;
    }
    if (hasCounter() != other.hasCounter()) return false;
    if (hasCounter()) {
      if (!getCounter()
          .equals(other.getCounter())) return false;
    }
    if (hasDataAccess() != other.hasDataAccess()) return false;
    if (hasDataAccess()) {
      if (!getDataAccess()
          .equals(other.getDataAccess())) return false;
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
    if (hasCloudAudit()) {
      hash = (37 * hash) + CLOUD_AUDIT_FIELD_NUMBER;
      hash = (53 * hash) + getCloudAudit().hashCode();
    }
    if (hasCounter()) {
      hash = (37 * hash) + COUNTER_FIELD_NUMBER;
      hash = (53 * hash) + getCounter().hashCode();
    }
    if (hasDataAccess()) {
      hash = (37 * hash) + DATA_ACCESS_FIELD_NUMBER;
      hash = (53 * hash) + getDataAccess().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.LogConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.LogConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.LogConfig parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.LogConfig prototype) {
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
   * This is deprecated and has no effect. Do not use.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.LogConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.LogConfig)
      com.google.cloud.compute.v1.LogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.LogConfig.class, com.google.cloud.compute.v1.LogConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.LogConfig.newBuilder()
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
        getCloudAuditFieldBuilder();
        getCounterFieldBuilder();
        getDataAccessFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      cloudAudit_ = null;
      if (cloudAuditBuilder_ != null) {
        cloudAuditBuilder_.dispose();
        cloudAuditBuilder_ = null;
      }
      counter_ = null;
      if (counterBuilder_ != null) {
        counterBuilder_.dispose();
        counterBuilder_ = null;
      }
      dataAccess_ = null;
      if (dataAccessBuilder_ != null) {
        dataAccessBuilder_.dispose();
        dataAccessBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_LogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.LogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfig build() {
      com.google.cloud.compute.v1.LogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.LogConfig buildPartial() {
      com.google.cloud.compute.v1.LogConfig result = new com.google.cloud.compute.v1.LogConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.LogConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cloudAudit_ = cloudAuditBuilder_ == null
            ? cloudAudit_
            : cloudAuditBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.counter_ = counterBuilder_ == null
            ? counter_
            : counterBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dataAccess_ = dataAccessBuilder_ == null
            ? dataAccess_
            : dataAccessBuilder_.build();
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.cloud.compute.v1.LogConfig) {
        return mergeFrom((com.google.cloud.compute.v1.LogConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.LogConfig other) {
      if (other == com.google.cloud.compute.v1.LogConfig.getDefaultInstance()) return this;
      if (other.hasCloudAudit()) {
        mergeCloudAudit(other.getCloudAudit());
      }
      if (other.hasCounter()) {
        mergeCounter(other.getCounter());
      }
      if (other.hasDataAccess()) {
        mergeDataAccess(other.getDataAccess());
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
            case -2001896246: {
              input.readMessage(
                  getDataAccessFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case -2001896246
            case -992146806: {
              input.readMessage(
                  getCloudAuditFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case -992146806
            case -927289374: {
              input.readMessage(
                  getCounterFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case -927289374
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

    private com.google.cloud.compute.v1.LogConfigCloudAuditOptions cloudAudit_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LogConfigCloudAuditOptions, com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder, com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder> cloudAuditBuilder_;
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     * @return Whether the cloudAudit field is set.
     */
    public boolean hasCloudAudit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     * @return The cloudAudit.
     */
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptions getCloudAudit() {
      if (cloudAuditBuilder_ == null) {
        return cloudAudit_ == null ? com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance() : cloudAudit_;
      } else {
        return cloudAuditBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    public Builder setCloudAudit(com.google.cloud.compute.v1.LogConfigCloudAuditOptions value) {
      if (cloudAuditBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cloudAudit_ = value;
      } else {
        cloudAuditBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    public Builder setCloudAudit(
        com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder builderForValue) {
      if (cloudAuditBuilder_ == null) {
        cloudAudit_ = builderForValue.build();
      } else {
        cloudAuditBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    public Builder mergeCloudAudit(com.google.cloud.compute.v1.LogConfigCloudAuditOptions value) {
      if (cloudAuditBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          cloudAudit_ != null &&
          cloudAudit_ != com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance()) {
          getCloudAuditBuilder().mergeFrom(value);
        } else {
          cloudAudit_ = value;
        }
      } else {
        cloudAuditBuilder_.mergeFrom(value);
      }
      if (cloudAudit_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    public Builder clearCloudAudit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      cloudAudit_ = null;
      if (cloudAuditBuilder_ != null) {
        cloudAuditBuilder_.dispose();
        cloudAuditBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder getCloudAuditBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCloudAuditFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    public com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder getCloudAuditOrBuilder() {
      if (cloudAuditBuilder_ != null) {
        return cloudAuditBuilder_.getMessageOrBuilder();
      } else {
        return cloudAudit_ == null ?
            com.google.cloud.compute.v1.LogConfigCloudAuditOptions.getDefaultInstance() : cloudAudit_;
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCloudAuditOptions cloud_audit = 412852561;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LogConfigCloudAuditOptions, com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder, com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder> 
        getCloudAuditFieldBuilder() {
      if (cloudAuditBuilder_ == null) {
        cloudAuditBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.LogConfigCloudAuditOptions, com.google.cloud.compute.v1.LogConfigCloudAuditOptions.Builder, com.google.cloud.compute.v1.LogConfigCloudAuditOptionsOrBuilder>(
                getCloudAudit(),
                getParentForChildren(),
                isClean());
        cloudAudit_ = null;
      }
      return cloudAuditBuilder_;
    }

    private com.google.cloud.compute.v1.LogConfigCounterOptions counter_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LogConfigCounterOptions, com.google.cloud.compute.v1.LogConfigCounterOptions.Builder, com.google.cloud.compute.v1.LogConfigCounterOptionsOrBuilder> counterBuilder_;
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     * @return Whether the counter field is set.
     */
    public boolean hasCounter() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     * @return The counter.
     */
    public com.google.cloud.compute.v1.LogConfigCounterOptions getCounter() {
      if (counterBuilder_ == null) {
        return counter_ == null ? com.google.cloud.compute.v1.LogConfigCounterOptions.getDefaultInstance() : counter_;
      } else {
        return counterBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    public Builder setCounter(com.google.cloud.compute.v1.LogConfigCounterOptions value) {
      if (counterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        counter_ = value;
      } else {
        counterBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    public Builder setCounter(
        com.google.cloud.compute.v1.LogConfigCounterOptions.Builder builderForValue) {
      if (counterBuilder_ == null) {
        counter_ = builderForValue.build();
      } else {
        counterBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    public Builder mergeCounter(com.google.cloud.compute.v1.LogConfigCounterOptions value) {
      if (counterBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          counter_ != null &&
          counter_ != com.google.cloud.compute.v1.LogConfigCounterOptions.getDefaultInstance()) {
          getCounterBuilder().mergeFrom(value);
        } else {
          counter_ = value;
        }
      } else {
        counterBuilder_.mergeFrom(value);
      }
      if (counter_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    public Builder clearCounter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      counter_ = null;
      if (counterBuilder_ != null) {
        counterBuilder_.dispose();
        counterBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    public com.google.cloud.compute.v1.LogConfigCounterOptions.Builder getCounterBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCounterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    public com.google.cloud.compute.v1.LogConfigCounterOptionsOrBuilder getCounterOrBuilder() {
      if (counterBuilder_ != null) {
        return counterBuilder_.getMessageOrBuilder();
      } else {
        return counter_ == null ?
            com.google.cloud.compute.v1.LogConfigCounterOptions.getDefaultInstance() : counter_;
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigCounterOptions counter = 420959740;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LogConfigCounterOptions, com.google.cloud.compute.v1.LogConfigCounterOptions.Builder, com.google.cloud.compute.v1.LogConfigCounterOptionsOrBuilder> 
        getCounterFieldBuilder() {
      if (counterBuilder_ == null) {
        counterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.LogConfigCounterOptions, com.google.cloud.compute.v1.LogConfigCounterOptions.Builder, com.google.cloud.compute.v1.LogConfigCounterOptionsOrBuilder>(
                getCounter(),
                getParentForChildren(),
                isClean());
        counter_ = null;
      }
      return counterBuilder_;
    }

    private com.google.cloud.compute.v1.LogConfigDataAccessOptions dataAccess_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LogConfigDataAccessOptions, com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder, com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder> dataAccessBuilder_;
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     * @return Whether the dataAccess field is set.
     */
    public boolean hasDataAccess() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     * @return The dataAccess.
     */
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions getDataAccess() {
      if (dataAccessBuilder_ == null) {
        return dataAccess_ == null ? com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance() : dataAccess_;
      } else {
        return dataAccessBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    public Builder setDataAccess(com.google.cloud.compute.v1.LogConfigDataAccessOptions value) {
      if (dataAccessBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataAccess_ = value;
      } else {
        dataAccessBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    public Builder setDataAccess(
        com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder builderForValue) {
      if (dataAccessBuilder_ == null) {
        dataAccess_ = builderForValue.build();
      } else {
        dataAccessBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    public Builder mergeDataAccess(com.google.cloud.compute.v1.LogConfigDataAccessOptions value) {
      if (dataAccessBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          dataAccess_ != null &&
          dataAccess_ != com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance()) {
          getDataAccessBuilder().mergeFrom(value);
        } else {
          dataAccess_ = value;
        }
      } else {
        dataAccessBuilder_.mergeFrom(value);
      }
      if (dataAccess_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    public Builder clearDataAccess() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dataAccess_ = null;
      if (dataAccessBuilder_ != null) {
        dataAccessBuilder_.dispose();
        dataAccessBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    public com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder getDataAccessBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getDataAccessFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    public com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder getDataAccessOrBuilder() {
      if (dataAccessBuilder_ != null) {
        return dataAccessBuilder_.getMessageOrBuilder();
      } else {
        return dataAccess_ == null ?
            com.google.cloud.compute.v1.LogConfigDataAccessOptions.getDefaultInstance() : dataAccess_;
      }
    }
    /**
     * <pre>
     * This is deprecated and has no effect. Do not use.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.LogConfigDataAccessOptions data_access = 286633881;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.compute.v1.LogConfigDataAccessOptions, com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder, com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder> 
        getDataAccessFieldBuilder() {
      if (dataAccessBuilder_ == null) {
        dataAccessBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.LogConfigDataAccessOptions, com.google.cloud.compute.v1.LogConfigDataAccessOptions.Builder, com.google.cloud.compute.v1.LogConfigDataAccessOptionsOrBuilder>(
                getDataAccess(),
                getParentForChildren(),
                isClean());
        dataAccess_ = null;
      }
      return dataAccessBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.LogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.LogConfig)
  private static final com.google.cloud.compute.v1.LogConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.LogConfig();
  }

  public static com.google.cloud.compute.v1.LogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogConfig>
      PARSER = new com.google.protobuf.AbstractParser<LogConfig>() {
    @java.lang.Override
    public LogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.LogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

