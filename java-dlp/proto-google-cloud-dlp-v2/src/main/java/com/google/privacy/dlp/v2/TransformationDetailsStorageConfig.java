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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.5
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Config for storing transformation details.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.TransformationDetailsStorageConfig}
 */
public final class TransformationDetailsStorageConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.TransformationDetailsStorageConfig)
    TransformationDetailsStorageConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TransformationDetailsStorageConfig.newBuilder() to construct.
  private TransformationDetailsStorageConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TransformationDetailsStorageConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TransformationDetailsStorageConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_TransformationDetailsStorageConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_TransformationDetailsStorageConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.class,
            com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.Builder.class);
  }

  private int typeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object type_;

  public enum TypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    TABLE(1),
    TYPE_NOT_SET(0);
    private final int value;

    private TypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static TypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return TABLE;
        case 0:
          return TYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public TypeCase getTypeCase() {
    return TypeCase.forNumber(typeCase_);
  }

  public static final int TABLE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The BigQuery table in which to store the output. This may be an existing
   * table or in a new table in an existing dataset.
   * If table_id is not set a new one will be generated for you with the
   * following format:
   * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
   * time zone will be used for generating the date details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return Whether the table field is set.
   */
  @java.lang.Override
  public boolean hasTable() {
    return typeCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The BigQuery table in which to store the output. This may be an existing
   * table or in a new table in an existing dataset.
   * If table_id is not set a new one will be generated for you with the
   * following format:
   * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
   * time zone will be used for generating the date details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   *
   * @return The table.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryTable getTable() {
    if (typeCase_ == 1) {
      return (com.google.privacy.dlp.v2.BigQueryTable) type_;
    }
    return com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * The BigQuery table in which to store the output. This may be an existing
   * table or in a new table in an existing dataset.
   * If table_id is not set a new one will be generated for you with the
   * following format:
   * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
   * time zone will be used for generating the date details.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder() {
    if (typeCase_ == 1) {
      return (com.google.privacy.dlp.v2.BigQueryTable) type_;
    }
    return com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance();
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
    if (typeCase_ == 1) {
      output.writeMessage(1, (com.google.privacy.dlp.v2.BigQueryTable) type_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (typeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.privacy.dlp.v2.BigQueryTable) type_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.TransformationDetailsStorageConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.TransformationDetailsStorageConfig other =
        (com.google.privacy.dlp.v2.TransformationDetailsStorageConfig) obj;

    if (!getTypeCase().equals(other.getTypeCase())) return false;
    switch (typeCase_) {
      case 1:
        if (!getTable().equals(other.getTable())) return false;
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
    switch (typeCase_) {
      case 1:
        hash = (37 * hash) + TABLE_FIELD_NUMBER;
        hash = (53 * hash) + getTable().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig parseFrom(
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
      com.google.privacy.dlp.v2.TransformationDetailsStorageConfig prototype) {
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
   * Config for storing transformation details.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.TransformationDetailsStorageConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.TransformationDetailsStorageConfig)
      com.google.privacy.dlp.v2.TransformationDetailsStorageConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_TransformationDetailsStorageConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_TransformationDetailsStorageConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.class,
              com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (tableBuilder_ != null) {
        tableBuilder_.clear();
      }
      typeCase_ = 0;
      type_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_TransformationDetailsStorageConfig_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationDetailsStorageConfig
        getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationDetailsStorageConfig build() {
      com.google.privacy.dlp.v2.TransformationDetailsStorageConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationDetailsStorageConfig buildPartial() {
      com.google.privacy.dlp.v2.TransformationDetailsStorageConfig result =
          new com.google.privacy.dlp.v2.TransformationDetailsStorageConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.privacy.dlp.v2.TransformationDetailsStorageConfig result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.privacy.dlp.v2.TransformationDetailsStorageConfig result) {
      result.typeCase_ = typeCase_;
      result.type_ = this.type_;
      if (typeCase_ == 1 && tableBuilder_ != null) {
        result.type_ = tableBuilder_.build();
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
      if (other instanceof com.google.privacy.dlp.v2.TransformationDetailsStorageConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.TransformationDetailsStorageConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.TransformationDetailsStorageConfig other) {
      if (other
          == com.google.privacy.dlp.v2.TransformationDetailsStorageConfig.getDefaultInstance())
        return this;
      switch (other.getTypeCase()) {
        case TABLE:
          {
            mergeTable(other.getTable());
            break;
          }
        case TYPE_NOT_SET:
          {
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
            case 10:
              {
                input.readMessage(getTableFieldBuilder().getBuilder(), extensionRegistry);
                typeCase_ = 1;
                break;
              } // case 10
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

    private int typeCase_ = 0;
    private java.lang.Object type_;

    public TypeCase getTypeCase() {
      return TypeCase.forNumber(typeCase_);
    }

    public Builder clearType() {
      typeCase_ = 0;
      type_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryTable,
            com.google.privacy.dlp.v2.BigQueryTable.Builder,
            com.google.privacy.dlp.v2.BigQueryTableOrBuilder>
        tableBuilder_;
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     *
     * @return Whether the table field is set.
     */
    @java.lang.Override
    public boolean hasTable() {
      return typeCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     *
     * @return The table.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryTable getTable() {
      if (tableBuilder_ == null) {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2.BigQueryTable) type_;
        }
        return com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance();
      } else {
        if (typeCase_ == 1) {
          return tableBuilder_.getMessage();
        }
        return com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder setTable(com.google.privacy.dlp.v2.BigQueryTable value) {
      if (tableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        tableBuilder_.setMessage(value);
      }
      typeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder setTable(com.google.privacy.dlp.v2.BigQueryTable.Builder builderForValue) {
      if (tableBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        tableBuilder_.setMessage(builderForValue.build());
      }
      typeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder mergeTable(com.google.privacy.dlp.v2.BigQueryTable value) {
      if (tableBuilder_ == null) {
        if (typeCase_ == 1
            && type_ != com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance()) {
          type_ =
              com.google.privacy.dlp.v2.BigQueryTable.newBuilder(
                      (com.google.privacy.dlp.v2.BigQueryTable) type_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        if (typeCase_ == 1) {
          tableBuilder_.mergeFrom(value);
        } else {
          tableBuilder_.setMessage(value);
        }
      }
      typeCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public Builder clearTable() {
      if (tableBuilder_ == null) {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
          onChanged();
        }
      } else {
        if (typeCase_ == 1) {
          typeCase_ = 0;
          type_ = null;
        }
        tableBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    public com.google.privacy.dlp.v2.BigQueryTable.Builder getTableBuilder() {
      return getTableFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.BigQueryTableOrBuilder getTableOrBuilder() {
      if ((typeCase_ == 1) && (tableBuilder_ != null)) {
        return tableBuilder_.getMessageOrBuilder();
      } else {
        if (typeCase_ == 1) {
          return (com.google.privacy.dlp.v2.BigQueryTable) type_;
        }
        return com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * The BigQuery table in which to store the output. This may be an existing
     * table or in a new table in an existing dataset.
     * If table_id is not set a new one will be generated for you with the
     * following format:
     * dlp_googleapis_transformation_details_yyyy_mm_dd_[dlp_job_id]. Pacific
     * time zone will be used for generating the date details.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.BigQueryTable table = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.BigQueryTable,
            com.google.privacy.dlp.v2.BigQueryTable.Builder,
            com.google.privacy.dlp.v2.BigQueryTableOrBuilder>
        getTableFieldBuilder() {
      if (tableBuilder_ == null) {
        if (!(typeCase_ == 1)) {
          type_ = com.google.privacy.dlp.v2.BigQueryTable.getDefaultInstance();
        }
        tableBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.BigQueryTable,
                com.google.privacy.dlp.v2.BigQueryTable.Builder,
                com.google.privacy.dlp.v2.BigQueryTableOrBuilder>(
                (com.google.privacy.dlp.v2.BigQueryTable) type_, getParentForChildren(), isClean());
        type_ = null;
      }
      typeCase_ = 1;
      onChanged();
      return tableBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.TransformationDetailsStorageConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.TransformationDetailsStorageConfig)
  private static final com.google.privacy.dlp.v2.TransformationDetailsStorageConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.TransformationDetailsStorageConfig();
  }

  public static com.google.privacy.dlp.v2.TransformationDetailsStorageConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransformationDetailsStorageConfig> PARSER =
      new com.google.protobuf.AbstractParser<TransformationDetailsStorageConfig>() {
        @java.lang.Override
        public TransformationDetailsStorageConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransformationDetailsStorageConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransformationDetailsStorageConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.TransformationDetailsStorageConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
