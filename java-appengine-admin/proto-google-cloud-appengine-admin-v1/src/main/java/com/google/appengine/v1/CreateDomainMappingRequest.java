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
// source: google/appengine/v1/appengine.proto

package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Request message for `DomainMappings.CreateDomainMapping`.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CreateDomainMappingRequest}
 */
public final class CreateDomainMappingRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CreateDomainMappingRequest)
    CreateDomainMappingRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDomainMappingRequest.newBuilder() to construct.
  private CreateDomainMappingRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDomainMappingRequest() {
    parent_ = "";
    overrideStrategy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDomainMappingRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateDomainMappingRequest(
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

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.appengine.v1.DomainMapping.Builder subBuilder = null;
              if (domainMapping_ != null) {
                subBuilder = domainMapping_.toBuilder();
              }
              domainMapping_ =
                  input.readMessage(
                      com.google.appengine.v1.DomainMapping.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(domainMapping_);
                domainMapping_ = subBuilder.buildPartial();
              }

              break;
            }
          case 32:
            {
              int rawValue = input.readEnum();

              overrideStrategy_ = rawValue;
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
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_CreateDomainMappingRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.AppengineProto
        .internal_static_google_appengine_v1_CreateDomainMappingRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CreateDomainMappingRequest.class,
            com.google.appengine.v1.CreateDomainMappingRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Name of the parent Application resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the parent Application resource. Example: `apps/myapp`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOMAIN_MAPPING_FIELD_NUMBER = 2;
  private com.google.appengine.v1.DomainMapping domainMapping_;
  /**
   *
   *
   * <pre>
   * Domain mapping configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
   *
   * @return Whether the domainMapping field is set.
   */
  @java.lang.Override
  public boolean hasDomainMapping() {
    return domainMapping_ != null;
  }
  /**
   *
   *
   * <pre>
   * Domain mapping configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
   *
   * @return The domainMapping.
   */
  @java.lang.Override
  public com.google.appengine.v1.DomainMapping getDomainMapping() {
    return domainMapping_ == null
        ? com.google.appengine.v1.DomainMapping.getDefaultInstance()
        : domainMapping_;
  }
  /**
   *
   *
   * <pre>
   * Domain mapping configuration.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
   */
  @java.lang.Override
  public com.google.appengine.v1.DomainMappingOrBuilder getDomainMappingOrBuilder() {
    return getDomainMapping();
  }

  public static final int OVERRIDE_STRATEGY_FIELD_NUMBER = 4;
  private int overrideStrategy_;
  /**
   *
   *
   * <pre>
   * Whether the domain creation should override any existing mappings for this
   * domain. By default, overrides are rejected.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
   *
   * @return The enum numeric value on the wire for overrideStrategy.
   */
  @java.lang.Override
  public int getOverrideStrategyValue() {
    return overrideStrategy_;
  }
  /**
   *
   *
   * <pre>
   * Whether the domain creation should override any existing mappings for this
   * domain. By default, overrides are rejected.
   * </pre>
   *
   * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
   *
   * @return The overrideStrategy.
   */
  @java.lang.Override
  public com.google.appengine.v1.DomainOverrideStrategy getOverrideStrategy() {
    @SuppressWarnings("deprecation")
    com.google.appengine.v1.DomainOverrideStrategy result =
        com.google.appengine.v1.DomainOverrideStrategy.valueOf(overrideStrategy_);
    return result == null ? com.google.appengine.v1.DomainOverrideStrategy.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (domainMapping_ != null) {
      output.writeMessage(2, getDomainMapping());
    }
    if (overrideStrategy_
        != com.google.appengine.v1.DomainOverrideStrategy.UNSPECIFIED_DOMAIN_OVERRIDE_STRATEGY
            .getNumber()) {
      output.writeEnum(4, overrideStrategy_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (domainMapping_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDomainMapping());
    }
    if (overrideStrategy_
        != com.google.appengine.v1.DomainOverrideStrategy.UNSPECIFIED_DOMAIN_OVERRIDE_STRATEGY
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, overrideStrategy_);
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
    if (!(obj instanceof com.google.appengine.v1.CreateDomainMappingRequest)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CreateDomainMappingRequest other =
        (com.google.appengine.v1.CreateDomainMappingRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDomainMapping() != other.hasDomainMapping()) return false;
    if (hasDomainMapping()) {
      if (!getDomainMapping().equals(other.getDomainMapping())) return false;
    }
    if (overrideStrategy_ != other.overrideStrategy_) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDomainMapping()) {
      hash = (37 * hash) + DOMAIN_MAPPING_FIELD_NUMBER;
      hash = (53 * hash) + getDomainMapping().hashCode();
    }
    hash = (37 * hash) + OVERRIDE_STRATEGY_FIELD_NUMBER;
    hash = (53 * hash) + overrideStrategy_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.CreateDomainMappingRequest prototype) {
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
   * Request message for `DomainMappings.CreateDomainMapping`.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CreateDomainMappingRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CreateDomainMappingRequest)
      com.google.appengine.v1.CreateDomainMappingRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_CreateDomainMappingRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_CreateDomainMappingRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CreateDomainMappingRequest.class,
              com.google.appengine.v1.CreateDomainMappingRequest.Builder.class);
    }

    // Construct using com.google.appengine.v1.CreateDomainMappingRequest.newBuilder()
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
      parent_ = "";

      if (domainMappingBuilder_ == null) {
        domainMapping_ = null;
      } else {
        domainMapping_ = null;
        domainMappingBuilder_ = null;
      }
      overrideStrategy_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.AppengineProto
          .internal_static_google_appengine_v1_CreateDomainMappingRequest_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateDomainMappingRequest getDefaultInstanceForType() {
      return com.google.appengine.v1.CreateDomainMappingRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateDomainMappingRequest build() {
      com.google.appengine.v1.CreateDomainMappingRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CreateDomainMappingRequest buildPartial() {
      com.google.appengine.v1.CreateDomainMappingRequest result =
          new com.google.appengine.v1.CreateDomainMappingRequest(this);
      result.parent_ = parent_;
      if (domainMappingBuilder_ == null) {
        result.domainMapping_ = domainMapping_;
      } else {
        result.domainMapping_ = domainMappingBuilder_.build();
      }
      result.overrideStrategy_ = overrideStrategy_;
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
      if (other instanceof com.google.appengine.v1.CreateDomainMappingRequest) {
        return mergeFrom((com.google.appengine.v1.CreateDomainMappingRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CreateDomainMappingRequest other) {
      if (other == com.google.appengine.v1.CreateDomainMappingRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasDomainMapping()) {
        mergeDomainMapping(other.getDomainMapping());
      }
      if (other.overrideStrategy_ != 0) {
        setOverrideStrategyValue(other.getOverrideStrategyValue());
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
      com.google.appengine.v1.CreateDomainMappingRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.appengine.v1.CreateDomainMappingRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Name of the parent Application resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the parent Application resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the parent Application resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the parent Application resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the parent Application resource. Example: `apps/myapp`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.appengine.v1.DomainMapping domainMapping_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.DomainMapping,
            com.google.appengine.v1.DomainMapping.Builder,
            com.google.appengine.v1.DomainMappingOrBuilder>
        domainMappingBuilder_;
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     *
     * @return Whether the domainMapping field is set.
     */
    public boolean hasDomainMapping() {
      return domainMappingBuilder_ != null || domainMapping_ != null;
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     *
     * @return The domainMapping.
     */
    public com.google.appengine.v1.DomainMapping getDomainMapping() {
      if (domainMappingBuilder_ == null) {
        return domainMapping_ == null
            ? com.google.appengine.v1.DomainMapping.getDefaultInstance()
            : domainMapping_;
      } else {
        return domainMappingBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    public Builder setDomainMapping(com.google.appengine.v1.DomainMapping value) {
      if (domainMappingBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        domainMapping_ = value;
        onChanged();
      } else {
        domainMappingBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    public Builder setDomainMapping(com.google.appengine.v1.DomainMapping.Builder builderForValue) {
      if (domainMappingBuilder_ == null) {
        domainMapping_ = builderForValue.build();
        onChanged();
      } else {
        domainMappingBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    public Builder mergeDomainMapping(com.google.appengine.v1.DomainMapping value) {
      if (domainMappingBuilder_ == null) {
        if (domainMapping_ != null) {
          domainMapping_ =
              com.google.appengine.v1.DomainMapping.newBuilder(domainMapping_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          domainMapping_ = value;
        }
        onChanged();
      } else {
        domainMappingBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    public Builder clearDomainMapping() {
      if (domainMappingBuilder_ == null) {
        domainMapping_ = null;
        onChanged();
      } else {
        domainMapping_ = null;
        domainMappingBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    public com.google.appengine.v1.DomainMapping.Builder getDomainMappingBuilder() {

      onChanged();
      return getDomainMappingFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    public com.google.appengine.v1.DomainMappingOrBuilder getDomainMappingOrBuilder() {
      if (domainMappingBuilder_ != null) {
        return domainMappingBuilder_.getMessageOrBuilder();
      } else {
        return domainMapping_ == null
            ? com.google.appengine.v1.DomainMapping.getDefaultInstance()
            : domainMapping_;
      }
    }
    /**
     *
     *
     * <pre>
     * Domain mapping configuration.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainMapping domain_mapping = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.appengine.v1.DomainMapping,
            com.google.appengine.v1.DomainMapping.Builder,
            com.google.appengine.v1.DomainMappingOrBuilder>
        getDomainMappingFieldBuilder() {
      if (domainMappingBuilder_ == null) {
        domainMappingBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.appengine.v1.DomainMapping,
                com.google.appengine.v1.DomainMapping.Builder,
                com.google.appengine.v1.DomainMappingOrBuilder>(
                getDomainMapping(), getParentForChildren(), isClean());
        domainMapping_ = null;
      }
      return domainMappingBuilder_;
    }

    private int overrideStrategy_ = 0;
    /**
     *
     *
     * <pre>
     * Whether the domain creation should override any existing mappings for this
     * domain. By default, overrides are rejected.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
     *
     * @return The enum numeric value on the wire for overrideStrategy.
     */
    @java.lang.Override
    public int getOverrideStrategyValue() {
      return overrideStrategy_;
    }
    /**
     *
     *
     * <pre>
     * Whether the domain creation should override any existing mappings for this
     * domain. By default, overrides are rejected.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
     *
     * @param value The enum numeric value on the wire for overrideStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setOverrideStrategyValue(int value) {

      overrideStrategy_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the domain creation should override any existing mappings for this
     * domain. By default, overrides are rejected.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
     *
     * @return The overrideStrategy.
     */
    @java.lang.Override
    public com.google.appengine.v1.DomainOverrideStrategy getOverrideStrategy() {
      @SuppressWarnings("deprecation")
      com.google.appengine.v1.DomainOverrideStrategy result =
          com.google.appengine.v1.DomainOverrideStrategy.valueOf(overrideStrategy_);
      return result == null ? com.google.appengine.v1.DomainOverrideStrategy.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Whether the domain creation should override any existing mappings for this
     * domain. By default, overrides are rejected.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
     *
     * @param value The overrideStrategy to set.
     * @return This builder for chaining.
     */
    public Builder setOverrideStrategy(com.google.appengine.v1.DomainOverrideStrategy value) {
      if (value == null) {
        throw new NullPointerException();
      }

      overrideStrategy_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether the domain creation should override any existing mappings for this
     * domain. By default, overrides are rejected.
     * </pre>
     *
     * <code>.google.appengine.v1.DomainOverrideStrategy override_strategy = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOverrideStrategy() {

      overrideStrategy_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CreateDomainMappingRequest)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CreateDomainMappingRequest)
  private static final com.google.appengine.v1.CreateDomainMappingRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CreateDomainMappingRequest();
  }

  public static com.google.appengine.v1.CreateDomainMappingRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDomainMappingRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDomainMappingRequest>() {
        @java.lang.Override
        public CreateDomainMappingRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateDomainMappingRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateDomainMappingRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDomainMappingRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CreateDomainMappingRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
