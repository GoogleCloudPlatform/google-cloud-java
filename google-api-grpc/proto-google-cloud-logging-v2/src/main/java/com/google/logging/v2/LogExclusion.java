// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

/**
 * <pre>
 * Specifies a set of log entries that are not to be stored in
 * Logging. If your project receives a large volume of logs, you might be able
 * to use exclusions to reduce your chargeable logs. Exclusions are processed
 * after log sinks, so you can export log entries before they are excluded.
 * Audit log entries and log entries from Amazon Web Services are never
 * excluded.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.LogExclusion}
 */
public  final class LogExclusion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LogExclusion)
    LogExclusionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogExclusion.newBuilder() to construct.
  private LogExclusion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogExclusion() {
    name_ = "";
    description_ = "";
    filter_ = "";
    disabled_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogExclusion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            filter_ = s;
            break;
          }
          case 32: {

            disabled_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_LogExclusion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_LogExclusion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.LogExclusion.class, com.google.logging.v2.LogExclusion.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Required. A client-assigned identifier, such as
   * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
   * can include only letters, digits, underscores, hyphens, and periods.
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
   * Required. A client-assigned identifier, such as
   * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
   * can include only letters, digits, underscores, hyphens, and periods.
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

  public static final int DESCRIPTION_FIELD_NUMBER = 2;
  private volatile java.lang.Object description_;
  /**
   * <pre>
   * Optional. A description of this exclusion.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Optional. A description of this exclusion.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 3;
  private volatile java.lang.Object filter_;
  /**
   * <pre>
   * Required.
   * An [advanced logs filter](/logging/docs/view/advanced_filters)
   * that matches the log entries to be excluded. By using the
   * [sample function](/logging/docs/view/advanced_filters#sample),
   * you can exclude less than 100% of the matching log entries.
   * For example, the following filter matches 99% of low-severity log
   * entries from load balancers:
   * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required.
   * An [advanced logs filter](/logging/docs/view/advanced_filters)
   * that matches the log entries to be excluded. By using the
   * [sample function](/logging/docs/view/advanced_filters#sample),
   * you can exclude less than 100% of the matching log entries.
   * For example, the following filter matches 99% of low-severity log
   * entries from load balancers:
   * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
   * </pre>
   *
   * <code>string filter = 3;</code>
   */
  public com.google.protobuf.ByteString
      getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISABLED_FIELD_NUMBER = 4;
  private boolean disabled_;
  /**
   * <pre>
   * Optional. If set to True, then this exclusion is disabled and it does not
   * exclude any log entries. You can use
   * [exclusions.patch](/logging/docs/reference/v2/rest/v2/projects.exclusions/patch)
   * to change the value of this field.
   * </pre>
   *
   * <code>bool disabled = 4;</code>
   */
  public boolean getDisabled() {
    return disabled_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!getFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    if (disabled_ != false) {
      output.writeBool(4, disabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!getFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
    }
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, disabled_);
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
    if (!(obj instanceof com.google.logging.v2.LogExclusion)) {
      return super.equals(obj);
    }
    com.google.logging.v2.LogExclusion other = (com.google.logging.v2.LogExclusion) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && getFilter()
        .equals(other.getFilter());
    result = result && (getDisabled()
        == other.getDisabled());
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.LogExclusion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.LogExclusion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.LogExclusion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.logging.v2.LogExclusion parseFrom(
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
  public static Builder newBuilder(com.google.logging.v2.LogExclusion prototype) {
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
   * Specifies a set of log entries that are not to be stored in
   * Logging. If your project receives a large volume of logs, you might be able
   * to use exclusions to reduce your chargeable logs. Exclusions are processed
   * after log sinks, so you can export log entries before they are excluded.
   * Audit log entries and log entries from Amazon Web Services are never
   * excluded.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.LogExclusion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LogExclusion)
      com.google.logging.v2.LogExclusionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_LogExclusion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_LogExclusion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.LogExclusion.class, com.google.logging.v2.LogExclusion.Builder.class);
    }

    // Construct using com.google.logging.v2.LogExclusion.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      description_ = "";

      filter_ = "";

      disabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto.internal_static_google_logging_v2_LogExclusion_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.LogExclusion getDefaultInstanceForType() {
      return com.google.logging.v2.LogExclusion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.LogExclusion build() {
      com.google.logging.v2.LogExclusion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.LogExclusion buildPartial() {
      com.google.logging.v2.LogExclusion result = new com.google.logging.v2.LogExclusion(this);
      result.name_ = name_;
      result.description_ = description_;
      result.filter_ = filter_;
      result.disabled_ = disabled_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.LogExclusion) {
        return mergeFrom((com.google.logging.v2.LogExclusion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.LogExclusion other) {
      if (other == com.google.logging.v2.LogExclusion.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        onChanged();
      }
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
      }
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
      com.google.logging.v2.LogExclusion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.logging.v2.LogExclusion) e.getUnfinishedMessage();
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
     * Required. A client-assigned identifier, such as
     * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
     * can include only letters, digits, underscores, hyphens, and periods.
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
     * Required. A client-assigned identifier, such as
     * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
     * can include only letters, digits, underscores, hyphens, and periods.
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
     * Required. A client-assigned identifier, such as
     * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
     * can include only letters, digits, underscores, hyphens, and periods.
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
     * Required. A client-assigned identifier, such as
     * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
     * can include only letters, digits, underscores, hyphens, and periods.
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
     * Required. A client-assigned identifier, such as
     * `"load-balancer-exclusion"`. Identifiers are limited to 100 characters and
     * can include only letters, digits, underscores, hyphens, and periods.
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

    private java.lang.Object description_ = "";
    /**
     * <pre>
     * Optional. A description of this exclusion.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Optional. A description of this exclusion.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Optional. A description of this exclusion.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A description of this exclusion.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. A description of this exclusion.
     * </pre>
     *
     * <code>string description = 2;</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     * <pre>
     * Required.
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced_filters#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following filter matches 99% of low-severity log
     * entries from load balancers:
     * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required.
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced_filters#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following filter matches 99% of low-severity log
     * entries from load balancers:
     * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required.
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced_filters#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following filter matches 99% of low-severity log
     * entries from load balancers:
     * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public Builder setFilter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filter_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced_filters#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following filter matches 99% of low-severity log
     * entries from load balancers:
     * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public Builder clearFilter() {
      
      filter_ = getDefaultInstance().getFilter();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required.
     * An [advanced logs filter](/logging/docs/view/advanced_filters)
     * that matches the log entries to be excluded. By using the
     * [sample function](/logging/docs/view/advanced_filters#sample),
     * you can exclude less than 100% of the matching log entries.
     * For example, the following filter matches 99% of low-severity log
     * entries from load balancers:
     * `"resource.type=http_load_balancer severity&lt;ERROR sample(insertId, 0.99)"`
     * </pre>
     *
     * <code>string filter = 3;</code>
     */
    public Builder setFilterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filter_ = value;
      onChanged();
      return this;
    }

    private boolean disabled_ ;
    /**
     * <pre>
     * Optional. If set to True, then this exclusion is disabled and it does not
     * exclude any log entries. You can use
     * [exclusions.patch](/logging/docs/reference/v2/rest/v2/projects.exclusions/patch)
     * to change the value of this field.
     * </pre>
     *
     * <code>bool disabled = 4;</code>
     */
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     * <pre>
     * Optional. If set to True, then this exclusion is disabled and it does not
     * exclude any log entries. You can use
     * [exclusions.patch](/logging/docs/reference/v2/rest/v2/projects.exclusions/patch)
     * to change the value of this field.
     * </pre>
     *
     * <code>bool disabled = 4;</code>
     */
    public Builder setDisabled(boolean value) {
      
      disabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. If set to True, then this exclusion is disabled and it does not
     * exclude any log entries. You can use
     * [exclusions.patch](/logging/docs/reference/v2/rest/v2/projects.exclusions/patch)
     * to change the value of this field.
     * </pre>
     *
     * <code>bool disabled = 4;</code>
     */
    public Builder clearDisabled() {
      
      disabled_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.logging.v2.LogExclusion)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.LogExclusion)
  private static final com.google.logging.v2.LogExclusion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.LogExclusion();
  }

  public static com.google.logging.v2.LogExclusion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogExclusion>
      PARSER = new com.google.protobuf.AbstractParser<LogExclusion>() {
    @java.lang.Override
    public LogExclusion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogExclusion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogExclusion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogExclusion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.LogExclusion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

