// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

/**
 * <pre>
 * The share setting for reservations and sole tenancy node groups.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ShareSettings}
 */
public final class ShareSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ShareSettings)
    ShareSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShareSettings.newBuilder() to construct.
  private ShareSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShareSettings() {
    shareType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ShareSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ShareSettings_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 134212406:
        return internalGetProjectMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ShareSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ShareSettings.class, com.google.cloud.compute.v1.ShareSettings.Builder.class);
  }

  /**
   * <pre>
   * Type of sharing for this shared-reservation
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.ShareSettings.ShareType}
   */
  public enum ShareType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_SHARE_TYPE = 0;</code>
     */
    UNDEFINED_SHARE_TYPE(0),
    /**
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>LOCAL = 72607563;</code>
     */
    LOCAL(72607563),
    /**
     * <pre>
     * Shared-reservation is open to entire Organization
     * </pre>
     *
     * <code>ORGANIZATION = 274978099;</code>
     */
    ORGANIZATION(274978099),
    /**
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>SHARE_TYPE_UNSPECIFIED = 494771730;</code>
     */
    SHARE_TYPE_UNSPECIFIED(494771730),
    /**
     * <pre>
     * Shared-reservation is open to specific projects
     * </pre>
     *
     * <code>SPECIFIC_PROJECTS = 347838695;</code>
     */
    SPECIFIC_PROJECTS(347838695),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_SHARE_TYPE = 0;</code>
     */
    public static final int UNDEFINED_SHARE_TYPE_VALUE = 0;
    /**
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>LOCAL = 72607563;</code>
     */
    public static final int LOCAL_VALUE = 72607563;
    /**
     * <pre>
     * Shared-reservation is open to entire Organization
     * </pre>
     *
     * <code>ORGANIZATION = 274978099;</code>
     */
    public static final int ORGANIZATION_VALUE = 274978099;
    /**
     * <pre>
     * Default value. This value is unused.
     * </pre>
     *
     * <code>SHARE_TYPE_UNSPECIFIED = 494771730;</code>
     */
    public static final int SHARE_TYPE_UNSPECIFIED_VALUE = 494771730;
    /**
     * <pre>
     * Shared-reservation is open to specific projects
     * </pre>
     *
     * <code>SPECIFIC_PROJECTS = 347838695;</code>
     */
    public static final int SPECIFIC_PROJECTS_VALUE = 347838695;


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
    public static ShareType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ShareType forNumber(int value) {
      switch (value) {
        case 0: return UNDEFINED_SHARE_TYPE;
        case 72607563: return LOCAL;
        case 274978099: return ORGANIZATION;
        case 494771730: return SHARE_TYPE_UNSPECIFIED;
        case 347838695: return SPECIFIC_PROJECTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ShareType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ShareType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ShareType>() {
            public ShareType findValueByNumber(int number) {
              return ShareType.forNumber(number);
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
      return com.google.cloud.compute.v1.ShareSettings.getDescriptor().getEnumTypes().get(0);
    }

    private static final ShareType[] VALUES = values();

    public static ShareType valueOf(
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

    private ShareType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ShareSettings.ShareType)
  }

  private int bitField0_;
  public static final int PROJECT_MAP_FIELD_NUMBER = 134212406;
  private static final class ProjectMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>newDefaultInstance(
                com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ShareSettings_ProjectMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.google.cloud.compute.v1.ShareSettingsProjectConfig.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> projectMap_;
  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
  internalGetProjectMap() {
    if (projectMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ProjectMapDefaultEntryHolder.defaultEntry);
    }
    return projectMap_;
  }
  public int getProjectMapCount() {
    return internalGetProjectMap().getMap().size();
  }
  /**
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
   */
  @java.lang.Override
  public boolean containsProjectMap(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetProjectMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getProjectMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> getProjectMap() {
    return getProjectMapMap();
  }
  /**
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> getProjectMapMap() {
    return internalGetProjectMap().getMap();
  }
  /**
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
   */
  @java.lang.Override
  public /* nullable */
com.google.cloud.compute.v1.ShareSettingsProjectConfig getProjectMapOrDefault(
      java.lang.String key,
      /* nullable */
com.google.cloud.compute.v1.ShareSettingsProjectConfig defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> map =
        internalGetProjectMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.ShareSettingsProjectConfig getProjectMapOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> map =
        internalGetProjectMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SHARE_TYPE_FIELD_NUMBER = 359533466;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shareType_ = "";
  /**
   * <pre>
   * Type of sharing for this shared-reservation
   * Check the ShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string share_type = 359533466;</code>
   * @return Whether the shareType field is set.
   */
  @java.lang.Override
  public boolean hasShareType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Type of sharing for this shared-reservation
   * Check the ShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string share_type = 359533466;</code>
   * @return The shareType.
   */
  @java.lang.Override
  public java.lang.String getShareType() {
    java.lang.Object ref = shareType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Type of sharing for this shared-reservation
   * Check the ShareType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string share_type = 359533466;</code>
   * @return The bytes for shareType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareTypeBytes() {
    java.lang.Object ref = shareType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shareType_ = b;
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetProjectMap(),
        ProjectMapDefaultEntryHolder.defaultEntry,
        134212406);
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 359533466, shareType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> entry
         : internalGetProjectMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
      projectMap__ = ProjectMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(134212406, projectMap__);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(359533466, shareType_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.ShareSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ShareSettings other = (com.google.cloud.compute.v1.ShareSettings) obj;

    if (!internalGetProjectMap().equals(
        other.internalGetProjectMap())) return false;
    if (hasShareType() != other.hasShareType()) return false;
    if (hasShareType()) {
      if (!getShareType()
          .equals(other.getShareType())) return false;
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
    if (!internalGetProjectMap().getMap().isEmpty()) {
      hash = (37 * hash) + PROJECT_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetProjectMap().hashCode();
    }
    if (hasShareType()) {
      hash = (37 * hash) + SHARE_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getShareType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ShareSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ShareSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.compute.v1.ShareSettings parseFrom(
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
  public static Builder newBuilder(com.google.cloud.compute.v1.ShareSettings prototype) {
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
   * The share setting for reservations and sole tenancy node groups.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.ShareSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ShareSettings)
      com.google.cloud.compute.v1.ShareSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ShareSettings_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 134212406:
          return internalGetProjectMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 134212406:
          return internalGetMutableProjectMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ShareSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ShareSettings.class, com.google.cloud.compute.v1.ShareSettings.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.ShareSettings.newBuilder()
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
      internalGetMutableProjectMap().clear();
      shareType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute.internal_static_google_cloud_compute_v1_ShareSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShareSettings getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ShareSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShareSettings build() {
      com.google.cloud.compute.v1.ShareSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ShareSettings buildPartial() {
      com.google.cloud.compute.v1.ShareSettings result = new com.google.cloud.compute.v1.ShareSettings(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.ShareSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectMap_ = internalGetProjectMap();
        result.projectMap_.makeImmutable();
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shareType_ = shareType_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.ShareSettings) {
        return mergeFrom((com.google.cloud.compute.v1.ShareSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.ShareSettings other) {
      if (other == com.google.cloud.compute.v1.ShareSettings.getDefaultInstance()) return this;
      internalGetMutableProjectMap().mergeFrom(
          other.internalGetProjectMap());
      bitField0_ |= 0x00000001;
      if (other.hasShareType()) {
        shareType_ = other.shareType_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 1073699250: {
              com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
              projectMap__ = input.readMessage(
                  ProjectMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableProjectMap().getMutableMap().put(
                  projectMap__.getKey(), projectMap__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 1073699250
            case -1418699566: {
              shareType_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case -1418699566
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

    private com.google.protobuf.MapField<
        java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> projectMap_;
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
        internalGetProjectMap() {
      if (projectMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ProjectMapDefaultEntryHolder.defaultEntry);
      }
      return projectMap_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
        internalGetMutableProjectMap() {
      if (projectMap_ == null) {
        projectMap_ = com.google.protobuf.MapField.newMapField(
            ProjectMapDefaultEntryHolder.defaultEntry);
      }
      if (!projectMap_.isMutable()) {
        projectMap_ = projectMap_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return projectMap_;
    }
    public int getProjectMapCount() {
      return internalGetProjectMap().getMap().size();
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    @java.lang.Override
    public boolean containsProjectMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetProjectMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getProjectMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> getProjectMap() {
      return getProjectMapMap();
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> getProjectMapMap() {
      return internalGetProjectMap().getMap();
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    @java.lang.Override
    public /* nullable */
com.google.cloud.compute.v1.ShareSettingsProjectConfig getProjectMapOrDefault(
        java.lang.String key,
        /* nullable */
com.google.cloud.compute.v1.ShareSettingsProjectConfig defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> map =
          internalGetProjectMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    @java.lang.Override
    public com.google.cloud.compute.v1.ShareSettingsProjectConfig getProjectMapOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> map =
          internalGetProjectMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearProjectMap() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableProjectMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    public Builder removeProjectMap(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableProjectMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig>
        getMutableProjectMap() {
      bitField0_ |= 0x00000001;
      return internalGetMutableProjectMap().getMutableMap();
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    public Builder putProjectMap(
        java.lang.String key,
        com.google.cloud.compute.v1.ShareSettingsProjectConfig value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableProjectMap().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <pre>
     * A map of project id and project config. This is only valid when share_type's value is SPECIFIC_PROJECTS.
     * </pre>
     *
     * <code>map&lt;string, .google.cloud.compute.v1.ShareSettingsProjectConfig&gt; project_map = 134212406;</code>
     */
    public Builder putAllProjectMap(
        java.util.Map<java.lang.String, com.google.cloud.compute.v1.ShareSettingsProjectConfig> values) {
      internalGetMutableProjectMap().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private java.lang.Object shareType_ = "";
    /**
     * <pre>
     * Type of sharing for this shared-reservation
     * Check the ShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string share_type = 359533466;</code>
     * @return Whether the shareType field is set.
     */
    public boolean hasShareType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Type of sharing for this shared-reservation
     * Check the ShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string share_type = 359533466;</code>
     * @return The shareType.
     */
    public java.lang.String getShareType() {
      java.lang.Object ref = shareType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Type of sharing for this shared-reservation
     * Check the ShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string share_type = 359533466;</code>
     * @return The bytes for shareType.
     */
    public com.google.protobuf.ByteString
        getShareTypeBytes() {
      java.lang.Object ref = shareType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Type of sharing for this shared-reservation
     * Check the ShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string share_type = 359533466;</code>
     * @param value The shareType to set.
     * @return This builder for chaining.
     */
    public Builder setShareType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shareType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of sharing for this shared-reservation
     * Check the ShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string share_type = 359533466;</code>
     * @return This builder for chaining.
     */
    public Builder clearShareType() {
      shareType_ = getDefaultInstance().getShareType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of sharing for this shared-reservation
     * Check the ShareType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string share_type = 359533466;</code>
     * @param value The bytes for shareType to set.
     * @return This builder for chaining.
     */
    public Builder setShareTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shareType_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ShareSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ShareSettings)
  private static final com.google.cloud.compute.v1.ShareSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.ShareSettings();
  }

  public static com.google.cloud.compute.v1.ShareSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShareSettings>
      PARSER = new com.google.protobuf.AbstractParser<ShareSettings>() {
    @java.lang.Override
    public ShareSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<ShareSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShareSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ShareSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

