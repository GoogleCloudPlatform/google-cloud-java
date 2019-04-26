// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/phishingprotection/v1beta1/phishingprotection.proto

package com.google.phishingprotection.v1beta1;

/**
 *
 *
 * <pre>
 * The ReportPhishing (empty) response message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.phishingprotection.v1beta1.ReportPhishingResponse}
 */
public final class ReportPhishingResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.phishingprotection.v1beta1.ReportPhishingResponse)
    ReportPhishingResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReportPhishingResponse.newBuilder() to construct.
  private ReportPhishingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReportPhishingResponse() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ReportPhishingResponse(
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.phishingprotection.v1beta1.PhishingProtectionProto
        .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.phishingprotection.v1beta1.PhishingProtectionProto
        .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.phishingprotection.v1beta1.ReportPhishingResponse.class,
            com.google.phishingprotection.v1beta1.ReportPhishingResponse.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.phishingprotection.v1beta1.ReportPhishingResponse)) {
      return super.equals(obj);
    }
    com.google.phishingprotection.v1beta1.ReportPhishingResponse other =
        (com.google.phishingprotection.v1beta1.ReportPhishingResponse) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse parseFrom(
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
      com.google.phishingprotection.v1beta1.ReportPhishingResponse prototype) {
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
   * The ReportPhishing (empty) response message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.phishingprotection.v1beta1.ReportPhishingResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.phishingprotection.v1beta1.ReportPhishingResponse)
      com.google.phishingprotection.v1beta1.ReportPhishingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.phishingprotection.v1beta1.PhishingProtectionProto
          .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.phishingprotection.v1beta1.PhishingProtectionProto
          .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.phishingprotection.v1beta1.ReportPhishingResponse.class,
              com.google.phishingprotection.v1beta1.ReportPhishingResponse.Builder.class);
    }

    // Construct using com.google.phishingprotection.v1beta1.ReportPhishingResponse.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.phishingprotection.v1beta1.PhishingProtectionProto
          .internal_static_google_cloud_phishingprotection_v1beta1_ReportPhishingResponse_descriptor;
    }

    @java.lang.Override
    public com.google.phishingprotection.v1beta1.ReportPhishingResponse
        getDefaultInstanceForType() {
      return com.google.phishingprotection.v1beta1.ReportPhishingResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.phishingprotection.v1beta1.ReportPhishingResponse build() {
      com.google.phishingprotection.v1beta1.ReportPhishingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.phishingprotection.v1beta1.ReportPhishingResponse buildPartial() {
      com.google.phishingprotection.v1beta1.ReportPhishingResponse result =
          new com.google.phishingprotection.v1beta1.ReportPhishingResponse(this);
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
      if (other instanceof com.google.phishingprotection.v1beta1.ReportPhishingResponse) {
        return mergeFrom((com.google.phishingprotection.v1beta1.ReportPhishingResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.phishingprotection.v1beta1.ReportPhishingResponse other) {
      if (other
          == com.google.phishingprotection.v1beta1.ReportPhishingResponse.getDefaultInstance())
        return this;
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
      com.google.phishingprotection.v1beta1.ReportPhishingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.phishingprotection.v1beta1.ReportPhishingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.phishingprotection.v1beta1.ReportPhishingResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.phishingprotection.v1beta1.ReportPhishingResponse)
  private static final com.google.phishingprotection.v1beta1.ReportPhishingResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.phishingprotection.v1beta1.ReportPhishingResponse();
  }

  public static com.google.phishingprotection.v1beta1.ReportPhishingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReportPhishingResponse> PARSER =
      new com.google.protobuf.AbstractParser<ReportPhishingResponse>() {
        @java.lang.Override
        public ReportPhishingResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ReportPhishingResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ReportPhishingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReportPhishingResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.phishingprotection.v1beta1.ReportPhishingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
