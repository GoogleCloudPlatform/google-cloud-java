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
// source: google/cloud/asset/v1/asset_service.proto

package com.google.cloud.asset.v1;

/**
 *
 *
 * <pre>
 * Output result of export assets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.asset.v1.OutputResult}
 */
public final class OutputResult extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.asset.v1.OutputResult)
    OutputResultOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OutputResult.newBuilder() to construct.
  private OutputResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OutputResult() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OutputResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private OutputResult(
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
              com.google.cloud.asset.v1.GcsOutputResult.Builder subBuilder = null;
              if (resultCase_ == 1) {
                subBuilder = ((com.google.cloud.asset.v1.GcsOutputResult) result_).toBuilder();
              }
              result_ =
                  input.readMessage(
                      com.google.cloud.asset.v1.GcsOutputResult.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.asset.v1.GcsOutputResult) result_);
                result_ = subBuilder.buildPartial();
              }
              resultCase_ = 1;
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
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_OutputResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.asset.v1.AssetServiceProto
        .internal_static_google_cloud_asset_v1_OutputResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.asset.v1.OutputResult.class,
            com.google.cloud.asset.v1.OutputResult.Builder.class);
  }

  private int resultCase_ = 0;
  private java.lang.Object result_;

  public enum ResultCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    GCS_RESULT(1),
    RESULT_NOT_SET(0);
    private final int value;

    private ResultCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResultCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_RESULT;
        case 0:
          return RESULT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ResultCase getResultCase() {
    return ResultCase.forNumber(resultCase_);
  }

  public static final int GCS_RESULT_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Export result on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
   *
   * @return Whether the gcsResult field is set.
   */
  @java.lang.Override
  public boolean hasGcsResult() {
    return resultCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Export result on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
   *
   * @return The gcsResult.
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.GcsOutputResult getGcsResult() {
    if (resultCase_ == 1) {
      return (com.google.cloud.asset.v1.GcsOutputResult) result_;
    }
    return com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Export result on Cloud Storage.
   * </pre>
   *
   * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.asset.v1.GcsOutputResultOrBuilder getGcsResultOrBuilder() {
    if (resultCase_ == 1) {
      return (com.google.cloud.asset.v1.GcsOutputResult) result_;
    }
    return com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance();
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
    if (resultCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.asset.v1.GcsOutputResult) result_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resultCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.asset.v1.GcsOutputResult) result_);
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
    if (!(obj instanceof com.google.cloud.asset.v1.OutputResult)) {
      return super.equals(obj);
    }
    com.google.cloud.asset.v1.OutputResult other = (com.google.cloud.asset.v1.OutputResult) obj;

    if (!getResultCase().equals(other.getResultCase())) return false;
    switch (resultCase_) {
      case 1:
        if (!getGcsResult().equals(other.getGcsResult())) return false;
        break;
      case 0:
      default:
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
    switch (resultCase_) {
      case 1:
        hash = (37 * hash) + GCS_RESULT_FIELD_NUMBER;
        hash = (53 * hash) + getGcsResult().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.OutputResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.OutputResult parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.asset.v1.OutputResult parseFrom(
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

  public static Builder newBuilder(com.google.cloud.asset.v1.OutputResult prototype) {
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
   * Output result of export assets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.asset.v1.OutputResult}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.asset.v1.OutputResult)
      com.google.cloud.asset.v1.OutputResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_OutputResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_OutputResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.asset.v1.OutputResult.class,
              com.google.cloud.asset.v1.OutputResult.Builder.class);
    }

    // Construct using com.google.cloud.asset.v1.OutputResult.newBuilder()
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
      resultCase_ = 0;
      result_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.asset.v1.AssetServiceProto
          .internal_static_google_cloud_asset_v1_OutputResult_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.OutputResult getDefaultInstanceForType() {
      return com.google.cloud.asset.v1.OutputResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.OutputResult build() {
      com.google.cloud.asset.v1.OutputResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.asset.v1.OutputResult buildPartial() {
      com.google.cloud.asset.v1.OutputResult result =
          new com.google.cloud.asset.v1.OutputResult(this);
      if (resultCase_ == 1) {
        if (gcsResultBuilder_ == null) {
          result.result_ = result_;
        } else {
          result.result_ = gcsResultBuilder_.build();
        }
      }
      result.resultCase_ = resultCase_;
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
      if (other instanceof com.google.cloud.asset.v1.OutputResult) {
        return mergeFrom((com.google.cloud.asset.v1.OutputResult) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.asset.v1.OutputResult other) {
      if (other == com.google.cloud.asset.v1.OutputResult.getDefaultInstance()) return this;
      switch (other.getResultCase()) {
        case GCS_RESULT:
          {
            mergeGcsResult(other.getGcsResult());
            break;
          }
        case RESULT_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.asset.v1.OutputResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.asset.v1.OutputResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int resultCase_ = 0;
    private java.lang.Object result_;

    public ResultCase getResultCase() {
      return ResultCase.forNumber(resultCase_);
    }

    public Builder clearResult() {
      resultCase_ = 0;
      result_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.GcsOutputResult,
            com.google.cloud.asset.v1.GcsOutputResult.Builder,
            com.google.cloud.asset.v1.GcsOutputResultOrBuilder>
        gcsResultBuilder_;
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     *
     * @return Whether the gcsResult field is set.
     */
    @java.lang.Override
    public boolean hasGcsResult() {
      return resultCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     *
     * @return The gcsResult.
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.GcsOutputResult getGcsResult() {
      if (gcsResultBuilder_ == null) {
        if (resultCase_ == 1) {
          return (com.google.cloud.asset.v1.GcsOutputResult) result_;
        }
        return com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance();
      } else {
        if (resultCase_ == 1) {
          return gcsResultBuilder_.getMessage();
        }
        return com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    public Builder setGcsResult(com.google.cloud.asset.v1.GcsOutputResult value) {
      if (gcsResultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
        onChanged();
      } else {
        gcsResultBuilder_.setMessage(value);
      }
      resultCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    public Builder setGcsResult(com.google.cloud.asset.v1.GcsOutputResult.Builder builderForValue) {
      if (gcsResultBuilder_ == null) {
        result_ = builderForValue.build();
        onChanged();
      } else {
        gcsResultBuilder_.setMessage(builderForValue.build());
      }
      resultCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    public Builder mergeGcsResult(com.google.cloud.asset.v1.GcsOutputResult value) {
      if (gcsResultBuilder_ == null) {
        if (resultCase_ == 1
            && result_ != com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance()) {
          result_ =
              com.google.cloud.asset.v1.GcsOutputResult.newBuilder(
                      (com.google.cloud.asset.v1.GcsOutputResult) result_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          result_ = value;
        }
        onChanged();
      } else {
        if (resultCase_ == 1) {
          gcsResultBuilder_.mergeFrom(value);
        } else {
          gcsResultBuilder_.setMessage(value);
        }
      }
      resultCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    public Builder clearGcsResult() {
      if (gcsResultBuilder_ == null) {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
          onChanged();
        }
      } else {
        if (resultCase_ == 1) {
          resultCase_ = 0;
          result_ = null;
        }
        gcsResultBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    public com.google.cloud.asset.v1.GcsOutputResult.Builder getGcsResultBuilder() {
      return getGcsResultFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    @java.lang.Override
    public com.google.cloud.asset.v1.GcsOutputResultOrBuilder getGcsResultOrBuilder() {
      if ((resultCase_ == 1) && (gcsResultBuilder_ != null)) {
        return gcsResultBuilder_.getMessageOrBuilder();
      } else {
        if (resultCase_ == 1) {
          return (com.google.cloud.asset.v1.GcsOutputResult) result_;
        }
        return com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Export result on Cloud Storage.
     * </pre>
     *
     * <code>.google.cloud.asset.v1.GcsOutputResult gcs_result = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.asset.v1.GcsOutputResult,
            com.google.cloud.asset.v1.GcsOutputResult.Builder,
            com.google.cloud.asset.v1.GcsOutputResultOrBuilder>
        getGcsResultFieldBuilder() {
      if (gcsResultBuilder_ == null) {
        if (!(resultCase_ == 1)) {
          result_ = com.google.cloud.asset.v1.GcsOutputResult.getDefaultInstance();
        }
        gcsResultBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.asset.v1.GcsOutputResult,
                com.google.cloud.asset.v1.GcsOutputResult.Builder,
                com.google.cloud.asset.v1.GcsOutputResultOrBuilder>(
                (com.google.cloud.asset.v1.GcsOutputResult) result_,
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      resultCase_ = 1;
      onChanged();
      ;
      return gcsResultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.asset.v1.OutputResult)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.asset.v1.OutputResult)
  private static final com.google.cloud.asset.v1.OutputResult DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.asset.v1.OutputResult();
  }

  public static com.google.cloud.asset.v1.OutputResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OutputResult> PARSER =
      new com.google.protobuf.AbstractParser<OutputResult>() {
        @java.lang.Override
        public OutputResult parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new OutputResult(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<OutputResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OutputResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.asset.v1.OutputResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
