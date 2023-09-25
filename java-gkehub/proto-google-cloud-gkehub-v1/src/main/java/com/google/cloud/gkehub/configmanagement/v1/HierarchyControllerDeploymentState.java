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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1;

/**
 *
 *
 * <pre>
 * Deployment state for Hierarchy Controller
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState}
 */
public final class HierarchyControllerDeploymentState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState)
    HierarchyControllerDeploymentStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HierarchyControllerDeploymentState.newBuilder() to construct.
  private HierarchyControllerDeploymentState(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HierarchyControllerDeploymentState() {
    hnc_ = 0;
    extension_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HierarchyControllerDeploymentState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerDeploymentState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerDeploymentState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.class,
            com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder
                .class);
  }

  public static final int HNC_FIELD_NUMBER = 1;
  private int hnc_ = 0;
  /**
   *
   *
   * <pre>
   * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
   *
   * @return The enum numeric value on the wire for hnc.
   */
  @java.lang.Override
  public int getHncValue() {
    return hnc_;
  }
  /**
   *
   *
   * <pre>
   * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
   *
   * @return The hnc.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.DeploymentState getHnc() {
    com.google.cloud.gkehub.configmanagement.v1.DeploymentState result =
        com.google.cloud.gkehub.configmanagement.v1.DeploymentState.forNumber(hnc_);
    return result == null
        ? com.google.cloud.gkehub.configmanagement.v1.DeploymentState.UNRECOGNIZED
        : result;
  }

  public static final int EXTENSION_FIELD_NUMBER = 2;
  private int extension_ = 0;
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
   *
   * @return The enum numeric value on the wire for extension.
   */
  @java.lang.Override
  public int getExtensionValue() {
    return extension_;
  }
  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
   *
   * @return The extension.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.DeploymentState getExtension() {
    com.google.cloud.gkehub.configmanagement.v1.DeploymentState result =
        com.google.cloud.gkehub.configmanagement.v1.DeploymentState.forNumber(extension_);
    return result == null
        ? com.google.cloud.gkehub.configmanagement.v1.DeploymentState.UNRECOGNIZED
        : result;
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
    if (hnc_
        != com.google.cloud.gkehub.configmanagement.v1.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, hnc_);
    }
    if (extension_
        != com.google.cloud.gkehub.configmanagement.v1.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, extension_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hnc_
        != com.google.cloud.gkehub.configmanagement.v1.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, hnc_);
    }
    if (extension_
        != com.google.cloud.gkehub.configmanagement.v1.DeploymentState.DEPLOYMENT_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, extension_);
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
        instanceof
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState other =
        (com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState) obj;

    if (hnc_ != other.hnc_) return false;
    if (extension_ != other.extension_) return false;
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
    hash = (37 * hash) + HNC_FIELD_NUMBER;
    hash = (53 * hash) + hnc_;
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + extension_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      parseFrom(
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
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState prototype) {
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
   * Deployment state for Hierarchy Controller
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState)
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerDeploymentState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerDeploymentState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.class,
              com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hnc_ = 0;
      extension_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1_HierarchyControllerDeploymentState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState build() {
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
        buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState result =
          new com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hnc_ = hnc_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.extension_ = extension_;
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
          instanceof
          com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState) {
        return mergeFrom(
            (com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
              .getDefaultInstance()) return this;
      if (other.hnc_ != 0) {
        setHncValue(other.getHncValue());
      }
      if (other.extension_ != 0) {
        setExtensionValue(other.getExtensionValue());
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
                hnc_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                extension_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int hnc_ = 0;
    /**
     *
     *
     * <pre>
     * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
     *
     * @return The enum numeric value on the wire for hnc.
     */
    @java.lang.Override
    public int getHncValue() {
      return hnc_;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
     *
     * @param value The enum numeric value on the wire for hnc to set.
     * @return This builder for chaining.
     */
    public Builder setHncValue(int value) {
      hnc_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
     *
     * @return The hnc.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.DeploymentState getHnc() {
      com.google.cloud.gkehub.configmanagement.v1.DeploymentState result =
          com.google.cloud.gkehub.configmanagement.v1.DeploymentState.forNumber(hnc_);
      return result == null
          ? com.google.cloud.gkehub.configmanagement.v1.DeploymentState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
     *
     * @param value The hnc to set.
     * @return This builder for chaining.
     */
    public Builder setHnc(com.google.cloud.gkehub.configmanagement.v1.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      hnc_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHnc() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hnc_ = 0;
      onChanged();
      return this;
    }

    private int extension_ = 0;
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
     *
     * @return The enum numeric value on the wire for extension.
     */
    @java.lang.Override
    public int getExtensionValue() {
      return extension_;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
     *
     * @param value The enum numeric value on the wire for extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionValue(int value) {
      extension_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
     *
     * @return The extension.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1.DeploymentState getExtension() {
      com.google.cloud.gkehub.configmanagement.v1.DeploymentState result =
          com.google.cloud.gkehub.configmanagement.v1.DeploymentState.forNumber(extension_);
      return result == null
          ? com.google.cloud.gkehub.configmanagement.v1.DeploymentState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
     *
     * @param value The extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtension(com.google.cloud.gkehub.configmanagement.v1.DeploymentState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      extension_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
     * </pre>
     *
     * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExtension() {
      bitField0_ = (bitField0_ & ~0x00000002);
      extension_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState)
  private static final com.google.cloud.gkehub.configmanagement.v1
          .HierarchyControllerDeploymentState
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState();
  }

  public static com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HierarchyControllerDeploymentState> PARSER =
      new com.google.protobuf.AbstractParser<HierarchyControllerDeploymentState>() {
        @java.lang.Override
        public HierarchyControllerDeploymentState parsePartialFrom(
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

  public static com.google.protobuf.Parser<HierarchyControllerDeploymentState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HierarchyControllerDeploymentState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
