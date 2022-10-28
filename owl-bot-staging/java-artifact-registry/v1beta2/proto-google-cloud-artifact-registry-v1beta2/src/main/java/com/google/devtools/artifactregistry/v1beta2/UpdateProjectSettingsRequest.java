// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/settings.proto

package com.google.devtools.artifactregistry.v1beta2;

/**
 * <pre>
 * Sets the settings of the project.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest}
 */
public final class UpdateProjectSettingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)
    UpdateProjectSettingsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateProjectSettingsRequest.newBuilder() to construct.
  private UpdateProjectSettingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateProjectSettingsRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateProjectSettingsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.class, com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.Builder.class);
  }

  public static final int PROJECT_SETTINGS_FIELD_NUMBER = 2;
  private com.google.devtools.artifactregistry.v1beta2.ProjectSettings projectSettings_;
  /**
   * <pre>
   * The project settings.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
   * @return Whether the projectSettings field is set.
   */
  @java.lang.Override
  public boolean hasProjectSettings() {
    return projectSettings_ != null;
  }
  /**
   * <pre>
   * The project settings.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
   * @return The projectSettings.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ProjectSettings getProjectSettings() {
    return projectSettings_ == null ? com.google.devtools.artifactregistry.v1beta2.ProjectSettings.getDefaultInstance() : projectSettings_;
  }
  /**
   * <pre>
   * The project settings.
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder getProjectSettingsOrBuilder() {
    return getProjectSettings();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 3;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Field mask to support partial updates.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Field mask to support partial updates.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Field mask to support partial updates.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (projectSettings_ != null) {
      output.writeMessage(2, getProjectSettings());
    }
    if (updateMask_ != null) {
      output.writeMessage(3, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (projectSettings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getProjectSettings());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getUpdateMask());
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest other = (com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest) obj;

    if (hasProjectSettings() != other.hasProjectSettings()) return false;
    if (hasProjectSettings()) {
      if (!getProjectSettings()
          .equals(other.getProjectSettings())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasProjectSettings()) {
      hash = (37 * hash) + PROJECT_SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getProjectSettings().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest parseFrom(
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
  public static Builder newBuilder(com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest prototype) {
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
   * Sets the settings of the project.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)
      com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.class, com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (projectSettingsBuilder_ == null) {
        projectSettings_ = null;
      } else {
        projectSettings_ = null;
        projectSettingsBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.SettingsProto.internal_static_google_devtools_artifactregistry_v1beta2_UpdateProjectSettingsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest build() {
      com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest result = new com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest(this);
      if (projectSettingsBuilder_ == null) {
        result.projectSettings_ = projectSettings_;
      } else {
        result.projectSettings_ = projectSettingsBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest) {
        return mergeFrom((com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest other) {
      if (other == com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest.getDefaultInstance()) return this;
      if (other.hasProjectSettings()) {
        mergeProjectSettings(other.getProjectSettings());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
            case 18: {
              input.readMessage(
                  getProjectSettingsFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);

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

    private com.google.devtools.artifactregistry.v1beta2.ProjectSettings projectSettings_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.ProjectSettings, com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder, com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder> projectSettingsBuilder_;
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     * @return Whether the projectSettings field is set.
     */
    public boolean hasProjectSettings() {
      return projectSettingsBuilder_ != null || projectSettings_ != null;
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     * @return The projectSettings.
     */
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettings getProjectSettings() {
      if (projectSettingsBuilder_ == null) {
        return projectSettings_ == null ? com.google.devtools.artifactregistry.v1beta2.ProjectSettings.getDefaultInstance() : projectSettings_;
      } else {
        return projectSettingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    public Builder setProjectSettings(com.google.devtools.artifactregistry.v1beta2.ProjectSettings value) {
      if (projectSettingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        projectSettings_ = value;
        onChanged();
      } else {
        projectSettingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    public Builder setProjectSettings(
        com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder builderForValue) {
      if (projectSettingsBuilder_ == null) {
        projectSettings_ = builderForValue.build();
        onChanged();
      } else {
        projectSettingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    public Builder mergeProjectSettings(com.google.devtools.artifactregistry.v1beta2.ProjectSettings value) {
      if (projectSettingsBuilder_ == null) {
        if (projectSettings_ != null) {
          projectSettings_ =
            com.google.devtools.artifactregistry.v1beta2.ProjectSettings.newBuilder(projectSettings_).mergeFrom(value).buildPartial();
        } else {
          projectSettings_ = value;
        }
        onChanged();
      } else {
        projectSettingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    public Builder clearProjectSettings() {
      if (projectSettingsBuilder_ == null) {
        projectSettings_ = null;
        onChanged();
      } else {
        projectSettings_ = null;
        projectSettingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder getProjectSettingsBuilder() {
      
      onChanged();
      return getProjectSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    public com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder getProjectSettingsOrBuilder() {
      if (projectSettingsBuilder_ != null) {
        return projectSettingsBuilder_.getMessageOrBuilder();
      } else {
        return projectSettings_ == null ?
            com.google.devtools.artifactregistry.v1beta2.ProjectSettings.getDefaultInstance() : projectSettings_;
      }
    }
    /**
     * <pre>
     * The project settings.
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1beta2.ProjectSettings project_settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.devtools.artifactregistry.v1beta2.ProjectSettings, com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder, com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder> 
        getProjectSettingsFieldBuilder() {
      if (projectSettingsBuilder_ == null) {
        projectSettingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.artifactregistry.v1beta2.ProjectSettings, com.google.devtools.artifactregistry.v1beta2.ProjectSettings.Builder, com.google.devtools.artifactregistry.v1beta2.ProjectSettingsOrBuilder>(
                getProjectSettings(),
                getParentForChildren(),
                isClean());
        projectSettings_ = null;
      }
      return projectSettingsBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Field mask to support partial updates.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest)
  private static final com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest();
  }

  public static com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateProjectSettingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateProjectSettingsRequest>() {
    @java.lang.Override
    public UpdateProjectSettingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateProjectSettingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateProjectSettingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.UpdateProjectSettingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

