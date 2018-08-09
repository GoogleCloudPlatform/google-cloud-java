// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

/**
 * <pre>
 * A request to fetch a workflow template.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest}
 */
public  final class GetWorkflowTemplateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest)
    GetWorkflowTemplateRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetWorkflowTemplateRequest.newBuilder() to construct.
  private GetWorkflowTemplateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetWorkflowTemplateRequest() {
    name_ = "";
    version_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetWorkflowTemplateRequest(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 16: {

            version_ = input.readInt32();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_GetWorkflowTemplateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_GetWorkflowTemplateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.class, com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. The "resource name" of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The "resource name" of the workflow template, as described
   * in https://cloud.google.com/apis/design/resource_names of the form
   * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 2;
  private int version_;
  /**
   * <pre>
   * Optional. The version of workflow template to retrieve. Only previously
   * instatiated versions can be retrieved.
   * If unspecified, retrieves the current version.
   * </pre>
   *
   * <code>int32 version = 2;</code>
   */
  public int getVersion() {
    return version_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (version_ != 0) {
      output.writeInt32(2, version_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, version_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest other = (com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && (getVersion()
        == other.getVersion());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest prototype) {
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
   * A request to fetch a workflow template.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest)
      com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_GetWorkflowTemplateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_GetWorkflowTemplateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.class, com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      name_ = "";

      version_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1beta2.WorkflowTemplatesProto.internal_static_google_cloud_dataproc_v1beta2_GetWorkflowTemplateRequest_descriptor;
    }

    public com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.getDefaultInstance();
    }

    public com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest build() {
      com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest buildPartial() {
      com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest result = new com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest(this);
      result.name_ = name_;
      result.version_ = version_;
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
      if (other instanceof com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest) {
        return mergeFrom((com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest other) {
      if (other == com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
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
      com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The "resource name" of the workflow template, as described
     * in https://cloud.google.com/apis/design/resource_names of the form
     * `projects/{project_id}/regions/{region}/workflowTemplates/{template_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int version_ ;
    /**
     * <pre>
     * Optional. The version of workflow template to retrieve. Only previously
     * instatiated versions can be retrieved.
     * If unspecified, retrieves the current version.
     * </pre>
     *
     * <code>int32 version = 2;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <pre>
     * Optional. The version of workflow template to retrieve. Only previously
     * instatiated versions can be retrieved.
     * If unspecified, retrieves the current version.
     * </pre>
     *
     * <code>int32 version = 2;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. The version of workflow template to retrieve. Only previously
     * instatiated versions can be retrieved.
     * If unspecified, retrieves the current version.
     * </pre>
     *
     * <code>int32 version = 2;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest)
  private static final com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest();
  }

  public static com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetWorkflowTemplateRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetWorkflowTemplateRequest>() {
    public GetWorkflowTemplateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetWorkflowTemplateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetWorkflowTemplateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetWorkflowTemplateRequest> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.dataproc.v1beta2.GetWorkflowTemplateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

