// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/table_spec.proto

package com.google.cloud.datacatalog;

/**
 *
 *
 * <pre>
 * Describes a BigQuery table.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1beta1.BigQueryTableSpec}
 */
public final class BigQueryTableSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
    BigQueryTableSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BigQueryTableSpec.newBuilder() to construct.
  private BigQueryTableSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BigQueryTableSpec() {
    tableSourceType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BigQueryTableSpec(
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

              tableSourceType_ = rawValue;
              break;
            }
          case 18:
            {
              com.google.cloud.datacatalog.ViewSpec.Builder subBuilder = null;
              if (typeSpecCase_ == 2) {
                subBuilder = ((com.google.cloud.datacatalog.ViewSpec) typeSpec_).toBuilder();
              }
              typeSpec_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.ViewSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.datacatalog.ViewSpec) typeSpec_);
                typeSpec_ = subBuilder.buildPartial();
              }
              typeSpecCase_ = 2;
              break;
            }
          case 26:
            {
              com.google.cloud.datacatalog.TableSpec.Builder subBuilder = null;
              if (typeSpecCase_ == 3) {
                subBuilder = ((com.google.cloud.datacatalog.TableSpec) typeSpec_).toBuilder();
              }
              typeSpec_ =
                  input.readMessage(
                      com.google.cloud.datacatalog.TableSpec.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.datacatalog.TableSpec) typeSpec_);
                typeSpec_ = subBuilder.buildPartial();
              }
              typeSpecCase_ = 3;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
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
    return com.google.cloud.datacatalog.TableSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.TableSpecOuterClass
        .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.BigQueryTableSpec.class,
            com.google.cloud.datacatalog.BigQueryTableSpec.Builder.class);
  }

  private int typeSpecCase_ = 0;
  private java.lang.Object typeSpec_;

  public enum TypeSpecCase implements com.google.protobuf.Internal.EnumLite {
    VIEW_SPEC(2),
    TABLE_SPEC(3),
    TYPESPEC_NOT_SET(0);
    private final int value;

    private TypeSpecCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static TypeSpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeSpecCase forNumber(int value) {
      switch (value) {
        case 2:
          return VIEW_SPEC;
        case 3:
          return TABLE_SPEC;
        case 0:
          return TYPESPEC_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TypeSpecCase getTypeSpecCase() {
    return TypeSpecCase.forNumber(typeSpecCase_);
  }

  public static final int TABLE_SOURCE_TYPE_FIELD_NUMBER = 1;
  private int tableSourceType_;
  /**
   *
   *
   * <pre>
   * Output only. The table source type.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public int getTableSourceTypeValue() {
    return tableSourceType_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The table source type.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  public com.google.cloud.datacatalog.TableSourceType getTableSourceType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.datacatalog.TableSourceType result =
        com.google.cloud.datacatalog.TableSourceType.valueOf(tableSourceType_);
    return result == null ? com.google.cloud.datacatalog.TableSourceType.UNRECOGNIZED : result;
  }

  public static final int VIEW_SPEC_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * Table view specification. This field should only be populated if
   * `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  public boolean hasViewSpec() {
    return typeSpecCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * Table view specification. This field should only be populated if
   * `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  public com.google.cloud.datacatalog.ViewSpec getViewSpec() {
    if (typeSpecCase_ == 2) {
      return (com.google.cloud.datacatalog.ViewSpec) typeSpec_;
    }
    return com.google.cloud.datacatalog.ViewSpec.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Table view specification. This field should only be populated if
   * `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
   */
  public com.google.cloud.datacatalog.ViewSpecOrBuilder getViewSpecOrBuilder() {
    if (typeSpecCase_ == 2) {
      return (com.google.cloud.datacatalog.ViewSpec) typeSpec_;
    }
    return com.google.cloud.datacatalog.ViewSpec.getDefaultInstance();
  }

  public static final int TABLE_SPEC_FIELD_NUMBER = 3;
  /**
   *
   *
   * <pre>
   * Spec of a BigQuery table. This field should only be populated if
   * `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
   */
  public boolean hasTableSpec() {
    return typeSpecCase_ == 3;
  }
  /**
   *
   *
   * <pre>
   * Spec of a BigQuery table. This field should only be populated if
   * `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
   */
  public com.google.cloud.datacatalog.TableSpec getTableSpec() {
    if (typeSpecCase_ == 3) {
      return (com.google.cloud.datacatalog.TableSpec) typeSpec_;
    }
    return com.google.cloud.datacatalog.TableSpec.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Spec of a BigQuery table. This field should only be populated if
   * `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
   */
  public com.google.cloud.datacatalog.TableSpecOrBuilder getTableSpecOrBuilder() {
    if (typeSpecCase_ == 3) {
      return (com.google.cloud.datacatalog.TableSpec) typeSpec_;
    }
    return com.google.cloud.datacatalog.TableSpec.getDefaultInstance();
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
    if (tableSourceType_
        != com.google.cloud.datacatalog.TableSourceType.TABLE_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, tableSourceType_);
    }
    if (typeSpecCase_ == 2) {
      output.writeMessage(2, (com.google.cloud.datacatalog.ViewSpec) typeSpec_);
    }
    if (typeSpecCase_ == 3) {
      output.writeMessage(3, (com.google.cloud.datacatalog.TableSpec) typeSpec_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (tableSourceType_
        != com.google.cloud.datacatalog.TableSourceType.TABLE_SOURCE_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, tableSourceType_);
    }
    if (typeSpecCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.cloud.datacatalog.ViewSpec) typeSpec_);
    }
    if (typeSpecCase_ == 3) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              3, (com.google.cloud.datacatalog.TableSpec) typeSpec_);
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
    if (!(obj instanceof com.google.cloud.datacatalog.BigQueryTableSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.BigQueryTableSpec other =
        (com.google.cloud.datacatalog.BigQueryTableSpec) obj;

    if (tableSourceType_ != other.tableSourceType_) return false;
    if (!getTypeSpecCase().equals(other.getTypeSpecCase())) return false;
    switch (typeSpecCase_) {
      case 2:
        if (!getViewSpec().equals(other.getViewSpec())) return false;
        break;
      case 3:
        if (!getTableSpec().equals(other.getTableSpec())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TABLE_SOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + tableSourceType_;
    switch (typeSpecCase_) {
      case 2:
        hash = (37 * hash) + VIEW_SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getViewSpec().hashCode();
        break;
      case 3:
        hash = (37 * hash) + TABLE_SPEC_FIELD_NUMBER;
        hash = (53 * hash) + getTableSpec().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.BigQueryTableSpec prototype) {
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
   * Describes a BigQuery table.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1beta1.BigQueryTableSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
      com.google.cloud.datacatalog.BigQueryTableSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.TableSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.TableSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.BigQueryTableSpec.class,
              com.google.cloud.datacatalog.BigQueryTableSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.BigQueryTableSpec.newBuilder()
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
      tableSourceType_ = 0;

      typeSpecCase_ = 0;
      typeSpec_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.TableSpecOuterClass
          .internal_static_google_cloud_datacatalog_v1beta1_BigQueryTableSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.BigQueryTableSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.BigQueryTableSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.BigQueryTableSpec build() {
      com.google.cloud.datacatalog.BigQueryTableSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.BigQueryTableSpec buildPartial() {
      com.google.cloud.datacatalog.BigQueryTableSpec result =
          new com.google.cloud.datacatalog.BigQueryTableSpec(this);
      result.tableSourceType_ = tableSourceType_;
      if (typeSpecCase_ == 2) {
        if (viewSpecBuilder_ == null) {
          result.typeSpec_ = typeSpec_;
        } else {
          result.typeSpec_ = viewSpecBuilder_.build();
        }
      }
      if (typeSpecCase_ == 3) {
        if (tableSpecBuilder_ == null) {
          result.typeSpec_ = typeSpec_;
        } else {
          result.typeSpec_ = tableSpecBuilder_.build();
        }
      }
      result.typeSpecCase_ = typeSpecCase_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.datacatalog.BigQueryTableSpec) {
        return mergeFrom((com.google.cloud.datacatalog.BigQueryTableSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.BigQueryTableSpec other) {
      if (other == com.google.cloud.datacatalog.BigQueryTableSpec.getDefaultInstance()) return this;
      if (other.tableSourceType_ != 0) {
        setTableSourceTypeValue(other.getTableSourceTypeValue());
      }
      switch (other.getTypeSpecCase()) {
        case VIEW_SPEC:
          {
            mergeViewSpec(other.getViewSpec());
            break;
          }
        case TABLE_SPEC:
          {
            mergeTableSpec(other.getTableSpec());
            break;
          }
        case TYPESPEC_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.datacatalog.BigQueryTableSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.datacatalog.BigQueryTableSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int typeSpecCase_ = 0;
    private java.lang.Object typeSpec_;

    public TypeSpecCase getTypeSpecCase() {
      return TypeSpecCase.forNumber(typeSpecCase_);
    }

    public Builder clearTypeSpec() {
      typeSpecCase_ = 0;
      typeSpec_ = null;
      onChanged();
      return this;
    }

    private int tableSourceType_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The table source type.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public int getTableSourceTypeValue() {
      return tableSourceType_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The table source type.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setTableSourceTypeValue(int value) {
      tableSourceType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The table source type.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public com.google.cloud.datacatalog.TableSourceType getTableSourceType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.datacatalog.TableSourceType result =
          com.google.cloud.datacatalog.TableSourceType.valueOf(tableSourceType_);
      return result == null ? com.google.cloud.datacatalog.TableSourceType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The table source type.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder setTableSourceType(com.google.cloud.datacatalog.TableSourceType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      tableSourceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The table source type.
     * </pre>
     *
     * <code>
     * .google.cloud.datacatalog.v1beta1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder clearTableSourceType() {

      tableSourceType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.ViewSpec,
            com.google.cloud.datacatalog.ViewSpec.Builder,
            com.google.cloud.datacatalog.ViewSpecOrBuilder>
        viewSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public boolean hasViewSpec() {
      return typeSpecCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public com.google.cloud.datacatalog.ViewSpec getViewSpec() {
      if (viewSpecBuilder_ == null) {
        if (typeSpecCase_ == 2) {
          return (com.google.cloud.datacatalog.ViewSpec) typeSpec_;
        }
        return com.google.cloud.datacatalog.ViewSpec.getDefaultInstance();
      } else {
        if (typeSpecCase_ == 2) {
          return viewSpecBuilder_.getMessage();
        }
        return com.google.cloud.datacatalog.ViewSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder setViewSpec(com.google.cloud.datacatalog.ViewSpec value) {
      if (viewSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeSpec_ = value;
        onChanged();
      } else {
        viewSpecBuilder_.setMessage(value);
      }
      typeSpecCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder setViewSpec(com.google.cloud.datacatalog.ViewSpec.Builder builderForValue) {
      if (viewSpecBuilder_ == null) {
        typeSpec_ = builderForValue.build();
        onChanged();
      } else {
        viewSpecBuilder_.setMessage(builderForValue.build());
      }
      typeSpecCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder mergeViewSpec(com.google.cloud.datacatalog.ViewSpec value) {
      if (viewSpecBuilder_ == null) {
        if (typeSpecCase_ == 2
            && typeSpec_ != com.google.cloud.datacatalog.ViewSpec.getDefaultInstance()) {
          typeSpec_ =
              com.google.cloud.datacatalog.ViewSpec.newBuilder(
                      (com.google.cloud.datacatalog.ViewSpec) typeSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          typeSpec_ = value;
        }
        onChanged();
      } else {
        if (typeSpecCase_ == 2) {
          viewSpecBuilder_.mergeFrom(value);
        }
        viewSpecBuilder_.setMessage(value);
      }
      typeSpecCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public Builder clearViewSpec() {
      if (viewSpecBuilder_ == null) {
        if (typeSpecCase_ == 2) {
          typeSpecCase_ = 0;
          typeSpec_ = null;
          onChanged();
        }
      } else {
        if (typeSpecCase_ == 2) {
          typeSpecCase_ = 0;
          typeSpec_ = null;
        }
        viewSpecBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public com.google.cloud.datacatalog.ViewSpec.Builder getViewSpecBuilder() {
      return getViewSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    public com.google.cloud.datacatalog.ViewSpecOrBuilder getViewSpecOrBuilder() {
      if ((typeSpecCase_ == 2) && (viewSpecBuilder_ != null)) {
        return viewSpecBuilder_.getMessageOrBuilder();
      } else {
        if (typeSpecCase_ == 2) {
          return (com.google.cloud.datacatalog.ViewSpec) typeSpec_;
        }
        return com.google.cloud.datacatalog.ViewSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Table view specification. This field should only be populated if
     * `table_source_type` is `BIGQUERY_VIEW`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.ViewSpec view_spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.ViewSpec,
            com.google.cloud.datacatalog.ViewSpec.Builder,
            com.google.cloud.datacatalog.ViewSpecOrBuilder>
        getViewSpecFieldBuilder() {
      if (viewSpecBuilder_ == null) {
        if (!(typeSpecCase_ == 2)) {
          typeSpec_ = com.google.cloud.datacatalog.ViewSpec.getDefaultInstance();
        }
        viewSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.ViewSpec,
                com.google.cloud.datacatalog.ViewSpec.Builder,
                com.google.cloud.datacatalog.ViewSpecOrBuilder>(
                (com.google.cloud.datacatalog.ViewSpec) typeSpec_,
                getParentForChildren(),
                isClean());
        typeSpec_ = null;
      }
      typeSpecCase_ = 2;
      onChanged();
      ;
      return viewSpecBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.TableSpec,
            com.google.cloud.datacatalog.TableSpec.Builder,
            com.google.cloud.datacatalog.TableSpecOrBuilder>
        tableSpecBuilder_;
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public boolean hasTableSpec() {
      return typeSpecCase_ == 3;
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public com.google.cloud.datacatalog.TableSpec getTableSpec() {
      if (tableSpecBuilder_ == null) {
        if (typeSpecCase_ == 3) {
          return (com.google.cloud.datacatalog.TableSpec) typeSpec_;
        }
        return com.google.cloud.datacatalog.TableSpec.getDefaultInstance();
      } else {
        if (typeSpecCase_ == 3) {
          return tableSpecBuilder_.getMessage();
        }
        return com.google.cloud.datacatalog.TableSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public Builder setTableSpec(com.google.cloud.datacatalog.TableSpec value) {
      if (tableSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typeSpec_ = value;
        onChanged();
      } else {
        tableSpecBuilder_.setMessage(value);
      }
      typeSpecCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public Builder setTableSpec(com.google.cloud.datacatalog.TableSpec.Builder builderForValue) {
      if (tableSpecBuilder_ == null) {
        typeSpec_ = builderForValue.build();
        onChanged();
      } else {
        tableSpecBuilder_.setMessage(builderForValue.build());
      }
      typeSpecCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public Builder mergeTableSpec(com.google.cloud.datacatalog.TableSpec value) {
      if (tableSpecBuilder_ == null) {
        if (typeSpecCase_ == 3
            && typeSpec_ != com.google.cloud.datacatalog.TableSpec.getDefaultInstance()) {
          typeSpec_ =
              com.google.cloud.datacatalog.TableSpec.newBuilder(
                      (com.google.cloud.datacatalog.TableSpec) typeSpec_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          typeSpec_ = value;
        }
        onChanged();
      } else {
        if (typeSpecCase_ == 3) {
          tableSpecBuilder_.mergeFrom(value);
        }
        tableSpecBuilder_.setMessage(value);
      }
      typeSpecCase_ = 3;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public Builder clearTableSpec() {
      if (tableSpecBuilder_ == null) {
        if (typeSpecCase_ == 3) {
          typeSpecCase_ = 0;
          typeSpec_ = null;
          onChanged();
        }
      } else {
        if (typeSpecCase_ == 3) {
          typeSpecCase_ = 0;
          typeSpec_ = null;
        }
        tableSpecBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public com.google.cloud.datacatalog.TableSpec.Builder getTableSpecBuilder() {
      return getTableSpecFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    public com.google.cloud.datacatalog.TableSpecOrBuilder getTableSpecOrBuilder() {
      if ((typeSpecCase_ == 3) && (tableSpecBuilder_ != null)) {
        return tableSpecBuilder_.getMessageOrBuilder();
      } else {
        if (typeSpecCase_ == 3) {
          return (com.google.cloud.datacatalog.TableSpec) typeSpec_;
        }
        return com.google.cloud.datacatalog.TableSpec.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Spec of a BigQuery table. This field should only be populated if
     * `table_source_type` is `BIGQUERY_TABLE`.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1beta1.TableSpec table_spec = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.TableSpec,
            com.google.cloud.datacatalog.TableSpec.Builder,
            com.google.cloud.datacatalog.TableSpecOrBuilder>
        getTableSpecFieldBuilder() {
      if (tableSpecBuilder_ == null) {
        if (!(typeSpecCase_ == 3)) {
          typeSpec_ = com.google.cloud.datacatalog.TableSpec.getDefaultInstance();
        }
        tableSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.TableSpec,
                com.google.cloud.datacatalog.TableSpec.Builder,
                com.google.cloud.datacatalog.TableSpecOrBuilder>(
                (com.google.cloud.datacatalog.TableSpec) typeSpec_,
                getParentForChildren(),
                isClean());
        typeSpec_ = null;
      }
      typeSpecCase_ = 3;
      onChanged();
      ;
      return tableSpecBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1beta1.BigQueryTableSpec)
  private static final com.google.cloud.datacatalog.BigQueryTableSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.BigQueryTableSpec();
  }

  public static com.google.cloud.datacatalog.BigQueryTableSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BigQueryTableSpec> PARSER =
      new com.google.protobuf.AbstractParser<BigQueryTableSpec>() {
        @java.lang.Override
        public BigQueryTableSpec parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BigQueryTableSpec(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BigQueryTableSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BigQueryTableSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.BigQueryTableSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
