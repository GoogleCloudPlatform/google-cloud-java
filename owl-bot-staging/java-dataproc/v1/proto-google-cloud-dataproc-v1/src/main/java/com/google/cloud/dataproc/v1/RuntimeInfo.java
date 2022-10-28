// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

/**
 * <pre>
 * Runtime information about workload execution.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dataproc.v1.RuntimeInfo}
 */
public final class RuntimeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.dataproc.v1.RuntimeInfo)
    RuntimeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuntimeInfo.newBuilder() to construct.
  private RuntimeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeInfo() {
    outputUri_ = "";
    diagnosticOutputUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuntimeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_RuntimeInfo_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetEndpoints();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_RuntimeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dataproc.v1.RuntimeInfo.class, com.google.cloud.dataproc.v1.RuntimeInfo.Builder.class);
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 1;
  private static final class EndpointsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_RuntimeInfo_EndpointsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> endpoints_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetEndpoints() {
    if (endpoints_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          EndpointsDefaultEntryHolder.defaultEntry);
    }
    return endpoints_;
  }

  public int getEndpointsCount() {
    return internalGetEndpoints().getMap().size();
  }
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */

  @java.lang.Override
  public boolean containsEndpoints(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetEndpoints().getMap().containsKey(key);
  }
  /**
   * Use {@link #getEndpointsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getEndpoints() {
    return getEndpointsMap();
  }
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getEndpointsMap() {
    return internalGetEndpoints().getMap();
  }
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override

  public java.lang.String getEndpointsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetEndpoints().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
   * URIs.
   * </pre>
   *
   * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override

  public java.lang.String getEndpointsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetEndpoints().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int OUTPUT_URI_FIELD_NUMBER = 2;
  private volatile java.lang.Object outputUri_;
  /**
   * <pre>
   * Output only. A URI pointing to the location of the stdout and stderr of the workload.
   * </pre>
   *
   * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The outputUri.
   */
  @java.lang.Override
  public java.lang.String getOutputUri() {
    java.lang.Object ref = outputUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      outputUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. A URI pointing to the location of the stdout and stderr of the workload.
   * </pre>
   *
   * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for outputUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOutputUriBytes() {
    java.lang.Object ref = outputUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      outputUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DIAGNOSTIC_OUTPUT_URI_FIELD_NUMBER = 3;
  private volatile java.lang.Object diagnosticOutputUri_;
  /**
   * <pre>
   * Output only. A URI pointing to the location of the diagnostics tarball.
   * </pre>
   *
   * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The diagnosticOutputUri.
   */
  @java.lang.Override
  public java.lang.String getDiagnosticOutputUri() {
    java.lang.Object ref = diagnosticOutputUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      diagnosticOutputUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. A URI pointing to the location of the diagnostics tarball.
   * </pre>
   *
   * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for diagnosticOutputUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDiagnosticOutputUriBytes() {
    java.lang.Object ref = diagnosticOutputUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      diagnosticOutputUri_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetEndpoints(),
        EndpointsDefaultEntryHolder.defaultEntry,
        1);
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, outputUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diagnosticOutputUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, diagnosticOutputUri_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetEndpoints().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      endpoints__ = EndpointsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, endpoints__);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(outputUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, outputUri_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(diagnosticOutputUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, diagnosticOutputUri_);
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
    if (!(obj instanceof com.google.cloud.dataproc.v1.RuntimeInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.dataproc.v1.RuntimeInfo other = (com.google.cloud.dataproc.v1.RuntimeInfo) obj;

    if (!internalGetEndpoints().equals(
        other.internalGetEndpoints())) return false;
    if (!getOutputUri()
        .equals(other.getOutputUri())) return false;
    if (!getDiagnosticOutputUri()
        .equals(other.getDiagnosticOutputUri())) return false;
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
    if (!internalGetEndpoints().getMap().isEmpty()) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetEndpoints().hashCode();
    }
    hash = (37 * hash) + OUTPUT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getOutputUri().hashCode();
    hash = (37 * hash) + DIAGNOSTIC_OUTPUT_URI_FIELD_NUMBER;
    hash = (53 * hash) + getDiagnosticOutputUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.dataproc.v1.RuntimeInfo parseFrom(
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
  public static Builder newBuilder(com.google.cloud.dataproc.v1.RuntimeInfo prototype) {
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
   * Runtime information about workload execution.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dataproc.v1.RuntimeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dataproc.v1.RuntimeInfo)
      com.google.cloud.dataproc.v1.RuntimeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_RuntimeInfo_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetEndpoints();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableEndpoints();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_RuntimeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dataproc.v1.RuntimeInfo.class, com.google.cloud.dataproc.v1.RuntimeInfo.Builder.class);
    }

    // Construct using com.google.cloud.dataproc.v1.RuntimeInfo.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableEndpoints().clear();
      outputUri_ = "";

      diagnosticOutputUri_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.dataproc.v1.SharedProto.internal_static_google_cloud_dataproc_v1_RuntimeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RuntimeInfo getDefaultInstanceForType() {
      return com.google.cloud.dataproc.v1.RuntimeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RuntimeInfo build() {
      com.google.cloud.dataproc.v1.RuntimeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dataproc.v1.RuntimeInfo buildPartial() {
      com.google.cloud.dataproc.v1.RuntimeInfo result = new com.google.cloud.dataproc.v1.RuntimeInfo(this);
      int from_bitField0_ = bitField0_;
      result.endpoints_ = internalGetEndpoints();
      result.endpoints_.makeImmutable();
      result.outputUri_ = outputUri_;
      result.diagnosticOutputUri_ = diagnosticOutputUri_;
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
      if (other instanceof com.google.cloud.dataproc.v1.RuntimeInfo) {
        return mergeFrom((com.google.cloud.dataproc.v1.RuntimeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dataproc.v1.RuntimeInfo other) {
      if (other == com.google.cloud.dataproc.v1.RuntimeInfo.getDefaultInstance()) return this;
      internalGetMutableEndpoints().mergeFrom(
          other.internalGetEndpoints());
      if (!other.getOutputUri().isEmpty()) {
        outputUri_ = other.outputUri_;
        onChanged();
      }
      if (!other.getDiagnosticOutputUri().isEmpty()) {
        diagnosticOutputUri_ = other.diagnosticOutputUri_;
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
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              endpoints__ = input.readMessage(
                  EndpointsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableEndpoints().getMutableMap().put(
                  endpoints__.getKey(), endpoints__.getValue());
              break;
            } // case 10
            case 18: {
              outputUri_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              diagnosticOutputUri_ = input.readStringRequireUtf8();

              break;
            } // case 26
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
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> endpoints_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetEndpoints() {
      if (endpoints_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            EndpointsDefaultEntryHolder.defaultEntry);
      }
      return endpoints_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableEndpoints() {
      onChanged();;
      if (endpoints_ == null) {
        endpoints_ = com.google.protobuf.MapField.newMapField(
            EndpointsDefaultEntryHolder.defaultEntry);
      }
      if (!endpoints_.isMutable()) {
        endpoints_ = endpoints_.copy();
      }
      return endpoints_;
    }

    public int getEndpointsCount() {
      return internalGetEndpoints().getMap().size();
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */

    @java.lang.Override
    public boolean containsEndpoints(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetEndpoints().getMap().containsKey(key);
    }
    /**
     * Use {@link #getEndpointsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getEndpoints() {
      return getEndpointsMap();
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getEndpointsMap() {
      return internalGetEndpoints().getMap();
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override

    public java.lang.String getEndpointsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetEndpoints().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    @java.lang.Override

    public java.lang.String getEndpointsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetEndpoints().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearEndpoints() {
      internalGetMutableEndpoints().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */

    public Builder removeEndpoints(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableEndpoints().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableEndpoints() {
      return internalGetMutableEndpoints().getMutableMap();
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder putEndpoints(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableEndpoints().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Output only. Map of remote access endpoints (such as web interfaces and APIs) to their
     * URIs.
     * </pre>
     *
     * <code>map&lt;string, string&gt; endpoints = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */

    public Builder putAllEndpoints(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableEndpoints().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object outputUri_ = "";
    /**
     * <pre>
     * Output only. A URI pointing to the location of the stdout and stderr of the workload.
     * </pre>
     *
     * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The outputUri.
     */
    public java.lang.String getOutputUri() {
      java.lang.Object ref = outputUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outputUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the stdout and stderr of the workload.
     * </pre>
     *
     * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for outputUri.
     */
    public com.google.protobuf.ByteString
        getOutputUriBytes() {
      java.lang.Object ref = outputUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outputUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the stdout and stderr of the workload.
     * </pre>
     *
     * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The outputUri to set.
     * @return This builder for chaining.
     */
    public Builder setOutputUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      outputUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the stdout and stderr of the workload.
     * </pre>
     *
     * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearOutputUri() {
      
      outputUri_ = getDefaultInstance().getOutputUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the stdout and stderr of the workload.
     * </pre>
     *
     * <code>string output_uri = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for outputUri to set.
     * @return This builder for chaining.
     */
    public Builder setOutputUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      outputUri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object diagnosticOutputUri_ = "";
    /**
     * <pre>
     * Output only. A URI pointing to the location of the diagnostics tarball.
     * </pre>
     *
     * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The diagnosticOutputUri.
     */
    public java.lang.String getDiagnosticOutputUri() {
      java.lang.Object ref = diagnosticOutputUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        diagnosticOutputUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the diagnostics tarball.
     * </pre>
     *
     * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for diagnosticOutputUri.
     */
    public com.google.protobuf.ByteString
        getDiagnosticOutputUriBytes() {
      java.lang.Object ref = diagnosticOutputUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        diagnosticOutputUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the diagnostics tarball.
     * </pre>
     *
     * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The diagnosticOutputUri to set.
     * @return This builder for chaining.
     */
    public Builder setDiagnosticOutputUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      diagnosticOutputUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the diagnostics tarball.
     * </pre>
     *
     * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearDiagnosticOutputUri() {
      
      diagnosticOutputUri_ = getDefaultInstance().getDiagnosticOutputUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. A URI pointing to the location of the diagnostics tarball.
     * </pre>
     *
     * <code>string diagnostic_output_uri = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for diagnosticOutputUri to set.
     * @return This builder for chaining.
     */
    public Builder setDiagnosticOutputUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      diagnosticOutputUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.dataproc.v1.RuntimeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dataproc.v1.RuntimeInfo)
  private static final com.google.cloud.dataproc.v1.RuntimeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.dataproc.v1.RuntimeInfo();
  }

  public static com.google.cloud.dataproc.v1.RuntimeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeInfo>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeInfo>() {
    @java.lang.Override
    public RuntimeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RuntimeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dataproc.v1.RuntimeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

