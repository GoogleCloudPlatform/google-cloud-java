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
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

package com.google.cloud.securitycenter.settings.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for BatchGetSettings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest}
 */
public final class BatchGetSettingsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest)
    BatchGetSettingsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchGetSettingsRequest.newBuilder() to construct.
  private BatchGetSettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchGetSettingsRequest() {
    parent_ = "";
    names_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchGetSettingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest.class,
            com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the organization shared by all of the
   * settings being retrieved.
   * Format:
   *  * `organizations/{organization}`
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
   * Required. The relative resource name of the organization shared by all of the
   * settings being retrieved.
   * Format:
   *  * `organizations/{organization}`
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

  public static final int NAMES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList names_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The names of the settings to retrieve.
   * A maximum of 1000 settings can be retrieved in a batch.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @return A list containing the names.
   */
  public com.google.protobuf.ProtocolStringList getNamesList() {
    return names_;
  }
  /**
   *
   *
   * <pre>
   * The names of the settings to retrieve.
   * A maximum of 1000 settings can be retrieved in a batch.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @return The count of names.
   */
  public int getNamesCount() {
    return names_.size();
  }
  /**
   *
   *
   * <pre>
   * The names of the settings to retrieve.
   * A maximum of 1000 settings can be retrieved in a batch.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The names at the given index.
   */
  public java.lang.String getNames(int index) {
    return names_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The names of the settings to retrieve.
   * A maximum of 1000 settings can be retrieved in a batch.
   * Formats:
   *  * `organizations/{organization}/settings`
   *  * `folders/{folder}/settings`
   *  * `projects/{project}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
   * </pre>
   *
   * <code>repeated string names = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the names at the given index.
   */
  public com.google.protobuf.ByteString getNamesBytes(int index) {
    return names_.getByteString(index);
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
    for (int i = 0; i < names_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, names_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < names_.size(); i++) {
        dataSize += computeStringSizeNoTag(names_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNamesList().size();
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
    if (!(obj
        instanceof com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest other =
        (com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getNamesList().equals(other.getNamesList())) return false;
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
    if (getNamesCount() > 0) {
      hash = (37 * hash) + NAMES_FIELD_NUMBER;
      hash = (53 * hash) + getNamesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest parseFrom(
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
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest prototype) {
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
   * Request message for BatchGetSettings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest)
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest.class,
              com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      names_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest build() {
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest buildPartial() {
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest result =
          new com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        names_.makeImmutable();
        result.names_ = names_;
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
      if (other
          instanceof com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest) {
        return mergeFrom(
            (com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest other) {
      if (other
          == com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.names_.isEmpty()) {
        if (names_.isEmpty()) {
          names_ = other.names_;
          bitField0_ |= 0x00000002;
        } else {
          ensureNamesIsMutable();
          names_.addAll(other.names_);
        }
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureNamesIsMutable();
                names_.add(s);
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
     * Required. The relative resource name of the organization shared by all of the
     * settings being retrieved.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The relative resource name of the organization shared by all of the
     * settings being retrieved.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The relative resource name of the organization shared by all of the
     * settings being retrieved.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The relative resource name of the organization shared by all of the
     * settings being retrieved.
     * Format:
     *  * `organizations/{organization}`
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
     * Required. The relative resource name of the organization shared by all of the
     * settings being retrieved.
     * Format:
     *  * `organizations/{organization}`
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

    private com.google.protobuf.LazyStringArrayList names_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureNamesIsMutable() {
      if (!names_.isModifiable()) {
        names_ = new com.google.protobuf.LazyStringArrayList(names_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @return A list containing the names.
     */
    public com.google.protobuf.ProtocolStringList getNamesList() {
      names_.makeImmutable();
      return names_;
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @return The count of names.
     */
    public int getNamesCount() {
      return names_.size();
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The names at the given index.
     */
    public java.lang.String getNames(int index) {
      return names_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the names at the given index.
     */
    public com.google.protobuf.ByteString getNamesBytes(int index) {
      return names_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The names to set.
     * @return This builder for chaining.
     */
    public Builder setNames(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param value The names to add.
     * @return This builder for chaining.
     */
    public Builder addNames(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureNamesIsMutable();
      names_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param values The names to add.
     * @return This builder for chaining.
     */
    public Builder addAllNames(java.lang.Iterable<java.lang.String> values) {
      ensureNamesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, names_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNames() {
      names_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The names of the settings to retrieve.
     * A maximum of 1000 settings can be retrieved in a batch.
     * Formats:
     *  * `organizations/{organization}/settings`
     *  * `folders/{folder}/settings`
     *  * `projects/{project}/settings`
     *  * `projects/{project}/locations/{location}/clusters/{cluster}/settings`
     *  * `projects/{project}/regions/{region}/clusters/{cluster}/settings`
     *  * `projects/{project}/zones/{zone}/clusters/{cluster}/settings`
     * </pre>
     *
     * <code>repeated string names = 2;</code>
     *
     * @param value The bytes of the names to add.
     * @return This builder for chaining.
     */
    public Builder addNamesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureNamesIsMutable();
      names_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest)
  private static final com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest();
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchGetSettingsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchGetSettingsRequest>() {
        @java.lang.Override
        public BatchGetSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchGetSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchGetSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
