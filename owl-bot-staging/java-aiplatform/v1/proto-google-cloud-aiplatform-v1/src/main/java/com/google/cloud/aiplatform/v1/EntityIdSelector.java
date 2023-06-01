// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1/featurestore_service.proto

package com.google.cloud.aiplatform.v1;

/**
 * <pre>
 * Selector for entityId. Getting ids from the given source.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.EntityIdSelector}
 */
public final class EntityIdSelector extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.EntityIdSelector)
    EntityIdSelectorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityIdSelector.newBuilder() to construct.
  private EntityIdSelector(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityIdSelector() {
    entityIdField_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntityIdSelector();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1_EntityIdSelector_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1_EntityIdSelector_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.EntityIdSelector.class, com.google.cloud.aiplatform.v1.EntityIdSelector.Builder.class);
  }

  private int entityIdsSourceCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object entityIdsSource_;
  public enum EntityIdsSourceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CSV_SOURCE(3),
    ENTITYIDSSOURCE_NOT_SET(0);
    private final int value;
    private EntityIdsSourceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EntityIdsSourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static EntityIdsSourceCase forNumber(int value) {
      switch (value) {
        case 3: return CSV_SOURCE;
        case 0: return ENTITYIDSSOURCE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public EntityIdsSourceCase
  getEntityIdsSourceCase() {
    return EntityIdsSourceCase.forNumber(
        entityIdsSourceCase_);
  }

  public static final int CSV_SOURCE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Source of Csv
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
   * @return Whether the csvSource field is set.
   */
  @java.lang.Override
  public boolean hasCsvSource() {
    return entityIdsSourceCase_ == 3;
  }
  /**
   * <pre>
   * Source of Csv
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
   * @return The csvSource.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CsvSource getCsvSource() {
    if (entityIdsSourceCase_ == 3) {
       return (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_;
    }
    return com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance();
  }
  /**
   * <pre>
   * Source of Csv
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CsvSourceOrBuilder getCsvSourceOrBuilder() {
    if (entityIdsSourceCase_ == 3) {
       return (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_;
    }
    return com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance();
  }

  public static final int ENTITY_ID_FIELD_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object entityIdField_ = "";
  /**
   * <pre>
   * Source column that holds entity IDs. If not provided, entity IDs are
   * extracted from the column named entity_id.
   * </pre>
   *
   * <code>string entity_id_field = 5;</code>
   * @return The entityIdField.
   */
  @java.lang.Override
  public java.lang.String getEntityIdField() {
    java.lang.Object ref = entityIdField_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      entityIdField_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Source column that holds entity IDs. If not provided, entity IDs are
   * extracted from the column named entity_id.
   * </pre>
   *
   * <code>string entity_id_field = 5;</code>
   * @return The bytes for entityIdField.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEntityIdFieldBytes() {
    java.lang.Object ref = entityIdField_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      entityIdField_ = b;
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
    if (entityIdsSourceCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityIdField_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, entityIdField_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (entityIdsSourceCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(entityIdField_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, entityIdField_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.EntityIdSelector)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.EntityIdSelector other = (com.google.cloud.aiplatform.v1.EntityIdSelector) obj;

    if (!getEntityIdField()
        .equals(other.getEntityIdField())) return false;
    if (!getEntityIdsSourceCase().equals(other.getEntityIdsSourceCase())) return false;
    switch (entityIdsSourceCase_) {
      case 3:
        if (!getCsvSource()
            .equals(other.getCsvSource())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + ENTITY_ID_FIELD_FIELD_NUMBER;
    hash = (53 * hash) + getEntityIdField().hashCode();
    switch (entityIdsSourceCase_) {
      case 3:
        hash = (37 * hash) + CSV_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getCsvSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.aiplatform.v1.EntityIdSelector parseFrom(
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
  public static Builder newBuilder(com.google.cloud.aiplatform.v1.EntityIdSelector prototype) {
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
   * Selector for entityId. Getting ids from the given source.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.EntityIdSelector}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.EntityIdSelector)
      com.google.cloud.aiplatform.v1.EntityIdSelectorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1_EntityIdSelector_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1_EntityIdSelector_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.EntityIdSelector.class, com.google.cloud.aiplatform.v1.EntityIdSelector.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.EntityIdSelector.newBuilder()
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
      if (csvSourceBuilder_ != null) {
        csvSourceBuilder_.clear();
      }
      entityIdField_ = "";
      entityIdsSourceCase_ = 0;
      entityIdsSource_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.FeaturestoreServiceProto.internal_static_google_cloud_aiplatform_v1_EntityIdSelector_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.EntityIdSelector getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.EntityIdSelector.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.EntityIdSelector build() {
      com.google.cloud.aiplatform.v1.EntityIdSelector result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.EntityIdSelector buildPartial() {
      com.google.cloud.aiplatform.v1.EntityIdSelector result = new com.google.cloud.aiplatform.v1.EntityIdSelector(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.EntityIdSelector result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.entityIdField_ = entityIdField_;
      }
    }

    private void buildPartialOneofs(com.google.cloud.aiplatform.v1.EntityIdSelector result) {
      result.entityIdsSourceCase_ = entityIdsSourceCase_;
      result.entityIdsSource_ = this.entityIdsSource_;
      if (entityIdsSourceCase_ == 3 &&
          csvSourceBuilder_ != null) {
        result.entityIdsSource_ = csvSourceBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1.EntityIdSelector) {
        return mergeFrom((com.google.cloud.aiplatform.v1.EntityIdSelector)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.EntityIdSelector other) {
      if (other == com.google.cloud.aiplatform.v1.EntityIdSelector.getDefaultInstance()) return this;
      if (!other.getEntityIdField().isEmpty()) {
        entityIdField_ = other.entityIdField_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      switch (other.getEntityIdsSourceCase()) {
        case CSV_SOURCE: {
          mergeCsvSource(other.getCsvSource());
          break;
        }
        case ENTITYIDSSOURCE_NOT_SET: {
          break;
        }
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
            case 26: {
              input.readMessage(
                  getCsvSourceFieldBuilder().getBuilder(),
                  extensionRegistry);
              entityIdsSourceCase_ = 3;
              break;
            } // case 26
            case 42: {
              entityIdField_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
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
    private int entityIdsSourceCase_ = 0;
    private java.lang.Object entityIdsSource_;
    public EntityIdsSourceCase
        getEntityIdsSourceCase() {
      return EntityIdsSourceCase.forNumber(
          entityIdsSourceCase_);
    }

    public Builder clearEntityIdsSource() {
      entityIdsSourceCase_ = 0;
      entityIdsSource_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.CsvSource, com.google.cloud.aiplatform.v1.CsvSource.Builder, com.google.cloud.aiplatform.v1.CsvSourceOrBuilder> csvSourceBuilder_;
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     * @return Whether the csvSource field is set.
     */
    @java.lang.Override
    public boolean hasCsvSource() {
      return entityIdsSourceCase_ == 3;
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     * @return The csvSource.
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CsvSource getCsvSource() {
      if (csvSourceBuilder_ == null) {
        if (entityIdsSourceCase_ == 3) {
          return (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_;
        }
        return com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance();
      } else {
        if (entityIdsSourceCase_ == 3) {
          return csvSourceBuilder_.getMessage();
        }
        return com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    public Builder setCsvSource(com.google.cloud.aiplatform.v1.CsvSource value) {
      if (csvSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        entityIdsSource_ = value;
        onChanged();
      } else {
        csvSourceBuilder_.setMessage(value);
      }
      entityIdsSourceCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    public Builder setCsvSource(
        com.google.cloud.aiplatform.v1.CsvSource.Builder builderForValue) {
      if (csvSourceBuilder_ == null) {
        entityIdsSource_ = builderForValue.build();
        onChanged();
      } else {
        csvSourceBuilder_.setMessage(builderForValue.build());
      }
      entityIdsSourceCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    public Builder mergeCsvSource(com.google.cloud.aiplatform.v1.CsvSource value) {
      if (csvSourceBuilder_ == null) {
        if (entityIdsSourceCase_ == 3 &&
            entityIdsSource_ != com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance()) {
          entityIdsSource_ = com.google.cloud.aiplatform.v1.CsvSource.newBuilder((com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_)
              .mergeFrom(value).buildPartial();
        } else {
          entityIdsSource_ = value;
        }
        onChanged();
      } else {
        if (entityIdsSourceCase_ == 3) {
          csvSourceBuilder_.mergeFrom(value);
        } else {
          csvSourceBuilder_.setMessage(value);
        }
      }
      entityIdsSourceCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    public Builder clearCsvSource() {
      if (csvSourceBuilder_ == null) {
        if (entityIdsSourceCase_ == 3) {
          entityIdsSourceCase_ = 0;
          entityIdsSource_ = null;
          onChanged();
        }
      } else {
        if (entityIdsSourceCase_ == 3) {
          entityIdsSourceCase_ = 0;
          entityIdsSource_ = null;
        }
        csvSourceBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    public com.google.cloud.aiplatform.v1.CsvSource.Builder getCsvSourceBuilder() {
      return getCsvSourceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CsvSourceOrBuilder getCsvSourceOrBuilder() {
      if ((entityIdsSourceCase_ == 3) && (csvSourceBuilder_ != null)) {
        return csvSourceBuilder_.getMessageOrBuilder();
      } else {
        if (entityIdsSourceCase_ == 3) {
          return (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_;
        }
        return com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Source of Csv
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1.CsvSource csv_source = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.aiplatform.v1.CsvSource, com.google.cloud.aiplatform.v1.CsvSource.Builder, com.google.cloud.aiplatform.v1.CsvSourceOrBuilder> 
        getCsvSourceFieldBuilder() {
      if (csvSourceBuilder_ == null) {
        if (!(entityIdsSourceCase_ == 3)) {
          entityIdsSource_ = com.google.cloud.aiplatform.v1.CsvSource.getDefaultInstance();
        }
        csvSourceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.CsvSource, com.google.cloud.aiplatform.v1.CsvSource.Builder, com.google.cloud.aiplatform.v1.CsvSourceOrBuilder>(
                (com.google.cloud.aiplatform.v1.CsvSource) entityIdsSource_,
                getParentForChildren(),
                isClean());
        entityIdsSource_ = null;
      }
      entityIdsSourceCase_ = 3;
      onChanged();
      return csvSourceBuilder_;
    }

    private java.lang.Object entityIdField_ = "";
    /**
     * <pre>
     * Source column that holds entity IDs. If not provided, entity IDs are
     * extracted from the column named entity_id.
     * </pre>
     *
     * <code>string entity_id_field = 5;</code>
     * @return The entityIdField.
     */
    public java.lang.String getEntityIdField() {
      java.lang.Object ref = entityIdField_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        entityIdField_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Source column that holds entity IDs. If not provided, entity IDs are
     * extracted from the column named entity_id.
     * </pre>
     *
     * <code>string entity_id_field = 5;</code>
     * @return The bytes for entityIdField.
     */
    public com.google.protobuf.ByteString
        getEntityIdFieldBytes() {
      java.lang.Object ref = entityIdField_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        entityIdField_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Source column that holds entity IDs. If not provided, entity IDs are
     * extracted from the column named entity_id.
     * </pre>
     *
     * <code>string entity_id_field = 5;</code>
     * @param value The entityIdField to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdField(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      entityIdField_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source column that holds entity IDs. If not provided, entity IDs are
     * extracted from the column named entity_id.
     * </pre>
     *
     * <code>string entity_id_field = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityIdField() {
      entityIdField_ = getDefaultInstance().getEntityIdField();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Source column that holds entity IDs. If not provided, entity IDs are
     * extracted from the column named entity_id.
     * </pre>
     *
     * <code>string entity_id_field = 5;</code>
     * @param value The bytes for entityIdField to set.
     * @return This builder for chaining.
     */
    public Builder setEntityIdFieldBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      entityIdField_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.EntityIdSelector)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.EntityIdSelector)
  private static final com.google.cloud.aiplatform.v1.EntityIdSelector DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.EntityIdSelector();
  }

  public static com.google.cloud.aiplatform.v1.EntityIdSelector getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityIdSelector>
      PARSER = new com.google.protobuf.AbstractParser<EntityIdSelector>() {
    @java.lang.Override
    public EntityIdSelector parsePartialFrom(
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

  public static com.google.protobuf.Parser<EntityIdSelector> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityIdSelector> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.EntityIdSelector getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

