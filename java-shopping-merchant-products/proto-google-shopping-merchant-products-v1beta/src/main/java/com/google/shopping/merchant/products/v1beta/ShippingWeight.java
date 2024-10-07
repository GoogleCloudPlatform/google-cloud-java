/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/shopping/merchant/products/v1beta/products_common.proto

// Protobuf Java Version: 3.25.5
package com.google.shopping.merchant.products.v1beta;

/**
 *
 *
 * <pre>
 * The ShippingWeight of the product.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.products.v1beta.ShippingWeight}
 */
public final class ShippingWeight extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.products.v1beta.ShippingWeight)
    ShippingWeightOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ShippingWeight.newBuilder() to construct.
  private ShippingWeight(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ShippingWeight() {
    unit_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ShippingWeight();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_ShippingWeight_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_ShippingWeight_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.products.v1beta.ShippingWeight.class,
            com.google.shopping.merchant.products.v1beta.ShippingWeight.Builder.class);
  }

  public static final int VALUE_FIELD_NUMBER = 1;
  private double value_ = 0D;
  /**
   *
   *
   * <pre>
   * The weight of the product used to calculate the shipping cost of the
   * item.
   * </pre>
   *
   * <code>double value = 1;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public double getValue() {
    return value_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object unit_ = "";
  /**
   *
   *
   * <pre>
   * The unit of value.
   * </pre>
   *
   * <code>string unit = 2;</code>
   *
   * @return The unit.
   */
  @java.lang.Override
  public java.lang.String getUnit() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unit_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The unit of value.
   * </pre>
   *
   * <code>string unit = 2;</code>
   *
   * @return The bytes for unit.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUnitBytes() {
    java.lang.Object ref = unit_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      unit_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      output.writeDouble(1, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unit_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, unit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(value_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, value_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(unit_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, unit_);
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
    if (!(obj instanceof com.google.shopping.merchant.products.v1beta.ShippingWeight)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.products.v1beta.ShippingWeight other =
        (com.google.shopping.merchant.products.v1beta.ShippingWeight) obj;

    if (java.lang.Double.doubleToLongBits(getValue())
        != java.lang.Double.doubleToLongBits(other.getValue())) return false;
    if (!getUnit().equals(other.getUnit())) return false;
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
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getValue()));
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + getUnit().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight parseFrom(
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

  public static Builder newBuilder(
      com.google.shopping.merchant.products.v1beta.ShippingWeight prototype) {
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
   * The ShippingWeight of the product.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.products.v1beta.ShippingWeight}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.products.v1beta.ShippingWeight)
      com.google.shopping.merchant.products.v1beta.ShippingWeightOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_ShippingWeight_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_ShippingWeight_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.products.v1beta.ShippingWeight.class,
              com.google.shopping.merchant.products.v1beta.ShippingWeight.Builder.class);
    }

    // Construct using com.google.shopping.merchant.products.v1beta.ShippingWeight.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      value_ = 0D;
      unit_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_ShippingWeight_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.ShippingWeight getDefaultInstanceForType() {
      return com.google.shopping.merchant.products.v1beta.ShippingWeight.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.ShippingWeight build() {
      com.google.shopping.merchant.products.v1beta.ShippingWeight result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.ShippingWeight buildPartial() {
      com.google.shopping.merchant.products.v1beta.ShippingWeight result =
          new com.google.shopping.merchant.products.v1beta.ShippingWeight(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.merchant.products.v1beta.ShippingWeight result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.value_ = value_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.unit_ = unit_;
      }
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
      if (other instanceof com.google.shopping.merchant.products.v1beta.ShippingWeight) {
        return mergeFrom((com.google.shopping.merchant.products.v1beta.ShippingWeight) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.products.v1beta.ShippingWeight other) {
      if (other == com.google.shopping.merchant.products.v1beta.ShippingWeight.getDefaultInstance())
        return this;
      if (other.getValue() != 0D) {
        setValue(other.getValue());
      }
      if (!other.getUnit().isEmpty()) {
        unit_ = other.unit_;
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
            case 9:
              {
                value_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 18:
              {
                unit_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
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

    private double value_;
    /**
     *
     *
     * <pre>
     * The weight of the product used to calculate the shipping cost of the
     * item.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @return The value.
     */
    @java.lang.Override
    public double getValue() {
      return value_;
    }
    /**
     *
     *
     * <pre>
     * The weight of the product used to calculate the shipping cost of the
     * item.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(double value) {

      value_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The weight of the product used to calculate the shipping cost of the
     * item.
     * </pre>
     *
     * <code>double value = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      value_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object unit_ = "";
    /**
     *
     *
     * <pre>
     * The unit of value.
     * </pre>
     *
     * <code>string unit = 2;</code>
     *
     * @return The unit.
     */
    public java.lang.String getUnit() {
      java.lang.Object ref = unit_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unit_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unit of value.
     * </pre>
     *
     * <code>string unit = 2;</code>
     *
     * @return The bytes for unit.
     */
    public com.google.protobuf.ByteString getUnitBytes() {
      java.lang.Object ref = unit_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        unit_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unit of value.
     * </pre>
     *
     * <code>string unit = 2;</code>
     *
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      unit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unit of value.
     * </pre>
     *
     * <code>string unit = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      unit_ = getDefaultInstance().getUnit();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unit of value.
     * </pre>
     *
     * <code>string unit = 2;</code>
     *
     * @param value The bytes for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      unit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.products.v1beta.ShippingWeight)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.products.v1beta.ShippingWeight)
  private static final com.google.shopping.merchant.products.v1beta.ShippingWeight DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.products.v1beta.ShippingWeight();
  }

  public static com.google.shopping.merchant.products.v1beta.ShippingWeight getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShippingWeight> PARSER =
      new com.google.protobuf.AbstractParser<ShippingWeight>() {
        @java.lang.Override
        public ShippingWeight parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShippingWeight> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShippingWeight> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.products.v1beta.ShippingWeight getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
