// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.2
package com.google.cloudbuild.v1;

/**
 * <pre>
 * BuildApproval describes a build's approval configuration, state, and
 * result.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudbuild.v1.BuildApproval}
 */
public final class BuildApproval extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudbuild.v1.BuildApproval)
    BuildApprovalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BuildApproval.newBuilder() to construct.
  private BuildApproval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BuildApproval() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BuildApproval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_BuildApproval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_BuildApproval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloudbuild.v1.BuildApproval.class, com.google.cloudbuild.v1.BuildApproval.Builder.class);
  }

  /**
   * <pre>
   * Specifies the current state of a build's approval.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.cloudbuild.v1.BuildApproval.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default enum type. This should not be used.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * Build approval is pending.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    PENDING(1),
    /**
     * <pre>
     * Build approval has been approved.
     * </pre>
     *
     * <code>APPROVED = 2;</code>
     */
    APPROVED(2),
    /**
     * <pre>
     * Build approval has been rejected.
     * </pre>
     *
     * <code>REJECTED = 3;</code>
     */
    REJECTED(3),
    /**
     * <pre>
     * Build was cancelled while it was still pending approval.
     * </pre>
     *
     * <code>CANCELLED = 5;</code>
     */
    CANCELLED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default enum type. This should not be used.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Build approval is pending.
     * </pre>
     *
     * <code>PENDING = 1;</code>
     */
    public static final int PENDING_VALUE = 1;
    /**
     * <pre>
     * Build approval has been approved.
     * </pre>
     *
     * <code>APPROVED = 2;</code>
     */
    public static final int APPROVED_VALUE = 2;
    /**
     * <pre>
     * Build approval has been rejected.
     * </pre>
     *
     * <code>REJECTED = 3;</code>
     */
    public static final int REJECTED_VALUE = 3;
    /**
     * <pre>
     * Build was cancelled while it was still pending approval.
     * </pre>
     *
     * <code>CANCELLED = 5;</code>
     */
    public static final int CANCELLED_VALUE = 5;


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
        case 1: return PENDING;
        case 2: return APPROVED;
        case 3: return REJECTED;
        case 5: return CANCELLED;
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
      return com.google.cloudbuild.v1.BuildApproval.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.devtools.cloudbuild.v1.BuildApproval.State)
  }

  private int bitField0_;
  public static final int STATE_FIELD_NUMBER = 1;
  private int state_ = 0;
  /**
   * <pre>
   * Output only. The state of this build's approval.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * Output only. The state of this build's approval.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloudbuild.v1.BuildApproval.State getState() {
    com.google.cloudbuild.v1.BuildApproval.State result = com.google.cloudbuild.v1.BuildApproval.State.forNumber(state_);
    return result == null ? com.google.cloudbuild.v1.BuildApproval.State.UNRECOGNIZED : result;
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.google.cloudbuild.v1.ApprovalConfig config_;
  /**
   * <pre>
   * Output only. Configuration for manual approval of this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. Configuration for manual approval of this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The config.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.ApprovalConfig getConfig() {
    return config_ == null ? com.google.cloudbuild.v1.ApprovalConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * Output only. Configuration for manual approval of this build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.ApprovalConfigOrBuilder getConfigOrBuilder() {
    return config_ == null ? com.google.cloudbuild.v1.ApprovalConfig.getDefaultInstance() : config_;
  }

  public static final int RESULT_FIELD_NUMBER = 3;
  private com.google.cloudbuild.v1.ApprovalResult result_;
  /**
   * <pre>
   * Output only. Result of manual approval for this Build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. Result of manual approval for this Build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.ApprovalResult getResult() {
    return result_ == null ? com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * Output only. Result of manual approval for this Build.
   * </pre>
   *
   * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.cloudbuild.v1.ApprovalResultOrBuilder getResultOrBuilder() {
    return result_ == null ? com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : result_;
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
    if (state_ != com.google.cloudbuild.v1.BuildApproval.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloudbuild.v1.BuildApproval.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getResult());
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
    if (!(obj instanceof com.google.cloudbuild.v1.BuildApproval)) {
      return super.equals(obj);
    }
    com.google.cloudbuild.v1.BuildApproval other = (com.google.cloudbuild.v1.BuildApproval) obj;

    if (state_ != other.state_) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
    }
    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloudbuild.v1.BuildApproval parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloudbuild.v1.BuildApproval parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloudbuild.v1.BuildApproval parseFrom(
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
  public static Builder newBuilder(com.google.cloudbuild.v1.BuildApproval prototype) {
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
   * BuildApproval describes a build's approval configuration, state, and
   * result.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudbuild.v1.BuildApproval}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudbuild.v1.BuildApproval)
      com.google.cloudbuild.v1.BuildApprovalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_BuildApproval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_BuildApproval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloudbuild.v1.BuildApproval.class, com.google.cloudbuild.v1.BuildApproval.Builder.class);
    }

    // Construct using com.google.cloudbuild.v1.BuildApproval.newBuilder()
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
        getConfigFieldBuilder();
        getResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = 0;
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloudbuild.v1.Cloudbuild.internal_static_google_devtools_cloudbuild_v1_BuildApproval_descriptor;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuildApproval getDefaultInstanceForType() {
      return com.google.cloudbuild.v1.BuildApproval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuildApproval build() {
      com.google.cloudbuild.v1.BuildApproval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloudbuild.v1.BuildApproval buildPartial() {
      com.google.cloudbuild.v1.BuildApproval result = new com.google.cloudbuild.v1.BuildApproval(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloudbuild.v1.BuildApproval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.config_ = configBuilder_ == null
            ? config_
            : configBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloudbuild.v1.BuildApproval) {
        return mergeFrom((com.google.cloudbuild.v1.BuildApproval)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloudbuild.v1.BuildApproval other) {
      if (other == com.google.cloudbuild.v1.BuildApproval.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
            case 8: {
              state_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private int state_ = 0;
    /**
     * <pre>
     * Output only. The state of this build's approval.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * Output only. The state of this build's approval.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The state of this build's approval.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloudbuild.v1.BuildApproval.State getState() {
      com.google.cloudbuild.v1.BuildApproval.State result = com.google.cloudbuild.v1.BuildApproval.State.forNumber(state_);
      return result == null ? com.google.cloudbuild.v1.BuildApproval.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. The state of this build's approval.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloudbuild.v1.BuildApproval.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The state of this build's approval.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.BuildApproval.State state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloudbuild.v1.ApprovalConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloudbuild.v1.ApprovalConfig, com.google.cloudbuild.v1.ApprovalConfig.Builder, com.google.cloudbuild.v1.ApprovalConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The config.
     */
    public com.google.cloudbuild.v1.ApprovalConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.google.cloudbuild.v1.ApprovalConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setConfig(com.google.cloudbuild.v1.ApprovalConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
      } else {
        configBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setConfig(
        com.google.cloudbuild.v1.ApprovalConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeConfig(com.google.cloudbuild.v1.ApprovalConfig value) {
      if (configBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          config_ != null &&
          config_ != com.google.cloudbuild.v1.ApprovalConfig.getDefaultInstance()) {
          getConfigBuilder().mergeFrom(value);
        } else {
          config_ = value;
        }
      } else {
        configBuilder_.mergeFrom(value);
      }
      if (config_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      config_ = null;
      if (configBuilder_ != null) {
        configBuilder_.dispose();
        configBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloudbuild.v1.ApprovalConfig.Builder getConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloudbuild.v1.ApprovalConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.google.cloudbuild.v1.ApprovalConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * Output only. Configuration for manual approval of this build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalConfig config = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloudbuild.v1.ApprovalConfig, com.google.cloudbuild.v1.ApprovalConfig.Builder, com.google.cloudbuild.v1.ApprovalConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.ApprovalConfig, com.google.cloudbuild.v1.ApprovalConfig.Builder, com.google.cloudbuild.v1.ApprovalConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }

    private com.google.cloudbuild.v1.ApprovalResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloudbuild.v1.ApprovalResult, com.google.cloudbuild.v1.ApprovalResult.Builder, com.google.cloudbuild.v1.ApprovalResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The result.
     */
    public com.google.cloudbuild.v1.ApprovalResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setResult(com.google.cloudbuild.v1.ApprovalResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setResult(
        com.google.cloudbuild.v1.ApprovalResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeResult(com.google.cloudbuild.v1.ApprovalResult value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          result_ != null &&
          result_ != com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000004);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloudbuild.v1.ApprovalResult.Builder getResultBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.cloudbuild.v1.ApprovalResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.cloudbuild.v1.ApprovalResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * Output only. Result of manual approval for this Build.
     * </pre>
     *
     * <code>.google.devtools.cloudbuild.v1.ApprovalResult result = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloudbuild.v1.ApprovalResult, com.google.cloudbuild.v1.ApprovalResult.Builder, com.google.cloudbuild.v1.ApprovalResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloudbuild.v1.ApprovalResult, com.google.cloudbuild.v1.ApprovalResult.Builder, com.google.cloudbuild.v1.ApprovalResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudbuild.v1.BuildApproval)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudbuild.v1.BuildApproval)
  private static final com.google.cloudbuild.v1.BuildApproval DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloudbuild.v1.BuildApproval();
  }

  public static com.google.cloudbuild.v1.BuildApproval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BuildApproval>
      PARSER = new com.google.protobuf.AbstractParser<BuildApproval>() {
    @java.lang.Override
    public BuildApproval parsePartialFrom(
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

  public static com.google.protobuf.Parser<BuildApproval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BuildApproval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloudbuild.v1.BuildApproval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

