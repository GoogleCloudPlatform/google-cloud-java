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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.analyticshub.v1;

/**
 *
 *
 * <pre>
 * Contains details of the data provider.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.DataProvider}
 */
public final class DataProvider extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.analyticshub.v1.DataProvider)
    DataProviderOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataProvider.newBuilder() to construct.
  private DataProvider(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataProvider() {
    name_ = "";
    primaryContact_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataProvider();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_DataProvider_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
        .internal_static_google_cloud_bigquery_analyticshub_v1_DataProvider_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.analyticshub.v1.DataProvider.class,
            com.google.cloud.bigquery.analyticshub.v1.DataProvider.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Name of the data provider.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Name of the data provider.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIMARY_CONTACT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object primaryContact_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Email or URL of the data provider.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The primaryContact.
   */
  @java.lang.Override
  public java.lang.String getPrimaryContact() {
    java.lang.Object ref = primaryContact_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      primaryContact_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Email or URL of the data provider.
   * Max Length: 1000 bytes.
   * </pre>
   *
   * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for primaryContact.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrimaryContactBytes() {
    java.lang.Object ref = primaryContact_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      primaryContact_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryContact_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, primaryContact_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(primaryContact_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, primaryContact_);
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
    if (!(obj instanceof com.google.cloud.bigquery.analyticshub.v1.DataProvider)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.analyticshub.v1.DataProvider other =
        (com.google.cloud.bigquery.analyticshub.v1.DataProvider) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getPrimaryContact().equals(other.getPrimaryContact())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + PRIMARY_CONTACT_FIELD_NUMBER;
    hash = (53 * hash) + getPrimaryContact().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider parseFrom(
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
      com.google.cloud.bigquery.analyticshub.v1.DataProvider prototype) {
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
   * Contains details of the data provider.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.analyticshub.v1.DataProvider}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.analyticshub.v1.DataProvider)
      com.google.cloud.bigquery.analyticshub.v1.DataProviderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_DataProvider_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_DataProvider_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.analyticshub.v1.DataProvider.class,
              com.google.cloud.bigquery.analyticshub.v1.DataProvider.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.analyticshub.v1.DataProvider.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      primaryContact_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.analyticshub.v1.AnalyticsHubProto
          .internal_static_google_cloud_bigquery_analyticshub_v1_DataProvider_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.DataProvider getDefaultInstanceForType() {
      return com.google.cloud.bigquery.analyticshub.v1.DataProvider.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.DataProvider build() {
      com.google.cloud.bigquery.analyticshub.v1.DataProvider result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.analyticshub.v1.DataProvider buildPartial() {
      com.google.cloud.bigquery.analyticshub.v1.DataProvider result =
          new com.google.cloud.bigquery.analyticshub.v1.DataProvider(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.analyticshub.v1.DataProvider result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.primaryContact_ = primaryContact_;
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
      if (other instanceof com.google.cloud.bigquery.analyticshub.v1.DataProvider) {
        return mergeFrom((com.google.cloud.bigquery.analyticshub.v1.DataProvider) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.analyticshub.v1.DataProvider other) {
      if (other == com.google.cloud.bigquery.analyticshub.v1.DataProvider.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPrimaryContact().isEmpty()) {
        primaryContact_ = other.primaryContact_;
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                primaryContact_ = input.readStringRequireUtf8();
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Name of the data provider.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Name of the data provider.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Name of the data provider.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Name of the data provider.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Name of the data provider.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object primaryContact_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Email or URL of the data provider.
     * Max Length: 1000 bytes.
     * </pre>
     *
     * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The primaryContact.
     */
    public java.lang.String getPrimaryContact() {
      java.lang.Object ref = primaryContact_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        primaryContact_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Email or URL of the data provider.
     * Max Length: 1000 bytes.
     * </pre>
     *
     * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for primaryContact.
     */
    public com.google.protobuf.ByteString getPrimaryContactBytes() {
      java.lang.Object ref = primaryContact_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        primaryContact_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Email or URL of the data provider.
     * Max Length: 1000 bytes.
     * </pre>
     *
     * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The primaryContact to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryContact(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      primaryContact_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Email or URL of the data provider.
     * Max Length: 1000 bytes.
     * </pre>
     *
     * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrimaryContact() {
      primaryContact_ = getDefaultInstance().getPrimaryContact();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Email or URL of the data provider.
     * Max Length: 1000 bytes.
     * </pre>
     *
     * <code>string primary_contact = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for primaryContact to set.
     * @return This builder for chaining.
     */
    public Builder setPrimaryContactBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      primaryContact_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.analyticshub.v1.DataProvider)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.analyticshub.v1.DataProvider)
  private static final com.google.cloud.bigquery.analyticshub.v1.DataProvider DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.analyticshub.v1.DataProvider();
  }

  public static com.google.cloud.bigquery.analyticshub.v1.DataProvider getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataProvider> PARSER =
      new com.google.protobuf.AbstractParser<DataProvider>() {
        @java.lang.Override
        public DataProvider parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataProvider> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataProvider> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.analyticshub.v1.DataProvider getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
