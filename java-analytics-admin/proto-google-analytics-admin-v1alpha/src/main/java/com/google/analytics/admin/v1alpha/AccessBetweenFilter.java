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
// source: google/analytics/admin/v1alpha/access_report.proto

package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * To express that the result needs to be between two numbers (inclusive).
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AccessBetweenFilter}
 */
public final class AccessBetweenFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AccessBetweenFilter)
    AccessBetweenFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccessBetweenFilter.newBuilder() to construct.
  private AccessBetweenFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccessBetweenFilter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccessBetweenFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AccessBetweenFilter(
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
              com.google.analytics.admin.v1alpha.NumericValue.Builder subBuilder = null;
              if (fromValue_ != null) {
                subBuilder = fromValue_.toBuilder();
              }
              fromValue_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.NumericValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(fromValue_);
                fromValue_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.analytics.admin.v1alpha.NumericValue.Builder subBuilder = null;
              if (toValue_ != null) {
                subBuilder = toValue_.toBuilder();
              }
              toValue_ =
                  input.readMessage(
                      com.google.analytics.admin.v1alpha.NumericValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(toValue_);
                toValue_ = subBuilder.buildPartial();
              }

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
    return com.google.analytics.admin.v1alpha.AccessReportProto
        .internal_static_google_analytics_admin_v1alpha_AccessBetweenFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AccessReportProto
        .internal_static_google_analytics_admin_v1alpha_AccessBetweenFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AccessBetweenFilter.class,
            com.google.analytics.admin.v1alpha.AccessBetweenFilter.Builder.class);
  }

  public static final int FROM_VALUE_FIELD_NUMBER = 1;
  private com.google.analytics.admin.v1alpha.NumericValue fromValue_;
  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
   *
   * @return Whether the fromValue field is set.
   */
  @java.lang.Override
  public boolean hasFromValue() {
    return fromValue_ != null;
  }
  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
   *
   * @return The fromValue.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.NumericValue getFromValue() {
    return fromValue_ == null
        ? com.google.analytics.admin.v1alpha.NumericValue.getDefaultInstance()
        : fromValue_;
  }
  /**
   *
   *
   * <pre>
   * Begins with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.NumericValueOrBuilder getFromValueOrBuilder() {
    return getFromValue();
  }

  public static final int TO_VALUE_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.NumericValue toValue_;
  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
   *
   * @return Whether the toValue field is set.
   */
  @java.lang.Override
  public boolean hasToValue() {
    return toValue_ != null;
  }
  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
   *
   * @return The toValue.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.NumericValue getToValue() {
    return toValue_ == null
        ? com.google.analytics.admin.v1alpha.NumericValue.getDefaultInstance()
        : toValue_;
  }
  /**
   *
   *
   * <pre>
   * Ends with this number.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.NumericValueOrBuilder getToValueOrBuilder() {
    return getToValue();
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
    if (fromValue_ != null) {
      output.writeMessage(1, getFromValue());
    }
    if (toValue_ != null) {
      output.writeMessage(2, getToValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fromValue_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getFromValue());
    }
    if (toValue_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getToValue());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AccessBetweenFilter)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AccessBetweenFilter other =
        (com.google.analytics.admin.v1alpha.AccessBetweenFilter) obj;

    if (hasFromValue() != other.hasFromValue()) return false;
    if (hasFromValue()) {
      if (!getFromValue().equals(other.getFromValue())) return false;
    }
    if (hasToValue() != other.hasToValue()) return false;
    if (hasToValue()) {
      if (!getToValue().equals(other.getToValue())) return false;
    }
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
    if (hasFromValue()) {
      hash = (37 * hash) + FROM_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getFromValue().hashCode();
    }
    if (hasToValue()) {
      hash = (37 * hash) + TO_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getToValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter parseFrom(
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
      com.google.analytics.admin.v1alpha.AccessBetweenFilter prototype) {
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
   * To express that the result needs to be between two numbers (inclusive).
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AccessBetweenFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AccessBetweenFilter)
      com.google.analytics.admin.v1alpha.AccessBetweenFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AccessReportProto
          .internal_static_google_analytics_admin_v1alpha_AccessBetweenFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AccessReportProto
          .internal_static_google_analytics_admin_v1alpha_AccessBetweenFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AccessBetweenFilter.class,
              com.google.analytics.admin.v1alpha.AccessBetweenFilter.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AccessBetweenFilter.newBuilder()
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
      if (fromValueBuilder_ == null) {
        fromValue_ = null;
      } else {
        fromValue_ = null;
        fromValueBuilder_ = null;
      }
      if (toValueBuilder_ == null) {
        toValue_ = null;
      } else {
        toValue_ = null;
        toValueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AccessReportProto
          .internal_static_google_analytics_admin_v1alpha_AccessBetweenFilter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AccessBetweenFilter getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AccessBetweenFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AccessBetweenFilter build() {
      com.google.analytics.admin.v1alpha.AccessBetweenFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AccessBetweenFilter buildPartial() {
      com.google.analytics.admin.v1alpha.AccessBetweenFilter result =
          new com.google.analytics.admin.v1alpha.AccessBetweenFilter(this);
      if (fromValueBuilder_ == null) {
        result.fromValue_ = fromValue_;
      } else {
        result.fromValue_ = fromValueBuilder_.build();
      }
      if (toValueBuilder_ == null) {
        result.toValue_ = toValue_;
      } else {
        result.toValue_ = toValueBuilder_.build();
      }
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
      if (other instanceof com.google.analytics.admin.v1alpha.AccessBetweenFilter) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AccessBetweenFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AccessBetweenFilter other) {
      if (other == com.google.analytics.admin.v1alpha.AccessBetweenFilter.getDefaultInstance())
        return this;
      if (other.hasFromValue()) {
        mergeFromValue(other.getFromValue());
      }
      if (other.hasToValue()) {
        mergeToValue(other.getToValue());
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
      com.google.analytics.admin.v1alpha.AccessBetweenFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.analytics.admin.v1alpha.AccessBetweenFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.analytics.admin.v1alpha.NumericValue fromValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.NumericValue,
            com.google.analytics.admin.v1alpha.NumericValue.Builder,
            com.google.analytics.admin.v1alpha.NumericValueOrBuilder>
        fromValueBuilder_;
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return Whether the fromValue field is set.
     */
    public boolean hasFromValue() {
      return fromValueBuilder_ != null || fromValue_ != null;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     *
     * @return The fromValue.
     */
    public com.google.analytics.admin.v1alpha.NumericValue getFromValue() {
      if (fromValueBuilder_ == null) {
        return fromValue_ == null
            ? com.google.analytics.admin.v1alpha.NumericValue.getDefaultInstance()
            : fromValue_;
      } else {
        return fromValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder setFromValue(com.google.analytics.admin.v1alpha.NumericValue value) {
      if (fromValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fromValue_ = value;
        onChanged();
      } else {
        fromValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder setFromValue(
        com.google.analytics.admin.v1alpha.NumericValue.Builder builderForValue) {
      if (fromValueBuilder_ == null) {
        fromValue_ = builderForValue.build();
        onChanged();
      } else {
        fromValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder mergeFromValue(com.google.analytics.admin.v1alpha.NumericValue value) {
      if (fromValueBuilder_ == null) {
        if (fromValue_ != null) {
          fromValue_ =
              com.google.analytics.admin.v1alpha.NumericValue.newBuilder(fromValue_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          fromValue_ = value;
        }
        onChanged();
      } else {
        fromValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    public Builder clearFromValue() {
      if (fromValueBuilder_ == null) {
        fromValue_ = null;
        onChanged();
      } else {
        fromValue_ = null;
        fromValueBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.NumericValue.Builder getFromValueBuilder() {

      onChanged();
      return getFromValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    public com.google.analytics.admin.v1alpha.NumericValueOrBuilder getFromValueOrBuilder() {
      if (fromValueBuilder_ != null) {
        return fromValueBuilder_.getMessageOrBuilder();
      } else {
        return fromValue_ == null
            ? com.google.analytics.admin.v1alpha.NumericValue.getDefaultInstance()
            : fromValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Begins with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue from_value = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.NumericValue,
            com.google.analytics.admin.v1alpha.NumericValue.Builder,
            com.google.analytics.admin.v1alpha.NumericValueOrBuilder>
        getFromValueFieldBuilder() {
      if (fromValueBuilder_ == null) {
        fromValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.NumericValue,
                com.google.analytics.admin.v1alpha.NumericValue.Builder,
                com.google.analytics.admin.v1alpha.NumericValueOrBuilder>(
                getFromValue(), getParentForChildren(), isClean());
        fromValue_ = null;
      }
      return fromValueBuilder_;
    }

    private com.google.analytics.admin.v1alpha.NumericValue toValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.NumericValue,
            com.google.analytics.admin.v1alpha.NumericValue.Builder,
            com.google.analytics.admin.v1alpha.NumericValueOrBuilder>
        toValueBuilder_;
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return Whether the toValue field is set.
     */
    public boolean hasToValue() {
      return toValueBuilder_ != null || toValue_ != null;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     *
     * @return The toValue.
     */
    public com.google.analytics.admin.v1alpha.NumericValue getToValue() {
      if (toValueBuilder_ == null) {
        return toValue_ == null
            ? com.google.analytics.admin.v1alpha.NumericValue.getDefaultInstance()
            : toValue_;
      } else {
        return toValueBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder setToValue(com.google.analytics.admin.v1alpha.NumericValue value) {
      if (toValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        toValue_ = value;
        onChanged();
      } else {
        toValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder setToValue(
        com.google.analytics.admin.v1alpha.NumericValue.Builder builderForValue) {
      if (toValueBuilder_ == null) {
        toValue_ = builderForValue.build();
        onChanged();
      } else {
        toValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder mergeToValue(com.google.analytics.admin.v1alpha.NumericValue value) {
      if (toValueBuilder_ == null) {
        if (toValue_ != null) {
          toValue_ =
              com.google.analytics.admin.v1alpha.NumericValue.newBuilder(toValue_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          toValue_ = value;
        }
        onChanged();
      } else {
        toValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    public Builder clearToValue() {
      if (toValueBuilder_ == null) {
        toValue_ = null;
        onChanged();
      } else {
        toValue_ = null;
        toValueBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    public com.google.analytics.admin.v1alpha.NumericValue.Builder getToValueBuilder() {

      onChanged();
      return getToValueFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    public com.google.analytics.admin.v1alpha.NumericValueOrBuilder getToValueOrBuilder() {
      if (toValueBuilder_ != null) {
        return toValueBuilder_.getMessageOrBuilder();
      } else {
        return toValue_ == null
            ? com.google.analytics.admin.v1alpha.NumericValue.getDefaultInstance()
            : toValue_;
      }
    }
    /**
     *
     *
     * <pre>
     * Ends with this number.
     * </pre>
     *
     * <code>.google.analytics.admin.v1alpha.NumericValue to_value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.NumericValue,
            com.google.analytics.admin.v1alpha.NumericValue.Builder,
            com.google.analytics.admin.v1alpha.NumericValueOrBuilder>
        getToValueFieldBuilder() {
      if (toValueBuilder_ == null) {
        toValueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.NumericValue,
                com.google.analytics.admin.v1alpha.NumericValue.Builder,
                com.google.analytics.admin.v1alpha.NumericValueOrBuilder>(
                getToValue(), getParentForChildren(), isClean());
        toValue_ = null;
      }
      return toValueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AccessBetweenFilter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AccessBetweenFilter)
  private static final com.google.analytics.admin.v1alpha.AccessBetweenFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AccessBetweenFilter();
  }

  public static com.google.analytics.admin.v1alpha.AccessBetweenFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessBetweenFilter> PARSER =
      new com.google.protobuf.AbstractParser<AccessBetweenFilter>() {
        @java.lang.Override
        public AccessBetweenFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AccessBetweenFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AccessBetweenFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessBetweenFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AccessBetweenFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
