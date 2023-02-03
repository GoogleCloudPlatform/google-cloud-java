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
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

/**
 *
 *
 * <pre>
 * The request for UpdateSetting.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcesettings.v1.UpdateSettingRequest}
 */
public final class UpdateSettingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcesettings.v1.UpdateSettingRequest)
    UpdateSettingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateSettingRequest.newBuilder() to construct.
  private UpdateSettingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateSettingRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateSettingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
        .internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
        .internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcesettings.v1.UpdateSettingRequest.class,
            com.google.cloud.resourcesettings.v1.UpdateSettingRequest.Builder.class);
  }

  public static final int SETTING_FIELD_NUMBER = 1;
  private com.google.cloud.resourcesettings.v1.Setting setting_;
  /**
   *
   *
   * <pre>
   * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the setting field is set.
   */
  @java.lang.Override
  public boolean hasSetting() {
    return setting_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The setting.
   */
  @java.lang.Override
  public com.google.cloud.resourcesettings.v1.Setting getSetting() {
    return setting_ == null
        ? com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance()
        : setting_;
  }
  /**
   *
   *
   * <pre>
   * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.resourcesettings.v1.SettingOrBuilder getSettingOrBuilder() {
    return setting_ == null
        ? com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance()
        : setting_;
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
    if (setting_ != null) {
      output.writeMessage(1, getSetting());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (setting_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getSetting());
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
    if (!(obj instanceof com.google.cloud.resourcesettings.v1.UpdateSettingRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcesettings.v1.UpdateSettingRequest other =
        (com.google.cloud.resourcesettings.v1.UpdateSettingRequest) obj;

    if (hasSetting() != other.hasSetting()) return false;
    if (hasSetting()) {
      if (!getSetting().equals(other.getSetting())) return false;
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
    if (hasSetting()) {
      hash = (37 * hash) + SETTING_FIELD_NUMBER;
      hash = (53 * hash) + getSetting().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest parseFrom(
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
      com.google.cloud.resourcesettings.v1.UpdateSettingRequest prototype) {
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
   * The request for UpdateSetting.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcesettings.v1.UpdateSettingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcesettings.v1.UpdateSettingRequest)
      com.google.cloud.resourcesettings.v1.UpdateSettingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
          .internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
          .internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcesettings.v1.UpdateSettingRequest.class,
              com.google.cloud.resourcesettings.v1.UpdateSettingRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcesettings.v1.UpdateSettingRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      setting_ = null;
      if (settingBuilder_ != null) {
        settingBuilder_.dispose();
        settingBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcesettings.v1.ResourceSettingsProto
          .internal_static_google_cloud_resourcesettings_v1_UpdateSettingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcesettings.v1.UpdateSettingRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcesettings.v1.UpdateSettingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcesettings.v1.UpdateSettingRequest build() {
      com.google.cloud.resourcesettings.v1.UpdateSettingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcesettings.v1.UpdateSettingRequest buildPartial() {
      com.google.cloud.resourcesettings.v1.UpdateSettingRequest result =
          new com.google.cloud.resourcesettings.v1.UpdateSettingRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcesettings.v1.UpdateSettingRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.setting_ = settingBuilder_ == null ? setting_ : settingBuilder_.build();
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
      if (other instanceof com.google.cloud.resourcesettings.v1.UpdateSettingRequest) {
        return mergeFrom((com.google.cloud.resourcesettings.v1.UpdateSettingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcesettings.v1.UpdateSettingRequest other) {
      if (other == com.google.cloud.resourcesettings.v1.UpdateSettingRequest.getDefaultInstance())
        return this;
      if (other.hasSetting()) {
        mergeSetting(other.getSetting());
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
                input.readMessage(getSettingFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.resourcesettings.v1.Setting setting_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcesettings.v1.Setting,
            com.google.cloud.resourcesettings.v1.Setting.Builder,
            com.google.cloud.resourcesettings.v1.SettingOrBuilder>
        settingBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the setting field is set.
     */
    public boolean hasSetting() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The setting.
     */
    public com.google.cloud.resourcesettings.v1.Setting getSetting() {
      if (settingBuilder_ == null) {
        return setting_ == null
            ? com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance()
            : setting_;
      } else {
        return settingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSetting(com.google.cloud.resourcesettings.v1.Setting value) {
      if (settingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        setting_ = value;
      } else {
        settingBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSetting(
        com.google.cloud.resourcesettings.v1.Setting.Builder builderForValue) {
      if (settingBuilder_ == null) {
        setting_ = builderForValue.build();
      } else {
        settingBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSetting(com.google.cloud.resourcesettings.v1.Setting value) {
      if (settingBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && setting_ != null
            && setting_ != com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance()) {
          getSettingBuilder().mergeFrom(value);
        } else {
          setting_ = value;
        }
      } else {
        settingBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSetting() {
      bitField0_ = (bitField0_ & ~0x00000001);
      setting_ = null;
      if (settingBuilder_ != null) {
        settingBuilder_.dispose();
        settingBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcesettings.v1.Setting.Builder getSettingBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getSettingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcesettings.v1.SettingOrBuilder getSettingOrBuilder() {
      if (settingBuilder_ != null) {
        return settingBuilder_.getMessageOrBuilder();
      } else {
        return setting_ == null
            ? com.google.cloud.resourcesettings.v1.Setting.getDefaultInstance()
            : setting_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The setting to update. See [Setting][google.cloud.resourcesettings.v1.Setting] for field requirements.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcesettings.v1.Setting setting = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcesettings.v1.Setting,
            com.google.cloud.resourcesettings.v1.Setting.Builder,
            com.google.cloud.resourcesettings.v1.SettingOrBuilder>
        getSettingFieldBuilder() {
      if (settingBuilder_ == null) {
        settingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.resourcesettings.v1.Setting,
                com.google.cloud.resourcesettings.v1.Setting.Builder,
                com.google.cloud.resourcesettings.v1.SettingOrBuilder>(
                getSetting(), getParentForChildren(), isClean());
        setting_ = null;
      }
      return settingBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcesettings.v1.UpdateSettingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcesettings.v1.UpdateSettingRequest)
  private static final com.google.cloud.resourcesettings.v1.UpdateSettingRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcesettings.v1.UpdateSettingRequest();
  }

  public static com.google.cloud.resourcesettings.v1.UpdateSettingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateSettingRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateSettingRequest>() {
        @java.lang.Override
        public UpdateSettingRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateSettingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateSettingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcesettings.v1.UpdateSettingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
