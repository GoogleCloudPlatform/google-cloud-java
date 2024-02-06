// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contentwarehouse/v1/document.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.contentwarehouse.v1;

/**
 * <pre>
 * Timestamp value type.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.TimestampValue}
 */
public final class TimestampValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.TimestampValue)
    TimestampValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TimestampValue.newBuilder() to construct.
  private TimestampValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TimestampValue() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TimestampValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto.internal_static_google_cloud_contentwarehouse_v1_TimestampValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.DocumentProto.internal_static_google_cloud_contentwarehouse_v1_TimestampValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.TimestampValue.class, com.google.cloud.contentwarehouse.v1.TimestampValue.Builder.class);
  }

  private int valueCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object value_;
  public enum ValueCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TIMESTAMP_VALUE(1),
    TEXT_VALUE(2),
    VALUE_NOT_SET(0);
    private final int value;
    private ValueCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValueCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValueCase forNumber(int value) {
      switch (value) {
        case 1: return TIMESTAMP_VALUE;
        case 2: return TEXT_VALUE;
        case 0: return VALUE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValueCase
  getValueCase() {
    return ValueCase.forNumber(
        valueCase_);
  }

  public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Timestamp value
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
   * @return Whether the timestampValue field is set.
   */
  @java.lang.Override
  public boolean hasTimestampValue() {
    return valueCase_ == 1;
  }
  /**
   * <pre>
   * Timestamp value
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
   * @return The timestampValue.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getTimestampValue() {
    if (valueCase_ == 1) {
       return (com.google.protobuf.Timestamp) value_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }
  /**
   * <pre>
   * Timestamp value
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder() {
    if (valueCase_ == 1) {
       return (com.google.protobuf.Timestamp) value_;
    }
    return com.google.protobuf.Timestamp.getDefaultInstance();
  }

  public static final int TEXT_VALUE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * The string must represent a valid instant in UTC and is parsed using
   * java.time.format.DateTimeFormatter.ISO_INSTANT.
   * e.g. "2013-09-29T18:46:19Z"
   * </pre>
   *
   * <code>string text_value = 2;</code>
   * @return Whether the textValue field is set.
   */
  public boolean hasTextValue() {
    return valueCase_ == 2;
  }
  /**
   * <pre>
   * The string must represent a valid instant in UTC and is parsed using
   * java.time.format.DateTimeFormatter.ISO_INSTANT.
   * e.g. "2013-09-29T18:46:19Z"
   * </pre>
   *
   * <code>string text_value = 2;</code>
   * @return The textValue.
   */
  public java.lang.String getTextValue() {
    java.lang.Object ref = "";
    if (valueCase_ == 2) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (valueCase_ == 2) {
        value_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The string must represent a valid instant in UTC and is parsed using
   * java.time.format.DateTimeFormatter.ISO_INSTANT.
   * e.g. "2013-09-29T18:46:19Z"
   * </pre>
   *
   * <code>string text_value = 2;</code>
   * @return The bytes for textValue.
   */
  public com.google.protobuf.ByteString
      getTextValueBytes() {
    java.lang.Object ref = "";
    if (valueCase_ == 2) {
      ref = value_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valueCase_ == 2) {
        value_ = b;
      }
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
    if (valueCase_ == 1) {
      output.writeMessage(1, (com.google.protobuf.Timestamp) value_);
    }
    if (valueCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valueCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.protobuf.Timestamp) value_);
    }
    if (valueCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.TimestampValue)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.TimestampValue other = (com.google.cloud.contentwarehouse.v1.TimestampValue) obj;

    if (!getValueCase().equals(other.getValueCase())) return false;
    switch (valueCase_) {
      case 1:
        if (!getTimestampValue()
            .equals(other.getTimestampValue())) return false;
        break;
      case 2:
        if (!getTextValue()
            .equals(other.getTextValue())) return false;
        break;
      case 0:
      default:
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
    switch (valueCase_) {
      case 1:
        hash = (37 * hash) + TIMESTAMP_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTimestampValue().hashCode();
        break;
      case 2:
        hash = (37 * hash) + TEXT_VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getTextValue().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contentwarehouse.v1.TimestampValue parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.TimestampValue prototype) {
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
   * Timestamp value type.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.TimestampValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.TimestampValue)
      com.google.cloud.contentwarehouse.v1.TimestampValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto.internal_static_google_cloud_contentwarehouse_v1_TimestampValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto.internal_static_google_cloud_contentwarehouse_v1_TimestampValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.TimestampValue.class, com.google.cloud.contentwarehouse.v1.TimestampValue.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.TimestampValue.newBuilder()
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
      if (timestampValueBuilder_ != null) {
        timestampValueBuilder_.clear();
      }
      valueCase_ = 0;
      value_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.DocumentProto.internal_static_google_cloud_contentwarehouse_v1_TimestampValue_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimestampValue getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.TimestampValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimestampValue build() {
      com.google.cloud.contentwarehouse.v1.TimestampValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.TimestampValue buildPartial() {
      com.google.cloud.contentwarehouse.v1.TimestampValue result = new com.google.cloud.contentwarehouse.v1.TimestampValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.TimestampValue result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.contentwarehouse.v1.TimestampValue result) {
      result.valueCase_ = valueCase_;
      result.value_ = this.value_;
      if (valueCase_ == 1 &&
          timestampValueBuilder_ != null) {
        result.value_ = timestampValueBuilder_.build();
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.TimestampValue) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.TimestampValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.TimestampValue other) {
      if (other == com.google.cloud.contentwarehouse.v1.TimestampValue.getDefaultInstance()) return this;
      switch (other.getValueCase()) {
        case TIMESTAMP_VALUE: {
          mergeTimestampValue(other.getTimestampValue());
          break;
        }
        case TEXT_VALUE: {
          valueCase_ = 2;
          value_ = other.value_;
          onChanged();
          break;
        }
        case VALUE_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getTimestampValueFieldBuilder().getBuilder(),
                  extensionRegistry);
              valueCase_ = 1;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              valueCase_ = 2;
              value_ = s;
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
    private int valueCase_ = 0;
    private java.lang.Object value_;
    public ValueCase
        getValueCase() {
      return ValueCase.forNumber(
          valueCase_);
    }

    public Builder clearValue() {
      valueCase_ = 0;
      value_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> timestampValueBuilder_;
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     * @return Whether the timestampValue field is set.
     */
    @java.lang.Override
    public boolean hasTimestampValue() {
      return valueCase_ == 1;
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     * @return The timestampValue.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getTimestampValue() {
      if (timestampValueBuilder_ == null) {
        if (valueCase_ == 1) {
          return (com.google.protobuf.Timestamp) value_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      } else {
        if (valueCase_ == 1) {
          return timestampValueBuilder_.getMessage();
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    public Builder setTimestampValue(com.google.protobuf.Timestamp value) {
      if (timestampValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        timestampValueBuilder_.setMessage(value);
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    public Builder setTimestampValue(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (timestampValueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        timestampValueBuilder_.setMessage(builderForValue.build());
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    public Builder mergeTimestampValue(com.google.protobuf.Timestamp value) {
      if (timestampValueBuilder_ == null) {
        if (valueCase_ == 1 &&
            value_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          value_ = com.google.protobuf.Timestamp.newBuilder((com.google.protobuf.Timestamp) value_)
              .mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        if (valueCase_ == 1) {
          timestampValueBuilder_.mergeFrom(value);
        } else {
          timestampValueBuilder_.setMessage(value);
        }
      }
      valueCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    public Builder clearTimestampValue() {
      if (timestampValueBuilder_ == null) {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
          onChanged();
        }
      } else {
        if (valueCase_ == 1) {
          valueCase_ = 0;
          value_ = null;
        }
        timestampValueBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getTimestampValueBuilder() {
      return getTimestampValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getTimestampValueOrBuilder() {
      if ((valueCase_ == 1) && (timestampValueBuilder_ != null)) {
        return timestampValueBuilder_.getMessageOrBuilder();
      } else {
        if (valueCase_ == 1) {
          return (com.google.protobuf.Timestamp) value_;
        }
        return com.google.protobuf.Timestamp.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Timestamp value
     * </pre>
     *
     * <code>.google.protobuf.Timestamp timestamp_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getTimestampValueFieldBuilder() {
      if (timestampValueBuilder_ == null) {
        if (!(valueCase_ == 1)) {
          value_ = com.google.protobuf.Timestamp.getDefaultInstance();
        }
        timestampValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                (com.google.protobuf.Timestamp) value_,
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      valueCase_ = 1;
      onChanged();
      return timestampValueBuilder_;
    }

    /**
     * <pre>
     * The string must represent a valid instant in UTC and is parsed using
     * java.time.format.DateTimeFormatter.ISO_INSTANT.
     * e.g. "2013-09-29T18:46:19Z"
     * </pre>
     *
     * <code>string text_value = 2;</code>
     * @return Whether the textValue field is set.
     */
    @java.lang.Override
    public boolean hasTextValue() {
      return valueCase_ == 2;
    }
    /**
     * <pre>
     * The string must represent a valid instant in UTC and is parsed using
     * java.time.format.DateTimeFormatter.ISO_INSTANT.
     * e.g. "2013-09-29T18:46:19Z"
     * </pre>
     *
     * <code>string text_value = 2;</code>
     * @return The textValue.
     */
    @java.lang.Override
    public java.lang.String getTextValue() {
      java.lang.Object ref = "";
      if (valueCase_ == 2) {
        ref = value_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valueCase_ == 2) {
          value_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The string must represent a valid instant in UTC and is parsed using
     * java.time.format.DateTimeFormatter.ISO_INSTANT.
     * e.g. "2013-09-29T18:46:19Z"
     * </pre>
     *
     * <code>string text_value = 2;</code>
     * @return The bytes for textValue.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTextValueBytes() {
      java.lang.Object ref = "";
      if (valueCase_ == 2) {
        ref = value_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valueCase_ == 2) {
          value_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The string must represent a valid instant in UTC and is parsed using
     * java.time.format.DateTimeFormatter.ISO_INSTANT.
     * e.g. "2013-09-29T18:46:19Z"
     * </pre>
     *
     * <code>string text_value = 2;</code>
     * @param value The textValue to set.
     * @return This builder for chaining.
     */
    public Builder setTextValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueCase_ = 2;
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The string must represent a valid instant in UTC and is parsed using
     * java.time.format.DateTimeFormatter.ISO_INSTANT.
     * e.g. "2013-09-29T18:46:19Z"
     * </pre>
     *
     * <code>string text_value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTextValue() {
      if (valueCase_ == 2) {
        valueCase_ = 0;
        value_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The string must represent a valid instant in UTC and is parsed using
     * java.time.format.DateTimeFormatter.ISO_INSTANT.
     * e.g. "2013-09-29T18:46:19Z"
     * </pre>
     *
     * <code>string text_value = 2;</code>
     * @param value The bytes for textValue to set.
     * @return This builder for chaining.
     */
    public Builder setTextValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueCase_ = 2;
      value_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.TimestampValue)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.TimestampValue)
  private static final com.google.cloud.contentwarehouse.v1.TimestampValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.TimestampValue();
  }

  public static com.google.cloud.contentwarehouse.v1.TimestampValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimestampValue>
      PARSER = new com.google.protobuf.AbstractParser<TimestampValue>() {
    @java.lang.Override
    public TimestampValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<TimestampValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimestampValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.TimestampValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

