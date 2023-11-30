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
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Request message for creating a source.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.CreateSourceRequest}
 */
public final class CreateSourceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.CreateSourceRequest)
    CreateSourceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSourceRequest.newBuilder() to construct.
  private CreateSourceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSourceRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSourceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_CreateSourceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.SecuritycenterService
        .internal_static_google_cloud_securitycenter_v1_CreateSourceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.CreateSourceRequest.class,
            com.google.cloud.securitycenter.v1.CreateSourceRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
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
   * Required. Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
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

  public static final int SOURCE_FIELD_NUMBER = 2;
  private com.google.cloud.securitycenter.v1.Source source_;
  /**
   *
   *
   * <pre>
   * Required. The Source being created, only the display_name and description
   * will be used. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the source field is set.
   */
  @java.lang.Override
  public boolean hasSource() {
    return source_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The Source being created, only the display_name and description
   * will be used. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The source.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.Source getSource() {
    return source_ == null
        ? com.google.cloud.securitycenter.v1.Source.getDefaultInstance()
        : source_;
  }
  /**
   *
   *
   * <pre>
   * Required. The Source being created, only the display_name and description
   * will be used. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder() {
    return source_ == null
        ? com.google.cloud.securitycenter.v1.Source.getDefaultInstance()
        : source_;
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
    if (source_ != null) {
      output.writeMessage(2, getSource());
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
    if (source_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSource());
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.CreateSourceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.CreateSourceRequest other =
        (com.google.cloud.securitycenter.v1.CreateSourceRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSource() != other.hasSource()) return false;
    if (hasSource()) {
      if (!getSource().equals(other.getSource())) return false;
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
    if (hasSource()) {
      hash = (37 * hash) + SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + getSource().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest parseFrom(
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
      com.google.cloud.securitycenter.v1.CreateSourceRequest prototype) {
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
   * Request message for creating a source.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.CreateSourceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.CreateSourceRequest)
      com.google.cloud.securitycenter.v1.CreateSourceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateSourceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateSourceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.CreateSourceRequest.class,
              com.google.cloud.securitycenter.v1.CreateSourceRequest.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.CreateSourceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      source_ = null;
      if (sourceBuilder_ != null) {
        sourceBuilder_.dispose();
        sourceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.SecuritycenterService
          .internal_static_google_cloud_securitycenter_v1_CreateSourceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateSourceRequest getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.CreateSourceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateSourceRequest build() {
      com.google.cloud.securitycenter.v1.CreateSourceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.CreateSourceRequest buildPartial() {
      com.google.cloud.securitycenter.v1.CreateSourceRequest result =
          new com.google.cloud.securitycenter.v1.CreateSourceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.CreateSourceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.source_ = sourceBuilder_ == null ? source_ : sourceBuilder_.build();
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
      if (other instanceof com.google.cloud.securitycenter.v1.CreateSourceRequest) {
        return mergeFrom((com.google.cloud.securitycenter.v1.CreateSourceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.CreateSourceRequest other) {
      if (other == com.google.cloud.securitycenter.v1.CreateSourceRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSource()) {
        mergeSource(other.getSource());
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
                input.readMessage(getSourceFieldBuilder().getBuilder(), extensionRegistry);
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
     * Required. Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
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
     * Required. Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
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
     * Required. Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
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
     * Required. Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
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
     * Required. Resource name of the new source's parent. Its format should be
     * "organizations/[organization_id]".
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

    private com.google.cloud.securitycenter.v1.Source source_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.Source,
            com.google.cloud.securitycenter.v1.Source.Builder,
            com.google.cloud.securitycenter.v1.SourceOrBuilder>
        sourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the source field is set.
     */
    public boolean hasSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The source.
     */
    public com.google.cloud.securitycenter.v1.Source getSource() {
      if (sourceBuilder_ == null) {
        return source_ == null
            ? com.google.cloud.securitycenter.v1.Source.getDefaultInstance()
            : source_;
      } else {
        return sourceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSource(com.google.cloud.securitycenter.v1.Source value) {
      if (sourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
      } else {
        sourceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSource(com.google.cloud.securitycenter.v1.Source.Builder builderForValue) {
      if (sourceBuilder_ == null) {
        source_ = builderForValue.build();
      } else {
        sourceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSource(com.google.cloud.securitycenter.v1.Source value) {
      if (sourceBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && source_ != null
            && source_ != com.google.cloud.securitycenter.v1.Source.getDefaultInstance()) {
          getSourceBuilder().mergeFrom(value);
        } else {
          source_ = value;
        }
      } else {
        sourceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      source_ = null;
      if (sourceBuilder_ != null) {
        sourceBuilder_.dispose();
        sourceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.Source.Builder getSourceBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder() {
      if (sourceBuilder_ != null) {
        return sourceBuilder_.getMessageOrBuilder();
      } else {
        return source_ == null
            ? com.google.cloud.securitycenter.v1.Source.getDefaultInstance()
            : source_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The Source being created, only the display_name and description
     * will be used. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.securitycenter.v1.Source,
            com.google.cloud.securitycenter.v1.Source.Builder,
            com.google.cloud.securitycenter.v1.SourceOrBuilder>
        getSourceFieldBuilder() {
      if (sourceBuilder_ == null) {
        sourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.securitycenter.v1.Source,
                com.google.cloud.securitycenter.v1.Source.Builder,
                com.google.cloud.securitycenter.v1.SourceOrBuilder>(
                getSource(), getParentForChildren(), isClean());
        source_ = null;
      }
      return sourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.CreateSourceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.CreateSourceRequest)
  private static final com.google.cloud.securitycenter.v1.CreateSourceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.CreateSourceRequest();
  }

  public static com.google.cloud.securitycenter.v1.CreateSourceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSourceRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSourceRequest>() {
        @java.lang.Override
        public CreateSourceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateSourceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSourceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.CreateSourceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
