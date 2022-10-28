// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Represents a color in the RGB color space.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.Color}
 */
public final class Color extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.Color)
    ColorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Color.newBuilder() to construct.
  private Color(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Color() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Color();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Color_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Color_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.Color.class, com.google.privacy.dlp.v2.Color.Builder.class);
  }

  public static final int RED_FIELD_NUMBER = 1;
  private float red_;
  /**
   * <pre>
   * The amount of red in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float red = 1;</code>
   * @return The red.
   */
  @java.lang.Override
  public float getRed() {
    return red_;
  }

  public static final int GREEN_FIELD_NUMBER = 2;
  private float green_;
  /**
   * <pre>
   * The amount of green in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float green = 2;</code>
   * @return The green.
   */
  @java.lang.Override
  public float getGreen() {
    return green_;
  }

  public static final int BLUE_FIELD_NUMBER = 3;
  private float blue_;
  /**
   * <pre>
   * The amount of blue in the color as a value in the interval [0, 1].
   * </pre>
   *
   * <code>float blue = 3;</code>
   * @return The blue.
   */
  @java.lang.Override
  public float getBlue() {
    return blue_;
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
    if (java.lang.Float.floatToRawIntBits(red_) != 0) {
      output.writeFloat(1, red_);
    }
    if (java.lang.Float.floatToRawIntBits(green_) != 0) {
      output.writeFloat(2, green_);
    }
    if (java.lang.Float.floatToRawIntBits(blue_) != 0) {
      output.writeFloat(3, blue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(red_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, red_);
    }
    if (java.lang.Float.floatToRawIntBits(green_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, green_);
    }
    if (java.lang.Float.floatToRawIntBits(blue_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, blue_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.Color)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.Color other = (com.google.privacy.dlp.v2.Color) obj;

    if (java.lang.Float.floatToIntBits(getRed())
        != java.lang.Float.floatToIntBits(
            other.getRed())) return false;
    if (java.lang.Float.floatToIntBits(getGreen())
        != java.lang.Float.floatToIntBits(
            other.getGreen())) return false;
    if (java.lang.Float.floatToIntBits(getBlue())
        != java.lang.Float.floatToIntBits(
            other.getBlue())) return false;
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
    hash = (37 * hash) + RED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRed());
    hash = (37 * hash) + GREEN_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getGreen());
    hash = (37 * hash) + BLUE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBlue());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.Color parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Color parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.Color parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.Color parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.Color prototype) {
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
   * Represents a color in the RGB color space.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.Color}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.Color)
      com.google.privacy.dlp.v2.ColorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Color_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Color_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.Color.class, com.google.privacy.dlp.v2.Color.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.Color.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      red_ = 0F;

      green_ = 0F;

      blue_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_Color_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Color getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.Color.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Color build() {
      com.google.privacy.dlp.v2.Color result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.Color buildPartial() {
      com.google.privacy.dlp.v2.Color result = new com.google.privacy.dlp.v2.Color(this);
      result.red_ = red_;
      result.green_ = green_;
      result.blue_ = blue_;
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
      if (other instanceof com.google.privacy.dlp.v2.Color) {
        return mergeFrom((com.google.privacy.dlp.v2.Color)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.Color other) {
      if (other == com.google.privacy.dlp.v2.Color.getDefaultInstance()) return this;
      if (other.getRed() != 0F) {
        setRed(other.getRed());
      }
      if (other.getGreen() != 0F) {
        setGreen(other.getGreen());
      }
      if (other.getBlue() != 0F) {
        setBlue(other.getBlue());
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
            case 13: {
              red_ = input.readFloat();

              break;
            } // case 13
            case 21: {
              green_ = input.readFloat();

              break;
            } // case 21
            case 29: {
              blue_ = input.readFloat();

              break;
            } // case 29
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

    private float red_ ;
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1;</code>
     * @return The red.
     */
    @java.lang.Override
    public float getRed() {
      return red_;
    }
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1;</code>
     * @param value The red to set.
     * @return This builder for chaining.
     */
    public Builder setRed(float value) {
      
      red_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of red in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float red = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRed() {
      
      red_ = 0F;
      onChanged();
      return this;
    }

    private float green_ ;
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2;</code>
     * @return The green.
     */
    @java.lang.Override
    public float getGreen() {
      return green_;
    }
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2;</code>
     * @param value The green to set.
     * @return This builder for chaining.
     */
    public Builder setGreen(float value) {
      
      green_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of green in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float green = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearGreen() {
      
      green_ = 0F;
      onChanged();
      return this;
    }

    private float blue_ ;
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3;</code>
     * @return The blue.
     */
    @java.lang.Override
    public float getBlue() {
      return blue_;
    }
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3;</code>
     * @param value The blue to set.
     * @return This builder for chaining.
     */
    public Builder setBlue(float value) {
      
      blue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The amount of blue in the color as a value in the interval [0, 1].
     * </pre>
     *
     * <code>float blue = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlue() {
      
      blue_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.Color)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.Color)
  private static final com.google.privacy.dlp.v2.Color DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.Color();
  }

  public static com.google.privacy.dlp.v2.Color getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Color>
      PARSER = new com.google.protobuf.AbstractParser<Color>() {
    @java.lang.Override
    public Color parsePartialFrom(
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

  public static com.google.protobuf.Parser<Color> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Color> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.Color getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

