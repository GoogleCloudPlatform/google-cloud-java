// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Request for `UpdateDeviceRegistry`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.UpdateDeviceRegistryRequest}
 */
public  final class UpdateDeviceRegistryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.UpdateDeviceRegistryRequest)
    UpdateDeviceRegistryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDeviceRegistryRequest.newBuilder() to construct.
  private UpdateDeviceRegistryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDeviceRegistryRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateDeviceRegistryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.cloud.iot.v1.DeviceRegistry.Builder subBuilder = null;
            if (deviceRegistry_ != null) {
              subBuilder = deviceRegistry_.toBuilder();
            }
            deviceRegistry_ = input.readMessage(com.google.cloud.iot.v1.DeviceRegistry.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(deviceRegistry_);
              deviceRegistry_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRegistryRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRegistryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.class, com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.Builder.class);
  }

  public static final int DEVICE_REGISTRY_FIELD_NUMBER = 1;
  private com.google.cloud.iot.v1.DeviceRegistry deviceRegistry_;
  /**
   * <pre>
   * The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
   */
  public boolean hasDeviceRegistry() {
    return deviceRegistry_ != null;
  }
  /**
   * <pre>
   * The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
   */
  public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry() {
    return deviceRegistry_ == null ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance() : deviceRegistry_;
  }
  /**
   * <pre>
   * The new values for the device registry. The `id` field must be empty, and
   * the `name` field must indicate the path of the resource. For example,
   * `projects/example-project/locations/us-central1/registries/my-registry`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
   */
  public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder() {
    return getDeviceRegistry();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Only updates the `device_registry` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `event_notification_config`, `http_config`,
   * `mqtt_config`, and `state_notification_config`.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (deviceRegistry_ != null) {
      output.writeMessage(1, getDeviceRegistry());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deviceRegistry_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDeviceRegistry());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.cloud.iot.v1.UpdateDeviceRegistryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.UpdateDeviceRegistryRequest other = (com.google.cloud.iot.v1.UpdateDeviceRegistryRequest) obj;

    boolean result = true;
    result = result && (hasDeviceRegistry() == other.hasDeviceRegistry());
    if (hasDeviceRegistry()) {
      result = result && getDeviceRegistry()
          .equals(other.getDeviceRegistry());
    }
    result = result && (hasUpdateMask() == other.hasUpdateMask());
    if (hasUpdateMask()) {
      result = result && getUpdateMask()
          .equals(other.getUpdateMask());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDeviceRegistry()) {
      hash = (37 * hash) + DEVICE_REGISTRY_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceRegistry().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.iot.v1.UpdateDeviceRegistryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request for `UpdateDeviceRegistry`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.UpdateDeviceRegistryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.UpdateDeviceRegistryRequest)
      com.google.cloud.iot.v1.UpdateDeviceRegistryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRegistryRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRegistryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.class, com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = null;
      } else {
        deviceRegistry_ = null;
        deviceRegistryBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRegistryRequest_descriptor;
    }

    public com.google.cloud.iot.v1.UpdateDeviceRegistryRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.getDefaultInstance();
    }

    public com.google.cloud.iot.v1.UpdateDeviceRegistryRequest build() {
      com.google.cloud.iot.v1.UpdateDeviceRegistryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.iot.v1.UpdateDeviceRegistryRequest buildPartial() {
      com.google.cloud.iot.v1.UpdateDeviceRegistryRequest result = new com.google.cloud.iot.v1.UpdateDeviceRegistryRequest(this);
      if (deviceRegistryBuilder_ == null) {
        result.deviceRegistry_ = deviceRegistry_;
      } else {
        result.deviceRegistry_ = deviceRegistryBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.UpdateDeviceRegistryRequest) {
        return mergeFrom((com.google.cloud.iot.v1.UpdateDeviceRegistryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.UpdateDeviceRegistryRequest other) {
      if (other == com.google.cloud.iot.v1.UpdateDeviceRegistryRequest.getDefaultInstance()) return this;
      if (other.hasDeviceRegistry()) {
        mergeDeviceRegistry(other.getDeviceRegistry());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.iot.v1.UpdateDeviceRegistryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.UpdateDeviceRegistryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.iot.v1.DeviceRegistry deviceRegistry_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iot.v1.DeviceRegistry, com.google.cloud.iot.v1.DeviceRegistry.Builder, com.google.cloud.iot.v1.DeviceRegistryOrBuilder> deviceRegistryBuilder_;
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public boolean hasDeviceRegistry() {
      return deviceRegistryBuilder_ != null || deviceRegistry_ != null;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry() {
      if (deviceRegistryBuilder_ == null) {
        return deviceRegistry_ == null ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance() : deviceRegistry_;
      } else {
        return deviceRegistryBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public Builder setDeviceRegistry(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deviceRegistry_ = value;
        onChanged();
      } else {
        deviceRegistryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public Builder setDeviceRegistry(
        com.google.cloud.iot.v1.DeviceRegistry.Builder builderForValue) {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = builderForValue.build();
        onChanged();
      } else {
        deviceRegistryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public Builder mergeDeviceRegistry(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistryBuilder_ == null) {
        if (deviceRegistry_ != null) {
          deviceRegistry_ =
            com.google.cloud.iot.v1.DeviceRegistry.newBuilder(deviceRegistry_).mergeFrom(value).buildPartial();
        } else {
          deviceRegistry_ = value;
        }
        onChanged();
      } else {
        deviceRegistryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public Builder clearDeviceRegistry() {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = null;
        onChanged();
      } else {
        deviceRegistry_ = null;
        deviceRegistryBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry.Builder getDeviceRegistryBuilder() {
      
      onChanged();
      return getDeviceRegistryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder() {
      if (deviceRegistryBuilder_ != null) {
        return deviceRegistryBuilder_.getMessageOrBuilder();
      } else {
        return deviceRegistry_ == null ?
            com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance() : deviceRegistry_;
      }
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` field must be empty, and
     * the `name` field must indicate the path of the resource. For example,
     * `projects/example-project/locations/us-central1/registries/my-registry`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iot.v1.DeviceRegistry, com.google.cloud.iot.v1.DeviceRegistry.Builder, com.google.cloud.iot.v1.DeviceRegistryOrBuilder> 
        getDeviceRegistryFieldBuilder() {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceRegistry, com.google.cloud.iot.v1.DeviceRegistry.Builder, com.google.cloud.iot.v1.DeviceRegistryOrBuilder>(
                getDeviceRegistry(),
                getParentForChildren(),
                isClean());
        deviceRegistry_ = null;
      }
      return deviceRegistryBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Only updates the `device_registry` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `event_notification_config`, `http_config`,
     * `mqtt_config`, and `state_notification_config`.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.UpdateDeviceRegistryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.UpdateDeviceRegistryRequest)
  private static final com.google.cloud.iot.v1.UpdateDeviceRegistryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.UpdateDeviceRegistryRequest();
  }

  public static com.google.cloud.iot.v1.UpdateDeviceRegistryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDeviceRegistryRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDeviceRegistryRequest>() {
    public UpdateDeviceRegistryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new UpdateDeviceRegistryRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateDeviceRegistryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDeviceRegistryRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.iot.v1.UpdateDeviceRegistryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

