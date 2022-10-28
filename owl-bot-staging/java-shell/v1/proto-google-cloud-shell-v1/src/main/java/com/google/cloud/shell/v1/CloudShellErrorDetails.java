// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/shell/v1/cloudshell.proto

package com.google.cloud.shell.v1;

/**
 * <pre>
 * Cloud-shell specific information that will be included as details in failure
 * responses.
 * </pre>
 *
 * Protobuf type {@code google.cloud.shell.v1.CloudShellErrorDetails}
 */
public final class CloudShellErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.shell.v1.CloudShellErrorDetails)
    CloudShellErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CloudShellErrorDetails.newBuilder() to construct.
  private CloudShellErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CloudShellErrorDetails() {
    code_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CloudShellErrorDetails();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_CloudShellErrorDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_CloudShellErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.shell.v1.CloudShellErrorDetails.class, com.google.cloud.shell.v1.CloudShellErrorDetails.Builder.class);
  }

  /**
   * <pre>
   * Set of possible errors returned from API calls.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode}
   */
  public enum CloudShellErrorCode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * An unknown error occurred.
     * </pre>
     *
     * <code>CLOUD_SHELL_ERROR_CODE_UNSPECIFIED = 0;</code>
     */
    CLOUD_SHELL_ERROR_CODE_UNSPECIFIED(0),
    /**
     * <pre>
     * The image used by the Cloud Shell environment either does not exist or
     * the user does not have access to it.
     * </pre>
     *
     * <code>IMAGE_UNAVAILABLE = 1;</code>
     */
    IMAGE_UNAVAILABLE(1),
    /**
     * <pre>
     * Cloud Shell has been disabled by an administrator for the user making the
     * request.
     * </pre>
     *
     * <code>CLOUD_SHELL_DISABLED = 2;</code>
     */
    CLOUD_SHELL_DISABLED(2),
    /**
     * <pre>
     * Cloud Shell has been permanently disabled due to a Terms of Service
     * violation by the user.
     * </pre>
     *
     * <code>TOS_VIOLATION = 4;</code>
     */
    TOS_VIOLATION(4),
    /**
     * <pre>
     * The user has exhausted their weekly Cloud Shell quota, and Cloud Shell
     * will be disabled until the quota resets.
     * </pre>
     *
     * <code>QUOTA_EXCEEDED = 5;</code>
     */
    QUOTA_EXCEEDED(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * An unknown error occurred.
     * </pre>
     *
     * <code>CLOUD_SHELL_ERROR_CODE_UNSPECIFIED = 0;</code>
     */
    public static final int CLOUD_SHELL_ERROR_CODE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The image used by the Cloud Shell environment either does not exist or
     * the user does not have access to it.
     * </pre>
     *
     * <code>IMAGE_UNAVAILABLE = 1;</code>
     */
    public static final int IMAGE_UNAVAILABLE_VALUE = 1;
    /**
     * <pre>
     * Cloud Shell has been disabled by an administrator for the user making the
     * request.
     * </pre>
     *
     * <code>CLOUD_SHELL_DISABLED = 2;</code>
     */
    public static final int CLOUD_SHELL_DISABLED_VALUE = 2;
    /**
     * <pre>
     * Cloud Shell has been permanently disabled due to a Terms of Service
     * violation by the user.
     * </pre>
     *
     * <code>TOS_VIOLATION = 4;</code>
     */
    public static final int TOS_VIOLATION_VALUE = 4;
    /**
     * <pre>
     * The user has exhausted their weekly Cloud Shell quota, and Cloud Shell
     * will be disabled until the quota resets.
     * </pre>
     *
     * <code>QUOTA_EXCEEDED = 5;</code>
     */
    public static final int QUOTA_EXCEEDED_VALUE = 5;


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
    public static CloudShellErrorCode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CloudShellErrorCode forNumber(int value) {
      switch (value) {
        case 0: return CLOUD_SHELL_ERROR_CODE_UNSPECIFIED;
        case 1: return IMAGE_UNAVAILABLE;
        case 2: return CLOUD_SHELL_DISABLED;
        case 4: return TOS_VIOLATION;
        case 5: return QUOTA_EXCEEDED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CloudShellErrorCode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CloudShellErrorCode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CloudShellErrorCode>() {
            public CloudShellErrorCode findValueByNumber(int number) {
              return CloudShellErrorCode.forNumber(number);
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
      return com.google.cloud.shell.v1.CloudShellErrorDetails.getDescriptor().getEnumTypes().get(0);
    }

    private static final CloudShellErrorCode[] VALUES = values();

    public static CloudShellErrorCode valueOf(
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

    private CloudShellErrorCode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode)
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <pre>
   * Code indicating the specific error the occurred.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override public int getCodeValue() {
    return code_;
  }
  /**
   * <pre>
   * Code indicating the specific error the occurred.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
   * @return The code.
   */
  @java.lang.Override public com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode getCode() {
    @SuppressWarnings("deprecation")
    com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode result = com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode.valueOf(code_);
    return result == null ? com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode.UNRECOGNIZED : result;
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
    if (code_ != com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode.CLOUD_SHELL_ERROR_CODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, code_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode.CLOUD_SHELL_ERROR_CODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
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
    if (!(obj instanceof com.google.cloud.shell.v1.CloudShellErrorDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.shell.v1.CloudShellErrorDetails other = (com.google.cloud.shell.v1.CloudShellErrorDetails) obj;

    if (code_ != other.code_) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.shell.v1.CloudShellErrorDetails parseFrom(
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
  public static Builder newBuilder(com.google.cloud.shell.v1.CloudShellErrorDetails prototype) {
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
   * Cloud-shell specific information that will be included as details in failure
   * responses.
   * </pre>
   *
   * Protobuf type {@code google.cloud.shell.v1.CloudShellErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.shell.v1.CloudShellErrorDetails)
      com.google.cloud.shell.v1.CloudShellErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_CloudShellErrorDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_CloudShellErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.shell.v1.CloudShellErrorDetails.class, com.google.cloud.shell.v1.CloudShellErrorDetails.Builder.class);
    }

    // Construct using com.google.cloud.shell.v1.CloudShellErrorDetails.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.shell.v1.CloudShellProto.internal_static_google_cloud_shell_v1_CloudShellErrorDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.CloudShellErrorDetails getDefaultInstanceForType() {
      return com.google.cloud.shell.v1.CloudShellErrorDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.CloudShellErrorDetails build() {
      com.google.cloud.shell.v1.CloudShellErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.CloudShellErrorDetails buildPartial() {
      com.google.cloud.shell.v1.CloudShellErrorDetails result = new com.google.cloud.shell.v1.CloudShellErrorDetails(this);
      result.code_ = code_;
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
      if (other instanceof com.google.cloud.shell.v1.CloudShellErrorDetails) {
        return mergeFrom((com.google.cloud.shell.v1.CloudShellErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.shell.v1.CloudShellErrorDetails other) {
      if (other == com.google.cloud.shell.v1.CloudShellErrorDetails.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
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
              code_ = input.readEnum();

              break;
            } // case 8
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

    private int code_ = 0;
    /**
     * <pre>
     * Code indicating the specific error the occurred.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <pre>
     * Code indicating the specific error the occurred.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Code indicating the specific error the occurred.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode getCode() {
      @SuppressWarnings("deprecation")
      com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode result = com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode.valueOf(code_);
      return result == null ? com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Code indicating the specific error the occurred.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Code indicating the specific error the occurred.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.CloudShellErrorDetails.CloudShellErrorCode code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.shell.v1.CloudShellErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.shell.v1.CloudShellErrorDetails)
  private static final com.google.cloud.shell.v1.CloudShellErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.shell.v1.CloudShellErrorDetails();
  }

  public static com.google.cloud.shell.v1.CloudShellErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudShellErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<CloudShellErrorDetails>() {
    @java.lang.Override
    public CloudShellErrorDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudShellErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudShellErrorDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.shell.v1.CloudShellErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

