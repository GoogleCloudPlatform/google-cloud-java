/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * The configuration of MQTT for a device registry.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.MqttConfig}
 */
public final class MqttConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.MqttConfig)
    MqttConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MqttConfig.newBuilder() to construct.
  private MqttConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MqttConfig() {
    mqttEnabledState_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MqttConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_MqttConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.MqttConfig.class,
            com.google.cloud.iot.v1.MqttConfig.Builder.class);
  }

  public static final int MQTT_ENABLED_STATE_FIELD_NUMBER = 1;
  private int mqttEnabledState_ = 0;
  /**
   *
   *
   * <pre>
   * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
   * connections to this registry will fail.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
   *
   * @return The enum numeric value on the wire for mqttEnabledState.
   */
  @java.lang.Override
  public int getMqttEnabledStateValue() {
    return mqttEnabledState_;
  }
  /**
   *
   *
   * <pre>
   * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
   * connections to this registry will fail.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
   *
   * @return The mqttEnabledState.
   */
  @java.lang.Override
  public com.google.cloud.iot.v1.MqttState getMqttEnabledState() {
    com.google.cloud.iot.v1.MqttState result =
        com.google.cloud.iot.v1.MqttState.forNumber(mqttEnabledState_);
    return result == null ? com.google.cloud.iot.v1.MqttState.UNRECOGNIZED : result;
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
    if (mqttEnabledState_ != com.google.cloud.iot.v1.MqttState.MQTT_STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, mqttEnabledState_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mqttEnabledState_ != com.google.cloud.iot.v1.MqttState.MQTT_STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, mqttEnabledState_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.MqttConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.MqttConfig other = (com.google.cloud.iot.v1.MqttConfig) obj;

    if (mqttEnabledState_ != other.mqttEnabledState_) return false;
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
    hash = (37 * hash) + MQTT_ENABLED_STATE_FIELD_NUMBER;
    hash = (53 * hash) + mqttEnabledState_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.MqttConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.iot.v1.MqttConfig prototype) {
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
   * The configuration of MQTT for a device registry.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.MqttConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.MqttConfig)
      com.google.cloud.iot.v1.MqttConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_MqttConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_MqttConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.MqttConfig.class,
              com.google.cloud.iot.v1.MqttConfig.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.MqttConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      mqttEnabledState_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_MqttConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.MqttConfig getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.MqttConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.MqttConfig build() {
      com.google.cloud.iot.v1.MqttConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.MqttConfig buildPartial() {
      com.google.cloud.iot.v1.MqttConfig result = new com.google.cloud.iot.v1.MqttConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.iot.v1.MqttConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mqttEnabledState_ = mqttEnabledState_;
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
      if (other instanceof com.google.cloud.iot.v1.MqttConfig) {
        return mergeFrom((com.google.cloud.iot.v1.MqttConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.MqttConfig other) {
      if (other == com.google.cloud.iot.v1.MqttConfig.getDefaultInstance()) return this;
      if (other.mqttEnabledState_ != 0) {
        setMqttEnabledStateValue(other.getMqttEnabledStateValue());
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
            case 8:
              {
                mqttEnabledState_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int mqttEnabledState_ = 0;
    /**
     *
     *
     * <pre>
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
     * connections to this registry will fail.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
     *
     * @return The enum numeric value on the wire for mqttEnabledState.
     */
    @java.lang.Override
    public int getMqttEnabledStateValue() {
      return mqttEnabledState_;
    }
    /**
     *
     *
     * <pre>
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
     * connections to this registry will fail.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
     *
     * @param value The enum numeric value on the wire for mqttEnabledState to set.
     * @return This builder for chaining.
     */
    public Builder setMqttEnabledStateValue(int value) {
      mqttEnabledState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
     * connections to this registry will fail.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
     *
     * @return The mqttEnabledState.
     */
    @java.lang.Override
    public com.google.cloud.iot.v1.MqttState getMqttEnabledState() {
      com.google.cloud.iot.v1.MqttState result =
          com.google.cloud.iot.v1.MqttState.forNumber(mqttEnabledState_);
      return result == null ? com.google.cloud.iot.v1.MqttState.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
     * connections to this registry will fail.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
     *
     * @param value The mqttEnabledState to set.
     * @return This builder for chaining.
     */
    public Builder setMqttEnabledState(com.google.cloud.iot.v1.MqttState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      mqttEnabledState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If enabled, allows connections using the MQTT protocol. Otherwise, MQTT
     * connections to this registry will fail.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.MqttState mqtt_enabled_state = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMqttEnabledState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mqttEnabledState_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.MqttConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.MqttConfig)
  private static final com.google.cloud.iot.v1.MqttConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.MqttConfig();
  }

  public static com.google.cloud.iot.v1.MqttConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MqttConfig> PARSER =
      new com.google.protobuf.AbstractParser<MqttConfig>() {
        @java.lang.Override
        public MqttConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<MqttConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MqttConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.MqttConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
