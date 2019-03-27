// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Input only.
 * Filter on state of Application.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.ApplicationStatusFilter}
 */
public final class ApplicationStatusFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.ApplicationStatusFilter)
    ApplicationStatusFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ApplicationStatusFilter.newBuilder() to construct.
  private ApplicationStatusFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ApplicationStatusFilter() {
    applicationState_ = 0;
    negated_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ApplicationStatusFilter(
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
          case 8:
            {
              int rawValue = input.readEnum();

              applicationState_ = rawValue;
              break;
            }
          case 16:
            {
              negated_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
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
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_ApplicationStatusFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_ApplicationStatusFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.ApplicationStatusFilter.class,
            com.google.cloud.talent.v4beta1.ApplicationStatusFilter.Builder.class);
  }

  public static final int APPLICATION_STATE_FIELD_NUMBER = 1;
  private int applicationState_;
  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected application state. The API does an exact match
   * between the application state specified in this filter and the
   * [Application.state][google.cloud.talent.v4beta1.Application.state] in
   * profiles.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
   */
  public int getApplicationStateValue() {
    return applicationState_;
  }
  /**
   *
   *
   * <pre>
   * Required.
   * User entered or selected application state. The API does an exact match
   * between the application state specified in this filter and the
   * [Application.state][google.cloud.talent.v4beta1.Application.state] in
   * profiles.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
   */
  public com.google.cloud.talent.v4beta1.Application.ApplicationState getApplicationState() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.Application.ApplicationState result =
        com.google.cloud.talent.v4beta1.Application.ApplicationState.valueOf(applicationState_);
    return result == null
        ? com.google.cloud.talent.v4beta1.Application.ApplicationState.UNRECOGNIZED
        : result;
  }

  public static final int NEGATED_FIELD_NUMBER = 2;
  private boolean negated_;
  /**
   *
   *
   * <pre>
   * Optional.
   * If true, The API excludes all candidates with any
   * [Application.state][google.cloud.talent.v4beta1.Application.state] matching
   * the state specified in the filter.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   */
  public boolean getNegated() {
    return negated_;
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
    if (applicationState_
        != com.google.cloud.talent.v4beta1.Application.ApplicationState
            .APPLICATION_STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, applicationState_);
    }
    if (negated_ != false) {
      output.writeBool(2, negated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (applicationState_
        != com.google.cloud.talent.v4beta1.Application.ApplicationState
            .APPLICATION_STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, applicationState_);
    }
    if (negated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, negated_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.ApplicationStatusFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.ApplicationStatusFilter other =
        (com.google.cloud.talent.v4beta1.ApplicationStatusFilter) obj;

    boolean result = true;
    result = result && applicationState_ == other.applicationState_;
    result = result && (getNegated() == other.getNegated());
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
    hash = (37 * hash) + APPLICATION_STATE_FIELD_NUMBER;
    hash = (53 * hash) + applicationState_;
    hash = (37 * hash) + NEGATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNegated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter parseFrom(
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
      com.google.cloud.talent.v4beta1.ApplicationStatusFilter prototype) {
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
   * Input only.
   * Filter on state of Application.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.ApplicationStatusFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.ApplicationStatusFilter)
      com.google.cloud.talent.v4beta1.ApplicationStatusFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationStatusFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationStatusFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.ApplicationStatusFilter.class,
              com.google.cloud.talent.v4beta1.ApplicationStatusFilter.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.ApplicationStatusFilter.newBuilder()
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
      applicationState_ = 0;

      negated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_ApplicationStatusFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationStatusFilter getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.ApplicationStatusFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationStatusFilter build() {
      com.google.cloud.talent.v4beta1.ApplicationStatusFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.ApplicationStatusFilter buildPartial() {
      com.google.cloud.talent.v4beta1.ApplicationStatusFilter result =
          new com.google.cloud.talent.v4beta1.ApplicationStatusFilter(this);
      result.applicationState_ = applicationState_;
      result.negated_ = negated_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.ApplicationStatusFilter) {
        return mergeFrom((com.google.cloud.talent.v4beta1.ApplicationStatusFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.ApplicationStatusFilter other) {
      if (other == com.google.cloud.talent.v4beta1.ApplicationStatusFilter.getDefaultInstance())
        return this;
      if (other.applicationState_ != 0) {
        setApplicationStateValue(other.getApplicationStateValue());
      }
      if (other.getNegated() != false) {
        setNegated(other.getNegated());
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
      com.google.cloud.talent.v4beta1.ApplicationStatusFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.talent.v4beta1.ApplicationStatusFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int applicationState_ = 0;
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected application state. The API does an exact match
     * between the application state specified in this filter and the
     * [Application.state][google.cloud.talent.v4beta1.Application.state] in
     * profiles.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
     */
    public int getApplicationStateValue() {
      return applicationState_;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected application state. The API does an exact match
     * between the application state specified in this filter and the
     * [Application.state][google.cloud.talent.v4beta1.Application.state] in
     * profiles.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
     */
    public Builder setApplicationStateValue(int value) {
      applicationState_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected application state. The API does an exact match
     * between the application state specified in this filter and the
     * [Application.state][google.cloud.talent.v4beta1.Application.state] in
     * profiles.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
     */
    public com.google.cloud.talent.v4beta1.Application.ApplicationState getApplicationState() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.Application.ApplicationState result =
          com.google.cloud.talent.v4beta1.Application.ApplicationState.valueOf(applicationState_);
      return result == null
          ? com.google.cloud.talent.v4beta1.Application.ApplicationState.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected application state. The API does an exact match
     * between the application state specified in this filter and the
     * [Application.state][google.cloud.talent.v4beta1.Application.state] in
     * profiles.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
     */
    public Builder setApplicationState(
        com.google.cloud.talent.v4beta1.Application.ApplicationState value) {
      if (value == null) {
        throw new NullPointerException();
      }

      applicationState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required.
     * User entered or selected application state. The API does an exact match
     * between the application state specified in this filter and the
     * [Application.state][google.cloud.talent.v4beta1.Application.state] in
     * profiles.
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.Application.ApplicationState application_state = 1;</code>
     */
    public Builder clearApplicationState() {

      applicationState_ = 0;
      onChanged();
      return this;
    }

    private boolean negated_;
    /**
     *
     *
     * <pre>
     * Optional.
     * If true, The API excludes all candidates with any
     * [Application.state][google.cloud.talent.v4beta1.Application.state] matching
     * the state specified in the filter.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     */
    public boolean getNegated() {
      return negated_;
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * If true, The API excludes all candidates with any
     * [Application.state][google.cloud.talent.v4beta1.Application.state] matching
     * the state specified in the filter.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     */
    public Builder setNegated(boolean value) {

      negated_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional.
     * If true, The API excludes all candidates with any
     * [Application.state][google.cloud.talent.v4beta1.Application.state] matching
     * the state specified in the filter.
     * </pre>
     *
     * <code>bool negated = 2;</code>
     */
    public Builder clearNegated() {

      negated_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.ApplicationStatusFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.ApplicationStatusFilter)
  private static final com.google.cloud.talent.v4beta1.ApplicationStatusFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.ApplicationStatusFilter();
  }

  public static com.google.cloud.talent.v4beta1.ApplicationStatusFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ApplicationStatusFilter> PARSER =
      new com.google.protobuf.AbstractParser<ApplicationStatusFilter>() {
        @java.lang.Override
        public ApplicationStatusFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ApplicationStatusFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ApplicationStatusFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ApplicationStatusFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.ApplicationStatusFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
