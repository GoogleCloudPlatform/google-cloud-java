/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/package/package.proto

// Protobuf Java Version: 3.25.5
package io.grafeas.v1beta1.pkg;

/**
 *
 *
 * <pre>
 * Version contains structured information about the version of a package.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1beta1.package.Version}
 */
public final class Version extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1beta1.package.Version)
    VersionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Version.newBuilder() to construct.
  private Version(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Version() {
    name_ = "";
    revision_ = "";
    kind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Version();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass
        .internal_static_grafeas_v1beta1_package_Version_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1beta1.pkg.PackageOuterClass
        .internal_static_grafeas_v1beta1_package_Version_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1beta1.pkg.Version.class, io.grafeas.v1beta1.pkg.Version.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Whether this is an ordinary package version or a sentinel MIN/MAX version.
   * </pre>
   *
   * Protobuf enum {@code grafeas.v1beta1.package.Version.VersionKind}
   */
  public enum VersionKind implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>VERSION_KIND_UNSPECIFIED = 0;</code>
     */
    VERSION_KIND_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * A standard package version.
     * </pre>
     *
     * <code>NORMAL = 1;</code>
     */
    NORMAL(1),
    /**
     *
     *
     * <pre>
     * A special version representing negative infinity.
     * </pre>
     *
     * <code>MINIMUM = 2;</code>
     */
    MINIMUM(2),
    /**
     *
     *
     * <pre>
     * A special version representing positive infinity.
     * </pre>
     *
     * <code>MAXIMUM = 3;</code>
     */
    MAXIMUM(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unknown.
     * </pre>
     *
     * <code>VERSION_KIND_UNSPECIFIED = 0;</code>
     */
    public static final int VERSION_KIND_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * A standard package version.
     * </pre>
     *
     * <code>NORMAL = 1;</code>
     */
    public static final int NORMAL_VALUE = 1;
    /**
     *
     *
     * <pre>
     * A special version representing negative infinity.
     * </pre>
     *
     * <code>MINIMUM = 2;</code>
     */
    public static final int MINIMUM_VALUE = 2;
    /**
     *
     *
     * <pre>
     * A special version representing positive infinity.
     * </pre>
     *
     * <code>MAXIMUM = 3;</code>
     */
    public static final int MAXIMUM_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VersionKind valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VersionKind forNumber(int value) {
      switch (value) {
        case 0:
          return VERSION_KIND_UNSPECIFIED;
        case 1:
          return NORMAL;
        case 2:
          return MINIMUM;
        case 3:
          return MAXIMUM;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VersionKind> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<VersionKind> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VersionKind>() {
          public VersionKind findValueByNumber(int number) {
            return VersionKind.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return io.grafeas.v1beta1.pkg.Version.getDescriptor().getEnumTypes().get(0);
    }

    private static final VersionKind[] VALUES = values();

    public static VersionKind valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private VersionKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:grafeas.v1beta1.package.Version.VersionKind)
  }

  public static final int EPOCH_FIELD_NUMBER = 1;
  private int epoch_ = 0;
  /**
   *
   *
   * <pre>
   * Used to correct mistakes in the version numbering scheme.
   * </pre>
   *
   * <code>int32 epoch = 1;</code>
   *
   * @return The epoch.
   */
  @java.lang.Override
  public int getEpoch() {
    return epoch_;
  }

  public static final int NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required only when version kind is NORMAL. The main part of the version
   * name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required only when version kind is NORMAL. The main part of the version
   * name.
   * </pre>
   *
   * <code>string name = 2;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REVISION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object revision_ = "";
  /**
   *
   *
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   *
   * @return The revision.
   */
  @java.lang.Override
  public java.lang.String getRevision() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      revision_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The iteration of the package build from the above version.
   * </pre>
   *
   * <code>string revision = 3;</code>
   *
   * @return The bytes for revision.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRevisionBytes() {
    java.lang.Object ref = revision_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      revision_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KIND_FIELD_NUMBER = 4;
  private int kind_ = 0;
  /**
   *
   *
   * <pre>
   * Required. Distinguishes between sentinel MIN/MAX versions and normal
   * versions.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   *
   * @return The enum numeric value on the wire for kind.
   */
  @java.lang.Override
  public int getKindValue() {
    return kind_;
  }
  /**
   *
   *
   * <pre>
   * Required. Distinguishes between sentinel MIN/MAX versions and normal
   * versions.
   * </pre>
   *
   * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
   *
   * @return The kind.
   */
  @java.lang.Override
  public io.grafeas.v1beta1.pkg.Version.VersionKind getKind() {
    io.grafeas.v1beta1.pkg.Version.VersionKind result =
        io.grafeas.v1beta1.pkg.Version.VersionKind.forNumber(kind_);
    return result == null ? io.grafeas.v1beta1.pkg.Version.VersionKind.UNRECOGNIZED : result;
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
    if (epoch_ != 0) {
      output.writeInt32(1, epoch_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revision_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, revision_);
    }
    if (kind_ != io.grafeas.v1beta1.pkg.Version.VersionKind.VERSION_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, kind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (epoch_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, epoch_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(revision_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, revision_);
    }
    if (kind_ != io.grafeas.v1beta1.pkg.Version.VersionKind.VERSION_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, kind_);
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
    if (!(obj instanceof io.grafeas.v1beta1.pkg.Version)) {
      return super.equals(obj);
    }
    io.grafeas.v1beta1.pkg.Version other = (io.grafeas.v1beta1.pkg.Version) obj;

    if (getEpoch() != other.getEpoch()) return false;
    if (!getName().equals(other.getName())) return false;
    if (!getRevision().equals(other.getRevision())) return false;
    if (kind_ != other.kind_) return false;
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
    hash = (37 * hash) + EPOCH_FIELD_NUMBER;
    hash = (53 * hash) + getEpoch();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + REVISION_FIELD_NUMBER;
    hash = (53 * hash) + getRevision().hashCode();
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Version parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Version parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1beta1.pkg.Version parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1beta1.pkg.Version prototype) {
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
   * Version contains structured information about the version of a package.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1beta1.package.Version}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1beta1.package.Version)
      io.grafeas.v1beta1.pkg.VersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Version_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Version_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1beta1.pkg.Version.class, io.grafeas.v1beta1.pkg.Version.Builder.class);
    }

    // Construct using io.grafeas.v1beta1.pkg.Version.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      epoch_ = 0;
      name_ = "";
      revision_ = "";
      kind_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1beta1.pkg.PackageOuterClass
          .internal_static_grafeas_v1beta1_package_Version_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version getDefaultInstanceForType() {
      return io.grafeas.v1beta1.pkg.Version.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version build() {
      io.grafeas.v1beta1.pkg.Version result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version buildPartial() {
      io.grafeas.v1beta1.pkg.Version result = new io.grafeas.v1beta1.pkg.Version(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1beta1.pkg.Version result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.epoch_ = epoch_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.revision_ = revision_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.kind_ = kind_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1beta1.pkg.Version) {
        return mergeFrom((io.grafeas.v1beta1.pkg.Version) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1beta1.pkg.Version other) {
      if (other == io.grafeas.v1beta1.pkg.Version.getDefaultInstance()) return this;
      if (other.getEpoch() != 0) {
        setEpoch(other.getEpoch());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getRevision().isEmpty()) {
        revision_ = other.revision_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
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
            case 8:
              {
                epoch_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                revision_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                kind_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            default:
              {
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

    private int epoch_;
    /**
     *
     *
     * <pre>
     * Used to correct mistakes in the version numbering scheme.
     * </pre>
     *
     * <code>int32 epoch = 1;</code>
     *
     * @return The epoch.
     */
    @java.lang.Override
    public int getEpoch() {
      return epoch_;
    }
    /**
     *
     *
     * <pre>
     * Used to correct mistakes in the version numbering scheme.
     * </pre>
     *
     * <code>int32 epoch = 1;</code>
     *
     * @param value The epoch to set.
     * @return This builder for chaining.
     */
    public Builder setEpoch(int value) {

      epoch_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Used to correct mistakes in the version numbering scheme.
     * </pre>
     *
     * <code>int32 epoch = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEpoch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      epoch_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required only when version kind is NORMAL. The main part of the version
     * name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required only when version kind is NORMAL. The main part of the version
     * name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required only when version kind is NORMAL. The main part of the version
     * name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required only when version kind is NORMAL. The main part of the version
     * name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required only when version kind is NORMAL. The main part of the version
     * name.
     * </pre>
     *
     * <code>string name = 2;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object revision_ = "";
    /**
     *
     *
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     *
     * @return The revision.
     */
    public java.lang.String getRevision() {
      java.lang.Object ref = revision_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        revision_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     *
     * @return The bytes for revision.
     */
    public com.google.protobuf.ByteString getRevisionBytes() {
      java.lang.Object ref = revision_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        revision_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     *
     * @param value The revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevision(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      revision_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRevision() {
      revision_ = getDefaultInstance().getRevision();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The iteration of the package build from the above version.
     * </pre>
     *
     * <code>string revision = 3;</code>
     *
     * @param value The bytes for revision to set.
     * @return This builder for chaining.
     */
    public Builder setRevisionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      revision_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int kind_ = 0;
    /**
     *
     *
     * <pre>
     * Required. Distinguishes between sentinel MIN/MAX versions and normal
     * versions.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     *
     * @return The enum numeric value on the wire for kind.
     */
    @java.lang.Override
    public int getKindValue() {
      return kind_;
    }
    /**
     *
     *
     * <pre>
     * Required. Distinguishes between sentinel MIN/MAX versions and normal
     * versions.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     *
     * @param value The enum numeric value on the wire for kind to set.
     * @return This builder for chaining.
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Distinguishes between sentinel MIN/MAX versions and normal
     * versions.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     *
     * @return The kind.
     */
    @java.lang.Override
    public io.grafeas.v1beta1.pkg.Version.VersionKind getKind() {
      io.grafeas.v1beta1.pkg.Version.VersionKind result =
          io.grafeas.v1beta1.pkg.Version.VersionKind.forNumber(kind_);
      return result == null ? io.grafeas.v1beta1.pkg.Version.VersionKind.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Required. Distinguishes between sentinel MIN/MAX versions and normal
     * versions.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     *
     * @param value The kind to set.
     * @return This builder for chaining.
     */
    public Builder setKind(io.grafeas.v1beta1.pkg.Version.VersionKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Distinguishes between sentinel MIN/MAX versions and normal
     * versions.
     * </pre>
     *
     * <code>.grafeas.v1beta1.package.Version.VersionKind kind = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKind() {
      bitField0_ = (bitField0_ & ~0x00000008);
      kind_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1beta1.package.Version)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1beta1.package.Version)
  private static final io.grafeas.v1beta1.pkg.Version DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1beta1.pkg.Version();
  }

  public static io.grafeas.v1beta1.pkg.Version getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Version> PARSER =
      new com.google.protobuf.AbstractParser<Version>() {
        @java.lang.Override
        public Version parsePartialFrom(
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

  public static com.google.protobuf.Parser<Version> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Version> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1beta1.pkg.Version getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
