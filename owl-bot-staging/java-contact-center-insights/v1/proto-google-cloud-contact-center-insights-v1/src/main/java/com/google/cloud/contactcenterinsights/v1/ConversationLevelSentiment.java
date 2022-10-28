// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * One channel of conversation-level sentiment data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.ConversationLevelSentiment}
 */
public final class ConversationLevelSentiment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.ConversationLevelSentiment)
    ConversationLevelSentimentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversationLevelSentiment.newBuilder() to construct.
  private ConversationLevelSentiment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversationLevelSentiment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversationLevelSentiment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_ConversationLevelSentiment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_ConversationLevelSentiment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.class, com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.Builder.class);
  }

  public static final int CHANNEL_TAG_FIELD_NUMBER = 1;
  private int channelTag_;
  /**
   * <pre>
   * The channel of the audio that the data applies to.
   * </pre>
   *
   * <code>int32 channel_tag = 1;</code>
   * @return The channelTag.
   */
  @java.lang.Override
  public int getChannelTag() {
    return channelTag_;
  }

  public static final int SENTIMENT_DATA_FIELD_NUMBER = 2;
  private com.google.cloud.contactcenterinsights.v1.SentimentData sentimentData_;
  /**
   * <pre>
   * Data specifying sentiment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
   * @return Whether the sentimentData field is set.
   */
  @java.lang.Override
  public boolean hasSentimentData() {
    return sentimentData_ != null;
  }
  /**
   * <pre>
   * Data specifying sentiment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
   * @return The sentimentData.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.SentimentData getSentimentData() {
    return sentimentData_ == null ? com.google.cloud.contactcenterinsights.v1.SentimentData.getDefaultInstance() : sentimentData_;
  }
  /**
   * <pre>
   * Data specifying sentiment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder getSentimentDataOrBuilder() {
    return getSentimentData();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (channelTag_ != 0) {
      output.writeInt32(1, channelTag_);
    }
    if (sentimentData_ != null) {
      output.writeMessage(2, getSentimentData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channelTag_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, channelTag_);
    }
    if (sentimentData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSentimentData());
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment other = (com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment) obj;

    if (getChannelTag()
        != other.getChannelTag()) return false;
    if (hasSentimentData() != other.hasSentimentData()) return false;
    if (hasSentimentData()) {
      if (!getSentimentData()
          .equals(other.getSentimentData())) return false;
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
    hash = (37 * hash) + CHANNEL_TAG_FIELD_NUMBER;
    hash = (53 * hash) + getChannelTag();
    if (hasSentimentData()) {
      hash = (37 * hash) + SENTIMENT_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getSentimentData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * One channel of conversation-level sentiment data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.ConversationLevelSentiment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.ConversationLevelSentiment)
      com.google.cloud.contactcenterinsights.v1.ConversationLevelSentimentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_ConversationLevelSentiment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_ConversationLevelSentiment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.class, com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      channelTag_ = 0;

      if (sentimentDataBuilder_ == null) {
        sentimentData_ = null;
      } else {
        sentimentData_ = null;
        sentimentDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_ConversationLevelSentiment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment build() {
      com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment buildPartial() {
      com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment result = new com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment(this);
      result.channelTag_ = channelTag_;
      if (sentimentDataBuilder_ == null) {
        result.sentimentData_ = sentimentData_;
      } else {
        result.sentimentData_ = sentimentDataBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment other) {
      if (other == com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment.getDefaultInstance()) return this;
      if (other.getChannelTag() != 0) {
        setChannelTag(other.getChannelTag());
      }
      if (other.hasSentimentData()) {
        mergeSentimentData(other.getSentimentData());
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
            case 8: {
              channelTag_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getSentimentDataFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            default: {
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

    private int channelTag_ ;
    /**
     * <pre>
     * The channel of the audio that the data applies to.
     * </pre>
     *
     * <code>int32 channel_tag = 1;</code>
     * @return The channelTag.
     */
    @java.lang.Override
    public int getChannelTag() {
      return channelTag_;
    }
    /**
     * <pre>
     * The channel of the audio that the data applies to.
     * </pre>
     *
     * <code>int32 channel_tag = 1;</code>
     * @param value The channelTag to set.
     * @return This builder for chaining.
     */
    public Builder setChannelTag(int value) {
      
      channelTag_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The channel of the audio that the data applies to.
     * </pre>
     *
     * <code>int32 channel_tag = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelTag() {
      
      channelTag_ = 0;
      onChanged();
      return this;
    }

    private com.google.cloud.contactcenterinsights.v1.SentimentData sentimentData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.SentimentData, com.google.cloud.contactcenterinsights.v1.SentimentData.Builder, com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder> sentimentDataBuilder_;
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     * @return Whether the sentimentData field is set.
     */
    public boolean hasSentimentData() {
      return sentimentDataBuilder_ != null || sentimentData_ != null;
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     * @return The sentimentData.
     */
    public com.google.cloud.contactcenterinsights.v1.SentimentData getSentimentData() {
      if (sentimentDataBuilder_ == null) {
        return sentimentData_ == null ? com.google.cloud.contactcenterinsights.v1.SentimentData.getDefaultInstance() : sentimentData_;
      } else {
        return sentimentDataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    public Builder setSentimentData(com.google.cloud.contactcenterinsights.v1.SentimentData value) {
      if (sentimentDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sentimentData_ = value;
        onChanged();
      } else {
        sentimentDataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    public Builder setSentimentData(
        com.google.cloud.contactcenterinsights.v1.SentimentData.Builder builderForValue) {
      if (sentimentDataBuilder_ == null) {
        sentimentData_ = builderForValue.build();
        onChanged();
      } else {
        sentimentDataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    public Builder mergeSentimentData(com.google.cloud.contactcenterinsights.v1.SentimentData value) {
      if (sentimentDataBuilder_ == null) {
        if (sentimentData_ != null) {
          sentimentData_ =
            com.google.cloud.contactcenterinsights.v1.SentimentData.newBuilder(sentimentData_).mergeFrom(value).buildPartial();
        } else {
          sentimentData_ = value;
        }
        onChanged();
      } else {
        sentimentDataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    public Builder clearSentimentData() {
      if (sentimentDataBuilder_ == null) {
        sentimentData_ = null;
        onChanged();
      } else {
        sentimentData_ = null;
        sentimentDataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.SentimentData.Builder getSentimentDataBuilder() {
      
      onChanged();
      return getSentimentDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder getSentimentDataOrBuilder() {
      if (sentimentDataBuilder_ != null) {
        return sentimentDataBuilder_.getMessageOrBuilder();
      } else {
        return sentimentData_ == null ?
            com.google.cloud.contactcenterinsights.v1.SentimentData.getDefaultInstance() : sentimentData_;
      }
    }
    /**
     * <pre>
     * Data specifying sentiment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.SentimentData sentiment_data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.contactcenterinsights.v1.SentimentData, com.google.cloud.contactcenterinsights.v1.SentimentData.Builder, com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder> 
        getSentimentDataFieldBuilder() {
      if (sentimentDataBuilder_ == null) {
        sentimentDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.SentimentData, com.google.cloud.contactcenterinsights.v1.SentimentData.Builder, com.google.cloud.contactcenterinsights.v1.SentimentDataOrBuilder>(
                getSentimentData(),
                getParentForChildren(),
                isClean());
        sentimentData_ = null;
      }
      return sentimentDataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.ConversationLevelSentiment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.ConversationLevelSentiment)
  private static final com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment();
  }

  public static com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversationLevelSentiment>
      PARSER = new com.google.protobuf.AbstractParser<ConversationLevelSentiment>() {
    @java.lang.Override
    public ConversationLevelSentiment parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversationLevelSentiment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversationLevelSentiment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.ConversationLevelSentiment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

