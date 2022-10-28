// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/contactcenterinsights/v1/resources.proto

package com.google.cloud.contactcenterinsights.v1;

/**
 * <pre>
 * Dialogflow interaction data.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.DialogflowInteractionData}
 */
public final class DialogflowInteractionData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.DialogflowInteractionData)
    DialogflowInteractionDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DialogflowInteractionData.newBuilder() to construct.
  private DialogflowInteractionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DialogflowInteractionData() {
    dialogflowIntentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DialogflowInteractionData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowInteractionData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowInteractionData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.class, com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.Builder.class);
  }

  public static final int DIALOGFLOW_INTENT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object dialogflowIntentId_;
  /**
   * <pre>
   * The Dialogflow intent resource path. Format:
   * projects/{project}/agent/{agent}/intents/{intent}
   * </pre>
   *
   * <code>string dialogflow_intent_id = 1;</code>
   * @return The dialogflowIntentId.
   */
  @java.lang.Override
  public java.lang.String getDialogflowIntentId() {
    java.lang.Object ref = dialogflowIntentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dialogflowIntentId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Dialogflow intent resource path. Format:
   * projects/{project}/agent/{agent}/intents/{intent}
   * </pre>
   *
   * <code>string dialogflow_intent_id = 1;</code>
   * @return The bytes for dialogflowIntentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDialogflowIntentIdBytes() {
    java.lang.Object ref = dialogflowIntentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dialogflowIntentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   * <pre>
   * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0
   * (completely certain).
   * </pre>
   *
   * <code>float confidence = 2;</code>
   * @return The confidence.
   */
  @java.lang.Override
  public float getConfidence() {
    return confidence_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dialogflowIntentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dialogflowIntentId_);
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      output.writeFloat(2, confidence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dialogflowIntentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dialogflowIntentId_);
    }
    if (java.lang.Float.floatToRawIntBits(confidence_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, confidence_);
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
    if (!(obj instanceof com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData other = (com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData) obj;

    if (!getDialogflowIntentId()
        .equals(other.getDialogflowIntentId())) return false;
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(
            other.getConfidence())) return false;
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
    hash = (37 * hash) + DIALOGFLOW_INTENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDialogflowIntentId().hashCode();
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getConfidence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData parseFrom(
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
  public static Builder newBuilder(com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData prototype) {
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
   * Dialogflow interaction data.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.DialogflowInteractionData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.DialogflowInteractionData)
      com.google.cloud.contactcenterinsights.v1.DialogflowInteractionDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowInteractionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowInteractionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.class, com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.Builder.class);
    }

    // Construct using com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dialogflowIntentId_ = "";

      confidence_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ResourcesProto.internal_static_google_cloud_contactcenterinsights_v1_DialogflowInteractionData_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData build() {
      com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData buildPartial() {
      com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData result = new com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData(this);
      result.dialogflowIntentId_ = dialogflowIntentId_;
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData) {
        return mergeFrom((com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData other) {
      if (other == com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData.getDefaultInstance()) return this;
      if (!other.getDialogflowIntentId().isEmpty()) {
        dialogflowIntentId_ = other.dialogflowIntentId_;
        onChanged();
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
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
            case 10: {
              dialogflowIntentId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 21: {
              confidence_ = input.readFloat();

              break;
            } // case 21
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

    private java.lang.Object dialogflowIntentId_ = "";
    /**
     * <pre>
     * The Dialogflow intent resource path. Format:
     * projects/{project}/agent/{agent}/intents/{intent}
     * </pre>
     *
     * <code>string dialogflow_intent_id = 1;</code>
     * @return The dialogflowIntentId.
     */
    public java.lang.String getDialogflowIntentId() {
      java.lang.Object ref = dialogflowIntentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dialogflowIntentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Dialogflow intent resource path. Format:
     * projects/{project}/agent/{agent}/intents/{intent}
     * </pre>
     *
     * <code>string dialogflow_intent_id = 1;</code>
     * @return The bytes for dialogflowIntentId.
     */
    public com.google.protobuf.ByteString
        getDialogflowIntentIdBytes() {
      java.lang.Object ref = dialogflowIntentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dialogflowIntentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Dialogflow intent resource path. Format:
     * projects/{project}/agent/{agent}/intents/{intent}
     * </pre>
     *
     * <code>string dialogflow_intent_id = 1;</code>
     * @param value The dialogflowIntentId to set.
     * @return This builder for chaining.
     */
    public Builder setDialogflowIntentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dialogflowIntentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Dialogflow intent resource path. Format:
     * projects/{project}/agent/{agent}/intents/{intent}
     * </pre>
     *
     * <code>string dialogflow_intent_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDialogflowIntentId() {
      
      dialogflowIntentId_ = getDefaultInstance().getDialogflowIntentId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Dialogflow intent resource path. Format:
     * projects/{project}/agent/{agent}/intents/{intent}
     * </pre>
     *
     * <code>string dialogflow_intent_id = 1;</code>
     * @param value The bytes for dialogflowIntentId to set.
     * @return This builder for chaining.
     */
    public Builder setDialogflowIntentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dialogflowIntentId_ = value;
      onChanged();
      return this;
    }

    private float confidence_ ;
    /**
     * <pre>
     * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0
     * (completely certain).
     * </pre>
     *
     * <code>float confidence = 2;</code>
     * @return The confidence.
     */
    @java.lang.Override
    public float getConfidence() {
      return confidence_;
    }
    /**
     * <pre>
     * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0
     * (completely certain).
     * </pre>
     *
     * <code>float confidence = 2;</code>
     * @param value The confidence to set.
     * @return This builder for chaining.
     */
    public Builder setConfidence(float value) {
      
      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The confidence of the match ranging from 0.0 (completely uncertain) to 1.0
     * (completely certain).
     * </pre>
     *
     * <code>float confidence = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearConfidence() {
      
      confidence_ = 0F;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.DialogflowInteractionData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.DialogflowInteractionData)
  private static final com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData();
  }

  public static com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DialogflowInteractionData>
      PARSER = new com.google.protobuf.AbstractParser<DialogflowInteractionData>() {
    @java.lang.Override
    public DialogflowInteractionData parsePartialFrom(
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

  public static com.google.protobuf.Parser<DialogflowInteractionData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DialogflowInteractionData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.DialogflowInteractionData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

