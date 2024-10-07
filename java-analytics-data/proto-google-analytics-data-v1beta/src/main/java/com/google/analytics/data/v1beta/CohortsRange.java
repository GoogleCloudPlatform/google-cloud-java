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
// source: google/analytics/data/v1beta/data.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1beta;

/**
 *
 *
 * <pre>
 * Configures the extended reporting date range for a cohort report. Specifies
 * an offset duration to follow the cohorts over.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1beta.CohortsRange}
 */
public final class CohortsRange extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1beta.CohortsRange)
    CohortsRangeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CohortsRange.newBuilder() to construct.
  private CohortsRange(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CohortsRange() {
    granularity_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CohortsRange();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1beta.ReportingApiProto
        .internal_static_google_analytics_data_v1beta_CohortsRange_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1beta.ReportingApiProto
        .internal_static_google_analytics_data_v1beta_CohortsRange_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1beta.CohortsRange.class,
            com.google.analytics.data.v1beta.CohortsRange.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The granularity used to interpret the `startOffset` and `endOffset` for the
   * extended reporting date range for a cohort report.
   * </pre>
   *
   * Protobuf enum {@code google.analytics.data.v1beta.CohortsRange.Granularity}
   */
  public enum Granularity implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Should never be specified.
     * </pre>
     *
     * <code>GRANULARITY_UNSPECIFIED = 0;</code>
     */
    GRANULARITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Daily granularity. Commonly used if the cohort's `dateRange` is a single
     * day and the request contains `cohortNthDay`.
     * </pre>
     *
     * <code>DAILY = 1;</code>
     */
    DAILY(1),
    /**
     *
     *
     * <pre>
     * Weekly granularity. Commonly used if the cohort's `dateRange` is a week
     * in duration (starting on Sunday and ending on Saturday) and the request
     * contains `cohortNthWeek`.
     * </pre>
     *
     * <code>WEEKLY = 2;</code>
     */
    WEEKLY(2),
    /**
     *
     *
     * <pre>
     * Monthly granularity. Commonly used if the cohort's `dateRange` is a month
     * in duration and the request contains `cohortNthMonth`.
     * </pre>
     *
     * <code>MONTHLY = 3;</code>
     */
    MONTHLY(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Should never be specified.
     * </pre>
     *
     * <code>GRANULARITY_UNSPECIFIED = 0;</code>
     */
    public static final int GRANULARITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Daily granularity. Commonly used if the cohort's `dateRange` is a single
     * day and the request contains `cohortNthDay`.
     * </pre>
     *
     * <code>DAILY = 1;</code>
     */
    public static final int DAILY_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Weekly granularity. Commonly used if the cohort's `dateRange` is a week
     * in duration (starting on Sunday and ending on Saturday) and the request
     * contains `cohortNthWeek`.
     * </pre>
     *
     * <code>WEEKLY = 2;</code>
     */
    public static final int WEEKLY_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Monthly granularity. Commonly used if the cohort's `dateRange` is a month
     * in duration and the request contains `cohortNthMonth`.
     * </pre>
     *
     * <code>MONTHLY = 3;</code>
     */
    public static final int MONTHLY_VALUE = 3;

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
    public static Granularity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Granularity forNumber(int value) {
      switch (value) {
        case 0:
          return GRANULARITY_UNSPECIFIED;
        case 1:
          return DAILY;
        case 2:
          return WEEKLY;
        case 3:
          return MONTHLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Granularity> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Granularity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Granularity>() {
          public Granularity findValueByNumber(int number) {
            return Granularity.forNumber(number);
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
      return com.google.analytics.data.v1beta.CohortsRange.getDescriptor().getEnumTypes().get(0);
    }

    private static final Granularity[] VALUES = values();

    public static Granularity valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Granularity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.analytics.data.v1beta.CohortsRange.Granularity)
  }

  public static final int GRANULARITY_FIELD_NUMBER = 1;
  private int granularity_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The granularity used to interpret the `startOffset` and
   * `endOffset` for the extended reporting date range for a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
   *
   * @return The enum numeric value on the wire for granularity.
   */
  @java.lang.Override
  public int getGranularityValue() {
    return granularity_;
  }
  /**
   *
   *
   * <pre>
   * Required. The granularity used to interpret the `startOffset` and
   * `endOffset` for the extended reporting date range for a cohort report.
   * </pre>
   *
   * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
   *
   * @return The granularity.
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.CohortsRange.Granularity getGranularity() {
    com.google.analytics.data.v1beta.CohortsRange.Granularity result =
        com.google.analytics.data.v1beta.CohortsRange.Granularity.forNumber(granularity_);
    return result == null
        ? com.google.analytics.data.v1beta.CohortsRange.Granularity.UNRECOGNIZED
        : result;
  }

  public static final int START_OFFSET_FIELD_NUMBER = 2;
  private int startOffset_ = 0;
  /**
   *
   *
   * <pre>
   * `startOffset` specifies the start date of the extended reporting date range
   * for a cohort report. `startOffset` is commonly set to 0 so that reports
   * contain data from the acquisition of the cohort forward.
   *
   * If `granularity` is `DAILY`, the `startDate` of the extended reporting date
   * range is `startDate` of the cohort plus `startOffset` days.
   *
   * If `granularity` is `WEEKLY`, the `startDate` of the extended reporting
   * date range is `startDate` of the cohort plus `startOffset * 7` days.
   *
   * If `granularity` is `MONTHLY`, the `startDate` of the extended reporting
   * date range is `startDate` of the cohort plus `startOffset * 30` days.
   * </pre>
   *
   * <code>int32 start_offset = 2;</code>
   *
   * @return The startOffset.
   */
  @java.lang.Override
  public int getStartOffset() {
    return startOffset_;
  }

  public static final int END_OFFSET_FIELD_NUMBER = 3;
  private int endOffset_ = 0;
  /**
   *
   *
   * <pre>
   * Required. `endOffset` specifies the end date of the extended reporting date
   * range for a cohort report. `endOffset` can be any positive integer but is
   * commonly set to 5 to 10 so that reports contain data on the cohort for the
   * next several granularity time periods.
   *
   * If `granularity` is `DAILY`, the `endDate` of the extended reporting date
   * range is `endDate` of the cohort plus `endOffset` days.
   *
   * If `granularity` is `WEEKLY`, the `endDate` of the extended reporting date
   * range is `endDate` of the cohort plus `endOffset * 7` days.
   *
   * If `granularity` is `MONTHLY`, the `endDate` of the extended reporting date
   * range is `endDate` of the cohort plus `endOffset * 30` days.
   * </pre>
   *
   * <code>int32 end_offset = 3;</code>
   *
   * @return The endOffset.
   */
  @java.lang.Override
  public int getEndOffset() {
    return endOffset_;
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
    if (granularity_
        != com.google.analytics.data.v1beta.CohortsRange.Granularity.GRANULARITY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, granularity_);
    }
    if (startOffset_ != 0) {
      output.writeInt32(2, startOffset_);
    }
    if (endOffset_ != 0) {
      output.writeInt32(3, endOffset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (granularity_
        != com.google.analytics.data.v1beta.CohortsRange.Granularity.GRANULARITY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, granularity_);
    }
    if (startOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, startOffset_);
    }
    if (endOffset_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, endOffset_);
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
    if (!(obj instanceof com.google.analytics.data.v1beta.CohortsRange)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1beta.CohortsRange other =
        (com.google.analytics.data.v1beta.CohortsRange) obj;

    if (granularity_ != other.granularity_) return false;
    if (getStartOffset() != other.getStartOffset()) return false;
    if (getEndOffset() != other.getEndOffset()) return false;
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
    hash = (37 * hash) + GRANULARITY_FIELD_NUMBER;
    hash = (53 * hash) + granularity_;
    hash = (37 * hash) + START_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getStartOffset();
    hash = (37 * hash) + END_OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getEndOffset();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.CohortsRange parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1beta.CohortsRange prototype) {
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
   * Configures the extended reporting date range for a cohort report. Specifies
   * an offset duration to follow the cohorts over.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1beta.CohortsRange}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1beta.CohortsRange)
      com.google.analytics.data.v1beta.CohortsRangeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1beta.ReportingApiProto
          .internal_static_google_analytics_data_v1beta_CohortsRange_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1beta.ReportingApiProto
          .internal_static_google_analytics_data_v1beta_CohortsRange_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1beta.CohortsRange.class,
              com.google.analytics.data.v1beta.CohortsRange.Builder.class);
    }

    // Construct using com.google.analytics.data.v1beta.CohortsRange.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      granularity_ = 0;
      startOffset_ = 0;
      endOffset_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1beta.ReportingApiProto
          .internal_static_google_analytics_data_v1beta_CohortsRange_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.CohortsRange getDefaultInstanceForType() {
      return com.google.analytics.data.v1beta.CohortsRange.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.CohortsRange build() {
      com.google.analytics.data.v1beta.CohortsRange result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.CohortsRange buildPartial() {
      com.google.analytics.data.v1beta.CohortsRange result =
          new com.google.analytics.data.v1beta.CohortsRange(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1beta.CohortsRange result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.granularity_ = granularity_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startOffset_ = startOffset_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.endOffset_ = endOffset_;
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
      if (other instanceof com.google.analytics.data.v1beta.CohortsRange) {
        return mergeFrom((com.google.analytics.data.v1beta.CohortsRange) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1beta.CohortsRange other) {
      if (other == com.google.analytics.data.v1beta.CohortsRange.getDefaultInstance()) return this;
      if (other.granularity_ != 0) {
        setGranularityValue(other.getGranularityValue());
      }
      if (other.getStartOffset() != 0) {
        setStartOffset(other.getStartOffset());
      }
      if (other.getEndOffset() != 0) {
        setEndOffset(other.getEndOffset());
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
                granularity_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                startOffset_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                endOffset_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int granularity_ = 0;
    /**
     *
     *
     * <pre>
     * Required. The granularity used to interpret the `startOffset` and
     * `endOffset` for the extended reporting date range for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
     *
     * @return The enum numeric value on the wire for granularity.
     */
    @java.lang.Override
    public int getGranularityValue() {
      return granularity_;
    }
    /**
     *
     *
     * <pre>
     * Required. The granularity used to interpret the `startOffset` and
     * `endOffset` for the extended reporting date range for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
     *
     * @param value The enum numeric value on the wire for granularity to set.
     * @return This builder for chaining.
     */
    public Builder setGranularityValue(int value) {
      granularity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The granularity used to interpret the `startOffset` and
     * `endOffset` for the extended reporting date range for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
     *
     * @return The granularity.
     */
    @java.lang.Override
    public com.google.analytics.data.v1beta.CohortsRange.Granularity getGranularity() {
      com.google.analytics.data.v1beta.CohortsRange.Granularity result =
          com.google.analytics.data.v1beta.CohortsRange.Granularity.forNumber(granularity_);
      return result == null
          ? com.google.analytics.data.v1beta.CohortsRange.Granularity.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required. The granularity used to interpret the `startOffset` and
     * `endOffset` for the extended reporting date range for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
     *
     * @param value The granularity to set.
     * @return This builder for chaining.
     */
    public Builder setGranularity(com.google.analytics.data.v1beta.CohortsRange.Granularity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      granularity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The granularity used to interpret the `startOffset` and
     * `endOffset` for the extended reporting date range for a cohort report.
     * </pre>
     *
     * <code>.google.analytics.data.v1beta.CohortsRange.Granularity granularity = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGranularity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      granularity_ = 0;
      onChanged();
      return this;
    }

    private int startOffset_;
    /**
     *
     *
     * <pre>
     * `startOffset` specifies the start date of the extended reporting date range
     * for a cohort report. `startOffset` is commonly set to 0 so that reports
     * contain data from the acquisition of the cohort forward.
     *
     * If `granularity` is `DAILY`, the `startDate` of the extended reporting date
     * range is `startDate` of the cohort plus `startOffset` days.
     *
     * If `granularity` is `WEEKLY`, the `startDate` of the extended reporting
     * date range is `startDate` of the cohort plus `startOffset * 7` days.
     *
     * If `granularity` is `MONTHLY`, the `startDate` of the extended reporting
     * date range is `startDate` of the cohort plus `startOffset * 30` days.
     * </pre>
     *
     * <code>int32 start_offset = 2;</code>
     *
     * @return The startOffset.
     */
    @java.lang.Override
    public int getStartOffset() {
      return startOffset_;
    }
    /**
     *
     *
     * <pre>
     * `startOffset` specifies the start date of the extended reporting date range
     * for a cohort report. `startOffset` is commonly set to 0 so that reports
     * contain data from the acquisition of the cohort forward.
     *
     * If `granularity` is `DAILY`, the `startDate` of the extended reporting date
     * range is `startDate` of the cohort plus `startOffset` days.
     *
     * If `granularity` is `WEEKLY`, the `startDate` of the extended reporting
     * date range is `startDate` of the cohort plus `startOffset * 7` days.
     *
     * If `granularity` is `MONTHLY`, the `startDate` of the extended reporting
     * date range is `startDate` of the cohort plus `startOffset * 30` days.
     * </pre>
     *
     * <code>int32 start_offset = 2;</code>
     *
     * @param value The startOffset to set.
     * @return This builder for chaining.
     */
    public Builder setStartOffset(int value) {

      startOffset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `startOffset` specifies the start date of the extended reporting date range
     * for a cohort report. `startOffset` is commonly set to 0 so that reports
     * contain data from the acquisition of the cohort forward.
     *
     * If `granularity` is `DAILY`, the `startDate` of the extended reporting date
     * range is `startDate` of the cohort plus `startOffset` days.
     *
     * If `granularity` is `WEEKLY`, the `startDate` of the extended reporting
     * date range is `startDate` of the cohort plus `startOffset * 7` days.
     *
     * If `granularity` is `MONTHLY`, the `startDate` of the extended reporting
     * date range is `startDate` of the cohort plus `startOffset * 30` days.
     * </pre>
     *
     * <code>int32 start_offset = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearStartOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startOffset_ = 0;
      onChanged();
      return this;
    }

    private int endOffset_;
    /**
     *
     *
     * <pre>
     * Required. `endOffset` specifies the end date of the extended reporting date
     * range for a cohort report. `endOffset` can be any positive integer but is
     * commonly set to 5 to 10 so that reports contain data on the cohort for the
     * next several granularity time periods.
     *
     * If `granularity` is `DAILY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset` days.
     *
     * If `granularity` is `WEEKLY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset * 7` days.
     *
     * If `granularity` is `MONTHLY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset * 30` days.
     * </pre>
     *
     * <code>int32 end_offset = 3;</code>
     *
     * @return The endOffset.
     */
    @java.lang.Override
    public int getEndOffset() {
      return endOffset_;
    }
    /**
     *
     *
     * <pre>
     * Required. `endOffset` specifies the end date of the extended reporting date
     * range for a cohort report. `endOffset` can be any positive integer but is
     * commonly set to 5 to 10 so that reports contain data on the cohort for the
     * next several granularity time periods.
     *
     * If `granularity` is `DAILY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset` days.
     *
     * If `granularity` is `WEEKLY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset * 7` days.
     *
     * If `granularity` is `MONTHLY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset * 30` days.
     * </pre>
     *
     * <code>int32 end_offset = 3;</code>
     *
     * @param value The endOffset to set.
     * @return This builder for chaining.
     */
    public Builder setEndOffset(int value) {

      endOffset_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. `endOffset` specifies the end date of the extended reporting date
     * range for a cohort report. `endOffset` can be any positive integer but is
     * commonly set to 5 to 10 so that reports contain data on the cohort for the
     * next several granularity time periods.
     *
     * If `granularity` is `DAILY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset` days.
     *
     * If `granularity` is `WEEKLY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset * 7` days.
     *
     * If `granularity` is `MONTHLY`, the `endDate` of the extended reporting date
     * range is `endDate` of the cohort plus `endOffset * 30` days.
     * </pre>
     *
     * <code>int32 end_offset = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEndOffset() {
      bitField0_ = (bitField0_ & ~0x00000004);
      endOffset_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1beta.CohortsRange)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1beta.CohortsRange)
  private static final com.google.analytics.data.v1beta.CohortsRange DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1beta.CohortsRange();
  }

  public static com.google.analytics.data.v1beta.CohortsRange getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CohortsRange> PARSER =
      new com.google.protobuf.AbstractParser<CohortsRange>() {
        @java.lang.Override
        public CohortsRange parsePartialFrom(
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

  public static com.google.protobuf.Parser<CohortsRange> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CohortsRange> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1beta.CohortsRange getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
