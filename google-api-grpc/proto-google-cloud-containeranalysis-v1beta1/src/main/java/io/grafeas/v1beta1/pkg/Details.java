// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

package io.grafeas.v1beta1.pkg;

/**
 *
 *
 * <pre>
 * Details of a package occurrence.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.package.Details}
 */
public final class Details extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.package.Details)
    DetailsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Details.newBuilder() to construct.
  private Details(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Details() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Details(
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
          case 10:
            {
              io.grafeas.v1beta1.pkg.Installation.Builder subBuilder = null;
              if (installation_ != null) {
                subBuilder = installation_.toBuilder();
              }
              installation_ =
                  input.readMessage(
                      io.grafeas.v1beta1.pkg.Installation.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(installation_);
                installation_ = subBuilder.buildPartial();
              }

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
    return io.grafeas.v1beta1.pkg.PackageOuterClass
        .internal_static_grafeas_v1beta1_package_Details_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass
        .internal_static_grafeas_v1beta1_package_Details_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.pkg.Details.class, io.grafeas.v1beta1.pkg.Details.Builder.class);
  }

  public static final int INSTALLATION_FIELD_NUMBER = 1;
  private io.grafeas.v1beta1.pkg.Installation installation_;
  /**
   *
   *
   * <pre>
   * Where the package was installed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
   */
  public boolean hasInstallation() {
    return installation_ != null;
  }
  /**
   *
   *
   * <pre>
   * Where the package was installed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
   */
  public io.grafeas.v1beta1.pkg.Installation getInstallation() {
    return installation_ == null
        ? io.grafeas.v1beta1.pkg.Installation.getDefaultInstance()
        : installation_;
  }
  /**
   *
   *
   * <pre>
   * Where the package was installed.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
   */
  public io.grafeas.v1beta1.pkg.InstallationOrBuilder getInstallationOrBuilder() {
    return getInstallation();
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
    if (installation_ != null) {
      output.writeMessage(1, getInstallation());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (installation_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInstallation());
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
    if (!(obj instanceof io.grafeas.v1beta1.pkg.Details)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.pkg.Details other = (io.grafeas.v1beta1.pkg.Details) obj;

    boolean result = true;
    result = result && (hasInstallation() == other.hasInstallation());
    if (hasInstallation()) {
      result = result && getInstallation().equals(other.getInstallation());
    }
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
    if (hasInstallation()) {
      hash = (37 * hash) + INSTALLATION_FIELD_NUMBER;
      hash = (53 * hash) + getInstallation().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Details parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Details parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Details parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.pkg.Details prototype) {
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
   * Details of a package occurrence.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.package.Details}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.package.Details)
      io.grafeas.v1beta1.pkg.DetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Details_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Details_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.pkg.Details.class, io.grafeas.v1beta1.pkg.Details.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.pkg.Details.newBuilder()
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
      if (installationBuilder_ == null) {
        installation_ = null;
      } else {
        installation_ = null;
        installationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Details_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Details getDefaultInstanceForType() {
      return io.grafeas.v1beta1.pkg.Details.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Details build() {
      io.grafeas.v1beta1.pkg.Details result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Details buildPartial() {
      io.grafeas.v1beta1.pkg.Details result = new io.grafeas.v1beta1.pkg.Details(this);
      if (installationBuilder_ == null) {
        result.installation_ = installation_;
      } else {
        result.installation_ = installationBuilder_.build();
      }
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
      if (other instanceof io.grafeas.v1beta1.pkg.Details) {
        return mergeFrom((io.grafeas.v1beta1.pkg.Details) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.pkg.Details other) {
      if (other == io.grafeas.v1beta1.pkg.Details.getDefaultInstance()) return this;
      if (other.hasInstallation()) {
        mergeInstallation(other.getInstallation());
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
      io.grafeas.v1beta1.pkg.Details parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grafeas.v1beta1.pkg.Details) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grafeas.v1beta1.pkg.Installation installation_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.pkg.Installation,
            io.grafeas.v1beta1.pkg.Installation.Builder,
            io.grafeas.v1beta1.pkg.InstallationOrBuilder>
        installationBuilder_;
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public boolean hasInstallation() {
      return installationBuilder_ != null || installation_ != null;
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public io.grafeas.v1beta1.pkg.Installation getInstallation() {
      if (installationBuilder_ == null) {
        return installation_ == null
            ? io.grafeas.v1beta1.pkg.Installation.getDefaultInstance()
            : installation_;
      } else {
        return installationBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public Builder setInstallation(io.grafeas.v1beta1.pkg.Installation value) {
      if (installationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        installation_ = value;
        onChanged();
      } else {
        installationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public Builder setInstallation(io.grafeas.v1beta1.pkg.Installation.Builder builderForValue) {
      if (installationBuilder_ == null) {
        installation_ = builderForValue.build();
        onChanged();
      } else {
        installationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public Builder mergeInstallation(io.grafeas.v1beta1.pkg.Installation value) {
      if (installationBuilder_ == null) {
        if (installation_ != null) {
          installation_ =
              io.grafeas.v1beta1.pkg.Installation.newBuilder(installation_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          installation_ = value;
        }
        onChanged();
      } else {
        installationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public Builder clearInstallation() {
      if (installationBuilder_ == null) {
        installation_ = null;
        onChanged();
      } else {
        installation_ = null;
        installationBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public io.grafeas.v1beta1.pkg.Installation.Builder getInstallationBuilder() {

      onChanged();
      return getInstallationFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    public io.grafeas.v1beta1.pkg.InstallationOrBuilder getInstallationOrBuilder() {
      if (installationBuilder_ != null) {
        return installationBuilder_.getMessageOrBuilder();
      } else {
        return installation_ == null
            ? io.grafeas.v1beta1.pkg.Installation.getDefaultInstance()
            : installation_;
      }
    }
    /**
     *
     *
     * <pre>
     * Where the package was installed.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Installation installation = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            io.grafeas.v1beta1.pkg.Installation,
            io.grafeas.v1beta1.pkg.Installation.Builder,
            io.grafeas.v1beta1.pkg.InstallationOrBuilder>
        getInstallationFieldBuilder() {
      if (installationBuilder_ == null) {
        installationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                io.grafeas.v1beta1.pkg.Installation,
                io.grafeas.v1beta1.pkg.Installation.Builder,
                io.grafeas.v1beta1.pkg.InstallationOrBuilder>(
                getInstallation(), getParentForChildren(), isClean());
        installation_ = null;
      }
      return installationBuilder_;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.package.Details)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Details)
  private static final io.grafeas.v1beta1.pkg.Details DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.pkg.Details();
  }

  public static io.grafeas.v1beta1.pkg.Details getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Details> PARSER =
      new com.google.protobuf.AbstractParser<Details>() {
        @java.lang.Override
        public Details parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Details(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Details> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Details> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.pkg.Details getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
