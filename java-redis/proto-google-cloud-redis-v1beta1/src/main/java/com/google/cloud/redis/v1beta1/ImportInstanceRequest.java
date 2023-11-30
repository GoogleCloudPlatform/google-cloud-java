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
// source: google/cloud/redis/v1beta1/cloud_redis.proto

package com.google.cloud.redis.v1beta1;

/**
 *
 *
 * <pre>
 * Request for [Import][google.cloud.redis.v1beta1.CloudRedis.ImportInstance].
 * </pre>
 *
 * Protobuf type {@code google.cloud.redis.v1beta1.ImportInstanceRequest}
 */
public final class ImportInstanceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.redis.v1beta1.ImportInstanceRequest)
    ImportInstanceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportInstanceRequest.newBuilder() to construct.
  private ImportInstanceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportInstanceRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportInstanceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
        .internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
        .internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.redis.v1beta1.ImportInstanceRequest.class,
            com.google.cloud.redis.v1beta1.ImportInstanceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. Redis instance resource name using the form:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
   * where `location_id` refers to a GCP region.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int INPUT_CONFIG_FIELD_NUMBER = 3;
  private com.google.cloud.redis.v1beta1.InputConfig inputConfig_;
  /**
   *
   *
   * <pre>
   * Required. Specify data to be imported.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return inputConfig_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. Specify data to be imported.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.redis.v1beta1.InputConfig getInputConfig() {
    return inputConfig_ == null
        ? com.google.cloud.redis.v1beta1.InputConfig.getDefaultInstance()
        : inputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. Specify data to be imported.
   * </pre>
   *
   * <code>
   * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.redis.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
    return inputConfig_ == null
        ? com.google.cloud.redis.v1beta1.InputConfig.getDefaultInstance()
        : inputConfig_;
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
    if (inputConfig_ != null) {
      output.writeMessage(3, getInputConfig());
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
    if (inputConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getInputConfig());
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
    if (!(obj instanceof com.google.cloud.redis.v1beta1.ImportInstanceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.redis.v1beta1.ImportInstanceRequest other =
        (com.google.cloud.redis.v1beta1.ImportInstanceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig().equals(other.getInputConfig())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.redis.v1beta1.ImportInstanceRequest prototype) {
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
   * Request for [Import][google.cloud.redis.v1beta1.CloudRedis.ImportInstance].
   * </pre>
   *
   * Protobuf type {@code google.cloud.redis.v1beta1.ImportInstanceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.redis.v1beta1.ImportInstanceRequest)
      com.google.cloud.redis.v1beta1.ImportInstanceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.redis.v1beta1.ImportInstanceRequest.class,
              com.google.cloud.redis.v1beta1.ImportInstanceRequest.Builder.class);
    }

    // Construct using com.google.cloud.redis.v1beta1.ImportInstanceRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.redis.v1beta1.CloudRedisServiceBetaProto
          .internal_static_google_cloud_redis_v1beta1_ImportInstanceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.ImportInstanceRequest getDefaultInstanceForType() {
      return com.google.cloud.redis.v1beta1.ImportInstanceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.ImportInstanceRequest build() {
      com.google.cloud.redis.v1beta1.ImportInstanceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.redis.v1beta1.ImportInstanceRequest buildPartial() {
      com.google.cloud.redis.v1beta1.ImportInstanceRequest result =
          new com.google.cloud.redis.v1beta1.ImportInstanceRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.redis.v1beta1.ImportInstanceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inputConfig_ =
            inputConfigBuilder_ == null ? inputConfig_ : inputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.redis.v1beta1.ImportInstanceRequest) {
        return mergeFrom((com.google.cloud.redis.v1beta1.ImportInstanceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.redis.v1beta1.ImportInstanceRequest other) {
      if (other == com.google.cloud.redis.v1beta1.ImportInstanceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
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
            case 26:
              {
                input.readMessage(getInputConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Redis instance resource name using the form:
     *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}`
     * where `location_id` refers to a GCP region.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.cloud.redis.v1beta1.InputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1beta1.InputConfig,
            com.google.cloud.redis.v1beta1.InputConfig.Builder,
            com.google.cloud.redis.v1beta1.InputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The inputConfig.
     */
    public com.google.cloud.redis.v1beta1.InputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null
            ? com.google.cloud.redis.v1beta1.InputConfig.getDefaultInstance()
            : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInputConfig(com.google.cloud.redis.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
      } else {
        inputConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInputConfig(
        com.google.cloud.redis.v1beta1.InputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeInputConfig(com.google.cloud.redis.v1beta1.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && inputConfig_ != null
            && inputConfig_ != com.google.cloud.redis.v1beta1.InputConfig.getDefaultInstance()) {
          getInputConfigBuilder().mergeFrom(value);
        } else {
          inputConfig_ = value;
        }
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearInputConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.redis.v1beta1.InputConfig.Builder getInputConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.redis.v1beta1.InputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null
            ? com.google.cloud.redis.v1beta1.InputConfig.getDefaultInstance()
            : inputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Specify data to be imported.
     * </pre>
     *
     * <code>
     * .google.cloud.redis.v1beta1.InputConfig input_config = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.redis.v1beta1.InputConfig,
            com.google.cloud.redis.v1beta1.InputConfig.Builder,
            com.google.cloud.redis.v1beta1.InputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.redis.v1beta1.InputConfig,
                com.google.cloud.redis.v1beta1.InputConfig.Builder,
                com.google.cloud.redis.v1beta1.InputConfigOrBuilder>(
                getInputConfig(), getParentForChildren(), isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.redis.v1beta1.ImportInstanceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.redis.v1beta1.ImportInstanceRequest)
  private static final com.google.cloud.redis.v1beta1.ImportInstanceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.redis.v1beta1.ImportInstanceRequest();
  }

  public static com.google.cloud.redis.v1beta1.ImportInstanceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportInstanceRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportInstanceRequest>() {
        @java.lang.Override
        public ImportInstanceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportInstanceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportInstanceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.redis.v1beta1.ImportInstanceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
