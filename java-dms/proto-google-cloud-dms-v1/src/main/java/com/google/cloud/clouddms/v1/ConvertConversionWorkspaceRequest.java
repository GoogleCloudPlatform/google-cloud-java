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
// source: google/cloud/clouddms/v1/clouddms.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Request message for 'ConvertConversionWorkspace' request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest}
 */
public final class ConvertConversionWorkspaceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest)
    ConvertConversionWorkspaceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ConvertConversionWorkspaceRequest.newBuilder() to construct.
  private ConvertConversionWorkspaceRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ConvertConversionWorkspaceRequest() {
    name_ = "";
    filter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ConvertConversionWorkspaceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_ConvertConversionWorkspaceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsProto
        .internal_static_google_cloud_clouddms_v1_ConvertConversionWorkspaceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.class,
            com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Name of the conversion workspace resource to convert in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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
   * Name of the conversion workspace resource to convert in the form of:
   * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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

  public static final int AUTO_COMMIT_FIELD_NUMBER = 4;
  private boolean autoCommit_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Specifies whether the conversion workspace is to be committed
   * automatically after the conversion.
   * </pre>
   *
   * <code>bool auto_commit = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The autoCommit.
   */
  @java.lang.Override
  public boolean getAutoCommit() {
    return autoCommit_;
  }

  public static final int FILTER_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   *
   *
   * <pre>
   * Optional. Filter the entities to convert. Leaving this field empty will
   * convert all of the entities. Supports Google AIP-160 style filtering.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. Filter the entities to convert. Leaving this field empty will
   * convert all of the entities. Supports Google AIP-160 style filtering.
   * </pre>
   *
   * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONVERT_FULL_PATH_FIELD_NUMBER = 6;
  private boolean convertFullPath_ = false;
  /**
   *
   *
   * <pre>
   * Optional. Automatically convert the full entity path for each entity
   * specified by the filter. For example, if the filter specifies a table, that
   * table schema (and database if there is one) will also be converted.
   * </pre>
   *
   * <code>bool convert_full_path = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The convertFullPath.
   */
  @java.lang.Override
  public boolean getConvertFullPath() {
    return convertFullPath_;
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
    if (autoCommit_ != false) {
      output.writeBool(4, autoCommit_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, filter_);
    }
    if (convertFullPath_ != false) {
      output.writeBool(6, convertFullPath_);
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
    if (autoCommit_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, autoCommit_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, filter_);
    }
    if (convertFullPath_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(6, convertFullPath_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest other =
        (com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (getAutoCommit() != other.getAutoCommit()) return false;
    if (!getFilter().equals(other.getFilter())) return false;
    if (getConvertFullPath() != other.getConvertFullPath()) return false;
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
    hash = (37 * hash) + AUTO_COMMIT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAutoCommit());
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + CONVERT_FULL_PATH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getConvertFullPath());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest parseFrom(
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
      com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest prototype) {
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
   * Request message for 'ConvertConversionWorkspace' request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest)
      com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_ConvertConversionWorkspaceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_ConvertConversionWorkspaceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.class,
              com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      autoCommit_ = false;
      filter_ = "";
      convertFullPath_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsProto
          .internal_static_google_cloud_clouddms_v1_ConvertConversionWorkspaceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest
        getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest build() {
      com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest buildPartial() {
      com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest result =
          new com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.autoCommit_ = autoCommit_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.filter_ = filter_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.convertFullPath_ = convertFullPath_;
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
      if (other instanceof com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest) {
        return mergeFrom((com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest other) {
      if (other
          == com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getAutoCommit() != false) {
        setAutoCommit(other.getAutoCommit());
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getConvertFullPath() != false) {
        setConvertFullPath(other.getConvertFullPath());
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
            case 32:
              {
                autoCommit_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
            case 42:
              {
                filter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 42
            case 48:
              {
                convertFullPath_ = input.readBool();
                bitField0_ |= 0x00000008;
                break;
              } // case 48
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
     * Name of the conversion workspace resource to convert in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Name of the conversion workspace resource to convert in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Name of the conversion workspace resource to convert in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Name of the conversion workspace resource to convert in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Name of the conversion workspace resource to convert in the form of:
     * projects/{project}/locations/{location}/conversionWorkspaces/{conversion_workspace}.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
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

    private boolean autoCommit_;
    /**
     *
     *
     * <pre>
     * Optional. Specifies whether the conversion workspace is to be committed
     * automatically after the conversion.
     * </pre>
     *
     * <code>bool auto_commit = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The autoCommit.
     */
    @java.lang.Override
    public boolean getAutoCommit() {
      return autoCommit_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies whether the conversion workspace is to be committed
     * automatically after the conversion.
     * </pre>
     *
     * <code>bool auto_commit = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The autoCommit to set.
     * @return This builder for chaining.
     */
    public Builder setAutoCommit(boolean value) {

      autoCommit_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Specifies whether the conversion workspace is to be committed
     * automatically after the conversion.
     * </pre>
     *
     * <code>bool auto_commit = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAutoCommit() {
      bitField0_ = (bitField0_ & ~0x00000002);
      autoCommit_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * Optional. Filter the entities to convert. Leaving this field empty will
     * convert all of the entities. Supports Google AIP-160 style filtering.
     * </pre>
     *
     * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Filter the entities to convert. Leaving this field empty will
     * convert all of the entities. Supports Google AIP-160 style filtering.
     * </pre>
     *
     * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. Filter the entities to convert. Leaving this field empty will
     * convert all of the entities. Supports Google AIP-160 style filtering.
     * </pre>
     *
     * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Filter the entities to convert. Leaving this field empty will
     * convert all of the entities. Supports Google AIP-160 style filtering.
     * </pre>
     *
     * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Filter the entities to convert. Leaving this field empty will
     * convert all of the entities. Supports Google AIP-160 style filtering.
     * </pre>
     *
     * <code>string filter = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean convertFullPath_;
    /**
     *
     *
     * <pre>
     * Optional. Automatically convert the full entity path for each entity
     * specified by the filter. For example, if the filter specifies a table, that
     * table schema (and database if there is one) will also be converted.
     * </pre>
     *
     * <code>bool convert_full_path = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The convertFullPath.
     */
    @java.lang.Override
    public boolean getConvertFullPath() {
      return convertFullPath_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Automatically convert the full entity path for each entity
     * specified by the filter. For example, if the filter specifies a table, that
     * table schema (and database if there is one) will also be converted.
     * </pre>
     *
     * <code>bool convert_full_path = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The convertFullPath to set.
     * @return This builder for chaining.
     */
    public Builder setConvertFullPath(boolean value) {

      convertFullPath_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Automatically convert the full entity path for each entity
     * specified by the filter. For example, if the filter specifies a table, that
     * table schema (and database if there is one) will also be converted.
     * </pre>
     *
     * <code>bool convert_full_path = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearConvertFullPath() {
      bitField0_ = (bitField0_ & ~0x00000008);
      convertFullPath_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest)
  private static final com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest();
  }

  public static com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConvertConversionWorkspaceRequest> PARSER =
      new com.google.protobuf.AbstractParser<ConvertConversionWorkspaceRequest>() {
        @java.lang.Override
        public ConvertConversionWorkspaceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConvertConversionWorkspaceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConvertConversionWorkspaceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.ConvertConversionWorkspaceRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
