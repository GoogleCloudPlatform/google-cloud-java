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
// source: google/cloud/billing/v1/cloud_catalog.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.billing.v1;

/**
 *
 *
 * <pre>
 * Response message for `ListServices`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.v1.ListServicesResponse}
 */
public final class ListServicesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.v1.ListServicesResponse)
    ListServicesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListServicesResponse.newBuilder() to construct.
  private ListServicesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListServicesResponse() {
    services_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListServicesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.v1.CloudCatalogProto
        .internal_static_google_cloud_billing_v1_ListServicesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.v1.CloudCatalogProto
        .internal_static_google_cloud_billing_v1_ListServicesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.v1.ListServicesResponse.class,
            com.google.cloud.billing.v1.ListServicesResponse.Builder.class);
  }

  public static final int SERVICES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.billing.v1.Service> services_;
  /**
   *
   *
   * <pre>
   * A list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.billing.v1.Service> getServicesList() {
    return services_;
  }
  /**
   *
   *
   * <pre>
   * A list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.billing.v1.ServiceOrBuilder>
      getServicesOrBuilderList() {
    return services_;
  }
  /**
   *
   *
   * <pre>
   * A list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
   */
  @java.lang.Override
  public int getServicesCount() {
    return services_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.Service getServices(int index) {
    return services_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of services.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.billing.v1.ServiceOrBuilder getServicesOrBuilder(int index) {
    return services_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. To retrieve the next page,
   * call `ListServices` again with the `page_token` field set to this
   * value. This field is empty if there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. To retrieve the next page,
   * call `ListServices` again with the `page_token` field set to this
   * value. This field is empty if there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < services_.size(); i++) {
      output.writeMessage(1, services_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < services_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, services_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.billing.v1.ListServicesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.v1.ListServicesResponse other =
        (com.google.cloud.billing.v1.ListServicesResponse) obj;

    if (!getServicesList().equals(other.getServicesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getServicesCount() > 0) {
      hash = (37 * hash) + SERVICES_FIELD_NUMBER;
      hash = (53 * hash) + getServicesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.v1.ListServicesResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.billing.v1.ListServicesResponse prototype) {
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
   * Response message for `ListServices`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.v1.ListServicesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.v1.ListServicesResponse)
      com.google.cloud.billing.v1.ListServicesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.v1.CloudCatalogProto
          .internal_static_google_cloud_billing_v1_ListServicesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.v1.CloudCatalogProto
          .internal_static_google_cloud_billing_v1_ListServicesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.v1.ListServicesResponse.class,
              com.google.cloud.billing.v1.ListServicesResponse.Builder.class);
    }

    // Construct using com.google.cloud.billing.v1.ListServicesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
      } else {
        services_ = null;
        servicesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.v1.CloudCatalogProto
          .internal_static_google_cloud_billing_v1_ListServicesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.ListServicesResponse getDefaultInstanceForType() {
      return com.google.cloud.billing.v1.ListServicesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.ListServicesResponse build() {
      com.google.cloud.billing.v1.ListServicesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.v1.ListServicesResponse buildPartial() {
      com.google.cloud.billing.v1.ListServicesResponse result =
          new com.google.cloud.billing.v1.ListServicesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.billing.v1.ListServicesResponse result) {
      if (servicesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          services_ = java.util.Collections.unmodifiableList(services_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.services_ = services_;
      } else {
        result.services_ = servicesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.billing.v1.ListServicesResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.billing.v1.ListServicesResponse) {
        return mergeFrom((com.google.cloud.billing.v1.ListServicesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.v1.ListServicesResponse other) {
      if (other == com.google.cloud.billing.v1.ListServicesResponse.getDefaultInstance())
        return this;
      if (servicesBuilder_ == null) {
        if (!other.services_.isEmpty()) {
          if (services_.isEmpty()) {
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServicesIsMutable();
            services_.addAll(other.services_);
          }
          onChanged();
        }
      } else {
        if (!other.services_.isEmpty()) {
          if (servicesBuilder_.isEmpty()) {
            servicesBuilder_.dispose();
            servicesBuilder_ = null;
            services_ = other.services_;
            bitField0_ = (bitField0_ & ~0x00000001);
            servicesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getServicesFieldBuilder()
                    : null;
          } else {
            servicesBuilder_.addAllMessages(other.services_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
                com.google.cloud.billing.v1.Service m =
                    input.readMessage(
                        com.google.cloud.billing.v1.Service.parser(), extensionRegistry);
                if (servicesBuilder_ == null) {
                  ensureServicesIsMutable();
                  services_.add(m);
                } else {
                  servicesBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.billing.v1.Service> services_ =
        java.util.Collections.emptyList();

    private void ensureServicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        services_ = new java.util.ArrayList<com.google.cloud.billing.v1.Service>(services_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.billing.v1.Service,
            com.google.cloud.billing.v1.Service.Builder,
            com.google.cloud.billing.v1.ServiceOrBuilder>
        servicesBuilder_;

    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public java.util.List<com.google.cloud.billing.v1.Service> getServicesList() {
      if (servicesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(services_);
      } else {
        return servicesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public int getServicesCount() {
      if (servicesBuilder_ == null) {
        return services_.size();
      } else {
        return servicesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public com.google.cloud.billing.v1.Service getServices(int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);
      } else {
        return servicesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder setServices(int index, com.google.cloud.billing.v1.Service value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.set(index, value);
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder setServices(
        int index, com.google.cloud.billing.v1.Service.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.set(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder addServices(com.google.cloud.billing.v1.Service value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder addServices(int index, com.google.cloud.billing.v1.Service value) {
      if (servicesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServicesIsMutable();
        services_.add(index, value);
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder addServices(com.google.cloud.billing.v1.Service.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder addServices(
        int index, com.google.cloud.billing.v1.Service.Builder builderForValue) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.add(index, builderForValue.build());
        onChanged();
      } else {
        servicesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder addAllServices(
        java.lang.Iterable<? extends com.google.cloud.billing.v1.Service> values) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, services_);
        onChanged();
      } else {
        servicesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder clearServices() {
      if (servicesBuilder_ == null) {
        services_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        servicesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public Builder removeServices(int index) {
      if (servicesBuilder_ == null) {
        ensureServicesIsMutable();
        services_.remove(index);
        onChanged();
      } else {
        servicesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public com.google.cloud.billing.v1.Service.Builder getServicesBuilder(int index) {
      return getServicesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public com.google.cloud.billing.v1.ServiceOrBuilder getServicesOrBuilder(int index) {
      if (servicesBuilder_ == null) {
        return services_.get(index);
      } else {
        return servicesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.billing.v1.ServiceOrBuilder>
        getServicesOrBuilderList() {
      if (servicesBuilder_ != null) {
        return servicesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(services_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public com.google.cloud.billing.v1.Service.Builder addServicesBuilder() {
      return getServicesFieldBuilder()
          .addBuilder(com.google.cloud.billing.v1.Service.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public com.google.cloud.billing.v1.Service.Builder addServicesBuilder(int index) {
      return getServicesFieldBuilder()
          .addBuilder(index, com.google.cloud.billing.v1.Service.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of services.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.v1.Service services = 1;</code>
     */
    public java.util.List<com.google.cloud.billing.v1.Service.Builder> getServicesBuilderList() {
      return getServicesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.billing.v1.Service,
            com.google.cloud.billing.v1.Service.Builder,
            com.google.cloud.billing.v1.ServiceOrBuilder>
        getServicesFieldBuilder() {
      if (servicesBuilder_ == null) {
        servicesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.billing.v1.Service,
                com.google.cloud.billing.v1.Service.Builder,
                com.google.cloud.billing.v1.ServiceOrBuilder>(
                services_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        services_ = null;
      }
      return servicesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. To retrieve the next page,
     * call `ListServices` again with the `page_token` field set to this
     * value. This field is empty if there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. To retrieve the next page,
     * call `ListServices` again with the `page_token` field set to this
     * value. This field is empty if there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. To retrieve the next page,
     * call `ListServices` again with the `page_token` field set to this
     * value. This field is empty if there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. To retrieve the next page,
     * call `ListServices` again with the `page_token` field set to this
     * value. This field is empty if there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. To retrieve the next page,
     * call `ListServices` again with the `page_token` field set to this
     * value. This field is empty if there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.v1.ListServicesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.v1.ListServicesResponse)
  private static final com.google.cloud.billing.v1.ListServicesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.v1.ListServicesResponse();
  }

  public static com.google.cloud.billing.v1.ListServicesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServicesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListServicesResponse>() {
        @java.lang.Override
        public ListServicesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListServicesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServicesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.v1.ListServicesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
