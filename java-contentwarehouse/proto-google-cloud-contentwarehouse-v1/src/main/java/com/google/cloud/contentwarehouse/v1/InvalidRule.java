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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.contentwarehouse.v1;

/**
 *
 *
 * <pre>
 * A triggered rule that failed the validation check(s) after parsing.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contentwarehouse.v1.InvalidRule}
 */
public final class InvalidRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contentwarehouse.v1.InvalidRule)
    InvalidRuleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InvalidRule.newBuilder() to construct.
  private InvalidRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InvalidRule() {
    error_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InvalidRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_InvalidRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contentwarehouse.v1.RuleEngineProto
        .internal_static_google_cloud_contentwarehouse_v1_InvalidRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contentwarehouse.v1.InvalidRule.class,
            com.google.cloud.contentwarehouse.v1.InvalidRule.Builder.class);
  }

  private int bitField0_;
  public static final int RULE_FIELD_NUMBER = 1;
  private com.google.cloud.contentwarehouse.v1.Rule rule_;
  /**
   *
   *
   * <pre>
   * Triggered rule.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
   *
   * @return Whether the rule field is set.
   */
  @java.lang.Override
  public boolean hasRule() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Triggered rule.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
   *
   * @return The rule.
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.Rule getRule() {
    return rule_ == null ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance() : rule_;
  }
  /**
   *
   *
   * <pre>
   * Triggered rule.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.RuleOrBuilder getRuleOrBuilder() {
    return rule_ == null ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance() : rule_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object error_ = "";
  /**
   *
   *
   * <pre>
   * Validation error on a parsed expression.
   * </pre>
   *
   * <code>string error = 2;</code>
   *
   * @return The error.
   */
  @java.lang.Override
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Validation error on a parsed expression.
   * </pre>
   *
   * <code>string error = 2;</code>
   *
   * @return The bytes for error.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      error_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getRule());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRule());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(error_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
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
    if (!(obj instanceof com.google.cloud.contentwarehouse.v1.InvalidRule)) {
      return super.equals(obj);
    }
    com.google.cloud.contentwarehouse.v1.InvalidRule other =
        (com.google.cloud.contentwarehouse.v1.InvalidRule) obj;

    if (hasRule() != other.hasRule()) return false;
    if (hasRule()) {
      if (!getRule().equals(other.getRule())) return false;
    }
    if (!getError().equals(other.getError())) return false;
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
    if (hasRule()) {
      hash = (37 * hash) + RULE_FIELD_NUMBER;
      hash = (53 * hash) + getRule().hashCode();
    }
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule parseFrom(
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

  public static Builder newBuilder(com.google.cloud.contentwarehouse.v1.InvalidRule prototype) {
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
   * A triggered rule that failed the validation check(s) after parsing.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contentwarehouse.v1.InvalidRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contentwarehouse.v1.InvalidRule)
      com.google.cloud.contentwarehouse.v1.InvalidRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_InvalidRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_InvalidRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contentwarehouse.v1.InvalidRule.class,
              com.google.cloud.contentwarehouse.v1.InvalidRule.Builder.class);
    }

    // Construct using com.google.cloud.contentwarehouse.v1.InvalidRule.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRuleFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      error_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contentwarehouse.v1.RuleEngineProto
          .internal_static_google_cloud_contentwarehouse_v1_InvalidRule_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.InvalidRule getDefaultInstanceForType() {
      return com.google.cloud.contentwarehouse.v1.InvalidRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.InvalidRule build() {
      com.google.cloud.contentwarehouse.v1.InvalidRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contentwarehouse.v1.InvalidRule buildPartial() {
      com.google.cloud.contentwarehouse.v1.InvalidRule result =
          new com.google.cloud.contentwarehouse.v1.InvalidRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.contentwarehouse.v1.InvalidRule result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.rule_ = ruleBuilder_ == null ? rule_ : ruleBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.error_ = error_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.contentwarehouse.v1.InvalidRule) {
        return mergeFrom((com.google.cloud.contentwarehouse.v1.InvalidRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contentwarehouse.v1.InvalidRule other) {
      if (other == com.google.cloud.contentwarehouse.v1.InvalidRule.getDefaultInstance())
        return this;
      if (other.hasRule()) {
        mergeRule(other.getRule());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        bitField0_ |= 0x00000002;
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
                input.readMessage(getRuleFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                error_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private com.google.cloud.contentwarehouse.v1.Rule rule_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.Rule,
            com.google.cloud.contentwarehouse.v1.Rule.Builder,
            com.google.cloud.contentwarehouse.v1.RuleOrBuilder>
        ruleBuilder_;
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     *
     * @return Whether the rule field is set.
     */
    public boolean hasRule() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     *
     * @return The rule.
     */
    public com.google.cloud.contentwarehouse.v1.Rule getRule() {
      if (ruleBuilder_ == null) {
        return rule_ == null
            ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance()
            : rule_;
      } else {
        return ruleBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder setRule(com.google.cloud.contentwarehouse.v1.Rule value) {
      if (ruleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        rule_ = value;
      } else {
        ruleBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder setRule(com.google.cloud.contentwarehouse.v1.Rule.Builder builderForValue) {
      if (ruleBuilder_ == null) {
        rule_ = builderForValue.build();
      } else {
        ruleBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder mergeRule(com.google.cloud.contentwarehouse.v1.Rule value) {
      if (ruleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && rule_ != null
            && rule_ != com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance()) {
          getRuleBuilder().mergeFrom(value);
        } else {
          rule_ = value;
        }
      } else {
        ruleBuilder_.mergeFrom(value);
      }
      if (rule_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public Builder clearRule() {
      bitField0_ = (bitField0_ & ~0x00000001);
      rule_ = null;
      if (ruleBuilder_ != null) {
        ruleBuilder_.dispose();
        ruleBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.Rule.Builder getRuleBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRuleFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    public com.google.cloud.contentwarehouse.v1.RuleOrBuilder getRuleOrBuilder() {
      if (ruleBuilder_ != null) {
        return ruleBuilder_.getMessageOrBuilder();
      } else {
        return rule_ == null
            ? com.google.cloud.contentwarehouse.v1.Rule.getDefaultInstance()
            : rule_;
      }
    }
    /**
     *
     *
     * <pre>
     * Triggered rule.
     * </pre>
     *
     * <code>.google.cloud.contentwarehouse.v1.Rule rule = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contentwarehouse.v1.Rule,
            com.google.cloud.contentwarehouse.v1.Rule.Builder,
            com.google.cloud.contentwarehouse.v1.RuleOrBuilder>
        getRuleFieldBuilder() {
      if (ruleBuilder_ == null) {
        ruleBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contentwarehouse.v1.Rule,
                com.google.cloud.contentwarehouse.v1.Rule.Builder,
                com.google.cloud.contentwarehouse.v1.RuleOrBuilder>(
                getRule(), getParentForChildren(), isClean());
        rule_ = null;
      }
      return ruleBuilder_;
    }

    private java.lang.Object error_ = "";
    /**
     *
     *
     * <pre>
     * Validation error on a parsed expression.
     * </pre>
     *
     * <code>string error = 2;</code>
     *
     * @return The error.
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Validation error on a parsed expression.
     * </pre>
     *
     * <code>string error = 2;</code>
     *
     * @return The bytes for error.
     */
    public com.google.protobuf.ByteString getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Validation error on a parsed expression.
     * </pre>
     *
     * <code>string error = 2;</code>
     *
     * @param value The error to set.
     * @return This builder for chaining.
     */
    public Builder setError(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      error_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation error on a parsed expression.
     * </pre>
     *
     * <code>string error = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearError() {
      error_ = getDefaultInstance().getError();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Validation error on a parsed expression.
     * </pre>
     *
     * <code>string error = 2;</code>
     *
     * @param value The bytes for error to set.
     * @return This builder for chaining.
     */
    public Builder setErrorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      error_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contentwarehouse.v1.InvalidRule)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contentwarehouse.v1.InvalidRule)
  private static final com.google.cloud.contentwarehouse.v1.InvalidRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.contentwarehouse.v1.InvalidRule();
  }

  public static com.google.cloud.contentwarehouse.v1.InvalidRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InvalidRule> PARSER =
      new com.google.protobuf.AbstractParser<InvalidRule>() {
        @java.lang.Override
        public InvalidRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<InvalidRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InvalidRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contentwarehouse.v1.InvalidRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
