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
// source: google/cloud/gkehub/v1alpha/configmanagement/configmanagement.proto

package com.google.cloud.gkehub.configmanagement.v1alpha;

/**
 *
 *
 * <pre>
 * Version for Hierarchy Controller
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion}
 */
public final class HierarchyControllerVersion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion)
    HierarchyControllerVersionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use HierarchyControllerVersion.newBuilder() to construct.
  private HierarchyControllerVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HierarchyControllerVersion() {
    hnc_ = "";
    extension_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HierarchyControllerVersion();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private HierarchyControllerVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              hnc_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              extension_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
        .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.class,
            com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder
                .class);
  }

  public static final int HNC_FIELD_NUMBER = 1;
  private volatile java.lang.Object hnc_;
  /**
   *
   *
   * <pre>
   * Version for open source HNC
   * </pre>
   *
   * <code>string hnc = 1;</code>
   *
   * @return The hnc.
   */
  @java.lang.Override
  public java.lang.String getHnc() {
    java.lang.Object ref = hnc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hnc_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Version for open source HNC
   * </pre>
   *
   * <code>string hnc = 1;</code>
   *
   * @return The bytes for hnc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHncBytes() {
    java.lang.Object ref = hnc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      hnc_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EXTENSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object extension_;
  /**
   *
   *
   * <pre>
   * Version for Hierarchy Controller extension
   * </pre>
   *
   * <code>string extension = 2;</code>
   *
   * @return The extension.
   */
  @java.lang.Override
  public java.lang.String getExtension() {
    java.lang.Object ref = extension_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      extension_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Version for Hierarchy Controller extension
   * </pre>
   *
   * <code>string extension = 2;</code>
   *
   * @return The bytes for extension.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExtensionBytes() {
    java.lang.Object ref = extension_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      extension_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hnc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hnc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extension_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, extension_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(hnc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hnc_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(extension_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, extension_);
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
    if (!(obj
        instanceof com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion other =
        (com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion) obj;

    if (!getHnc().equals(other.getHnc())) return false;
    if (!getExtension().equals(other.getExtension())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (53 * hash) + getHnc().hashCode();
    hash = (37 * hash) + EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + getExtension().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
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
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion prototype) {
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
   * Version for Hierarchy Controller
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion)
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.class,
              com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      hnc_ = "";

      extension_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.ConfigManagementProto
          .internal_static_google_cloud_gkehub_configmanagement_v1alpha_HierarchyControllerVersion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion build() {
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
        buildPartial() {
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion result =
          new com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion(this);
      result.hnc_ = hnc_;
      result.extension_ = extension_;
      onBuilt();
      return result;
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
          instanceof com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion) {
        return mergeFrom(
            (com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion other) {
      if (other
          == com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
              .getDefaultInstance()) return this;
      if (!other.getHnc().isEmpty()) {
        hnc_ = other.hnc_;
        onChanged();
      }
      if (!other.getExtension().isEmpty()) {
        extension_ = other.extension_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion parsedMessage =
          null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hnc_ = "";
    /**
     *
     *
     * <pre>
     * Version for open source HNC
     * </pre>
     *
     * <code>string hnc = 1;</code>
     *
     * @return The hnc.
     */
    public java.lang.String getHnc() {
      java.lang.Object ref = hnc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hnc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version for open source HNC
     * </pre>
     *
     * <code>string hnc = 1;</code>
     *
     * @return The bytes for hnc.
     */
    public com.google.protobuf.ByteString getHncBytes() {
      java.lang.Object ref = hnc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        hnc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version for open source HNC
     * </pre>
     *
     * <code>string hnc = 1;</code>
     *
     * @param value The hnc to set.
     * @return This builder for chaining.
     */
    public Builder setHnc(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      hnc_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version for open source HNC
     * </pre>
     *
     * <code>string hnc = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHnc() {

      hnc_ = getDefaultInstance().getHnc();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version for open source HNC
     * </pre>
     *
     * <code>string hnc = 1;</code>
     *
     * @param value The bytes for hnc to set.
     * @return This builder for chaining.
     */
    public Builder setHncBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      hnc_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object extension_ = "";
    /**
     *
     *
     * <pre>
     * Version for Hierarchy Controller extension
     * </pre>
     *
     * <code>string extension = 2;</code>
     *
     * @return The extension.
     */
    public java.lang.String getExtension() {
      java.lang.Object ref = extension_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        extension_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version for Hierarchy Controller extension
     * </pre>
     *
     * <code>string extension = 2;</code>
     *
     * @return The bytes for extension.
     */
    public com.google.protobuf.ByteString getExtensionBytes() {
      java.lang.Object ref = extension_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        extension_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version for Hierarchy Controller extension
     * </pre>
     *
     * <code>string extension = 2;</code>
     *
     * @param value The extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtension(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      extension_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version for Hierarchy Controller extension
     * </pre>
     *
     * <code>string extension = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExtension() {

      extension_ = getDefaultInstance().getExtension();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version for Hierarchy Controller extension
     * </pre>
     *
     * <code>string extension = 2;</code>
     *
     * @param value The bytes for extension to set.
     * @return This builder for chaining.
     */
    public Builder setExtensionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      extension_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion)
  private static final com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion();
  }

  public static com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HierarchyControllerVersion> PARSER =
      new com.google.protobuf.AbstractParser<HierarchyControllerVersion>() {
        @java.lang.Override
        public HierarchyControllerVersion parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new HierarchyControllerVersion(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<HierarchyControllerVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HierarchyControllerVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.configmanagement.v1alpha.HierarchyControllerVersion
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
