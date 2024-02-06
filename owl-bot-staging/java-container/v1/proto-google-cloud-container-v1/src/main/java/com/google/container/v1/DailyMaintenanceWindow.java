// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.2
package com.google.container.v1;

/**
 * <pre>
 * Time window specified for daily maintenance operations.
 * </pre>
 *
 * Protobuf type {@code google.container.v1.DailyMaintenanceWindow}
 */
public final class DailyMaintenanceWindow extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.container.v1.DailyMaintenanceWindow)
    DailyMaintenanceWindowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DailyMaintenanceWindow.newBuilder() to construct.
  private DailyMaintenanceWindow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DailyMaintenanceWindow() {
    startTime_ = "";
    duration_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DailyMaintenanceWindow();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DailyMaintenanceWindow_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DailyMaintenanceWindow_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1.DailyMaintenanceWindow.class, com.google.container.v1.DailyMaintenanceWindow.Builder.class);
  }

  public static final int START_TIME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object startTime_ = "";
  /**
   * <pre>
   * Time within the maintenance window to start the maintenance operations.
   * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
   * </pre>
   *
   * <code>string start_time = 2;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public java.lang.String getStartTime() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      startTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Time within the maintenance window to start the maintenance operations.
   * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
   * </pre>
   *
   * <code>string start_time = 2;</code>
   * @return The bytes for startTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStartTimeBytes() {
    java.lang.Object ref = startTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      startTime_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object duration_ = "";
  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be
   * smallest possible in the given scenario.
   * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "PTnHnMnS".
   * </pre>
   *
   * <code>string duration = 3;</code>
   * @return The duration.
   */
  @java.lang.Override
  public java.lang.String getDuration() {
    java.lang.Object ref = duration_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      duration_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * [Output only] Duration of the time window, automatically chosen to be
   * smallest possible in the given scenario.
   * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * format "PTnHnMnS".
   * </pre>
   *
   * <code>string duration = 3;</code>
   * @return The bytes for duration.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDurationBytes() {
    java.lang.Object ref = duration_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      duration_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(duration_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, duration_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(startTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, startTime_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(duration_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, duration_);
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
    if (!(obj instanceof com.google.container.v1.DailyMaintenanceWindow)) {
      return super.equals(obj);
    }
    com.google.container.v1.DailyMaintenanceWindow other = (com.google.container.v1.DailyMaintenanceWindow) obj;

    if (!getStartTime()
        .equals(other.getStartTime())) return false;
    if (!getDuration()
        .equals(other.getDuration())) return false;
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
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime().hashCode();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1.DailyMaintenanceWindow parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1.DailyMaintenanceWindow parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.container.v1.DailyMaintenanceWindow parseFrom(
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
  public static Builder newBuilder(com.google.container.v1.DailyMaintenanceWindow prototype) {
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
   * Time window specified for daily maintenance operations.
   * </pre>
   *
   * Protobuf type {@code google.container.v1.DailyMaintenanceWindow}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.container.v1.DailyMaintenanceWindow)
      com.google.container.v1.DailyMaintenanceWindowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DailyMaintenanceWindow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DailyMaintenanceWindow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1.DailyMaintenanceWindow.class, com.google.container.v1.DailyMaintenanceWindow.Builder.class);
    }

    // Construct using com.google.container.v1.DailyMaintenanceWindow.newBuilder()
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
      startTime_ = "";
      duration_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.container.v1.ClusterServiceProto.internal_static_google_container_v1_DailyMaintenanceWindow_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1.DailyMaintenanceWindow getDefaultInstanceForType() {
      return com.google.container.v1.DailyMaintenanceWindow.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1.DailyMaintenanceWindow build() {
      com.google.container.v1.DailyMaintenanceWindow result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1.DailyMaintenanceWindow buildPartial() {
      com.google.container.v1.DailyMaintenanceWindow result = new com.google.container.v1.DailyMaintenanceWindow(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1.DailyMaintenanceWindow result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.startTime_ = startTime_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.duration_ = duration_;
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
      if (other instanceof com.google.container.v1.DailyMaintenanceWindow) {
        return mergeFrom((com.google.container.v1.DailyMaintenanceWindow)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1.DailyMaintenanceWindow other) {
      if (other == com.google.container.v1.DailyMaintenanceWindow.getDefaultInstance()) return this;
      if (!other.getStartTime().isEmpty()) {
        startTime_ = other.startTime_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDuration().isEmpty()) {
        duration_ = other.duration_;
        bitField0_ |= 0x00000002;
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
              startTime_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              duration_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private java.lang.Object startTime_ = "";
    /**
     * <pre>
     * Time within the maintenance window to start the maintenance operations.
     * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * </pre>
     *
     * <code>string start_time = 2;</code>
     * @return The startTime.
     */
    public java.lang.String getStartTime() {
      java.lang.Object ref = startTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        startTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Time within the maintenance window to start the maintenance operations.
     * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * </pre>
     *
     * <code>string start_time = 2;</code>
     * @return The bytes for startTime.
     */
    public com.google.protobuf.ByteString
        getStartTimeBytes() {
      java.lang.Object ref = startTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        startTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Time within the maintenance window to start the maintenance operations.
     * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * </pre>
     *
     * <code>string start_time = 2;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      startTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time within the maintenance window to start the maintenance operations.
     * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * </pre>
     *
     * <code>string start_time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      startTime_ = getDefaultInstance().getStartTime();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Time within the maintenance window to start the maintenance operations.
     * Time format should be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "HH:MM", where HH : [00-23] and MM : [00-59] GMT.
     * </pre>
     *
     * <code>string start_time = 2;</code>
     * @param value The bytes for startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      startTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object duration_ = "";
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be
     * smallest possible in the given scenario.
     * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "PTnHnMnS".
     * </pre>
     *
     * <code>string duration = 3;</code>
     * @return The duration.
     */
    public java.lang.String getDuration() {
      java.lang.Object ref = duration_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        duration_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be
     * smallest possible in the given scenario.
     * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "PTnHnMnS".
     * </pre>
     *
     * <code>string duration = 3;</code>
     * @return The bytes for duration.
     */
    public com.google.protobuf.ByteString
        getDurationBytes() {
      java.lang.Object ref = duration_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        duration_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be
     * smallest possible in the given scenario.
     * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "PTnHnMnS".
     * </pre>
     *
     * <code>string duration = 3;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      duration_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be
     * smallest possible in the given scenario.
     * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "PTnHnMnS".
     * </pre>
     *
     * <code>string duration = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      duration_ = getDefaultInstance().getDuration();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * [Output only] Duration of the time window, automatically chosen to be
     * smallest possible in the given scenario.
     * Duration will be in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
     * format "PTnHnMnS".
     * </pre>
     *
     * <code>string duration = 3;</code>
     * @param value The bytes for duration to set.
     * @return This builder for chaining.
     */
    public Builder setDurationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      duration_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.container.v1.DailyMaintenanceWindow)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1.DailyMaintenanceWindow)
  private static final com.google.container.v1.DailyMaintenanceWindow DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.container.v1.DailyMaintenanceWindow();
  }

  public static com.google.container.v1.DailyMaintenanceWindow getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DailyMaintenanceWindow>
      PARSER = new com.google.protobuf.AbstractParser<DailyMaintenanceWindow>() {
    @java.lang.Override
    public DailyMaintenanceWindow parsePartialFrom(
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

  public static com.google.protobuf.Parser<DailyMaintenanceWindow> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DailyMaintenanceWindow> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1.DailyMaintenanceWindow getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

