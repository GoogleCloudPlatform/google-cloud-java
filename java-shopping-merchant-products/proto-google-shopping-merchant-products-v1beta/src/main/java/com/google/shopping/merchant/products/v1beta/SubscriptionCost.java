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
 * The SubscriptionCost of the product.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.products.v1beta.SubscriptionCost}
 */
public final class SubscriptionCost extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.products.v1beta.SubscriptionCost)
    SubscriptionCostOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SubscriptionCost.newBuilder() to construct.
  private SubscriptionCost(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubscriptionCost() {
    period_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubscriptionCost();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_SubscriptionCost_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
        .internal_static_google_shopping_merchant_products_v1beta_SubscriptionCost_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.products.v1beta.SubscriptionCost.class,
            com.google.shopping.merchant.products.v1beta.SubscriptionCost.Builder.class);
  }

  private int bitField0_;
  public static final int PERIOD_FIELD_NUMBER = 1;
  private int period_ = 0;
  /**
   *
   *
   * <pre>
   * The type of subscription period.
   * Supported values are:
   *   * "`month`"
   *   * "`year`"
   * </pre>
   *
   * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
   *
   * @return The enum numeric value on the wire for period.
   */
  @java.lang.Override
  public int getPeriodValue() {
    return period_;
  }
  /**
   *
   *
   * <pre>
   * The type of subscription period.
   * Supported values are:
   *   * "`month`"
   *   * "`year`"
   * </pre>
   *
   * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
   *
   * @return The period.
   */
  @java.lang.Override
  public com.google.shopping.merchant.products.v1beta.SubscriptionPeriod getPeriod() {
    com.google.shopping.merchant.products.v1beta.SubscriptionPeriod result =
        com.google.shopping.merchant.products.v1beta.SubscriptionPeriod.forNumber(period_);
    return result == null
        ? com.google.shopping.merchant.products.v1beta.SubscriptionPeriod.UNRECOGNIZED
        : result;
  }

  public static final int PERIOD_LENGTH_FIELD_NUMBER = 2;
  private long periodLength_ = 0L;
  /**
   *
   *
   * <pre>
   * The number of subscription periods the buyer has to pay.
   * </pre>
   *
   * <code>int64 period_length = 2;</code>
   *
   * @return The periodLength.
   */
  @java.lang.Override
  public long getPeriodLength() {
    return periodLength_;
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private com.google.shopping.type.Price amount_;
  /**
   *
   *
   * <pre>
   * The amount the buyer has to pay per subscription period.
   * </pre>
   *
   * <code>.google.shopping.type.Price amount = 3;</code>
   *
   * @return Whether the amount field is set.
   */
  @java.lang.Override
  public boolean hasAmount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The amount the buyer has to pay per subscription period.
   * </pre>
   *
   * <code>.google.shopping.type.Price amount = 3;</code>
   *
   * @return The amount.
   */
  @java.lang.Override
  public com.google.shopping.type.Price getAmount() {
    return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
  }
  /**
   *
   *
   * <pre>
   * The amount the buyer has to pay per subscription period.
   * </pre>
   *
   * <code>.google.shopping.type.Price amount = 3;</code>
   */
  @java.lang.Override
  public com.google.shopping.type.PriceOrBuilder getAmountOrBuilder() {
    return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
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
    if (period_
        != com.google.shopping.merchant.products.v1beta.SubscriptionPeriod
            .SUBSCRIPTION_PERIOD_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, period_);
    }
    if (periodLength_ != 0L) {
      output.writeInt64(2, periodLength_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getAmount());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (period_
        != com.google.shopping.merchant.products.v1beta.SubscriptionPeriod
            .SUBSCRIPTION_PERIOD_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, period_);
    }
    if (periodLength_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, periodLength_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getAmount());
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
    if (!(obj instanceof com.google.shopping.merchant.products.v1beta.SubscriptionCost)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.products.v1beta.SubscriptionCost other =
        (com.google.shopping.merchant.products.v1beta.SubscriptionCost) obj;

    if (period_ != other.period_) return false;
    if (getPeriodLength() != other.getPeriodLength()) return false;
    if (hasAmount() != other.hasAmount()) return false;
    if (hasAmount()) {
      if (!getAmount().equals(other.getAmount())) return false;
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
    hash = (37 * hash) + PERIOD_FIELD_NUMBER;
    hash = (53 * hash) + period_;
    hash = (37 * hash) + PERIOD_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPeriodLength());
    if (hasAmount()) {
      hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAmount().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost parseFrom(
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
      com.google.shopping.merchant.products.v1beta.SubscriptionCost prototype) {
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
   * The SubscriptionCost of the product.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.products.v1beta.SubscriptionCost}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.products.v1beta.SubscriptionCost)
      com.google.shopping.merchant.products.v1beta.SubscriptionCostOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_SubscriptionCost_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_SubscriptionCost_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.products.v1beta.SubscriptionCost.class,
              com.google.shopping.merchant.products.v1beta.SubscriptionCost.Builder.class);
    }

    // Construct using com.google.shopping.merchant.products.v1beta.SubscriptionCost.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAmountFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      period_ = 0;
      periodLength_ = 0L;
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.products.v1beta.ProductsCommonProto
          .internal_static_google_shopping_merchant_products_v1beta_SubscriptionCost_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.SubscriptionCost
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.products.v1beta.SubscriptionCost.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.SubscriptionCost build() {
      com.google.shopping.merchant.products.v1beta.SubscriptionCost result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.SubscriptionCost buildPartial() {
      com.google.shopping.merchant.products.v1beta.SubscriptionCost result =
          new com.google.shopping.merchant.products.v1beta.SubscriptionCost(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.shopping.merchant.products.v1beta.SubscriptionCost result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.period_ = period_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.periodLength_ = periodLength_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.amount_ = amountBuilder_ == null ? amount_ : amountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.shopping.merchant.products.v1beta.SubscriptionCost) {
        return mergeFrom((com.google.shopping.merchant.products.v1beta.SubscriptionCost) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.products.v1beta.SubscriptionCost other) {
      if (other
          == com.google.shopping.merchant.products.v1beta.SubscriptionCost.getDefaultInstance())
        return this;
      if (other.period_ != 0) {
        setPeriodValue(other.getPeriodValue());
      }
      if (other.getPeriodLength() != 0L) {
        setPeriodLength(other.getPeriodLength());
      }
      if (other.hasAmount()) {
        mergeAmount(other.getAmount());
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
            case 8:
              {
                period_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                periodLength_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                input.readMessage(getAmountFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int period_ = 0;
    /**
     *
     *
     * <pre>
     * The type of subscription period.
     * Supported values are:
     *   * "`month`"
     *   * "`year`"
     * </pre>
     *
     * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
     *
     * @return The enum numeric value on the wire for period.
     */
    @java.lang.Override
    public int getPeriodValue() {
      return period_;
    }
    /**
     *
     *
     * <pre>
     * The type of subscription period.
     * Supported values are:
     *   * "`month`"
     *   * "`year`"
     * </pre>
     *
     * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
     *
     * @param value The enum numeric value on the wire for period to set.
     * @return This builder for chaining.
     */
    public Builder setPeriodValue(int value) {
      period_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of subscription period.
     * Supported values are:
     *   * "`month`"
     *   * "`year`"
     * </pre>
     *
     * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
     *
     * @return The period.
     */
    @java.lang.Override
    public com.google.shopping.merchant.products.v1beta.SubscriptionPeriod getPeriod() {
      com.google.shopping.merchant.products.v1beta.SubscriptionPeriod result =
          com.google.shopping.merchant.products.v1beta.SubscriptionPeriod.forNumber(period_);
      return result == null
          ? com.google.shopping.merchant.products.v1beta.SubscriptionPeriod.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of subscription period.
     * Supported values are:
     *   * "`month`"
     *   * "`year`"
     * </pre>
     *
     * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
     *
     * @param value The period to set.
     * @return This builder for chaining.
     */
    public Builder setPeriod(
        com.google.shopping.merchant.products.v1beta.SubscriptionPeriod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      period_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of subscription period.
     * Supported values are:
     *   * "`month`"
     *   * "`year`"
     * </pre>
     *
     * <code>.google.shopping.merchant.products.v1beta.SubscriptionPeriod period = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPeriod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      period_ = 0;
      onChanged();
      return this;
    }

    private long periodLength_;
    /**
     *
     *
     * <pre>
     * The number of subscription periods the buyer has to pay.
     * </pre>
     *
     * <code>int64 period_length = 2;</code>
     *
     * @return The periodLength.
     */
    @java.lang.Override
    public long getPeriodLength() {
      return periodLength_;
    }
    /**
     *
     *
     * <pre>
     * The number of subscription periods the buyer has to pay.
     * </pre>
     *
     * <code>int64 period_length = 2;</code>
     *
     * @param value The periodLength to set.
     * @return This builder for chaining.
     */
    public Builder setPeriodLength(long value) {

      periodLength_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of subscription periods the buyer has to pay.
     * </pre>
     *
     * <code>int64 period_length = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPeriodLength() {
      bitField0_ = (bitField0_ & ~0x00000002);
      periodLength_ = 0L;
      onChanged();
      return this;
    }

    private com.google.shopping.type.Price amount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        amountBuilder_;
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     *
     * @return Whether the amount field is set.
     */
    public boolean hasAmount() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     *
     * @return The amount.
     */
    public com.google.shopping.type.Price getAmount() {
      if (amountBuilder_ == null) {
        return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
      } else {
        return amountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    public Builder setAmount(com.google.shopping.type.Price value) {
      if (amountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amount_ = value;
      } else {
        amountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    public Builder setAmount(com.google.shopping.type.Price.Builder builderForValue) {
      if (amountBuilder_ == null) {
        amount_ = builderForValue.build();
      } else {
        amountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    public Builder mergeAmount(com.google.shopping.type.Price value) {
      if (amountBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && amount_ != null
            && amount_ != com.google.shopping.type.Price.getDefaultInstance()) {
          getAmountBuilder().mergeFrom(value);
        } else {
          amount_ = value;
        }
      } else {
        amountBuilder_.mergeFrom(value);
      }
      if (amount_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      amount_ = null;
      if (amountBuilder_ != null) {
        amountBuilder_.dispose();
        amountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    public com.google.shopping.type.Price.Builder getAmountBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAmountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    public com.google.shopping.type.PriceOrBuilder getAmountOrBuilder() {
      if (amountBuilder_ != null) {
        return amountBuilder_.getMessageOrBuilder();
      } else {
        return amount_ == null ? com.google.shopping.type.Price.getDefaultInstance() : amount_;
      }
    }
    /**
     *
     *
     * <pre>
     * The amount the buyer has to pay per subscription period.
     * </pre>
     *
     * <code>.google.shopping.type.Price amount = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.type.Price,
            com.google.shopping.type.Price.Builder,
            com.google.shopping.type.PriceOrBuilder>
        getAmountFieldBuilder() {
      if (amountBuilder_ == null) {
        amountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.type.Price,
                com.google.shopping.type.Price.Builder,
                com.google.shopping.type.PriceOrBuilder>(
                getAmount(), getParentForChildren(), isClean());
        amount_ = null;
      }
      return amountBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.products.v1beta.SubscriptionCost)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.products.v1beta.SubscriptionCost)
  private static final com.google.shopping.merchant.products.v1beta.SubscriptionCost
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.products.v1beta.SubscriptionCost();
  }

  public static com.google.shopping.merchant.products.v1beta.SubscriptionCost getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubscriptionCost> PARSER =
      new com.google.protobuf.AbstractParser<SubscriptionCost>() {
        @java.lang.Override
        public SubscriptionCost parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubscriptionCost> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubscriptionCost> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.products.v1beta.SubscriptionCost getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
