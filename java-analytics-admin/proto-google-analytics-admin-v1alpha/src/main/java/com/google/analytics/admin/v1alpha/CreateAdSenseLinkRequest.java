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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.5
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message to be passed to CreateAdSenseLink method.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateAdSenseLinkRequest}
 */
public final class CreateAdSenseLinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateAdSenseLinkRequest)
    CreateAdSenseLinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAdSenseLinkRequest.newBuilder() to construct.
  private CreateAdSenseLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAdSenseLinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAdSenseLinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateAdSenseLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateAdSenseLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.class,
            com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The property for which to create an AdSense Link.
   * Format: properties/{propertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The property for which to create an AdSense Link.
   * Format: properties/{propertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADSENSE_LINK_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.AdSenseLink adsenseLink_;
  /**
   *
   *
   * <pre>
   * Required. The AdSense Link to create
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the adsenseLink field is set.
   */
  @java.lang.Override
  public boolean hasAdsenseLink() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The AdSense Link to create
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The adsenseLink.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AdSenseLink getAdsenseLink() {
    return adsenseLink_ == null
        ? com.google.analytics.admin.v1alpha.AdSenseLink.getDefaultInstance()
        : adsenseLink_;
  }
  /**
   *
   *
   * <pre>
   * Required. The AdSense Link to create
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AdSenseLinkOrBuilder getAdsenseLinkOrBuilder() {
    return adsenseLink_ == null
        ? com.google.analytics.admin.v1alpha.AdSenseLink.getDefaultInstance()
        : adsenseLink_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAdsenseLink());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAdsenseLink());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest other =
        (com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAdsenseLink() != other.hasAdsenseLink()) return false;
    if (hasAdsenseLink()) {
      if (!getAdsenseLink().equals(other.getAdsenseLink())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasAdsenseLink()) {
      hash = (37 * hash) + ADSENSE_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getAdsenseLink().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest parseFrom(
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
      com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest prototype) {
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
   * Request message to be passed to CreateAdSenseLink method.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateAdSenseLinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateAdSenseLinkRequest)
      com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateAdSenseLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateAdSenseLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.class,
              com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAdsenseLinkFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      adsenseLink_ = null;
      if (adsenseLinkBuilder_ != null) {
        adsenseLinkBuilder_.dispose();
        adsenseLinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateAdSenseLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest build() {
      com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest result =
          new com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adsenseLink_ =
            adsenseLinkBuilder_ == null ? adsenseLink_ : adsenseLinkBuilder_.build();
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
      if (other instanceof com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest other) {
      if (other == com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdsenseLink()) {
        mergeAdsenseLink(other.getAdsenseLink());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getAdsenseLinkFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The property for which to create an AdSense Link.
     * Format: properties/{propertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The property for which to create an AdSense Link.
     * Format: properties/{propertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The property for which to create an AdSense Link.
     * Format: properties/{propertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The property for which to create an AdSense Link.
     * Format: properties/{propertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The property for which to create an AdSense Link.
     * Format: properties/{propertyId}
     * Example: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.AdSenseLink adsenseLink_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AdSenseLink,
            com.google.analytics.admin.v1alpha.AdSenseLink.Builder,
            com.google.analytics.admin.v1alpha.AdSenseLinkOrBuilder>
        adsenseLinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the adsenseLink field is set.
     */
    public boolean hasAdsenseLink() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The adsenseLink.
     */
    public com.google.analytics.admin.v1alpha.AdSenseLink getAdsenseLink() {
      if (adsenseLinkBuilder_ == null) {
        return adsenseLink_ == null
            ? com.google.analytics.admin.v1alpha.AdSenseLink.getDefaultInstance()
            : adsenseLink_;
      } else {
        return adsenseLinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAdsenseLink(com.google.analytics.admin.v1alpha.AdSenseLink value) {
      if (adsenseLinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adsenseLink_ = value;
      } else {
        adsenseLinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAdsenseLink(
        com.google.analytics.admin.v1alpha.AdSenseLink.Builder builderForValue) {
      if (adsenseLinkBuilder_ == null) {
        adsenseLink_ = builderForValue.build();
      } else {
        adsenseLinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAdsenseLink(com.google.analytics.admin.v1alpha.AdSenseLink value) {
      if (adsenseLinkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && adsenseLink_ != null
            && adsenseLink_
                != com.google.analytics.admin.v1alpha.AdSenseLink.getDefaultInstance()) {
          getAdsenseLinkBuilder().mergeFrom(value);
        } else {
          adsenseLink_ = value;
        }
      } else {
        adsenseLinkBuilder_.mergeFrom(value);
      }
      if (adsenseLink_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAdsenseLink() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adsenseLink_ = null;
      if (adsenseLinkBuilder_ != null) {
        adsenseLinkBuilder_.dispose();
        adsenseLinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AdSenseLink.Builder getAdsenseLinkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdsenseLinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AdSenseLinkOrBuilder getAdsenseLinkOrBuilder() {
      if (adsenseLinkBuilder_ != null) {
        return adsenseLinkBuilder_.getMessageOrBuilder();
      } else {
        return adsenseLink_ == null
            ? com.google.analytics.admin.v1alpha.AdSenseLink.getDefaultInstance()
            : adsenseLink_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The AdSense Link to create
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AdSenseLink adsense_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AdSenseLink,
            com.google.analytics.admin.v1alpha.AdSenseLink.Builder,
            com.google.analytics.admin.v1alpha.AdSenseLinkOrBuilder>
        getAdsenseLinkFieldBuilder() {
      if (adsenseLinkBuilder_ == null) {
        adsenseLinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.AdSenseLink,
                com.google.analytics.admin.v1alpha.AdSenseLink.Builder,
                com.google.analytics.admin.v1alpha.AdSenseLinkOrBuilder>(
                getAdsenseLink(), getParentForChildren(), isClean());
        adsenseLink_ = null;
      }
      return adsenseLinkBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateAdSenseLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateAdSenseLinkRequest)
  private static final com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAdSenseLinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAdSenseLinkRequest>() {
        @java.lang.Override
        public CreateAdSenseLinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAdSenseLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAdSenseLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateAdSenseLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
