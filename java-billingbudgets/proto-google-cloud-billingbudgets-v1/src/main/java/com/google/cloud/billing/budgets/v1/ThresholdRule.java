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
// source: google/cloud/billing/budgets/v1/budget_model.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.billing.budgets.v1;

/**
 *
 *
 * <pre>
 * ThresholdRule contains the definition of a threshold. Threshold rules define
 * the triggering events used to generate a budget notification email. When a
 * threshold is crossed (spend exceeds the specified percentages of the
 * budget), budget alert emails are sent to the email recipients you specify
 * in the
 * [NotificationsRule](#notificationsrule).
 *
 * Threshold rules also affect the fields included in the
 * [JSON data
 * object](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format)
 * sent to a Pub/Sub topic.
 *
 * Threshold rules are _required_ if using email notifications.
 *
 * Threshold rules are _optional_ if only setting a
 * [`pubsubTopic` NotificationsRule](#NotificationsRule),
 * unless you want your JSON data object to include data about the thresholds
 * you set.
 *
 * For more information, see
 * [set budget threshold rules and
 * actions](https://cloud.google.com/billing/docs/how-to/budgets#budget-actions).
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.budgets.v1.ThresholdRule}
 */
public final class ThresholdRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.budgets.v1.ThresholdRule)
    ThresholdRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ThresholdRule.newBuilder() to construct.
  private ThresholdRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ThresholdRule() {
    spendBasis_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ThresholdRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.budgets.v1.BudgetModelProto
        .internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.budgets.v1.BudgetModelProto
        .internal_static_google_cloud_billing_budgets_v1_ThresholdRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.budgets.v1.ThresholdRule.class,
            com.google.cloud.billing.budgets.v1.ThresholdRule.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The type of basis used to determine if spend has passed the threshold.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.billing.budgets.v1.ThresholdRule.Basis}
   */
  public enum Basis implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified threshold basis.
     * </pre>
     *
     * <code>BASIS_UNSPECIFIED = 0;</code>
     */
    BASIS_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Use current spend as the basis for comparison against the threshold.
     * </pre>
     *
     * <code>CURRENT_SPEND = 1;</code>
     */
    CURRENT_SPEND(1),
    /**
     *
     *
     * <pre>
     * Use forecasted spend for the period as the basis for comparison against
     * the threshold.
     * FORECASTED_SPEND can only be set when the budget's time period is a
     * [Filter.calendar_period][google.cloud.billing.budgets.v1.Filter.calendar_period].
     * It cannot be set in combination with
     * [Filter.custom_period][google.cloud.billing.budgets.v1.Filter.custom_period].
     * </pre>
     *
     * <code>FORECASTED_SPEND = 2;</code>
     */
    FORECASTED_SPEND(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified threshold basis.
     * </pre>
     *
     * <code>BASIS_UNSPECIFIED = 0;</code>
     */
    public static final int BASIS_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Use current spend as the basis for comparison against the threshold.
     * </pre>
     *
     * <code>CURRENT_SPEND = 1;</code>
     */
    public static final int CURRENT_SPEND_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Use forecasted spend for the period as the basis for comparison against
     * the threshold.
     * FORECASTED_SPEND can only be set when the budget's time period is a
     * [Filter.calendar_period][google.cloud.billing.budgets.v1.Filter.calendar_period].
     * It cannot be set in combination with
     * [Filter.custom_period][google.cloud.billing.budgets.v1.Filter.custom_period].
     * </pre>
     *
     * <code>FORECASTED_SPEND = 2;</code>
     */
    public static final int FORECASTED_SPEND_VALUE = 2;

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
    public static Basis valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Basis forNumber(int value) {
      switch (value) {
        case 0:
          return BASIS_UNSPECIFIED;
        case 1:
          return CURRENT_SPEND;
        case 2:
          return FORECASTED_SPEND;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Basis> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Basis> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Basis>() {
          public Basis findValueByNumber(int number) {
            return Basis.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.billing.budgets.v1.ThresholdRule.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Basis[] VALUES = values();

    public static Basis valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Basis(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.billing.budgets.v1.ThresholdRule.Basis)
  }

  public static final int THRESHOLD_PERCENT_FIELD_NUMBER = 1;
  private double thresholdPercent_ = 0D;
  /**
   *
   *
   * <pre>
   * Required. Send an alert when this threshold is exceeded.
   * This is a 1.0-based percentage, so 0.5 = 50%.
   * Validation: non-negative number.
   * </pre>
   *
   * <code>double threshold_percent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The thresholdPercent.
   */
  @java.lang.Override
  public double getThresholdPercent() {
    return thresholdPercent_;
  }

  public static final int SPEND_BASIS_FIELD_NUMBER = 2;
  private int spendBasis_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. The type of basis used to determine if spend has passed the
   * threshold. Behavior defaults to CURRENT_SPEND if not set.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for spendBasis.
   */
  @java.lang.Override
  public int getSpendBasisValue() {
    return spendBasis_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The type of basis used to determine if spend has passed the
   * threshold. Behavior defaults to CURRENT_SPEND if not set.
   * </pre>
   *
   * <code>
   * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The spendBasis.
   */
  @java.lang.Override
  public com.google.cloud.billing.budgets.v1.ThresholdRule.Basis getSpendBasis() {
    com.google.cloud.billing.budgets.v1.ThresholdRule.Basis result =
        com.google.cloud.billing.budgets.v1.ThresholdRule.Basis.forNumber(spendBasis_);
    return result == null
        ? com.google.cloud.billing.budgets.v1.ThresholdRule.Basis.UNRECOGNIZED
        : result;
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
    if (java.lang.Double.doubleToRawLongBits(thresholdPercent_) != 0) {
      output.writeDouble(1, thresholdPercent_);
    }
    if (spendBasis_
        != com.google.cloud.billing.budgets.v1.ThresholdRule.Basis.BASIS_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, spendBasis_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(thresholdPercent_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, thresholdPercent_);
    }
    if (spendBasis_
        != com.google.cloud.billing.budgets.v1.ThresholdRule.Basis.BASIS_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, spendBasis_);
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
    if (!(obj instanceof com.google.cloud.billing.budgets.v1.ThresholdRule)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.budgets.v1.ThresholdRule other =
        (com.google.cloud.billing.budgets.v1.ThresholdRule) obj;

    if (java.lang.Double.doubleToLongBits(getThresholdPercent())
        != java.lang.Double.doubleToLongBits(other.getThresholdPercent())) return false;
    if (spendBasis_ != other.spendBasis_) return false;
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
    hash = (37 * hash) + THRESHOLD_PERCENT_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(
                java.lang.Double.doubleToLongBits(getThresholdPercent()));
    hash = (37 * hash) + SPEND_BASIS_FIELD_NUMBER;
    hash = (53 * hash) + spendBasis_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule parseFrom(
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

  public static Builder newBuilder(com.google.cloud.billing.budgets.v1.ThresholdRule prototype) {
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
   * ThresholdRule contains the definition of a threshold. Threshold rules define
   * the triggering events used to generate a budget notification email. When a
   * threshold is crossed (spend exceeds the specified percentages of the
   * budget), budget alert emails are sent to the email recipients you specify
   * in the
   * [NotificationsRule](#notificationsrule).
   *
   * Threshold rules also affect the fields included in the
   * [JSON data
   * object](https://cloud.google.com/billing/docs/how-to/budgets-programmatic-notifications#notification_format)
   * sent to a Pub/Sub topic.
   *
   * Threshold rules are _required_ if using email notifications.
   *
   * Threshold rules are _optional_ if only setting a
   * [`pubsubTopic` NotificationsRule](#NotificationsRule),
   * unless you want your JSON data object to include data about the thresholds
   * you set.
   *
   * For more information, see
   * [set budget threshold rules and
   * actions](https://cloud.google.com/billing/docs/how-to/budgets#budget-actions).
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.budgets.v1.ThresholdRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.budgets.v1.ThresholdRule)
      com.google.cloud.billing.budgets.v1.ThresholdRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.budgets.v1.BudgetModelProto
          .internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.budgets.v1.BudgetModelProto
          .internal_static_google_cloud_billing_budgets_v1_ThresholdRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.budgets.v1.ThresholdRule.class,
              com.google.cloud.billing.budgets.v1.ThresholdRule.Builder.class);
    }

    // Construct using com.google.cloud.billing.budgets.v1.ThresholdRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      thresholdPercent_ = 0D;
      spendBasis_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.budgets.v1.BudgetModelProto
          .internal_static_google_cloud_billing_budgets_v1_ThresholdRule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.ThresholdRule getDefaultInstanceForType() {
      return com.google.cloud.billing.budgets.v1.ThresholdRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.ThresholdRule build() {
      com.google.cloud.billing.budgets.v1.ThresholdRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.ThresholdRule buildPartial() {
      com.google.cloud.billing.budgets.v1.ThresholdRule result =
          new com.google.cloud.billing.budgets.v1.ThresholdRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.billing.budgets.v1.ThresholdRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.thresholdPercent_ = thresholdPercent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.spendBasis_ = spendBasis_;
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
      if (other instanceof com.google.cloud.billing.budgets.v1.ThresholdRule) {
        return mergeFrom((com.google.cloud.billing.budgets.v1.ThresholdRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.budgets.v1.ThresholdRule other) {
      if (other == com.google.cloud.billing.budgets.v1.ThresholdRule.getDefaultInstance())
        return this;
      if (other.getThresholdPercent() != 0D) {
        setThresholdPercent(other.getThresholdPercent());
      }
      if (other.spendBasis_ != 0) {
        setSpendBasisValue(other.getSpendBasisValue());
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
                thresholdPercent_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 16:
              {
                spendBasis_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private double thresholdPercent_;
    /**
     *
     *
     * <pre>
     * Required. Send an alert when this threshold is exceeded.
     * This is a 1.0-based percentage, so 0.5 = 50%.
     * Validation: non-negative number.
     * </pre>
     *
     * <code>double threshold_percent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The thresholdPercent.
     */
    @java.lang.Override
    public double getThresholdPercent() {
      return thresholdPercent_;
    }
    /**
     *
     *
     * <pre>
     * Required. Send an alert when this threshold is exceeded.
     * This is a 1.0-based percentage, so 0.5 = 50%.
     * Validation: non-negative number.
     * </pre>
     *
     * <code>double threshold_percent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The thresholdPercent to set.
     * @return This builder for chaining.
     */
    public Builder setThresholdPercent(double value) {

      thresholdPercent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Send an alert when this threshold is exceeded.
     * This is a 1.0-based percentage, so 0.5 = 50%.
     * Validation: non-negative number.
     * </pre>
     *
     * <code>double threshold_percent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThresholdPercent() {
      bitField0_ = (bitField0_ & ~0x00000001);
      thresholdPercent_ = 0D;
      onChanged();
      return this;
    }

    private int spendBasis_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The type of basis used to determine if spend has passed the
     * threshold. Behavior defaults to CURRENT_SPEND if not set.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for spendBasis.
     */
    @java.lang.Override
    public int getSpendBasisValue() {
      return spendBasis_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of basis used to determine if spend has passed the
     * threshold. Behavior defaults to CURRENT_SPEND if not set.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for spendBasis to set.
     * @return This builder for chaining.
     */
    public Builder setSpendBasisValue(int value) {
      spendBasis_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of basis used to determine if spend has passed the
     * threshold. Behavior defaults to CURRENT_SPEND if not set.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The spendBasis.
     */
    @java.lang.Override
    public com.google.cloud.billing.budgets.v1.ThresholdRule.Basis getSpendBasis() {
      com.google.cloud.billing.budgets.v1.ThresholdRule.Basis result =
          com.google.cloud.billing.budgets.v1.ThresholdRule.Basis.forNumber(spendBasis_);
      return result == null
          ? com.google.cloud.billing.budgets.v1.ThresholdRule.Basis.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of basis used to determine if spend has passed the
     * threshold. Behavior defaults to CURRENT_SPEND if not set.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The spendBasis to set.
     * @return This builder for chaining.
     */
    public Builder setSpendBasis(com.google.cloud.billing.budgets.v1.ThresholdRule.Basis value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      spendBasis_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The type of basis used to determine if spend has passed the
     * threshold. Behavior defaults to CURRENT_SPEND if not set.
     * </pre>
     *
     * <code>
     * .google.cloud.billing.budgets.v1.ThresholdRule.Basis spend_basis = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSpendBasis() {
      bitField0_ = (bitField0_ & ~0x00000002);
      spendBasis_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.budgets.v1.ThresholdRule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.budgets.v1.ThresholdRule)
  private static final com.google.cloud.billing.budgets.v1.ThresholdRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.budgets.v1.ThresholdRule();
  }

  public static com.google.cloud.billing.budgets.v1.ThresholdRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThresholdRule> PARSER =
      new com.google.protobuf.AbstractParser<ThresholdRule>() {
        @java.lang.Override
        public ThresholdRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThresholdRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThresholdRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.budgets.v1.ThresholdRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
