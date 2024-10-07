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
// source: google/cloud/securitycenter/v1/cloud_armor.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.securitycenter.v1;

/**
 *
 *
 * <pre>
 * Information about the requests relevant to the finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v1.Requests}
 */
public final class Requests extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v1.Requests)
    RequestsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Requests.newBuilder() to construct.
  private Requests(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Requests() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Requests();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v1.CloudArmorProto
        .internal_static_google_cloud_securitycenter_v1_Requests_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v1.CloudArmorProto
        .internal_static_google_cloud_securitycenter_v1_Requests_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v1.Requests.class,
            com.google.cloud.securitycenter.v1.Requests.Builder.class);
  }

  public static final int RATIO_FIELD_NUMBER = 1;
  private double ratio_ = 0D;
  /**
   *
   *
   * <pre>
   * For 'Increasing deny ratio', the ratio is the denied traffic divided by the
   * allowed traffic. For 'Allowed traffic spike', the ratio is the allowed
   * traffic in the short term divided by allowed traffic in the long term.
   * </pre>
   *
   * <code>double ratio = 1;</code>
   *
   * @return The ratio.
   */
  @java.lang.Override
  public double getRatio() {
    return ratio_;
  }

  public static final int SHORT_TERM_ALLOWED_FIELD_NUMBER = 2;
  private int shortTermAllowed_ = 0;
  /**
   *
   *
   * <pre>
   * Allowed RPS (requests per second) in the short term.
   * </pre>
   *
   * <code>int32 short_term_allowed = 2;</code>
   *
   * @return The shortTermAllowed.
   */
  @java.lang.Override
  public int getShortTermAllowed() {
    return shortTermAllowed_;
  }

  public static final int LONG_TERM_ALLOWED_FIELD_NUMBER = 3;
  private int longTermAllowed_ = 0;
  /**
   *
   *
   * <pre>
   * Allowed RPS (requests per second) over the long term.
   * </pre>
   *
   * <code>int32 long_term_allowed = 3;</code>
   *
   * @return The longTermAllowed.
   */
  @java.lang.Override
  public int getLongTermAllowed() {
    return longTermAllowed_;
  }

  public static final int LONG_TERM_DENIED_FIELD_NUMBER = 4;
  private int longTermDenied_ = 0;
  /**
   *
   *
   * <pre>
   * Denied RPS (requests per second) over the long term.
   * </pre>
   *
   * <code>int32 long_term_denied = 4;</code>
   *
   * @return The longTermDenied.
   */
  @java.lang.Override
  public int getLongTermDenied() {
    return longTermDenied_;
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
    if (java.lang.Double.doubleToRawLongBits(ratio_) != 0) {
      output.writeDouble(1, ratio_);
    }
    if (shortTermAllowed_ != 0) {
      output.writeInt32(2, shortTermAllowed_);
    }
    if (longTermAllowed_ != 0) {
      output.writeInt32(3, longTermAllowed_);
    }
    if (longTermDenied_ != 0) {
      output.writeInt32(4, longTermDenied_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Double.doubleToRawLongBits(ratio_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeDoubleSize(1, ratio_);
    }
    if (shortTermAllowed_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, shortTermAllowed_);
    }
    if (longTermAllowed_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, longTermAllowed_);
    }
    if (longTermDenied_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, longTermDenied_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v1.Requests)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v1.Requests other =
        (com.google.cloud.securitycenter.v1.Requests) obj;

    if (java.lang.Double.doubleToLongBits(getRatio())
        != java.lang.Double.doubleToLongBits(other.getRatio())) return false;
    if (getShortTermAllowed() != other.getShortTermAllowed()) return false;
    if (getLongTermAllowed() != other.getLongTermAllowed()) return false;
    if (getLongTermDenied() != other.getLongTermDenied()) return false;
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
    hash = (37 * hash) + RATIO_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(getRatio()));
    hash = (37 * hash) + SHORT_TERM_ALLOWED_FIELD_NUMBER;
    hash = (53 * hash) + getShortTermAllowed();
    hash = (37 * hash) + LONG_TERM_ALLOWED_FIELD_NUMBER;
    hash = (53 * hash) + getLongTermAllowed();
    hash = (37 * hash) + LONG_TERM_DENIED_FIELD_NUMBER;
    hash = (53 * hash) + getLongTermDenied();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v1.Requests parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v1.Requests prototype) {
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
   * Information about the requests relevant to the finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v1.Requests}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v1.Requests)
      com.google.cloud.securitycenter.v1.RequestsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v1.CloudArmorProto
          .internal_static_google_cloud_securitycenter_v1_Requests_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v1.CloudArmorProto
          .internal_static_google_cloud_securitycenter_v1_Requests_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v1.Requests.class,
              com.google.cloud.securitycenter.v1.Requests.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v1.Requests.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ratio_ = 0D;
      shortTermAllowed_ = 0;
      longTermAllowed_ = 0;
      longTermDenied_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v1.CloudArmorProto
          .internal_static_google_cloud_securitycenter_v1_Requests_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Requests getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v1.Requests.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Requests build() {
      com.google.cloud.securitycenter.v1.Requests result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v1.Requests buildPartial() {
      com.google.cloud.securitycenter.v1.Requests result =
          new com.google.cloud.securitycenter.v1.Requests(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v1.Requests result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ratio_ = ratio_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shortTermAllowed_ = shortTermAllowed_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.longTermAllowed_ = longTermAllowed_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.longTermDenied_ = longTermDenied_;
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
      if (other instanceof com.google.cloud.securitycenter.v1.Requests) {
        return mergeFrom((com.google.cloud.securitycenter.v1.Requests) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v1.Requests other) {
      if (other == com.google.cloud.securitycenter.v1.Requests.getDefaultInstance()) return this;
      if (other.getRatio() != 0D) {
        setRatio(other.getRatio());
      }
      if (other.getShortTermAllowed() != 0) {
        setShortTermAllowed(other.getShortTermAllowed());
      }
      if (other.getLongTermAllowed() != 0) {
        setLongTermAllowed(other.getLongTermAllowed());
      }
      if (other.getLongTermDenied() != 0) {
        setLongTermDenied(other.getLongTermDenied());
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
            case 9:
              {
                ratio_ = input.readDouble();
                bitField0_ |= 0x00000001;
                break;
              } // case 9
            case 16:
              {
                shortTermAllowed_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                longTermAllowed_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                longTermDenied_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private double ratio_;
    /**
     *
     *
     * <pre>
     * For 'Increasing deny ratio', the ratio is the denied traffic divided by the
     * allowed traffic. For 'Allowed traffic spike', the ratio is the allowed
     * traffic in the short term divided by allowed traffic in the long term.
     * </pre>
     *
     * <code>double ratio = 1;</code>
     *
     * @return The ratio.
     */
    @java.lang.Override
    public double getRatio() {
      return ratio_;
    }
    /**
     *
     *
     * <pre>
     * For 'Increasing deny ratio', the ratio is the denied traffic divided by the
     * allowed traffic. For 'Allowed traffic spike', the ratio is the allowed
     * traffic in the short term divided by allowed traffic in the long term.
     * </pre>
     *
     * <code>double ratio = 1;</code>
     *
     * @param value The ratio to set.
     * @return This builder for chaining.
     */
    public Builder setRatio(double value) {

      ratio_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For 'Increasing deny ratio', the ratio is the denied traffic divided by the
     * allowed traffic. For 'Allowed traffic spike', the ratio is the allowed
     * traffic in the short term divided by allowed traffic in the long term.
     * </pre>
     *
     * <code>double ratio = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRatio() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ratio_ = 0D;
      onChanged();
      return this;
    }

    private int shortTermAllowed_;
    /**
     *
     *
     * <pre>
     * Allowed RPS (requests per second) in the short term.
     * </pre>
     *
     * <code>int32 short_term_allowed = 2;</code>
     *
     * @return The shortTermAllowed.
     */
    @java.lang.Override
    public int getShortTermAllowed() {
      return shortTermAllowed_;
    }
    /**
     *
     *
     * <pre>
     * Allowed RPS (requests per second) in the short term.
     * </pre>
     *
     * <code>int32 short_term_allowed = 2;</code>
     *
     * @param value The shortTermAllowed to set.
     * @return This builder for chaining.
     */
    public Builder setShortTermAllowed(int value) {

      shortTermAllowed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Allowed RPS (requests per second) in the short term.
     * </pre>
     *
     * <code>int32 short_term_allowed = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearShortTermAllowed() {
      bitField0_ = (bitField0_ & ~0x00000002);
      shortTermAllowed_ = 0;
      onChanged();
      return this;
    }

    private int longTermAllowed_;
    /**
     *
     *
     * <pre>
     * Allowed RPS (requests per second) over the long term.
     * </pre>
     *
     * <code>int32 long_term_allowed = 3;</code>
     *
     * @return The longTermAllowed.
     */
    @java.lang.Override
    public int getLongTermAllowed() {
      return longTermAllowed_;
    }
    /**
     *
     *
     * <pre>
     * Allowed RPS (requests per second) over the long term.
     * </pre>
     *
     * <code>int32 long_term_allowed = 3;</code>
     *
     * @param value The longTermAllowed to set.
     * @return This builder for chaining.
     */
    public Builder setLongTermAllowed(int value) {

      longTermAllowed_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Allowed RPS (requests per second) over the long term.
     * </pre>
     *
     * <code>int32 long_term_allowed = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLongTermAllowed() {
      bitField0_ = (bitField0_ & ~0x00000004);
      longTermAllowed_ = 0;
      onChanged();
      return this;
    }

    private int longTermDenied_;
    /**
     *
     *
     * <pre>
     * Denied RPS (requests per second) over the long term.
     * </pre>
     *
     * <code>int32 long_term_denied = 4;</code>
     *
     * @return The longTermDenied.
     */
    @java.lang.Override
    public int getLongTermDenied() {
      return longTermDenied_;
    }
    /**
     *
     *
     * <pre>
     * Denied RPS (requests per second) over the long term.
     * </pre>
     *
     * <code>int32 long_term_denied = 4;</code>
     *
     * @param value The longTermDenied to set.
     * @return This builder for chaining.
     */
    public Builder setLongTermDenied(int value) {

      longTermDenied_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Denied RPS (requests per second) over the long term.
     * </pre>
     *
     * <code>int32 long_term_denied = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLongTermDenied() {
      bitField0_ = (bitField0_ & ~0x00000008);
      longTermDenied_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v1.Requests)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v1.Requests)
  private static final com.google.cloud.securitycenter.v1.Requests DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v1.Requests();
  }

  public static com.google.cloud.securitycenter.v1.Requests getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Requests> PARSER =
      new com.google.protobuf.AbstractParser<Requests>() {
        @java.lang.Override
        public Requests parsePartialFrom(
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

  public static com.google.protobuf.Parser<Requests> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Requests> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v1.Requests getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
