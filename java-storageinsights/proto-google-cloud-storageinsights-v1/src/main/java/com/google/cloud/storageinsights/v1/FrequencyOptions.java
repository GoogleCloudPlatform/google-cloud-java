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
// source: google/cloud/storageinsights/v1/storageinsights.proto

package com.google.cloud.storageinsights.v1;

/**
 *
 *
 * <pre>
 * ReportConfig Resource:
 *
 * Options to setup frequency of report generation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.storageinsights.v1.FrequencyOptions}
 */
public final class FrequencyOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.storageinsights.v1.FrequencyOptions)
    FrequencyOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FrequencyOptions.newBuilder() to construct.
  private FrequencyOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FrequencyOptions() {
    frequency_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FrequencyOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.storageinsights.v1.V1Proto
        .internal_static_google_cloud_storageinsights_v1_FrequencyOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.storageinsights.v1.V1Proto
        .internal_static_google_cloud_storageinsights_v1_FrequencyOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.storageinsights.v1.FrequencyOptions.class,
            com.google.cloud.storageinsights.v1.FrequencyOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * This ENUM specifies possible frequencies of report generation.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.storageinsights.v1.FrequencyOptions.Frequency}
   */
  public enum Frequency implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>FREQUENCY_UNSPECIFIED = 0;</code>
     */
    FREQUENCY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Report will be generated daily.
     * </pre>
     *
     * <code>DAILY = 1;</code>
     */
    DAILY(1),
    /**
     *
     *
     * <pre>
     * Report will be generated weekly.
     * </pre>
     *
     * <code>WEEKLY = 2;</code>
     */
    WEEKLY(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified.
     * </pre>
     *
     * <code>FREQUENCY_UNSPECIFIED = 0;</code>
     */
    public static final int FREQUENCY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Report will be generated daily.
     * </pre>
     *
     * <code>DAILY = 1;</code>
     */
    public static final int DAILY_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Report will be generated weekly.
     * </pre>
     *
     * <code>WEEKLY = 2;</code>
     */
    public static final int WEEKLY_VALUE = 2;

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
    public static Frequency valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Frequency forNumber(int value) {
      switch (value) {
        case 0:
          return FREQUENCY_UNSPECIFIED;
        case 1:
          return DAILY;
        case 2:
          return WEEKLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Frequency> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Frequency> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Frequency>() {
          public Frequency findValueByNumber(int number) {
            return Frequency.forNumber(number);
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
      return com.google.cloud.storageinsights.v1.FrequencyOptions.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final Frequency[] VALUES = values();

    public static Frequency valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Frequency(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.storageinsights.v1.FrequencyOptions.Frequency)
  }

  public static final int FREQUENCY_FIELD_NUMBER = 1;
  private int frequency_ = 0;
  /**
   *
   *
   * <pre>
   * Frequency of report generation.
   * </pre>
   *
   * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
   *
   * @return The enum numeric value on the wire for frequency.
   */
  @java.lang.Override
  public int getFrequencyValue() {
    return frequency_;
  }
  /**
   *
   *
   * <pre>
   * Frequency of report generation.
   * </pre>
   *
   * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
   *
   * @return The frequency.
   */
  @java.lang.Override
  public com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency getFrequency() {
    com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency result =
        com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency.forNumber(frequency_);
    return result == null
        ? com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency.UNRECOGNIZED
        : result;
  }

  public static final int START_DATE_FIELD_NUMBER = 2;
  private com.google.type.Date startDate_;
  /**
   *
   *
   * <pre>
   * The date from which report generation should start.
   * UTC time zone.
   * </pre>
   *
   * <code>.google.type.Date start_date = 2;</code>
   *
   * @return Whether the startDate field is set.
   */
  @java.lang.Override
  public boolean hasStartDate() {
    return startDate_ != null;
  }
  /**
   *
   *
   * <pre>
   * The date from which report generation should start.
   * UTC time zone.
   * </pre>
   *
   * <code>.google.type.Date start_date = 2;</code>
   *
   * @return The startDate.
   */
  @java.lang.Override
  public com.google.type.Date getStartDate() {
    return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
  }
  /**
   *
   *
   * <pre>
   * The date from which report generation should start.
   * UTC time zone.
   * </pre>
   *
   * <code>.google.type.Date start_date = 2;</code>
   */
  @java.lang.Override
  public com.google.type.DateOrBuilder getStartDateOrBuilder() {
    return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
  }

  public static final int END_DATE_FIELD_NUMBER = 3;
  private com.google.type.Date endDate_;
  /**
   *
   *
   * <pre>
   * The date on which report generation should stop (Inclusive).
   * UTC time zone.
   * </pre>
   *
   * <code>.google.type.Date end_date = 3;</code>
   *
   * @return Whether the endDate field is set.
   */
  @java.lang.Override
  public boolean hasEndDate() {
    return endDate_ != null;
  }
  /**
   *
   *
   * <pre>
   * The date on which report generation should stop (Inclusive).
   * UTC time zone.
   * </pre>
   *
   * <code>.google.type.Date end_date = 3;</code>
   *
   * @return The endDate.
   */
  @java.lang.Override
  public com.google.type.Date getEndDate() {
    return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
  }
  /**
   *
   *
   * <pre>
   * The date on which report generation should stop (Inclusive).
   * UTC time zone.
   * </pre>
   *
   * <code>.google.type.Date end_date = 3;</code>
   */
  @java.lang.Override
  public com.google.type.DateOrBuilder getEndDateOrBuilder() {
    return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
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
    if (frequency_
        != com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency.FREQUENCY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, frequency_);
    }
    if (startDate_ != null) {
      output.writeMessage(2, getStartDate());
    }
    if (endDate_ != null) {
      output.writeMessage(3, getEndDate());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (frequency_
        != com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency.FREQUENCY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, frequency_);
    }
    if (startDate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getStartDate());
    }
    if (endDate_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEndDate());
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
    if (!(obj instanceof com.google.cloud.storageinsights.v1.FrequencyOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.storageinsights.v1.FrequencyOptions other =
        (com.google.cloud.storageinsights.v1.FrequencyOptions) obj;

    if (frequency_ != other.frequency_) return false;
    if (hasStartDate() != other.hasStartDate()) return false;
    if (hasStartDate()) {
      if (!getStartDate().equals(other.getStartDate())) return false;
    }
    if (hasEndDate() != other.hasEndDate()) return false;
    if (hasEndDate()) {
      if (!getEndDate().equals(other.getEndDate())) return false;
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
    hash = (37 * hash) + FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + frequency_;
    if (hasStartDate()) {
      hash = (37 * hash) + START_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getStartDate().hashCode();
    }
    if (hasEndDate()) {
      hash = (37 * hash) + END_DATE_FIELD_NUMBER;
      hash = (53 * hash) + getEndDate().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions parseFrom(
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

  public static Builder newBuilder(com.google.cloud.storageinsights.v1.FrequencyOptions prototype) {
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
   * ReportConfig Resource:
   *
   * Options to setup frequency of report generation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.storageinsights.v1.FrequencyOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.storageinsights.v1.FrequencyOptions)
      com.google.cloud.storageinsights.v1.FrequencyOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.storageinsights.v1.V1Proto
          .internal_static_google_cloud_storageinsights_v1_FrequencyOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.storageinsights.v1.V1Proto
          .internal_static_google_cloud_storageinsights_v1_FrequencyOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.storageinsights.v1.FrequencyOptions.class,
              com.google.cloud.storageinsights.v1.FrequencyOptions.Builder.class);
    }

    // Construct using com.google.cloud.storageinsights.v1.FrequencyOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      frequency_ = 0;
      startDate_ = null;
      if (startDateBuilder_ != null) {
        startDateBuilder_.dispose();
        startDateBuilder_ = null;
      }
      endDate_ = null;
      if (endDateBuilder_ != null) {
        endDateBuilder_.dispose();
        endDateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.storageinsights.v1.V1Proto
          .internal_static_google_cloud_storageinsights_v1_FrequencyOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.FrequencyOptions getDefaultInstanceForType() {
      return com.google.cloud.storageinsights.v1.FrequencyOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.FrequencyOptions build() {
      com.google.cloud.storageinsights.v1.FrequencyOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.storageinsights.v1.FrequencyOptions buildPartial() {
      com.google.cloud.storageinsights.v1.FrequencyOptions result =
          new com.google.cloud.storageinsights.v1.FrequencyOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.storageinsights.v1.FrequencyOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.frequency_ = frequency_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startDate_ = startDateBuilder_ == null ? startDate_ : startDateBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endDate_ = endDateBuilder_ == null ? endDate_ : endDateBuilder_.build();
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
      if (other instanceof com.google.cloud.storageinsights.v1.FrequencyOptions) {
        return mergeFrom((com.google.cloud.storageinsights.v1.FrequencyOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.storageinsights.v1.FrequencyOptions other) {
      if (other == com.google.cloud.storageinsights.v1.FrequencyOptions.getDefaultInstance())
        return this;
      if (other.frequency_ != 0) {
        setFrequencyValue(other.getFrequencyValue());
      }
      if (other.hasStartDate()) {
        mergeStartDate(other.getStartDate());
      }
      if (other.hasEndDate()) {
        mergeEndDate(other.getEndDate());
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
                frequency_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getStartDateFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getEndDateFieldBuilder().getBuilder(), extensionRegistry);
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

    private int frequency_ = 0;
    /**
     *
     *
     * <pre>
     * Frequency of report generation.
     * </pre>
     *
     * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
     *
     * @return The enum numeric value on the wire for frequency.
     */
    @java.lang.Override
    public int getFrequencyValue() {
      return frequency_;
    }
    /**
     *
     *
     * <pre>
     * Frequency of report generation.
     * </pre>
     *
     * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
     *
     * @param value The enum numeric value on the wire for frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequencyValue(int value) {
      frequency_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Frequency of report generation.
     * </pre>
     *
     * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
     *
     * @return The frequency.
     */
    @java.lang.Override
    public com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency getFrequency() {
      com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency result =
          com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency.forNumber(frequency_);
      return result == null
          ? com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Frequency of report generation.
     * </pre>
     *
     * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
     *
     * @param value The frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequency(
        com.google.cloud.storageinsights.v1.FrequencyOptions.Frequency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      frequency_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Frequency of report generation.
     * </pre>
     *
     * <code>.google.cloud.storageinsights.v1.FrequencyOptions.Frequency frequency = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFrequency() {
      bitField0_ = (bitField0_ & ~0x00000001);
      frequency_ = 0;
      onChanged();
      return this;
    }

    private com.google.type.Date startDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        startDateBuilder_;
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     *
     * @return Whether the startDate field is set.
     */
    public boolean hasStartDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     *
     * @return The startDate.
     */
    public com.google.type.Date getStartDate() {
      if (startDateBuilder_ == null) {
        return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
      } else {
        return startDateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    public Builder setStartDate(com.google.type.Date value) {
      if (startDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startDate_ = value;
      } else {
        startDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    public Builder setStartDate(com.google.type.Date.Builder builderForValue) {
      if (startDateBuilder_ == null) {
        startDate_ = builderForValue.build();
      } else {
        startDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    public Builder mergeStartDate(com.google.type.Date value) {
      if (startDateBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && startDate_ != null
            && startDate_ != com.google.type.Date.getDefaultInstance()) {
          getStartDateBuilder().mergeFrom(value);
        } else {
          startDate_ = value;
        }
      } else {
        startDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startDate_ = null;
      if (startDateBuilder_ != null) {
        startDateBuilder_.dispose();
        startDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    public com.google.type.Date.Builder getStartDateBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getStartDateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    public com.google.type.DateOrBuilder getStartDateOrBuilder() {
      if (startDateBuilder_ != null) {
        return startDateBuilder_.getMessageOrBuilder();
      } else {
        return startDate_ == null ? com.google.type.Date.getDefaultInstance() : startDate_;
      }
    }
    /**
     *
     *
     * <pre>
     * The date from which report generation should start.
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date start_date = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        getStartDateFieldBuilder() {
      if (startDateBuilder_ == null) {
        startDateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getStartDate(), getParentForChildren(), isClean());
        startDate_ = null;
      }
      return startDateBuilder_;
    }

    private com.google.type.Date endDate_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        endDateBuilder_;
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     *
     * @return Whether the endDate field is set.
     */
    public boolean hasEndDate() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     *
     * @return The endDate.
     */
    public com.google.type.Date getEndDate() {
      if (endDateBuilder_ == null) {
        return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
      } else {
        return endDateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    public Builder setEndDate(com.google.type.Date value) {
      if (endDateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        endDate_ = value;
      } else {
        endDateBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    public Builder setEndDate(com.google.type.Date.Builder builderForValue) {
      if (endDateBuilder_ == null) {
        endDate_ = builderForValue.build();
      } else {
        endDateBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    public Builder mergeEndDate(com.google.type.Date value) {
      if (endDateBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && endDate_ != null
            && endDate_ != com.google.type.Date.getDefaultInstance()) {
          getEndDateBuilder().mergeFrom(value);
        } else {
          endDate_ = value;
        }
      } else {
        endDateBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    public Builder clearEndDate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endDate_ = null;
      if (endDateBuilder_ != null) {
        endDateBuilder_.dispose();
        endDateBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    public com.google.type.Date.Builder getEndDateBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getEndDateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    public com.google.type.DateOrBuilder getEndDateOrBuilder() {
      if (endDateBuilder_ != null) {
        return endDateBuilder_.getMessageOrBuilder();
      } else {
        return endDate_ == null ? com.google.type.Date.getDefaultInstance() : endDate_;
      }
    }
    /**
     *
     *
     * <pre>
     * The date on which report generation should stop (Inclusive).
     * UTC time zone.
     * </pre>
     *
     * <code>.google.type.Date end_date = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>
        getEndDateFieldBuilder() {
      if (endDateBuilder_ == null) {
        endDateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.type.Date, com.google.type.Date.Builder, com.google.type.DateOrBuilder>(
                getEndDate(), getParentForChildren(), isClean());
        endDate_ = null;
      }
      return endDateBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.storageinsights.v1.FrequencyOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.storageinsights.v1.FrequencyOptions)
  private static final com.google.cloud.storageinsights.v1.FrequencyOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.storageinsights.v1.FrequencyOptions();
  }

  public static com.google.cloud.storageinsights.v1.FrequencyOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FrequencyOptions> PARSER =
      new com.google.protobuf.AbstractParser<FrequencyOptions>() {
        @java.lang.Override
        public FrequencyOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<FrequencyOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FrequencyOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.storageinsights.v1.FrequencyOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
