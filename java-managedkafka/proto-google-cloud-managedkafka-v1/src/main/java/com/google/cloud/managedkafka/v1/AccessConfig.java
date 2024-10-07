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
// source: google/cloud/managedkafka/v1/resources.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.managedkafka.v1;

/**
 *
 *
 * <pre>
 * The configuration of access to the Kafka cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedkafka.v1.AccessConfig}
 */
public final class AccessConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedkafka.v1.AccessConfig)
    AccessConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccessConfig.newBuilder() to construct.
  private AccessConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccessConfig() {
    networkConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccessConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.managedkafka.v1.ResourcesProto
        .internal_static_google_cloud_managedkafka_v1_AccessConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedkafka.v1.ResourcesProto
        .internal_static_google_cloud_managedkafka_v1_AccessConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedkafka.v1.AccessConfig.class,
            com.google.cloud.managedkafka.v1.AccessConfig.Builder.class);
  }

  public static final int NETWORK_CONFIGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.managedkafka.v1.NetworkConfig> networkConfigs_;
  /**
   *
   *
   * <pre>
   * Required. Virtual Private Cloud (VPC) networks that must be granted direct
   * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
   * networks can be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.managedkafka.v1.NetworkConfig> getNetworkConfigsList() {
    return networkConfigs_;
  }
  /**
   *
   *
   * <pre>
   * Required. Virtual Private Cloud (VPC) networks that must be granted direct
   * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
   * networks can be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder>
      getNetworkConfigsOrBuilderList() {
    return networkConfigs_;
  }
  /**
   *
   *
   * <pre>
   * Required. Virtual Private Cloud (VPC) networks that must be granted direct
   * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
   * networks can be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public int getNetworkConfigsCount() {
    return networkConfigs_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Virtual Private Cloud (VPC) networks that must be granted direct
   * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
   * networks can be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.managedkafka.v1.NetworkConfig getNetworkConfigs(int index) {
    return networkConfigs_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Virtual Private Cloud (VPC) networks that must be granted direct
   * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
   * networks can be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder getNetworkConfigsOrBuilder(
      int index) {
    return networkConfigs_.get(index);
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
    for (int i = 0; i < networkConfigs_.size(); i++) {
      output.writeMessage(1, networkConfigs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < networkConfigs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, networkConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.managedkafka.v1.AccessConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.managedkafka.v1.AccessConfig other =
        (com.google.cloud.managedkafka.v1.AccessConfig) obj;

    if (!getNetworkConfigsList().equals(other.getNetworkConfigsList())) return false;
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
    if (getNetworkConfigsCount() > 0) {
      hash = (37 * hash) + NETWORK_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getNetworkConfigsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.managedkafka.v1.AccessConfig prototype) {
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
   * The configuration of access to the Kafka cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedkafka.v1.AccessConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedkafka.v1.AccessConfig)
      com.google.cloud.managedkafka.v1.AccessConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.managedkafka.v1.ResourcesProto
          .internal_static_google_cloud_managedkafka_v1_AccessConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedkafka.v1.ResourcesProto
          .internal_static_google_cloud_managedkafka_v1_AccessConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedkafka.v1.AccessConfig.class,
              com.google.cloud.managedkafka.v1.AccessConfig.Builder.class);
    }

    // Construct using com.google.cloud.managedkafka.v1.AccessConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (networkConfigsBuilder_ == null) {
        networkConfigs_ = java.util.Collections.emptyList();
      } else {
        networkConfigs_ = null;
        networkConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.managedkafka.v1.ResourcesProto
          .internal_static_google_cloud_managedkafka_v1_AccessConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.AccessConfig getDefaultInstanceForType() {
      return com.google.cloud.managedkafka.v1.AccessConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.AccessConfig build() {
      com.google.cloud.managedkafka.v1.AccessConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedkafka.v1.AccessConfig buildPartial() {
      com.google.cloud.managedkafka.v1.AccessConfig result =
          new com.google.cloud.managedkafka.v1.AccessConfig(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.managedkafka.v1.AccessConfig result) {
      if (networkConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          networkConfigs_ = java.util.Collections.unmodifiableList(networkConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.networkConfigs_ = networkConfigs_;
      } else {
        result.networkConfigs_ = networkConfigsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.managedkafka.v1.AccessConfig result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.managedkafka.v1.AccessConfig) {
        return mergeFrom((com.google.cloud.managedkafka.v1.AccessConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedkafka.v1.AccessConfig other) {
      if (other == com.google.cloud.managedkafka.v1.AccessConfig.getDefaultInstance()) return this;
      if (networkConfigsBuilder_ == null) {
        if (!other.networkConfigs_.isEmpty()) {
          if (networkConfigs_.isEmpty()) {
            networkConfigs_ = other.networkConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNetworkConfigsIsMutable();
            networkConfigs_.addAll(other.networkConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.networkConfigs_.isEmpty()) {
          if (networkConfigsBuilder_.isEmpty()) {
            networkConfigsBuilder_.dispose();
            networkConfigsBuilder_ = null;
            networkConfigs_ = other.networkConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            networkConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getNetworkConfigsFieldBuilder()
                    : null;
          } else {
            networkConfigsBuilder_.addAllMessages(other.networkConfigs_);
          }
        }
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
                com.google.cloud.managedkafka.v1.NetworkConfig m =
                    input.readMessage(
                        com.google.cloud.managedkafka.v1.NetworkConfig.parser(), extensionRegistry);
                if (networkConfigsBuilder_ == null) {
                  ensureNetworkConfigsIsMutable();
                  networkConfigs_.add(m);
                } else {
                  networkConfigsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.managedkafka.v1.NetworkConfig> networkConfigs_ =
        java.util.Collections.emptyList();

    private void ensureNetworkConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        networkConfigs_ =
            new java.util.ArrayList<com.google.cloud.managedkafka.v1.NetworkConfig>(
                networkConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.managedkafka.v1.NetworkConfig,
            com.google.cloud.managedkafka.v1.NetworkConfig.Builder,
            com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder>
        networkConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.managedkafka.v1.NetworkConfig> getNetworkConfigsList() {
      if (networkConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(networkConfigs_);
      } else {
        return networkConfigsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public int getNetworkConfigsCount() {
      if (networkConfigsBuilder_ == null) {
        return networkConfigs_.size();
      } else {
        return networkConfigsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedkafka.v1.NetworkConfig getNetworkConfigs(int index) {
      if (networkConfigsBuilder_ == null) {
        return networkConfigs_.get(index);
      } else {
        return networkConfigsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNetworkConfigs(
        int index, com.google.cloud.managedkafka.v1.NetworkConfig value) {
      if (networkConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkConfigsIsMutable();
        networkConfigs_.set(index, value);
        onChanged();
      } else {
        networkConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setNetworkConfigs(
        int index, com.google.cloud.managedkafka.v1.NetworkConfig.Builder builderForValue) {
      if (networkConfigsBuilder_ == null) {
        ensureNetworkConfigsIsMutable();
        networkConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        networkConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addNetworkConfigs(com.google.cloud.managedkafka.v1.NetworkConfig value) {
      if (networkConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkConfigsIsMutable();
        networkConfigs_.add(value);
        onChanged();
      } else {
        networkConfigsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addNetworkConfigs(
        int index, com.google.cloud.managedkafka.v1.NetworkConfig value) {
      if (networkConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNetworkConfigsIsMutable();
        networkConfigs_.add(index, value);
        onChanged();
      } else {
        networkConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addNetworkConfigs(
        com.google.cloud.managedkafka.v1.NetworkConfig.Builder builderForValue) {
      if (networkConfigsBuilder_ == null) {
        ensureNetworkConfigsIsMutable();
        networkConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        networkConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addNetworkConfigs(
        int index, com.google.cloud.managedkafka.v1.NetworkConfig.Builder builderForValue) {
      if (networkConfigsBuilder_ == null) {
        ensureNetworkConfigsIsMutable();
        networkConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        networkConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder addAllNetworkConfigs(
        java.lang.Iterable<? extends com.google.cloud.managedkafka.v1.NetworkConfig> values) {
      if (networkConfigsBuilder_ == null) {
        ensureNetworkConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, networkConfigs_);
        onChanged();
      } else {
        networkConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearNetworkConfigs() {
      if (networkConfigsBuilder_ == null) {
        networkConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        networkConfigsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder removeNetworkConfigs(int index) {
      if (networkConfigsBuilder_ == null) {
        ensureNetworkConfigsIsMutable();
        networkConfigs_.remove(index);
        onChanged();
      } else {
        networkConfigsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedkafka.v1.NetworkConfig.Builder getNetworkConfigsBuilder(
        int index) {
      return getNetworkConfigsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder getNetworkConfigsOrBuilder(
        int index) {
      if (networkConfigsBuilder_ == null) {
        return networkConfigs_.get(index);
      } else {
        return networkConfigsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<? extends com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder>
        getNetworkConfigsOrBuilderList() {
      if (networkConfigsBuilder_ != null) {
        return networkConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(networkConfigs_);
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedkafka.v1.NetworkConfig.Builder addNetworkConfigsBuilder() {
      return getNetworkConfigsFieldBuilder()
          .addBuilder(com.google.cloud.managedkafka.v1.NetworkConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedkafka.v1.NetworkConfig.Builder addNetworkConfigsBuilder(
        int index) {
      return getNetworkConfigsFieldBuilder()
          .addBuilder(index, com.google.cloud.managedkafka.v1.NetworkConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Required. Virtual Private Cloud (VPC) networks that must be granted direct
     * access to the Kafka cluster. Minimum of 1 network is required. Maximum 10
     * networks can be specified.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.managedkafka.v1.NetworkConfig network_configs = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public java.util.List<com.google.cloud.managedkafka.v1.NetworkConfig.Builder>
        getNetworkConfigsBuilderList() {
      return getNetworkConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.managedkafka.v1.NetworkConfig,
            com.google.cloud.managedkafka.v1.NetworkConfig.Builder,
            com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder>
        getNetworkConfigsFieldBuilder() {
      if (networkConfigsBuilder_ == null) {
        networkConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.managedkafka.v1.NetworkConfig,
                com.google.cloud.managedkafka.v1.NetworkConfig.Builder,
                com.google.cloud.managedkafka.v1.NetworkConfigOrBuilder>(
                networkConfigs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        networkConfigs_ = null;
      }
      return networkConfigsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.managedkafka.v1.AccessConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedkafka.v1.AccessConfig)
  private static final com.google.cloud.managedkafka.v1.AccessConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedkafka.v1.AccessConfig();
  }

  public static com.google.cloud.managedkafka.v1.AccessConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessConfig> PARSER =
      new com.google.protobuf.AbstractParser<AccessConfig>() {
        @java.lang.Override
        public AccessConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedkafka.v1.AccessConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
