// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

/**
 * <pre>
 * The `ListMonitoredResourceDescriptors` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListMonitoredResourceDescriptorsResponse}
 */
public  final class ListMonitoredResourceDescriptorsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListMonitoredResourceDescriptorsResponse)
    ListMonitoredResourceDescriptorsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMonitoredResourceDescriptorsResponse.newBuilder() to construct.
  private ListMonitoredResourceDescriptorsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMonitoredResourceDescriptorsResponse() {
    resourceDescriptors_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListMonitoredResourceDescriptorsResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              resourceDescriptors_ = new java.util.ArrayList<com.google.api.MonitoredResourceDescriptor>();
              mutable_bitField0_ |= 0x00000001;
            }
            resourceDescriptors_.add(
                input.readMessage(com.google.api.MonitoredResourceDescriptor.parser(), extensionRegistry));
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            nextPageToken_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        resourceDescriptors_ = java.util.Collections.unmodifiableList(resourceDescriptors_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.class, com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_DESCRIPTORS_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.MonitoredResourceDescriptor> resourceDescriptors_;
  /**
   * <pre>
   * The monitored resource descriptors that are available to this project
   * and that match `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  public java.util.List<com.google.api.MonitoredResourceDescriptor> getResourceDescriptorsList() {
    return resourceDescriptors_;
  }
  /**
   * <pre>
   * The monitored resource descriptors that are available to this project
   * and that match `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  public java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder> 
      getResourceDescriptorsOrBuilderList() {
    return resourceDescriptors_;
  }
  /**
   * <pre>
   * The monitored resource descriptors that are available to this project
   * and that match `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  public int getResourceDescriptorsCount() {
    return resourceDescriptors_.size();
  }
  /**
   * <pre>
   * The monitored resource descriptors that are available to this project
   * and that match `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  public com.google.api.MonitoredResourceDescriptor getResourceDescriptors(int index) {
    return resourceDescriptors_.get(index);
  }
  /**
   * <pre>
   * The monitored resource descriptors that are available to this project
   * and that match `filter`, if present.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  public com.google.api.MonitoredResourceDescriptorOrBuilder getResourceDescriptorsOrBuilder(
      int index) {
    return resourceDescriptors_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `pageToken` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < resourceDescriptors_.size(); i++) {
      output.writeMessage(1, resourceDescriptors_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < resourceDescriptors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, resourceDescriptors_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse other = (com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse) obj;

    boolean result = true;
    result = result && getResourceDescriptorsList()
        .equals(other.getResourceDescriptorsList());
    result = result && getNextPageToken()
        .equals(other.getNextPageToken());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getResourceDescriptorsCount() > 0) {
      hash = (37 * hash) + RESOURCE_DESCRIPTORS_FIELD_NUMBER;
      hash = (53 * hash) + getResourceDescriptorsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * The `ListMonitoredResourceDescriptors` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListMonitoredResourceDescriptorsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListMonitoredResourceDescriptorsResponse)
      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.class, com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getResourceDescriptorsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (resourceDescriptorsBuilder_ == null) {
        resourceDescriptors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        resourceDescriptorsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto.internal_static_google_monitoring_v3_ListMonitoredResourceDescriptorsResponse_descriptor;
    }

    public com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.getDefaultInstance();
    }

    public com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse build() {
      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse buildPartial() {
      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse result = new com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (resourceDescriptorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          resourceDescriptors_ = java.util.Collections.unmodifiableList(resourceDescriptors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.resourceDescriptors_ = resourceDescriptors_;
      } else {
        result.resourceDescriptors_ = resourceDescriptorsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse) {
        return mergeFrom((com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse other) {
      if (other == com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.getDefaultInstance()) return this;
      if (resourceDescriptorsBuilder_ == null) {
        if (!other.resourceDescriptors_.isEmpty()) {
          if (resourceDescriptors_.isEmpty()) {
            resourceDescriptors_ = other.resourceDescriptors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResourceDescriptorsIsMutable();
            resourceDescriptors_.addAll(other.resourceDescriptors_);
          }
          onChanged();
        }
      } else {
        if (!other.resourceDescriptors_.isEmpty()) {
          if (resourceDescriptorsBuilder_.isEmpty()) {
            resourceDescriptorsBuilder_.dispose();
            resourceDescriptorsBuilder_ = null;
            resourceDescriptors_ = other.resourceDescriptors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resourceDescriptorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResourceDescriptorsFieldBuilder() : null;
          } else {
            resourceDescriptorsBuilder_.addAllMessages(other.resourceDescriptors_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.api.MonitoredResourceDescriptor> resourceDescriptors_ =
      java.util.Collections.emptyList();
    private void ensureResourceDescriptorsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        resourceDescriptors_ = new java.util.ArrayList<com.google.api.MonitoredResourceDescriptor>(resourceDescriptors_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.MonitoredResourceDescriptor, com.google.api.MonitoredResourceDescriptor.Builder, com.google.api.MonitoredResourceDescriptorOrBuilder> resourceDescriptorsBuilder_;

    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public java.util.List<com.google.api.MonitoredResourceDescriptor> getResourceDescriptorsList() {
      if (resourceDescriptorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(resourceDescriptors_);
      } else {
        return resourceDescriptorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public int getResourceDescriptorsCount() {
      if (resourceDescriptorsBuilder_ == null) {
        return resourceDescriptors_.size();
      } else {
        return resourceDescriptorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor getResourceDescriptors(int index) {
      if (resourceDescriptorsBuilder_ == null) {
        return resourceDescriptors_.get(index);
      } else {
        return resourceDescriptorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder setResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor value) {
      if (resourceDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.set(index, value);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder setResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor.Builder builderForValue) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.set(index, builderForValue.build());
        onChanged();
      } else {
        resourceDescriptorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(com.google.api.MonitoredResourceDescriptor value) {
      if (resourceDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(value);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor value) {
      if (resourceDescriptorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(index, value);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(
        com.google.api.MonitoredResourceDescriptor.Builder builderForValue) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(builderForValue.build());
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addResourceDescriptors(
        int index, com.google.api.MonitoredResourceDescriptor.Builder builderForValue) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.add(index, builderForValue.build());
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder addAllResourceDescriptors(
        java.lang.Iterable<? extends com.google.api.MonitoredResourceDescriptor> values) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, resourceDescriptors_);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder clearResourceDescriptors() {
      if (resourceDescriptorsBuilder_ == null) {
        resourceDescriptors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public Builder removeResourceDescriptors(int index) {
      if (resourceDescriptorsBuilder_ == null) {
        ensureResourceDescriptorsIsMutable();
        resourceDescriptors_.remove(index);
        onChanged();
      } else {
        resourceDescriptorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor.Builder getResourceDescriptorsBuilder(
        int index) {
      return getResourceDescriptorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptorOrBuilder getResourceDescriptorsOrBuilder(
        int index) {
      if (resourceDescriptorsBuilder_ == null) {
        return resourceDescriptors_.get(index);  } else {
        return resourceDescriptorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder> 
         getResourceDescriptorsOrBuilderList() {
      if (resourceDescriptorsBuilder_ != null) {
        return resourceDescriptorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(resourceDescriptors_);
      }
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor.Builder addResourceDescriptorsBuilder() {
      return getResourceDescriptorsFieldBuilder().addBuilder(
          com.google.api.MonitoredResourceDescriptor.getDefaultInstance());
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public com.google.api.MonitoredResourceDescriptor.Builder addResourceDescriptorsBuilder(
        int index) {
      return getResourceDescriptorsFieldBuilder().addBuilder(
          index, com.google.api.MonitoredResourceDescriptor.getDefaultInstance());
    }
    /**
     * <pre>
     * The monitored resource descriptors that are available to this project
     * and that match `filter`, if present.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
     */
    public java.util.List<com.google.api.MonitoredResourceDescriptor.Builder> 
         getResourceDescriptorsBuilderList() {
      return getResourceDescriptorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.api.MonitoredResourceDescriptor, com.google.api.MonitoredResourceDescriptor.Builder, com.google.api.MonitoredResourceDescriptorOrBuilder> 
        getResourceDescriptorsFieldBuilder() {
      if (resourceDescriptorsBuilder_ == null) {
        resourceDescriptorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.MonitoredResourceDescriptor, com.google.api.MonitoredResourceDescriptor.Builder, com.google.api.MonitoredResourceDescriptorOrBuilder>(
                resourceDescriptors_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        resourceDescriptors_ = null;
      }
      return resourceDescriptorsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder clearNextPageToken() {
      
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If there are more results than have been returned, then this field is set
     * to a non-empty value.  To see the additional results,
     * use that value as `pageToken` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nextPageToken_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListMonitoredResourceDescriptorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListMonitoredResourceDescriptorsResponse)
  private static final com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse();
  }

  public static com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMonitoredResourceDescriptorsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListMonitoredResourceDescriptorsResponse>() {
    public ListMonitoredResourceDescriptorsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ListMonitoredResourceDescriptorsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListMonitoredResourceDescriptorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMonitoredResourceDescriptorsResponse> getParserForType() {
    return PARSER;
  }

  public com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

