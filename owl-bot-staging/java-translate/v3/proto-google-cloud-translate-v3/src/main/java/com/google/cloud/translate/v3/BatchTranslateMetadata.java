// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

/**
 * <pre>
 * State metadata for the batch translation operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.BatchTranslateMetadata}
 */
public final class BatchTranslateMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.BatchTranslateMetadata)
    BatchTranslateMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchTranslateMetadata.newBuilder() to construct.
  private BatchTranslateMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchTranslateMetadata() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchTranslateMetadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.BatchTranslateMetadata.class, com.google.cloud.translate.v3.BatchTranslateMetadata.Builder.class);
  }

  /**
   * <pre>
   * State of the job.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.translation.v3.BatchTranslateMetadata.State}
   */
  public enum State
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Invalid.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     * <pre>
     * Request is being processed.
     * </pre>
     *
     * <code>RUNNING = 1;</code>
     */
    RUNNING(1),
    /**
     * <pre>
     * The batch is processed, and at least one item was successfully
     * processed.
     * </pre>
     *
     * <code>SUCCEEDED = 2;</code>
     */
    SUCCEEDED(2),
    /**
     * <pre>
     * The batch is done and no item was successfully processed.
     * </pre>
     *
     * <code>FAILED = 3;</code>
     */
    FAILED(3),
    /**
     * <pre>
     * Request is in the process of being canceled after caller invoked
     * longrunning.Operations.CancelOperation on the request id.
     * </pre>
     *
     * <code>CANCELLING = 4;</code>
     */
    CANCELLING(4),
    /**
     * <pre>
     * The batch is done after the user has called the
     * longrunning.Operations.CancelOperation. Any records processed before the
     * cancel command are output as specified in the request.
     * </pre>
     *
     * <code>CANCELLED = 5;</code>
     */
    CANCELLED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Invalid.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Request is being processed.
     * </pre>
     *
     * <code>RUNNING = 1;</code>
     */
    public static final int RUNNING_VALUE = 1;
    /**
     * <pre>
     * The batch is processed, and at least one item was successfully
     * processed.
     * </pre>
     *
     * <code>SUCCEEDED = 2;</code>
     */
    public static final int SUCCEEDED_VALUE = 2;
    /**
     * <pre>
     * The batch is done and no item was successfully processed.
     * </pre>
     *
     * <code>FAILED = 3;</code>
     */
    public static final int FAILED_VALUE = 3;
    /**
     * <pre>
     * Request is in the process of being canceled after caller invoked
     * longrunning.Operations.CancelOperation on the request id.
     * </pre>
     *
     * <code>CANCELLING = 4;</code>
     */
    public static final int CANCELLING_VALUE = 4;
    /**
     * <pre>
     * The batch is done after the user has called the
     * longrunning.Operations.CancelOperation. Any records processed before the
     * cancel command are output as specified in the request.
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
        case 1: return RUNNING;
        case 2: return SUCCEEDED;
        case 3: return FAILED;
        case 4: return CANCELLING;
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
      return com.google.cloud.translate.v3.BatchTranslateMetadata.getDescriptor().getEnumTypes().get(0);
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

    // @@protoc_insertion_point(enum_scope:google.cloud.translation.v3.BatchTranslateMetadata.State)
  }

  public static final int STATE_FIELD_NUMBER = 1;
  private int state_;
  /**
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <pre>
   * The state of the operation.
   * </pre>
   *
   * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
   * @return The state.
   */
  @java.lang.Override public com.google.cloud.translate.v3.BatchTranslateMetadata.State getState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.translate.v3.BatchTranslateMetadata.State result = com.google.cloud.translate.v3.BatchTranslateMetadata.State.valueOf(state_);
    return result == null ? com.google.cloud.translate.v3.BatchTranslateMetadata.State.UNRECOGNIZED : result;
  }

  public static final int TRANSLATED_CHARACTERS_FIELD_NUMBER = 2;
  private long translatedCharacters_;
  /**
   * <pre>
   * Number of successfully translated characters so far (Unicode codepoints).
   * </pre>
   *
   * <code>int64 translated_characters = 2;</code>
   * @return The translatedCharacters.
   */
  @java.lang.Override
  public long getTranslatedCharacters() {
    return translatedCharacters_;
  }

  public static final int FAILED_CHARACTERS_FIELD_NUMBER = 3;
  private long failedCharacters_;
  /**
   * <pre>
   * Number of characters that have failed to process so far (Unicode
   * codepoints).
   * </pre>
   *
   * <code>int64 failed_characters = 3;</code>
   * @return The failedCharacters.
   */
  @java.lang.Override
  public long getFailedCharacters() {
    return failedCharacters_;
  }

  public static final int TOTAL_CHARACTERS_FIELD_NUMBER = 4;
  private long totalCharacters_;
  /**
   * <pre>
   * Total number of characters (Unicode codepoints).
   * This is the total number of codepoints from input files times the number of
   * target languages and appears here shortly after the call is submitted.
   * </pre>
   *
   * <code>int64 total_characters = 4;</code>
   * @return The totalCharacters.
   */
  @java.lang.Override
  public long getTotalCharacters() {
    return totalCharacters_;
  }

  public static final int SUBMIT_TIME_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp submitTime_;
  /**
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 5;</code>
   * @return Whether the submitTime field is set.
   */
  @java.lang.Override
  public boolean hasSubmitTime() {
    return submitTime_ != null;
  }
  /**
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 5;</code>
   * @return The submitTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getSubmitTime() {
    return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
  }
  /**
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
    return getSubmitTime();
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
    if (state_ != com.google.cloud.translate.v3.BatchTranslateMetadata.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, state_);
    }
    if (translatedCharacters_ != 0L) {
      output.writeInt64(2, translatedCharacters_);
    }
    if (failedCharacters_ != 0L) {
      output.writeInt64(3, failedCharacters_);
    }
    if (totalCharacters_ != 0L) {
      output.writeInt64(4, totalCharacters_);
    }
    if (submitTime_ != null) {
      output.writeMessage(5, getSubmitTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != com.google.cloud.translate.v3.BatchTranslateMetadata.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, state_);
    }
    if (translatedCharacters_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, translatedCharacters_);
    }
    if (failedCharacters_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, failedCharacters_);
    }
    if (totalCharacters_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalCharacters_);
    }
    if (submitTime_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getSubmitTime());
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
    if (!(obj instanceof com.google.cloud.translate.v3.BatchTranslateMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.BatchTranslateMetadata other = (com.google.cloud.translate.v3.BatchTranslateMetadata) obj;

    if (state_ != other.state_) return false;
    if (getTranslatedCharacters()
        != other.getTranslatedCharacters()) return false;
    if (getFailedCharacters()
        != other.getFailedCharacters()) return false;
    if (getTotalCharacters()
        != other.getTotalCharacters()) return false;
    if (hasSubmitTime() != other.hasSubmitTime()) return false;
    if (hasSubmitTime()) {
      if (!getSubmitTime()
          .equals(other.getSubmitTime())) return false;
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
    hash = (37 * hash) + TRANSLATED_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTranslatedCharacters());
    hash = (37 * hash) + FAILED_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFailedCharacters());
    hash = (37 * hash) + TOTAL_CHARACTERS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalCharacters());
    if (hasSubmitTime()) {
      hash = (37 * hash) + SUBMIT_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getSubmitTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.translate.v3.BatchTranslateMetadata parseFrom(
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
  public static Builder newBuilder(com.google.cloud.translate.v3.BatchTranslateMetadata prototype) {
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
   * State metadata for the batch translation operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.BatchTranslateMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.BatchTranslateMetadata)
      com.google.cloud.translate.v3.BatchTranslateMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.BatchTranslateMetadata.class, com.google.cloud.translate.v3.BatchTranslateMetadata.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.BatchTranslateMetadata.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      state_ = 0;

      translatedCharacters_ = 0L;

      failedCharacters_ = 0L;

      totalCharacters_ = 0L;

      if (submitTimeBuilder_ == null) {
        submitTime_ = null;
      } else {
        submitTime_ = null;
        submitTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto.internal_static_google_cloud_translation_v3_BatchTranslateMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateMetadata getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.BatchTranslateMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateMetadata build() {
      com.google.cloud.translate.v3.BatchTranslateMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateMetadata buildPartial() {
      com.google.cloud.translate.v3.BatchTranslateMetadata result = new com.google.cloud.translate.v3.BatchTranslateMetadata(this);
      result.state_ = state_;
      result.translatedCharacters_ = translatedCharacters_;
      result.failedCharacters_ = failedCharacters_;
      result.totalCharacters_ = totalCharacters_;
      if (submitTimeBuilder_ == null) {
        result.submitTime_ = submitTime_;
      } else {
        result.submitTime_ = submitTimeBuilder_.build();
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
      if (other instanceof com.google.cloud.translate.v3.BatchTranslateMetadata) {
        return mergeFrom((com.google.cloud.translate.v3.BatchTranslateMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.BatchTranslateMetadata other) {
      if (other == com.google.cloud.translate.v3.BatchTranslateMetadata.getDefaultInstance()) return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getTranslatedCharacters() != 0L) {
        setTranslatedCharacters(other.getTranslatedCharacters());
      }
      if (other.getFailedCharacters() != 0L) {
        setFailedCharacters(other.getFailedCharacters());
      }
      if (other.getTotalCharacters() != 0L) {
        setTotalCharacters(other.getTotalCharacters());
      }
      if (other.hasSubmitTime()) {
        mergeSubmitTime(other.getSubmitTime());
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

              break;
            } // case 8
            case 16: {
              translatedCharacters_ = input.readInt64();

              break;
            } // case 16
            case 24: {
              failedCharacters_ = input.readInt64();

              break;
            } // case 24
            case 32: {
              totalCharacters_ = input.readInt64();

              break;
            } // case 32
            case 42: {
              input.readMessage(
                  getSubmitTimeFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 42
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

    private int state_ = 0;
    /**
     * <pre>
     * The state of the operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <pre>
     * The state of the operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.translate.v3.BatchTranslateMetadata.State getState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.translate.v3.BatchTranslateMetadata.State result = com.google.cloud.translate.v3.BatchTranslateMetadata.State.valueOf(state_);
      return result == null ? com.google.cloud.translate.v3.BatchTranslateMetadata.State.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The state of the operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.translate.v3.BatchTranslateMetadata.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The state of the operation.
     * </pre>
     *
     * <code>.google.cloud.translation.v3.BatchTranslateMetadata.State state = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }

    private long translatedCharacters_ ;
    /**
     * <pre>
     * Number of successfully translated characters so far (Unicode codepoints).
     * </pre>
     *
     * <code>int64 translated_characters = 2;</code>
     * @return The translatedCharacters.
     */
    @java.lang.Override
    public long getTranslatedCharacters() {
      return translatedCharacters_;
    }
    /**
     * <pre>
     * Number of successfully translated characters so far (Unicode codepoints).
     * </pre>
     *
     * <code>int64 translated_characters = 2;</code>
     * @param value The translatedCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setTranslatedCharacters(long value) {
      
      translatedCharacters_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of successfully translated characters so far (Unicode codepoints).
     * </pre>
     *
     * <code>int64 translated_characters = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTranslatedCharacters() {
      
      translatedCharacters_ = 0L;
      onChanged();
      return this;
    }

    private long failedCharacters_ ;
    /**
     * <pre>
     * Number of characters that have failed to process so far (Unicode
     * codepoints).
     * </pre>
     *
     * <code>int64 failed_characters = 3;</code>
     * @return The failedCharacters.
     */
    @java.lang.Override
    public long getFailedCharacters() {
      return failedCharacters_;
    }
    /**
     * <pre>
     * Number of characters that have failed to process so far (Unicode
     * codepoints).
     * </pre>
     *
     * <code>int64 failed_characters = 3;</code>
     * @param value The failedCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setFailedCharacters(long value) {
      
      failedCharacters_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of characters that have failed to process so far (Unicode
     * codepoints).
     * </pre>
     *
     * <code>int64 failed_characters = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedCharacters() {
      
      failedCharacters_ = 0L;
      onChanged();
      return this;
    }

    private long totalCharacters_ ;
    /**
     * <pre>
     * Total number of characters (Unicode codepoints).
     * This is the total number of codepoints from input files times the number of
     * target languages and appears here shortly after the call is submitted.
     * </pre>
     *
     * <code>int64 total_characters = 4;</code>
     * @return The totalCharacters.
     */
    @java.lang.Override
    public long getTotalCharacters() {
      return totalCharacters_;
    }
    /**
     * <pre>
     * Total number of characters (Unicode codepoints).
     * This is the total number of codepoints from input files times the number of
     * target languages and appears here shortly after the call is submitted.
     * </pre>
     *
     * <code>int64 total_characters = 4;</code>
     * @param value The totalCharacters to set.
     * @return This builder for chaining.
     */
    public Builder setTotalCharacters(long value) {
      
      totalCharacters_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of characters (Unicode codepoints).
     * This is the total number of codepoints from input files times the number of
     * target languages and appears here shortly after the call is submitted.
     * </pre>
     *
     * <code>int64 total_characters = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalCharacters() {
      
      totalCharacters_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp submitTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> submitTimeBuilder_;
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     * @return Whether the submitTime field is set.
     */
    public boolean hasSubmitTime() {
      return submitTimeBuilder_ != null || submitTime_ != null;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     * @return The submitTime.
     */
    public com.google.protobuf.Timestamp getSubmitTime() {
      if (submitTimeBuilder_ == null) {
        return submitTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
      } else {
        return submitTimeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    public Builder setSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        submitTime_ = value;
        onChanged();
      } else {
        submitTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    public Builder setSubmitTime(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (submitTimeBuilder_ == null) {
        submitTime_ = builderForValue.build();
        onChanged();
      } else {
        submitTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    public Builder mergeSubmitTime(com.google.protobuf.Timestamp value) {
      if (submitTimeBuilder_ == null) {
        if (submitTime_ != null) {
          submitTime_ =
            com.google.protobuf.Timestamp.newBuilder(submitTime_).mergeFrom(value).buildPartial();
        } else {
          submitTime_ = value;
        }
        onChanged();
      } else {
        submitTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    public Builder clearSubmitTime() {
      if (submitTimeBuilder_ == null) {
        submitTime_ = null;
        onChanged();
      } else {
        submitTime_ = null;
        submitTimeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getSubmitTimeBuilder() {
      
      onChanged();
      return getSubmitTimeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder() {
      if (submitTimeBuilder_ != null) {
        return submitTimeBuilder_.getMessageOrBuilder();
      } else {
        return submitTime_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : submitTime_;
      }
    }
    /**
     * <pre>
     * Time when the operation was submitted.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp submit_time = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getSubmitTimeFieldBuilder() {
      if (submitTimeBuilder_ == null) {
        submitTimeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getSubmitTime(),
                getParentForChildren(),
                isClean());
        submitTime_ = null;
      }
      return submitTimeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.BatchTranslateMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.BatchTranslateMetadata)
  private static final com.google.cloud.translate.v3.BatchTranslateMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.BatchTranslateMetadata();
  }

  public static com.google.cloud.translate.v3.BatchTranslateMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchTranslateMetadata>
      PARSER = new com.google.protobuf.AbstractParser<BatchTranslateMetadata>() {
    @java.lang.Override
    public BatchTranslateMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchTranslateMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchTranslateMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.BatchTranslateMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

