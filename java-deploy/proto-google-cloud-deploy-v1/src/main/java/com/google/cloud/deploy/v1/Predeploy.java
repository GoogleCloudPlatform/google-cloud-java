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
// source: google/cloud/deploy/v1/cloud_deploy.proto

package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Predeploy contains the predeploy job configuration information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.Predeploy}
 */
public final class Predeploy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.Predeploy)
    PredeployOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Predeploy.newBuilder() to construct.
  private Predeploy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Predeploy() {
    actions_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Predeploy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_Predeploy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_Predeploy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.Predeploy.class,
            com.google.cloud.deploy.v1.Predeploy.Builder.class);
  }

  public static final int ACTIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList actions_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Optional. A sequence of skaffold custom actions to invoke during execution
   * of the predeploy job.
   * </pre>
   *
   * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the actions.
   */
  public com.google.protobuf.ProtocolStringList getActionsList() {
    return actions_;
  }
  /**
   *
   *
   * <pre>
   * Optional. A sequence of skaffold custom actions to invoke during execution
   * of the predeploy job.
   * </pre>
   *
   * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of actions.
   */
  public int getActionsCount() {
    return actions_.size();
  }
  /**
   *
   *
   * <pre>
   * Optional. A sequence of skaffold custom actions to invoke during execution
   * of the predeploy job.
   * </pre>
   *
   * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The actions at the given index.
   */
  public java.lang.String getActions(int index) {
    return actions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Optional. A sequence of skaffold custom actions to invoke during execution
   * of the predeploy job.
   * </pre>
   *
   * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the actions at the given index.
   */
  public com.google.protobuf.ByteString getActionsBytes(int index) {
    return actions_.getByteString(index);
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
    for (int i = 0; i < actions_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, actions_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < actions_.size(); i++) {
        dataSize += computeStringSizeNoTag(actions_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getActionsList().size();
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
    if (!(obj instanceof com.google.cloud.deploy.v1.Predeploy)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.Predeploy other = (com.google.cloud.deploy.v1.Predeploy) obj;

    if (!getActionsList().equals(other.getActionsList())) return false;
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
    if (getActionsCount() > 0) {
      hash = (37 * hash) + ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.Predeploy parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.Predeploy prototype) {
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
   * Predeploy contains the predeploy job configuration information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.Predeploy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.Predeploy)
      com.google.cloud.deploy.v1.PredeployOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Predeploy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Predeploy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.Predeploy.class,
              com.google.cloud.deploy.v1.Predeploy.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.Predeploy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      actions_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_Predeploy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Predeploy getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.Predeploy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Predeploy build() {
      com.google.cloud.deploy.v1.Predeploy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.Predeploy buildPartial() {
      com.google.cloud.deploy.v1.Predeploy result = new com.google.cloud.deploy.v1.Predeploy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.Predeploy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        actions_.makeImmutable();
        result.actions_ = actions_;
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
      if (other instanceof com.google.cloud.deploy.v1.Predeploy) {
        return mergeFrom((com.google.cloud.deploy.v1.Predeploy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.Predeploy other) {
      if (other == com.google.cloud.deploy.v1.Predeploy.getDefaultInstance()) return this;
      if (!other.actions_.isEmpty()) {
        if (actions_.isEmpty()) {
          actions_ = other.actions_;
          bitField0_ |= 0x00000001;
        } else {
          ensureActionsIsMutable();
          actions_.addAll(other.actions_);
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureActionsIsMutable();
                actions_.add(s);
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

    private com.google.protobuf.LazyStringArrayList actions_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureActionsIsMutable() {
      if (!actions_.isModifiable()) {
        actions_ = new com.google.protobuf.LazyStringArrayList(actions_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return A list containing the actions.
     */
    public com.google.protobuf.ProtocolStringList getActionsList() {
      actions_.makeImmutable();
      return actions_;
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The count of actions.
     */
    public int getActionsCount() {
      return actions_.size();
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the element to return.
     * @return The actions at the given index.
     */
    public java.lang.String getActions(int index) {
      return actions_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the actions at the given index.
     */
    public com.google.protobuf.ByteString getActionsBytes(int index) {
      return actions_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param index The index to set the value at.
     * @param value The actions to set.
     * @return This builder for chaining.
     */
    public Builder setActions(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureActionsIsMutable();
      actions_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The actions to add.
     * @return This builder for chaining.
     */
    public Builder addActions(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureActionsIsMutable();
      actions_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param values The actions to add.
     * @return This builder for chaining.
     */
    public Builder addAllActions(java.lang.Iterable<java.lang.String> values) {
      ensureActionsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, actions_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearActions() {
      actions_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A sequence of skaffold custom actions to invoke during execution
     * of the predeploy job.
     * </pre>
     *
     * <code>repeated string actions = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes of the actions to add.
     * @return This builder for chaining.
     */
    public Builder addActionsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureActionsIsMutable();
      actions_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.Predeploy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.Predeploy)
  private static final com.google.cloud.deploy.v1.Predeploy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.Predeploy();
  }

  public static com.google.cloud.deploy.v1.Predeploy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Predeploy> PARSER =
      new com.google.protobuf.AbstractParser<Predeploy>() {
        @java.lang.Override
        public Predeploy parsePartialFrom(
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

  public static com.google.protobuf.Parser<Predeploy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Predeploy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.Predeploy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
