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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Requirements that must be true before a resource is profiled for the first
 * time.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DiscoveryOtherCloudConditions}
 */
public final class DiscoveryOtherCloudConditions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DiscoveryOtherCloudConditions)
    DiscoveryOtherCloudConditionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiscoveryOtherCloudConditions.newBuilder() to construct.
  private DiscoveryOtherCloudConditions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiscoveryOtherCloudConditions() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiscoveryOtherCloudConditions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoveryOtherCloudConditions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoveryOtherCloudConditions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.class,
            com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.Builder.class);
  }

  private int bitField0_;
  private int conditionsCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object conditions_;

  public enum ConditionsCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    AMAZON_S3_BUCKET_CONDITIONS(2),
    CONDITIONS_NOT_SET(0);
    private final int value;

    private ConditionsCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConditionsCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConditionsCase forNumber(int value) {
      switch (value) {
        case 2:
          return AMAZON_S3_BUCKET_CONDITIONS;
        case 0:
          return CONDITIONS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ConditionsCase getConditionsCase() {
    return ConditionsCase.forNumber(conditionsCase_);
  }

  public static final int MIN_AGE_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration minAge_;
  /**
   *
   *
   * <pre>
   * Minimum age a resource must be before Cloud DLP can profile it. Value must
   * be 1 hour or greater.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_age = 1;</code>
   *
   * @return Whether the minAge field is set.
   */
  @java.lang.Override
  public boolean hasMinAge() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Minimum age a resource must be before Cloud DLP can profile it. Value must
   * be 1 hour or greater.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_age = 1;</code>
   *
   * @return The minAge.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getMinAge() {
    return minAge_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minAge_;
  }
  /**
   *
   *
   * <pre>
   * Minimum age a resource must be before Cloud DLP can profile it. Value must
   * be 1 hour or greater.
   * </pre>
   *
   * <code>.google.protobuf.Duration min_age = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getMinAgeOrBuilder() {
    return minAge_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minAge_;
  }

  public static final int AMAZON_S3_BUCKET_CONDITIONS_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Amazon S3 bucket conditions.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
   *
   * @return Whether the amazonS3BucketConditions field is set.
   */
  @java.lang.Override
  public boolean hasAmazonS3BucketConditions() {
    return conditionsCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Amazon S3 bucket conditions.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
   *
   * @return The amazonS3BucketConditions.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.AmazonS3BucketConditions getAmazonS3BucketConditions() {
    if (conditionsCase_ == 2) {
      return (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_;
    }
    return com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Amazon S3 bucket conditions.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.AmazonS3BucketConditionsOrBuilder
      getAmazonS3BucketConditionsOrBuilder() {
    if (conditionsCase_ == 2) {
      return (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_;
    }
    return com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance();
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMinAge());
    }
    if (conditionsCase_ == 2) {
      output.writeMessage(2, (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMinAge());
    }
    if (conditionsCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions other =
        (com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions) obj;

    if (hasMinAge() != other.hasMinAge()) return false;
    if (hasMinAge()) {
      if (!getMinAge().equals(other.getMinAge())) return false;
    }
    if (!getConditionsCase().equals(other.getConditionsCase())) return false;
    switch (conditionsCase_) {
      case 2:
        if (!getAmazonS3BucketConditions().equals(other.getAmazonS3BucketConditions()))
          return false;
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
    if (hasMinAge()) {
      hash = (37 * hash) + MIN_AGE_FIELD_NUMBER;
      hash = (53 * hash) + getMinAge().hashCode();
    }
    switch (conditionsCase_) {
      case 2:
        hash = (37 * hash) + AMAZON_S3_BUCKET_CONDITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getAmazonS3BucketConditions().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions parseFrom(
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
      com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions prototype) {
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
   * Requirements that must be true before a resource is profiled for the first
   * time.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DiscoveryOtherCloudConditions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DiscoveryOtherCloudConditions)
      com.google.privacy.dlp.v2.DiscoveryOtherCloudConditionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryOtherCloudConditions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryOtherCloudConditions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.class,
              com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMinAgeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minAge_ = null;
      if (minAgeBuilder_ != null) {
        minAgeBuilder_.dispose();
        minAgeBuilder_ = null;
      }
      if (amazonS3BucketConditionsBuilder_ != null) {
        amazonS3BucketConditionsBuilder_.clear();
      }
      conditionsCase_ = 0;
      conditions_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoveryOtherCloudConditions_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions build() {
      com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions buildPartial() {
      com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions result =
          new com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minAge_ = minAgeBuilder_ == null ? minAge_ : minAgeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(
        com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions result) {
      result.conditionsCase_ = conditionsCase_;
      result.conditions_ = this.conditions_;
      if (conditionsCase_ == 2 && amazonS3BucketConditionsBuilder_ != null) {
        result.conditions_ = amazonS3BucketConditionsBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions) {
        return mergeFrom((com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions other) {
      if (other == com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions.getDefaultInstance())
        return this;
      if (other.hasMinAge()) {
        mergeMinAge(other.getMinAge());
      }
      switch (other.getConditionsCase()) {
        case AMAZON_S3_BUCKET_CONDITIONS:
          {
            mergeAmazonS3BucketConditions(other.getAmazonS3BucketConditions());
            break;
          }
        case CONDITIONS_NOT_SET:
          {
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
            case 10:
              {
                input.readMessage(getMinAgeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getAmazonS3BucketConditionsFieldBuilder().getBuilder(), extensionRegistry);
                conditionsCase_ = 2;
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

    private int conditionsCase_ = 0;
    private java.lang.Object conditions_;

    public ConditionsCase getConditionsCase() {
      return ConditionsCase.forNumber(conditionsCase_);
    }

    public Builder clearConditions() {
      conditionsCase_ = 0;
      conditions_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Duration minAge_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        minAgeBuilder_;
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     *
     * @return Whether the minAge field is set.
     */
    public boolean hasMinAge() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     *
     * @return The minAge.
     */
    public com.google.protobuf.Duration getMinAge() {
      if (minAgeBuilder_ == null) {
        return minAge_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minAge_;
      } else {
        return minAgeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    public Builder setMinAge(com.google.protobuf.Duration value) {
      if (minAgeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        minAge_ = value;
      } else {
        minAgeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    public Builder setMinAge(com.google.protobuf.Duration.Builder builderForValue) {
      if (minAgeBuilder_ == null) {
        minAge_ = builderForValue.build();
      } else {
        minAgeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    public Builder mergeMinAge(com.google.protobuf.Duration value) {
      if (minAgeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && minAge_ != null
            && minAge_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getMinAgeBuilder().mergeFrom(value);
        } else {
          minAge_ = value;
        }
      } else {
        minAgeBuilder_.mergeFrom(value);
      }
      if (minAge_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    public Builder clearMinAge() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minAge_ = null;
      if (minAgeBuilder_ != null) {
        minAgeBuilder_.dispose();
        minAgeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getMinAgeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMinAgeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getMinAgeOrBuilder() {
      if (minAgeBuilder_ != null) {
        return minAgeBuilder_.getMessageOrBuilder();
      } else {
        return minAge_ == null ? com.google.protobuf.Duration.getDefaultInstance() : minAge_;
      }
    }
    /**
     *
     *
     * <pre>
     * Minimum age a resource must be before Cloud DLP can profile it. Value must
     * be 1 hour or greater.
     * </pre>
     *
     * <code>.google.protobuf.Duration min_age = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getMinAgeFieldBuilder() {
      if (minAgeBuilder_ == null) {
        minAgeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getMinAge(), getParentForChildren(), isClean());
        minAge_ = null;
      }
      return minAgeBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.AmazonS3BucketConditions,
            com.google.privacy.dlp.v2.AmazonS3BucketConditions.Builder,
            com.google.privacy.dlp.v2.AmazonS3BucketConditionsOrBuilder>
        amazonS3BucketConditionsBuilder_;
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     *
     * @return Whether the amazonS3BucketConditions field is set.
     */
    @java.lang.Override
    public boolean hasAmazonS3BucketConditions() {
      return conditionsCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     *
     * @return The amazonS3BucketConditions.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3BucketConditions getAmazonS3BucketConditions() {
      if (amazonS3BucketConditionsBuilder_ == null) {
        if (conditionsCase_ == 2) {
          return (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_;
        }
        return com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance();
      } else {
        if (conditionsCase_ == 2) {
          return amazonS3BucketConditionsBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    public Builder setAmazonS3BucketConditions(
        com.google.privacy.dlp.v2.AmazonS3BucketConditions value) {
      if (amazonS3BucketConditionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conditions_ = value;
        onChanged();
      } else {
        amazonS3BucketConditionsBuilder_.setMessage(value);
      }
      conditionsCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    public Builder setAmazonS3BucketConditions(
        com.google.privacy.dlp.v2.AmazonS3BucketConditions.Builder builderForValue) {
      if (amazonS3BucketConditionsBuilder_ == null) {
        conditions_ = builderForValue.build();
        onChanged();
      } else {
        amazonS3BucketConditionsBuilder_.setMessage(builderForValue.build());
      }
      conditionsCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    public Builder mergeAmazonS3BucketConditions(
        com.google.privacy.dlp.v2.AmazonS3BucketConditions value) {
      if (amazonS3BucketConditionsBuilder_ == null) {
        if (conditionsCase_ == 2
            && conditions_
                != com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance()) {
          conditions_ =
              com.google.privacy.dlp.v2.AmazonS3BucketConditions.newBuilder(
                      (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          conditions_ = value;
        }
        onChanged();
      } else {
        if (conditionsCase_ == 2) {
          amazonS3BucketConditionsBuilder_.mergeFrom(value);
        } else {
          amazonS3BucketConditionsBuilder_.setMessage(value);
        }
      }
      conditionsCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    public Builder clearAmazonS3BucketConditions() {
      if (amazonS3BucketConditionsBuilder_ == null) {
        if (conditionsCase_ == 2) {
          conditionsCase_ = 0;
          conditions_ = null;
          onChanged();
        }
      } else {
        if (conditionsCase_ == 2) {
          conditionsCase_ = 0;
          conditions_ = null;
        }
        amazonS3BucketConditionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    public com.google.privacy.dlp.v2.AmazonS3BucketConditions.Builder
        getAmazonS3BucketConditionsBuilder() {
      return getAmazonS3BucketConditionsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3BucketConditionsOrBuilder
        getAmazonS3BucketConditionsOrBuilder() {
      if ((conditionsCase_ == 2) && (amazonS3BucketConditionsBuilder_ != null)) {
        return amazonS3BucketConditionsBuilder_.getMessageOrBuilder();
      } else {
        if (conditionsCase_ == 2) {
          return (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_;
        }
        return com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Amazon S3 bucket conditions.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AmazonS3BucketConditions amazon_s3_bucket_conditions = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.AmazonS3BucketConditions,
            com.google.privacy.dlp.v2.AmazonS3BucketConditions.Builder,
            com.google.privacy.dlp.v2.AmazonS3BucketConditionsOrBuilder>
        getAmazonS3BucketConditionsFieldBuilder() {
      if (amazonS3BucketConditionsBuilder_ == null) {
        if (!(conditionsCase_ == 2)) {
          conditions_ = com.google.privacy.dlp.v2.AmazonS3BucketConditions.getDefaultInstance();
        }
        amazonS3BucketConditionsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.AmazonS3BucketConditions,
                com.google.privacy.dlp.v2.AmazonS3BucketConditions.Builder,
                com.google.privacy.dlp.v2.AmazonS3BucketConditionsOrBuilder>(
                (com.google.privacy.dlp.v2.AmazonS3BucketConditions) conditions_,
                getParentForChildren(),
                isClean());
        conditions_ = null;
      }
      conditionsCase_ = 2;
      onChanged();
      return amazonS3BucketConditionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DiscoveryOtherCloudConditions)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DiscoveryOtherCloudConditions)
  private static final com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions();
  }

  public static com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryOtherCloudConditions> PARSER =
      new com.google.protobuf.AbstractParser<DiscoveryOtherCloudConditions>() {
        @java.lang.Override
        public DiscoveryOtherCloudConditions parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiscoveryOtherCloudConditions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryOtherCloudConditions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
