// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/http.proto

package com.google.api;

/**
 * Protobuf type {@code google.api.MediaUpload}
 *
 * <pre>
 * Do not use this. For media support, add instead
 * [][google.bytestream.RestByteStream] as an API to your
 * configuration.
 * </pre>
 */
public  final class MediaUpload extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:google.api.MediaUpload)
    MediaUploadOrBuilder {
  // Use MediaUpload.newBuilder() to construct.
  private MediaUpload(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MediaUpload() {
    enabled_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private MediaUpload(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 24: {

            enabled_ = input.readBool();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.HttpProto.internal_static_google_api_MediaUpload_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.HttpProto.internal_static_google_api_MediaUpload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.MediaUpload.class, com.google.api.MediaUpload.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 3;
  private boolean enabled_;
  /**
   * <code>optional bool enabled = 3;</code>
   *
   * <pre>
   * Whether upload is enabled.
   * </pre>
   */
  public boolean getEnabled() {
    return enabled_;
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
    if (enabled_ != false) {
      output.writeBool(3, enabled_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, enabled_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static com.google.api.MediaUpload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.MediaUpload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.MediaUpload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.MediaUpload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.MediaUpload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.MediaUpload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static com.google.api.MediaUpload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static com.google.api.MediaUpload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static com.google.api.MediaUpload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static com.google.api.MediaUpload parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.api.MediaUpload prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code google.api.MediaUpload}
   *
   * <pre>
   * Do not use this. For media support, add instead
   * [][google.bytestream.RestByteStream] as an API to your
   * configuration.
   * </pre>
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.MediaUpload)
      com.google.api.MediaUploadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.HttpProto.internal_static_google_api_MediaUpload_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.HttpProto.internal_static_google_api_MediaUpload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.MediaUpload.class, com.google.api.MediaUpload.Builder.class);
    }

    // Construct using com.google.api.MediaUpload.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      enabled_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.HttpProto.internal_static_google_api_MediaUpload_descriptor;
    }

    public com.google.api.MediaUpload getDefaultInstanceForType() {
      return com.google.api.MediaUpload.getDefaultInstance();
    }

    public com.google.api.MediaUpload build() {
      com.google.api.MediaUpload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.api.MediaUpload buildPartial() {
      com.google.api.MediaUpload result = new com.google.api.MediaUpload(this);
      result.enabled_ = enabled_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.api.MediaUpload) {
        return mergeFrom((com.google.api.MediaUpload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.MediaUpload other) {
      if (other == com.google.api.MediaUpload.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
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
      com.google.api.MediaUpload parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.MediaUpload) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enabled_ ;
    /**
     * <code>optional bool enabled = 3;</code>
     *
     * <pre>
     * Whether upload is enabled.
     * </pre>
     */
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>optional bool enabled = 3;</code>
     *
     * <pre>
     * Whether upload is enabled.
     * </pre>
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool enabled = 3;</code>
     *
     * <pre>
     * Whether upload is enabled.
     * </pre>
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:google.api.MediaUpload)
  }

  // @@protoc_insertion_point(class_scope:google.api.MediaUpload)
  private static final com.google.api.MediaUpload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.MediaUpload();
  }

  public static com.google.api.MediaUpload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaUpload>
      PARSER = new com.google.protobuf.AbstractParser<MediaUpload>() {
    public MediaUpload parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new MediaUpload(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<MediaUpload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaUpload> getParserForType() {
    return PARSER;
  }

  public com.google.api.MediaUpload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

