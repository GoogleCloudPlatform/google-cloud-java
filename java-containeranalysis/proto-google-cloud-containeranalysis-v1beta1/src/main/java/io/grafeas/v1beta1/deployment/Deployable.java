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
// source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.deployment;

/**
 *
 *
 * <pre>
 * An artifact that can be deployed in some runtime.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.deployment.Deployable}
 */
public final class Deployable extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.deployment.Deployable)
    DeployableOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Deployable.newBuilder() to construct.
  private Deployable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Deployable() {
    resourceUri_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Deployable();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.deployment.DeploymentOuterClass
        .internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.deployment.DeploymentOuterClass
        .internal_static_grafeas_v1beta1_deployment_Deployable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.deployment.Deployable.class,
            io.grafeas.v1beta1.deployment.Deployable.Builder.class);
  }

  public static final int RESOURCE_URI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList resourceUri_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @return A list containing the resourceUri.
   */
  public com.google.protobuf.ProtocolStringList getResourceUriList() {
    return resourceUri_;
  }
  /**
   *
   *
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @return The count of resourceUri.
   */
  public int getResourceUriCount() {
    return resourceUri_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The resourceUri at the given index.
   */
  public java.lang.String getResourceUri(int index) {
    return resourceUri_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the resourceUri at the given index.
   */
  public com.google.protobuf.ByteString getResourceUriBytes(int index) {
    return resourceUri_.getByteString(index);
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
    for (int i = 0; i < resourceUri_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceUri_.getRaw(i));
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
      for (int i = 0; i < resourceUri_.size(); i++) {
        dataSize += computeStringSizeNoTag(resourceUri_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getResourceUriList().size();
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
    if (!(obj instanceof io.grafeas.v1beta1.deployment.Deployable)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.deployment.Deployable other = (io.grafeas.v1beta1.deployment.Deployable) obj;

    if (!getResourceUriList().equals(other.getResourceUriList())) return false;
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
    if (getResourceUriCount() > 0) {
      hash = (37 * hash) + RESOURCE_URI_FIELD_NUMBER;
      hash = (53 * hash) + getResourceUriList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.deployment.Deployable parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.deployment.Deployable prototype) {
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
   * An artifact that can be deployed in some runtime.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.deployment.Deployable}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.deployment.Deployable)
      io.grafeas.v1beta1.deployment.DeployableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass
          .internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass
          .internal_static_grafeas_v1beta1_deployment_Deployable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.deployment.Deployable.class,
              io.grafeas.v1beta1.deployment.Deployable.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.deployment.Deployable.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceUri_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.deployment.DeploymentOuterClass
          .internal_static_grafeas_v1beta1_deployment_Deployable_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Deployable getDefaultInstanceForType() {
      return io.grafeas.v1beta1.deployment.Deployable.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Deployable build() {
      io.grafeas.v1beta1.deployment.Deployable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.deployment.Deployable buildPartial() {
      io.grafeas.v1beta1.deployment.Deployable result =
          new io.grafeas.v1beta1.deployment.Deployable(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1beta1.deployment.Deployable result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        resourceUri_.makeImmutable();
        result.resourceUri_ = resourceUri_;
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
      if (other instanceof io.grafeas.v1beta1.deployment.Deployable) {
        return mergeFrom((io.grafeas.v1beta1.deployment.Deployable) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.deployment.Deployable other) {
      if (other == io.grafeas.v1beta1.deployment.Deployable.getDefaultInstance()) return this;
      if (!other.resourceUri_.isEmpty()) {
        if (resourceUri_.isEmpty()) {
          resourceUri_ = other.resourceUri_;
          bitField0_ |= 0x00000001;
        } else {
          ensureResourceUriIsMutable();
          resourceUri_.addAll(other.resourceUri_);
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
                ensureResourceUriIsMutable();
                resourceUri_.add(s);
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

    private com.google.protobuf.LazyStringArrayList resourceUri_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureResourceUriIsMutable() {
      if (!resourceUri_.isModifiable()) {
        resourceUri_ = new com.google.protobuf.LazyStringArrayList(resourceUri_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @return A list containing the resourceUri.
     */
    public com.google.protobuf.ProtocolStringList getResourceUriList() {
      resourceUri_.makeImmutable();
      return resourceUri_;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @return The count of resourceUri.
     */
    public int getResourceUriCount() {
      return resourceUri_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The resourceUri at the given index.
     */
    public java.lang.String getResourceUri(int index) {
      return resourceUri_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the resourceUri at the given index.
     */
    public com.google.protobuf.ByteString getResourceUriBytes(int index) {
      return resourceUri_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The resourceUri to set.
     * @return This builder for chaining.
     */
    public Builder setResourceUri(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceUriIsMutable();
      resourceUri_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @param value The resourceUri to add.
     * @return This builder for chaining.
     */
    public Builder addResourceUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureResourceUriIsMutable();
      resourceUri_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @param values The resourceUri to add.
     * @return This builder for chaining.
     */
    public Builder addAllResourceUri(java.lang.Iterable<java.lang.String> values) {
      ensureResourceUriIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, resourceUri_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceUri() {
      resourceUri_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Resource URI for the artifact being deployed.
     * </pre>
     *
     * <code>repeated string resource_uri = 1;</code>
     *
     * @param value The bytes of the resourceUri to add.
     * @return This builder for chaining.
     */
    public Builder addResourceUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureResourceUriIsMutable();
      resourceUri_.add(value);
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.deployment.Deployable)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.deployment.Deployable)
  private static final io.grafeas.v1beta1.deployment.Deployable DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.deployment.Deployable();
  }

  public static io.grafeas.v1beta1.deployment.Deployable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Deployable> PARSER =
      new com.google.protobuf.AbstractParser<Deployable>() {
        @java.lang.Override
        public Deployable parsePartialFrom(
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

  public static com.google.protobuf.Parser<Deployable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Deployable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.deployment.Deployable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
