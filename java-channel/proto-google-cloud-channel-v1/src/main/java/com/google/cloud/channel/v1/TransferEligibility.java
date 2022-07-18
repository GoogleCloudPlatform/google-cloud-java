/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/channel/v1/entitlements.proto

package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Specifies transfer eligibility of a SKU.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.TransferEligibility}
 */
public final class TransferEligibility extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.TransferEligibility)
    TransferEligibilityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TransferEligibility.newBuilder() to construct.
  private TransferEligibility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TransferEligibility() {
    description_ = "";
    ineligibilityReason_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TransferEligibility();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TransferEligibility(
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
              isEligible_ = input.readBool();
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
              break;
            }
          case 24:
            {
              int rawValue = input.readEnum();

              ineligibilityReason_ = rawValue;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.EntitlementsProto
        .internal_static_google_cloud_channel_v1_TransferEligibility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.EntitlementsProto
        .internal_static_google_cloud_channel_v1_TransferEligibility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.TransferEligibility.class,
            com.google.cloud.channel.v1.TransferEligibility.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Reason of ineligibility.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.channel.v1.TransferEligibility.Reason}
   */
  public enum Reason implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not used.
     * </pre>
     *
     * <code>REASON_UNSPECIFIED = 0;</code>
     */
    REASON_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Reseller needs to accept TOS before transferring the SKU.
     * </pre>
     *
     * <code>PENDING_TOS_ACCEPTANCE = 1;</code>
     */
    PENDING_TOS_ACCEPTANCE(1),
    /**
     *
     *
     * <pre>
     * Reseller not eligible to sell the SKU.
     * </pre>
     *
     * <code>SKU_NOT_ELIGIBLE = 2;</code>
     */
    SKU_NOT_ELIGIBLE(2),
    /**
     *
     *
     * <pre>
     * SKU subscription is suspended
     * </pre>
     *
     * <code>SKU_SUSPENDED = 3;</code>
     */
    SKU_SUSPENDED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not used.
     * </pre>
     *
     * <code>REASON_UNSPECIFIED = 0;</code>
     */
    public static final int REASON_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Reseller needs to accept TOS before transferring the SKU.
     * </pre>
     *
     * <code>PENDING_TOS_ACCEPTANCE = 1;</code>
     */
    public static final int PENDING_TOS_ACCEPTANCE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Reseller not eligible to sell the SKU.
     * </pre>
     *
     * <code>SKU_NOT_ELIGIBLE = 2;</code>
     */
    public static final int SKU_NOT_ELIGIBLE_VALUE = 2;
    /**
     *
     *
     * <pre>
     * SKU subscription is suspended
     * </pre>
     *
     * <code>SKU_SUSPENDED = 3;</code>
     */
    public static final int SKU_SUSPENDED_VALUE = 3;

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
    public static Reason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Reason forNumber(int value) {
      switch (value) {
        case 0:
          return REASON_UNSPECIFIED;
        case 1:
          return PENDING_TOS_ACCEPTANCE;
        case 2:
          return SKU_NOT_ELIGIBLE;
        case 3:
          return SKU_SUSPENDED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Reason> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Reason> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Reason>() {
          public Reason findValueByNumber(int number) {
            return Reason.forNumber(number);
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
      return com.google.cloud.channel.v1.TransferEligibility.getDescriptor().getEnumTypes().get(0);
    }

    private static final Reason[] VALUES = values();

    public static Reason valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Reason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.TransferEligibility.Reason)
  }

  public static final int IS_ELIGIBLE_FIELD_NUMBER = 1;
  private boolean isEligible_;
  /**
   *
   *
   * <pre>
   * Whether reseller is eligible to transfer the SKU.
   * </pre>
   *
   * <code>bool is_eligible = 1;</code>
   *
   * @return The isEligible.
   */
  @java.lang.Override
  public boolean getIsEligible() {
    return isEligible_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * Localized description if reseller is not eligible to transfer the SKU.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Localized description if reseller is not eligible to transfer the SKU.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INELIGIBILITY_REASON_FIELD_NUMBER = 3;
  private int ineligibilityReason_;
  /**
   *
   *
   * <pre>
   * Specified the reason for ineligibility.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
   *
   * @return The enum numeric value on the wire for ineligibilityReason.
   */
  @java.lang.Override
  public int getIneligibilityReasonValue() {
    return ineligibilityReason_;
  }
  /**
   *
   *
   * <pre>
   * Specified the reason for ineligibility.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
   *
   * @return The ineligibilityReason.
   */
  @java.lang.Override
  public com.google.cloud.channel.v1.TransferEligibility.Reason getIneligibilityReason() {
    @SuppressWarnings("deprecation")
    com.google.cloud.channel.v1.TransferEligibility.Reason result =
        com.google.cloud.channel.v1.TransferEligibility.Reason.valueOf(ineligibilityReason_);
    return result == null
        ? com.google.cloud.channel.v1.TransferEligibility.Reason.UNRECOGNIZED
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
    if (isEligible_ != false) {
      output.writeBool(1, isEligible_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (ineligibilityReason_
        != com.google.cloud.channel.v1.TransferEligibility.Reason.REASON_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, ineligibilityReason_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isEligible_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, isEligible_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (ineligibilityReason_
        != com.google.cloud.channel.v1.TransferEligibility.Reason.REASON_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, ineligibilityReason_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.TransferEligibility)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.TransferEligibility other =
        (com.google.cloud.channel.v1.TransferEligibility) obj;

    if (getIsEligible() != other.getIsEligible()) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (ineligibilityReason_ != other.ineligibilityReason_) return false;
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
    hash = (37 * hash) + IS_ELIGIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIsEligible());
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + INELIGIBILITY_REASON_FIELD_NUMBER;
    hash = (53 * hash) + ineligibilityReason_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.TransferEligibility parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.TransferEligibility prototype) {
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
   * Specifies transfer eligibility of a SKU.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.TransferEligibility}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.TransferEligibility)
      com.google.cloud.channel.v1.TransferEligibilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.EntitlementsProto
          .internal_static_google_cloud_channel_v1_TransferEligibility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.EntitlementsProto
          .internal_static_google_cloud_channel_v1_TransferEligibility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.TransferEligibility.class,
              com.google.cloud.channel.v1.TransferEligibility.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.TransferEligibility.newBuilder()
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
      isEligible_ = false;

      description_ = "";

      ineligibilityReason_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.EntitlementsProto
          .internal_static_google_cloud_channel_v1_TransferEligibility_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.TransferEligibility getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.TransferEligibility.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.TransferEligibility build() {
      com.google.cloud.channel.v1.TransferEligibility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.TransferEligibility buildPartial() {
      com.google.cloud.channel.v1.TransferEligibility result =
          new com.google.cloud.channel.v1.TransferEligibility(this);
      result.isEligible_ = isEligible_;
      result.description_ = description_;
      result.ineligibilityReason_ = ineligibilityReason_;
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
      if (other instanceof com.google.cloud.channel.v1.TransferEligibility) {
        return mergeFrom((com.google.cloud.channel.v1.TransferEligibility) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.TransferEligibility other) {
      if (other == com.google.cloud.channel.v1.TransferEligibility.getDefaultInstance())
        return this;
      if (other.getIsEligible() != false) {
        setIsEligible(other.getIsEligible());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (other.ineligibilityReason_ != 0) {
        setIneligibilityReasonValue(other.getIneligibilityReasonValue());
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
      com.google.cloud.channel.v1.TransferEligibility parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.channel.v1.TransferEligibility) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean isEligible_;
    /**
     *
     *
     * <pre>
     * Whether reseller is eligible to transfer the SKU.
     * </pre>
     *
     * <code>bool is_eligible = 1;</code>
     *
     * @return The isEligible.
     */
    @java.lang.Override
    public boolean getIsEligible() {
      return isEligible_;
    }
    /**
     *
     *
     * <pre>
     * Whether reseller is eligible to transfer the SKU.
     * </pre>
     *
     * <code>bool is_eligible = 1;</code>
     *
     * @param value The isEligible to set.
     * @return This builder for chaining.
     */
    public Builder setIsEligible(boolean value) {

      isEligible_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether reseller is eligible to transfer the SKU.
     * </pre>
     *
     * <code>bool is_eligible = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIsEligible() {

      isEligible_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Localized description if reseller is not eligible to transfer the SKU.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Localized description if reseller is not eligible to transfer the SKU.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Localized description if reseller is not eligible to transfer the SKU.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Localized description if reseller is not eligible to transfer the SKU.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Localized description if reseller is not eligible to transfer the SKU.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    private int ineligibilityReason_ = 0;
    /**
     *
     *
     * <pre>
     * Specified the reason for ineligibility.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
     *
     * @return The enum numeric value on the wire for ineligibilityReason.
     */
    @java.lang.Override
    public int getIneligibilityReasonValue() {
      return ineligibilityReason_;
    }
    /**
     *
     *
     * <pre>
     * Specified the reason for ineligibility.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
     *
     * @param value The enum numeric value on the wire for ineligibilityReason to set.
     * @return This builder for chaining.
     */
    public Builder setIneligibilityReasonValue(int value) {

      ineligibilityReason_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specified the reason for ineligibility.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
     *
     * @return The ineligibilityReason.
     */
    @java.lang.Override
    public com.google.cloud.channel.v1.TransferEligibility.Reason getIneligibilityReason() {
      @SuppressWarnings("deprecation")
      com.google.cloud.channel.v1.TransferEligibility.Reason result =
          com.google.cloud.channel.v1.TransferEligibility.Reason.valueOf(ineligibilityReason_);
      return result == null
          ? com.google.cloud.channel.v1.TransferEligibility.Reason.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Specified the reason for ineligibility.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
     *
     * @param value The ineligibilityReason to set.
     * @return This builder for chaining.
     */
    public Builder setIneligibilityReason(
        com.google.cloud.channel.v1.TransferEligibility.Reason value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ineligibilityReason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specified the reason for ineligibility.
     * </pre>
     *
     * <code>.google.cloud.channel.v1.TransferEligibility.Reason ineligibility_reason = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIneligibilityReason() {

      ineligibilityReason_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.TransferEligibility)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.TransferEligibility)
  private static final com.google.cloud.channel.v1.TransferEligibility DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.TransferEligibility();
  }

  public static com.google.cloud.channel.v1.TransferEligibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferEligibility> PARSER =
      new com.google.protobuf.AbstractParser<TransferEligibility>() {
        @java.lang.Override
        public TransferEligibility parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TransferEligibility(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TransferEligibility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferEligibility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.TransferEligibility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
