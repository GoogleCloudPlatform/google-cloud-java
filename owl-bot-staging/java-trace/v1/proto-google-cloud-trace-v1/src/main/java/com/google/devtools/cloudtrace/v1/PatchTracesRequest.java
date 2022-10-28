// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/cloudtrace/v1/trace.proto

package com.google.devtools.cloudtrace.v1;

/**
 * <pre>
 * The request message for the `PatchTraces` method.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudtrace.v1.PatchTracesRequest}
 */
public final class PatchTracesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudtrace.v1.PatchTracesRequest)
    PatchTracesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PatchTracesRequest.newBuilder() to construct.
  private PatchTracesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PatchTracesRequest() {
    projectId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PatchTracesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudtrace.v1.PatchTracesRequest.class, com.google.devtools.cloudtrace.v1.PatchTracesRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object projectId_;
  /**
   * <pre>
   * Required. ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. ID of the Cloud project where the trace data is stored.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRACES_FIELD_NUMBER = 2;
  private com.google.devtools.cloudtrace.v1.Traces traces_;
  /**
   * <pre>
   * Required. The body of the message.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the traces field is set.
   */
  @java.lang.Override
  public boolean hasTraces() {
    return traces_ != null;
  }
  /**
   * <pre>
   * Required. The body of the message.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The traces.
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v1.Traces getTraces() {
    return traces_ == null ? com.google.devtools.cloudtrace.v1.Traces.getDefaultInstance() : traces_;
  }
  /**
   * <pre>
   * Required. The body of the message.
   * </pre>
   *
   * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudtrace.v1.TracesOrBuilder getTracesOrBuilder() {
    return getTraces();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (traces_ != null) {
      output.writeMessage(2, getTraces());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (traces_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTraces());
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
    if (!(obj instanceof com.google.devtools.cloudtrace.v1.PatchTracesRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudtrace.v1.PatchTracesRequest other = (com.google.devtools.cloudtrace.v1.PatchTracesRequest) obj;

    if (!getProjectId()
        .equals(other.getProjectId())) return false;
    if (hasTraces() != other.hasTraces()) return false;
    if (hasTraces()) {
      if (!getTraces()
          .equals(other.getTraces())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    if (hasTraces()) {
      hash = (37 * hash) + TRACES_FIELD_NUMBER;
      hash = (53 * hash) + getTraces().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.cloudtrace.v1.PatchTracesRequest prototype) {
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
   * The request message for the `PatchTraces` method.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudtrace.v1.PatchTracesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudtrace.v1.PatchTracesRequest)
      com.google.devtools.cloudtrace.v1.PatchTracesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudtrace.v1.PatchTracesRequest.class, com.google.devtools.cloudtrace.v1.PatchTracesRequest.Builder.class);
    }

    // Construct using com.google.devtools.cloudtrace.v1.PatchTracesRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      projectId_ = "";

      if (tracesBuilder_ == null) {
        traces_ = null;
      } else {
        traces_ = null;
        tracesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.cloudtrace.v1.TraceProto.internal_static_google_devtools_cloudtrace_v1_PatchTracesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.PatchTracesRequest getDefaultInstanceForType() {
      return com.google.devtools.cloudtrace.v1.PatchTracesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.PatchTracesRequest build() {
      com.google.devtools.cloudtrace.v1.PatchTracesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudtrace.v1.PatchTracesRequest buildPartial() {
      com.google.devtools.cloudtrace.v1.PatchTracesRequest result = new com.google.devtools.cloudtrace.v1.PatchTracesRequest(this);
      result.projectId_ = projectId_;
      if (tracesBuilder_ == null) {
        result.traces_ = traces_;
      } else {
        result.traces_ = tracesBuilder_.build();
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
      if (other instanceof com.google.devtools.cloudtrace.v1.PatchTracesRequest) {
        return mergeFrom((com.google.devtools.cloudtrace.v1.PatchTracesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.cloudtrace.v1.PatchTracesRequest other) {
      if (other == com.google.devtools.cloudtrace.v1.PatchTracesRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        onChanged();
      }
      if (other.hasTraces()) {
        mergeTraces(other.getTraces());
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
              projectId_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getTracesFieldBuilder().getBuilder(),
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

    private java.lang.Object projectId_ = "";
    /**
     * <pre>
     * Required. ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString
        getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      
      projectId_ = getDefaultInstance().getProjectId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. ID of the Cloud project where the trace data is stored.
     * </pre>
     *
     * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectId_ = value;
      onChanged();
      return this;
    }

    private com.google.devtools.cloudtrace.v1.Traces traces_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.cloudtrace.v1.Traces, com.google.devtools.cloudtrace.v1.Traces.Builder, com.google.devtools.cloudtrace.v1.TracesOrBuilder> tracesBuilder_;
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the traces field is set.
     */
    public boolean hasTraces() {
      return tracesBuilder_ != null || traces_ != null;
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The traces.
     */
    public com.google.devtools.cloudtrace.v1.Traces getTraces() {
      if (tracesBuilder_ == null) {
        return traces_ == null ? com.google.devtools.cloudtrace.v1.Traces.getDefaultInstance() : traces_;
      } else {
        return tracesBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTraces(com.google.devtools.cloudtrace.v1.Traces value) {
      if (tracesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        traces_ = value;
        onChanged();
      } else {
        tracesBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setTraces(
        com.google.devtools.cloudtrace.v1.Traces.Builder builderForValue) {
      if (tracesBuilder_ == null) {
        traces_ = builderForValue.build();
        onChanged();
      } else {
        tracesBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeTraces(com.google.devtools.cloudtrace.v1.Traces value) {
      if (tracesBuilder_ == null) {
        if (traces_ != null) {
          traces_ =
            com.google.devtools.cloudtrace.v1.Traces.newBuilder(traces_).mergeFrom(value).buildPartial();
        } else {
          traces_ = value;
        }
        onChanged();
      } else {
        tracesBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearTraces() {
      if (tracesBuilder_ == null) {
        traces_ = null;
        onChanged();
      } else {
        traces_ = null;
        tracesBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v1.Traces.Builder getTracesBuilder() {
      
      onChanged();
      return getTracesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.devtools.cloudtrace.v1.TracesOrBuilder getTracesOrBuilder() {
      if (tracesBuilder_ != null) {
        return tracesBuilder_.getMessageOrBuilder();
      } else {
        return traces_ == null ?
            com.google.devtools.cloudtrace.v1.Traces.getDefaultInstance() : traces_;
      }
    }
    /**
     * <pre>
     * Required. The body of the message.
     * </pre>
     *
     * <code>.google.devtools.cloudtrace.v1.Traces traces = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.cloudtrace.v1.Traces, com.google.devtools.cloudtrace.v1.Traces.Builder, com.google.devtools.cloudtrace.v1.TracesOrBuilder> 
        getTracesFieldBuilder() {
      if (tracesBuilder_ == null) {
        tracesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudtrace.v1.Traces, com.google.devtools.cloudtrace.v1.Traces.Builder, com.google.devtools.cloudtrace.v1.TracesOrBuilder>(
                getTraces(),
                getParentForChildren(),
                isClean());
        traces_ = null;
      }
      return tracesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.cloudtrace.v1.PatchTracesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudtrace.v1.PatchTracesRequest)
  private static final com.google.devtools.cloudtrace.v1.PatchTracesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudtrace.v1.PatchTracesRequest();
  }

  public static com.google.devtools.cloudtrace.v1.PatchTracesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatchTracesRequest>
      PARSER = new com.google.protobuf.AbstractParser<PatchTracesRequest>() {
    @java.lang.Override
    public PatchTracesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<PatchTracesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatchTracesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudtrace.v1.PatchTracesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

