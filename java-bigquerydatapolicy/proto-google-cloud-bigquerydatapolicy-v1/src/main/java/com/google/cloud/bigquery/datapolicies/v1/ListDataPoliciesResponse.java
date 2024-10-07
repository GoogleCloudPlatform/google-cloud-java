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
// source: google/cloud/bigquery/datapolicies/v1/datapolicy.proto

// Protobuf Java Version: 3.25.5
package com.google.cloud.bigquery.datapolicies.v1;

/**
 *
 *
 * <pre>
 * Response message for the ListDataPolicies method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse}
 */
public final class ListDataPoliciesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse)
    ListDataPoliciesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDataPoliciesResponse.newBuilder() to construct.
  private ListDataPoliciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDataPoliciesResponse() {
    dataPolicies_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDataPoliciesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.datapolicies.v1.DataPolicyProto
        .internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.datapolicies.v1.DataPolicyProto
        .internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse.class,
            com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse.Builder.class);
  }

  public static final int DATA_POLICIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.bigquery.datapolicies.v1.DataPolicy> dataPolicies_;
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.bigquery.datapolicies.v1.DataPolicy>
      getDataPoliciesList() {
    return dataPolicies_;
  }
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder>
      getDataPoliciesOrBuilderList() {
    return dataPolicies_;
  }
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  @java.lang.Override
  public int getDataPoliciesCount() {
    return dataPolicies_.size();
  }
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datapolicies.v1.DataPolicy getDataPolicies(int index) {
    return dataPolicies_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Data policies that belong to the requested project.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder getDataPoliciesOrBuilder(
      int index) {
    return dataPolicies_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * Token used to retrieve the next page of results, or empty if there are no
   * more results.
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
   * Token used to retrieve the next page of results, or empty if there are no
   * more results.
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
    for (int i = 0; i < dataPolicies_.size(); i++) {
      output.writeMessage(1, dataPolicies_.get(i));
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
    for (int i = 0; i < dataPolicies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dataPolicies_.get(i));
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
    if (!(obj instanceof com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse other =
        (com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse) obj;

    if (!getDataPoliciesList().equals(other.getDataPoliciesList())) return false;
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
    if (getDataPoliciesCount() > 0) {
      hash = (37 * hash) + DATA_POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getDataPoliciesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse parseFrom(
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
      com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse prototype) {
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
   * Response message for the ListDataPolicies method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse)
      com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.datapolicies.v1.DataPolicyProto
          .internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.datapolicies.v1.DataPolicyProto
          .internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse.class,
              com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dataPoliciesBuilder_ == null) {
        dataPolicies_ = java.util.Collections.emptyList();
      } else {
        dataPolicies_ = null;
        dataPoliciesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.datapolicies.v1.DataPolicyProto
          .internal_static_google_cloud_bigquery_datapolicies_v1_ListDataPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse build() {
      com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse buildPartial() {
      com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse result =
          new com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse result) {
      if (dataPoliciesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataPolicies_ = java.util.Collections.unmodifiableList(dataPolicies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataPolicies_ = dataPolicies_;
      } else {
        result.dataPolicies_ = dataPoliciesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse result) {
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
      if (other instanceof com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse) {
        return mergeFrom(
            (com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse other) {
      if (other
          == com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
              .getDefaultInstance()) return this;
      if (dataPoliciesBuilder_ == null) {
        if (!other.dataPolicies_.isEmpty()) {
          if (dataPolicies_.isEmpty()) {
            dataPolicies_ = other.dataPolicies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataPoliciesIsMutable();
            dataPolicies_.addAll(other.dataPolicies_);
          }
          onChanged();
        }
      } else {
        if (!other.dataPolicies_.isEmpty()) {
          if (dataPoliciesBuilder_.isEmpty()) {
            dataPoliciesBuilder_.dispose();
            dataPoliciesBuilder_ = null;
            dataPolicies_ = other.dataPolicies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataPoliciesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDataPoliciesFieldBuilder()
                    : null;
          } else {
            dataPoliciesBuilder_.addAllMessages(other.dataPolicies_);
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
                com.google.cloud.bigquery.datapolicies.v1.DataPolicy m =
                    input.readMessage(
                        com.google.cloud.bigquery.datapolicies.v1.DataPolicy.parser(),
                        extensionRegistry);
                if (dataPoliciesBuilder_ == null) {
                  ensureDataPoliciesIsMutable();
                  dataPolicies_.add(m);
                } else {
                  dataPoliciesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.bigquery.datapolicies.v1.DataPolicy> dataPolicies_ =
        java.util.Collections.emptyList();

    private void ensureDataPoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataPolicies_ =
            new java.util.ArrayList<com.google.cloud.bigquery.datapolicies.v1.DataPolicy>(
                dataPolicies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datapolicies.v1.DataPolicy,
            com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder,
            com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder>
        dataPoliciesBuilder_;

    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datapolicies.v1.DataPolicy>
        getDataPoliciesList() {
      if (dataPoliciesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataPolicies_);
      } else {
        return dataPoliciesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public int getDataPoliciesCount() {
      if (dataPoliciesBuilder_ == null) {
        return dataPolicies_.size();
      } else {
        return dataPoliciesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public com.google.cloud.bigquery.datapolicies.v1.DataPolicy getDataPolicies(int index) {
      if (dataPoliciesBuilder_ == null) {
        return dataPolicies_.get(index);
      } else {
        return dataPoliciesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder setDataPolicies(
        int index, com.google.cloud.bigquery.datapolicies.v1.DataPolicy value) {
      if (dataPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataPoliciesIsMutable();
        dataPolicies_.set(index, value);
        onChanged();
      } else {
        dataPoliciesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder setDataPolicies(
        int index, com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder builderForValue) {
      if (dataPoliciesBuilder_ == null) {
        ensureDataPoliciesIsMutable();
        dataPolicies_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataPoliciesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder addDataPolicies(com.google.cloud.bigquery.datapolicies.v1.DataPolicy value) {
      if (dataPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataPoliciesIsMutable();
        dataPolicies_.add(value);
        onChanged();
      } else {
        dataPoliciesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder addDataPolicies(
        int index, com.google.cloud.bigquery.datapolicies.v1.DataPolicy value) {
      if (dataPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataPoliciesIsMutable();
        dataPolicies_.add(index, value);
        onChanged();
      } else {
        dataPoliciesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder addDataPolicies(
        com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder builderForValue) {
      if (dataPoliciesBuilder_ == null) {
        ensureDataPoliciesIsMutable();
        dataPolicies_.add(builderForValue.build());
        onChanged();
      } else {
        dataPoliciesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder addDataPolicies(
        int index, com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder builderForValue) {
      if (dataPoliciesBuilder_ == null) {
        ensureDataPoliciesIsMutable();
        dataPolicies_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataPoliciesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder addAllDataPolicies(
        java.lang.Iterable<? extends com.google.cloud.bigquery.datapolicies.v1.DataPolicy> values) {
      if (dataPoliciesBuilder_ == null) {
        ensureDataPoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataPolicies_);
        onChanged();
      } else {
        dataPoliciesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder clearDataPolicies() {
      if (dataPoliciesBuilder_ == null) {
        dataPolicies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataPoliciesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public Builder removeDataPolicies(int index) {
      if (dataPoliciesBuilder_ == null) {
        ensureDataPoliciesIsMutable();
        dataPolicies_.remove(index);
        onChanged();
      } else {
        dataPoliciesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder getDataPoliciesBuilder(
        int index) {
      return getDataPoliciesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder getDataPoliciesOrBuilder(
        int index) {
      if (dataPoliciesBuilder_ == null) {
        return dataPolicies_.get(index);
      } else {
        return dataPoliciesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder>
        getDataPoliciesOrBuilderList() {
      if (dataPoliciesBuilder_ != null) {
        return dataPoliciesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataPolicies_);
      }
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder addDataPoliciesBuilder() {
      return getDataPoliciesFieldBuilder()
          .addBuilder(com.google.cloud.bigquery.datapolicies.v1.DataPolicy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder addDataPoliciesBuilder(
        int index) {
      return getDataPoliciesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.bigquery.datapolicies.v1.DataPolicy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Data policies that belong to the requested project.
     * </pre>
     *
     * <code>repeated .google.cloud.bigquery.datapolicies.v1.DataPolicy data_policies = 1;</code>
     */
    public java.util.List<com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder>
        getDataPoliciesBuilderList() {
      return getDataPoliciesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.bigquery.datapolicies.v1.DataPolicy,
            com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder,
            com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder>
        getDataPoliciesFieldBuilder() {
      if (dataPoliciesBuilder_ == null) {
        dataPoliciesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.bigquery.datapolicies.v1.DataPolicy,
                com.google.cloud.bigquery.datapolicies.v1.DataPolicy.Builder,
                com.google.cloud.bigquery.datapolicies.v1.DataPolicyOrBuilder>(
                dataPolicies_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dataPolicies_ = null;
      }
      return dataPoliciesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Token used to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token used to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token used to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token used to retrieve the next page of results, or empty if there are no
     * more results.
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
     * Token used to retrieve the next page of results, or empty if there are no
     * more results.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse)
  private static final com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse();
  }

  public static com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataPoliciesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDataPoliciesResponse>() {
        @java.lang.Override
        public ListDataPoliciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDataPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.datapolicies.v1.ListDataPoliciesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
