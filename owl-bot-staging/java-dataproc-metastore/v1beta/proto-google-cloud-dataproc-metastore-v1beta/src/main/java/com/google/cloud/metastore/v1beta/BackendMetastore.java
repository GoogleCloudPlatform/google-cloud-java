// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/metastore/v1beta/metastore_federation.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.metastore.v1beta;

/**
 * <pre>
 * Represents a backend metastore for the federation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1beta.BackendMetastore}
 */
public final class BackendMetastore extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1beta.BackendMetastore)
    BackendMetastoreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BackendMetastore.newBuilder() to construct.
  private BackendMetastore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BackendMetastore() {
    name_ = "";
    metastoreType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BackendMetastore();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.metastore.v1beta.MetastoreFederationProto.internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1beta.MetastoreFederationProto.internal_static_google_cloud_metastore_v1beta_BackendMetastore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1beta.BackendMetastore.class, com.google.cloud.metastore.v1beta.BackendMetastore.Builder.class);
  }

  /**
   * <pre>
   * The type of the backend metastore.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.metastore.v1beta.BackendMetastore.MetastoreType}
   */
  public enum MetastoreType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * The metastore type is not set.
     * </pre>
     *
     * <code>METASTORE_TYPE_UNSPECIFIED = 0;</code>
     */
    METASTORE_TYPE_UNSPECIFIED(0),
    /**
     * <pre>
     * The backend metastore is Dataplex.
     * </pre>
     *
     * <code>DATAPLEX = 1;</code>
     */
    DATAPLEX(1),
    /**
     * <pre>
     * The backend metastore is BigQuery.
     * </pre>
     *
     * <code>BIGQUERY = 2;</code>
     */
    BIGQUERY(2),
    /**
     * <pre>
     * The backend metastore is Dataproc Metastore.
     * </pre>
     *
     * <code>DATAPROC_METASTORE = 3;</code>
     */
    DATAPROC_METASTORE(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * The metastore type is not set.
     * </pre>
     *
     * <code>METASTORE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int METASTORE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The backend metastore is Dataplex.
     * </pre>
     *
     * <code>DATAPLEX = 1;</code>
     */
    public static final int DATAPLEX_VALUE = 1;
    /**
     * <pre>
     * The backend metastore is BigQuery.
     * </pre>
     *
     * <code>BIGQUERY = 2;</code>
     */
    public static final int BIGQUERY_VALUE = 2;
    /**
     * <pre>
     * The backend metastore is Dataproc Metastore.
     * </pre>
     *
     * <code>DATAPROC_METASTORE = 3;</code>
     */
    public static final int DATAPROC_METASTORE_VALUE = 3;


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
    public static MetastoreType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static MetastoreType forNumber(int value) {
      switch (value) {
        case 0: return METASTORE_TYPE_UNSPECIFIED;
        case 1: return DATAPLEX;
        case 2: return BIGQUERY;
        case 3: return DATAPROC_METASTORE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MetastoreType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MetastoreType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MetastoreType>() {
            public MetastoreType findValueByNumber(int number) {
              return MetastoreType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1beta.BackendMetastore.getDescriptor().getEnumTypes().get(0);
    }

    private static final MetastoreType[] VALUES = values();

    public static MetastoreType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MetastoreType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.metastore.v1beta.BackendMetastore.MetastoreType)
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * The relative resource name of the metastore that is being federated.
   * The formats of the relative resource names for the currently supported
   * metastores are listed below:
   *
   * * BigQuery
   *     * `projects/{project_id}`
   * * Dataproc Metastore
   *     * `projects/{project_id}/locations/{location}/services/{service_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
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
   * The relative resource name of the metastore that is being federated.
   * The formats of the relative resource names for the currently supported
   * metastores are listed below:
   *
   * * BigQuery
   *     * `projects/{project_id}`
   * * Dataproc Metastore
   *     * `projects/{project_id}/locations/{location}/services/{service_id}`
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
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

  public static final int METASTORE_TYPE_FIELD_NUMBER = 2;
  private int metastoreType_ = 0;
  /**
   * <pre>
   * The type of the backend metastore.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
   * @return The enum numeric value on the wire for metastoreType.
   */
  @java.lang.Override public int getMetastoreTypeValue() {
    return metastoreType_;
  }
  /**
   * <pre>
   * The type of the backend metastore.
   * </pre>
   *
   * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
   * @return The metastoreType.
   */
  @java.lang.Override public com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType getMetastoreType() {
    com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType result = com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType.forNumber(metastoreType_);
    return result == null ? com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (metastoreType_ != com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType.METASTORE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, metastoreType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (metastoreType_ != com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType.METASTORE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, metastoreType_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1beta.BackendMetastore)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1beta.BackendMetastore other = (com.google.cloud.metastore.v1beta.BackendMetastore) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (metastoreType_ != other.metastoreType_) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + METASTORE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + metastoreType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.BackendMetastore parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.BackendMetastore parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.metastore.v1beta.BackendMetastore parseFrom(
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
  public static Builder newBuilder(com.google.cloud.metastore.v1beta.BackendMetastore prototype) {
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
   * Represents a backend metastore for the federation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1beta.BackendMetastore}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1beta.BackendMetastore)
      com.google.cloud.metastore.v1beta.BackendMetastoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.metastore.v1beta.MetastoreFederationProto.internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1beta.MetastoreFederationProto.internal_static_google_cloud_metastore_v1beta_BackendMetastore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1beta.BackendMetastore.class, com.google.cloud.metastore.v1beta.BackendMetastore.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1beta.BackendMetastore.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      metastoreType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.metastore.v1beta.MetastoreFederationProto.internal_static_google_cloud_metastore_v1beta_BackendMetastore_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.BackendMetastore getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1beta.BackendMetastore.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.BackendMetastore build() {
      com.google.cloud.metastore.v1beta.BackendMetastore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.BackendMetastore buildPartial() {
      com.google.cloud.metastore.v1beta.BackendMetastore result = new com.google.cloud.metastore.v1beta.BackendMetastore(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.metastore.v1beta.BackendMetastore result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metastoreType_ = metastoreType_;
      }
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
      if (other instanceof com.google.cloud.metastore.v1beta.BackendMetastore) {
        return mergeFrom((com.google.cloud.metastore.v1beta.BackendMetastore)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1beta.BackendMetastore other) {
      if (other == com.google.cloud.metastore.v1beta.BackendMetastore.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.metastoreType_ != 0) {
        setMetastoreTypeValue(other.getMetastoreTypeValue());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              metastoreType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The relative resource name of the metastore that is being federated.
     * The formats of the relative resource names for the currently supported
     * metastores are listed below:
     *
     * * BigQuery
     *     * `projects/{project_id}`
     * * Dataproc Metastore
     *     * `projects/{project_id}/locations/{location}/services/{service_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
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
     * The relative resource name of the metastore that is being federated.
     * The formats of the relative resource names for the currently supported
     * metastores are listed below:
     *
     * * BigQuery
     *     * `projects/{project_id}`
     * * Dataproc Metastore
     *     * `projects/{project_id}/locations/{location}/services/{service_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
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
     * The relative resource name of the metastore that is being federated.
     * The formats of the relative resource names for the currently supported
     * metastores are listed below:
     *
     * * BigQuery
     *     * `projects/{project_id}`
     * * Dataproc Metastore
     *     * `projects/{project_id}/locations/{location}/services/{service_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relative resource name of the metastore that is being federated.
     * The formats of the relative resource names for the currently supported
     * metastores are listed below:
     *
     * * BigQuery
     *     * `projects/{project_id}`
     * * Dataproc Metastore
     *     * `projects/{project_id}/locations/{location}/services/{service_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The relative resource name of the metastore that is being federated.
     * The formats of the relative resource names for the currently supported
     * metastores are listed below:
     *
     * * BigQuery
     *     * `projects/{project_id}`
     * * Dataproc Metastore
     *     * `projects/{project_id}/locations/{location}/services/{service_id}`
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int metastoreType_ = 0;
    /**
     * <pre>
     * The type of the backend metastore.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
     * @return The enum numeric value on the wire for metastoreType.
     */
    @java.lang.Override public int getMetastoreTypeValue() {
      return metastoreType_;
    }
    /**
     * <pre>
     * The type of the backend metastore.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
     * @param value The enum numeric value on the wire for metastoreType to set.
     * @return This builder for chaining.
     */
    public Builder setMetastoreTypeValue(int value) {
      metastoreType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the backend metastore.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
     * @return The metastoreType.
     */
    @java.lang.Override
    public com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType getMetastoreType() {
      com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType result = com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType.forNumber(metastoreType_);
      return result == null ? com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of the backend metastore.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
     * @param value The metastoreType to set.
     * @return This builder for chaining.
     */
    public Builder setMetastoreType(com.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      metastoreType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of the backend metastore.
     * </pre>
     *
     * <code>.google.cloud.metastore.v1beta.BackendMetastore.MetastoreType metastore_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetastoreType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metastoreType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1beta.BackendMetastore)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1beta.BackendMetastore)
  private static final com.google.cloud.metastore.v1beta.BackendMetastore DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1beta.BackendMetastore();
  }

  public static com.google.cloud.metastore.v1beta.BackendMetastore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BackendMetastore>
      PARSER = new com.google.protobuf.AbstractParser<BackendMetastore>() {
    @java.lang.Override
    public BackendMetastore parsePartialFrom(
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

  public static com.google.protobuf.Parser<BackendMetastore> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BackendMetastore> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1beta.BackendMetastore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

