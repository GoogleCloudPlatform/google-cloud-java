// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/v1/type.proto

package com.google.spanner.v1;

/**
 *
 *
 * <pre>
 * `Type` indicates the type of a Cloud Spanner value, as might be stored in a
 * table cell or returned from an SQL query.
 * </pre>
 *
 * Protobuf type {@code google.spanner.v1.Type}
 */
public final class Type extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.v1.Type)
    TypeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Type.newBuilder() to construct.
  private Type(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Type() {
    code_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Type();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Type(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8:
            {
              int rawValue = input.readEnum();

              code_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.spanner.v1.Type.Builder subBuilder = null;
              if (arrayElementType_ != null) {
                subBuilder = arrayElementType_.toBuilder();
              }
              arrayElementType_ =
                  input.readMessage(com.google.spanner.v1.Type.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(arrayElementType_);
                arrayElementType_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              com.google.spanner.v1.StructType.Builder subBuilder = null;
              if (structType_ != null) {
                subBuilder = structType_.toBuilder();
              }
              structType_ =
                  input.readMessage(com.google.spanner.v1.StructType.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(structType_);
                structType_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.v1.TypeProto.internal_static_google_spanner_v1_Type_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.v1.TypeProto.internal_static_google_spanner_v1_Type_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.v1.Type.class, com.google.spanner.v1.Type.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   *
   *
   * <pre>
   * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
   * </pre>
   *
   * <code>.google.spanner.v1.TypeCode code = 1;</code>
   */
  public int getCodeValue() {
    return code_;
  }
  /**
   *
   *
   * <pre>
   * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
   * </pre>
   *
   * <code>.google.spanner.v1.TypeCode code = 1;</code>
   */
  public com.google.spanner.v1.TypeCode getCode() {
    @SuppressWarnings("deprecation")
    com.google.spanner.v1.TypeCode result = com.google.spanner.v1.TypeCode.valueOf(code_);
    return result == null ? com.google.spanner.v1.TypeCode.UNRECOGNIZED : result;
  }

  public static final int ARRAY_ELEMENT_TYPE_FIELD_NUMBER = 2;
  private com.google.spanner.v1.Type arrayElementType_;
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
   * type of the array elements.
   * </pre>
   *
   * <code>.google.spanner.v1.Type array_element_type = 2;</code>
   */
  public boolean hasArrayElementType() {
    return arrayElementType_ != null;
  }
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
   * type of the array elements.
   * </pre>
   *
   * <code>.google.spanner.v1.Type array_element_type = 2;</code>
   */
  public com.google.spanner.v1.Type getArrayElementType() {
    return arrayElementType_ == null
        ? com.google.spanner.v1.Type.getDefaultInstance()
        : arrayElementType_;
  }
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
   * type of the array elements.
   * </pre>
   *
   * <code>.google.spanner.v1.Type array_element_type = 2;</code>
   */
  public com.google.spanner.v1.TypeOrBuilder getArrayElementTypeOrBuilder() {
    return getArrayElementType();
  }

  public static final int STRUCT_TYPE_FIELD_NUMBER = 3;
  private com.google.spanner.v1.StructType structType_;
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
   * type information for the struct's fields.
   * </pre>
   *
   * <code>.google.spanner.v1.StructType struct_type = 3;</code>
   */
  public boolean hasStructType() {
    return structType_ != null;
  }
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
   * type information for the struct's fields.
   * </pre>
   *
   * <code>.google.spanner.v1.StructType struct_type = 3;</code>
   */
  public com.google.spanner.v1.StructType getStructType() {
    return structType_ == null
        ? com.google.spanner.v1.StructType.getDefaultInstance()
        : structType_;
  }
  /**
   *
   *
   * <pre>
   * If [code][google.spanner.v1.Type.code] ==
   * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
   * type information for the struct's fields.
   * </pre>
   *
   * <code>.google.spanner.v1.StructType struct_type = 3;</code>
   */
  public com.google.spanner.v1.StructTypeOrBuilder getStructTypeOrBuilder() {
    return getStructType();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (code_ != com.google.spanner.v1.TypeCode.TYPE_CODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (arrayElementType_ != null) {
      output.writeMessage(2, getArrayElementType());
    }
    if (structType_ != null) {
      output.writeMessage(3, getStructType());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.google.spanner.v1.TypeCode.TYPE_CODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, code_);
    }
    if (arrayElementType_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getArrayElementType());
    }
    if (structType_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getStructType());
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
    if (!(obj instanceof com.google.spanner.v1.Type)) {
      return super.equals(obj);
    }
    com.google.spanner.v1.Type other = (com.google.spanner.v1.Type) obj;

    if (code_ != other.code_) return false;
    if (hasArrayElementType() != other.hasArrayElementType()) return false;
    if (hasArrayElementType()) {
      if (!getArrayElementType().equals(other.getArrayElementType())) return false;
    }
    if (hasStructType() != other.hasStructType()) return false;
    if (hasStructType()) {
      if (!getStructType().equals(other.getStructType())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (hasArrayElementType()) {
      hash = (37 * hash) + ARRAY_ELEMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getArrayElementType().hashCode();
    }
    if (hasStructType()) {
      hash = (37 * hash) + STRUCT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getStructType().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.v1.Type parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.Type parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.Type parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.Type parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.Type parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.v1.Type parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.v1.Type parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.Type parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.Type parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.Type parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.v1.Type parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.v1.Type parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.spanner.v1.Type prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * `Type` indicates the type of a Cloud Spanner value, as might be stored in a
   * table cell or returned from an SQL query.
   * </pre>
   *
   * Protobuf type {@code google.spanner.v1.Type}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.v1.Type)
      com.google.spanner.v1.TypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.v1.TypeProto.internal_static_google_spanner_v1_Type_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.v1.TypeProto
          .internal_static_google_spanner_v1_Type_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.v1.Type.class, com.google.spanner.v1.Type.Builder.class);
    }

    // Construct using com.google.spanner.v1.Type.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      if (arrayElementTypeBuilder_ == null) {
        arrayElementType_ = null;
      } else {
        arrayElementType_ = null;
        arrayElementTypeBuilder_ = null;
      }
      if (structTypeBuilder_ == null) {
        structType_ = null;
      } else {
        structType_ = null;
        structTypeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.v1.TypeProto.internal_static_google_spanner_v1_Type_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.v1.Type getDefaultInstanceForType() {
      return com.google.spanner.v1.Type.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.v1.Type build() {
      com.google.spanner.v1.Type result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.v1.Type buildPartial() {
      com.google.spanner.v1.Type result = new com.google.spanner.v1.Type(this);
      result.code_ = code_;
      if (arrayElementTypeBuilder_ == null) {
        result.arrayElementType_ = arrayElementType_;
      } else {
        result.arrayElementType_ = arrayElementTypeBuilder_.build();
      }
      if (structTypeBuilder_ == null) {
        result.structType_ = structType_;
      } else {
        result.structType_ = structTypeBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.v1.Type) {
        return mergeFrom((com.google.spanner.v1.Type) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.v1.Type other) {
      if (other == com.google.spanner.v1.Type.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (other.hasArrayElementType()) {
        mergeArrayElementType(other.getArrayElementType());
      }
      if (other.hasStructType()) {
        mergeStructType(other.getStructType());
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
      com.google.spanner.v1.Type parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.spanner.v1.Type) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
     * </pre>
     *
     * <code>.google.spanner.v1.TypeCode code = 1;</code>
     */
    public int getCodeValue() {
      return code_;
    }
    /**
     *
     *
     * <pre>
     * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
     * </pre>
     *
     * <code>.google.spanner.v1.TypeCode code = 1;</code>
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
     * </pre>
     *
     * <code>.google.spanner.v1.TypeCode code = 1;</code>
     */
    public com.google.spanner.v1.TypeCode getCode() {
      @SuppressWarnings("deprecation")
      com.google.spanner.v1.TypeCode result = com.google.spanner.v1.TypeCode.valueOf(code_);
      return result == null ? com.google.spanner.v1.TypeCode.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
     * </pre>
     *
     * <code>.google.spanner.v1.TypeCode code = 1;</code>
     */
    public Builder setCode(com.google.spanner.v1.TypeCode value) {
      if (value == null) {
        throw new NullPointerException();
      }

      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [TypeCode][google.spanner.v1.TypeCode] for this type.
     * </pre>
     *
     * <code>.google.spanner.v1.TypeCode code = 1;</code>
     */
    public Builder clearCode() {

      code_ = 0;
      onChanged();
      return this;
    }

    private com.google.spanner.v1.Type arrayElementType_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.Type,
            com.google.spanner.v1.Type.Builder,
            com.google.spanner.v1.TypeOrBuilder>
        arrayElementTypeBuilder_;
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public boolean hasArrayElementType() {
      return arrayElementTypeBuilder_ != null || arrayElementType_ != null;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public com.google.spanner.v1.Type getArrayElementType() {
      if (arrayElementTypeBuilder_ == null) {
        return arrayElementType_ == null
            ? com.google.spanner.v1.Type.getDefaultInstance()
            : arrayElementType_;
      } else {
        return arrayElementTypeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public Builder setArrayElementType(com.google.spanner.v1.Type value) {
      if (arrayElementTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        arrayElementType_ = value;
        onChanged();
      } else {
        arrayElementTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public Builder setArrayElementType(com.google.spanner.v1.Type.Builder builderForValue) {
      if (arrayElementTypeBuilder_ == null) {
        arrayElementType_ = builderForValue.build();
        onChanged();
      } else {
        arrayElementTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public Builder mergeArrayElementType(com.google.spanner.v1.Type value) {
      if (arrayElementTypeBuilder_ == null) {
        if (arrayElementType_ != null) {
          arrayElementType_ =
              com.google.spanner.v1.Type.newBuilder(arrayElementType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          arrayElementType_ = value;
        }
        onChanged();
      } else {
        arrayElementTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public Builder clearArrayElementType() {
      if (arrayElementTypeBuilder_ == null) {
        arrayElementType_ = null;
        onChanged();
      } else {
        arrayElementType_ = null;
        arrayElementTypeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public com.google.spanner.v1.Type.Builder getArrayElementTypeBuilder() {

      onChanged();
      return getArrayElementTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    public com.google.spanner.v1.TypeOrBuilder getArrayElementTypeOrBuilder() {
      if (arrayElementTypeBuilder_ != null) {
        return arrayElementTypeBuilder_.getMessageOrBuilder();
      } else {
        return arrayElementType_ == null
            ? com.google.spanner.v1.Type.getDefaultInstance()
            : arrayElementType_;
      }
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [ARRAY][google.spanner.v1.TypeCode.ARRAY], then `array_element_type` is the
     * type of the array elements.
     * </pre>
     *
     * <code>.google.spanner.v1.Type array_element_type = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.Type,
            com.google.spanner.v1.Type.Builder,
            com.google.spanner.v1.TypeOrBuilder>
        getArrayElementTypeFieldBuilder() {
      if (arrayElementTypeBuilder_ == null) {
        arrayElementTypeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.v1.Type,
                com.google.spanner.v1.Type.Builder,
                com.google.spanner.v1.TypeOrBuilder>(
                getArrayElementType(), getParentForChildren(), isClean());
        arrayElementType_ = null;
      }
      return arrayElementTypeBuilder_;
    }

    private com.google.spanner.v1.StructType structType_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.StructType,
            com.google.spanner.v1.StructType.Builder,
            com.google.spanner.v1.StructTypeOrBuilder>
        structTypeBuilder_;
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public boolean hasStructType() {
      return structTypeBuilder_ != null || structType_ != null;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public com.google.spanner.v1.StructType getStructType() {
      if (structTypeBuilder_ == null) {
        return structType_ == null
            ? com.google.spanner.v1.StructType.getDefaultInstance()
            : structType_;
      } else {
        return structTypeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public Builder setStructType(com.google.spanner.v1.StructType value) {
      if (structTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        structType_ = value;
        onChanged();
      } else {
        structTypeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public Builder setStructType(com.google.spanner.v1.StructType.Builder builderForValue) {
      if (structTypeBuilder_ == null) {
        structType_ = builderForValue.build();
        onChanged();
      } else {
        structTypeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public Builder mergeStructType(com.google.spanner.v1.StructType value) {
      if (structTypeBuilder_ == null) {
        if (structType_ != null) {
          structType_ =
              com.google.spanner.v1.StructType.newBuilder(structType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          structType_ = value;
        }
        onChanged();
      } else {
        structTypeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public Builder clearStructType() {
      if (structTypeBuilder_ == null) {
        structType_ = null;
        onChanged();
      } else {
        structType_ = null;
        structTypeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public com.google.spanner.v1.StructType.Builder getStructTypeBuilder() {

      onChanged();
      return getStructTypeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    public com.google.spanner.v1.StructTypeOrBuilder getStructTypeOrBuilder() {
      if (structTypeBuilder_ != null) {
        return structTypeBuilder_.getMessageOrBuilder();
      } else {
        return structType_ == null
            ? com.google.spanner.v1.StructType.getDefaultInstance()
            : structType_;
      }
    }
    /**
     *
     *
     * <pre>
     * If [code][google.spanner.v1.Type.code] ==
     * [STRUCT][google.spanner.v1.TypeCode.STRUCT], then `struct_type` provides
     * type information for the struct's fields.
     * </pre>
     *
     * <code>.google.spanner.v1.StructType struct_type = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.spanner.v1.StructType,
            com.google.spanner.v1.StructType.Builder,
            com.google.spanner.v1.StructTypeOrBuilder>
        getStructTypeFieldBuilder() {
      if (structTypeBuilder_ == null) {
        structTypeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.spanner.v1.StructType,
                com.google.spanner.v1.StructType.Builder,
                com.google.spanner.v1.StructTypeOrBuilder>(
                getStructType(), getParentForChildren(), isClean());
        structType_ = null;
      }
      return structTypeBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.v1.Type)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.v1.Type)
  private static final com.google.spanner.v1.Type DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.v1.Type();
  }

  public static com.google.spanner.v1.Type getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Type> PARSER =
      new com.google.protobuf.AbstractParser<Type>() {
        @java.lang.Override
        public Type parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Type(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Type> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Type> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.v1.Type getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
