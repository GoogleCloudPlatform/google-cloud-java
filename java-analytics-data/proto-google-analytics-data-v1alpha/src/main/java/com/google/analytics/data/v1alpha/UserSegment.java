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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.data.v1alpha;

/**
 *
 *
 * <pre>
 * User segments are subsets of users who engaged with your site or app. For
 * example, users who have previously purchased; users who added items to their
 * shopping carts, but didn’t complete a purchase.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1alpha.UserSegment}
 */
public final class UserSegment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1alpha.UserSegment)
    UserSegmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserSegment.newBuilder() to construct.
  private UserSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserSegment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserSegment();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_UserSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1alpha.ReportingApiProto
        .internal_static_google_analytics_data_v1alpha_UserSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1alpha.UserSegment.class,
            com.google.analytics.data.v1alpha.UserSegment.Builder.class);
  }

  private int bitField0_;
  public static final int USER_INCLUSION_CRITERIA_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1alpha.UserSegmentCriteria userInclusionCriteria_;
  /**
   *
   *
   * <pre>
   * Defines which users are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
   *
   * @return Whether the userInclusionCriteria field is set.
   */
  @java.lang.Override
  public boolean hasUserInclusionCriteria() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Defines which users are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
   *
   * @return The userInclusionCriteria.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentCriteria getUserInclusionCriteria() {
    return userInclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
        : userInclusionCriteria_;
  }
  /**
   *
   *
   * <pre>
   * Defines which users are included in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder
      getUserInclusionCriteriaOrBuilder() {
    return userInclusionCriteria_ == null
        ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
        : userInclusionCriteria_;
  }

  public static final int EXCLUSION_FIELD_NUMBER = 2;
  private com.google.analytics.data.v1alpha.UserSegmentExclusion exclusion_;
  /**
   *
   *
   * <pre>
   * Defines which users are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
   *
   * @return Whether the exclusion field is set.
   */
  @java.lang.Override
  public boolean hasExclusion() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Defines which users are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
   *
   * @return The exclusion.
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentExclusion getExclusion() {
    return exclusion_ == null
        ? com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance()
        : exclusion_;
  }
  /**
   *
   *
   * <pre>
   * Defines which users are excluded in this segment. Optional.
   * </pre>
   *
   * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder getExclusionOrBuilder() {
    return exclusion_ == null
        ? com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance()
        : exclusion_;
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
      output.writeMessage(1, getUserInclusionCriteria());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getExclusion());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUserInclusionCriteria());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getExclusion());
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
    if (!(obj instanceof com.google.analytics.data.v1alpha.UserSegment)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1alpha.UserSegment other =
        (com.google.analytics.data.v1alpha.UserSegment) obj;

    if (hasUserInclusionCriteria() != other.hasUserInclusionCriteria()) return false;
    if (hasUserInclusionCriteria()) {
      if (!getUserInclusionCriteria().equals(other.getUserInclusionCriteria())) return false;
    }
    if (hasExclusion() != other.hasExclusion()) return false;
    if (hasExclusion()) {
      if (!getExclusion().equals(other.getExclusion())) return false;
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
    if (hasUserInclusionCriteria()) {
      hash = (37 * hash) + USER_INCLUSION_CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + getUserInclusionCriteria().hashCode();
    }
    if (hasExclusion()) {
      hash = (37 * hash) + EXCLUSION_FIELD_NUMBER;
      hash = (53 * hash) + getExclusion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1alpha.UserSegment parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1alpha.UserSegment prototype) {
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
   * User segments are subsets of users who engaged with your site or app. For
   * example, users who have previously purchased; users who added items to their
   * shopping carts, but didn’t complete a purchase.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1alpha.UserSegment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1alpha.UserSegment)
      com.google.analytics.data.v1alpha.UserSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1alpha.UserSegment.class,
              com.google.analytics.data.v1alpha.UserSegment.Builder.class);
    }

    // Construct using com.google.analytics.data.v1alpha.UserSegment.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUserInclusionCriteriaFieldBuilder();
        getExclusionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userInclusionCriteria_ = null;
      if (userInclusionCriteriaBuilder_ != null) {
        userInclusionCriteriaBuilder_.dispose();
        userInclusionCriteriaBuilder_ = null;
      }
      exclusion_ = null;
      if (exclusionBuilder_ != null) {
        exclusionBuilder_.dispose();
        exclusionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1alpha.ReportingApiProto
          .internal_static_google_analytics_data_v1alpha_UserSegment_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegment getDefaultInstanceForType() {
      return com.google.analytics.data.v1alpha.UserSegment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegment build() {
      com.google.analytics.data.v1alpha.UserSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1alpha.UserSegment buildPartial() {
      com.google.analytics.data.v1alpha.UserSegment result =
          new com.google.analytics.data.v1alpha.UserSegment(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1alpha.UserSegment result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userInclusionCriteria_ =
            userInclusionCriteriaBuilder_ == null
                ? userInclusionCriteria_
                : userInclusionCriteriaBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.exclusion_ = exclusionBuilder_ == null ? exclusion_ : exclusionBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.analytics.data.v1alpha.UserSegment) {
        return mergeFrom((com.google.analytics.data.v1alpha.UserSegment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1alpha.UserSegment other) {
      if (other == com.google.analytics.data.v1alpha.UserSegment.getDefaultInstance()) return this;
      if (other.hasUserInclusionCriteria()) {
        mergeUserInclusionCriteria(other.getUserInclusionCriteria());
      }
      if (other.hasExclusion()) {
        mergeExclusion(other.getExclusion());
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
                input.readMessage(
                    getUserInclusionCriteriaFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getExclusionFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.analytics.data.v1alpha.UserSegmentCriteria userInclusionCriteria_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.UserSegmentCriteria,
            com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder>
        userInclusionCriteriaBuilder_;
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     *
     * @return Whether the userInclusionCriteria field is set.
     */
    public boolean hasUserInclusionCriteria() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     *
     * @return The userInclusionCriteria.
     */
    public com.google.analytics.data.v1alpha.UserSegmentCriteria getUserInclusionCriteria() {
      if (userInclusionCriteriaBuilder_ == null) {
        return userInclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
            : userInclusionCriteria_;
      } else {
        return userInclusionCriteriaBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    public Builder setUserInclusionCriteria(
        com.google.analytics.data.v1alpha.UserSegmentCriteria value) {
      if (userInclusionCriteriaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userInclusionCriteria_ = value;
      } else {
        userInclusionCriteriaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    public Builder setUserInclusionCriteria(
        com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder builderForValue) {
      if (userInclusionCriteriaBuilder_ == null) {
        userInclusionCriteria_ = builderForValue.build();
      } else {
        userInclusionCriteriaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    public Builder mergeUserInclusionCriteria(
        com.google.analytics.data.v1alpha.UserSegmentCriteria value) {
      if (userInclusionCriteriaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && userInclusionCriteria_ != null
            && userInclusionCriteria_
                != com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()) {
          getUserInclusionCriteriaBuilder().mergeFrom(value);
        } else {
          userInclusionCriteria_ = value;
        }
      } else {
        userInclusionCriteriaBuilder_.mergeFrom(value);
      }
      if (userInclusionCriteria_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    public Builder clearUserInclusionCriteria() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userInclusionCriteria_ = null;
      if (userInclusionCriteriaBuilder_ != null) {
        userInclusionCriteriaBuilder_.dispose();
        userInclusionCriteriaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    public com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder
        getUserInclusionCriteriaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserInclusionCriteriaFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    public com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder
        getUserInclusionCriteriaOrBuilder() {
      if (userInclusionCriteriaBuilder_ != null) {
        return userInclusionCriteriaBuilder_.getMessageOrBuilder();
      } else {
        return userInclusionCriteria_ == null
            ? com.google.analytics.data.v1alpha.UserSegmentCriteria.getDefaultInstance()
            : userInclusionCriteria_;
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which users are included in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentCriteria user_inclusion_criteria = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.UserSegmentCriteria,
            com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder,
            com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder>
        getUserInclusionCriteriaFieldBuilder() {
      if (userInclusionCriteriaBuilder_ == null) {
        userInclusionCriteriaBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.UserSegmentCriteria,
                com.google.analytics.data.v1alpha.UserSegmentCriteria.Builder,
                com.google.analytics.data.v1alpha.UserSegmentCriteriaOrBuilder>(
                getUserInclusionCriteria(), getParentForChildren(), isClean());
        userInclusionCriteria_ = null;
      }
      return userInclusionCriteriaBuilder_;
    }

    private com.google.analytics.data.v1alpha.UserSegmentExclusion exclusion_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.UserSegmentExclusion,
            com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder,
            com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder>
        exclusionBuilder_;
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     *
     * @return Whether the exclusion field is set.
     */
    public boolean hasExclusion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     *
     * @return The exclusion.
     */
    public com.google.analytics.data.v1alpha.UserSegmentExclusion getExclusion() {
      if (exclusionBuilder_ == null) {
        return exclusion_ == null
            ? com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance()
            : exclusion_;
      } else {
        return exclusionBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    public Builder setExclusion(com.google.analytics.data.v1alpha.UserSegmentExclusion value) {
      if (exclusionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        exclusion_ = value;
      } else {
        exclusionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    public Builder setExclusion(
        com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder builderForValue) {
      if (exclusionBuilder_ == null) {
        exclusion_ = builderForValue.build();
      } else {
        exclusionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    public Builder mergeExclusion(com.google.analytics.data.v1alpha.UserSegmentExclusion value) {
      if (exclusionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && exclusion_ != null
            && exclusion_
                != com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance()) {
          getExclusionBuilder().mergeFrom(value);
        } else {
          exclusion_ = value;
        }
      } else {
        exclusionBuilder_.mergeFrom(value);
      }
      if (exclusion_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    public Builder clearExclusion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      exclusion_ = null;
      if (exclusionBuilder_ != null) {
        exclusionBuilder_.dispose();
        exclusionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    public com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder getExclusionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getExclusionFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    public com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder getExclusionOrBuilder() {
      if (exclusionBuilder_ != null) {
        return exclusionBuilder_.getMessageOrBuilder();
      } else {
        return exclusion_ == null
            ? com.google.analytics.data.v1alpha.UserSegmentExclusion.getDefaultInstance()
            : exclusion_;
      }
    }
    /**
     *
     *
     * <pre>
     * Defines which users are excluded in this segment. Optional.
     * </pre>
     *
     * <code>.google.analytics.data.v1alpha.UserSegmentExclusion exclusion = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1alpha.UserSegmentExclusion,
            com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder,
            com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder>
        getExclusionFieldBuilder() {
      if (exclusionBuilder_ == null) {
        exclusionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1alpha.UserSegmentExclusion,
                com.google.analytics.data.v1alpha.UserSegmentExclusion.Builder,
                com.google.analytics.data.v1alpha.UserSegmentExclusionOrBuilder>(
                getExclusion(), getParentForChildren(), isClean());
        exclusion_ = null;
      }
      return exclusionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1alpha.UserSegment)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1alpha.UserSegment)
  private static final com.google.analytics.data.v1alpha.UserSegment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1alpha.UserSegment();
  }

  public static com.google.analytics.data.v1alpha.UserSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserSegment> PARSER =
      new com.google.protobuf.AbstractParser<UserSegment>() {
        @java.lang.Override
        public UserSegment parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1alpha.UserSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
