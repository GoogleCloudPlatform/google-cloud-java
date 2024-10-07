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
// source: google/cloud/apphub/v1/apphub_service.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.apphub.v1;

/**
 *
 *
 * <pre>
 * Response for LookupDiscoveredService.
 * </pre>
 *
 * Protobuf type {@code google.cloud.apphub.v1.LookupDiscoveredServiceResponse}
 */
public final class LookupDiscoveredServiceResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.apphub.v1.LookupDiscoveredServiceResponse)
    LookupDiscoveredServiceResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LookupDiscoveredServiceResponse.newBuilder() to construct.
  private LookupDiscoveredServiceResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LookupDiscoveredServiceResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LookupDiscoveredServiceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.apphub.v1.ApphubServiceProto
        .internal_static_google_cloud_apphub_v1_LookupDiscoveredServiceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.apphub.v1.ApphubServiceProto
        .internal_static_google_cloud_apphub_v1_LookupDiscoveredServiceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.class,
            com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.Builder.class);
  }

  private int bitField0_;
  public static final int DISCOVERED_SERVICE_FIELD_NUMBER = 1;
  private com.google.cloud.apphub.v1.DiscoveredService discoveredService_;
  /**
   *
   *
   * <pre>
   * Discovered Service if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
   *
   * @return Whether the discoveredService field is set.
   */
  @java.lang.Override
  public boolean hasDiscoveredService() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Discovered Service if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
   *
   * @return The discoveredService.
   */
  @java.lang.Override
  public com.google.cloud.apphub.v1.DiscoveredService getDiscoveredService() {
    return discoveredService_ == null
        ? com.google.cloud.apphub.v1.DiscoveredService.getDefaultInstance()
        : discoveredService_;
  }
  /**
   *
   *
   * <pre>
   * Discovered Service if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.apphub.v1.DiscoveredServiceOrBuilder getDiscoveredServiceOrBuilder() {
    return discoveredService_ == null
        ? com.google.cloud.apphub.v1.DiscoveredService.getDefaultInstance()
        : discoveredService_;
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
      output.writeMessage(1, getDiscoveredService());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDiscoveredService());
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
    if (!(obj instanceof com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse other =
        (com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse) obj;

    if (hasDiscoveredService() != other.hasDiscoveredService()) return false;
    if (hasDiscoveredService()) {
      if (!getDiscoveredService().equals(other.getDiscoveredService())) return false;
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
    if (hasDiscoveredService()) {
      hash = (37 * hash) + DISCOVERED_SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getDiscoveredService().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse parseFrom(
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
      com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse prototype) {
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
   * Response for LookupDiscoveredService.
   * </pre>
   *
   * Protobuf type {@code google.cloud.apphub.v1.LookupDiscoveredServiceResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.apphub.v1.LookupDiscoveredServiceResponse)
      com.google.cloud.apphub.v1.LookupDiscoveredServiceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.apphub.v1.ApphubServiceProto
          .internal_static_google_cloud_apphub_v1_LookupDiscoveredServiceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.apphub.v1.ApphubServiceProto
          .internal_static_google_cloud_apphub_v1_LookupDiscoveredServiceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.class,
              com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.Builder.class);
    }

    // Construct using com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDiscoveredServiceFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      discoveredService_ = null;
      if (discoveredServiceBuilder_ != null) {
        discoveredServiceBuilder_.dispose();
        discoveredServiceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.apphub.v1.ApphubServiceProto
          .internal_static_google_cloud_apphub_v1_LookupDiscoveredServiceResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse getDefaultInstanceForType() {
      return com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse build() {
      com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse buildPartial() {
      com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse result =
          new com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.discoveredService_ =
            discoveredServiceBuilder_ == null
                ? discoveredService_
                : discoveredServiceBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse) {
        return mergeFrom((com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse other) {
      if (other == com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse.getDefaultInstance())
        return this;
      if (other.hasDiscoveredService()) {
        mergeDiscoveredService(other.getDiscoveredService());
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
                input.readMessage(
                    getDiscoveredServiceFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.apphub.v1.DiscoveredService discoveredService_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apphub.v1.DiscoveredService,
            com.google.cloud.apphub.v1.DiscoveredService.Builder,
            com.google.cloud.apphub.v1.DiscoveredServiceOrBuilder>
        discoveredServiceBuilder_;
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     *
     * @return Whether the discoveredService field is set.
     */
    public boolean hasDiscoveredService() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     *
     * @return The discoveredService.
     */
    public com.google.cloud.apphub.v1.DiscoveredService getDiscoveredService() {
      if (discoveredServiceBuilder_ == null) {
        return discoveredService_ == null
            ? com.google.cloud.apphub.v1.DiscoveredService.getDefaultInstance()
            : discoveredService_;
      } else {
        return discoveredServiceBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    public Builder setDiscoveredService(com.google.cloud.apphub.v1.DiscoveredService value) {
      if (discoveredServiceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        discoveredService_ = value;
      } else {
        discoveredServiceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    public Builder setDiscoveredService(
        com.google.cloud.apphub.v1.DiscoveredService.Builder builderForValue) {
      if (discoveredServiceBuilder_ == null) {
        discoveredService_ = builderForValue.build();
      } else {
        discoveredServiceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    public Builder mergeDiscoveredService(com.google.cloud.apphub.v1.DiscoveredService value) {
      if (discoveredServiceBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && discoveredService_ != null
            && discoveredService_
                != com.google.cloud.apphub.v1.DiscoveredService.getDefaultInstance()) {
          getDiscoveredServiceBuilder().mergeFrom(value);
        } else {
          discoveredService_ = value;
        }
      } else {
        discoveredServiceBuilder_.mergeFrom(value);
      }
      if (discoveredService_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    public Builder clearDiscoveredService() {
      bitField0_ = (bitField0_ & ~0x00000001);
      discoveredService_ = null;
      if (discoveredServiceBuilder_ != null) {
        discoveredServiceBuilder_.dispose();
        discoveredServiceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    public com.google.cloud.apphub.v1.DiscoveredService.Builder getDiscoveredServiceBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDiscoveredServiceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    public com.google.cloud.apphub.v1.DiscoveredServiceOrBuilder getDiscoveredServiceOrBuilder() {
      if (discoveredServiceBuilder_ != null) {
        return discoveredServiceBuilder_.getMessageOrBuilder();
      } else {
        return discoveredService_ == null
            ? com.google.cloud.apphub.v1.DiscoveredService.getDefaultInstance()
            : discoveredService_;
      }
    }
    /**
     *
     *
     * <pre>
     * Discovered Service if exists, empty otherwise.
     * </pre>
     *
     * <code>.google.cloud.apphub.v1.DiscoveredService discovered_service = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.apphub.v1.DiscoveredService,
            com.google.cloud.apphub.v1.DiscoveredService.Builder,
            com.google.cloud.apphub.v1.DiscoveredServiceOrBuilder>
        getDiscoveredServiceFieldBuilder() {
      if (discoveredServiceBuilder_ == null) {
        discoveredServiceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.apphub.v1.DiscoveredService,
                com.google.cloud.apphub.v1.DiscoveredService.Builder,
                com.google.cloud.apphub.v1.DiscoveredServiceOrBuilder>(
                getDiscoveredService(), getParentForChildren(), isClean());
        discoveredService_ = null;
      }
      return discoveredServiceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.apphub.v1.LookupDiscoveredServiceResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.apphub.v1.LookupDiscoveredServiceResponse)
  private static final com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse();
  }

  public static com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LookupDiscoveredServiceResponse> PARSER =
      new com.google.protobuf.AbstractParser<LookupDiscoveredServiceResponse>() {
        @java.lang.Override
        public LookupDiscoveredServiceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<LookupDiscoveredServiceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LookupDiscoveredServiceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.apphub.v1.LookupDiscoveredServiceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
