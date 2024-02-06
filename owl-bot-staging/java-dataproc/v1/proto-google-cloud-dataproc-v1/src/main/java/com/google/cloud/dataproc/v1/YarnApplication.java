// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * A YARN application created by a job. Application information is a subset of
 * &lt;code&gt;org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto&lt;/code&gt;.
 *
 * **Beta Feature**: This report is available for testing purposes only. It may
 * be changed before final release.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.YarnApplication}
 */
public final class YarnApplication extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.YarnApplication)
    YarnApplicationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YarnApplication.newBuilder() to construct.
  private YarnApplication(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YarnApplication() {
    name_ = "";
    state_ = 0;
    trackingUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YarnApplication();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_YarnApplication_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_YarnApplication_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.YarnApplication.class, com.google.cloud.dataproc.v1.YarnApplication.Builder.class);
  }

  /**
   * <pre>
   * The application state, corresponding to
   * &lt;code&gt;YarnProtos.YarnApplicationStateProto&lt;/code&gt;.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dataproc.v1.YarnApplication.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Status is unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * Status is NEW.
     * </pre>
     *
     * <code>NEW = 1;</code>
     */
    NEW(1),
    /**
     * <pre>
     * Status is NEW_SAVING.
     * </pre>
     *
     * <code>NEW_SAVING = 2;</code>
     */
    NEW_SAVING(2),
    /**
     * <pre>
     * Status is SUBMITTED.
     * </pre>
     *
     * <code>SUBMITTED = 3;</code>
     */
    SUBMITTED(3),
    /**
     * <pre>
     * Status is ACCEPTED.
     * </pre>
     *
     * <code>ACCEPTED = 4;</code>
     */
    ACCEPTED(4),
    /**
     * <pre>
     * Status is RUNNING.
     * </pre>
     *
     * <code>RUNNING = 5;</code>
     */
    RUNNING(5),
    /**
     * <pre>
     * Status is FINISHED.
     * </pre>
     *
     * <code>FINISHED = 6;</code>
     */
    FINISHED(6),
    /**
     * <pre>
     * Status is FAILED.
     * </pre>
     *
     * <code>FAILED = 7;</code>
     */
    FAILED(7),
    /**
     * <pre>
     * Status is KILLED.
     * </pre>
     *
     * <code>KILLED = 8;</code>
     */
    KILLED(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Status is unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Status is NEW.
     * </pre>
     *
     * <code>NEW = 1;</code>
     */
    public static final int NEW_VALUE = 1;
    /**
     * <pre>
     * Status is NEW_SAVING.
     * </pre>
     *
     * <code>NEW_SAVING = 2;</code>
     */
    public static final int NEW_SAVING_VALUE = 2;
    /**
     * <pre>
     * Status is SUBMITTED.
     * </pre>
     *
     * <code>SUBMITTED = 3;</code>
     */
    public static final int SUBMITTED_VALUE = 3;
    /**
     * <pre>
     * Status is ACCEPTED.
     * </pre>
     *
     * <code>ACCEPTED = 4;</code>
     */
    public static final int ACCEPTED_VALUE = 4;
    /**
     * <pre>
     * Status is RUNNING.
     * </pre>
     *
     * <code>RUNNING = 5;</code>
     */
    public static final int RUNNING_VALUE = 5;
    /**
     * <pre>
     * Status is FINISHED.
     * </pre>
     *
     * <code>FINISHED = 6;</code>
     */
    public static final int FINISHED_VALUE = 6;
    /**
     * <pre>
     * Status is FAILED.
     * </pre>
     *
     * <code>FAILED = 7;</code>
     */
    public static final int FAILED_VALUE = 7;
    /**
     * <pre>
     * Status is KILLED.
     * </pre>
     *
     * <code>KILLED = 8;</code>
     */
    public static final int KILLED_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0: return STATE_UNSPECIFIED;
        case 1: return NEW;
        case 2: return NEW_SAVING;
        case 3: return SUBMITTED;
        case 4: return ACCEPTED;
        case 5: return RUNNING;
        case 6: return FINISHED;
        case 7: return FAILED;
        case 8: return KILLED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        State> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<State>() {
            public State findValueByNumber(int number) {
              return State.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.YarnApplication.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1.YarnApplication.State)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Required. The application name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. The application name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;
  /**
   * <pre>
   * Required. The application state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Required. The application state.
   * </pre>
   *
   * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.dataproc.v1.YarnApplication.State getState() {
    com.google.cloud.dataproc.v1.YarnApplication.State result = com.google.cloud.dataproc.v1.YarnApplication.State.forNumber(state_);
    return result == null ? com.google.cloud.dataproc.v1.YarnApplication.State.UNRECOGNIZED : result;
  }

  public static final int PROGRESS_FIELD_NUMBER = 3;
  private float progress_ = 0F;
  /**
   * <pre>
   * Required. The numerical progress of the application, from 1 to 100.
   * </pre>
   *
   * <code>float progress = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The progress.
   */
  @java.lang.Override
  public float getProgress() {
    return progress_;
  }

  public static final int TRACKING_URL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object trackingUrl_ = "";
  /**
   * <pre>
   * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
   * TimelineServer that provides application-specific information. The URL uses
   * the internal hostname, and requires a proxy server for resolution and,
   * possibly, access.
   * </pre>
   *
   * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The trackingUrl.
   */
  @java.lang.Override
  public java.lang.String getTrackingUrl() {
    java.lang.Object ref = trackingUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      trackingUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
   * TimelineServer that provides application-specific information. The URL uses
   * the internal hostname, and requires a proxy server for resolution and,
   * possibly, access.
   * </pre>
   *
   * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The bytes for trackingUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTrackingUrlBytes() {
    java.lang.Object ref = trackingUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      trackingUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (state_ != com.google.cloud.dataproc.v1.YarnApplication.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (java.lang.Float.floatToRawIntBits(progress_) != 0) {
      output.writeFloat(3, progress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trackingUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, trackingUrl_);
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
    if (state_ != com.google.cloud.dataproc.v1.YarnApplication.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
    }
    if (java.lang.Float.floatToRawIntBits(progress_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, progress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(trackingUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, trackingUrl_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.YarnApplication)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.YarnApplication other = (com.google.cloud.dataproc.v1.YarnApplication) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (state_ != other.state_) return false;
    if (java.lang.Float.floatToIntBits(getProgress())
        != java.lang.Float.floatToIntBits(
            other.getProgress())) return false;
    if (!getTrackingUrl()
        .equals(other.getTrackingUrl())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getProgress());
    hash = (37 * hash) + TRACKING_URL_FIELD_NUMBER;
    hash = (53 * hash) + getTrackingUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dataproc.v1.YarnApplication parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dataproc.v1.YarnApplication parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.YarnApplication parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.YarnApplication prototype) {
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
   * A YARN application created by a job. Application information is a subset of
   * &lt;code&gt;org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto&lt;/code&gt;.
   *
   * **Beta Feature**: This report is available for testing purposes only. It may
   * be changed before final release.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.YarnApplication}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.YarnApplication)
      com.google.cloud.dataproc.v1.YarnApplicationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_YarnApplication_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_YarnApplication_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.YarnApplication.class, com.google.cloud.dataproc.v1.YarnApplication.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.YarnApplication.newBuilder()
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
      state_ = 0;
      progress_ = 0F;
      trackingUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.JobsProto.internal_static_google_cloud_dataproc_v1_YarnApplication_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.YarnApplication getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.YarnApplication.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.YarnApplication build() {
      com.google.cloud.dataproc.v1.YarnApplication result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.YarnApplication buildPartial() {
      com.google.cloud.dataproc.v1.YarnApplication result = new com.google.cloud.dataproc.v1.YarnApplication(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dataproc.v1.YarnApplication result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.progress_ = progress_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.trackingUrl_ = trackingUrl_;
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
      if (other instanceof com.google.cloud.dataproc.v1.YarnApplication) {
        return mergeFrom((com.google.cloud.dataproc.v1.YarnApplication)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.YarnApplication other) {
      if (other == com.google.cloud.dataproc.v1.YarnApplication.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getProgress() != 0F) {
        setProgress(other.getProgress());
      }
      if (!other.getTrackingUrl().isEmpty()) {
        trackingUrl_ = other.trackingUrl_;
        bitField0_ |= 0x00000008;
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 29: {
              progress_ = input.readFloat();
              bitField0_ |= 0x00000004;
              break;
            } // case 29
            case 34: {
              trackingUrl_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
     * Required. The application name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The application name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The application name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The application name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. The application name.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private int state_ = 0;
    /**
     * <pre>
     * Required. The application state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Required. The application state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The application state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.dataproc.v1.YarnApplication.State getState() {
      com.google.cloud.dataproc.v1.YarnApplication.State result = com.google.cloud.dataproc.v1.YarnApplication.State.forNumber(state_);
      return result == null ? com.google.cloud.dataproc.v1.YarnApplication.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The application state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.dataproc.v1.YarnApplication.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The application state.
     * </pre>
     *
     * <code>.google.cloud.dataproc.v1.YarnApplication.State state = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      state_ = 0;
      onChanged();
      return this;
    }

    private float progress_ ;
    /**
     * <pre>
     * Required. The numerical progress of the application, from 1 to 100.
     * </pre>
     *
     * <code>float progress = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The progress.
     */
    @java.lang.Override
    public float getProgress() {
      return progress_;
    }
    /**
     * <pre>
     * Required. The numerical progress of the application, from 1 to 100.
     * </pre>
     *
     * <code>float progress = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The progress to set.
     * @return This builder for chaining.
     */
    public Builder setProgress(float value) {

      progress_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The numerical progress of the application, from 1 to 100.
     * </pre>
     *
     * <code>float progress = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProgress() {
      bitField0_ = (bitField0_ & ~0x00000004);
      progress_ = 0F;
      onChanged();
      return this;
    }

    private java.lang.Object trackingUrl_ = "";
    /**
     * <pre>
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
     * TimelineServer that provides application-specific information. The URL uses
     * the internal hostname, and requires a proxy server for resolution and,
     * possibly, access.
     * </pre>
     *
     * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The trackingUrl.
     */
    public java.lang.String getTrackingUrl() {
      java.lang.Object ref = trackingUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        trackingUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
     * TimelineServer that provides application-specific information. The URL uses
     * the internal hostname, and requires a proxy server for resolution and,
     * possibly, access.
     * </pre>
     *
     * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The bytes for trackingUrl.
     */
    public com.google.protobuf.ByteString
        getTrackingUrlBytes() {
      java.lang.Object ref = trackingUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        trackingUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
     * TimelineServer that provides application-specific information. The URL uses
     * the internal hostname, and requires a proxy server for resolution and,
     * possibly, access.
     * </pre>
     *
     * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The trackingUrl to set.
     * @return This builder for chaining.
     */
    public Builder setTrackingUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      trackingUrl_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
     * TimelineServer that provides application-specific information. The URL uses
     * the internal hostname, and requires a proxy server for resolution and,
     * possibly, access.
     * </pre>
     *
     * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return This builder for chaining.
     */
    public Builder clearTrackingUrl() {
      trackingUrl_ = getDefaultInstance().getTrackingUrl();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or
     * TimelineServer that provides application-specific information. The URL uses
     * the internal hostname, and requires a proxy server for resolution and,
     * possibly, access.
     * </pre>
     *
     * <code>string tracking_url = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param value The bytes for trackingUrl to set.
     * @return This builder for chaining.
     */
    public Builder setTrackingUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      trackingUrl_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.YarnApplication)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.YarnApplication)
  private static final com.google.cloud.dataproc.v1.YarnApplication DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.YarnApplication();
  }

  public static com.google.cloud.dataproc.v1.YarnApplication getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YarnApplication>
      PARSER = new com.google.protobuf.AbstractParser<YarnApplication>() {
    @java.lang.Override
    public YarnApplication parsePartialFrom(
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

  public static com.google.protobuf.Parser<YarnApplication> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YarnApplication> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.YarnApplication getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

