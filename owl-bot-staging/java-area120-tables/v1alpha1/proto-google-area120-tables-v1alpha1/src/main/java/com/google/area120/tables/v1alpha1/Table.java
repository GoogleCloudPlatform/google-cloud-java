// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/area120/tables/v1alpha1/tables.proto

package com.google.area120.tables.v1alpha1;

/**
 * <pre>
 * A single table.
 * </pre>
 *
 * Protobuf type {@code google.area120.tables.v1alpha1.Table}
 */
public final class Table extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.area120.tables.v1alpha1.Table)
    TableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Table.newBuilder() to construct.
  private Table(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Table() {
    name_ = "";
    displayName_ = "";
    columns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Table();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.area120.tables.v1alpha1.TablesProto.internal_static_google_area120_tables_v1alpha1_Table_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.area120.tables.v1alpha1.TablesProto.internal_static_google_area120_tables_v1alpha1_Table_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.area120.tables.v1alpha1.Table.class, com.google.area120.tables.v1alpha1.Table.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The resource name of the table.
   * Table names have the form `tables/{table}`.
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
   * The resource name of the table.
   * Table names have the form `tables/{table}`.
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

  public static final int DISPLAY_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object displayName_;
  /**
   * <pre>
   * The human readable title of the table.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The displayName.
   */
  @java.lang.Override
  public java.lang.String getDisplayName() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      displayName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The human readable title of the table.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   * @return The bytes for displayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDisplayNameBytes() {
    java.lang.Object ref = displayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      displayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLUMNS_FIELD_NUMBER = 3;
  private java.util.List<com.google.area120.tables.v1alpha1.ColumnDescription> columns_;
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.area120.tables.v1alpha1.ColumnDescription> getColumnsList() {
    return columns_;
  }
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder> 
      getColumnsOrBuilderList() {
    return columns_;
  }
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  @java.lang.Override
  public int getColumnsCount() {
    return columns_.size();
  }
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.ColumnDescription getColumns(int index) {
    return columns_.get(index);
  }
  /**
   * <pre>
   * List of columns in this table.
   * Order of columns matches the display order.
   * </pre>
   *
   * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
   */
  @java.lang.Override
  public com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder getColumnsOrBuilder(
      int index) {
    return columns_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, displayName_);
    }
    for (int i = 0; i < columns_.size(); i++) {
      output.writeMessage(3, columns_.get(i));
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(displayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, displayName_);
    }
    for (int i = 0; i < columns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, columns_.get(i));
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
    if (!(obj instanceof com.google.area120.tables.v1alpha1.Table)) {
      return super.equals(obj);
    }
    com.google.area120.tables.v1alpha1.Table other = (com.google.area120.tables.v1alpha1.Table) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getDisplayName()
        .equals(other.getDisplayName())) return false;
    if (!getColumnsList()
        .equals(other.getColumnsList())) return false;
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
    hash = (37 * hash) + DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDisplayName().hashCode();
    if (getColumnsCount() > 0) {
      hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.area120.tables.v1alpha1.Table parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.area120.tables.v1alpha1.Table parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.area120.tables.v1alpha1.Table parseFrom(
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
  public static Builder newBuilder(com.google.area120.tables.v1alpha1.Table prototype) {
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
   * A single table.
   * </pre>
   *
   * Protobuf type {@code google.area120.tables.v1alpha1.Table}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.area120.tables.v1alpha1.Table)
      com.google.area120.tables.v1alpha1.TableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.area120.tables.v1alpha1.TablesProto.internal_static_google_area120_tables_v1alpha1_Table_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.area120.tables.v1alpha1.TablesProto.internal_static_google_area120_tables_v1alpha1_Table_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.area120.tables.v1alpha1.Table.class, com.google.area120.tables.v1alpha1.Table.Builder.class);
    }

    // Construct using com.google.area120.tables.v1alpha1.Table.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      displayName_ = "";

      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
      } else {
        columns_ = null;
        columnsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.area120.tables.v1alpha1.TablesProto.internal_static_google_area120_tables_v1alpha1_Table_descriptor;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.Table getDefaultInstanceForType() {
      return com.google.area120.tables.v1alpha1.Table.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.Table build() {
      com.google.area120.tables.v1alpha1.Table result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.area120.tables.v1alpha1.Table buildPartial() {
      com.google.area120.tables.v1alpha1.Table result = new com.google.area120.tables.v1alpha1.Table(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      result.displayName_ = displayName_;
      if (columnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          columns_ = java.util.Collections.unmodifiableList(columns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columns_ = columns_;
      } else {
        result.columns_ = columnsBuilder_.build();
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
      if (other instanceof com.google.area120.tables.v1alpha1.Table) {
        return mergeFrom((com.google.area120.tables.v1alpha1.Table)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.area120.tables.v1alpha1.Table other) {
      if (other == com.google.area120.tables.v1alpha1.Table.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDisplayName().isEmpty()) {
        displayName_ = other.displayName_;
        onChanged();
      }
      if (columnsBuilder_ == null) {
        if (!other.columns_.isEmpty()) {
          if (columns_.isEmpty()) {
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnsIsMutable();
            columns_.addAll(other.columns_);
          }
          onChanged();
        }
      } else {
        if (!other.columns_.isEmpty()) {
          if (columnsBuilder_.isEmpty()) {
            columnsBuilder_.dispose();
            columnsBuilder_ = null;
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnsFieldBuilder() : null;
          } else {
            columnsBuilder_.addAllMessages(other.columns_);
          }
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
            case 10: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 10
            case 18: {
              displayName_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              com.google.area120.tables.v1alpha1.ColumnDescription m =
                  input.readMessage(
                      com.google.area120.tables.v1alpha1.ColumnDescription.parser(),
                      extensionRegistry);
              if (columnsBuilder_ == null) {
                ensureColumnsIsMutable();
                columns_.add(m);
              } else {
                columnsBuilder_.addMessage(m);
              }
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

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The resource name of the table.
     * Table names have the form `tables/{table}`.
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
     * The resource name of the table.
     * Table names have the form `tables/{table}`.
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
     * The resource name of the table.
     * Table names have the form `tables/{table}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
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
     * The resource name of the table.
     * Table names have the form `tables/{table}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the table.
     * Table names have the form `tables/{table}`.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
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

    private java.lang.Object displayName_ = "";
    /**
     * <pre>
     * The human readable title of the table.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The displayName.
     */
    public java.lang.String getDisplayName() {
      java.lang.Object ref = displayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        displayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The human readable title of the table.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return The bytes for displayName.
     */
    public com.google.protobuf.ByteString
        getDisplayNameBytes() {
      java.lang.Object ref = displayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        displayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The human readable title of the table.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      displayName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The human readable title of the table.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisplayName() {
      
      displayName_ = getDefaultInstance().getDisplayName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The human readable title of the table.
     * </pre>
     *
     * <code>string display_name = 2;</code>
     * @param value The bytes for displayName to set.
     * @return This builder for chaining.
     */
    public Builder setDisplayNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      displayName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.area120.tables.v1alpha1.ColumnDescription> columns_ =
      java.util.Collections.emptyList();
    private void ensureColumnsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        columns_ = new java.util.ArrayList<com.google.area120.tables.v1alpha1.ColumnDescription>(columns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.area120.tables.v1alpha1.ColumnDescription, com.google.area120.tables.v1alpha1.ColumnDescription.Builder, com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder> columnsBuilder_;

    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public java.util.List<com.google.area120.tables.v1alpha1.ColumnDescription> getColumnsList() {
      if (columnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columns_);
      } else {
        return columnsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public int getColumnsCount() {
      if (columnsBuilder_ == null) {
        return columns_.size();
      } else {
        return columnsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public com.google.area120.tables.v1alpha1.ColumnDescription getColumns(int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);
      } else {
        return columnsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder setColumns(
        int index, com.google.area120.tables.v1alpha1.ColumnDescription value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.set(index, value);
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder setColumns(
        int index, com.google.area120.tables.v1alpha1.ColumnDescription.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder addColumns(com.google.area120.tables.v1alpha1.ColumnDescription value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder addColumns(
        int index, com.google.area120.tables.v1alpha1.ColumnDescription value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(index, value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder addColumns(
        com.google.area120.tables.v1alpha1.ColumnDescription.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder addColumns(
        int index, com.google.area120.tables.v1alpha1.ColumnDescription.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder addAllColumns(
        java.lang.Iterable<? extends com.google.area120.tables.v1alpha1.ColumnDescription> values) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columns_);
        onChanged();
      } else {
        columnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder clearColumns() {
      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public Builder removeColumns(int index) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.remove(index);
        onChanged();
      } else {
        columnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public com.google.area120.tables.v1alpha1.ColumnDescription.Builder getColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder getColumnsOrBuilder(
        int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);  } else {
        return columnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public java.util.List<? extends com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder> 
         getColumnsOrBuilderList() {
      if (columnsBuilder_ != null) {
        return columnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columns_);
      }
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public com.google.area120.tables.v1alpha1.ColumnDescription.Builder addColumnsBuilder() {
      return getColumnsFieldBuilder().addBuilder(
          com.google.area120.tables.v1alpha1.ColumnDescription.getDefaultInstance());
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public com.google.area120.tables.v1alpha1.ColumnDescription.Builder addColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().addBuilder(
          index, com.google.area120.tables.v1alpha1.ColumnDescription.getDefaultInstance());
    }
    /**
     * <pre>
     * List of columns in this table.
     * Order of columns matches the display order.
     * </pre>
     *
     * <code>repeated .google.area120.tables.v1alpha1.ColumnDescription columns = 3;</code>
     */
    public java.util.List<com.google.area120.tables.v1alpha1.ColumnDescription.Builder> 
         getColumnsBuilderList() {
      return getColumnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.area120.tables.v1alpha1.ColumnDescription, com.google.area120.tables.v1alpha1.ColumnDescription.Builder, com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder> 
        getColumnsFieldBuilder() {
      if (columnsBuilder_ == null) {
        columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.area120.tables.v1alpha1.ColumnDescription, com.google.area120.tables.v1alpha1.ColumnDescription.Builder, com.google.area120.tables.v1alpha1.ColumnDescriptionOrBuilder>(
                columns_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        columns_ = null;
      }
      return columnsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.area120.tables.v1alpha1.Table)
  }

  // @@protoc_insertion_point(class_scope:google.area120.tables.v1alpha1.Table)
  private static final com.google.area120.tables.v1alpha1.Table DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.area120.tables.v1alpha1.Table();
  }

  public static com.google.area120.tables.v1alpha1.Table getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Table>
      PARSER = new com.google.protobuf.AbstractParser<Table>() {
    @java.lang.Override
    public Table parsePartialFrom(
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

  public static com.google.protobuf.Parser<Table> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Table> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.area120.tables.v1alpha1.Table getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

