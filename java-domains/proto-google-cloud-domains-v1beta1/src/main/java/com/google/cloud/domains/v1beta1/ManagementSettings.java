/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/domains/v1beta1/domains.proto

package com.google.cloud.domains.v1beta1;

/**
 *
 *
 * <pre>
 * Defines renewal, billing, and transfer settings for a `Registration`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.domains.v1beta1.ManagementSettings}
 */
public final class ManagementSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.domains.v1beta1.ManagementSettings)
    ManagementSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ManagementSettings.newBuilder() to construct.
  private ManagementSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagementSettings() {
    renewalMethod_ = 0;
    transferLockState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ManagementSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.domains.v1beta1.DomainsProto
        .internal_static_google_cloud_domains_v1beta1_ManagementSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.domains.v1beta1.DomainsProto
        .internal_static_google_cloud_domains_v1beta1_ManagementSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.domains.v1beta1.ManagementSettings.class,
            com.google.cloud.domains.v1beta1.ManagementSettings.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Defines how the `Registration` is renewed.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod}
   */
  public enum RenewalMethod implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The renewal method is undefined.
     * </pre>
     *
     * <code>RENEWAL_METHOD_UNSPECIFIED = 0;</code>
     */
    RENEWAL_METHOD_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The domain is automatically renewed each year .
     *
     * To disable automatic renewals, delete the resource by calling
     * `DeleteRegistration` or export it by calling `ExportRegistration`.
     * </pre>
     *
     * <code>AUTOMATIC_RENEWAL = 1;</code>
     */
    AUTOMATIC_RENEWAL(1),
    /**
     *
     *
     * <pre>
     * The domain must be explicitly renewed each year before its
     * `expire_time`. This option is only available when the `Registration`
     * is in state `EXPORTED`.
     *
     * To manage the domain's current billing and
     * renewal settings, go to [Google Domains](https://domains.google/).
     * </pre>
     *
     * <code>MANUAL_RENEWAL = 2;</code>
     */
    MANUAL_RENEWAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The renewal method is undefined.
     * </pre>
     *
     * <code>RENEWAL_METHOD_UNSPECIFIED = 0;</code>
     */
    public static final int RENEWAL_METHOD_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The domain is automatically renewed each year .
     *
     * To disable automatic renewals, delete the resource by calling
     * `DeleteRegistration` or export it by calling `ExportRegistration`.
     * </pre>
     *
     * <code>AUTOMATIC_RENEWAL = 1;</code>
     */
    public static final int AUTOMATIC_RENEWAL_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The domain must be explicitly renewed each year before its
     * `expire_time`. This option is only available when the `Registration`
     * is in state `EXPORTED`.
     *
     * To manage the domain's current billing and
     * renewal settings, go to [Google Domains](https://domains.google/).
     * </pre>
     *
     * <code>MANUAL_RENEWAL = 2;</code>
     */
    public static final int MANUAL_RENEWAL_VALUE = 2;

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
    public static RenewalMethod valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RenewalMethod forNumber(int value) {
      switch (value) {
        case 0:
          return RENEWAL_METHOD_UNSPECIFIED;
        case 1:
          return AUTOMATIC_RENEWAL;
        case 2:
          return MANUAL_RENEWAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RenewalMethod> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RenewalMethod> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RenewalMethod>() {
          public RenewalMethod findValueByNumber(int number) {
            return RenewalMethod.forNumber(number);
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
      return com.google.cloud.domains.v1beta1.ManagementSettings.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final RenewalMethod[] VALUES = values();

    public static RenewalMethod valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RenewalMethod(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod)
  }

  public static final int RENEWAL_METHOD_FIELD_NUMBER = 3;
  private int renewalMethod_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. The renewal method for this `Registration`.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for renewalMethod.
   */
  @java.lang.Override
  public int getRenewalMethodValue() {
    return renewalMethod_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The renewal method for this `Registration`.
   * </pre>
   *
   * <code>
   * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The renewalMethod.
   */
  @java.lang.Override
  public com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod getRenewalMethod() {
    com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod result =
        com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod.forNumber(renewalMethod_);
    return result == null
        ? com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod.UNRECOGNIZED
        : result;
  }

  public static final int TRANSFER_LOCK_STATE_FIELD_NUMBER = 4;
  private int transferLockState_ = 0;
  /**
   *
   *
   * <pre>
   * Controls whether the domain can be transferred to another registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
   *
   * @return The enum numeric value on the wire for transferLockState.
   */
  @java.lang.Override
  public int getTransferLockStateValue() {
    return transferLockState_;
  }
  /**
   *
   *
   * <pre>
   * Controls whether the domain can be transferred to another registrar.
   * </pre>
   *
   * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
   *
   * @return The transferLockState.
   */
  @java.lang.Override
  public com.google.cloud.domains.v1beta1.TransferLockState getTransferLockState() {
    com.google.cloud.domains.v1beta1.TransferLockState result =
        com.google.cloud.domains.v1beta1.TransferLockState.forNumber(transferLockState_);
    return result == null
        ? com.google.cloud.domains.v1beta1.TransferLockState.UNRECOGNIZED
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
    if (renewalMethod_
        != com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod
            .RENEWAL_METHOD_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, renewalMethod_);
    }
    if (transferLockState_
        != com.google.cloud.domains.v1beta1.TransferLockState.TRANSFER_LOCK_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, transferLockState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (renewalMethod_
        != com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod
            .RENEWAL_METHOD_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, renewalMethod_);
    }
    if (transferLockState_
        != com.google.cloud.domains.v1beta1.TransferLockState.TRANSFER_LOCK_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, transferLockState_);
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
    if (!(obj instanceof com.google.cloud.domains.v1beta1.ManagementSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.domains.v1beta1.ManagementSettings other =
        (com.google.cloud.domains.v1beta1.ManagementSettings) obj;

    if (renewalMethod_ != other.renewalMethod_) return false;
    if (transferLockState_ != other.transferLockState_) return false;
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
    hash = (37 * hash) + RENEWAL_METHOD_FIELD_NUMBER;
    hash = (53 * hash) + renewalMethod_;
    hash = (37 * hash) + TRANSFER_LOCK_STATE_FIELD_NUMBER;
    hash = (53 * hash) + transferLockState_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.domains.v1beta1.ManagementSettings prototype) {
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
   * Defines renewal, billing, and transfer settings for a `Registration`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.domains.v1beta1.ManagementSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.domains.v1beta1.ManagementSettings)
      com.google.cloud.domains.v1beta1.ManagementSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_ManagementSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_ManagementSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.domains.v1beta1.ManagementSettings.class,
              com.google.cloud.domains.v1beta1.ManagementSettings.Builder.class);
    }

    // Construct using com.google.cloud.domains.v1beta1.ManagementSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      renewalMethod_ = 0;
      transferLockState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.domains.v1beta1.DomainsProto
          .internal_static_google_cloud_domains_v1beta1_ManagementSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ManagementSettings getDefaultInstanceForType() {
      return com.google.cloud.domains.v1beta1.ManagementSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ManagementSettings build() {
      com.google.cloud.domains.v1beta1.ManagementSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ManagementSettings buildPartial() {
      com.google.cloud.domains.v1beta1.ManagementSettings result =
          new com.google.cloud.domains.v1beta1.ManagementSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.domains.v1beta1.ManagementSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.renewalMethod_ = renewalMethod_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.transferLockState_ = transferLockState_;
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
      if (other instanceof com.google.cloud.domains.v1beta1.ManagementSettings) {
        return mergeFrom((com.google.cloud.domains.v1beta1.ManagementSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.domains.v1beta1.ManagementSettings other) {
      if (other == com.google.cloud.domains.v1beta1.ManagementSettings.getDefaultInstance())
        return this;
      if (other.renewalMethod_ != 0) {
        setRenewalMethodValue(other.getRenewalMethodValue());
      }
      if (other.transferLockState_ != 0) {
        setTransferLockStateValue(other.getTransferLockStateValue());
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
            case 24:
              {
                renewalMethod_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
            case 32:
              {
                transferLockState_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
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

    private int renewalMethod_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The renewal method for this `Registration`.
     * </pre>
     *
     * <code>
     * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for renewalMethod.
     */
    @java.lang.Override
    public int getRenewalMethodValue() {
      return renewalMethod_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The renewal method for this `Registration`.
     * </pre>
     *
     * <code>
     * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for renewalMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRenewalMethodValue(int value) {
      renewalMethod_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The renewal method for this `Registration`.
     * </pre>
     *
     * <code>
     * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The renewalMethod.
     */
    @java.lang.Override
    public com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod getRenewalMethod() {
      com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod result =
          com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod.forNumber(
              renewalMethod_);
      return result == null
          ? com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The renewal method for this `Registration`.
     * </pre>
     *
     * <code>
     * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The renewalMethod to set.
     * @return This builder for chaining.
     */
    public Builder setRenewalMethod(
        com.google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      renewalMethod_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The renewal method for this `Registration`.
     * </pre>
     *
     * <code>
     * .google.cloud.domains.v1beta1.ManagementSettings.RenewalMethod renewal_method = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRenewalMethod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      renewalMethod_ = 0;
      onChanged();
      return this;
    }

    private int transferLockState_ = 0;
    /**
     *
     *
     * <pre>
     * Controls whether the domain can be transferred to another registrar.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
     *
     * @return The enum numeric value on the wire for transferLockState.
     */
    @java.lang.Override
    public int getTransferLockStateValue() {
      return transferLockState_;
    }
    /**
     *
     *
     * <pre>
     * Controls whether the domain can be transferred to another registrar.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
     *
     * @param value The enum numeric value on the wire for transferLockState to set.
     * @return This builder for chaining.
     */
    public Builder setTransferLockStateValue(int value) {
      transferLockState_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Controls whether the domain can be transferred to another registrar.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
     *
     * @return The transferLockState.
     */
    @java.lang.Override
    public com.google.cloud.domains.v1beta1.TransferLockState getTransferLockState() {
      com.google.cloud.domains.v1beta1.TransferLockState result =
          com.google.cloud.domains.v1beta1.TransferLockState.forNumber(transferLockState_);
      return result == null
          ? com.google.cloud.domains.v1beta1.TransferLockState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Controls whether the domain can be transferred to another registrar.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
     *
     * @param value The transferLockState to set.
     * @return This builder for chaining.
     */
    public Builder setTransferLockState(com.google.cloud.domains.v1beta1.TransferLockState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      transferLockState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Controls whether the domain can be transferred to another registrar.
     * </pre>
     *
     * <code>.google.cloud.domains.v1beta1.TransferLockState transfer_lock_state = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTransferLockState() {
      bitField0_ = (bitField0_ & ~0x00000002);
      transferLockState_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.domains.v1beta1.ManagementSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.domains.v1beta1.ManagementSettings)
  private static final com.google.cloud.domains.v1beta1.ManagementSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.domains.v1beta1.ManagementSettings();
  }

  public static com.google.cloud.domains.v1beta1.ManagementSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagementSettings> PARSER =
      new com.google.protobuf.AbstractParser<ManagementSettings>() {
        @java.lang.Override
        public ManagementSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagementSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagementSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.domains.v1beta1.ManagementSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
