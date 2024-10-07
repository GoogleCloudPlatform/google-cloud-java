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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Amazon S3 bucket.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.AmazonS3Bucket}
 */
public final class AmazonS3Bucket extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.AmazonS3Bucket)
    AmazonS3BucketOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AmazonS3Bucket.newBuilder() to construct.
  private AmazonS3Bucket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AmazonS3Bucket() {
    bucketName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AmazonS3Bucket();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_AmazonS3Bucket_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_AmazonS3Bucket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.AmazonS3Bucket.class,
            com.google.privacy.dlp.v2.AmazonS3Bucket.Builder.class);
  }

  private int bitField0_;
  public static final int AWS_ACCOUNT_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.AwsAccount awsAccount_;
  /**
   *
   *
   * <pre>
   * The AWS account.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
   *
   * @return Whether the awsAccount field is set.
   */
  @java.lang.Override
  public boolean hasAwsAccount() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The AWS account.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
   *
   * @return The awsAccount.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.AwsAccount getAwsAccount() {
    return awsAccount_ == null
        ? com.google.privacy.dlp.v2.AwsAccount.getDefaultInstance()
        : awsAccount_;
  }
  /**
   *
   *
   * <pre>
   * The AWS account.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.AwsAccountOrBuilder getAwsAccountOrBuilder() {
    return awsAccount_ == null
        ? com.google.privacy.dlp.v2.AwsAccount.getDefaultInstance()
        : awsAccount_;
  }

  public static final int BUCKET_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object bucketName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The bucket name.
   * </pre>
   *
   * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bucketName.
   */
  @java.lang.Override
  public java.lang.String getBucketName() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      bucketName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The bucket name.
   * </pre>
   *
   * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for bucketName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBucketNameBytes() {
    java.lang.Object ref = bucketName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      bucketName_ = b;
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
      output.writeMessage(1, getAwsAccount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, bucketName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getAwsAccount());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(bucketName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, bucketName_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.AmazonS3Bucket)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.AmazonS3Bucket other = (com.google.privacy.dlp.v2.AmazonS3Bucket) obj;

    if (hasAwsAccount() != other.hasAwsAccount()) return false;
    if (hasAwsAccount()) {
      if (!getAwsAccount().equals(other.getAwsAccount())) return false;
    }
    if (!getBucketName().equals(other.getBucketName())) return false;
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
    if (hasAwsAccount()) {
      hash = (37 * hash) + AWS_ACCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAwsAccount().hashCode();
    }
    hash = (37 * hash) + BUCKET_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getBucketName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.AmazonS3Bucket prototype) {
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
   * Amazon S3 bucket.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.AmazonS3Bucket}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.AmazonS3Bucket)
      com.google.privacy.dlp.v2.AmazonS3BucketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_AmazonS3Bucket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_AmazonS3Bucket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.AmazonS3Bucket.class,
              com.google.privacy.dlp.v2.AmazonS3Bucket.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.AmazonS3Bucket.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAwsAccountFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      awsAccount_ = null;
      if (awsAccountBuilder_ != null) {
        awsAccountBuilder_.dispose();
        awsAccountBuilder_ = null;
      }
      bucketName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_AmazonS3Bucket_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3Bucket getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.AmazonS3Bucket.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3Bucket build() {
      com.google.privacy.dlp.v2.AmazonS3Bucket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.AmazonS3Bucket buildPartial() {
      com.google.privacy.dlp.v2.AmazonS3Bucket result =
          new com.google.privacy.dlp.v2.AmazonS3Bucket(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.AmazonS3Bucket result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.awsAccount_ = awsAccountBuilder_ == null ? awsAccount_ : awsAccountBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.bucketName_ = bucketName_;
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
      if (other instanceof com.google.privacy.dlp.v2.AmazonS3Bucket) {
        return mergeFrom((com.google.privacy.dlp.v2.AmazonS3Bucket) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.AmazonS3Bucket other) {
      if (other == com.google.privacy.dlp.v2.AmazonS3Bucket.getDefaultInstance()) return this;
      if (other.hasAwsAccount()) {
        mergeAwsAccount(other.getAwsAccount());
      }
      if (!other.getBucketName().isEmpty()) {
        bucketName_ = other.bucketName_;
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
                input.readMessage(getAwsAccountFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                bucketName_ = input.readStringRequireUtf8();
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

    private com.google.privacy.dlp.v2.AwsAccount awsAccount_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.AwsAccount,
            com.google.privacy.dlp.v2.AwsAccount.Builder,
            com.google.privacy.dlp.v2.AwsAccountOrBuilder>
        awsAccountBuilder_;
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     *
     * @return Whether the awsAccount field is set.
     */
    public boolean hasAwsAccount() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     *
     * @return The awsAccount.
     */
    public com.google.privacy.dlp.v2.AwsAccount getAwsAccount() {
      if (awsAccountBuilder_ == null) {
        return awsAccount_ == null
            ? com.google.privacy.dlp.v2.AwsAccount.getDefaultInstance()
            : awsAccount_;
      } else {
        return awsAccountBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    public Builder setAwsAccount(com.google.privacy.dlp.v2.AwsAccount value) {
      if (awsAccountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        awsAccount_ = value;
      } else {
        awsAccountBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    public Builder setAwsAccount(com.google.privacy.dlp.v2.AwsAccount.Builder builderForValue) {
      if (awsAccountBuilder_ == null) {
        awsAccount_ = builderForValue.build();
      } else {
        awsAccountBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    public Builder mergeAwsAccount(com.google.privacy.dlp.v2.AwsAccount value) {
      if (awsAccountBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && awsAccount_ != null
            && awsAccount_ != com.google.privacy.dlp.v2.AwsAccount.getDefaultInstance()) {
          getAwsAccountBuilder().mergeFrom(value);
        } else {
          awsAccount_ = value;
        }
      } else {
        awsAccountBuilder_.mergeFrom(value);
      }
      if (awsAccount_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    public Builder clearAwsAccount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      awsAccount_ = null;
      if (awsAccountBuilder_ != null) {
        awsAccountBuilder_.dispose();
        awsAccountBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    public com.google.privacy.dlp.v2.AwsAccount.Builder getAwsAccountBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAwsAccountFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    public com.google.privacy.dlp.v2.AwsAccountOrBuilder getAwsAccountOrBuilder() {
      if (awsAccountBuilder_ != null) {
        return awsAccountBuilder_.getMessageOrBuilder();
      } else {
        return awsAccount_ == null
            ? com.google.privacy.dlp.v2.AwsAccount.getDefaultInstance()
            : awsAccount_;
      }
    }
    /**
     *
     *
     * <pre>
     * The AWS account.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.AwsAccount aws_account = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.AwsAccount,
            com.google.privacy.dlp.v2.AwsAccount.Builder,
            com.google.privacy.dlp.v2.AwsAccountOrBuilder>
        getAwsAccountFieldBuilder() {
      if (awsAccountBuilder_ == null) {
        awsAccountBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.AwsAccount,
                com.google.privacy.dlp.v2.AwsAccount.Builder,
                com.google.privacy.dlp.v2.AwsAccountOrBuilder>(
                getAwsAccount(), getParentForChildren(), isClean());
        awsAccount_ = null;
      }
      return awsAccountBuilder_;
    }

    private java.lang.Object bucketName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The bucket name.
     * </pre>
     *
     * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bucketName.
     */
    public java.lang.String getBucketName() {
      java.lang.Object ref = bucketName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        bucketName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The bucket name.
     * </pre>
     *
     * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for bucketName.
     */
    public com.google.protobuf.ByteString getBucketNameBytes() {
      java.lang.Object ref = bucketName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        bucketName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The bucket name.
     * </pre>
     *
     * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bucketName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The bucket name.
     * </pre>
     *
     * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBucketName() {
      bucketName_ = getDefaultInstance().getBucketName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The bucket name.
     * </pre>
     *
     * <code>string bucket_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for bucketName to set.
     * @return This builder for chaining.
     */
    public Builder setBucketNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bucketName_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.AmazonS3Bucket)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.AmazonS3Bucket)
  private static final com.google.privacy.dlp.v2.AmazonS3Bucket DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.AmazonS3Bucket();
  }

  public static com.google.privacy.dlp.v2.AmazonS3Bucket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AmazonS3Bucket> PARSER =
      new com.google.protobuf.AbstractParser<AmazonS3Bucket>() {
        @java.lang.Override
        public AmazonS3Bucket parsePartialFrom(
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

  public static com.google.protobuf.Parser<AmazonS3Bucket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AmazonS3Bucket> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.AmazonS3Bucket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
