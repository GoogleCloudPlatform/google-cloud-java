// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

package com.google.cloud.dialogflow.v2;

/**
 * <pre>
 * Response used for [ConversationDatasets.ImportConversationData][google.cloud.dialogflow.v2.ConversationDatasets.ImportConversationData] long
 * running operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ImportConversationDataOperationResponse}
 */
public final class ImportConversationDataOperationResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ImportConversationDataOperationResponse)
    ImportConversationDataOperationResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImportConversationDataOperationResponse.newBuilder() to construct.
  private ImportConversationDataOperationResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImportConversationDataOperationResponse() {
    conversationDataset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImportConversationDataOperationResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto.internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto.internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.class, com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.Builder.class);
  }

  public static final int CONVERSATION_DATASET_FIELD_NUMBER = 1;
  private volatile java.lang.Object conversationDataset_;
  /**
   * <pre>
   * The resource name of the imported conversation dataset. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
   * </pre>
   *
   * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The conversationDataset.
   */
  @java.lang.Override
  public java.lang.String getConversationDataset() {
    java.lang.Object ref = conversationDataset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      conversationDataset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the imported conversation dataset. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
   * </pre>
   *
   * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for conversationDataset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConversationDatasetBytes() {
    java.lang.Object ref = conversationDataset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      conversationDataset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMPORT_COUNT_FIELD_NUMBER = 3;
  private int importCount_;
  /**
   * <pre>
   * Number of conversations imported successfully.
   * </pre>
   *
   * <code>int32 import_count = 3;</code>
   * @return The importCount.
   */
  @java.lang.Override
  public int getImportCount() {
    return importCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationDataset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conversationDataset_);
    }
    if (importCount_ != 0) {
      output.writeInt32(3, importCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(conversationDataset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conversationDataset_);
    }
    if (importCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, importCount_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse other = (com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse) obj;

    if (!getConversationDataset()
        .equals(other.getConversationDataset())) return false;
    if (getImportCount()
        != other.getImportCount()) return false;
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
    hash = (37 * hash) + CONVERSATION_DATASET_FIELD_NUMBER;
    hash = (53 * hash) + getConversationDataset().hashCode();
    hash = (37 * hash) + IMPORT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getImportCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse prototype) {
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
   * Response used for [ConversationDatasets.ImportConversationData][google.cloud.dialogflow.v2.ConversationDatasets.ImportConversationData] long
   * running operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ImportConversationDataOperationResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ImportConversationDataOperationResponse)
      com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto.internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto.internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.class, com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      conversationDataset_ = "";

      importCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto.internal_static_google_cloud_dialogflow_v2_ImportConversationDataOperationResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse build() {
      com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse buildPartial() {
      com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse result = new com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse(this);
      result.conversationDataset_ = conversationDataset_;
      result.importCount_ = importCount_;
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
      if (other instanceof com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse other) {
      if (other == com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse.getDefaultInstance()) return this;
      if (!other.getConversationDataset().isEmpty()) {
        conversationDataset_ = other.conversationDataset_;
        onChanged();
      }
      if (other.getImportCount() != 0) {
        setImportCount(other.getImportCount());
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
              conversationDataset_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 24: {
              importCount_ = input.readInt32();

              break;
            } // case 24
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

    private java.lang.Object conversationDataset_ = "";
    /**
     * <pre>
     * The resource name of the imported conversation dataset. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The conversationDataset.
     */
    public java.lang.String getConversationDataset() {
      java.lang.Object ref = conversationDataset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        conversationDataset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the imported conversation dataset. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for conversationDataset.
     */
    public com.google.protobuf.ByteString
        getConversationDatasetBytes() {
      java.lang.Object ref = conversationDataset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conversationDataset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the imported conversation dataset. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The conversationDataset to set.
     * @return This builder for chaining.
     */
    public Builder setConversationDataset(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      conversationDataset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the imported conversation dataset. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearConversationDataset() {
      
      conversationDataset_ = getDefaultInstance().getConversationDataset();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the imported conversation dataset. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset Id&gt;`
     * </pre>
     *
     * <code>string conversation_dataset = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for conversationDataset to set.
     * @return This builder for chaining.
     */
    public Builder setConversationDatasetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      conversationDataset_ = value;
      onChanged();
      return this;
    }

    private int importCount_ ;
    /**
     * <pre>
     * Number of conversations imported successfully.
     * </pre>
     *
     * <code>int32 import_count = 3;</code>
     * @return The importCount.
     */
    @java.lang.Override
    public int getImportCount() {
      return importCount_;
    }
    /**
     * <pre>
     * Number of conversations imported successfully.
     * </pre>
     *
     * <code>int32 import_count = 3;</code>
     * @param value The importCount to set.
     * @return This builder for chaining.
     */
    public Builder setImportCount(int value) {
      
      importCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of conversations imported successfully.
     * </pre>
     *
     * <code>int32 import_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearImportCount() {
      
      importCount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ImportConversationDataOperationResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ImportConversationDataOperationResponse)
  private static final com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse();
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportConversationDataOperationResponse>
      PARSER = new com.google.protobuf.AbstractParser<ImportConversationDataOperationResponse>() {
    @java.lang.Override
    public ImportConversationDataOperationResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportConversationDataOperationResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportConversationDataOperationResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ImportConversationDataOperationResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

