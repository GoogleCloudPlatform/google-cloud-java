// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 * <pre>
 * Request for `UpdateDevice`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.UpdateDeviceRequest}
 */
public  final class UpdateDeviceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.UpdateDeviceRequest)
    UpdateDeviceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateDeviceRequest.newBuilder() to construct.
  private UpdateDeviceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateDeviceRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateDeviceRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 18: {
            com.google.cloud.iot.v1.Device.Builder subBuilder = null;
            if (device_ != null) {
              subBuilder = device_.toBuilder();
            }
            device_ = input.readMessage(com.google.cloud.iot.v1.Device.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(device_);
              device_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
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
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.UpdateDeviceRequest.class, com.google.cloud.iot.v1.UpdateDeviceRequest.Builder.class);
  }

  public static final int DEVICE_FIELD_NUMBER = 2;
  private com.google.cloud.iot.v1.Device device_;
  /**
   * <pre>
   * The new values for the device registry. The `id` and `num_id` fields must
   * be empty, and the field `name` must specify the name path. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.Device device = 2;</code>
   */
  public boolean hasDevice() {
    return device_ != null;
  }
  /**
   * <pre>
   * The new values for the device registry. The `id` and `num_id` fields must
   * be empty, and the field `name` must specify the name path. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.Device device = 2;</code>
   */
  public com.google.cloud.iot.v1.Device getDevice() {
    return device_ == null ? com.google.cloud.iot.v1.Device.getDefaultInstance() : device_;
  }
  /**
   * <pre>
   * The new values for the device registry. The `id` and `num_id` fields must
   * be empty, and the field `name` must specify the name path. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.Device device = 2;</code>
   */
  public com.google.cloud.iot.v1.DeviceOrBuilder getDeviceOrBuilder() {
    return getDevice();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Only updates the `device` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Only updates the `device` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Only updates the `device` fields indicated by this mask.
   * The field mask must not be empty, and it must not contain fields that
   * are immutable or only set by the server.
   * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
    if (device_ != null) {
      output.writeMessage(2, getDevice());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (device_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDevice());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.iot.v1.UpdateDeviceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.UpdateDeviceRequest other = (com.google.cloud.iot.v1.UpdateDeviceRequest) obj;

    boolean result = true;
    result = result && (hasDevice() == other.hasDevice());
    if (hasDevice()) {
      result = result && getDevice()
          .equals(other.getDevice());
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
    if (hasDevice()) {
      hash = (37 * hash) + DEVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDevice().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.iot.v1.UpdateDeviceRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.iot.v1.UpdateDeviceRequest prototype) {
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
   * Request for `UpdateDevice`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.UpdateDeviceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.UpdateDeviceRequest)
      com.google.cloud.iot.v1.UpdateDeviceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.UpdateDeviceRequest.class, com.google.cloud.iot.v1.UpdateDeviceRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.UpdateDeviceRequest.newBuilder()
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
      if (deviceBuilder_ == null) {
        device_ = null;
      } else {
        device_ = null;
        deviceBuilder_ = null;
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
      return com.google.cloud.iot.v1.DeviceManagerProto.internal_static_google_cloud_iot_v1_UpdateDeviceRequest_descriptor;
    }

    public com.google.cloud.iot.v1.UpdateDeviceRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.UpdateDeviceRequest.getDefaultInstance();
    }

    public com.google.cloud.iot.v1.UpdateDeviceRequest build() {
      com.google.cloud.iot.v1.UpdateDeviceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.iot.v1.UpdateDeviceRequest buildPartial() {
      com.google.cloud.iot.v1.UpdateDeviceRequest result = new com.google.cloud.iot.v1.UpdateDeviceRequest(this);
      if (deviceBuilder_ == null) {
        result.device_ = device_;
      } else {
        result.device_ = deviceBuilder_.build();
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
      if (other instanceof com.google.cloud.iot.v1.UpdateDeviceRequest) {
        return mergeFrom((com.google.cloud.iot.v1.UpdateDeviceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.UpdateDeviceRequest other) {
      if (other == com.google.cloud.iot.v1.UpdateDeviceRequest.getDefaultInstance()) return this;
      if (other.hasDevice()) {
        mergeDevice(other.getDevice());
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
      com.google.cloud.iot.v1.UpdateDeviceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.UpdateDeviceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.iot.v1.Device device_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iot.v1.Device, com.google.cloud.iot.v1.Device.Builder, com.google.cloud.iot.v1.DeviceOrBuilder> deviceBuilder_;
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public boolean hasDevice() {
      return deviceBuilder_ != null || device_ != null;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public com.google.cloud.iot.v1.Device getDevice() {
      if (deviceBuilder_ == null) {
        return device_ == null ? com.google.cloud.iot.v1.Device.getDefaultInstance() : device_;
      } else {
        return deviceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public Builder setDevice(com.google.cloud.iot.v1.Device value) {
      if (deviceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        device_ = value;
        onChanged();
      } else {
        deviceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public Builder setDevice(
        com.google.cloud.iot.v1.Device.Builder builderForValue) {
      if (deviceBuilder_ == null) {
        device_ = builderForValue.build();
        onChanged();
      } else {
        deviceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public Builder mergeDevice(com.google.cloud.iot.v1.Device value) {
      if (deviceBuilder_ == null) {
        if (device_ != null) {
          device_ =
            com.google.cloud.iot.v1.Device.newBuilder(device_).mergeFrom(value).buildPartial();
        } else {
          device_ = value;
        }
        onChanged();
      } else {
        deviceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public Builder clearDevice() {
      if (deviceBuilder_ == null) {
        device_ = null;
        onChanged();
      } else {
        device_ = null;
        deviceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public com.google.cloud.iot.v1.Device.Builder getDeviceBuilder() {
      
      onChanged();
      return getDeviceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceOrBuilder getDeviceOrBuilder() {
      if (deviceBuilder_ != null) {
        return deviceBuilder_.getMessageOrBuilder();
      } else {
        return device_ == null ?
            com.google.cloud.iot.v1.Device.getDefaultInstance() : device_;
      }
    }
    /**
     * <pre>
     * The new values for the device registry. The `id` and `num_id` fields must
     * be empty, and the field `name` must specify the name path. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0`or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.Device device = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.iot.v1.Device, com.google.cloud.iot.v1.Device.Builder, com.google.cloud.iot.v1.DeviceOrBuilder> 
        getDeviceFieldBuilder() {
      if (deviceBuilder_ == null) {
        deviceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.Device, com.google.cloud.iot.v1.Device.Builder, com.google.cloud.iot.v1.DeviceOrBuilder>(
                getDevice(),
                getParentForChildren(),
                isClean());
        device_ = null;
      }
      return deviceBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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
     * Only updates the `device` fields indicated by this mask.
     * The field mask must not be empty, and it must not contain fields that
     * are immutable or only set by the server.
     * Mutable top-level fields: `credentials`, `blocked`, and `metadata`
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.UpdateDeviceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.UpdateDeviceRequest)
  private static final com.google.cloud.iot.v1.UpdateDeviceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.UpdateDeviceRequest();
  }

  public static com.google.cloud.iot.v1.UpdateDeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateDeviceRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateDeviceRequest>() {
    public UpdateDeviceRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateDeviceRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateDeviceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateDeviceRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.iot.v1.UpdateDeviceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

